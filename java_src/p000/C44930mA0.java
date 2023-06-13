package p000;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Objects;
/* renamed from: mA0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44930mA0 {

    /* renamed from: a */
    public final InterfaceC25928f f97467a;

    /* renamed from: mA0$a */
    /* loaded from: classes.dex */
    public static final class C25923a {

        /* renamed from: a */
        public final InterfaceC25925c f97468a;

        public C25923a(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f97468a = new C25924b(clipData, i);
            } else {
                this.f97468a = new C25926d(clipData, i);
            }
        }

        /* renamed from: a */
        public C44930mA0 m26214a() {
            return this.f97468a.build();
        }

        /* renamed from: b */
        public C25923a m26213b(Bundle bundle) {
            this.f97468a.setExtras(bundle);
            return this;
        }

        /* renamed from: c */
        public C25923a m26212c(int i) {
            this.f97468a.mo26209b(i);
            return this;
        }

        /* renamed from: d */
        public C25923a m26211d(Uri uri) {
            this.f97468a.mo26210a(uri);
            return this;
        }
    }

    /* renamed from: mA0$b */
    /* loaded from: classes.dex */
    public static final class C25924b implements InterfaceC25925c {

        /* renamed from: a */
        public final ContentInfo.Builder f97469a;

        public C25924b(ClipData clipData, int i) {
            C47302qA0.m18034a();
            this.f97469a = C46709pA0.m19854a(clipData, i);
        }

        @Override // p000.C44930mA0.InterfaceC25925c
        /* renamed from: a */
        public void mo26210a(Uri uri) {
            this.f97469a.setLinkUri(uri);
        }

        @Override // p000.C44930mA0.InterfaceC25925c
        /* renamed from: b */
        public void mo26209b(int i) {
            this.f97469a.setFlags(i);
        }

        @Override // p000.C44930mA0.InterfaceC25925c
        public C44930mA0 build() {
            ContentInfo build;
            build = this.f97469a.build();
            return new C44930mA0(new C25927e(build));
        }

        @Override // p000.C44930mA0.InterfaceC25925c
        public void setExtras(Bundle bundle) {
            this.f97469a.setExtras(bundle);
        }
    }

    /* renamed from: mA0$c */
    /* loaded from: classes.dex */
    public interface InterfaceC25925c {
        /* renamed from: a */
        void mo26210a(Uri uri);

        /* renamed from: b */
        void mo26209b(int i);

        C44930mA0 build();

        void setExtras(Bundle bundle);
    }

    /* renamed from: mA0$d */
    /* loaded from: classes.dex */
    public static final class C25926d implements InterfaceC25925c {

        /* renamed from: a */
        public ClipData f97470a;

        /* renamed from: b */
        public int f97471b;

        /* renamed from: c */
        public int f97472c;

        /* renamed from: d */
        public Uri f97473d;

        /* renamed from: e */
        public Bundle f97474e;

        public C25926d(ClipData clipData, int i) {
            this.f97470a = clipData;
            this.f97471b = i;
        }

        @Override // p000.C44930mA0.InterfaceC25925c
        /* renamed from: a */
        public void mo26210a(Uri uri) {
            this.f97473d = uri;
        }

        @Override // p000.C44930mA0.InterfaceC25925c
        /* renamed from: b */
        public void mo26209b(int i) {
            this.f97472c = i;
        }

        @Override // p000.C44930mA0.InterfaceC25925c
        public C44930mA0 build() {
            return new C44930mA0(new C25929g(this));
        }

        @Override // p000.C44930mA0.InterfaceC25925c
        public void setExtras(Bundle bundle) {
            this.f97474e = bundle;
        }
    }

    /* renamed from: mA0$e */
    /* loaded from: classes.dex */
    public static final class C25927e implements InterfaceC25928f {

        /* renamed from: a */
        public final ContentInfo f97475a;

        public C25927e(ContentInfo contentInfo) {
            this.f97475a = C44337lA0.m27722a(HZ3.m103731g(contentInfo));
        }

        @Override // p000.C44930mA0.InterfaceC25928f
        /* renamed from: a */
        public ClipData mo26208a() {
            ClipData clip;
            clip = this.f97475a.getClip();
            return clip;
        }

        @Override // p000.C44930mA0.InterfaceC25928f
        public int getSource() {
            int source;
            source = this.f97475a.getSource();
            return source;
        }

        @Override // p000.C44930mA0.InterfaceC25928f
        /* renamed from: k */
        public int mo26207k() {
            int flags;
            flags = this.f97475a.getFlags();
            return flags;
        }

        @Override // p000.C44930mA0.InterfaceC25928f
        /* renamed from: l */
        public ContentInfo mo26206l() {
            return this.f97475a;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f97475a + "}";
        }
    }

    /* renamed from: mA0$f */
    /* loaded from: classes.dex */
    public interface InterfaceC25928f {
        /* renamed from: a */
        ClipData mo26208a();

        int getSource();

        /* renamed from: k */
        int mo26207k();

        /* renamed from: l */
        ContentInfo mo26206l();
    }

    /* renamed from: mA0$g */
    /* loaded from: classes.dex */
    public static final class C25929g implements InterfaceC25928f {

        /* renamed from: a */
        public final ClipData f97476a;

        /* renamed from: b */
        public final int f97477b;

        /* renamed from: c */
        public final int f97478c;

        /* renamed from: d */
        public final Uri f97479d;

        /* renamed from: e */
        public final Bundle f97480e;

        public C25929g(C25926d c25926d) {
            this.f97476a = (ClipData) HZ3.m103731g(c25926d.f97470a);
            this.f97477b = HZ3.m103735c(c25926d.f97471b, 0, 5, Stripe3ds2AuthParams.FIELD_SOURCE);
            this.f97478c = HZ3.m103732f(c25926d.f97472c, 1);
            this.f97479d = c25926d.f97473d;
            this.f97480e = c25926d.f97474e;
        }

        @Override // p000.C44930mA0.InterfaceC25928f
        /* renamed from: a */
        public ClipData mo26208a() {
            return this.f97476a;
        }

        @Override // p000.C44930mA0.InterfaceC25928f
        public int getSource() {
            return this.f97477b;
        }

        @Override // p000.C44930mA0.InterfaceC25928f
        /* renamed from: k */
        public int mo26207k() {
            return this.f97478c;
        }

        @Override // p000.C44930mA0.InterfaceC25928f
        /* renamed from: l */
        public ContentInfo mo26206l() {
            return null;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f97476a.getDescription());
            sb.append(", source=");
            sb.append(C44930mA0.m26217e(this.f97477b));
            sb.append(", flags=");
            sb.append(C44930mA0.m26221a(this.f97478c));
            String str2 = "";
            if (this.f97479d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f97479d.toString().length() + ")";
            }
            sb.append(str);
            if (this.f97480e != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }
    }

    public C44930mA0(InterfaceC25928f interfaceC25928f) {
        this.f97467a = interfaceC25928f;
    }

    /* renamed from: a */
    public static String m26221a(int i) {
        if ((i & 1) != 0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return String.valueOf(i);
    }

    /* renamed from: e */
    public static String m26217e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    /* renamed from: g */
    public static C44930mA0 m26215g(ContentInfo contentInfo) {
        return new C44930mA0(new C25927e(contentInfo));
    }

    /* renamed from: b */
    public ClipData m26220b() {
        return this.f97467a.mo26208a();
    }

    /* renamed from: c */
    public int m26219c() {
        return this.f97467a.mo26207k();
    }

    /* renamed from: d */
    public int m26218d() {
        return this.f97467a.getSource();
    }

    /* renamed from: f */
    public ContentInfo m26216f() {
        ContentInfo mo26206l = this.f97467a.mo26206l();
        Objects.requireNonNull(mo26206l);
        return C44337lA0.m27722a(mo26206l);
    }

    public String toString() {
        return this.f97467a.toString();
    }
}
