package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Users {

        @Column(name = "fullname")
        private String fullname;

        @Column(name = "nickname")
        private String nickname;

        @Column(name = "title")
        private String title;

        @Column(name = "company")
        private String company;

        @Column(name = "emailaddress")
        private String emailaddress;
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(emailaddress);

        @Column(name = "phonenumber")
        private String phonenumber;

        @Column(name = "birthday")
        private Date birthday;

        @Column(name = "note")
        private String note;

        public String getFullname() {
            return fullname;
        }

        public void setFullname(String fullname) {
            this.fullname = fullname;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getEmailaddress() {
            return emailaddress;
        }

        public void setEmailaddress(String emailaddress) {
            this.emailaddress = emailaddress;
        }

        public String getPhonenumber() {
            return phonenumber;
        }

        public void setPhonenumber(String phonenumber) {
            this.phonenumber = phonenumber;
        }

        public Date getBirthday() {
            return birthday;
        }

        public void setBirthday(Date birthday) {
            this.birthday = birthday;
        }

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

    }
