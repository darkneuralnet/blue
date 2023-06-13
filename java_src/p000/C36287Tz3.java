package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;
/* renamed from: Tz3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C36287Tz3 extends C38393bA3 {

    /* renamed from: Tz3$a */
    /* loaded from: classes.dex */
    public static final class C8165a {

        /* renamed from: a */
        public final OutputConfiguration f36582a;

        /* renamed from: b */
        public String f36583b;

        /* renamed from: c */
        public boolean f36584c;

        public C8165a(OutputConfiguration outputConfiguration) {
            this.f36582a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8165a)) {
                return false;
            }
            C8165a c8165a = (C8165a) obj;
            if (!Objects.equals(this.f36582a, c8165a.f36582a) || this.f36584c != c8165a.f36584c || !Objects.equals(this.f36583b, c8165a.f36583b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f36582a.hashCode() ^ 31;
            int i = (this.f36584c ? 1 : 0) ^ ((hashCode2 << 5) - hashCode2);
            int i2 = (i << 5) - i;
            String str = this.f36583b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode ^ i2;
        }
    }

    public C36287Tz3(int i, Surface surface) {
        this(new C8165a(new OutputConfiguration(i, surface)));
    }

    /* renamed from: i */
    public static C36287Tz3 m82201i(OutputConfiguration outputConfiguration) {
        return new C36287Tz3(new C8165a(outputConfiguration));
    }

    @Override // p000.C38393bA3, p000.C36053Sz3.InterfaceC7626a
    /* renamed from: a */
    public Surface mo64891a() {
        return ((OutputConfiguration) mo64885g()).getSurface();
    }

    @Override // p000.C38393bA3, p000.C36053Sz3.InterfaceC7626a
    /* renamed from: c */
    public String mo64889c() {
        return ((C8165a) this.f57014a).f36583b;
    }

    @Override // p000.C38393bA3, p000.C36053Sz3.InterfaceC7626a
    /* renamed from: d */
    public void mo64888d() {
        ((C8165a) this.f57014a).f36584c = true;
    }

    @Override // p000.C38393bA3, p000.C36053Sz3.InterfaceC7626a
    /* renamed from: f */
    public void mo64886f(String str) {
        ((C8165a) this.f57014a).f36583b = str;
    }

    @Override // p000.C38393bA3, p000.C36053Sz3.InterfaceC7626a
    /* renamed from: g */
    public Object mo64885g() {
        HZ3.m103737a(this.f57014a instanceof C8165a);
        return ((C8165a) this.f57014a).f36582a;
    }

    @Override // p000.C38393bA3
    /* renamed from: h */
    public boolean mo64884h() {
        return ((C8165a) this.f57014a).f36584c;
    }

    public C36287Tz3(Object obj) {
        super(obj);
    }
}
