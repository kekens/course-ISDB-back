package isdb.courseback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceException;
import javax.persistence.StoredProcedureQuery;

@Service
public class DeliveryService {

    private EntityManager entityManager;

    @Autowired
    public DeliveryService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public String doDelivery(int minerId)    {
        StoredProcedureQuery query = entityManager
                .createStoredProcedureQuery("do_delivery_by_miner_id");
        query.registerStoredProcedureParameter("min_id", Integer.class, ParameterMode.IN);
        query.setParameter("min_id", minerId);

        try {
            query.execute();
        } catch (PersistenceException e) {
            Throwable rootException = e;
            while(rootException.getCause()!=null){
                rootException = rootException.getCause();
            }
            String reason = rootException.getLocalizedMessage();
            return reason.substring(reason.indexOf(":") + 2, reason.indexOf("\n"));
        }

        return "";
    }


}
