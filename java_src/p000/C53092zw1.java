package p000;

import android.util.Base64;
import co.bird.android.model.Detail;
import java.util.List;
/* renamed from: zw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53092zw1 {

    /* renamed from: a */
    public final String f122495a;

    /* renamed from: b */
    public final String f122496b;

    /* renamed from: c */
    public final String f122497c;

    /* renamed from: d */
    public final List<List<byte[]>> f122498d;

    /* renamed from: e */
    public final int f122499e = 0;

    /* renamed from: f */
    public final String f122500f;

    public C53092zw1(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f122495a = (String) HZ3.m103731g(str);
        this.f122496b = (String) HZ3.m103731g(str2);
        this.f122497c = (String) HZ3.m103731g(str3);
        this.f122498d = (List) HZ3.m103731g(list);
        this.f122500f = m107a(str, str2, str3);
    }

    /* renamed from: a */
    public final String m107a(String str, String str2, String str3) {
        return str + Detail.EMPTY_CHAR + str2 + Detail.EMPTY_CHAR + str3;
    }

    /* renamed from: b */
    public List<List<byte[]>> m106b() {
        return this.f122498d;
    }

    /* renamed from: c */
    public int m105c() {
        return this.f122499e;
    }

    /* renamed from: d */
    public String m104d() {
        return this.f122500f;
    }

    /* renamed from: e */
    public String m103e() {
        return this.f122495a;
    }

    /* renamed from: f */
    public String m102f() {
        return this.f122496b;
    }

    /* renamed from: g */
    public String m101g() {
        return this.f122497c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f122495a + ", mProviderPackage: " + this.f122496b + ", mQuery: " + this.f122497c + ", mCertificates:");
        for (int i = 0; i < this.f122498d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f122498d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f122499e);
        return sb.toString();
    }
}
