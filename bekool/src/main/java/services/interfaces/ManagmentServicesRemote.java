package services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import domain.Tavola;

@Remote
public interface ManagmentServicesRemote {
	Boolean addTable(Tavola table);

	Tavola bookTable(Integer idUser, Integer placesNumber);

	List<Tavola> findAllAvailableTables(Integer placesNumber);

}
