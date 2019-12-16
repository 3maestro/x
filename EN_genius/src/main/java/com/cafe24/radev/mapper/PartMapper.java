package com.cafe24.radev.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.radev.vo.Part;
@Mapper
public interface PartMapper {
<<<<<<< HEAD
	/**
	 * 
	 * @return
	 */
	public List<Part> getPartList();
	/**
	 * 
	 * serchPartCall ajax
	 * @param partNumber
	 * @return
	 */
	public Part partSelectForOrder(String partNumber);
	/**
	 * 
	 * @param parts
	 */
	public void partInsertPro(Part parts);
	/**
	 * 
	 * @param partValue
	 * @return
	 */
	public void partUpdateforMany(Part part);
=======
	public List<Part> getPartList();
	public Part partSelectForOrder(String partNumber);
>>>>>>> refs/heads/jsh
}
