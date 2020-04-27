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
public class VideoInfoType extends InfoType{
    private Long duration;
    private String mimetype;
    private Long size;
    private ThumbnailInfoType thumbnail_info;    
    private String thumbnail_url;
    private Long h;
    private Long w;
}
