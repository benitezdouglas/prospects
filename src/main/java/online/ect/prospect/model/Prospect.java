package online.ect.prospect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Prospect {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String description;

    private Integer phone;

    private Boolean newer;
    
    private Boolean sincronized;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Boolean getNewer() {
		return newer;
	}

	public void setNewer(Boolean newer) {
		this.newer = newer;
	}

	public Boolean getSincronized() {
		return sincronized;
	}

	public void setSincronized(Boolean sincronized) {
		this.sincronized = sincronized;
	}

}