package zendesk.support;

import java.util.Locale;
/* loaded from: classes8.dex */
public enum SortBy {
    POSITION,
    TITLE,
    CREATED_AT,
    UPDATED_AT;

    public String getApiValue() {
        return name().toLowerCase(Locale.US);
    }
}
