package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001Bq\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+B\u0095\u0001\b\u0016\u0012\b\b\u0002\u0010-\u001a\u00020,\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b*\u0010.J\u0088\u0001\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b&\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001a¨\u0006/"}, m28432d2 = {"LGc6;", "", "LG26;", "h1", "h2", "h3", "h4", "h5", "h6", "subtitle1", "subtitle2", "body1", "body2", "button", "caption", "overline", C17296a.f69688o, LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "LG26;", "getH1", "()LG26;", "b", "g", "c", "getH3", DateTokenConverter.CONVERTER_KEY, "h", "e", "i", "f", "j", "k", "getSubtitle2", "l", "m", "getOverline", "<init>", "(LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;)V", "Lkw1;", "defaultFontFamily", "(Lkw1;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;)V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Gc6 */
/* loaded from: classes.dex */
public final class C33041Gc6 {

    /* renamed from: a */
    public final G26 f12152a;

    /* renamed from: b */
    public final G26 f12153b;

    /* renamed from: c */
    public final G26 f12154c;

    /* renamed from: d */
    public final G26 f12155d;

    /* renamed from: e */
    public final G26 f12156e;

    /* renamed from: f */
    public final G26 f12157f;

    /* renamed from: g */
    public final G26 f12158g;

    /* renamed from: h */
    public final G26 f12159h;

    /* renamed from: i */
    public final G26 f12160i;

    /* renamed from: j */
    public final G26 f12161j;

    /* renamed from: k */
    public final G26 f12162k;

    /* renamed from: l */
    public final G26 f12163l;

    /* renamed from: m */
    public final G26 f12164m;

    public C33041Gc6(G26 h1, G26 h2, G26 h3, G26 h4, G26 h5, G26 h6, G26 subtitle1, G26 subtitle2, G26 body1, G26 body2, G26 button, G26 caption, G26 overline) {
        Intrinsics.checkNotNullParameter(h1, "h1");
        Intrinsics.checkNotNullParameter(h2, "h2");
        Intrinsics.checkNotNullParameter(h3, "h3");
        Intrinsics.checkNotNullParameter(h4, "h4");
        Intrinsics.checkNotNullParameter(h5, "h5");
        Intrinsics.checkNotNullParameter(h6, "h6");
        Intrinsics.checkNotNullParameter(subtitle1, "subtitle1");
        Intrinsics.checkNotNullParameter(subtitle2, "subtitle2");
        Intrinsics.checkNotNullParameter(body1, "body1");
        Intrinsics.checkNotNullParameter(body2, "body2");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(overline, "overline");
        this.f12152a = h1;
        this.f12153b = h2;
        this.f12154c = h3;
        this.f12155d = h4;
        this.f12156e = h5;
        this.f12157f = h6;
        this.f12158g = subtitle1;
        this.f12159h = subtitle2;
        this.f12160i = body1;
        this.f12161j = body2;
        this.f12162k = button;
        this.f12163l = caption;
        this.f12164m = overline;
    }

    /* renamed from: a */
    public final C33041Gc6 m104967a(G26 h1, G26 h2, G26 h3, G26 h4, G26 h5, G26 h6, G26 subtitle1, G26 subtitle2, G26 body1, G26 body2, G26 button, G26 caption, G26 overline) {
        Intrinsics.checkNotNullParameter(h1, "h1");
        Intrinsics.checkNotNullParameter(h2, "h2");
        Intrinsics.checkNotNullParameter(h3, "h3");
        Intrinsics.checkNotNullParameter(h4, "h4");
        Intrinsics.checkNotNullParameter(h5, "h5");
        Intrinsics.checkNotNullParameter(h6, "h6");
        Intrinsics.checkNotNullParameter(subtitle1, "subtitle1");
        Intrinsics.checkNotNullParameter(subtitle2, "subtitle2");
        Intrinsics.checkNotNullParameter(body1, "body1");
        Intrinsics.checkNotNullParameter(body2, "body2");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(overline, "overline");
        return new C33041Gc6(h1, h2, h3, h4, h5, h6, subtitle1, subtitle2, body1, body2, button, caption, overline);
    }

    /* renamed from: c */
    public final G26 m104965c() {
        return this.f12160i;
    }

    /* renamed from: d */
    public final G26 m104964d() {
        return this.f12161j;
    }

