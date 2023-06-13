package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.C17216a;
import com.facebook.FacebookException;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.List;
import java.util.Locale;
/* renamed from: Jy5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C33940Jy5 {

    /* renamed from: a */
    public static C4286c f18867a;

    /* renamed from: b */
    public static C4286c f18868b;

    /* renamed from: c */
    public static C4286c f18869c;

    /* renamed from: Jy5$b */
    /* loaded from: classes5.dex */
    public static class C4285b extends C4286c {
        private C4285b() {
            super();
        }

        @Override // p000.C33940Jy5.C4286c
        /* renamed from: o */
        public void mo99421o(ShareStoryContent shareStoryContent) {
            C33940Jy5.m99462S(shareStoryContent, this);
        }
    }

    /* renamed from: Jy5$c */
    /* loaded from: classes5.dex */
    public static class C4286c {

        /* renamed from: a */
        public boolean f18870a;

        private C4286c() {
            this.f18870a = false;
        }

        /* renamed from: a */
        public boolean m99433a() {
            return this.f18870a;
        }

        /* renamed from: b */
        public void m99432b(ShareCameraEffectContent shareCameraEffectContent) {
            C33940Jy5.m99439u(shareCameraEffectContent, this);
        }

        /* renamed from: c */
        public void m99431c(ShareLinkContent shareLinkContent) {
            C33940Jy5.m99434z(shareLinkContent, this);
        }

        /* renamed from: d */
        public void m99430d(ShareMedia shareMedia) {
            C33940Jy5.m99479B(shareMedia, this);
        }

        /* renamed from: e */
        public void mo99419e(ShareMediaContent shareMediaContent) {
            C33940Jy5.m99480A(shareMediaContent, this);
        }

        /* renamed from: f */
        public void m99429f(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
            C33940Jy5.m99465P(shareMessengerGenericTemplateContent);
        }

        /* renamed from: g */
        public void m99428g(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
            C33940Jy5.m99464Q(shareMessengerMediaTemplateContent);
        }

        /* renamed from: h */
        public void m99427h(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
            C33940Jy5.m99478C(shareMessengerOpenGraphMusicTemplateContent);
        }

        /* renamed from: i */
        public void m99426i(ShareOpenGraphAction shareOpenGraphAction) {
            C33940Jy5.m99477D(shareOpenGraphAction, this);
        }

        /* renamed from: j */
        public void m99425j(ShareOpenGraphContent shareOpenGraphContent) {
            this.f18870a = true;
            C33940Jy5.m99476E(shareOpenGraphContent, this);
        }

        /* renamed from: k */
        public void m99424k(ShareOpenGraphObject shareOpenGraphObject) {
            C33940Jy5.m99474G(shareOpenGraphObject, this);
        }

        /* renamed from: l */
        public void m99423l(ShareOpenGraphValueContainer shareOpenGraphValueContainer, boolean z) {
            C33940Jy5.m99473H(shareOpenGraphValueContainer, this, z);
        }

        /* renamed from: m */
        public void mo99418m(SharePhoto sharePhoto) {
            C33940Jy5.m99468M(sharePhoto, this);
        }

        /* renamed from: n */
        public void m99422n(SharePhotoContent sharePhotoContent) {
            C33940Jy5.m99470K(sharePhotoContent, this);
        }

        /* renamed from: o */
        public void mo99421o(ShareStoryContent shareStoryContent) {
            C33940Jy5.m99462S(shareStoryContent, this);
        }

        /* renamed from: p */
        public void m99420p(ShareVideo shareVideo) {
            C33940Jy5.m99461T(shareVideo, this);
        }

        /* renamed from: q */
        public void mo99417q(ShareVideoContent shareVideoContent) {
            C33940Jy5.m99460U(shareVideoContent, this);
        }
    }

    /* renamed from: Jy5$d */
    /* loaded from: classes5.dex */
    public static class C4287d extends C4286c {
        private C4287d() {
            super();
        }

        @Override // p000.C33940Jy5.C4286c
        /* renamed from: e */
        public void mo99419e(ShareMediaContent shareMediaContent) {
            throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
        }

        @Override // p000.C33940Jy5.C4286c
        /* renamed from: m */
        public void mo99418m(SharePhoto sharePhoto) {
            C33940Jy5.m99467N(sharePhoto, this);
        }

        @Override // p000.C33940Jy5.C4286c
        /* renamed from: q */
        public void mo99417q(ShareVideoContent shareVideoContent) {
            throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
        }
    }

    /* renamed from: A */
    public static void m99480A(ShareMediaContent shareMediaContent, C4286c c4286c) {
        List<ShareMedia> m52232i = shareMediaContent.m52232i();
        if (m52232i != null && !m52232i.isEmpty()) {
            if (m52232i.size() <= 6) {
                for (ShareMedia shareMedia : m52232i) {
                    c4286c.m99430d(shareMedia);
                }
                return;
            }
            throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d media.", 6));
        }
        throw new FacebookException("Must specify at least one medium in ShareMediaContent.");
    }

    /* renamed from: B */
    public static void m99479B(ShareMedia shareMedia, C4286c c4286c) {
        if (shareMedia instanceof SharePhoto) {
            c4286c.mo99418m((SharePhoto) shareMedia);
        } else if (shareMedia instanceof ShareVideo) {
            c4286c.m99420p((ShareVideo) shareMedia);
        } else {
            throw new FacebookException(String.format(Locale.ROOT, "Invalid media type: %s", shareMedia.getClass().getSimpleName()));
        }
    }

    /* renamed from: C */
    public static void m99478C(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
        if (!C52364yi6.m2860R(shareMessengerOpenGraphMusicTemplateContent.m52270b())) {
            if (shareMessengerOpenGraphMusicTemplateContent.m52209j() != null) {
                m99466O(shareMessengerOpenGraphMusicTemplateContent.m52210i());
                return;
            }
            throw new FacebookException("Must specify url for ShareMessengerOpenGraphMusicTemplateContent");
        }
        throw new FacebookException("Must specify Page Id for ShareMessengerOpenGraphMusicTemplateContent");
    }

    /* renamed from: D */
    public static void m99477D(ShareOpenGraphAction shareOpenGraphAction, C4286c c4286c) {
        if (shareOpenGraphAction != null) {
            if (!C52364yi6.m2860R(shareOpenGraphAction.m52199e())) {
                c4286c.m99423l(shareOpenGraphAction, false);
                return;
            }
            throw new FacebookException("ShareOpenGraphAction must have a non-empty actionType");
        }
        throw new FacebookException("Must specify a non-null ShareOpenGraphAction");
    }

    /* renamed from: E */
    public static void m99476E(ShareOpenGraphContent shareOpenGraphContent, C4286c c4286c) {
        c4286c.m99426i(shareOpenGraphContent.m52192i());
        String m52191j = shareOpenGraphContent.m52191j();
        if (!C52364yi6.m2860R(m52191j)) {
            if (shareOpenGraphContent.m52192i().m52186a(m52191j) != null) {
                return;
            }
            throw new FacebookException("Property \"" + m52191j + "\" was not found on the action. The name of the preview property must match the name of an action property.");
        }
        throw new FacebookException("Must specify a previewPropertyName.");
    }

    /* renamed from: F */
    public static void m99475F(String str, boolean z) {
        if (!z) {
            return;
        }
        String[] split = str.split(":");
        if (split.length >= 2) {
            for (String str2 : split) {
                if (str2.isEmpty()) {
                    throw new FacebookException("Invalid key found in Open Graph dictionary: %s", str);
                }
            }
            return;
        }
        throw new FacebookException("Open Graph keys must be namespaced: %s", str);
    }

    /* renamed from: G */
    public static void m99474G(ShareOpenGraphObject shareOpenGraphObject, C4286c c4286c) {
        if (shareOpenGraphObject != null) {
            c4286c.m99423l(shareOpenGraphObject, true);
            return;
        }
        throw new FacebookException("Cannot share a null ShareOpenGraphObject");
    }

    /* renamed from: H */
    public static void m99473H(ShareOpenGraphValueContainer shareOpenGraphValueContainer, C4286c c4286c, boolean z) {
        for (String str : shareOpenGraphValueContainer.m52183d()) {
            m99475F(str, z);
            Object m52186a = shareOpenGraphValueContainer.m52186a(str);
            if (m52186a instanceof List) {
                for (Object obj : (List) m52186a) {
                    if (obj != null) {
                        m99472I(obj, c4286c);
                    } else {
                        throw new FacebookException("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
                    }
                }
                continue;
            } else {
                m99472I(m52186a, c4286c);
            }
        }
    }

    /* renamed from: I */
    public static void m99472I(Object obj, C4286c c4286c) {
        if (obj instanceof ShareOpenGraphObject) {
            c4286c.m99424k((ShareOpenGraphObject) obj);
        } else if (obj instanceof SharePhoto) {
            c4286c.mo99418m((SharePhoto) obj);
        }
    }

    /* renamed from: J */
    public static void m99471J(SharePhoto sharePhoto) {
        if (sharePhoto != null) {
            Bitmap m52179c = sharePhoto.m52179c();
            Uri m52177e = sharePhoto.m52177e();
            if (m52179c == null && m52177e == null) {
                throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
            return;
        }
        throw new FacebookException("Cannot share a null SharePhoto");
    }

    /* renamed from: K */
    public static void m99470K(SharePhotoContent sharePhotoContent, C4286c c4286c) {
        List<SharePhoto> photos = sharePhotoContent.getPhotos();
        if (photos != null && !photos.isEmpty()) {
            if (photos.size() <= 6) {
                for (SharePhoto sharePhoto : photos) {
                    c4286c.mo99418m(sharePhoto);
                }
                return;
            }
            throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d photos.", 6));
        }
        throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
    }

    /* renamed from: L */
    public static void m99469L(SharePhoto sharePhoto, C4286c c4286c) {
        m99471J(sharePhoto);
        Bitmap m52179c = sharePhoto.m52179c();
        Uri m52177e = sharePhoto.m52177e();
        if (m52179c == null && C52364yi6.m2858T(m52177e) && !c4286c.m99433a()) {
            throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
        }
    }

    /* renamed from: M */
    public static void m99468M(SharePhoto sharePhoto, C4286c c4286c) {
        m99469L(sharePhoto, c4286c);
        if (sharePhoto.m52179c() != null || !C52364yi6.m2858T(sharePhoto.m52177e())) {
            C48817sj6.m13774d(C17216a.m52741e());
        }
    }

    /* renamed from: N */
    public static void m99467N(SharePhoto sharePhoto, C4286c c4286c) {
        m99471J(sharePhoto);
    }

    /* renamed from: O */
    public static void m99466O(ShareMessengerActionButton shareMessengerActionButton) {
        if (shareMessengerActionButton == null) {
            return;
        }
        if (!C52364yi6.m2860R(shareMessengerActionButton.m52229a())) {
            if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
                m99463R((ShareMessengerURLActionButton) shareMessengerActionButton);
                return;
            }
            return;
        }
        throw new FacebookException("Must specify title for ShareMessengerActionButton");
    }

    /* renamed from: P */
    public static void m99465P(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
        if (!C52364yi6.m2860R(shareMessengerGenericTemplateContent.m52270b())) {
            if (shareMessengerGenericTemplateContent.m52228i() != null) {
                if (!C52364yi6.m2860R(shareMessengerGenericTemplateContent.m52228i().m52219e())) {
                    m99466O(shareMessengerGenericTemplateContent.m52228i().m52223a());
                    return;
                }
                throw new FacebookException("Must specify title for ShareMessengerGenericTemplateElement");
            }
            throw new FacebookException("Must specify element for ShareMessengerGenericTemplateContent");
        }
        throw new FacebookException("Must specify Page Id for ShareMessengerGenericTemplateContent");
    }

    /* renamed from: Q */
    public static void m99464Q(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        if (!C52364yi6.m2860R(shareMessengerMediaTemplateContent.m52270b())) {
            if (shareMessengerMediaTemplateContent.m52213l() == null && C52364yi6.m2860R(shareMessengerMediaTemplateContent.m52216i())) {
                throw new FacebookException("Must specify either attachmentId or mediaURL for ShareMessengerMediaTemplateContent");
            }
            m99466O(shareMessengerMediaTemplateContent.m52215j());
            return;
        }
        throw new FacebookException("Must specify Page Id for ShareMessengerMediaTemplateContent");
    }

    /* renamed from: R */
    public static void m99463R(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (shareMessengerURLActionButton.m52203e() != null) {
            return;
        }
        throw new FacebookException("Must specify url for ShareMessengerURLActionButton");
    }

    /* renamed from: S */
    public static void m99462S(ShareStoryContent shareStoryContent, C4286c c4286c) {
        if (shareStoryContent != null && (shareStoryContent.m52148j() != null || shareStoryContent.m52146l() != null)) {
            if (shareStoryContent.m52148j() != null) {
                c4286c.m99430d(shareStoryContent.m52148j());
            }
            if (shareStoryContent.m52146l() != null) {
                c4286c.mo99418m(shareStoryContent.m52146l());
                return;
            }
            return;
        }
        throw new FacebookException("Must pass the Facebook app a background asset, a sticker asset, or both");
    }

    /* renamed from: T */
    public static void m99461T(ShareVideo shareVideo, C4286c c4286c) {
        if (shareVideo != null) {
            Uri m52142c = shareVideo.m52142c();
            if (m52142c != null) {
                if (!C52364yi6.m2864N(m52142c) && !C52364yi6.m2861Q(m52142c)) {
                    throw new FacebookException("ShareVideo must reference a video that is on the device");
                }
                return;
            }
            throw new FacebookException("ShareVideo does not have a LocalUrl specified");
        }
        throw new FacebookException("Cannot share a null ShareVideo");
    }

    /* renamed from: U */
    public static void m99460U(ShareVideoContent shareVideoContent, C4286c c4286c) {
        c4286c.m99420p(shareVideoContent.m52131l());
        SharePhoto m52132k = shareVideoContent.m52132k();
        if (m52132k != null) {
            c4286c.mo99418m(m52132k);
        }
    }

    /* renamed from: q */
    public static C4286c m99443q() {
        if (f18868b == null) {
            f18868b = new C4286c();
        }
        return f18868b;
    }

    /* renamed from: r */
    public static C4286c m99442r() {
        if (f18869c == null) {
            f18869c = new C4285b();
        }
        return f18869c;
    }

    /* renamed from: s */
    public static C4286c m99441s() {
        if (f18867a == null) {
            f18867a = new C4287d();
        }
        return f18867a;
    }

    /* renamed from: t */
    public static void m99440t(ShareContent shareContent, C4286c c4286c) throws FacebookException {
        if (shareContent != null) {
            if (shareContent instanceof ShareLinkContent) {
                c4286c.m99431c((ShareLinkContent) shareContent);
                return;
            } else if (shareContent instanceof SharePhotoContent) {
                c4286c.m99422n((SharePhotoContent) shareContent);
                return;
            } else if (shareContent instanceof ShareVideoContent) {
                c4286c.mo99417q((ShareVideoContent) shareContent);
                return;
            } else if (shareContent instanceof ShareOpenGraphContent) {
                c4286c.m99425j((ShareOpenGraphContent) shareContent);
                return;
            } else if (shareContent instanceof ShareMediaContent) {
                c4286c.mo99419e((ShareMediaContent) shareContent);
                return;
            } else if (shareContent instanceof ShareCameraEffectContent) {
                c4286c.m99432b((ShareCameraEffectContent) shareContent);
                return;
            } else if (shareContent instanceof ShareMessengerOpenGraphMusicTemplateContent) {
                c4286c.m99427h((ShareMessengerOpenGraphMusicTemplateContent) shareContent);
                return;
            } else if (shareContent instanceof ShareMessengerMediaTemplateContent) {
                c4286c.m99428g((ShareMessengerMediaTemplateContent) shareContent);
                return;
            } else if (shareContent instanceof ShareMessengerGenericTemplateContent) {
                c4286c.m99429f((ShareMessengerGenericTemplateContent) shareContent);
                return;
            } else if (shareContent instanceof ShareStoryContent) {
                c4286c.mo99421o((ShareStoryContent) shareContent);
                return;
            } else {
                return;
            }
        }
        throw new FacebookException("Must provide non-null content to share");
    }

    /* renamed from: u */
    public static void m99439u(ShareCameraEffectContent shareCameraEffectContent, C4286c c4286c) {
        if (!C52364yi6.m2860R(shareCameraEffectContent.m52275j())) {
            return;
        }
        throw new FacebookException("Must specify a non-empty effectId");
    }

    /* renamed from: v */
    public static void m99438v(ShareContent shareContent) {
        m99440t(shareContent, m99443q());
    }

    /* renamed from: w */
    public static void m99437w(ShareContent shareContent) {
        m99440t(shareContent, m99443q());
    }

    /* renamed from: x */
    public static void m99436x(ShareContent shareContent) {
        m99440t(shareContent, m99442r());
    }

    /* renamed from: y */
    public static void m99435y(ShareContent shareContent) {
        m99440t(shareContent, m99441s());
    }

    /* renamed from: z */
    public static void m99434z(ShareLinkContent shareLinkContent, C4286c c4286c) {
        Uri m52241k = shareLinkContent.m52241k();
        if (m52241k != null && !C52364yi6.m2858T(m52241k)) {
            throw new FacebookException("Image Url must be an http:// or https:// url");
        }
    }
}
