package by.jrr.fp.web.service;

import by.jrr.fp.web.model.Photo;
import by.jrr.fp.web.proxy.ProcessorProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.PagedModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhotoService {

    @Autowired
    ProcessorProxy processorProxy;

    public List<Photo> findAll() {
        PagedModel<Photo> result = processorProxy.getAllPhotos();
        result.getContent();
        return new ArrayList<>(result.getContent());
    }
}
