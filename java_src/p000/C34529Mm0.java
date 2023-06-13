package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b%\b\u0007\u0018\u00002\u00020\u0001Br\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0001¢\u0006\u0004\b6\u00107J\u0095\u0001\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016R4\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR4\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR4\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR4\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR4\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b%\u0010\u001aR4\u0010\b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR4\u0010\t\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b)\u0010\u0016\u001a\u0004\b!\u0010\u0018\"\u0004\b*\u0010\u001aR4\u0010\n\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0016\u001a\u0004\b)\u0010\u0018\"\u0004\b,\u0010\u001aR4\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b-\u0010\u0016\u001a\u0004\b+\u0010\u0018\"\u0004\b.\u0010\u001aR4\u0010\f\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b$\u0010\u0018\"\u0004\b/\u0010\u001aR4\u0010\r\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b-\u0010\u0018\"\u0004\b0\u0010\u001aR4\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b&\u0010\u0018\"\u0004\b1\u0010\u001aR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0016\u001a\u0004\b2\u00103\"\u0004\b4\u00105\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00068"}, m28432d2 = {"LMm0;", "", "Lpm0;", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "", "isLight", C17296a.f69688o, "(JJJJJJJJJJJJZ)LMm0;", "", "toString", "<set-?>", "LEX2;", "j", "()J", "x", "(J)V", "b", "k", "y", "c", "l", "z", DateTokenConverter.CONVERTER_KEY, "m", "A", "e", "p", "f", "n", "B", "g", "q", "h", "u", "i", "v", "s", "w", "t", "o", "()Z", "r", "(Z)V", "<init>", "(JJJJJJJJJJJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Colors.kt\nandroidx/compose/material/Colors\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,337:1\n76#2:338\n102#2,2:339\n76#2:341\n102#2,2:342\n76#2:344\n102#2,2:345\n76#2:347\n102#2,2:348\n76#2:350\n102#2,2:351\n76#2:353\n102#2,2:354\n76#2:356\n102#2,2:357\n76#2:359\n102#2,2:360\n76#2:362\n102#2,2:363\n76#2:365\n102#2,2:366\n76#2:368\n102#2,2:369\n76#2:371\n102#2,2:372\n76#2:374\n102#2,2:375\n*S KotlinDebug\n*F\n+ 1 Colors.kt\nandroidx/compose/material/Colors\n*L\n82#1:338\n82#1:339,2\n84#1:341\n84#1:342,2\n86#1:344\n86#1:345,2\n88#1:347\n88#1:348,2\n90#1:350\n90#1:351,2\n92#1:353\n92#1:354,2\n94#1:356\n94#1:357,2\n96#1:359\n96#1:360,2\n98#1:362\n98#1:363,2\n100#1:365\n100#1:366,2\n102#1:368\n102#1:369,2\n104#1:371\n104#1:372,2\n106#1:374\n106#1:375,2\n*E\n"})
/* renamed from: Mm0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34529Mm0 {

    /* renamed from: a */
    public final EX2 f23517a;

    /* renamed from: b */
    public final EX2 f23518b;

    /* renamed from: c */
    public final EX2 f23519c;

    /* renamed from: d */
    public final EX2 f23520d;

    /* renamed from: e */
    public final EX2 f23521e;

    /* renamed from: f */
    public final EX2 f23522f;

    /* renamed from: g */
    public final EX2 f23523g;

    /* renamed from: h */
    public final EX2 f23524h;

    /* renamed from: i */
    public final EX2 f23525i;

    /* renamed from: j */
    public final EX2 f23526j;

    /* renamed from: k */
    public final EX2 f23527k;

    /* renamed from: l */
    public final EX2 f23528l;

    /* renamed from: m */
    public final EX2 f23529m;

    public /* synthetic */ C34529Mm0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, z);
    }

    /* renamed from: A */
    public final void m94911A(long j) {
        this.f23520d.setValue(C47063pm0.m18747i(j));
    }

    /* renamed from: B */
    public final void m94910B(long j) {
        this.f23522f.setValue(C47063pm0.m18747i(j));
    }

    /* renamed from: a */
    public final C34529Mm0 m94909a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        return new C34529Mm0(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, z, null);
    }

    /* renamed from: c */
    public final long m94907c() {
        return ((C47063pm0) this.f23521e.getValue()).m18733w();
    }

    /* renamed from: d */
    public final long m94906d() {
        return ((C47063pm0) this.f23523g.getValue()).m18733w();
    }

    /* renamed from: e */
    public final long m94905e() {
        return ((C47063pm0) this.f23526j.getValue()).m18733w();
    }

    /* renamed from: f */
    public final long m94904f() {
        return ((C47063pm0) this.f23528l.getValue()).m18733w();
    }

    /* renamed from: g */
    public final long m94903g() {
        return ((C47063pm0) this.f23524h.getValue()).m18733w();
    }

    /* renamed from: h */
    public final long m94902h() {
        return ((C47063pm0) this.f23525i.getValue()).m18733w();
    }

    /* renamed from: i */
    public final long m94901i() {
        return ((C47063pm0) this.f23527k.getValue()).m18733w();
    }

    /* renamed from: j */
    public final long m94900j() {
        return ((C47063pm0) this.f23517a.getValue()).m18733w();
    }

    /* renamed from: k */
    public final long m94899k() {
        return ((C47063pm0) this.f23518b.getValue()).m18733w();
    }

    /* renamed from: l */
    public final long m94898l() {
        return ((C47063pm0) this.f23519c.getValue()).m18733w();
    }

    /* renamed from: m */
    public final long m94897m() {
        return ((C47063pm0) this.f23520d.getValue()).m18733w();
    }

    /* renamed from: n */
    public final long m94896n() {
        return ((C47063pm0) this.f23522f.getValue()).m18733w();
    }

    /* renamed from: o */
    public final boolean m94895o() {
        return ((Boolean) this.f23529m.getValue()).booleanValue();
    }

    /* renamed from: p */
    public final void m94894p(long j) {
        this.f23521e.setValue(C47063pm0.m18747i(j));
    }

    /* renamed from: q */
    public final void m94893q(long j) {
        this.f23523g.setValue(C47063pm0.m18747i(j));
    }

    /* renamed from: r */
    public final void m94892r(boolean z) {
        this.f23529m.setValue(Boolean.valueOf(z));
    }

    /* renamed from: s */
    public final void m94891s(long j) {
        this.f23526j.setValue(C47063pm0.m18747i(j));
    }

    /* renamed from: t */
    public final void m94890t(long j) {
        this.f23528l.setValue(C47063pm0.m18747i(j));
    }

    public String toString() {
        return "Colors(primary=" + ((Object) C47063pm0.m18734v(m94900j())) + ", primaryVariant=" + ((Object) C47063pm0.m18734v(m94899k())) + ", secondary=" + ((Object) C47063pm0.m18734v(m94898l())) + ", secondaryVariant=" + ((Object) C47063pm0.m18734v(m94897m())) + ", background=" + ((Object) C47063pm0.m18734v(m94907c())) + ", surface=" + ((Object) C47063pm0.m18734v(m94896n())) + ", error=" + ((Object) C47063pm0.m18734v(m94906d())) + ", onPrimary=" + ((Object) C47063pm0.m18734v(m94903g())) + ", onSecondary=" + ((Object) C47063pm0.m18734v(m94902h())) + ", onBackground=" + ((Object) C47063pm0.m18734v(m94905e())) + ", onSurface=" + ((Object) C47063pm0.m18734v(m94901i())) + ", onError=" + ((Object) C47063pm0.m18734v(m94904f())) + ", isLight=" + m94895o() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* renamed from: u */
    public final void m94889u(long j) {
        this.f23524h.setValue(C47063pm0.m18747i(j));
    }

    /* renamed from: v */
    public final void m94888v(long j) {
        this.f23525i.setValue(C47063pm0.m18747i(j));
    }

    /* renamed from: w */
    public final void m94887w(long j) {
        this.f23527k.setValue(C47063pm0.m18747i(j));
    }

    /* renamed from: x */
    public final void m94886x(long j) {
        this.f23517a.setValue(C47063pm0.m18747i(j));
    }

    /* renamed from: y */
    public final void m94885y(long j) {
        this.f23518b.setValue(C47063pm0.m18747i(j));
    }

    /* renamed from: z */
    public final void m94884z(long j) {
        this.f23519c.setValue(C47063pm0.m18747i(j));
    }

    public C34529Mm0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        this.f23517a = GM5.m105200g(C47063pm0.m18747i(j), GM5.m105191p());
        this.f23518b = GM5.m105200g(C47063pm0.m18747i(j2), GM5.m105191p());
        this.f23519c = GM5.m105200g(C47063pm0.m18747i(j3), GM5.m105191p());
        this.f23520d = GM5.m105200g(C47063pm0.m18747i(j4), GM5.m105191p());
        this.f23521e = GM5.m105200g(C47063pm0.m18747i(j5), GM5.m105191p());
        this.f23522f = GM5.m105200g(C47063pm0.m18747i(j6), GM5.m105191p());
        this.f23523g = GM5.m105200g(C47063pm0.m18747i(j7), GM5.m105191p());
        this.f23524h = GM5.m105200g(C47063pm0.m18747i(j8), GM5.m105191p());
        this.f23525i = GM5.m105200g(C47063pm0.m18747i(j9), GM5.m105191p());
        this.f23526j = GM5.m105200g(C47063pm0.m18747i(j10), GM5.m105191p());
        this.f23527k = GM5.m105200g(C47063pm0.m18747i(j11), GM5.m105191p());
        this.f23528l = GM5.m105200g(C47063pm0.m18747i(j12), GM5.m105191p());
        this.f23529m = GM5.m105200g(Boolean.valueOf(z), GM5.m105191p());
    }
}
