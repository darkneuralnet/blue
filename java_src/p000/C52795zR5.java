package p000;

import androidx.camera.core.impl.C11209m;
import androidx.camera.core.impl.C11210n;
import androidx.camera.core.impl.InterfaceC11208l;
import androidx.camera.core.impl.InterfaceC11225s;
import co.bird.android.model.Detail;
import java.util.UUID;
/* renamed from: zR5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C52795zR5 implements InterfaceC11225s.InterfaceC11226a<C52202yR5, AR5, C52795zR5> {

    /* renamed from: a */
    public final C11209m f121379a;

    public C52795zR5() {
        this(C11209m.m69372V());
    }

    @Override // androidx.camera.core.impl.InterfaceC11225s.InterfaceC11226a
    /* renamed from: a */
    public AR5 mo1341d() {
        return new AR5(C11210n.m69366T(this.f121379a));
    }

    @Override // p000.InterfaceC32388Di1
    /* renamed from: b */
    public InterfaceC11208l mo1343b() {
        return this.f121379a;
    }

    /* renamed from: c */
    public C52795zR5 m1342c(Class<C52202yR5> cls) {
        mo1343b().mo69373C(RY5.f32204c, cls);
        if (mo1343b().mo69360d(RY5.f32203b, null) == null) {
            m1340e(cls.getCanonicalName() + Detail.EMPTY_CHAR + UUID.randomUUID());
        }
        return this;
    }

    /* renamed from: e */
    public C52795zR5 m1340e(String str) {
        mo1343b().mo69373C(RY5.f32203b, str);
        return this;
    }

    public C52795zR5(C11209m c11209m) {
        this.f121379a = c11209m;
        Class cls = (Class) c11209m.mo69360d(RY5.f32204c, null);
        if (cls != null && !cls.equals(C52202yR5.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        m1342c(C52202yR5.class);
    }
}
