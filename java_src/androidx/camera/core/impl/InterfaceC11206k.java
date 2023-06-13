package androidx.camera.core.impl;

import android.util.Pair;
import android.util.Size;
import androidx.camera.core.C11240m;
import androidx.camera.core.impl.InterfaceC11197f;
import java.util.ArrayList;
import java.util.List;
/* renamed from: androidx.camera.core.impl.k */
/* loaded from: classes.dex */
public interface InterfaceC11206k extends InterfaceC11212p {

    /* renamed from: l */
    public static final InterfaceC11197f.AbstractC11198a<Integer> f52626l = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageOutput.targetAspectRatio", C3231Ho.class);

    /* renamed from: m */
    public static final InterfaceC11197f.AbstractC11198a<Integer> f52627m;

    /* renamed from: n */
    public static final InterfaceC11197f.AbstractC11198a<Integer> f52628n;

    /* renamed from: o */
    public static final InterfaceC11197f.AbstractC11198a<Integer> f52629o;

    /* renamed from: p */
    public static final InterfaceC11197f.AbstractC11198a<Size> f52630p;

    /* renamed from: q */
    public static final InterfaceC11197f.AbstractC11198a<Size> f52631q;

    /* renamed from: r */
    public static final InterfaceC11197f.AbstractC11198a<Size> f52632r;

    /* renamed from: s */
    public static final InterfaceC11197f.AbstractC11198a<List<Pair<Integer, Size[]>>> f52633s;

    /* renamed from: t */
    public static final InterfaceC11197f.AbstractC11198a<C11240m> f52634t;

    /* renamed from: u */
    public static final InterfaceC11197f.AbstractC11198a<List<Size>> f52635u;

    /* renamed from: androidx.camera.core.impl.k$a */
    /* loaded from: classes.dex */
    public interface InterfaceC11207a<B> {
        /* renamed from: a */
        B mo69158a(int i);

        /* renamed from: c */
        B mo69157c(Size size);
    }

    static {
        Class cls = Integer.TYPE;
        f52627m = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageOutput.targetRotation", cls);
        f52628n = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageOutput.appTargetRotation", cls);
        f52629o = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageOutput.mirrorMode", cls);
        f52630p = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageOutput.targetResolution", Size.class);
        f52631q = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageOutput.defaultResolution", Size.class);
        f52632r = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageOutput.maxResolution", Size.class);
        f52633s = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageOutput.supportedResolutions", List.class);
        f52634t = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageOutput.resolutionSelector", C11240m.class);
        f52635u = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.imageOutput.customOrderedResolutions", List.class);
    }

    /* renamed from: F */
    static void m69385F(InterfaceC11206k interfaceC11206k) {
        boolean z;
        boolean m69384G = interfaceC11206k.m69384G();
        if (interfaceC11206k.m69376u(null) != null) {
            z = true;
        } else {
            z = false;
        }
        if (m69384G && z) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (interfaceC11206k.m69374z(null) != null) {
            if (m69384G || z) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    /* renamed from: A */
    default C11240m m69386A() {
        return (C11240m) mo69363a(f52634t);
    }

    /* renamed from: G */
    default boolean m69384G() {
        return mo69359e(f52626l);
    }

    /* renamed from: I */
    default int m69383I() {
        return ((Integer) mo69363a(f52626l)).intValue();
    }

    /* renamed from: J */
    default Size m69382J(Size size) {
        return (Size) mo69360d(f52631q, size);
    }

    /* renamed from: i */
    default Size m69381i(Size size) {
        return (Size) mo69360d(f52632r, size);
    }

    /* renamed from: k */
    default List<Pair<Integer, Size[]>> m69380k(List<Pair<Integer, Size[]>> list) {
        return (List) mo69360d(f52633s, list);
    }

    /* renamed from: p */
    default int m69379p(int i) {
        return ((Integer) mo69360d(f52628n, Integer.valueOf(i))).intValue();
    }

    /* renamed from: s */
    default int m69378s(int i) {
        return ((Integer) mo69360d(f52627m, Integer.valueOf(i))).intValue();
    }

    /* renamed from: t */
    default List<Size> m69377t(List<Size> list) {
        List list2 = (List) mo69360d(f52635u, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    /* renamed from: u */
    default Size m69376u(Size size) {
        return (Size) mo69360d(f52630p, size);
    }

    /* renamed from: y */
    default int m69375y(int i) {
        return ((Integer) mo69360d(f52629o, Integer.valueOf(i))).intValue();
    }

    /* renamed from: z */
    default C11240m m69374z(C11240m c11240m) {
        return (C11240m) mo69360d(f52634t, c11240m);
    }
}
