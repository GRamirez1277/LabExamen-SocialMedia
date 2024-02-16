
package labexamen1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Twitter extends SocialClass implements Commentable {
    private ArrayList<Comment> comments;

    public Twitter(String username) {
        super(username);
        comments = new ArrayList<>(); 
    }
    public boolean addComment(Comment comment){
        if(comment.getpostId()>=0 && comment.getpostId()<getPost()){
            this.comments.add(comment);
        JOptionPane.showMessageDialog(null, "Comentario agregado.");
            return true;
        }else
        JOptionPane.showMessageDialog(null, "Este post no existe");
        return false;
    }
    public void timeLine() {
    for (int i = 0; i < getPost(); i++) {
        System.out.println("POST " + (i + 1) + ": " + posts.get(i));
        System.out.println("Comment: ");
        for (Comment comentario : comments) {
            if (comentario.getpostId() == i) {
                comentario.print();
            }
        }
    }
}
    
}

