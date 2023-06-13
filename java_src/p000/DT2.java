package p000;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerGenericTemplateElement;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.google.android.filament.gltfio.BuildConfig;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: DT2 */
/* loaded from: classes5.dex */
public class DT2 {

    /* renamed from: a */
    public static final Pattern f5752a = Pattern.compile("^(.+)\\.(facebook\\.com)$");

    /* renamed from: DT2$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C1492a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5753a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f5754b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f5755c;

        static {
            int[] iArr = new int[ShareMessengerMediaTemplateContent.EnumC17347b.values().length];
            f5755c = iArr;
            try {
                iArr[ShareMessengerMediaTemplateContent.EnumC17347b.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[ShareMessengerGenericTemplateContent.EnumC17344b.values().length];
            f5754b = iArr2;
            try {
                iArr2[ShareMessengerGenericTemplateContent.EnumC17344b.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr3 = new int[ShareMessengerURLActionButton.EnumC17350b.values().length];
            f5753a = iArr3;
            try {
                iArr3[ShareMessengerURLActionButton.EnumC17350b.WebviewHeightRatioCompact.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5753a[ShareMessengerURLActionButton.EnumC17350b.WebviewHeightRatioTall.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static void m110403a(Bundle bundle, ShareMessengerActionButton shareMessengerActionButton, boolean z) throws JSONException {
        if (TD0.m84203d(DT2.class) || shareMessengerActionButton == null) {
            return;
        }
        try {
            if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
                m110396h(bundle, (ShareMessengerURLActionButton) shareMessengerActionButton, z);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
        }
    }

    /* renamed from: b */
    public static void m110402b(Bundle bundle, ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) throws JSONException {
        if (TD0.m84203d(DT2.class)) {
            return;
        }
        try {
            m110401c(bundle, shareMessengerGenericTemplateContent.m52228i());
            C52364yi6.m2840f0(bundle, "MESSENGER_PLATFORM_CONTENT", m110388p(shareMessengerGenericTemplateContent));
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
        }
    }

    /* renamed from: c */
    public static void m110401c(Bundle bundle, ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement) throws JSONException {
        if (TD0.m84203d(DT2.class)) {
            return;
        }
        try {
            if (shareMessengerGenericTemplateElement.m52223a() != null) {
                m110403a(bundle, shareMessengerGenericTemplateElement.m52223a(), false);
            } else if (shareMessengerGenericTemplateElement.m52222b() != null) {
                m110403a(bundle, shareMessengerGenericTemplateElement.m52222b(), true);
            }
            C52364yi6.m2836h0(bundle, "IMAGE", shareMessengerGenericTemplateElement.m52221c());
            C52364yi6.m2838g0(bundle, "PREVIEW_TYPE", "DEFAULT");
            C52364yi6.m2838g0(bundle, "TITLE", shareMessengerGenericTemplateElement.m52219e());
            C52364yi6.m2838g0(bundle, "SUBTITLE", shareMessengerGenericTemplateElement.m52220d());
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
        }
    }

    /* renamed from: d */
    public static void m110400d(Bundle bundle, ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        if (TD0.m84203d(DT2.class)) {
            return;
        }
        try {
            m110399e(bundle, shareMessengerMediaTemplateContent);
            C52364yi6.m2840f0(bundle, "MESSENGER_PLATFORM_CONTENT", m110386r(shareMessengerMediaTemplateContent));
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
        }
    }

    /* renamed from: e */
    public static void m110399e(Bundle bundle, ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        if (TD0.m84203d(DT2.class)) {
            return;
        }
        try {
            m110403a(bundle, shareMessengerMediaTemplateContent.m52215j(), false);
            C52364yi6.m2838g0(bundle, "PREVIEW_TYPE", "DEFAULT");
            C52364yi6.m2838g0(bundle, "ATTACHMENT_ID", shareMessengerMediaTemplateContent.m52216i());
            if (shareMessengerMediaTemplateContent.m52213l() != null) {
                C52364yi6.m2836h0(bundle, m110393k(shareMessengerMediaTemplateContent.m52213l()), shareMessengerMediaTemplateContent.m52213l());
            }
            C52364yi6.m2838g0(bundle, "type", m110394j(shareMessengerMediaTemplateContent.m52214k()));
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
        }
    }

