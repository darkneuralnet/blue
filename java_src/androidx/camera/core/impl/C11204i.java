package androidx.camera.core.impl;

import androidx.camera.core.C11164h;
import androidx.camera.core.impl.InterfaceC11197f;
import java.util.concurrent.Executor;
/* renamed from: androidx.camera.core.impl.i */
/* loaded from: classes.dex */
public final class C11204i implements InterfaceC11225s<C11164h>, InterfaceC11206k, W92 {

    /* renamed from: F */
    public static final InterfaceC11197f.AbstractC11198a<Integer> f52615F;

    /* renamed from: G */
    public static final InterfaceC11197f.AbstractC11198a<Integer> f52616G;

    /* renamed from: H */
    public static final InterfaceC11197f.AbstractC11198a<InterfaceC37499Ze0> f52617H;

    /* renamed from: I */
    public static final InterfaceC11197f.AbstractC11198a<Integer> f52618I;

    /* renamed from: J */
    public static final InterfaceC11197f.AbstractC11198a<Integer> f52619J;

    /* renamed from: K */
    public static final InterfaceC11197f.AbstractC11198a<LX1> f52620K;

    /* renamed from: L */
    public static final InterfaceC11197f.AbstractC11198a<Boolean> f52621L;

    /* renamed from: M */
    public static final InterfaceC11197f.AbstractC11198a<Integer> f52622M;

    /* renamed from: N */
    public static final InterfaceC11197f.AbstractC11198a<Integer> f52623N;

    /* renamed from: E */
    public final C11210n f52624E;

    static {
        Class cls = Integer.TYPE;
        f52615F = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageCapture.captureMode", cls);
        f52616G = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageCapture.flashMode", cls);
        f52617H = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageCapture.captureBundle", InterfaceC37499Ze0.class);
        f52618I = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageCapture.bufferFormat", Integer.class);
        f52619J = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        f52620K = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageCapture.imageReaderProxyProvider", LX1.class);
        f52621L = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
        f52622M = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageCapture.flashType", cls);
        f52623N = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageCapture.jpegCompressionQuality", cls);
    }

    public C11204i(C11210n c11210n) {
        this.f52624E = c11210n;
    }

    @Override // androidx.camera.core.impl.InterfaceC11212p
    /* renamed from: B */
    public InterfaceC11197f mo1036B() {
        return this.f52624E;
    }

    /* renamed from: R */
    public Integer m69396R(Integer num) {
        return (Integer) mo69360d(f52618I, num);
    }

    /* renamed from: S */
    public InterfaceC37499Ze0 m69395S(InterfaceC37499Ze0 interfaceC37499Ze0) {
        return (InterfaceC37499Ze0) mo69360d(f52617H, interfaceC37499Ze0);
    }

    /* renamed from: T */
    public int m69394T() {
        return ((Integer) mo69363a(f52615F)).intValue();
    }

    /* renamed from: U */
    public int m69393U(int i) {
        return ((Integer) mo69360d(f52616G, Integer.valueOf(i))).intValue();
    }

    /* renamed from: V */
    public int m69392V(int i) {
        return ((Integer) mo69360d(f52622M, Integer.valueOf(i))).intValue();
    }

    /* renamed from: W */
    public LX1 m69391W() {
        return (LX1) mo69360d(f52620K, null);
    }

    /* renamed from: X */
    public Executor m69390X(Executor executor) {
        return (Executor) mo69360d(W92.f40501a, executor);
    }

    /* renamed from: Y */
    public int m69389Y() {
        return ((Integer) mo69363a(f52623N)).intValue();
    }

    /* renamed from: Z */
    public boolean m69388Z() {
        return mo69359e(f52615F);
    }

    /* renamed from: a0 */
    public boolean m69387a0() {
        return ((Boolean) mo69360d(f52621L, Boolean.FALSE)).booleanValue();
    }

    @Override // androidx.camera.core.impl.InterfaceC11205j
    /* renamed from: l */
    public int mo69364l() {
        return ((Integer) mo69363a(InterfaceC11205j.f52625k)).intValue();
    }
}
