package zendesk.support;

import java.util.List;
/* loaded from: classes8.dex */
public class HelpRequest {
    private static final int DEFAULT_ARTICLES_PER_SECTION = 5;
    private static final String INCLUDE_ALL = "categories,sections";
    private static final String INCLUDE_CATEGORIES = "categories";
    private static final String INCLUDE_SECTIONS = "sections";
    private static final String LOG_TAG = "HelpRequest";
    private int articlesPerPageLimit;
    private String categoryIds;
    private String includes;
    private String[] labelNames;
    private String sectionIds;

    /* loaded from: classes8.dex */
    public static class Builder {
        private int articlesPerSectionLimit = 5;
        private String categoryIds;
        private String includes;
        private String[] labelNames;
        private String sectionIds;

        public HelpRequest build() {
            return new HelpRequest(this);
        }

        public Builder includeCategories() {
            if (C44504lS5.m27271d(this.includes)) {
                this.includes = HelpRequest.INCLUDE_CATEGORIES;
            } else if (this.includes.equals(HelpRequest.INCLUDE_SECTIONS)) {
                this.includes = HelpRequest.INCLUDE_ALL;
            }
            return this;
        }

        public Builder includeSections() {
            if (C44504lS5.m27271d(this.includes)) {
                this.includes = HelpRequest.INCLUDE_SECTIONS;
            } else if (this.includes.equals(HelpRequest.INCLUDE_CATEGORIES)) {
                this.includes = HelpRequest.INCLUDE_ALL;
            }
            return this;
        }

        public Builder withArticlesPerSectionLimit(int i) {
            this.articlesPerSectionLimit = i;
            return this;
        }

        public Builder withCategoryIds(List<Long> list) {
            this.categoryIds = C44504lS5.m27267h(list);
            return this;
        }

        public Builder withLabelNames(String... strArr) {
            this.labelNames = strArr;
            return this;
        }

        public Builder withSectionIds(List<Long> list) {
            this.sectionIds = C44504lS5.m27267h(list);
            return this;
        }
    }

    public int getArticlesPerPageLimit() {
        return this.articlesPerPageLimit;
    }

    public String getCategoryIds() {
        return this.categoryIds;
    }

    public String getIncludes() {
        return this.includes;
    }

    public String[] getLabelNames() {
        return this.labelNames;
    }

    public String getSectionIds() {
        return this.sectionIds;
    }

    private HelpRequest(Builder builder) {
        this.categoryIds = builder.categoryIds;
        this.sectionIds = builder.sectionIds;
        this.includes = builder.includes;
        this.articlesPerPageLimit = builder.articlesPerSectionLimit;
        this.labelNames = builder.labelNames;
    }
}
