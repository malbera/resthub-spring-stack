package org.resthub.core.dao.jpa;




import org.resthub.core.dao.GenericResourceDao;
import org.resthub.core.model.Resource;

/**
 * JPA implementation of our Generic Dao that can manage {@link Resource} inherited classes..
 * Based on Hades Generic Dao. 
 */
public class GenericJpaResourceDao<T extends Resource> extends GenericJpaDao<T, Long> implements GenericResourceDao<T> {

    
}
