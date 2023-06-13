package p000;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: dp2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C39979dp2 {
    /* renamed from: a */
    public static Bundle m43682a(ShareLinkContent shareLinkContent, boolean z) {
        Bundle m43677f = m43677f(shareLinkContent, z);
        C52364yi6.m2838g0(m43677f, "com.facebook.platform.extra.TITLE", shareLinkContent.m52242j());
        C52364yi6.m2838g0(m43677f, "com.facebook.platform.extra.DESCRIPTION", shareLinkContent.m52243i());
        C52364yi6.m2836h0(m43677f, "com.facebook.platform.extra.IMAGE", shareLinkContent.m52241k());
        return m43677f;
    }

    /* renamed from: b */
    public static Bundle m43681b(ShareOpenGraphContent shareOpenGraphContent, JSONObject jSONObject, boolean z) {
        Bundle m43677f = m43677f(shareOpenGraphContent, z);
        C52364yi6.m2838g0(m43677f, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", shareOpenGraphContent.m52191j());
        C52364yi6.m2838g0(m43677f, "com.facebook.platform.extra.ACTION_TYPE", shareOpenGraphContent.m52192i().m52199e());
        C52364yi6.m2838g0(m43677f, "com.facebook.platform.extra.ACTION", jSONObject.toString());
        return m43677f;
    }

    /* renamed from: c */
    public static Bundle m43680c(SharePhotoContent sharePhotoContent, List<String> list, boolean z) {
        Bundle m43677f = m43677f(sharePhotoContent, z);
        m43677f.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList<>(list));
        return m43677f;
    }

    /* renamed from: d */
    public static Bundle m43679d(ShareVideoContent shareVideoContent, boolean z) {
        return null;
    }

    /* renamed from: e */
    public static Bundle m43678e(UUID uuid, ShareContent shareContent, boolean z) {
        C48817sj6.m13765m(shareContent, "shareContent");
        C48817sj6.m13765m(uuid, "callId");
        if (shareContent instanceof ShareLinkContent) {
            return m43682a((ShareLinkContent) shareContent, z);
        }
        if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            return m43680c(sharePhotoContent, C34876Ny5.m93088h(sharePhotoContent, uuid), z);
        } else if (shareContent instanceof ShareVideoContent) {
            return m43679d((ShareVideoContent) shareContent, z);
        } else {
            if (shareContent instanceof ShareOpenGraphContent) {
                ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
                try {
                    return m43681b(shareOpenGraphContent, C34876Ny5.m93078r(uuid, shareOpenGraphContent), z);
                } catch (JSONException e) {
                    throw new FacebookException("Unable to create a JSON Object from the provided ShareOpenGraphContent: " + e.getMessage());
                }
            }
            return null;
        }
    }

    /* renamed from: f */
    public static Bundle m43677f(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        C52364yi6.m2836h0(bundle, "com.facebook.platform.extra.LINK", shareContent.m52271a());
        C52364yi6.m2838g0(bundle, "com.facebook.platform.extra.PLACE", shareContent.m52268d());
        C52364yi6.m2838g0(bundle, "com.facebook.platform.extra.REF", shareContent.m52267e());
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z);
        List<String> m52269c = shareContent.m52269c();
        if (!C52364yi6.m2859S(m52269c)) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList<>(m52269c));
        }
        return bundle;
    }
}
