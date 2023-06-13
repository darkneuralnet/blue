package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b0\u0010\nJ\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u000f\u0010\t\u001a\u00020\bH ¢\u0006\u0004\b\t\u0010\nJ\f\u0010\f\u001a\u00020\b*\u00020\u000bH\u0004R\"\u0010\u0014\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001d\u0010\u001c\u001a\u00020\u00198&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0014\u0010#\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8 X \u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, m28432d2 = {"LSC2;", "LOU3;", "", "LL9;", "alignmentLine", "", "v", "n1", "", "y1", "()V", "LH83;", "v1", "", "f", "Z", "x1", "()Z", "A1", "(Z)V", "isShallowPlacing", "g", "w1", "z1", "isPlacingForAlignment", "LA52;", "u1", "()J", "position", "o1", "()LSC2;", "child", "t1", "parent", "q1", "hasMeasureResult", "LJm2;", "r1", "()LJm2;", "layoutNode", "Lnm2;", "p1", "()Lnm2;", "coordinates", "LyO2;", "s1", "()LyO2;", "measureResult", "<init>", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: SC2 */
/* loaded from: classes.dex */
public abstract class SC2 extends OU3 implements InterfaceC52765zO2 {

    /* renamed from: f */
    public boolean f33314f;

    /* renamed from: g */
    public boolean f33315g;

    /* renamed from: A1 */
    public final void m85847A1(boolean z) {
        this.f33314f = z;
    }

    /* renamed from: n1 */
    public abstract int mo85846n1(AbstractC4750L9 abstractC4750L9);

    /* renamed from: o1 */
    public abstract SC2 mo84225o1();

    /* renamed from: p1 */
    public abstract InterfaceC45879nm2 mo84224p1();

    /* renamed from: q1 */
    public abstract boolean mo84223q1();

    /* renamed from: r1 */
    public abstract C33829Jm2 mo84222r1();

    /* renamed from: s1 */
    public abstract InterfaceC52172yO2 mo84221s1();

    /* renamed from: t1 */
    public abstract SC2 mo84220t1();

    /* renamed from: u1 */
    public abstract long mo84219u1();

    @Override // p000.AO2
    /* renamed from: v */
    public final int mo35854v(AbstractC4750L9 alignmentLine) {
        int mo85846n1;
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        if (!mo84223q1() || (mo85846n1 = mo85846n1(alignmentLine)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return mo85846n1 + A52.m116110k(m92230c1());
    }

    /* renamed from: v1 */
    public final void m85845v1(H83 h83) {
        C33829Jm2 c33829Jm2;
        AbstractC6277P9 mo88870d;
        Intrinsics.checkNotNullParameter(h83, "<this>");
        H83 m104310i2 = h83.m104310i2();
        if (m104310i2 != null) {
            c33829Jm2 = m104310i2.mo84222r1();
        } else {
            c33829Jm2 = null;
        }
        if (!Intrinsics.areEqual(c33829Jm2, h83.mo84222r1())) {
            h83.m104318Z1().mo88870d().m90689m();
            return;
        }
        InterfaceC6687Q9 mo88873C = h83.m104318Z1().mo88873C();
        if (mo88873C != null && (mo88870d = mo88873C.mo88870d()) != null) {
            mo88870d.m90689m();
        }
    }

    /* renamed from: w1 */
    public final boolean m85844w1() {
        return this.f33315g;
    }

    /* renamed from: x1 */
    public final boolean m85843x1() {
        return this.f33314f;
    }

    /* renamed from: y1 */
    public abstract void mo84218y1();

    /* renamed from: z1 */
    public final void m85842z1(boolean z) {
        this.f33315g = z;
    }
}