    /* renamed from: f */
    public static void m110398f(Bundle bundle, ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        if (TD0.m84203d(DT2.class)) {
            return;
        }
        try {
            m110397g(bundle, shareMessengerOpenGraphMusicTemplateContent);
            C52364yi6.m2840f0(bundle, "MESSENGER_PLATFORM_CONTENT", m110384t(shareMessengerOpenGraphMusicTemplateContent));
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
        }
    }

    /* renamed from: g */
    public static void m110397g(Bundle bundle, ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        if (TD0.m84203d(DT2.class)) {
            return;
        }
        try {
            m110403a(bundle, shareMessengerOpenGraphMusicTemplateContent.m52210i(), false);
            C52364yi6.m2838g0(bundle, "PREVIEW_TYPE", "OPEN_GRAPH");
            C52364yi6.m2836h0(bundle, "OPEN_GRAPH_URL", shareMessengerOpenGraphMusicTemplateContent.m52209j());
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
        }
    }

    /* renamed from: h */
    public static void m110396h(Bundle bundle, ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z) throws JSONException {
        String str;
        if (TD0.m84203d(DT2.class)) {
            return;
        }
        try {
            if (z) {
                str = C52364yi6.m2873E(shareMessengerURLActionButton.m52203e());
            } else {
                str = shareMessengerURLActionButton.m52229a() + " - " + C52364yi6.m2873E(shareMessengerURLActionButton.m52203e());
            }
            C52364yi6.m2838g0(bundle, "TARGET_DISPLAY", str);
            C52364yi6.m2836h0(bundle, "ITEM_URL", shareMessengerURLActionButton.m52203e());
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
        }
    }

    /* renamed from: i */
    public static String m110395i(ShareMessengerGenericTemplateContent.EnumC17344b enumC17344b) {
        if (TD0.m84203d(DT2.class)) {
            return null;
        }
        if (enumC17344b == null) {
            return "horizontal";
        }
        try {
            if (C1492a.f5754b[enumC17344b.ordinal()] != 1) {
                return "horizontal";
            }
            return "square";
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
            return null;
        }
    }

    /* renamed from: j */
    public static String m110394j(ShareMessengerMediaTemplateContent.EnumC17347b enumC17347b) {
        if (TD0.m84203d(DT2.class)) {
            return null;
        }
        if (enumC17347b == null) {
            return Entry.TYPE_IMAGE;
        }
        try {
            if (C1492a.f5755c[enumC17347b.ordinal()] != 1) {
                return Entry.TYPE_IMAGE;
            }
            return "video";
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
            return null;
        }
    }

    /* renamed from: k */
    public static String m110393k(Uri uri) {
        if (TD0.m84203d(DT2.class)) {
            return null;
        }
        try {
            String host = uri.getHost();
            if (!C52364yi6.m2860R(host)) {
                if (f5752a.matcher(host).matches()) {
                    return "uri";
                }
            }
            return "IMAGE";
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
            return null;
        }
    }

    /* renamed from: l */
    public static String m110392l(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (TD0.m84203d(DT2.class)) {
            return null;
        }
        try {
            if (!shareMessengerURLActionButton.m52204d()) {
                return null;
            }
            return "hide";
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
            return null;
        }
    }

