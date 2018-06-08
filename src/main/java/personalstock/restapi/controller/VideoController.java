package personalstock.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import personalstock.restapi.entity.Video;
import personalstock.restapi.service.VideoService;

import java.util.Collection;

@RestController
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("/api/videos")
    public Collection<Video> getVideos(@RequestParam(name = "creator", required = false) Long creatorId, @RequestParam(name = "order", required = false) Long orderId) {
        if (creatorId != null) {
            return videoService.getVideosByCreatorAccountId(creatorId);
        } else if (orderId != null) {
            return videoService.getVideosByOrderId(orderId);
        } else {
            return videoService.getAllVideos();
        }
    }

    @GetMapping("/api/videos/{id}")
    public Video getVideoById(@PathVariable("id") Long id) {
        return videoService.getVideoById(id);
    }

    @PostMapping("/api/videos")
    public Video addVideo(@RequestBody Video video) {
        return videoService.addVideo(video);
    }

    @PutMapping("/api/videos")
    public Video updateVideo(@RequestBody Video video) {
        return videoService.updateVideo(video);
    }

    @DeleteMapping("/api/videos")
    public void deleteVideo(@RequestBody Video video) {
        videoService.deleteVideo(video);
    }

}
