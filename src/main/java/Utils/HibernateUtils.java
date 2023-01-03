package Utils;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static SessionFactory sessionFactory;

    static{
        try {
            Configuration configu = new Configuration();
            configu.configure();
        }catch (HibernateException e){
            throw e;
        }
        //create  configuration
        Configuration config = new Configuration();
        config.configure();

        //Get Session Factory from config
        sessionFactory = config.buildSessionFactory();
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

}
