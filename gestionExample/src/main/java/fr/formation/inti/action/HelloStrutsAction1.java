package fr.formation.inti.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;

import fr.formation.inti.model.MessageStore;
import fr.formation.inti.model.Personne;

public class HelloStrutsAction1 extends  ActionSupport {
	private final static Log log = LogFactory.getLog(HelloStrutsAction1.class);
    private MessageStore messageStore;
    private String name;
    private Personne personne;


    public String excecute() throws Exception {

    	log.debug("----- Personne :"+ personne);
		log.debug("----- messageStore :" + messageStore);
		log.debug("----- name :"+ name);

		if(messageStore == null)
			messageStore = new MessageStore();
//		 if (personne.getAge() < 18) {
//		        addActionError("Age is required and must be 18 or older");
//		        return ERROR;
//		    }

    	return "success";
    }



	public MessageStore getMessageStore() {
		return messageStore;
	}
	public void setMessageStore(MessageStore messageStore) {
		this.messageStore = messageStore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}




}



