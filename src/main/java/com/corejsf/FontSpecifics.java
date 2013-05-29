package com.corejsf;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class FontSpecifics implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int size = 1;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
