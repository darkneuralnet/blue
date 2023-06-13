package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import com.stripe.android.core.networking.AnalyticsRequestV2Factory;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p000.C31;
import p000.C48113rY2;
import p000.M80;
/* renamed from: Ky5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34174Ky5 extends AbstractC43476jj1<ShareContent, Object> {

    /* renamed from: h */
    public static final String f20476h = "Ky5";

    /* renamed from: i */
    public static final int f20477i = M80.EnumC5210c.Share.m95691a();

    /* renamed from: f */
    public boolean f20478f;

    /* renamed from: g */
    public boolean f20479g;

    /* renamed from: Ky5$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C4652a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20480a;

        static {
            int[] iArr = new int[EnumC4656d.values().length];
            f20480a = iArr;
            try {
                iArr[EnumC4656d.AUTOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20480a[EnumC4656d.WEB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20480a[EnumC4656d.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: Ky5$b */
    /* loaded from: classes5.dex */
    public class C4653b extends AbstractC43476jj1<ShareContent, Object>.AbstractC24996a {

        /* renamed from: Ky5$b$a */
        /* loaded from: classes5.dex */
        public class C4654a implements C31.InterfaceC0847a {

            /* renamed from: a */
            public final /* synthetic */ C7501Sh f20482a;

            /* renamed from: b */
            public final /* synthetic */ ShareContent f20483b;

            /* renamed from: c */
            public final /* synthetic */ boolean f20484c;

            public C4654a(C7501Sh c7501Sh, ShareContent shareContent, boolean z) {
                this.f20482a = c7501Sh;
                this.f20483b = shareContent;
                this.f20484c = z;
            }

            @Override // p000.C31.InterfaceC0847a
            /* renamed from: a */
            public Bundle mo23639a() {
                return C39979dp2.m43678e(this.f20482a.m85131a(), this.f20483b, this.f20484c);
            }

            @Override // p000.C31.InterfaceC0847a
            public Bundle getParameters() {
                return C49891uY2.m10076k(this.f20482a.m85131a(), this.f20483b, this.f20484c);
            }
        }

        public C4653b() {
            super();
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: c */
        public Object mo30026c() {
            return EnumC4656d.NATIVE;
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: d */
        public boolean mo23643a(ShareContent shareContent, boolean z) {
            if ((shareContent instanceof ShareCameraEffectContent) && C34174Ky5.m98019s(shareContent.getClass())) {
                return true;
            }
            return false;
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: e */
        public C7501Sh mo23642b(ShareContent shareContent) {
            C33940Jy5.m99437w(shareContent);
            C7501Sh mo23652e = C34174Ky5.this.mo23652e();
            C31.m112934i(mo23652e, new C4654a(mo23652e, shareContent, C34174Ky5.this.m98015w()), C34174Ky5.m98016v(shareContent.getClass()));
            return mo23652e;
        }

        public /* synthetic */ C4653b(C34174Ky5 c34174Ky5, C4652a c4652a) {
            this();
        }
    }

    /* renamed from: Ky5$c */
    /* loaded from: classes5.dex */
    public class C4655c extends AbstractC43476jj1<ShareContent, Object>.AbstractC24996a {
        public C4655c() {
            super();
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: c */
        public Object mo30026c() {
            return EnumC4656d.FEED;
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: d */
        public boolean mo23643a(ShareContent shareContent, boolean z) {
            return (shareContent instanceof ShareLinkContent) || (shareContent instanceof ShareFeedContent);
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: e */
        public C7501Sh mo23642b(ShareContent shareContent) {
            Bundle m73933e;
            C34174Ky5 c34174Ky5 = C34174Ky5.this;
            c34174Ky5.m98014x(c34174Ky5.m30031f(), shareContent, EnumC4656d.FEED);
            C7501Sh mo23652e = C34174Ky5.this.mo23652e();
            if (shareContent instanceof ShareLinkContent) {
                ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
                C33940Jy5.m99435y(shareLinkContent);
                m73933e = C37460Yz6.m73932f(shareLinkContent);
            } else {
                m73933e = C37460Yz6.m73933e((ShareFeedContent) shareContent);
            }
            C31.m112932k(mo23652e, "feed", m73933e);
            return mo23652e;
        }

        public /* synthetic */ C4655c(C34174Ky5 c34174Ky5, C4652a c4652a) {
            this();
        }
    }

    /* renamed from: Ky5$d */
    /* loaded from: classes5.dex */
    public enum EnumC4656d {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED
    }

    /* renamed from: Ky5$e */
    /* loaded from: classes5.dex */
    public class C4657e extends AbstractC43476jj1<ShareContent, Object>.AbstractC24996a {

        /* renamed from: Ky5$e$a */
        /* loaded from: classes5.dex */
        public class C4658a implements C31.InterfaceC0847a {

            /* renamed from: a */
            public final /* synthetic */ C7501Sh f20493a;

            /* renamed from: b */
            public final /* synthetic */ ShareContent f20494b;

            /* renamed from: c */
            public final /* synthetic */ boolean f20495c;

            public C4658a(C7501Sh c7501Sh, ShareContent shareContent, boolean z) {
                this.f20493a = c7501Sh;
                this.f20494b = shareContent;
                this.f20495c = z;
            }

            @Override // p000.C31.InterfaceC0847a
            /* renamed from: a */
            public Bundle mo23639a() {
                return C39979dp2.m43678e(this.f20493a.m85131a(), this.f20494b, this.f20495c);
            }

            @Override // p000.C31.InterfaceC0847a
            public Bundle getParameters() {
                return C49891uY2.m10076k(this.f20493a.m85131a(), this.f20494b, this.f20495c);
            }
        }

        public C4657e() {
            super();
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: c */
        public Object mo30026c() {
            return EnumC4656d.NATIVE;
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: d */
        public boolean mo23643a(ShareContent shareContent, boolean z) {
            boolean z2;
            if (shareContent == null || (shareContent instanceof ShareCameraEffectContent) || (shareContent instanceof ShareStoryContent)) {
                return false;
            }
            if (!z) {
                if (shareContent.m52266g() != null) {
                    z2 = C31.m112942a(EnumC34408Ly5.HASHTAG);
                } else {
                    z2 = true;
                }
                if ((shareContent instanceof ShareLinkContent) && !C52364yi6.m2860R(((ShareLinkContent) shareContent).m52240l())) {
                    z2 &= C31.m112942a(EnumC34408Ly5.LINK_SHARE_QUOTES);
                }
            } else {
                z2 = true;
            }
            if (!z2 || !C34174Ky5.m98019s(shareContent.getClass())) {
                return false;
            }
            return true;
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: e */
        public C7501Sh mo23642b(ShareContent shareContent) {
            C34174Ky5 c34174Ky5 = C34174Ky5.this;
            c34174Ky5.m98014x(c34174Ky5.m30031f(), shareContent, EnumC4656d.NATIVE);
            C33940Jy5.m99437w(shareContent);
            C7501Sh mo23652e = C34174Ky5.this.mo23652e();
            C31.m112934i(mo23652e, new C4658a(mo23652e, shareContent, C34174Ky5.this.m98015w()), C34174Ky5.m98016v(shareContent.getClass()));
            return mo23652e;
        }

        public /* synthetic */ C4657e(C34174Ky5 c34174Ky5, C4652a c4652a) {
            this();
        }
    }

    /* renamed from: Ky5$f */
    /* loaded from: classes5.dex */
    public class C4659f extends AbstractC43476jj1<ShareContent, Object>.AbstractC24996a {

        /* renamed from: Ky5$f$a */
        /* loaded from: classes5.dex */
        public class C4660a implements C31.InterfaceC0847a {

            /* renamed from: a */
            public final /* synthetic */ C7501Sh f20498a;

            /* renamed from: b */
            public final /* synthetic */ ShareContent f20499b;

            /* renamed from: c */
            public final /* synthetic */ boolean f20500c;

            public C4660a(C7501Sh c7501Sh, ShareContent shareContent, boolean z) {
                this.f20498a = c7501Sh;
                this.f20499b = shareContent;
                this.f20500c = z;
            }

            @Override // p000.C31.InterfaceC0847a
            /* renamed from: a */
            public Bundle mo23639a() {
                return C39979dp2.m43678e(this.f20498a.m85131a(), this.f20499b, this.f20500c);
            }

            @Override // p000.C31.InterfaceC0847a
            public Bundle getParameters() {
                return C49891uY2.m10076k(this.f20498a.m85131a(), this.f20499b, this.f20500c);
            }
        }

        public C4659f() {
            super();
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: c */
        public Object mo30026c() {
            return EnumC4656d.NATIVE;
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: d */
        public boolean mo23643a(ShareContent shareContent, boolean z) {
            if ((shareContent instanceof ShareStoryContent) && C34174Ky5.m98019s(shareContent.getClass())) {
                return true;
            }
            return false;
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: e */
        public C7501Sh mo23642b(ShareContent shareContent) {
            C33940Jy5.m99436x(shareContent);
            C7501Sh mo23652e = C34174Ky5.this.mo23652e();
            C31.m112934i(mo23652e, new C4660a(mo23652e, shareContent, C34174Ky5.this.m98015w()), C34174Ky5.m98016v(shareContent.getClass()));
            return mo23652e;
        }

        public /* synthetic */ C4659f(C34174Ky5 c34174Ky5, C4652a c4652a) {
            this();
        }
    }

    /* renamed from: Ky5$g */
    /* loaded from: classes5.dex */
    public class C4661g extends AbstractC43476jj1<ShareContent, Object>.AbstractC24996a {
        public C4661g() {
            super();
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: c */
        public Object mo30026c() {
            return EnumC4656d.WEB;
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: d */
        public boolean mo23643a(ShareContent shareContent, boolean z) {
            return shareContent != null && C34174Ky5.m98018t(shareContent);
        }

        /* renamed from: e */
        public final SharePhotoContent m98004e(SharePhotoContent sharePhotoContent, UUID uuid) {
            SharePhotoContent.C17359b m52152r = new SharePhotoContent.C17359b().m52152r(sharePhotoContent);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < sharePhotoContent.getPhotos().size(); i++) {
                SharePhoto sharePhoto = sharePhotoContent.getPhotos().get(i);
                Bitmap m52179c = sharePhoto.m52179c();
                if (m52179c != null) {
                    C48113rY2.C27946a m15786c = C48113rY2.m15786c(uuid, m52179c);
                    sharePhoto = new SharePhoto.C17357b().m52165m(sharePhoto).m52161q(Uri.parse(m15786c.m15776b())).m52163o(null).m52169i();
                    arrayList2.add(m15786c);
                }
                arrayList.add(sharePhoto);
            }
            m52152r.m52151s(arrayList);
            C48113rY2.m15788a(arrayList2);
            return m52152r.m52153q();
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: f */
        public C7501Sh mo23642b(ShareContent shareContent) {
            Bundle m73936b;
            C34174Ky5 c34174Ky5 = C34174Ky5.this;
            c34174Ky5.m98014x(c34174Ky5.m30031f(), shareContent, EnumC4656d.WEB);
            C7501Sh mo23652e = C34174Ky5.this.mo23652e();
            C33940Jy5.m99435y(shareContent);
            if (shareContent instanceof ShareLinkContent) {
                m73936b = C37460Yz6.m73937a((ShareLinkContent) shareContent);
            } else if (shareContent instanceof SharePhotoContent) {
                m73936b = C37460Yz6.m73935c(m98004e((SharePhotoContent) shareContent, mo23652e.m85131a()));
            } else {
                m73936b = C37460Yz6.m73936b((ShareOpenGraphContent) shareContent);
            }
            C31.m112932k(mo23652e, m98002g(shareContent), m73936b);
            return mo23652e;
        }

        /* renamed from: g */
        public final String m98002g(ShareContent shareContent) {
            if (!(shareContent instanceof ShareLinkContent) && !(shareContent instanceof SharePhotoContent)) {
                if (shareContent instanceof ShareOpenGraphContent) {
                    return "share_open_graph";
                }
                return null;
            }
            return "share";
        }

        public /* synthetic */ C4661g(C34174Ky5 c34174Ky5, C4652a c4652a) {
            this();
        }
    }

    public C34174Ky5(Activity activity, int i) {
        super(activity, i);
        this.f20478f = false;
        this.f20479g = true;
        C34876Ny5.m93081o(i);
    }

    /* renamed from: s */
    public static boolean m98019s(Class<? extends ShareContent> cls) {
        InterfaceC46640p31 m98016v = m98016v(cls);
        if (m98016v != null && C31.m112942a(m98016v)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static boolean m98018t(ShareContent shareContent) {
        if (!m98017u(shareContent.getClass())) {
            return false;
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            try {
                C34876Ny5.m93077s((ShareOpenGraphContent) shareContent);
                return true;
            } catch (Exception e) {
                C52364yi6.m2852Z(f20476h, "canShow returned false because the content of the Opem Graph object can't be shared via the web dialog", e);
                return false;
            }
        }
        return true;
    }

    /* renamed from: u */
    public static boolean m98017u(Class<? extends ShareContent> cls) {
        if (!ShareLinkContent.class.isAssignableFrom(cls) && !ShareOpenGraphContent.class.isAssignableFrom(cls) && (!SharePhotoContent.class.isAssignableFrom(cls) || !AccessToken.m52909o())) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static InterfaceC46640p31 m98016v(Class<? extends ShareContent> cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return EnumC34408Ly5.SHARE_DIALOG;
        }
        if (SharePhotoContent.class.isAssignableFrom(cls)) {
            return EnumC34408Ly5.PHOTOS;
        }
        if (ShareVideoContent.class.isAssignableFrom(cls)) {
            return EnumC34408Ly5.VIDEO;
        }
        if (ShareOpenGraphContent.class.isAssignableFrom(cls)) {
            return EnumC36125Th3.OG_ACTION_DIALOG;
        }
        if (ShareMediaContent.class.isAssignableFrom(cls)) {
            return EnumC34408Ly5.MULTIMEDIA;
        }
        if (ShareCameraEffectContent.class.isAssignableFrom(cls)) {
            return EnumC52881zb0.SHARE_CAMERA_EFFECT;
        }
        if (ShareStoryContent.class.isAssignableFrom(cls)) {
            return EnumC35812Ry5.SHARE_STORY_ASSET;
        }
        return null;
    }

    @Override // p000.AbstractC43476jj1
    /* renamed from: e */
    public C7501Sh mo23652e() {
        return new C7501Sh(m30030h());
    }

    @Override // p000.AbstractC43476jj1
    /* renamed from: g */
    public List<AbstractC43476jj1<ShareContent, Object>.AbstractC24996a> mo23651g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C4657e(this, null));
        arrayList.add(new C4655c(this, null));
        arrayList.add(new C4661g(this, null));
        arrayList.add(new C4653b(this, null));
        arrayList.add(new C4659f(this, null));
        return arrayList;
    }

    /* renamed from: w */
    public boolean m98015w() {
        return this.f20478f;
    }

    /* renamed from: x */
    public final void m98014x(Context context, ShareContent shareContent, EnumC4656d enumC4656d) {
        String str;
        if (this.f20479g) {
            enumC4656d = EnumC4656d.AUTOMATIC;
        }
        int i = C4652a.f20480a[enumC4656d.ordinal()];
        String str2 = "unknown";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "unknown";
                } else {
                    str = AnalyticsRequestV2Factory.PLUGIN_NATIVE;
                }
            } else {
                str = "web";
            }
        } else {
            str = "automatic";
        }
        InterfaceC46640p31 m98016v = m98016v(shareContent.getClass());
        if (m98016v == EnumC34408Ly5.SHARE_DIALOG) {
            str2 = "status";
        } else if (m98016v == EnumC34408Ly5.PHOTOS) {
            str2 = "photo";
        } else if (m98016v == EnumC34408Ly5.VIDEO) {
            str2 = "video";
        } else if (m98016v == EnumC36125Th3.OG_ACTION_DIALOG) {
            str2 = "open_graph";
        }
        C45485n62 c45485n62 = new C45485n62(context);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString("fb_share_dialog_content_type", str2);
        c45485n62.m24338h("fb_share_dialog_show", bundle);
    }

    public C34174Ky5(Fragment fragment, int i) {
        this(new C33702Iy1(fragment), i);
    }

    public C34174Ky5(android.app.Fragment fragment, int i) {
        this(new C33702Iy1(fragment), i);
    }

    public C34174Ky5(C33702Iy1 c33702Iy1, int i) {
        super(c33702Iy1, i);
        this.f20478f = false;
        this.f20479g = true;
        C34876Ny5.m93081o(i);
    }
}
