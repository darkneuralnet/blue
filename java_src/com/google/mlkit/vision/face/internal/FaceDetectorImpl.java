package com.google.mlkit.vision.face.internal;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.List;
import java.util.concurrent.Executor;
import p000.C42290hj1;
/* loaded from: classes6.dex */
public class FaceDetectorImpl extends MobileVisionBase<List<C39919dj1>> implements InterfaceC41697gj1 {

    /* renamed from: h */
    public static final C42290hj1 f74679h = new C42290hj1.C22712a().m35947a();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FaceDetectorImpl(C31792At8 c31792At8, C33549Ih1 c33549Ih1, C42290hj1 c42290hj1, C51674xY7 c51674xY7) {
        super(c31792At8, r2);
        EnumC41497gN8 enumC41497gN8;
        Executor m101805a = c33549Ih1.m101805a(c42290hj1.m35949f());
        C51993y49 m99216b = K69.m99216b(C42036hH8.m36559b());
        C51585xO8 c51585xO8 = new C51585xO8();
        if (C42036hH8.m36557d()) {
            enumC41497gN8 = EnumC41497gN8.TYPE_THICK;
        } else {
            enumC41497gN8 = EnumC41497gN8.TYPE_THIN;
        }
        c51585xO8.m5304e(enumC41497gN8);
        WQ8 wq8 = new WQ8();
        wq8.m78470e(C42036hH8.m36560a(c42290hj1));
        c51585xO8.m5302g(wq8.m78466i());
        m99216b.m4168g(C52596z59.m1826e(c51585xO8, 1), EnumC44471lO8.ON_DEVICE_FACE_CREATE);
    }

    @Override // p000.InterfaceC41697gj1
    /* renamed from: h */
    public final Task<List<C39919dj1>> mo37869h(C41304g32 c41304g32) {
        return super.m46762a(c41304g32);
    }
}
