package service;

import java.util.List;

/**
 * Created by sukenda on 29/07/18.
 * Project Belajar
 */

public interface BaseService<T> {

    T save(T param);

    T update(T param);

    int delete(T param);

    T findById(int id);

    List<T> findAll();
}
