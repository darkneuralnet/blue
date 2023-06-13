package p000;

import androidx.camera.core.AbstractC11253p;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.lifecycle.C11260b;
/* renamed from: r64  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C47859r64 implements InterfaceC47266q64 {

    /* renamed from: a */
    public final C11260b f106475a;

    public C47859r64(C11260b c11260b) {
        this.f106475a = c11260b;
    }

    @Override // p000.InterfaceC47266q64
    /* renamed from: a */
    public boolean mo16480a(C42812ic0 c42812ic0) throws CameraInfoUnavailableException {
        return this.f106475a.m69003j(c42812ic0);
    }

    @Override // p000.InterfaceC47266q64
    /* renamed from: b */
    public void mo16479b(AbstractC11253p... abstractC11253pArr) {
        this.f106475a.m68996q(abstractC11253pArr);
    }

    @Override // p000.InterfaceC47266q64
    /* renamed from: c */
    public void mo16478c() {
        this.f106475a.m68995r();
    }

    @Override // p000.InterfaceC47266q64
    /* renamed from: d */
    public InterfaceC45757na0 mo16477d(LifecycleOwner lifecycleOwner, C42812ic0 c42812ic0, C37280Yf6 c37280Yf6) {
        return this.f106475a.m69009d(lifecycleOwner, c42812ic0, c37280Yf6);
    }
}
