package zendesk.support;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import zendesk.core.BlipsGroup;
import zendesk.core.BlipsProvider;
import zendesk.core.PageView;
import zendesk.core.UserAction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ZendeskHelpCenterBlipsProvider implements HelpCenterBlipsProvider {
    private static final String BLIPS_FIELD_NAME_ARTICLE_ID = "articleId";
    private static final String BLIPS_FIELD_NAME_CODE = "code";
    private static final String BLIPS_FIELD_NAME_QUERY = "query";
    private static final String BLIPS_FIELD_NAME_VOTE = "vote";
    private static final String BLIPS_FIELD_VALUE_CODE = "java";
    private static final String BLIPS_GUIDE_ACTION_SEARCH = "search";
    private static final String BLIPS_GUIDE_ACTION_VOTE = "articleVote";
    private static final String BLIPS_GUIDE_CATEGORY = "GuideSDK";
    private static final String BLIPS_GUIDE_CHANNEL = "guide_sdk";
    private static final String BLIPS_GUIDE_LABEL_HELP_CENTER = "helpCenterForm";
    private static final String BLIPS_GUIDE_VERSION = "1.0.8";
    private static final String LOG_TAG = "HelpCenterBlipsProvider";
    private BlipsProvider blipsProvider;
    private Locale locale;

    public ZendeskHelpCenterBlipsProvider(BlipsProvider blipsProvider, Locale locale) {
        this.blipsProvider = blipsProvider;
        this.locale = locale;
    }

    private void sendUserAction(BlipsGroup blipsGroup, String str, String str2, Map<String, Object> map) {
        this.blipsProvider.sendBlip(new UserAction(BLIPS_GUIDE_VERSION, BLIPS_GUIDE_CHANNEL, BLIPS_GUIDE_CATEGORY, str, str2, map), blipsGroup);
    }

    @Override // zendesk.support.HelpCenterBlipsProvider
    public void articleView(Article article) {
        if (article == null) {
            C33694Ix2.m101457b(LOG_TAG, "Aborting articleView blip: Article is null", new Object[0]);
            return;
        }
        String htmlUrl = article.getHtmlUrl();
        String title = article.getTitle();
        String locale = article.getLocale();
        if (!C44504lS5.m27272c(htmlUrl, title, locale)) {
            C33694Ix2.m101457b(LOG_TAG, "Cannot blip articleView: Article required fields are null", new Object[0]);
            return;
        }
        Long id = article.getId();
        if (id == null) {
            C33694Ix2.m101457b(LOG_TAG, "Cannot blip articleView: Id is null", new Object[0]);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("code", BLIPS_FIELD_VALUE_CODE);
        this.blipsProvider.sendBlip(new PageView(BLIPS_GUIDE_VERSION, BLIPS_GUIDE_CHANNEL, htmlUrl, C32272Cv2.m111342d(this.locale), title, id, locale, hashMap), BlipsGroup.PATHFINDER);
    }

    @Override // zendesk.support.HelpCenterBlipsProvider
    public void articleVote(Long l, int i) {
        if (l == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(BLIPS_FIELD_NAME_ARTICLE_ID, l);
        hashMap.put(BLIPS_FIELD_NAME_VOTE, Integer.valueOf(i));
        sendUserAction(BlipsGroup.BEHAVIOURAL, BLIPS_GUIDE_ACTION_VOTE, null, hashMap);
    }

    @Override // zendesk.support.HelpCenterBlipsProvider
    public void helpCenterSearch(String str) {
        if (!C44504lS5.m27273b(str)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(BLIPS_FIELD_NAME_QUERY, str);
        hashMap.put("code", BLIPS_FIELD_VALUE_CODE);
        sendUserAction(BlipsGroup.PATHFINDER, BLIPS_GUIDE_ACTION_SEARCH, BLIPS_GUIDE_LABEL_HELP_CENTER, hashMap);
    }
}
