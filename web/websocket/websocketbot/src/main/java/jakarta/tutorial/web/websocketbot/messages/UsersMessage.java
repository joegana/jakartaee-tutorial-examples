/*
 * Copyright (c) 2014, 2019 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package jakarta.tutorial.web.websocketbot.messages;

import java.util.List;

/* Represents the list of users currently connected to the chat */
public class UsersMessage extends Message {
    private List<String> userlist;
    
    public UsersMessage(List<String> userlist) {
        this.userlist = userlist;
    }
    
    public List<String> getUserList() {
        return userlist;
    }
    
    /* For logging purposes */
    @Override
    public String toString() {
        return "[UsersMessage] " + userlist.toString();
    }
}
