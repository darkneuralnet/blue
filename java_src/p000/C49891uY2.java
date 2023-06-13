package p000;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: uY2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C49891uY2 {
    /* renamed from: a */
    public static Bundle m10086a(ShareCameraEffectContent shareCameraEffectContent, Bundle bundle, boolean z) {
        Bundle m10075l = m10075l(shareCameraEffectContent, z);
        C52364yi6.m2838g0(m10075l, "effect_id", shareCameraEffectContent.m52275j());
        if (bundle != null) {
            m10075l.putBundle("effect_textures", bundle);
        }
        try {
            JSONObject m115496a = C31622Ab0.m115496a(shareCameraEffectContent.m52276i());
            if (m115496a != null) {
                C52364yi6.m2838g0(m10075l, "effect_arguments", m115496a.toString());
            }
            return m10075l;
        } catch (JSONException e) {
            throw new FacebookException("Unable to create a JSON Object from the provided CameraEffectArguments: " + e.getMessage());
        }
    }

    /* renamed from: b */
    public static Bundle m10085b(ShareLinkContent shareLinkContent, boolean z) {
        Bundle m10075l = m10075l(shareLinkContent, z);
        C52364yi6.m2838g0(m10075l, "TITLE", shareLinkContent.m52242j());
        C52364yi6.m2838g0(m10075l, "DESCRIPTION", shareLinkContent.m52243i());
        C52364yi6.m2836h0(m10075l, "IMAGE", shareLinkContent.m52241k());
        C52364yi6.m2838g0(m10075l, "QUOTE", shareLinkContent.m52240l());
        C52364yi6.m2836h0(m10075l, "MESSENGER_LINK", shareLinkContent.m52271a());
        C52364yi6.m2836h0(m10075l, "TARGET_DISPLAY", shareLinkContent.m52271a());
        return m10075l;
    }

    /* renamed from: c */
    public static Bundle m10084c(ShareMediaContent shareMediaContent, List<Bundle> list, boolean z) {
        Bundle m10075l = m10075l(shareMediaContent, z);
        m10075l.putParcelableArrayList("MEDIA", new ArrayList<>(list));
        return m10075l;
    }

    /* renamed from: d */
    public static Bundle m10083d(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent, boolean z) {
        Bundle m10075l = m10075l(shareMessengerGenericTemplateContent, z);
        try {
            DT2.m110402b(m10075l, shareMessengerGenericTemplateContent);
            return m10075l;
        } catch (JSONException e) {
            throw new FacebookException("Unable to create a JSON Object from the provided ShareMessengerGenericTemplateContent: " + e.getMessage());
        }
    }

    /* renamed from: e */
    public static Bundle m10082e(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent, boolean z) {
        Bundle m10075l = m10075l(shareMessengerMediaTemplateContent, z);
        try {
            DT2.m110400d(m10075l, shareMessengerMediaTemplateContent);
            return m10075l;
        } catch (JSONException e) {
            throw new FacebookException("Unable to create a JSON Object from the provided ShareMessengerMediaTemplateContent: " + e.getMessage());
        }
    }

    /* renamed from: f */
    public static Bundle m10081f(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent, boolean z) {
        Bundle m10075l = m10075l(shareMessengerOpenGraphMusicTemplateContent, z);
        try {
            DT2.m110398f(m10075l, shareMessengerOpenGraphMusicTemplateContent);
            return m10075l;
        } catch (JSONException e) {
            throw new FacebookException("Unable to create a JSON Object from the provided ShareMessengerOpenGraphMusicTemplateContent: " + e.getMessage());
        }
    }

    /* renamed from: g */
    public static Bundle m10080g(ShareOpenGraphContent shareOpenGraphContent, JSONObject jSONObject, boolean z) {
        Bundle m10075l = m10075l(shareOpenGraphContent, z);
        C52364yi6.m2838g0(m10075l, "PREVIEW_PROPERTY_NAME", (String) C34876Ny5.m93091e(shareOpenGraphContent.m52191j()).second);
        C52364yi6.m2838g0(m10075l, "ACTION_TYPE", shareOpenGraphContent.m52192i().m52199e());
        C52364yi6.m2838g0(m10075l, "ACTION", jSONObject.toString());
        return m10075l;
    }

    /* renamed from: h */
    public static Bundle m10079h(SharePhotoContent sharePhotoContent, List<String> list, boolean z) {
        Bundle m10075l = m10075l(sharePhotoContent, z);
        m10075l.putStringArrayList("PHOTOS", new ArrayList<>(list));
        return m10075l;
    }

    /* renamed from: i */
    public static Bundle m10078i(ShareStoryContent shareStoryContent, Bundle bundle, Bundle bundle2, boolean z) {
        Bundle m10075l = m10075l(shareStoryContent, z);
        if (bundle != null) {
            m10075l.putParcelable("bg_asset", bundle);
        }
        if (bundle2 != null) {
            m10075l.putParcelable("interactive_asset_uri", bundle2);
        }
        List<String> m52147k = shareStoryContent.m52147k();
        if (!C52364yi6.m2859S(m52147k)) {
            m10075l.putStringArrayList("top_background_color_list", new ArrayList<>(m52147k));
        }
        C52364yi6.m2838g0(m10075l, "content_url", shareStoryContent.m52149i());
        return m10075l;
    }

    /* renamed from: j */
    public static Bundle m10077j(ShareVideoContent shareVideoContent, String str, boolean z) {
        Bundle m10075l = m10075l(shareVideoContent, z);
        C52364yi6.m2838g0(m10075l, "TITLE", shareVideoContent.m52133j());
        C52364yi6.m2838g0(m10075l, "DESCRIPTION", shareVideoContent.m52134i());
        C52364yi6.m2838g0(m10075l, "VIDEO", str);
        return m10075l;
    }

    /* renamed from: k */
    public static Bundle m10076k(UUID uuid, ShareContent shareContent, boolean z) {
        C48817sj6.m13765m(shareContent, "shareContent");
        C48817sj6.m13765m(uuid, "callId");
        if (shareContent instanceof ShareLinkContent) {
            return m10085b((ShareLinkContent) shareContent, z);
        }
        if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            return m10079h(sharePhotoContent, C34876Ny5.m93088h(sharePhotoContent, uuid), z);
        } else if (shareContent instanceof ShareVideoContent) {
            ShareVideoContent shareVideoContent = (ShareVideoContent) shareContent;
            return m10077j(shareVideoContent, C34876Ny5.m93084l(shareVideoContent, uuid), z);
        } else if (shareContent instanceof ShareOpenGraphContent) {
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            try {
                return m10080g(shareOpenGraphContent, C34876Ny5.m93079q(C34876Ny5.m93078r(uuid, shareOpenGraphContent), false), z);
            } catch (JSONException e) {
                throw new FacebookException("Unable to create a JSON Object from the provided ShareOpenGraphContent: " + e.getMessage());
            }
        } else if (shareContent instanceof ShareMediaContent) {
            ShareMediaContent shareMediaContent = (ShareMediaContent) shareContent;
            return m10084c(shareMediaContent, C34876Ny5.m93090f(shareMediaContent, uuid), z);
        } else if (shareContent instanceof ShareCameraEffectContent) {
            ShareCameraEffectContent shareCameraEffectContent = (ShareCameraEffectContent) shareContent;
            return m10086a(shareCameraEffectContent, C34876Ny5.m93086j(shareCameraEffectContent, uuid), z);
        } else if (shareContent instanceof ShareMessengerGenericTemplateContent) {
            return m10083d((ShareMessengerGenericTemplateContent) shareContent, z);
        } else {
            if (shareContent instanceof ShareMessengerOpenGraphMusicTemplateContent) {
                return m10081f((ShareMessengerOpenGraphMusicTemplateContent) shareContent, z);
            }
            if (shareContent instanceof ShareMessengerMediaTemplateContent) {
                return m10082e((ShareMessengerMediaTemplateContent) shareContent, z);
            }
            if (shareContent instanceof ShareStoryContent) {
                ShareStoryContent shareStoryContent = (ShareStoryContent) shareContent;
                return m10078i(shareStoryContent, C34876Ny5.m93092d(shareStoryContent, uuid), C34876Ny5.m93087i(shareStoryContent, uuid), z);
            }
            return null;
        }
    }

    /* renamed from: l */
    public static Bundle m10075l(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        C52364yi6.m2836h0(bundle, "LINK", shareContent.m52271a());
        C52364yi6.m2838g0(bundle, "PLACE", shareContent.m52268d());
        C52364yi6.m2838g0(bundle, "PAGE", shareContent.m52270b());
        C52364yi6.m2838g0(bundle, "REF", shareContent.m52267e());
        bundle.putBoolean("DATA_FAILURES_FATAL", z);
        List<String> m52269c = shareContent.m52269c();
        if (!C52364yi6.m2859S(m52269c)) {
            bundle.putStringArrayList("FRIENDS", new ArrayList<>(m52269c));
        }
        ShareHashtag m52266g = shareContent.m52266g();
        if (m52266g != null) {
            C52364yi6.m2838g0(bundle, "HASHTAG", m52266g.m52251a());
        }
        return bundle;
    }
}
