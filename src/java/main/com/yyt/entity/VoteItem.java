package com.yyt.entity;

public class VoteItem {
	private int viid;
	private int voId;
	private int vsid;
	private int vuid;

	public int getViid() {
		return viid;
	}

	public void setViid(int viid) {
		this.viid = viid;
	}

	public int getVoId() {
		return voId;
	}

	public void setVoId(int voId) {
		this.voId = voId;
	}

	public int getVsid() {
		return vsid;
	}

	public void setVsid(int vsid) {
		this.vsid = vsid;
	}

	public int getVuid() {
		return vuid;
	}

	public void setVuid(int vuid) {
		this.vuid = vuid;
	}

	@Override
	public String toString() {
		return "VoteItem [viid=" + viid + ", voId=" + voId + ", vsid=" + vsid + ", vuid=" + vuid + "]";
	}

}