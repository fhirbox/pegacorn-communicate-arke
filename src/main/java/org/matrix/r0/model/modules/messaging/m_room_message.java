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
public class m_room_message {
    private String event_id;
    private Long origin_server_ts;
    private String room_id;
    private String sender;
    private String type;
    private UnsignedType unsigned;
    private ContentType content;
    
}
