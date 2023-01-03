package HibernateDAO;

import Utils.HibernateUtils;
import org.example.UsersEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class UserDAO {
    public static List<UsersEntity> getAllUsersEntityList(){
        // open session
        Session session = HibernateUtils.getSessionFactory().openSession();

        List<UsersEntity> usersEntities = null;

        try {
            //create query
            final String hql = "select ue from UsersEntity ue";
            Query query = session.createQuery(hql);

            //get all user
            usersEntities = query.list();

        }catch (HibernateException e){
            System.out.println(e);
        }
        finally {
            session.close();
        }
        return usersEntities;
    }
}
