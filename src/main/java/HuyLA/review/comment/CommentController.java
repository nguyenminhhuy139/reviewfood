package HuyLA.review.comment;

import HuyLA.review.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @PostMapping("/{postId}")
    public Comment create(
            @PathVariable Long postId,
            @RequestBody CreateCommentRequest request,
            @AuthenticationPrincipal User user
    ) {
        return commentService.createComment(postId, request.getContent(), user);
    }

    @GetMapping("/{postId}")
    public List<Comment> get(@PathVariable Long postId) {
        return commentService.getComments(postId);
    }
}
