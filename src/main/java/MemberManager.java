import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MemberManager {
    private static ArrayList<Member> members = new ArrayList<>();
    
    // Add member method with totalPrice parameter
    public static void addMember(String name, String email, String phone, String location, String Mem_pac, String membership, int totalPrice) {
        Member newMember = new Member(name, email, phone, location, Mem_pac, membership, totalPrice); // Pass totalPrice
        members.add(newMember);
        System.out.println("Member added: " + newMember.getID() + " - " + newMember.getName());
    }
    
    // Show all members
    public static void showAllMembers() {
        if (members.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No members found.");
        } else {
            StringBuilder memberInfo = new StringBuilder();
            for (Member member : members) {
                memberInfo.append("\nID : ").append(member.getID())
                          .append("\nName : ").append(member.getName())
                          .append("\nEmail : ").append(member.getEmail()) // Un-commented to display Email
                          .append("\nPhone : ").append(member.getPhone()) // Un-commented to display Phone
                          .append("\nLocation : ").append(member.getLocation()) // Un-commented to display Location
                          .append("\nLockerID : ").append(member.getLockerID())
                          .append("\nPackage : ").append(member.getPackage())
                          .append("\nMemberShip : ").append(member.getMembership())
                          .append("\nTotal Price : ").append(member.getTotalPrice())
                          .append("\n--------------------------");
            }
            JOptionPane.showMessageDialog(null, memberInfo.toString(), "All Members", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Get the last member ID
    public static int getLastMemberID() {
        if (members.isEmpty()) {
            return -1; // Return -1 if no members exist
        }
        return members.get(members.size() - 1).getID(); // Get the ID of the last member
    }
}
