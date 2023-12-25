package review01.service;

import review01.model.Post;

import java.util.*;

/**
 * 게시글 관련된 비즈니스로직을 처리하는 서비스.
 * 게시글 작성, 수정, 삭제 등의 기능이 있어야 함
 */
public class PostService {

    Map<Long, Post> postsMap;

    public PostService() {
        this.postsMap = new HashMap<>();
        // 초기 데이터 : 테스트 게시글 설정
        Post testPosts = new Post();
        testPosts.setId(1L);
        testPosts.setTitle("제목1");
        testPosts.setContent("내용1");
        //맵에 Post클래스의 객체인 id, title, content 저장
        postsMap.put(testPosts.getId(), testPosts);
    }

    //게시글 삭제 메소드
    public void deleteByID(Long postId) {
        if (postsMap.containsKey(postId)) {
            postsMap.remove(postId);
            System.out.println("게시글이 삭제되었습니다.");
        } else {
            System.out.println("해당 게시글이 존재하지 않습니다." + postId);
        }
    }

    // 게시글 수정 메소드
    public void updateById(Long postId, String newContent, String newTitle) {
        if (postsMap.containsKey(postId)) {
            Post existingPost = postsMap.get(postId);
            existingPost.setContent(newContent);
            existingPost.setTitle(newTitle);
            System.out.println("게시글이 수정되었습니다.");
        } else {
            System.out.println("해당 게시글이 존재하지 않습니다." + postId);
        }
    }

    //게시글 작성 메소드
    public void writePost(Long postId, String title, String content) {
        Post newPost = new Post();
        newPost.setId(postId);
        newPost.setTitle(title);
        newPost.setContent(content);
        postsMap.put(postId, newPost);
        System.out.println("게시글이 작성되었습니다.");
    }


}
