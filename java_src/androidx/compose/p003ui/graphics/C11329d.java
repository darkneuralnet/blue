package androidx.compose.p003ui.graphics;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bb\u0010cJ\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0012\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\u0011\u0010\nR\"\u0010\u0016\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\nR\"\u0010\u001a\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\"\u0010\u001d\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR+\u0010$\u001a\u00020\u001e8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0010\u0010!\"\u0004\b\"\u0010#R+\u0010(\u001a\u00020\u001e8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\"\u0010,\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\b\"\u0004\b+\u0010\nR\"\u0010/\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010\nR\"\u00103\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\b\"\u0004\b2\u0010\nR\"\u00107\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\b\"\u0004\b6\u0010\nR+\u0010;\u001a\u0002088\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010 \u001a\u0004\b9\u0010!\"\u0004\b:\u0010#R\"\u0010B\u001a\u00020<8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?\"\u0004\b@\u0010AR\"\u0010H\u001a\u00020C8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b6\u0010D\u001a\u0004\b\u0013\u0010E\"\u0004\bF\u0010GR+\u0010M\u001a\u00020I8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b+\u0010J\u001a\u0004\b\u0017\u0010K\"\u0004\b4\u0010LR+\u0010Q\u001a\u00020N8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b.\u0010 \u001a\u0004\bO\u0010!\"\u0004\bP\u0010#R\"\u0010Y\u001a\u00020R8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010^\u001a\u0004\u0018\u00010Z8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010[\u001a\u0004\b%\u0010\\\"\u0004\b0\u0010]R\u0014\u0010_\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\bR\u0014\u0010a\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006d"}, m28432d2 = {"Landroidx/compose/ui/graphics/d;", "Landroidx/compose/ui/graphics/c;", "", "v", "", "b", "F", "L0", "()F", "D", "(F)V", "scaleX", "c", "Z0", "E", "scaleY", DateTokenConverter.CONVERTER_KEY, "g", "alpha", "e", "h0", "G", "translationX", "f", "c0", "k", "translationY", "n", "T", "shadowElevation", "Lpm0;", "h", "J", "()J", "A0", "(J)V", "ambientShadowColor", "i", "t", "G0", "spotShadowColor", "j", "X0", "q", "rotationX", "w0", "r", "rotationY", "l", "y0", "u", "rotationZ", "m", "N", "p", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "D0", "P", "transformOrigin", "Lhy5;", "o", "Lhy5;", "()Lhy5;", "S0", "(Lhy5;)V", "shape", "", "Z", "()Z", "O", "(Z)V", "clip", "Landroidx/compose/ui/graphics/a;", "I", "()I", "(I)V", "compositingStrategy", "LxB5;", "getSize-NH-jbRc", "A", "size", "Lg01;", "s", "Lg01;", "getGraphicsDensity$ui_release", "()Lg01;", "y", "(Lg01;)V", "graphicsDensity", "Low4;", "Low4;", "()Low4;", "(Low4;)V", "renderEffect", "density", "R0", "fontScale", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.d */
/* loaded from: classes.dex */
public final class C11329d implements InterfaceC11328c {

    /* renamed from: e */
    public float f53029e;

    /* renamed from: f */
    public float f53030f;

    /* renamed from: g */
    public float f53031g;

    /* renamed from: j */
    public float f53034j;

    /* renamed from: k */
    public float f53035k;

    /* renamed from: l */
    public float f53036l;

    /* renamed from: p */
    public boolean f53040p;

    /* renamed from: t */
    public AbstractC46574ow4 f53044t;

    /* renamed from: b */
    public float f53026b = 1.0f;

    /* renamed from: c */
    public float f53027c = 1.0f;

    /* renamed from: d */
    public float f53028d = 1.0f;

    /* renamed from: h */
    public long f53032h = XD1.m77177a();

    /* renamed from: i */
    public long f53033i = XD1.m77177a();

    /* renamed from: m */
    public float f53037m = 8.0f;

    /* renamed from: n */
    public long f53038n = C11333f.f53066b.m68626a();

    /* renamed from: o */
    public InterfaceC42444hy5 f53039o = C37629Zs4.m72365a();

    /* renamed from: q */
    public int f53041q = C11325a.f53022a.m68717a();

    /* renamed from: r */
    public long f53042r = C51465xB5.f117175b.m5724a();

    /* renamed from: s */
    public InterfaceC41273g01 f53043s = C42459i01.m35404b(1.0f, 0.0f, 2, null);

    /* renamed from: A */
    public void m68710A(long j) {
        this.f53042r = j;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: A0 */
    public void mo68709A0(long j) {
        this.f53032h = j;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: D */
    public void mo68708D(float f) {
        this.f53026b = f;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: D0 */
    public long mo68707D0() {
        return this.f53038n;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: E */
    public void mo68706E(float f) {
        this.f53027c = f;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: G */
    public void mo68705G(float f) {
        this.f53029e = f;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: G0 */
    public void mo68704G0(long j) {
        this.f53033i = j;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: L0 */
    public float mo68703L0() {
        return this.f53026b;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: N */
    public float mo68702N() {
        return this.f53037m;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: O */
    public void mo68701O(boolean z) {
        this.f53040p = z;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: P */
    public void mo68700P(long j) {
        this.f53038n = j;
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: R0 */
    public float mo3412R0() {
        return this.f53043s.mo3412R0();
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: S0 */
    public void mo68699S0(InterfaceC42444hy5 interfaceC42444hy5) {
        Intrinsics.checkNotNullParameter(interfaceC42444hy5, "<set-?>");
        this.f53039o = interfaceC42444hy5;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: T */
    public void mo68698T(float f) {
        this.f53031g = f;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: X0 */
    public float mo68697X0() {
        return this.f53034j;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: Z0 */
    public float mo68696Z0() {
        return this.f53027c;
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: b */
    public float mo3408b() {
        return this.f53043s.mo3408b();
    }

    /* renamed from: c */
    public float m68695c() {
        return this.f53028d;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: c0 */
    public float mo68694c0() {
        return this.f53030f;
    }

    /* renamed from: d */
    public long m68693d() {
        return this.f53032h;
    }

    /* renamed from: e */
    public boolean m68692e() {
        return this.f53040p;
    }

    /* renamed from: f */
    public int m68691f() {
        return this.f53041q;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: g */
    public void mo68690g(float f) {
        this.f53028d = f;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: h0 */
    public float mo68689h0() {
        return this.f53029e;
    }

    /* renamed from: i */
    public AbstractC46574ow4 m68688i() {
        return this.f53044t;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: k */
    public void mo68687k(float f) {
        this.f53030f = f;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: l */
    public void mo68686l(AbstractC46574ow4 abstractC46574ow4) {
        this.f53044t = abstractC46574ow4;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: m */
    public void mo68685m(int i) {
        this.f53041q = i;
    }

    /* renamed from: n */
    public float m68684n() {
        return this.f53031g;
    }

    /* renamed from: o */
    public InterfaceC42444hy5 m68683o() {
        return this.f53039o;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: p */
    public void mo68682p(float f) {
        this.f53037m = f;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: q */
    public void mo68681q(float f) {
        this.f53034j = f;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: r */
    public void mo68680r(float f) {
        this.f53035k = f;
    }

    /* renamed from: t */
    public long m68679t() {
        return this.f53033i;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: u */
    public void mo68678u(float f) {
        this.f53036l = f;
    }

    /* renamed from: v */
    public final void m68677v() {
        mo68708D(1.0f);
        mo68706E(1.0f);
        mo68690g(1.0f);
        mo68705G(0.0f);
        mo68687k(0.0f);
        mo68698T(0.0f);
        mo68709A0(XD1.m77177a());
        mo68704G0(XD1.m77177a());
        mo68681q(0.0f);
        mo68680r(0.0f);
        mo68678u(0.0f);
        mo68682p(8.0f);
        mo68700P(C11333f.f53066b.m68626a());
        mo68699S0(C37629Zs4.m72365a());
        mo68701O(false);
        mo68686l(null);
        mo68685m(C11325a.f53022a.m68717a());
        m68710A(C51465xB5.f117175b.m5724a());
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: w0 */
    public float mo68676w0() {
        return this.f53035k;
    }

    /* renamed from: y */
    public final void m68675y(InterfaceC41273g01 interfaceC41273g01) {
        Intrinsics.checkNotNullParameter(interfaceC41273g01, "<set-?>");
        this.f53043s = interfaceC41273g01;
    }

    @Override // androidx.compose.p003ui.graphics.InterfaceC11328c
    /* renamed from: y0 */
    public float mo68674y0() {
        return this.f53036l;
    }
}
