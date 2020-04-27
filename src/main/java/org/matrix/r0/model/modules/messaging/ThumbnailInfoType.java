/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.matrix.r0.model.modules.messaging;

/**
 *
 * @author mhunter
 */
public class ThumbnailInfoType {
    
    private Long v;
    private String mimetype;
    private Long size;
    private Long w;

    public ThumbnailInfoType() {
    }

    public Long getV() {
        return v;
    }

    public void setV(Long v) {
        this.v = v;
    }

    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getW() {
        return w;
    }

    public void setW(Long w) {
        this.w = w;
    }
    
}
