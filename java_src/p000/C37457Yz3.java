package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
/* renamed from: Yz3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37457Yz3 extends C36989Wz3 {
    public C37457Yz3(int i, Surface surface) {
        this(new OutputConfiguration(i, surface));
    }

    /* renamed from: k */
    public static C37457Yz3 m73939k(OutputConfiguration outputConfiguration) {
        return new C37457Yz3(outputConfiguration);
    }

    @Override // p000.C36989Wz3, p000.C36287Tz3, p000.C38393bA3, p000.C36053Sz3.InterfaceC7626a
    /* renamed from: c */
    public String mo64889c() {
        return null;
    }

    @Override // p000.C36989Wz3, p000.C36287Tz3, p000.C38393bA3, p000.C36053Sz3.InterfaceC7626a
    /* renamed from: f */
    public void mo64886f(String str) {
        ((OutputConfiguration) mo64885g()).setPhysicalCameraId(str);
    }

    @Override // p000.C36989Wz3, p000.C36287Tz3, p000.C38393bA3, p000.C36053Sz3.InterfaceC7626a
    /* renamed from: g */
    public Object mo64885g() {
        HZ3.m103737a(this.f57014a instanceof OutputConfiguration);
        return this.f57014a;
    }

    public C37457Yz3(Object obj) {
        super(obj);
    }
}
