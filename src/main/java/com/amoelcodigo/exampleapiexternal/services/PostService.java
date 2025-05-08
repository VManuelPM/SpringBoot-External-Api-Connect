package com.amoelcodigo.exampleapiexternal.services;

import com.amoelcodigo.exampleapiexternal.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class PostService {

    private static final String API_URL = "https://jsonplaceholder.typicode.com/posts";


    private RestTemplate restTemplate;

    public PostService(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Post> getPosts() {
        Post[] posts = restTemplate.getForObject(API_URL, Post[].class);
        return Arrays.asList(posts);
    }
}
