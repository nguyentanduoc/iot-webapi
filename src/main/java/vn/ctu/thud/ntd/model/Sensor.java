package vn.ctu.thud.ntd.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Sensor {
	
	@Id
	private String _id;
	
	private String name;
	
	@DBRef
	private TypesSensor typesSensor;
	
	@Field("DATE_CREATE")
	private Date dateCreate;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	public TypesSensor getTypesSensor() {
		return typesSensor;
	}

	public void setTypesSensor(TypesSensor typesSensor) {
		this.typesSensor = typesSensor;
	}
	
}
