import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MemberManager {
    private static ArrayList<Member> members = new ArrayList<>();
    
    public static void addMember(String name, String email, String phone, String location, String Mem_pac, String membership, int totalPrice) {
        Member newMember = new Member(name, email, phone, location, Mem_pac, membership, totalPrice);
        members.add(newMember);
        System.out.println("Member added: " + newMember.getID() + " - " + newMember.getName());
    }
    
    public static void showAllMembers() {
        if (members.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No members found.");
        } else {
            StringBuilder memberInfo = new StringBuilder();
            for (Member member : members) {
                memberInfo.append("\nID : ").append(member.getID())
                          .append("\nName : ").append(member.getName())
                          .append("\nLockerID : ").append(member.getLockerID())
                          .append("\nPackage : ").append(member.getPackage())
                          .append("\nMemberShip : ").append(member.getMembership())
                          .append("\nTotal Price : ").append(member.getTotalPrice())
                          .append("\n--------------------------");
            }
            JOptionPane.showMessageDialog(null, memberInfo.toString(), "All Members", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static int getLastMemberID() {
        if (members.isEmpty()) {
            return -1;
        }
        return members.get(members.size() - 1).getID();
    }
    
    public static Member searchMemberByID(int id) {
        for (Member member : members) {
            if (member.getID() == id) {
                return member;
            }
        }
        return null;
    }
}