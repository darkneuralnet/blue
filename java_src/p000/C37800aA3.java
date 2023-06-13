package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
/* renamed from: aA3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37800aA3 extends C37457Yz3 {
    public C37800aA3(int i, Surface surface) {
        this(new OutputConfiguration(i, surface));
    }

    /* renamed from: l */
    public static C37800aA3 m71808l(OutputConfiguration outputConfiguration) {
        return new C37800aA3(outputConfiguration);
    }

    @Override // p000.C36287Tz3, p000.C38393bA3, p000.C36053Sz3.InterfaceC7626a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Surface mo64891a() {
        return super.mo64891a();
    }

    @Override // p000.C36989Wz3, p000.C38393bA3, p000.C36053Sz3.InterfaceC7626a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo64890b(Surface surface) {
        super.mo64890b(surface);
    }

    @Override // p000.C37457Yz3, p000.C36989Wz3, p000.C36287Tz3, p000.C38393bA3, p000.C36053Sz3.InterfaceC7626a
    /* renamed from: c */
    public /* bridge */ /* synthetic */ String mo64889c() {
        return super.mo64889c();
    }

    @Override // p000.C36989Wz3, p000.C36287Tz3, p000.C38393bA3, p000.C36053Sz3.InterfaceC7626a
    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo64888d() {
        super.mo64888d();
    }

    @Override // p000.C38393bA3, p000.C36053Sz3.InterfaceC7626a
    /* renamed from: e */
    public void mo64887e(long j) {
        if (j == -1) {
            return;
        }
        ((OutputConfiguration) mo64885g()).setStreamUseCase(j);
    }

    @Override // p000.C38393bA3
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p000.C37457Yz3, p000.C36989Wz3, p000.C36287Tz3, p000.C38393bA3, p000.C36053Sz3.InterfaceC7626a
    /* renamed from: f */
    public /* bridge */ /* synthetic */ void mo64886f(String str) {
        super.mo64886f(str);
    }

    @Override // p000.C37457Yz3, p000.C36989Wz3, p000.C36287Tz3, p000.C38393bA3, p000.C36053Sz3.InterfaceC7626a
    /* renamed from: g */
    public /* bridge */ /* synthetic */ Object mo64885g() {
        return super.mo64885g();
    }

    @Override // p000.C38393bA3
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public C37800aA3(Object obj) {
        super(obj);
    }
}
