package personalstock.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import personalstock.restapi.entity.VideoOrder;
import personalstock.restapi.repository.VideoOrderRepository;

import java.util.Collection;
import java.util.List;

@Service
public class VideoOrderService {

    @Autowired
    private VideoOrderRepository videoOrderRepository;

    public List<VideoOrder> getAllVideoOrders() {
        return videoOrderRepository.findAll();
    }

    public Collection<VideoOrder> getVideoOrdersByPosterId(Long id) {
        return videoOrderRepository.findByPosterId(id);
    }

    public VideoOrder getVideoOrderById(Long id) {
        return videoOrderRepository.findById(id).orElse(null);
    }

    public VideoOrder addVideoOrder(VideoOrder videoOrder) {
        return videoOrderRepository.save(videoOrder);
    }

    public VideoOrder updateVideoOrder(VideoOrder videoOrder) {
        return videoOrderRepository.save(videoOrder);
    }

    public void deleteVideoOrder(VideoOrder videoOrder) {
        videoOrderRepository.delete(videoOrder);
    }

}
