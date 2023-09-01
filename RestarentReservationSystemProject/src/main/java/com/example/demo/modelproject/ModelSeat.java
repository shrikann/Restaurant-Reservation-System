package com.example.demo.modelproject;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import jakarta.persistence.Table;

@Entity
@Table(name="resrvationdetails")
public class ModelSeat {
	@Id
		private int bookingid;
	
		private String bookingname;
		private long custnumber;
		private int totalmembers;
		@DateTimeFormat (pattern = "yyyy-MM-dd")
		private Date bookingdate;
		@JsonFormat (pattern = "HH:mm:ss")
		private Time bookingstarttime;
		@JsonFormat(pattern = "HH:mm:ss")
		private Time endtime;
		private String custemail;
		
		//one to one
		@OneToMany(cascade = CascadeType.ALL)
		@JoinColumn(name="fk")
		private List<SeatModel> bookingdetails;
		public List<SeatModel> getbookingdetails(){
			return bookingdetails;
		}
		public void setbookingdetails (List<SeatModel>bookingdetails) {
			this.bookingdetails=bookingdetails;
		}
		
		
		public int getBookingid() {
			return bookingid;
		}
		public void setBookingid(int bookingid) {
			this.bookingid = bookingid;
		}
		public String getBookingname() {
			return bookingname;
		}
		public void setBookingname(String bookingname) {
			this.bookingname = bookingname;
		}
		public long getCustnumber() {
			return custnumber;
		}
		public void setCustnumber(long custnumber) {
			this.custnumber = custnumber;
		}
		public int getTotalmembers() {
			return totalmembers;
		}
		public void setTotalmembers(int totalmembers) {
			this.totalmembers = totalmembers;
		}
		public Date getBookingdate() {
			return bookingdate;
		}
		public void setBookingdate(Date bookingdate) {
			this.bookingdate = bookingdate;
		}
		public Time getBookingstarttime() {
			return bookingstarttime;
		}
		public void setBookingstarttime(Time bookingstarttime) {
			this.bookingstarttime = bookingstarttime;
		}
		public Time getEndtime() {
			return endtime;
		}
		public void setEndtime(Time endtime) {
			this.endtime = endtime;
		}
		public String getCustemail() {
			return custemail;
		}
		public void setCustemail(String custemail) {
			this.custemail = custemail;
		}
		public ModelSeat(int bookingid, String bookingname, long custnumber, int totalmembers, Date bookingdate,
				Time bookingstarttime, Time endtime, String custemail) {
			super();
			this.bookingid = bookingid;
			this.bookingname = bookingname;
			this.custnumber = custnumber;
			this.totalmembers = totalmembers;
			this.bookingdate = bookingdate;
			this.bookingstarttime = bookingstarttime;
			this.endtime = endtime;
			this.custemail = custemail;
		}
		public ModelSeat() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}
