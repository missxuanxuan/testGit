package com.yyt.entity;

public class VoteUser {
	private Long vuid;

	private String vuusername;

	private String vupassword;

	private Integer vustatus = 1;

	private Long vuversion = 1l;

	public Long getVuid() {
		return vuid;
	}

	public void setVuid(Long vuid) {
		this.vuid = vuid;
	}

	public String getVuusername() {
		return vuusername;
	}

	public void setVuusername(String vuusername) {
		this.vuusername = vuusername == null ? null : vuusername.trim();
	}

	public String getVupassword() {
		return vupassword;
	}

	public void setVupassword(String vupassword) {
		this.vupassword = vupassword == null ? null : vupassword.trim();
	}

	public Integer getVustatus() {
		return vustatus;
	}

	public void setVustatus(Integer vustatus) {
		this.vustatus = vustatus;
	}

	public Long getVuversion() {
		return vuversion;
	}

	public void setVuversion(Long vuversion) {
		this.vuversion = vuversion;
	}

	@Override
	public String toString() {
		return "VoteUser [vuid=" + vuid + ", vuusername=" + vuusername + ", vupassword=" + vupassword + ", vustatus=" + vustatus + ", vuversion=" + vuversion + "]";
	}

}