package nl.jeslee.shows.core;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by ceasaro on 12-11-14.
 */
public class AbstractManager<E> {

    @PersistenceContext
    private EntityManager entityManager;

    private Class<E> entity;

    public E save(E e) {
        entityManager.persist(e);
        return e;
    }

    public List<E> all() {
        TypedQuery<E> q = entityManager.createQuery(
                new StringBuilder().
                        append("select e from ").
                        append(entity.getSimpleName()).
                        append(" e ").toString(), entity);
        return q.getResultList();
    }
}
