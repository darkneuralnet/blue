package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&J\u001d\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0005J\u001d\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0005J%\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0019R\u001d\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006'"}, m28432d2 = {"LVC2;", "LUC2;", "LCe3;", "relativeToWindow", "H", "(J)J", "relativeToLocal", "i", "y", "Lnm2;", "sourceCoordinates", "relativeToSource", "X", "(Lnm2;J)J", "", "clipBounds", "LOs4;", "e", "LTC2;", "b", "LTC2;", "getLookaheadDelegate", "()LTC2;", "lookaheadDelegate", "LH83;", "()LH83;", "coordinator", "LG52;", C17296a.f69688o, "()J", "size", "t", "()Lnm2;", "parentLayoutCoordinates", "F", "()Z", "isAttached", "<init>", "(LTC2;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLookaheadLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,120:1\n179#2:121\n157#2:124\n179#2:126\n157#2:129\n86#3:122\n79#3:123\n86#3:125\n86#3:127\n79#3:128\n*S KotlinDebug\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl\n*L\n63#1:121\n64#1:124\n69#1:126\n75#1:129\n63#1:122\n63#1:123\n68#1:125\n71#1:127\n68#1:128\n*E\n"})
/* renamed from: VC2 */
/* loaded from: classes.dex */
public final class VC2 implements UC2 {

    /* renamed from: b */
    public final TC2 f38732b;

    public VC2(TC2 lookaheadDelegate) {
        Intrinsics.checkNotNullParameter(lookaheadDelegate, "lookaheadDelegate");
        this.f38732b = lookaheadDelegate;
    }

    @Override // p000.InterfaceC45879nm2
    /* renamed from: F */
    public boolean mo23189F() {
        return m80235b().mo23189F();
    }

    @Override // p000.InterfaceC45879nm2
    /* renamed from: H */
    public long mo23188H(long j) {
        return m80235b().mo23188H(j);
    }

    @Override // p000.InterfaceC45879nm2
    /* renamed from: X */
    public long mo23187X(InterfaceC45879nm2 sourceCoordinates, long j) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        return m80235b().mo23187X(sourceCoordinates, j);
    }

    @Override // p000.InterfaceC45879nm2
    /* renamed from: a */
    public long mo23186a() {
        return m80235b().mo23186a();
    }

    /* renamed from: b */
    public final H83 m80235b() {
        return this.f38732b.m84231G1();
    }

    @Override // p000.InterfaceC45879nm2
    /* renamed from: e */
    public C35055Os4 mo23185e(InterfaceC45879nm2 sourceCoordinates, boolean z) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        return m80235b().mo23185e(sourceCoordinates, z);
    }

    @Override // p000.InterfaceC45879nm2
    /* renamed from: i */
    public long mo23183i(long j) {
        return m80235b().mo23183i(j);
    }

    @Override // p000.InterfaceC45879nm2
    /* renamed from: t */
    public InterfaceC45879nm2 mo23182t() {
        return m80235b().mo23182t();
    }

    @Override // p000.InterfaceC45879nm2
    /* renamed from: y */
    public long mo23181y(long j) {
        return m80235b().mo23181y(j);
    }
}