    /* renamed from: m */
    public static String m110391m(ShareMessengerURLActionButton.EnumC17350b enumC17350b) {
        if (TD0.m84203d(DT2.class)) {
            return null;
        }
        if (enumC17350b == null) {
            return BuildConfig.FLAVOR;
        }
        try {
            int i = C1492a.f5753a[enumC17350b.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return BuildConfig.FLAVOR;
                }
                return "tall";
            }
            return "compact";
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
            return null;
        }
    }

    /* renamed from: n */
    public static JSONObject m110390n(ShareMessengerActionButton shareMessengerActionButton) throws JSONException {
        if (TD0.m84203d(DT2.class)) {
            return null;
        }
        try {
            return m110389o(shareMessengerActionButton, false);
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
            return null;
        }
    }

    /* renamed from: o */
    public static JSONObject m110389o(ShareMessengerActionButton shareMessengerActionButton, boolean z) throws JSONException {
        if (TD0.m84203d(DT2.class)) {
            return null;
        }
        try {
            if (!(shareMessengerActionButton instanceof ShareMessengerURLActionButton)) {
                return null;
            }
            return m110382v((ShareMessengerURLActionButton) shareMessengerActionButton, z);
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
            return null;
        }
    }

    /* renamed from: p */
    public static JSONObject m110388p(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) throws JSONException {
        if (TD0.m84203d(DT2.class)) {
            return null;
        }
        try {
            return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", "generic").put("sharable", shareMessengerGenericTemplateContent.m52226k()).put("image_aspect_ratio", m110395i(shareMessengerGenericTemplateContent.m52227j())).put("elements", new JSONArray().put(m110387q(shareMessengerGenericTemplateContent.m52228i())))));
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
            return null;
        }
    }

    /* renamed from: q */
    public static JSONObject m110387q(ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement) throws JSONException {
        if (TD0.m84203d(DT2.class)) {
            return null;
        }
        try {
            JSONObject put = new JSONObject().put("title", shareMessengerGenericTemplateElement.m52219e()).put("subtitle", shareMessengerGenericTemplateElement.m52220d()).put("image_url", C52364yi6.m2873E(shareMessengerGenericTemplateElement.m52221c()));
            if (shareMessengerGenericTemplateElement.m52223a() != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(m110390n(shareMessengerGenericTemplateElement.m52223a()));
                put.put("buttons", jSONArray);
            }
            if (shareMessengerGenericTemplateElement.m52222b() != null) {
                put.put("default_action", m110389o(shareMessengerGenericTemplateElement.m52222b(), true));
            }
            return put;
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
            return null;
        }
    }

    /* renamed from: r */
    public static JSONObject m110386r(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        if (TD0.m84203d(DT2.class)) {
            return null;
        }
        try {
            return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", "media").put("elements", new JSONArray().put(m110385s(shareMessengerMediaTemplateContent)))));
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
            return null;
        }
    }

    /* renamed from: s */
    public static JSONObject m110385s(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        if (TD0.m84203d(DT2.class)) {
            return null;
        }
        try {
            JSONObject put = new JSONObject().put("attachment_id", shareMessengerMediaTemplateContent.m52216i()).put("url", C52364yi6.m2873E(shareMessengerMediaTemplateContent.m52213l())).put("media_type", m110394j(shareMessengerMediaTemplateContent.m52214k()));
            if (shareMessengerMediaTemplateContent.m52215j() != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(m110390n(shareMessengerMediaTemplateContent.m52215j()));
                put.put("buttons", jSONArray);
            }
            return put;
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
            return null;
        }
    }

    /* renamed from: t */
    public static JSONObject m110384t(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        if (TD0.m84203d(DT2.class)) {
            return null;
        }
        try {
            return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", "open_graph").put("elements", new JSONArray().put(m110383u(shareMessengerOpenGraphMusicTemplateContent)))));
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
            return null;
        }
    }

    /* renamed from: u */
    public static JSONObject m110383u(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        if (TD0.m84203d(DT2.class)) {
            return null;
        }
        try {
            JSONObject put = new JSONObject().put("url", C52364yi6.m2873E(shareMessengerOpenGraphMusicTemplateContent.m52209j()));
            if (shareMessengerOpenGraphMusicTemplateContent.m52210i() != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(m110390n(shareMessengerOpenGraphMusicTemplateContent.m52210i()));
                put.put("buttons", jSONArray);
            }
            return put;
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
            return null;
        }
    }

    /* renamed from: v */
    public static JSONObject m110382v(ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z) throws JSONException {
        String m52229a;
        if (TD0.m84203d(DT2.class)) {
            return null;
        }
        try {
            JSONObject put = new JSONObject().put("type", "web_url");
            if (z) {
                m52229a = null;
            } else {
                m52229a = shareMessengerURLActionButton.m52229a();
            }
            return put.put("title", m52229a).put("url", C52364yi6.m2873E(shareMessengerURLActionButton.m52203e())).put("webview_height_ratio", m110391m(shareMessengerURLActionButton.m52202g())).put("messenger_extensions", shareMessengerURLActionButton.m52205c()).put("fallback_url", C52364yi6.m2873E(shareMessengerURLActionButton.m52206b())).put("webview_share_button", m110392l(shareMessengerURLActionButton));
        } catch (Throwable th) {
            TD0.m84205b(th, DT2.class);
            return null;
        }
    }
}
