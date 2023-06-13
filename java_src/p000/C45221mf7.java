package p000;

import com.google.mlkit.vision.common.internal.C18452a;
import com.google.mlkit.vision.objects.internal.ObjectDetectorImpl;
/* renamed from: mf7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45221mf7 implements C18452a.InterfaceC18453a {

    /* renamed from: a */
    public final HC7 f98534a;

    /* renamed from: b */
    public final Se9 f98535b;

    /* renamed from: c */
    public final C33549Ih1 f98536c;

    public C45221mf7(HC7 hc7, C33549Ih1 c33549Ih1) {
        Se9 m2914b = C52347yg9.m2914b("object-detection");
        this.f98534a = hc7;
        this.f98535b = m2914b;
        this.f98536c = c33549Ih1;
    }

    @Override // com.google.mlkit.vision.common.internal.C18452a.InterfaceC18453a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C18452a.InterfaceC18455c mo25204a(C18452a.InterfaceC18454b interfaceC18454b) {
        C34451Md3 c34451Md3 = (C34451Md3) interfaceC18454b;
        Se9 se9 = this.f98535b;
        C52250yW8 c52250yW8 = new C52250yW8();
        c52250yW8.m3390e(TV8.TYPE_THICK);
        Q19 q19 = new Q19();
        q19.m89105b(DA8.m110805b(c34451Md3));
        q19.m89104c(EnumC39189cW8.NO_ERROR);
        c52250yW8.m3388g(q19.m89103d());
        se9.m85156d(C47595qf9.m17259e(c52250yW8, 1), EnumC45136mW8.ON_DEVICE_OBJECT_CREATE);
        return ObjectDetectorImpl.m46753f((LE2) this.f98534a.m98291b(c34451Md3), this.f98536c.m101805a(c34451Md3.m93688b()));
    }
}
