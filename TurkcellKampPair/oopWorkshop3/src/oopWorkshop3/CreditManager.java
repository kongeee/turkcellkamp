package oopWorkshop3;

public class CreditManager {

	private Logger[] loggers;
	private CreditDao creditDao;

	public CreditManager(CreditDao creditDao, Logger[] loggers) {
		super();
		this.creditDao = creditDao;
		this.loggers = loggers;

	}

	public void save(Credit credit, double price) {
		
		if (controlPrice(credit, price)) {
			creditDao.save(credit);
			
			for (Logger logger : loggers) {
				logger.log("başarılı");
			}
			
			return;
		}
		
		System.out.println("Kredi sýnýrlarýn dýþýnda olduðu için alýnamadý"+ credit.getName());
		
		for (Logger logger : loggers) {
			logger.log("başarısız");
		}
		
	}

	public void delete(Credit credit) {
		creditDao.delete(credit);
		
		for (Logger logger : loggers) {
			logger.log("silindi");
		}
	}

	public void update(Credit credit) {
        creditDao.update(credit);
        
        for (Logger logger : loggers) {
			logger.log("güncellendi");
		}
	}

	private boolean controlPrice(Credit credit, double price) {

		if (credit.getMinPrice() < price && price < credit.getMaxPrice()) {
			return true;
		}

		return false;

	}
}
