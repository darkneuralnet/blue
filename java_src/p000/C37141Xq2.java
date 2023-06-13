package p000;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.facebook.share.internal.LikeContent;
import java.util.ArrayList;
import java.util.List;
import p000.C31;
import p000.M80;
@Deprecated
/* renamed from: Xq2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C37141Xq2 extends AbstractC43476jj1<LikeContent, Object> {

    /* renamed from: f */
    public static final int f44058f = M80.EnumC5210c.Like.m95691a();

    /* renamed from: Xq2$a */
    /* loaded from: classes5.dex */
    public class C9530a extends AbstractC43476jj1<LikeContent, Object>.AbstractC24996a {

        /* renamed from: Xq2$a$a */
        /* loaded from: classes5.dex */
        public class C9531a implements C31.InterfaceC0847a {

            /* renamed from: a */
            public final /* synthetic */ LikeContent f44060a;

            public C9531a(LikeContent likeContent) {
                this.f44060a = likeContent;
            }

            @Override // p000.C31.InterfaceC0847a
            /* renamed from: a */
            public Bundle mo23639a() {
                Log.e("LikeDialog", "Attempting to present the Like Dialog with an outdated Facebook app on the device");
                return new Bundle();
            }

            @Override // p000.C31.InterfaceC0847a
            public Bundle getParameters() {
                return C37141Xq2.m76220p(this.f44060a);
            }
        }

        public C9530a() {
            super();
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: d */
        public boolean mo23643a(LikeContent likeContent, boolean z) {
            return false;
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: e */
        public C7501Sh mo23642b(LikeContent likeContent) {
            C7501Sh mo23652e = C37141Xq2.this.mo23652e();
            C31.m112934i(mo23652e, new C9531a(likeContent), C37141Xq2.m76219q());
            return mo23652e;
        }

        public /* synthetic */ C9530a(C37141Xq2 c37141Xq2, C36907Wq2 c36907Wq2) {
            this();
        }
    }

    /* renamed from: Xq2$b */
    /* loaded from: classes5.dex */
    public class C9532b extends AbstractC43476jj1<LikeContent, Object>.AbstractC24996a {
        public C9532b() {
            super();
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: d */
        public boolean mo23643a(LikeContent likeContent, boolean z) {
            return false;
        }

        @Override // p000.AbstractC43476jj1.AbstractC24996a
        /* renamed from: e */
        public C7501Sh mo23642b(LikeContent likeContent) {
            C7501Sh mo23652e = C37141Xq2.this.mo23652e();
            C31.m112931l(mo23652e, C37141Xq2.m76220p(likeContent), C37141Xq2.m76219q());
            return mo23652e;
        }

        public /* synthetic */ C9532b(C37141Xq2 c37141Xq2, C36907Wq2 c36907Wq2) {
            this();
        }
    }

    @Deprecated
    public C37141Xq2(Activity activity) {
        super(activity, f44058f);
    }

    @Deprecated
    /* renamed from: n */
    public static boolean m76222n() {
        return false;
    }

    @Deprecated
    /* renamed from: o */
    public static boolean m76221o() {
        return false;
    }

    /* renamed from: p */
    public static Bundle m76220p(LikeContent likeContent) {
        Bundle bundle = new Bundle();
        bundle.putString("object_id", likeContent.m52396a());
        bundle.putString("object_type", likeContent.m52395b());
        return bundle;
    }

    /* renamed from: q */
    public static InterfaceC46640p31 m76219q() {
        return EnumC37375Yq2.LIKE_DIALOG;
    }

    @Override // p000.AbstractC43476jj1
    /* renamed from: e */
    public C7501Sh mo23652e() {
        return new C7501Sh(m30030h());
    }

    @Override // p000.AbstractC43476jj1
    /* renamed from: g */
    public List<AbstractC43476jj1<LikeContent, Object>.AbstractC24996a> mo23651g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C9530a(this, null));
        arrayList.add(new C9532b(this, null));
        return arrayList;
    }

    @Override // p000.AbstractC43476jj1
    @Deprecated
    /* renamed from: r */
    public void mo30029i(LikeContent likeContent) {
    }

    @Deprecated
    public C37141Xq2(C33702Iy1 c33702Iy1) {
        super(c33702Iy1, f44058f);
    }
}
