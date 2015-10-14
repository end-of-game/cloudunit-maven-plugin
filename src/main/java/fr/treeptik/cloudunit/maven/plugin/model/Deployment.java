package fr.treeptik.cloudunit.maven.plugin.model;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import fr.treeptik.cloudunit.maven.plugin.utils.JsonDateDeserializer;

public class Deployment implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	@JsonDeserialize(using = JsonDateDeserializer.class)
	private Date date;

	private Type type;

	@JsonIgnore
	private Application application;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

}