    /* renamed from: e */
    public final G26 m104963e() {
        return this.f12162k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33041Gc6)) {
            return false;
        }
        C33041Gc6 c33041Gc6 = (C33041Gc6) obj;
        if (Intrinsics.areEqual(this.f12152a, c33041Gc6.f12152a) && Intrinsics.areEqual(this.f12153b, c33041Gc6.f12153b) && Intrinsics.areEqual(this.f12154c, c33041Gc6.f12154c) && Intrinsics.areEqual(this.f12155d, c33041Gc6.f12155d) && Intrinsics.areEqual(this.f12156e, c33041Gc6.f12156e) && Intrinsics.areEqual(this.f12157f, c33041Gc6.f12157f) && Intrinsics.areEqual(this.f12158g, c33041Gc6.f12158g) && Intrinsics.areEqual(this.f12159h, c33041Gc6.f12159h) && Intrinsics.areEqual(this.f12160i, c33041Gc6.f12160i) && Intrinsics.areEqual(this.f12161j, c33041Gc6.f12161j) && Intrinsics.areEqual(this.f12162k, c33041Gc6.f12162k) && Intrinsics.areEqual(this.f12163l, c33041Gc6.f12163l) && Intrinsics.areEqual(this.f12164m, c33041Gc6.f12164m)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final G26 m104962f() {
        return this.f12163l;
    }

    /* renamed from: g */
    public final G26 m104961g() {
        return this.f12153b;
    }

    /* renamed from: h */
    public final G26 m104960h() {
        return this.f12155d;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f12152a.hashCode() * 31) + this.f12153b.hashCode()) * 31) + this.f12154c.hashCode()) * 31) + this.f12155d.hashCode()) * 31) + this.f12156e.hashCode()) * 31) + this.f12157f.hashCode()) * 31) + this.f12158g.hashCode()) * 31) + this.f12159h.hashCode()) * 31) + this.f12160i.hashCode()) * 31) + this.f12161j.hashCode()) * 31) + this.f12162k.hashCode()) * 31) + this.f12163l.hashCode()) * 31) + this.f12164m.hashCode();
    }

    /* renamed from: i */
    public final G26 m104959i() {
        return this.f12156e;
    }

    /* renamed from: j */
    public final G26 m104958j() {
        return this.f12157f;
    }

    /* renamed from: k */
    public final G26 m104957k() {
        return this.f12158g;
    }

    public String toString() {
        return "Typography(h1=" + this.f12152a + ", h2=" + this.f12153b + ", h3=" + this.f12154c + ", h4=" + this.f12155d + ", h5=" + this.f12156e + ", h6=" + this.f12157f + ", subtitle1=" + this.f12158g + ", subtitle2=" + this.f12159h + ", body1=" + this.f12160i + ", body2=" + this.f12161j + ", button=" + this.f12162k + ", caption=" + this.f12163l + ", overline=" + this.f12164m + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ C33041Gc6(AbstractC44199kw1 abstractC44199kw1, G26 g26, G26 g262, G26 g263, G26 g264, G26 g265, G26 g266, G26 g267, G26 g268, G26 g269, G26 g2610, G26 g2611, G26 g2612, G26 g2613, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AbstractC44199kw1.f95230c.m28152a() : abstractC44199kw1, (i & 2) != 0 ? new G26(0L, N26.m94414f(96), C33918Jw1.f18784c.m99542b(), null, null, null, null, N26.m94416d(-1.5d), null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194169, null) : g26, (i & 4) != 0 ? new G26(0L, N26.m94414f(60), C33918Jw1.f18784c.m99542b(), null, null, null, null, N26.m94416d(-0.5d), null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194169, null) : g262, (i & 8) != 0 ? new G26(0L, N26.m94414f(48), C33918Jw1.f18784c.m99540d(), null, null, null, null, N26.m94414f(0), null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194169, null) : g263, (i & 16) != 0 ? new G26(0L, N26.m94414f(34), C33918Jw1.f18784c.m99540d(), null, null, null, null, N26.m94416d(0.25d), null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194169, null) : g264, (i & 32) != 0 ? new G26(0L, N26.m94414f(24), C33918Jw1.f18784c.m99540d(), null, null, null, null, N26.m94414f(0), null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194169, null) : g265, (i & 64) != 0 ? new G26(0L, N26.m94414f(20), C33918Jw1.f18784c.m99541c(), null, null, null, null, N26.m94416d(0.15d), null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194169, null) : g266, (i & 128) != 0 ? new G26(0L, N26.m94414f(16), C33918Jw1.f18784c.m99540d(), null, null, null, null, N26.m94416d(0.15d), null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194169, null) : g267, (i & 256) != 0 ? new G26(0L, N26.m94414f(14), C33918Jw1.f18784c.m99541c(), null, null, null, null, N26.m94416d(0.1d), null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194169, null) : g268, (i & 512) != 0 ? new G26(0L, N26.m94414f(16), C33918Jw1.f18784c.m99540d(), null, null, null, null, N26.m94416d(0.5d), null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194169, null) : g269, (i & 1024) != 0 ? new G26(0L, N26.m94414f(14), C33918Jw1.f18784c.m99540d(), null, null, null, null, N26.m94416d(0.25d), null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194169, null) : g2610, (i & 2048) != 0 ? new G26(0L, N26.m94414f(14), C33918Jw1.f18784c.m99541c(), null, null, null, null, N26.m94416d(1.25d), null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194169, null) : g2611, (i & 4096) != 0 ? new G26(0L, N26.m94414f(12), C33918Jw1.f18784c.m99540d(), null, null, null, null, N26.m94416d(0.4d), null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194169, null) : g2612, (i & 8192) != 0 ? new G26(0L, N26.m94414f(10), C33918Jw1.f18784c.m99540d(), null, null, null, null, N26.m94416d(1.5d), null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194169, null) : g2613);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C33041Gc6(AbstractC44199kw1 defaultFontFamily, G26 h1, G26 h2, G26 h3, G26 h4, G26 h5, G26 h6, G26 subtitle1, G26 subtitle2, G26 body1, G26 body2, G26 button, G26 caption, G26 overline) {
        this(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
        G26 m103652c;
        G26 m103652c2;
        G26 m103652c3;
        G26 m103652c4;
        G26 m103652c5;
        G26 m103652c6;
        G26 m103652c7;
        G26 m103652c8;
        G26 m103652c9;
        G26 m103652c10;
        G26 m103652c11;
        G26 m103652c12;
        G26 m103652c13;
        Intrinsics.checkNotNullParameter(defaultFontFamily, "defaultFontFamily");
        Intrinsics.checkNotNullParameter(h1, "h1");
        Intrinsics.checkNotNullParameter(h2, "h2");
        Intrinsics.checkNotNullParameter(h3, "h3");
        Intrinsics.checkNotNullParameter(h4, "h4");
        Intrinsics.checkNotNullParameter(h5, "h5");
        Intrinsics.checkNotNullParameter(h6, "h6");
        Intrinsics.checkNotNullParameter(subtitle1, "subtitle1");
        Intrinsics.checkNotNullParameter(subtitle2, "subtitle2");
        Intrinsics.checkNotNullParameter(body1, "body1");
        Intrinsics.checkNotNullParameter(body2, "body2");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(overline, "overline");
        m103652c = C33275Hc6.m103652c(h1, defaultFontFamily);
        m103652c2 = C33275Hc6.m103652c(h2, defaultFontFamily);
        m103652c3 = C33275Hc6.m103652c(h3, defaultFontFamily);
        m103652c4 = C33275Hc6.m103652c(h4, defaultFontFamily);
        m103652c5 = C33275Hc6.m103652c(h5, defaultFontFamily);
        m103652c6 = C33275Hc6.m103652c(h6, defaultFontFamily);
        m103652c7 = C33275Hc6.m103652c(subtitle1, defaultFontFamily);
        m103652c8 = C33275Hc6.m103652c(subtitle2, defaultFontFamily);
        m103652c9 = C33275Hc6.m103652c(body1, defaultFontFamily);
        m103652c10 = C33275Hc6.m103652c(body2, defaultFontFamily);
        m103652c11 = C33275Hc6.m103652c(button, defaultFontFamily);
        m103652c12 = C33275Hc6.m103652c(caption, defaultFontFamily);
        m103652c13 = C33275Hc6.m103652c(overline, defaultFontFamily);
    }
}
