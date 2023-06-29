package com.example.baicuoiky.Model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Theloaitrongngay {

@SerializedName("Theloai")
@Expose
private List<Theloai> theloai = null;
@SerializedName("Chude")
@Expose
private List<ChuDe> chude = null;

public List<Theloai> getTheloai() {
return theloai;
}

public void setTheloai(List<Theloai> theloai) {
this.theloai = theloai;
}

public List<ChuDe> getChude() {
return chude;
}

public void setChude(List<ChuDe> chude) {
this.chude = chude;
}

}