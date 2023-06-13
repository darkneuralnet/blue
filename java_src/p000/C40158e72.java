package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b#\u0010$J\u001a\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u0003*\u00020\nH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\u0003*\u00020\u0004H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\n*\u00020\u0003H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u001a\u0010\u0014\u001a\u00020\n*\u00020\u0007H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u000f*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u0017\u001a\u00020\u0007*\u00020\u0003H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\n8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001fR\u0014\u0010\"\u001a\u00020\n8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\u001f\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006%"}, m28432d2 = {"Le72;", "LzO2;", "Lg01;", "Lk61;", "", "F0", "(F)I", "LM26;", "V0", "(J)I", "", "x", "(F)F", "w", "(I)F", "LxB5;", "Lo61;", "j", "(J)J", "T0", "I0", "(J)F", "z", "s0", "(F)J", "Lpm2;", "b", "Lpm2;", "getLayoutDirection", "()Lpm2;", "layoutDirection", "()F", "density", "R0", "fontScale", "<init>", "(Lg01;Lpm2;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: e72  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40158e72 implements InterfaceC52765zO2, InterfaceC41273g01 {

    /* renamed from: b */
    public final EnumC47065pm2 f77963b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC41273g01 f77964c;

    public C40158e72(InterfaceC41273g01 density, EnumC47065pm2 layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f77963b = layoutDirection;
        this.f77964c = density;
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: F0 */
    public int mo3416F0(float f) {
        return this.f77964c.mo3416F0(f);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: I0 */
    public float mo3415I0(long j) {
        return this.f77964c.mo3415I0(j);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: R0 */
    public float mo3412R0() {
        return this.f77964c.mo3412R0();
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: T0 */
    public float mo3411T0(float f) {
        return this.f77964c.mo3411T0(f);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: V0 */
    public int mo3410V0(long j) {
        return this.f77964c.mo3410V0(j);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: b */
    public float mo3408b() {
        return this.f77964c.mo3408b();
    }

    @Override // p000.Z62
    public EnumC47065pm2 getLayoutDirection() {
        return this.f77963b;
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: j */
    public long mo3403j(long j) {
        return this.f77964c.mo3403j(j);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: s0 */
    public long mo3399s0(float f) {
        return this.f77964c.mo3399s0(f);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: w */
    public float mo3398w(int i) {
        return this.f77964c.mo3398w(i);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: x */
    public float mo3397x(float f) {
        return this.f77964c.mo3397x(f);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: z */
    public long mo3395z(long j) {
        return this.f77964c.mo3395z(j);
    }
}
