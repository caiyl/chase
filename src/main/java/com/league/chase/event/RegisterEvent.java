package com.league.chase.event;

import org.springframework.context.ApplicationEvent;

public class RegisterEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never {@code null})
     */
    private User user;

    public RegisterEvent(Object source, User user) {
        super(source);
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
