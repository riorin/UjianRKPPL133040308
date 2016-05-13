
import com.artivisi.quickstart.log4j.logingDao;
import service.logingService;
import com.sun.istack.internal.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SB-604-21
 */
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    
    public static void main(String[] args){
        logger.info("menginstankan dao");
        logingDao dao = new logingDao();
        
        logger.info("menginstankan service");
        logingService service = new logingService();
        

    }
    
}
