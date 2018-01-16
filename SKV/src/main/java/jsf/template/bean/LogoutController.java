package jsf.template.bean;

import java.io.IOException;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;


/**
 * Invalidates current session and redirects to the login page.
 *
 * @author  ova / last modified by $Author: ova $
 * @version $Revision: 97278 $
 */
@ManagedBean
@RequestScoped
public class LogoutController {

	//https://github.com/ova2/jsf-primefaces-cdi-template
    public String logout() throws IOException {
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.invalidateSession();

        return "/pages/logout/logout.xhtml";
    }
}
