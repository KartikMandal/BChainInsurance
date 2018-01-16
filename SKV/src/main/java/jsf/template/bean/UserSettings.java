package jsf.template.bean;

import java.io.Serializable;
import java.util.Locale;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;


/**
 * UserSettings
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@SessionScoped
public class UserSettings implements Serializable {

	private static final long serialVersionUID = 1L;
	private final Locale ENGLISH = Locale.ENGLISH;
	  private final Locale SPANISH = new Locale("es");
	  private final Locale FRENCH = Locale.FRENCH;
	  private final Locale BANGLA = new Locale("bn");
	  private Locale locale = ENGLISH;
	 
	  public Locale getLocale() {
	    return(locale);
	  }
	  public void setBangla(ActionEvent event) {
	    locale = BANGLA;
	    updateViewLocale();
	  }
	   
	  public void setEnglish(ActionEvent event) {
	    locale = ENGLISH;
	    updateViewLocale();
	  }
	   
	  public void setSpanish(ActionEvent event) {
	    locale = SPANISH;
	    updateViewLocale();
	  }
	   
	  public void setFrench(ActionEvent event) {
	    locale = FRENCH;
	    updateViewLocale();
	  }
	   
	  private void updateViewLocale() {
	    FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
	  }
}
