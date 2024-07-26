package domain;

import java.sql.Date;

public class Reply {
    private int replay_seq;
    private int rate;
    private String content;
    private Date cdate;
    private int member_seq;
    private int board_seq;
    private int valid;

    public Reply(int replay_seq, int rate, String content, Date cdate, int member_seq, int board_seq, int valid) {
        this.replay_seq = replay_seq;
        this.rate = rate;
        this.content = content;
        this.cdate = cdate;
        this.member_seq = member_seq;
        this.board_seq = board_seq;
        this.valid = valid;
    }

    public int getReplay_seq() {
        return replay_seq;
    }

    public void setReplay_seq(int replay_seq) {
        this.replay_seq = replay_seq;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public int getMember_seq() {
        return member_seq;
    }

    public void setMember_seq(int member_seq) {
        this.member_seq = member_seq;
    }

    public int getBoard_seq() {
        return board_seq;
    }

    public void setBoard_seq(int board_seq) {
        this.board_seq = board_seq;
    }

    public int getValid() {
        return valid;
    }

    public void setValid(int valid) {
        this.valid = valid;
    }
}
