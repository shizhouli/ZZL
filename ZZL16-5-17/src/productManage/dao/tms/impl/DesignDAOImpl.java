package productManage.dao.tms.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import productManage.dao.BaseDao;
import productManage.dao.tms.DesignDAO;
import productManage.model.tms.Design;
@Repository
public class DesignDAOImpl implements DesignDAO {
	@Autowired
	private BaseDao basedao;
	@Override
	public List<Design> findAll() {
		// TODO Auto-generated method stub
		return basedao.getAllList(Design.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Design> findByDate(Date date) {
		// TODO Auto-generated method stub
		String hql = "from Design d where d.designPutawayDate='"+date+"'";
		Session session = basedao.getNewSession();
		return session.createQuery(hql).list();
	}

	@Override
	public Design findByCode(String Code) {
		// TODO Auto-generated method stub
		String hql = "from Design d  where d.designCode='"+Code+"'";
		System.out.println(hql);
		Session session = basedao.getSession();
		List<Design> results = session.createQuery(hql).list();
		return results.size()>=1?results.get(0):null;
	}

	@Override
	public void addDesign(Design design) {
		// TODO Auto-generated method stub
		basedao.save(design);
	}

}
