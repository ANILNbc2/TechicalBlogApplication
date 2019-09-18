package technicalblog.Service;

import org.springframework.stereotype.Service;
import technicalblog.model.Posts;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public ArrayList<Posts> getAllPosts(){
        Posts post1 = new Posts();
        post1.setTitle("Post 1");
        post1.setBody("Post Body 1");
        post1.setDate(new Date());

        Posts post2 = new Posts();
        post2.setTitle("Post 2");
        post2.setBody("Post Body 2");
        post2.setDate(new Date());

        Posts post3 = new Posts();
        post3.setTitle("Post 3");
        post3.setBody("Post Body 3");
        post3.setDate(new Date());

        ArrayList<Posts> posts = new ArrayList<>();
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        return posts;
    }
}
