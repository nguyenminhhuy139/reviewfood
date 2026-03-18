package HuyLA.review.comment;

import HuyLA.review.post.Post;
import HuyLA.review.post.PostRepository;
import HuyLA.review.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    public Comment createComment(Long postId, String content, User user) {

        Post post = postRepository.findById(postId)
                .orElseThrow();

        Comment comment = Comment.builder()
                .content(content)
                .createdAt(LocalDateTime.now())
                .user(user)
                .post(post)
                .build();

        return commentRepository.save(comment);
    }

    public List<Comment> getComments(Long postId) {
        return commentRepository.findByPostId(postId);
    }
}
