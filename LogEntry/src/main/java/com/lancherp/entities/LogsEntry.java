package com.lancherp.entities;

import java.util.Date;
import java.util.Objects;

public class LogsEntry {
    private String name;
    private Date moment;

    public LogsEntry(String name, Date moment) {
        this.name = name;
        this.moment = moment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LogsEntry logsEntry = (LogsEntry) o;
        return Objects.equals(name, logsEntry.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
