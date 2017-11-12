package com.adam.solution.dao;



import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.adam.solution.model.Game;

@Repository
public class GameDaoImplementation implements GameDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session currentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Transactional
	public void createGame(Game game) {
		currentSession().save(game);
	}
	
	@Transactional
	public void deleteGame(int id) {
		@SuppressWarnings("unchecked")
		TypedQuery<Game> q = currentSession().createQuery("delete from game g where g.id = :gameId");
		q.setParameter("gameId", id);
		q.executeUpdate();		
	}

	@Transactional
	public List<Game> listGames() {
		TypedQuery<Game> q = currentSession().createQuery("from Game order by startDate",Game.class);
		List<Game> games = q.getResultList();
		return games;
	}




	
	

}
