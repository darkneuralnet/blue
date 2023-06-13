package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;
/* renamed from: Wz3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C36989Wz3 extends C36287Tz3 {

    /* renamed from: Wz3$a */
    /* loaded from: classes.dex */
    public static final class C9249a {

        /* renamed from: a */
        public final OutputConfiguration f42431a;

        /* renamed from: b */
        public String f42432b;

        public C9249a(OutputConfiguration outputConfiguration) {
            this.f42431a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C9249a)) {
                return false;
            }
            C9249a c9249a = (C9249a) obj;
            if (!Objects.equals(this.f42431a, c9249a.f42431a) || !Objects.equals(this.f42432b, c9249a.f42432b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f42431a.hashCode() ^ 31;
            int i = (hashCode2 << 5) - hashCode2;
            String str = this.f42432b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode ^ i;
        }
    }

    public C36989Wz3(int i, Surface surface) {
        this(new C9249a(new OutputConfiguration(i, surface)));
    }

    /* renamed from: j */
    public static C36989Wz3 m77585j(OutputConfiguration outputConfiguration) {
        return new C36989Wz3(new C9249a(outputConfiguration));
    }

    @Override // p000.C38393bA3, p000.C36053Sz3.InterfaceC7626a
    /* renamed from: b */
    public void mo64890b(Surface surface) {
        ((OutputConfiguration) mo64885g()).addSurface(surface);
    }

    @Override // p000.C36287Tz3, p000.C38393bA3, p000.C36053Sz3.InterfaceC7626a
    /* renamed from: c */
    public String mo64889c() {
        return ((C9249a) this.f57014a).f42432b;
    }

    @Override // p000.C36287Tz3, p000.C38393bA3, p000.C36053Sz3.InterfaceC7626a
    /* renamed from: d */
    public void mo64888d() {
        ((OutputConfiguration) mo64885g()).enableSurfaceSharing();
    }

    @Override // p000.C36287Tz3, p000.C38393bA3, p000.C36053Sz3.InterfaceC7626a
    /* renamed from: f */
    public void mo64886f(String str) {
        ((C9249a) this.f57014a).f42432b = str;
    }

    @Override // p000.C36287Tz3, p000.C38393bA3, p000.C36053Sz3.InterfaceC7626a
    /* renamed from: g */
    public Object mo64885g() {
        HZ3.m103737a(this.f57014a instanceof C9249a);
        return ((C9249a) this.f57014a).f42431a;
    }

    @Override // p000.C36287Tz3, p000.C38393bA3
    /* renamed from: h */
    public final boolean mo64884h() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    public C36989Wz3(Object obj) {
        super(obj);
    }
}
