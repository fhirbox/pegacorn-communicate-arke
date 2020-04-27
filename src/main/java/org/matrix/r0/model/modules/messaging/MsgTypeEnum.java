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
public enum MsgTypeEnum {
    M_AUDIO("m.audio"),
    M_EMOTE("m.emote"),
    M_FILE("m.file"),
    M_IMAGE("m.image"),
    M_LOCATION("m.location"),
    M_NOTICE("m.notice"),
    M_SERVER_NOTICE("m.server_notice"),
    M_TEXT("m.text"),
    M_VIDEO("m.video");
    
    
    private String themsgtype;
    
    private MsgTypeEnum(String themsgtype ){
        this.themsgtype = themsgtype;
    }
    
    public String getMsgType(){
        return(this.themsgtype);
    }
    
}
