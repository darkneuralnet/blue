package p000;

import androidx.camera.core.AbstractC11253p;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.InterfaceC11191c;
import java.util.Collection;
/* renamed from: Lb0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC34196Lb0 extends InterfaceC45757na0, AbstractC11253p.InterfaceC11257d {

    /* renamed from: Lb0$a */
    /* loaded from: classes.dex */
    public enum EnumC5034a {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);
        

        /* renamed from: b */
        public final boolean f21738b;

        EnumC5034a(boolean z) {
            this.f21738b = z;
        }

        /* renamed from: b */
        public boolean m96605b() {
            return this.f21738b;
        }
    }

    @Override // p000.InterfaceC45757na0
    /* renamed from: a */
    default CameraControl mo23506a() {
        return mo4462k();
    }

    @Override // p000.InterfaceC45757na0
    /* renamed from: b */
    default InterfaceC33728Jb0 mo23505b() {
        return mo4467d();
    }

    /* renamed from: d */
    InterfaceC33962Kb0 mo4467d();

    /* renamed from: e */
    default boolean m96610e() {
        return mo23505b().mo100139b() == 0;
    }

    /* renamed from: f */
    default void mo96609f(InterfaceC11191c interfaceC11191c) {
    }

    /* renamed from: j */
    InterfaceC37493Zd3<EnumC5034a> mo4463j();

    /* renamed from: k */
    CameraControlInternal mo4462k();

    /* renamed from: l */
    default InterfaceC11191c mo96608l() {
        return C38634bb0.m64299a();
    }

    /* renamed from: n */
    default void mo96607n(boolean z) {
    }

    /* renamed from: o */
    void mo4460o(Collection<AbstractC11253p> collection);

    /* renamed from: p */
    void mo4459p(Collection<AbstractC11253p> collection);

    /* renamed from: q */
    default boolean mo4458q() {
        return true;
    }
}
