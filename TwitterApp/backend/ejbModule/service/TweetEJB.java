package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.TweetEntity;

/**
 * Session Bean implementation class TweetEJB
 */
@Stateless
@LocalBean
public class TweetEJB {

	@PersistenceContext 
	private EntityManager em;
	
	
    public TweetEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void addNew(TweetEntity tweetEntity)
    {
    	
    	em.persist(tweetEntity);
    }

}
