package kh.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.spring.dto.ReferenceDTO;
import kh.spring.dto.Reference_FileDTO;

@Repository
public class Reference_FileDAO {

	@Autowired
	private SqlSession session;
	
	public int insertFileDTO (Reference_FileDTO dto) {
		return session.insert("Reference.insertFileDTO",dto);
	}
	
	public int delete(List<ReferenceDTO> list) {
		return session.delete("Reference.deleteFile",list);
	}
	
	public List<Reference_FileDTO> selectFileAll(){
		return session.selectList("Reference.selectFileAll");
	}
	
	public int updateFile(Reference_FileDTO dto) {
		return session.update("Reference.updateFile",dto);
	}
	
	public int deleteAll(int parentSeq) {
		return session.delete("Reference.deleteAll",parentSeq);
	}
}
