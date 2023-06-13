package zendesk.support;

import java.util.Locale;
/* loaded from: classes8.dex */
public class SuggestedArticleSearch {
    private Long categoryId;
    private String labelNames;
    private Locale locale;
    private String query;
    private Long sectionId;

    public Long getCategoryId() {
        return this.categoryId;
    }

    public String getLabelNames() {
        return this.labelNames;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public String getQuery() {
        return this.query;
    }

    public Long getSectionId() {
        return this.sectionId;
    }

    private SuggestedArticleSearch() {
    }
}
