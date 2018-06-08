package personalstock.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import personalstock.restapi.entity.VideoOrder;
import personalstock.restapi.service.VideoOrderService;

import java.util.Collection;

@RestController
public class VideoOrderController {

    @Autowired
    private VideoOrderService videoOrderService;

    @GetMapping("/api/orders")
    public Collection<VideoOrder> getVideoOrders(@RequestParam(name = "poster", required = false) Long posterId) {
        if (posterId != null) {
            return videoOrderService.getVideoOrdersByPosterId(posterId);
        }
        return videoOrderService.getAllVideoOrders();
    }

    @GetMapping("/api/orders/{id}")
    public VideoOrder getVideoOrderById(@PathVariable("id") Long id) {
        return videoOrderService.getVideoOrderById(id);
    }

    @PostMapping("/api/orders")
    public VideoOrder addVideoOrder(@RequestBody VideoOrder videoOrder) {
        return videoOrderService.addVideoOrder(videoOrder);
    }

    @PutMapping("/api/orders")
    public VideoOrder updateVideoOrder(@RequestBody VideoOrder videoOrder) {
        return videoOrderService.updateVideoOrder(videoOrder);
    }

    @DeleteMapping("/api/orders")
    public void deleteVideoOrder(@RequestBody VideoOrder videoOrder) {
        videoOrderService.deleteVideoOrder(videoOrder);
    }

}
