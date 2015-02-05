package services.interfaces;

import javax.ejb.Local;

import domain.Tavola;

@Local
public interface ManagmentServicesLocal {
	Boolean addTable(Tavola table);

	Tavola bookTable(Integer idUser, Integer placesNumber);
}
