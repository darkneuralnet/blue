package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"LWn1;", "", "", "birdId", "birdModel", "firmwareType", "", "fiemwareCurrentVersion", "firmwareSuggestedVersion", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "f", DateTokenConverter.CONVERTER_KEY, "F", "()F", "e", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FF)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Wn1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36879Wn1 {

    /* renamed from: a */
    public final String f42106a;

    /* renamed from: b */
    public final String f42107b;

    /* renamed from: c */
    public final String f42108c;

    /* renamed from: d */
    public final float f42109d;

    /* renamed from: e */
    public final float f42110e;

    public C36879Wn1(String birdId, String str, String firmwareType, float f, float f2) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(firmwareType, "firmwareType");
        this.f42106a = birdId;
        this.f42107b = str;
        this.f42108c = firmwareType;
        this.f42109d = f;
        this.f42110e = f2;
    }

    public static /* synthetic */ C36879Wn1 copy$default(C36879Wn1 c36879Wn1, String str, String str2, String str3, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c36879Wn1.f42106a;
        }
        if ((i & 2) != 0) {
            str2 = c36879Wn1.f42107b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = c36879Wn1.f42108c;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            f = c36879Wn1.f42109d;
        }
        float f3 = f;
        if ((i & 16) != 0) {
            f2 = c36879Wn1.f42110e;
        }
        return c36879Wn1.m77835a(str, str4, str5, f3, f2);
    }

    /* renamed from: a */
    public final C36879Wn1 m77835a(String birdId, String str, String firmwareType, float f, float f2) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(firmwareType, "firmwareType");
        return new C36879Wn1(birdId, str, firmwareType, f, f2);
    }

    /* renamed from: b */
    public final String m77834b() {
        return this.f42106a;
    }

    /* renamed from: c */
    public final String m77833c() {
        return this.f42107b;
    }

    /* renamed from: d */
    public final float m77832d() {
        return this.f42109d;
    }

    /* renamed from: e */
    public final float m77831e() {
        return this.f42110e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C36879Wn1) {
            C36879Wn1 c36879Wn1 = (C36879Wn1) obj;
            return Intrinsics.areEqual(this.f42106a, c36879Wn1.f42106a) && Intrinsics.areEqual(this.f42107b, c36879Wn1.f42107b) && Intrinsics.areEqual(this.f42108c, c36879Wn1.f42108c) && Float.compare(this.f42109d, c36879Wn1.f42109d) == 0 && Float.compare(this.f42110e, c36879Wn1.f42110e) == 0;
        }
        return false;
    }

    /* renamed from: f */
    public final String m77830f() {
        return this.f42108c;
    }

    public int hashCode() {
        int hashCode = this.f42106a.hashCode() * 31;
        String str = this.f42107b;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f42108c.hashCode()) * 31) + Float.hashCode(this.f42109d)) * 31) + Float.hashCode(this.f42110e);
    }

    public String toString() {
        String str = this.f42106a;
        String str2 = this.f42107b;
        String str3 = this.f42108c;
        float f = this.f42109d;
        float f2 = this.f42110e;
        return "FirmwareInfo(birdId=" + str + ", birdModel=" + str2 + ", firmwareType=" + str3 + ", fiemwareCurrentVersion=" + f + ", firmwareSuggestedVersion=" + f2 + ")";
    }
}
