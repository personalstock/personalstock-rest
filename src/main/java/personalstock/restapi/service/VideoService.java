package personalstock.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import personalstock.restapi.entity.Video;
import personalstock.restapi.repository.VideoRepository;

import java.util.Collection;

@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public Video getVideoById(Long id) {
        return videoRepository.findById(id).orElse(null);
    }

    public Collection<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    public Collection<Video> getVideosByCreatorAccountId(Long id) {
        return videoRepository.findByCreatorId(id);
    }

    public Collection<Video> getVideosByOrderId(Long id) {
        return videoRepository.findByOrderId(id);
    }

    public Video addVideo(Video video) {
        return videoRepository.save(video);
    }

    public Video updateVideo(Video video) {
        return videoRepository.save(video);
    }

    public void deleteVideo(Video video){
        videoRepository.delete(video);
    }

}
