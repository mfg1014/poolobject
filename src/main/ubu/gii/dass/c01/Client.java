package ubu.gii.dass.c01;

import java.util.logging.Logger;


public class Client{
	
	
	public static ReusablePool pool;
	public static Reusable r1,r2,r3;
	public static Logger logger = Logger.getLogger("c01");

	public static void main(String arg[]) throws NotFreeInstanceException, DuplicatedInstanceException{

	 
	  
	  pool = ReusablePool.getInstance();
	  r1 = pool.acquireReusable();
	  r2 = pool.acquireReusable();
	  
	 
	  logger.info(r1.util());
	  logger.info(r2.util());
	   
	
	  	  
	  pool.releaseReusable(r2);
	  r3= pool.acquireReusable();
	  
	  logger.info(r3.util());
	  
	  logger.info(r1.util());
	
	}

} 