package androidx.camera.core.impl;

import androidx.camera.core.C11154e;
import androidx.camera.core.impl.InterfaceC11197f;
/* renamed from: androidx.camera.core.impl.h */
/* loaded from: classes.dex */
public final class C11203h implements InterfaceC11225s<C11154e>, InterfaceC11206k, InterfaceC49609u36 {

    /* renamed from: F */
    public static final InterfaceC11197f.AbstractC11198a<Integer> f52608F = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageAnalysis.backpressureStrategy", C11154e.InterfaceC11156b.class);

    /* renamed from: G */
    public static final InterfaceC11197f.AbstractC11198a<Integer> f52609G = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);

    /* renamed from: H */
    public static final InterfaceC11197f.AbstractC11198a<LX1> f52610H = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageAnalysis.imageReaderProxyProvider", LX1.class);

    /* renamed from: I */
    public static final InterfaceC11197f.AbstractC11198a<Integer> f52611I = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageAnalysis.outputImageFormat", C11154e.InterfaceC11159e.class);

    /* renamed from: J */
    public static final InterfaceC11197f.AbstractC11198a<Boolean> f52612J = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);

    /* renamed from: K */
    public static final InterfaceC11197f.AbstractC11198a<Boolean> f52613K = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);

    /* renamed from: E */
    public final C11210n f52614E;

    public C11203h(C11210n c11210n) {
        this.f52614E = c11210n;
    }

    @Override // androidx.camera.core.impl.InterfaceC11212p
    /* renamed from: B */
    public InterfaceC11197f mo1036B() {
        return this.f52614E;
    }

    /* renamed from: R */
    public int m69402R(int i) {
        return ((Integer) mo69360d(f52608F, Integer.valueOf(i))).intValue();
    }

    /* renamed from: S */
    public int m69401S(int i) {
        return ((Integer) mo69360d(f52609G, Integer.valueOf(i))).intValue();
    }

    /* renamed from: T */
    public LX1 m69400T() {
        return (LX1) mo69360d(f52610H, null);
    }

    /* renamed from: U */
    public Boolean m69399U(Boolean bool) {
        return (Boolean) mo69360d(f52612J, bool);
    }

    /* renamed from: V */
    public int m69398V(int i) {
        return ((Integer) mo69360d(f52611I, Integer.valueOf(i))).intValue();
    }

    /* renamed from: W */
    public Boolean m69397W(Boolean bool) {
        return (Boolean) mo69360d(f52613K, bool);
    }

    @Override // androidx.camera.core.impl.InterfaceC11205j
    /* renamed from: l */
    public int mo69364l() {
        return 35;
    }
}
