package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import java.util.ArrayList;
import java.util.List;
import p000.C31;
import p000.M80;
@Deprecated
/* renamed from: nT2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45696nT2 extends AbstractC43476jj1<ShareContent, Object> {

    /* renamed from: g */
    public static final int f100004g = M80.EnumC5210c.Message.m95691a();

    /* renamed from: f */
    public boolean f100005f;

    /* renamed from: nT2$b */
    /* loaded from: classes5.dex */
    public class C26523b extends AbstractC43476jj1<ShareContent, Object>.AbstractC24996a {

        /* renamed from: nT2$b$a */
        /* loaded from: classes5.dex */
        public class C26524a implements C31.InterfaceC0847a {

            /* renamed from: a */
            public final /* synthetic */ C7501Sh f100007a;

            /* renamed from: b */
            public final /* synthetic */ ShareContent f100008b;

            /* renamed from: c */
            public final /* synthetic */ boolean f100009c;

            public C26524a(C7501Sh c7501Sh, ShareContent shareContent, boolean z) {
                this.f100007a = c7501Sh;
                this.f100008b = shareContent;
                this.f100009c = z;
            }

            @Override // p000.C31.InterfaceC0847a
            /* renamed from: a */
            public Bundle mo23639a() {
                return C39979dp2.m43678e(this.f100007a.m85131a(), this.f100008b, this.f100009c);
            }

            @Override // p000.C31.InterfaceC0847a
            public Bundle getParameters() {
                return C49891uY2.m10076k(this.f100007a.m85131a(), this.f100008b, this.f100009c);
            }
        }

        public C26523b() {
            super();
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: d */
        public boolean mo23643a(ShareContent shareContent, boolean z) {
            return shareContent != null && C45696nT2.m23647o(shareContent.getClass());
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: e */
        public C7501Sh mo23642b(ShareContent shareContent) {
            C33940Jy5.m99438v(shareContent);
            C7501Sh mo23652e = C45696nT2.this.mo23652e();
            boolean m23645q = C45696nT2.this.m23645q();
            C45696nT2.m23644r(C45696nT2.this.m30031f(), shareContent, mo23652e);
            C31.m112934i(mo23652e, new C26524a(mo23652e, shareContent, m23645q), C45696nT2.m23646p(shareContent.getClass()));
            return mo23652e;
        }
    }

    public C45696nT2(Activity activity, int i) {
        super(activity, i);
        this.f100005f = false;
        C34876Ny5.m93081o(i);
    }

    /* renamed from: o */
    public static boolean m23647o(Class<? extends ShareContent> cls) {
        InterfaceC46640p31 m23646p = m23646p(cls);
        if (m23646p != null && C31.m112942a(m23646p)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static InterfaceC46640p31 m23646p(Class<? extends ShareContent> cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return EnumC46289oT2.MESSAGE_DIALOG;
        }
        if (ShareMessengerGenericTemplateContent.class.isAssignableFrom(cls)) {
            return EnumC46289oT2.MESSENGER_GENERIC_TEMPLATE;
        }
        if (ShareMessengerOpenGraphMusicTemplateContent.class.isAssignableFrom(cls)) {
            return EnumC46289oT2.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE;
        }
        if (ShareMessengerMediaTemplateContent.class.isAssignableFrom(cls)) {
            return EnumC46289oT2.MESSENGER_MEDIA_TEMPLATE;
        }
        return null;
    }

    /* renamed from: r */
    public static void m23644r(Context context, ShareContent shareContent, C7501Sh c7501Sh) {
        String str;
        InterfaceC46640p31 m23646p = m23646p(shareContent.getClass());
        if (m23646p == EnumC46289oT2.MESSAGE_DIALOG) {
            str = "status";
        } else if (m23646p == EnumC46289oT2.MESSENGER_GENERIC_TEMPLATE) {
            str = "GenericTemplate";
        } else if (m23646p == EnumC46289oT2.MESSENGER_MEDIA_TEMPLATE) {
            str = "MediaTemplate";
        } else if (m23646p == EnumC46289oT2.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE) {
            str = "OpenGraphMusicTemplate";
        } else {
            str = "unknown";
        }
        C45485n62 c45485n62 = new C45485n62(context);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_content_type", str);
        bundle.putString("fb_share_dialog_content_uuid", c7501Sh.m85131a().toString());
        bundle.putString("fb_share_dialog_content_page_id", shareContent.m52270b());
        c45485n62.m24338h("fb_messenger_share_dialog_show", bundle);
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
        arrayList.add(new C26523b());
        return arrayList;
    }

    /* renamed from: q */
    public boolean m23645q() {
        return this.f100005f;
    }

    public C45696nT2(Fragment fragment, int i) {
        this(new C33702Iy1(fragment), i);
    }

    public C45696nT2(android.app.Fragment fragment, int i) {
        this(new C33702Iy1(fragment), i);
    }

    public C45696nT2(C33702Iy1 c33702Iy1, int i) {
        super(c33702Iy1, i);
        this.f100005f = false;
        C34876Ny5.m93081o(i);
    }
}
