package net.balgre.domain;

import java.util.List;

import lombok.Data;

@Data
public class PageUserPoint {
	
	private List<UserPoint> content; // (Array[UserPoint], optional),
	private boolean first; // (boolean, optional),
	private boolean last; // (boolean, optional),
	private int number; // (integer, optional),
	private int numberOfElements; // (integer, optional),
	private int size; // (integer, optional),
	private Sort sort; // (Sort, optional),
	private int totalElements; // (integer, optional),
	private int totalPages; // (integer, optional)

}
