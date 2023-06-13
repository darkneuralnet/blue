package p000;

import androidx.camera.core.impl.C11192d;
import androidx.camera.core.impl.C11204i;
import androidx.camera.core.impl.InterfaceC11225s;
import p000.C43385ja0;
/* renamed from: iX1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42766iX1 extends L90 {

    /* renamed from: c */
    public static final C42766iX1 f87445c = new C42766iX1(new C43952kX1());

    /* renamed from: b */
    public final C43952kX1 f87446b;

    public C42766iX1(C43952kX1 c43952kX1) {
        this.f87446b = c43952kX1;
    }

    @Override // p000.L90, androidx.camera.core.impl.C11192d.InterfaceC11194b
    /* renamed from: a */
    public void mo33844a(InterfaceC11225s<?> interfaceC11225s, C11192d.C11193a c11193a) {
        super.mo33844a(interfaceC11225s, c11193a);
        if (interfaceC11225s instanceof C11204i) {
            C11204i c11204i = (C11204i) interfaceC11225s;
            C43385ja0.C24930a c24930a = new C43385ja0.C24930a();
            if (c11204i.m69388Z()) {
                this.f87446b.m28869a(c11204i.m69394T(), c24930a);
            }
            c11193a.m69439e(c24930a.m30300a());
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
