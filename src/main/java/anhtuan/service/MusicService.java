package anhtuan.service;

import anhtuan.model.Music;
import anhtuan.model.MusicForm;

import java.util.ArrayList;
import java.util.List;

public class MusicService implements IMusicService{
    List<Music> musicList = new ArrayList<>();
    List<MusicForm> musicFormList = new ArrayList<>();
    @Override
    public List<Music> findAll() {
        return musicList;
    }

    public void saveForm(MusicForm musicForm) {
        musicFormList.add(musicForm);
    }
    @Override
    public void save(Music music) {
        musicList.add(music);
    }

    @Override
    public void update(int id, Music music) {
        for (Music m: musicList) {
            if (m.getId()==id) {
                m = music;
                break;
            }
        }
    }
    public void updateForm(int id, MusicForm musicForm) {
        for (MusicForm m: musicFormList) {
            if (m.getId()==id) {
                m = musicForm;
                break;
            }
        }
    }


    @Override
    public void delete(int id) {
        for (int i = 0; i < musicList.size(); i++) {
            if (musicList.get(i).getId() == id) {
                musicList.remove(i);
                break;
            }
        }
    }

    @Override
    public Music findById(int id) {
        return musicList.get(id);
    }
    public MusicForm findByFormId(int id) {
        return musicFormList.get(id);
    }
}

