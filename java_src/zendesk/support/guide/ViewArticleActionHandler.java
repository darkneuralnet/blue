package zendesk.support.guide;

import android.content.Context;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ViewArticleActionHandler implements ActionHandler {
    private static final String HC_PATH_ELEMENT_ARTICLE = "articles";
    private static final String HC_PATH_ELEMENT_HC = "hc";
    private static final String HC_PATH_ELEMENT_NAME_SEPARATOR = "-";
    private static final String HELP_CENTER_ARTICLE_ID = "help_center_article_id";
    private static final String HELP_CENTER_ARTICLE_TITLE = "help_center_article_title";
    static final String HELP_CENTER_VIEW_ARTICLE = "help_center_view_article";
    private static final String LOG_TAG = "ViewArticleActionHandle";

    /* loaded from: classes8.dex */
    public static class ActionPayload {
        private final String action;
        private final Map<String, Object> payload;

        private ActionPayload(String str, Map<String, Object> map) {
            this.action = str;
            this.payload = map;
        }

        public static ActionPayload invalid(String str) {
            return new ActionPayload(str, null);
        }

        public static ActionPayload valid(String str, Map<String, Object> map) {
            return new ActionPayload(str, map);
        }

        public String getAction() {
            return this.action;
        }

        public Map<String, Object> getPayload() {
            return this.payload;
        }

        public boolean isValid() {
            return C44504lS5.m27273b(this.action) && this.payload != null;
        }
    }

    public static Map<String, Object> data(long j, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(HELP_CENTER_ARTICLE_ID, Long.valueOf(j));
        hashMap.put(HELP_CENTER_ARTICLE_TITLE, str);
        return hashMap;
    }

    @Override // zendesk.core.ActionHandler
    public boolean canHandle(String str) {
        HttpUrl parse = HttpUrl.parse(str);
        if (parse == null) {
            return false;
        }
        return parse(parse).isValid();
    }

    @Override // zendesk.core.ActionHandler
    public ActionDescription getActionDescription() {
        return null;
    }

    @Override // zendesk.core.ActionHandler
    public int getPriority() {
        return 0;
    }

    @Override // zendesk.core.ActionHandler
    public void handle(Map<String, Object> map, Context context) {
        HttpUrl parse;
        List<InterfaceC40057dx0> emptyList;
        if (map == null) {
            C33694Ix2.m101447l(LOG_TAG, "Property map is null, cannot open article.", new Object[0]);
            return;
        }
        String str = (String) map.get(HELP_CENTER_VIEW_ARTICLE);
        if (C44504lS5.m27271d(str) || (parse = HttpUrl.parse(str)) == null) {
            return;
        }
        ActionPayload parse2 = parse(parse);
        if (parse2.isValid() && parse2.payload.containsKey(HELP_CENTER_ARTICLE_ID)) {
            long longValue = ((Long) parse2.payload.get(HELP_CENTER_ARTICLE_ID)).longValue();
            InterfaceC40057dx0 m108193f = C32756Ex0.m108193f(map, InterfaceC40057dx0.class);
            if (m108193f != null) {
                emptyList = m108193f.getConfigurations();
            } else {
                emptyList = Collections.emptyList();
            }
            ViewArticleActivity.builder(longValue).show(context, emptyList);
        }
    }

    public ActionPayload parse(HttpUrl httpUrl) {
        String str;
        List<String> pathSegments = httpUrl.pathSegments();
        if (pathSegments.size() >= 3 && pathSegments.size() <= 4) {
            int indexOf = pathSegments.indexOf(HC_PATH_ELEMENT_ARTICLE);
            if (HC_PATH_ELEMENT_HC.equals(pathSegments.get(0))) {
                if (indexOf == 1 || indexOf == 2) {
                    if (indexOf + 2 != pathSegments.size()) {
                        return ActionPayload.invalid(HELP_CENTER_VIEW_ARTICLE);
                    }
                    String str2 = pathSegments.get(indexOf + 1);
                    String[] split = str2.split("-");
                    if (C43505jm0.m29949h(split)) {
                        return ActionPayload.invalid(HELP_CENTER_VIEW_ARTICLE);
                    }
                    try {
                        Long valueOf = Long.valueOf(Long.parseLong(split[0]));
                        StringBuilder sb = new StringBuilder(str2.length());
                        if (split.length > 1) {
                            int length = split.length;
                            for (int i = 1; i < length; i++) {
                                sb.append(split[i]);
                                sb.append(' ');
                            }
                            str = sb.toString().trim();
                        } else {
                            str = "";
                        }
                        return ActionPayload.valid(HELP_CENTER_VIEW_ARTICLE, data(valueOf.longValue(), str));
                    } catch (NumberFormatException unused) {
                        return ActionPayload.invalid(HELP_CENTER_VIEW_ARTICLE);
                    }
                }
            }
            return ActionPayload.invalid(HELP_CENTER_VIEW_ARTICLE);
        }
        return ActionPayload.invalid(HELP_CENTER_VIEW_ARTICLE);
    }

    @Override // zendesk.core.ActionHandler
    public void updateSettings(Map<String, AbstractC52360yi2> map) {
    }
}
