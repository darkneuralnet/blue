package zendesk.core;

import co.bird.android.model.Detail;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes8.dex */
public class ZendeskLocaleConverter {
    private static final Map<String, String> forwardLookupMap;

    static {
        HashMap hashMap = new HashMap();
        forwardLookupMap = hashMap;
        hashMap.put("iw", "he");
        hashMap.put("nb", "no");
        hashMap.put("in", "id");
        hashMap.put("ji", "yi");
    }

    public String toHelpCenterLocaleString(Locale locale) {
        boolean z;
        if (locale != null && C44504lS5.m27273b(locale.getLanguage())) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            locale = Locale.getDefault();
        }
        String str = forwardLookupMap.get(locale.getLanguage());
        if (!C44504lS5.m27273b(str)) {
            str = locale.getLanguage();
        }
        StringBuilder sb = new StringBuilder(str);
        if (C44504lS5.m27273b(locale.getCountry())) {
            sb.append(Detail.EMPTY_CHAR);
            sb.append(locale.getCountry());
        }
        return sb.toString().toLowerCase();
    }
}
