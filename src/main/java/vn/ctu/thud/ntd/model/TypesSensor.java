package vn.ctu.thud.ntd.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class TypesSensor {
	
	@Id
	private String _id;
	
	@Field("ID_TYPES")
	private String idTypes;
	
	@Field("NAME_TYPES")
	private String nameTypes;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getIdTypes() {
		return idTypes;
	}

	public void setIdTypes(String idTypes) {
		this.idTypes = idTypes;
	}

	public String getNameTypes() {
		return nameTypes;
	}

	public void setNameTypes(String nameTypes) {
		this.nameTypes = nameTypes;
	}
	
	
}
