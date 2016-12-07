package Sys.data.db;

import java.util.List;

/**
 * Created by tanjian on 16/12/6.
 * Dao操作接口
 */
public interface Repository<E> {
    int insert(E e);

    int update(E e);

    int delete(E e);

    List<E> findAll();

    String fondOneById(String id);
}
