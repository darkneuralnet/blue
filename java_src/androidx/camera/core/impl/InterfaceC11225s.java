package androidx.camera.core.impl;

import android.util.Range;
import androidx.camera.core.AbstractC11253p;
import androidx.camera.core.impl.C11192d;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.InterfaceC11197f;
/* renamed from: androidx.camera.core.impl.s */
/* loaded from: classes.dex */
public interface InterfaceC11225s<T extends AbstractC11253p> extends RY5<T>, InterfaceC37046Xf6, InterfaceC11205j {

    /* renamed from: C */
    public static final InterfaceC11197f.AbstractC11198a<Boolean> f52670C;

    /* renamed from: D */
    public static final InterfaceC11197f.AbstractC11198a<Boolean> f52671D;

    /* renamed from: v */
    public static final InterfaceC11197f.AbstractC11198a<C11213q> f52672v = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.useCase.defaultSessionConfig", C11213q.class);

    /* renamed from: w */
    public static final InterfaceC11197f.AbstractC11198a<C11192d> f52673w = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.useCase.defaultCaptureConfig", C11192d.class);

    /* renamed from: x */
    public static final InterfaceC11197f.AbstractC11198a<C11213q.InterfaceC11217d> f52674x = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.useCase.sessionConfigUnpacker", C11213q.InterfaceC11217d.class);

    /* renamed from: y */
    public static final InterfaceC11197f.AbstractC11198a<C11192d.InterfaceC11194b> f52675y = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.useCase.captureConfigUnpacker", C11192d.InterfaceC11194b.class);

    /* renamed from: z */
    public static final InterfaceC11197f.AbstractC11198a<Integer> f52676z = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE);

    /* renamed from: A */
    public static final InterfaceC11197f.AbstractC11198a<C42812ic0> f52668A = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.useCase.cameraSelector", C42812ic0.class);

    /* renamed from: B */
    public static final InterfaceC11197f.AbstractC11198a<Range<Integer>> f52669B = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.useCase.targetFrameRate", Range.class);

    /* renamed from: androidx.camera.core.impl.s$a */
    /* loaded from: classes.dex */
    public interface InterfaceC11226a<T extends AbstractC11253p, C extends InterfaceC11225s<T>, B> extends InterfaceC32388Di1<T> {
        /* renamed from: d */
        C mo1341d();
    }

    static {
        Class cls = Boolean.TYPE;
        f52670C = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.useCase.zslDisabled", cls);
        f52671D = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.useCase.highResolutionDisabled", cls);
    }

    /* renamed from: D */
    default C11192d m69277D(C11192d c11192d) {
        return (C11192d) mo69360d(f52673w, c11192d);
    }

    /* renamed from: K */
    default boolean m69276K(boolean z) {
        return ((Boolean) mo69360d(f52670C, Boolean.valueOf(z))).booleanValue();
    }

    /* renamed from: L */
    default int m69275L() {
        return ((Integer) mo69363a(f52676z)).intValue();
    }

    /* renamed from: M */
    default Range<Integer> m69274M(Range<Integer> range) {
        return (Range) mo69360d(f52669B, range);
    }

    /* renamed from: P */
    default C11213q.InterfaceC11217d m69273P(C11213q.InterfaceC11217d interfaceC11217d) {
        return (C11213q.InterfaceC11217d) mo69360d(f52674x, interfaceC11217d);
    }

    /* renamed from: m */
    default C11213q m69272m(C11213q c11213q) {
        return (C11213q) mo69360d(f52672v, c11213q);
    }

    /* renamed from: o */
    default C11192d.InterfaceC11194b m69271o(C11192d.InterfaceC11194b interfaceC11194b) {
        return (C11192d.InterfaceC11194b) mo69360d(f52675y, interfaceC11194b);
    }

    /* renamed from: r */
    default int m69270r(int i) {
        return ((Integer) mo69360d(f52676z, Integer.valueOf(i))).intValue();
    }

    /* renamed from: w */
    default C42812ic0 m69269w(C42812ic0 c42812ic0) {
        return (C42812ic0) mo69360d(f52668A, c42812ic0);
    }
}
