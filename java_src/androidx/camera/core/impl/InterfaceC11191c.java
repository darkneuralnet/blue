package androidx.camera.core.impl;

import androidx.camera.core.impl.InterfaceC11197f;
/* renamed from: androidx.camera.core.impl.c */
/* loaded from: classes.dex */
public interface InterfaceC11191c extends InterfaceC11212p {

    /* renamed from: f */
    public static final InterfaceC11197f.AbstractC11198a<InterfaceC36578Vf6> f52577f = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.camera.useCaseConfigFactory", InterfaceC36578Vf6.class);

    /* renamed from: g */
    public static final InterfaceC11197f.AbstractC11198a<AbstractC42757iW1> f52578g = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.camera.compatibilityId", AbstractC42757iW1.class);

    /* renamed from: h */
    public static final InterfaceC11197f.AbstractC11198a<Integer> f52579h = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);

    /* renamed from: i */
    public static final InterfaceC11197f.AbstractC11198a<InterfaceC52493yv5> f52580i = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.camera.SessionProcessor", InterfaceC52493yv5.class);

    /* renamed from: j */
    public static final InterfaceC11197f.AbstractC11198a<Boolean> f52581j = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.camera.isZslDisabled", Boolean.class);

    /* renamed from: E */
    default int m69455E() {
        return ((Integer) mo69360d(f52579h, 0)).intValue();
    }

    /* renamed from: Q */
    default InterfaceC52493yv5 m69454Q(InterfaceC52493yv5 interfaceC52493yv5) {
        return (InterfaceC52493yv5) mo69360d(f52580i, interfaceC52493yv5);
    }

    /* renamed from: j */
    default InterfaceC36578Vf6 m69453j() {
        return (InterfaceC36578Vf6) mo69360d(f52577f, InterfaceC36578Vf6.f39423a);
    }

    /* renamed from: v */
    AbstractC42757iW1 mo64298v();
}
