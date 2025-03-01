package com.bbaga.githubscheduledreminderapp.domain.configuration.sources.filters;

public enum Filters {
    DRAFT_FILTER(Constants.DRAFT_FILTER),
    LABEL_FILTER(Constants.LABEL_FILTER),
    AUTHOR_FILTER(Constants.AUTHOR_FILTER);

    public final String label;

    Filters(String label) {
        this.label = label;
    }

    public static class Constants {
        public static final String DRAFT_FILTER = "draft-filter";
        public static final String LABEL_FILTER = "label-filter";
        public static final String AUTHOR_FILTER = "author-filter";
    }
}
