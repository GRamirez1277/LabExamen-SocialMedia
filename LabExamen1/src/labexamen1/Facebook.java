
package labexamen1;


import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Facebook extends SocialClass implements Commentable {
    private ArrayList<Comment> comment;
    
    public Facebook(String username){
        super(username);
        comment = new ArrayList<>();
    }
    
    public boolean addComment(Comment comment){
        if(comment.getpostId()>=0 && comment.getpostId()<getPost()){
            this.comment.add(comment);
        JOptionPane.showMessageDialog(null, "Comentario agregado.");
            return true;
        }else
        JOptionPane.showMessageDialog(null, "Este post no existe");
        return false;
    }
    public void makePost(String postContent) {
    posts.add(postContent);
}

//    public void timeLine(){
//   for(int i=0;i<getPost(); i++ ){
//       System.out.println("POST: "+posts.get(i));
//       for(Comment comentario: comment){
//           if(comentario.getpostId()==i)
//               comentario.print();
//       }
//   }
//    }
    
   public void timeLine() {
    for (int i = 0; i < getPost(); i++) {
        System.out.println("POST " + (i + 1) + ": " + posts.get(i));
        System.out.println("Comment: ");
        for (Comment comentario : comment) {
            if (comentario.getpostId() == i) {
                comentario.print();
            }
        }
    }
}
    
}
