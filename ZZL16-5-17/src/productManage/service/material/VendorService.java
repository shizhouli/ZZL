package productManage.service.material;

import java.util.List;
import java.util.Map;

import productManage.model.lhj.Vendor;
import productManage.vo.PageBean;

public interface VendorService {
	
	public boolean addVendor(Vendor vendor);
	
	public PageBean queryVendor(int pageSize, int page, Map<String, Object> params);
	
	public Vendor getVendorByName(String vendorName);
	
	public List<Vendor> getVendorList();
}
