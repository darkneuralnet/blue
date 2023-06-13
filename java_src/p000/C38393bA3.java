package p000;

import android.util.Size;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import p000.C36053Sz3;
/* renamed from: bA3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C38393bA3 implements C36053Sz3.InterfaceC7626a {

    /* renamed from: a */
    public final Object f57014a;

    /* renamed from: bA3$a */
    /* loaded from: classes.dex */
    public static final class C12314a {

        /* renamed from: a */
        public final List<Surface> f57015a;

        /* renamed from: b */
        public final Size f57016b;

        /* renamed from: c */
        public final int f57017c;

        /* renamed from: d */
        public final int f57018d;

        /* renamed from: e */
        public String f57019e;

        /* renamed from: f */
        public boolean f57020f;

        public boolean equals(Object obj) {
            if (!(obj instanceof C12314a)) {
                return false;
            }
            C12314a c12314a = (C12314a) obj;
            if (!this.f57016b.equals(c12314a.f57016b) || this.f57017c != c12314a.f57017c || this.f57018d != c12314a.f57018d || this.f57020f != c12314a.f57020f || !Objects.equals(this.f57019e, c12314a.f57019e)) {
                return false;
            }
            int min = Math.min(this.f57015a.size(), c12314a.f57015a.size());
            for (int i = 0; i < min; i++) {
                if (this.f57015a.get(i) != c12314a.f57015a.get(i)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f57015a.hashCode() ^ 31;
            int i = this.f57018d ^ ((hashCode2 << 5) - hashCode2);
            int hashCode3 = this.f57016b.hashCode() ^ ((i << 5) - i);
            int i2 = this.f57017c ^ ((hashCode3 << 5) - hashCode3);
            int i3 = (this.f57020f ? 1 : 0) ^ ((i2 << 5) - i2);
            int i4 = (i3 << 5) - i3;
            String str = this.f57019e;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode ^ i4;
        }
    }

    public C38393bA3(Object obj) {
        this.f57014a = obj;
    }

    @Override // p000.C36053Sz3.InterfaceC7626a
    /* renamed from: a */
    public Surface mo64891a() {
        List<Surface> list = ((C12314a) this.f57014a).f57015a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    @Override // p000.C36053Sz3.InterfaceC7626a
    /* renamed from: b */
    public void mo64890b(Surface surface) {
        HZ3.m103730h(surface, "Surface must not be null");
        if (mo64891a() != surface) {
            if (!mo64884h()) {
                throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
            }
            throw new IllegalArgumentException("Exceeds maximum number of surfaces");
        }
        throw new IllegalStateException("Surface is already added!");
    }

    @Override // p000.C36053Sz3.InterfaceC7626a
    /* renamed from: c */
    public String mo64889c() {
        return ((C12314a) this.f57014a).f57019e;
    }

    @Override // p000.C36053Sz3.InterfaceC7626a
    /* renamed from: d */
    public void mo64888d() {
        ((C12314a) this.f57014a).f57020f = true;
    }

    @Override // p000.C36053Sz3.InterfaceC7626a
    /* renamed from: e */
    public void mo64887e(long j) {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C38393bA3)) {
            return false;
        }
        return Objects.equals(this.f57014a, ((C38393bA3) obj).f57014a);
    }

    @Override // p000.C36053Sz3.InterfaceC7626a
    /* renamed from: f */
    public void mo64886f(String str) {
        ((C12314a) this.f57014a).f57019e = str;
    }

    @Override // p000.C36053Sz3.InterfaceC7626a
    /* renamed from: g */
    public Object mo64885g() {
        return null;
    }

    /* renamed from: h */
    public boolean mo64884h() {
        return ((C12314a) this.f57014a).f57020f;
    }

    public int hashCode() {
        return this.f57014a.hashCode();
    }
}
