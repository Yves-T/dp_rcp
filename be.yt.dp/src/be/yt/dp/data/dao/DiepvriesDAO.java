package be.yt.dp.data.dao;
import java.util.List;

import dp.Diepvries;


public interface DiepvriesDAO {
    void create(Diepvries diepvries);

    Diepvries read(int id);

    void update(Diepvries diepvries);

    void delete(int id);

    List<Diepvries> findall();
}