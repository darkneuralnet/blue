package p000;

import android.net.Uri;
import p000.Np9;
/* renamed from: Yi8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37309Yi8<T extends Np9> extends AbstractC34996Ol8<T> {

    /* renamed from: a */
    public final Uri f46358a;

    /* renamed from: b */
    public final T f46359b;

    /* renamed from: c */
    public final C45262mj8<T> f46360c;

    /* renamed from: d */
    public final ZP8<InterfaceC34744Nj8<T>> f46361d;

    /* renamed from: e */
    public final boolean f46362e;

    /* renamed from: f */
    public final boolean f46363f;

    /* renamed from: g */
    public final boolean f46364g;

    /* renamed from: h */
    public final C35014On8 f46365h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C37309Yi8(Uri uri, Np9 np9, C45262mj8 c45262mj8, ZP8 zp8, C35014On8 c35014On8, boolean z, boolean z2, boolean z3, C51180wi8 c51180wi8, byte[] bArr) {
        this.f46358a = uri;
        this.f46359b = np9;
        this.f46360c = c45262mj8;
        this.f46361d = zp8;
        this.f46365h = c35014On8;
        this.f46362e = z;
        this.f46363f = z2;
        this.f46364g = z3;
    }

    @Override // p000.AbstractC34996Ol8
    /* renamed from: a */
    public final Uri mo74359a() {
        return this.f46358a;
    }

    @Override // p000.AbstractC34996Ol8
    /* renamed from: b */
    public final C45262mj8<T> mo74358b() {
        return this.f46360c;
    }

    @Override // p000.AbstractC34996Ol8
    /* renamed from: c */
    public final ZP8<InterfaceC34744Nj8<T>> mo74357c() {
        return this.f46361d;
    }

    @Override // p000.AbstractC34996Ol8
    /* renamed from: d */
    public final T mo74356d() {
        return this.f46359b;
    }

    @Override // p000.AbstractC34996Ol8
    /* renamed from: e */
    public final boolean mo74355e() {
        return this.f46364g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC34996Ol8) {
            AbstractC34996Ol8 abstractC34996Ol8 = (AbstractC34996Ol8) obj;
            if (this.f46358a.equals(abstractC34996Ol8.mo74359a()) && this.f46359b.equals(abstractC34996Ol8.mo74356d()) && this.f46360c.equals(abstractC34996Ol8.mo74358b()) && this.f46361d.equals(abstractC34996Ol8.mo74357c()) && this.f46365h.equals(abstractC34996Ol8.mo74352h()) && this.f46362e == abstractC34996Ol8.mo74353g() && this.f46363f == abstractC34996Ol8.mo74354f() && this.f46364g == abstractC34996Ol8.mo74355e()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC34996Ol8
    /* renamed from: f */
    public final boolean mo74354f() {
        return this.f46363f;
    }

    @Override // p000.AbstractC34996Ol8
    /* renamed from: g */
    public final boolean mo74353g() {
        return this.f46362e;
    }

    @Override // p000.AbstractC34996Ol8
    /* renamed from: h */
    public final C35014On8 mo74352h() {
        return this.f46365h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (((((((((this.f46358a.hashCode() ^ 1000003) * 1000003) ^ this.f46359b.hashCode()) * 1000003) ^ this.f46360c.hashCode()) * 1000003) ^ this.f46361d.hashCode()) * 1000003) ^ this.f46365h.hashCode()) * 1000003;
        int i3 = 1237;
        if (true != this.f46362e) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i4 = (hashCode ^ i) * 1000003;
        if (true != this.f46363f) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i5 = (i4 ^ i2) * 1000003;
        if (true == this.f46364g) {
            i3 = 1231;
        }
        return i5 ^ i3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f46358a);
        String valueOf2 = String.valueOf(this.f46359b);
        String valueOf3 = String.valueOf(this.f46360c);
        String valueOf4 = String.valueOf(this.f46361d);
        String valueOf5 = String.valueOf(this.f46365h);
        boolean z = this.f46362e;
        boolean z2 = this.f46363f;
        boolean z3 = this.f46364g;
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        StringBuilder sb = new StringBuilder(length + 162 + length2 + length3 + valueOf4.length() + valueOf5.length());
        sb.append("ProtoDataStoreConfig{uri=");
        sb.append(valueOf);
        sb.append(", schema=");
        sb.append(valueOf2);
        sb.append(", handler=");
        sb.append(valueOf3);
        sb.append(", migrations=");
        sb.append(valueOf4);
        sb.append(", variantConfig=");
        sb.append(valueOf5);
        sb.append(", useGeneratedExtensionRegistry=");
        sb.append(z);
        sb.append(", updateSequencingBugFix=");
        sb.append(z2);
        sb.append(", enableTracing=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
