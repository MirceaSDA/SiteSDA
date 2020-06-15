package anunturi;

import java.util.ArrayList;
import java.util.List;

public class Site {
    private String name;
    private List<Announcements> announcements = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Announcements> getAnnouncements() {
        return announcements;
    }
}
