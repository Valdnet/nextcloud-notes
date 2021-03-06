package it.niedermann.owncloud.notes.main.items.section;

import androidx.annotation.NonNull;

import it.niedermann.owncloud.notes.shared.model.Item;

public class SectionItem implements Item {

    private String title;

    public SectionItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean isSection() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SectionItem)) return false;

        SectionItem that = (SectionItem) o;

        return title != null ? title.equals(that.title) : that.title == null;
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }

    @NonNull
    @Override
    public String toString() {
        return "SectionItem{" +
                "title='" + title + '\'' +
                '}';
    }
}
