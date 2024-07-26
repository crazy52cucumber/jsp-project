package member;


import domain.Board;
import domain.Member;
import domain.Reply;

import javax.naming.*;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import static member.MemberSQL.MODIFY_INFO;

public class MemberDAO {
    private DataSource ds;

    MemberDAO() {
        try {
            Context initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:/comp/env");
            ds = (DataSource) envContext.lookup("jdbc/TestDB");
        } catch (NamingException ne) {
            System.out.println("Dbcp객체(jdbc/TestDB)를 못찾음");
        }
    }

    public void modify(Member member) {
        Connection con = null;
        PreparedStatement pstmt = null;
        String sql = MODIFY_INFO;
        try {
            con = ds.getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, member.getPassword());
            pstmt.setString(2, member.getNickname());
            pstmt.setInt(3, member.getSeq());
            //System.out.println();
            int i = pstmt.executeUpdate();
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (SQLException se) {
            }
        }

    }

    public void withdraw(long seq) {

    }

    public ArrayList<Reply> myReplyList() {
        return null;
    }

    public ArrayList<Board> myBookingList() {
        return null;
    }


}
