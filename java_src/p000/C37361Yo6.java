package p000;

import androidx.camera.core.impl.C11210n;
import androidx.camera.core.impl.InterfaceC11197f;
import androidx.camera.core.impl.InterfaceC11206k;
import androidx.camera.core.impl.InterfaceC11225s;
import java.util.Objects;
import p000.InterfaceC49470tp6;
/* renamed from: Yo6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37361Yo6<T extends InterfaceC49470tp6> implements InterfaceC11225s<C36425Uo6<T>>, InterfaceC11206k, InterfaceC49609u36 {

    /* renamed from: F */
    public static final InterfaceC11197f.AbstractC11198a<InterfaceC49470tp6> f46676F = InterfaceC11197f.AbstractC11198a.m69420a("camerax.video.VideoCapture.videoOutput", InterfaceC49470tp6.class);

    /* renamed from: G */
    public static final InterfaceC11197f.AbstractC11198a<InterfaceC51452xA1<AbstractC39983dp6, InterfaceC42355hp6>> f46677G = InterfaceC11197f.AbstractC11198a.m69420a("camerax.video.VideoCapture.videoEncoderInfoFinder", InterfaceC51452xA1.class);

    /* renamed from: E */
    public final C11210n f46678E;

    public C37361Yo6(C11210n c11210n) {
        this.f46678E = c11210n;
    }

    @Override // androidx.camera.core.impl.InterfaceC11212p
    /* renamed from: B */
    public InterfaceC11197f mo1036B() {
        return this.f46678E;
    }

    /* renamed from: R */
    public InterfaceC51452xA1<AbstractC39983dp6, InterfaceC42355hp6> m74184R() {
        InterfaceC51452xA1<AbstractC39983dp6, InterfaceC42355hp6> interfaceC51452xA1 = (InterfaceC51452xA1) mo69363a(f46677G);
        Objects.requireNonNull(interfaceC51452xA1);
        return interfaceC51452xA1;
    }

    /* renamed from: S */
    public T m74183S() {
        return (T) mo69363a(f46676F);
    }

    @Override // androidx.camera.core.impl.InterfaceC11205j
    /* renamed from: l */
    public int mo69364l() {
        return 34;
    }
}
