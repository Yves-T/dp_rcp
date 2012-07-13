package be.yt.dp.data.service;

import java.util.List;

import dp.Diepvries;

public interface DiepvriesService {
        void create(Diepvries diepvries);

        Diepvries read(int id);

        void update(Diepvries categorie);

        void delete(int id);

        List<Diepvries> findall();
}