package com.project.common;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Repository
@Configuration
@EnableWebMvc
public class HibernateUtil {
	
	@Autowired
    private SessionFactory sessionFactory;
        
    public <T> Serializable create(final T entity) {
        return sessionFactory.getCurrentSession().save(entity);        
    }
    
    public <T> T update(final T entity) {
        sessionFactory.getCurrentSession().update(entity);   
        return entity;
    }
    
    public <T> void delete(final T entity) {
        sessionFactory.getCurrentSession().delete(entity);
    }

    public <T> void delete(Serializable id, Class<T> entityClass) {
        T entity = fetchById(id, entityClass);
        delete(entity);
    }
    
    public <T> void saveOrUpdate(final T o){
        sessionFactory.getCurrentSession().saveOrUpdate(o);
      }

    public <T> List<T> getAll(final Class<T> type) {
		final Criteria crit = sessionFactory.getCurrentSession().createCriteria(type);
	    return crit.list();
      }
    
    @SuppressWarnings("unchecked")  
    public <T> List<T> fetchAll(Class<T> entityClass) {        
        return sessionFactory.getCurrentSession().createQuery(" FROM "+entityClass.getName()).list();        
    }
  
    @SuppressWarnings("rawtypes")
    public <T> List fetchAll(String query) {        
        return sessionFactory.getCurrentSession().createSQLQuery(query).list();        
    }
    
    @SuppressWarnings("unchecked")
    public <T> T fetchById(Serializable id, Class<T> entityClass) {
        return (T)sessionFactory.getCurrentSession().get(entityClass, id);
    }   
}
