package member;

class MemberSQL {
    final static String MODIFY_INFO
            = "update MEMBER set PASSWORD=?, NICKNAME=?,  where SEQ = ?";

    final static String WITHDRAW
            = "update MEMBER set VALID= 1 where SEQ= ?";

    final static String MY_REPLY
            = "";
}
