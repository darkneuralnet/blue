package p000;

import android.support.annotation.Nullable;
import java.util.Arrays;
/* renamed from: eN6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40309eN6 {

    /* renamed from: a */
    public final String f78311a;

    /* renamed from: b */
    public final long f78312b;

    /* renamed from: c */
    public final int f78313c;

    /* renamed from: d */
    public final boolean f78314d;

    /* renamed from: e */
    public final boolean f78315e;

    /* renamed from: f */
    public final byte[] f78316f;

    public C40309eN6() {
    }

    public C40309eN6(@Nullable String str, long j, int i, boolean z, boolean z2, @Nullable byte[] bArr) {
        this();
        this.f78311a = str;
        this.f78312b = j;
        this.f78313c = i;
        this.f78314d = z;
        this.f78315e = z2;
        this.f78316f = bArr;
    }

    /* renamed from: a */
    public static C40309eN6 m42954a(@Nullable String str, long j, int i, boolean z, byte[] bArr, boolean z2) {
        return new C40309eN6(str, j, i, z, z2, bArr);
    }

    /* renamed from: b */
    public final boolean m42953b() {
        if (m42951d() == null) {
            return false;
        }
        return m42951d().endsWith("/");
    }

    /* renamed from: c */
    public final boolean m42952c() {
        return m42949f() == 0;
    }

    @Nullable
    /* renamed from: d */
    public String m42951d() {
        return this.f78311a;
    }

    /* renamed from: e */
    public long m42950e() {
        return this.f78312b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C40309eN6) {
            C40309eN6 c40309eN6 = (C40309eN6) obj;
            String str = this.f78311a;
            if (str != null ? str.equals(c40309eN6.m42951d()) : c40309eN6.m42951d() == null) {
                if (this.f78312b == c40309eN6.m42950e() && this.f78313c == c40309eN6.m42949f() && this.f78314d == c40309eN6.m42948g() && this.f78315e == c40309eN6.m42947h() && Arrays.equals(this.f78316f, c40309eN6.f78316f)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public int m42949f() {
        return this.f78313c;
    }

    /* renamed from: g */
    public boolean m42948g() {
        return this.f78314d;
    }

    /* renamed from: h */
    public boolean m42947h() {
        return this.f78315e;
    }

    public int hashCode() {
        String str = this.f78311a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f78312b;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f78313c) * 1000003) ^ (true != this.f78314d ? 1237 : 1231)) * 1000003) ^ (true == this.f78315e ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.f78316f);
    }

    @Nullable
    /* renamed from: i */
    public byte[] m42946i() {
        return this.f78316f;
    }

    public String toString() {
        String str = this.f78311a;
        long j = this.f78312b;
        int i = this.f78313c;
        boolean z = this.f78314d;
        boolean z2 = this.f78315e;
        String arrays = Arrays.toString(this.f78316f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        sb.append(", headerBytes=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
