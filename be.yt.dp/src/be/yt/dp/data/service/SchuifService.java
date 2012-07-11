package be.yt.dp.data.service;

import java.util.List;

import be.yt.dp.data.entity.Schuif;

public interface SchuifService {
        void create(Schuif schuif);

        Schuif read(int id);

        void update(Schuif schuif);

        void delete(int id);

        List<Schuif> findall();
}