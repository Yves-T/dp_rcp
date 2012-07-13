package be.yt.dp.data.service;

import java.util.List;

import dp.Schuif;

public interface SchuifService {
        void create(Schuif schuif);

        Schuif read(int id);

        void update(Schuif schuif);

        void delete(int id);

        List<Schuif> findall();
}