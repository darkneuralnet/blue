package p000;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.stripe.android.model.Stripe3ds2AuthParams;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C52364yi6;
/* renamed from: Yz6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C37460Yz6 {

    /* renamed from: Yz6$a */
    /* loaded from: classes5.dex */
    public static class C10087a implements C52364yi6.InterfaceC30683b<SharePhoto, String> {
        @Override // p000.C52364yi6.InterfaceC30683b
        /* renamed from: a */
        public String apply(SharePhoto sharePhoto) {
            return sharePhoto.m52177e().toString();
        }
    }

    /* renamed from: a */
    public static Bundle m73937a(ShareLinkContent shareLinkContent) {
        Bundle m73934d = m73934d(shareLinkContent);
        C52364yi6.m2836h0(m73934d, "href", shareLinkContent.m52271a());
        C52364yi6.m2838g0(m73934d, "quote", shareLinkContent.m52240l());
        return m73934d;
    }

    /* renamed from: b */
    public static Bundle m73936b(ShareOpenGraphContent shareOpenGraphContent) {
        Bundle m73934d = m73934d(shareOpenGraphContent);
        C52364yi6.m2838g0(m73934d, "action_type", shareOpenGraphContent.m52192i().m52199e());
        try {
            JSONObject m93079q = C34876Ny5.m93079q(C34876Ny5.m93077s(shareOpenGraphContent), false);
            if (m93079q != null) {
                C52364yi6.m2838g0(m73934d, "action_properties", m93079q.toString());
            }
            return m73934d;
        } catch (JSONException e) {
            throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", e);
        }
    }

    /* renamed from: c */
    public static Bundle m73935c(SharePhotoContent sharePhotoContent) {
        Bundle m73934d = m73934d(sharePhotoContent);
        String[] strArr = new String[sharePhotoContent.getPhotos().size()];
        C52364yi6.m2850a0(sharePhotoContent.getPhotos(), new C10087a()).toArray(strArr);
        m73934d.putStringArray("media", strArr);
        return m73934d;
    }

    /* renamed from: d */
    public static Bundle m73934d(ShareContent shareContent) {
        Bundle bundle = new Bundle();
        ShareHashtag m52266g = shareContent.m52266g();
        if (m52266g != null) {
            C52364yi6.m2838g0(bundle, "hashtag", m52266g.m52251a());
        }
        return bundle;
    }

    /* renamed from: e */
    public static Bundle m73933e(ShareFeedContent shareFeedContent) {
        Bundle bundle = new Bundle();
        C52364yi6.m2838g0(bundle, "to", shareFeedContent.m52381o());
        C52364yi6.m2838g0(bundle, "link", shareFeedContent.m52387i());
        C52364yi6.m2838g0(bundle, "picture", shareFeedContent.m52382n());
        C52364yi6.m2838g0(bundle, Stripe3ds2AuthParams.FIELD_SOURCE, shareFeedContent.m52383m());
        C52364yi6.m2838g0(bundle, "name", shareFeedContent.m52384l());
        C52364yi6.m2838g0(bundle, "caption", shareFeedContent.m52386j());
        C52364yi6.m2838g0(bundle, "description", shareFeedContent.m52385k());
        return bundle;
    }

    /* renamed from: f */
    public static Bundle m73932f(ShareLinkContent shareLinkContent) {
        Bundle bundle = new Bundle();
        C52364yi6.m2838g0(bundle, "name", shareLinkContent.m52242j());
        C52364yi6.m2838g0(bundle, "description", shareLinkContent.m52243i());
        C52364yi6.m2838g0(bundle, "link", C52364yi6.m2873E(shareLinkContent.m52271a()));
        C52364yi6.m2838g0(bundle, "picture", C52364yi6.m2873E(shareLinkContent.m52241k()));
        C52364yi6.m2838g0(bundle, "quote", shareLinkContent.m52240l());
        if (shareLinkContent.m52266g() != null) {
            C52364yi6.m2838g0(bundle, "hashtag", shareLinkContent.m52266g().m52251a());
        }
        return bundle;
    }
}
