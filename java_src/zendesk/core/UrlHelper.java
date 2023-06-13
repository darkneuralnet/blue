package zendesk.core;
/* loaded from: classes8.dex */
public class UrlHelper {
    public static boolean isGuideRequest(String str) {
        if (!str.contains("/api/v2/help_center") && !str.contains("/hc/api") && !str.contains("/api/mobile/help_center")) {
            return false;
        }
        return true;
    }
}
