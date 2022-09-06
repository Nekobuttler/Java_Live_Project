/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author okk
 */
public class Video {
    private String title;
    private String Streamer;
    private int viewers;
    private double Vi_budget;
    
    public Video(){
        title="";
        Streamer="";
        viewers=0;
        Vi_budget=0.0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStreamer() {
        return Streamer;
    }

    public void setStreamer(String Streamer) {
        this.Streamer = Streamer;
    }

    public int getViewers() {
        return viewers;
    }

    public void setViewers(int viewers) {
        this.viewers = viewers;
    }

    public double getVi_budget() {
        return Vi_budget;
    }

    public void setVi_budget(double Vi_budget) {
        this.Vi_budget = Vi_budget;
    }
    
}
