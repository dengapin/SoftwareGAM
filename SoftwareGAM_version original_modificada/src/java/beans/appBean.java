/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import util.MyUtil;

/**
 *
 * @author Dennise
 */
@Named(value = "appBean")
@ApplicationScoped
public class appBean {

    /**
     * Creates a new instance of appBean
     */
    public appBean() {
        
    }
    
    public String getBaseUrl(){
    return MyUtil.baseurl();
    }
    
    public String getBasePath(){
    return MyUtil.basepath();
    }
}
