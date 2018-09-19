package vn.ctu.thud.ntd.entity;

public class PostEntity {
	
	private long id;
	private String name;
	private String title;
	private String contain;
	
	public PostEntity() {
		super();
	}
	
	public PostEntity(long id, String name, String title, String contain) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.contain = contain;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContain() {
		return contain;
	}
	public void setContain(String contain) {
		this.contain = contain;
	}
	
	
}
