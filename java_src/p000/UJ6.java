package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.annotation.Nullable;
import java.util.List;
/* renamed from: UJ6 */
/* loaded from: classes6.dex */
public final class UJ6 extends AbstractC39114cO5 {

    /* renamed from: a */
    public final int f37228a;

    /* renamed from: b */
    public final int f37229b;

    /* renamed from: c */
    public final int f37230c;

    /* renamed from: d */
    public final long f37231d;

    /* renamed from: e */
    public final long f37232e;

    /* renamed from: f */
    public final List<String> f37233f;

    /* renamed from: g */
    public final List<String> f37234g;

    /* renamed from: h */
    public final PendingIntent f37235h;

    /* renamed from: i */
    public final List<Intent> f37236i;

    public UJ6(int i, int i2, int i3, long j, long j2, @Nullable List<String> list, @Nullable List<String> list2, @Nullable PendingIntent pendingIntent, @Nullable List<Intent> list3) {
        this.f37228a = i;
        this.f37229b = i2;
        this.f37230c = i3;
        this.f37231d = j;
        this.f37232e = j2;
        this.f37233f = list;
        this.f37234g = list2;
        this.f37235h = pendingIntent;
        this.f37236i = list3;
    }

    @Override // p000.AbstractC39114cO5
    @Nullable
    /* renamed from: a */
    public final List<String> mo61455a() {
        return this.f37233f;
    }

    @Override // p000.AbstractC39114cO5
    @Nullable
    /* renamed from: b */
    public final List<String> mo61454b() {
        return this.f37234g;
    }

    @Override // p000.AbstractC39114cO5
    /* renamed from: c */
    public final long mo61453c() {
        return this.f37231d;
    }

    @Override // p000.AbstractC39114cO5
    @Nullable
    /* renamed from: d */
    public final List<Intent> mo61452d() {
        return this.f37236i;
    }

    public final boolean equals(Object obj) {
        List<String> list;
        List<String> list2;
        PendingIntent pendingIntent;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC39114cO5) {
            AbstractC39114cO5 abstractC39114cO5 = (AbstractC39114cO5) obj;
            if (this.f37228a == abstractC39114cO5.mo61448h() && this.f37229b == abstractC39114cO5.mo61447i() && this.f37230c == abstractC39114cO5.mo61450f() && this.f37231d == abstractC39114cO5.mo61453c() && this.f37232e == abstractC39114cO5.mo61446j() && ((list = this.f37233f) != null ? list.equals(abstractC39114cO5.mo61455a()) : abstractC39114cO5.mo61455a() == null) && ((list2 = this.f37234g) != null ? list2.equals(abstractC39114cO5.mo61454b()) : abstractC39114cO5.mo61454b() == null) && ((pendingIntent = this.f37235h) != null ? pendingIntent.equals(abstractC39114cO5.mo61449g()) : abstractC39114cO5.mo61449g() == null)) {
                List<Intent> list3 = this.f37236i;
                List<Intent> mo61452d = abstractC39114cO5.mo61452d();
                if (list3 != null ? list3.equals(mo61452d) : mo61452d == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.AbstractC39114cO5
    /* renamed from: f */
    public final int mo61450f() {
        return this.f37230c;
    }

    @Override // p000.AbstractC39114cO5
    @Nullable
    @Deprecated
    /* renamed from: g */
    public final PendingIntent mo61449g() {
        return this.f37235h;
    }

    @Override // p000.AbstractC39114cO5
    /* renamed from: h */
    public final int mo61448h() {
        return this.f37228a;
    }

    public final int hashCode() {
        int i = this.f37228a;
        int i2 = this.f37229b;
        int i3 = this.f37230c;
        long j = this.f37231d;
        long j2 = this.f37232e;
        int i4 = (((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        List<String> list = this.f37233f;
        int hashCode = (i4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<String> list2 = this.f37234g;
        int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f37235h;
        int hashCode3 = (hashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List<Intent> list3 = this.f37236i;
        return hashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override // p000.AbstractC39114cO5
    /* renamed from: i */
    public final int mo61447i() {
        return this.f37229b;
    }

    @Override // p000.AbstractC39114cO5
    /* renamed from: j */
    public final long mo61446j() {
        return this.f37232e;
    }

    public final String toString() {
        int i = this.f37228a;
        int i2 = this.f37229b;
        int i3 = this.f37230c;
        long j = this.f37231d;
        long j2 = this.f37232e;
        String valueOf = String.valueOf(this.f37233f);
        String valueOf2 = String.valueOf(this.f37234g);
        String valueOf3 = String.valueOf(this.f37235h);
        String valueOf4 = String.valueOf(this.f37236i);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 251 + length2 + valueOf3.length() + valueOf4.length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", moduleNamesNullable=");
        sb.append(valueOf);
        sb.append(", languagesNullable=");
        sb.append(valueOf2);
        sb.append(", resolutionIntent=");
        sb.append(valueOf3);
        sb.append(", splitFileIntents=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
