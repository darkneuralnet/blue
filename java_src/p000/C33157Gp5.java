package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, m28432d2 = {"LGp5;", "", "", "rejectReason", "rejectReasonMessage", "reviewedDate", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", DateTokenConverter.CONVERTER_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Gp5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33157Gp5 {

    /* renamed from: a */
    public final String f12509a;

    /* renamed from: b */
    public final String f12510b;

    /* renamed from: c */
    public final String f12511c;

    public C33157Gp5(String str, String str2, String str3) {
        this.f12509a = str;
        this.f12510b = str2;
        this.f12511c = str3;
    }

    public static /* synthetic */ C33157Gp5 copy$default(C33157Gp5 c33157Gp5, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c33157Gp5.f12509a;
        }
        if ((i & 2) != 0) {
            str2 = c33157Gp5.f12510b;
        }
        if ((i & 4) != 0) {
            str3 = c33157Gp5.f12511c;
        }
        return c33157Gp5.m104695a(str, str2, str3);
    }

    /* renamed from: a */
    public final C33157Gp5 m104695a(String str, String str2, String str3) {
        return new C33157Gp5(str, str2, str3);
    }

    /* renamed from: b */
    public final String m104694b() {
        return this.f12509a;
    }

    /* renamed from: c */
    public final String m104693c() {
        return this.f12510b;
    }

    /* renamed from: d */
    public final String m104692d() {
        return this.f12511c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33157Gp5) {
            C33157Gp5 c33157Gp5 = (C33157Gp5) obj;
            return Intrinsics.areEqual(this.f12509a, c33157Gp5.f12509a) && Intrinsics.areEqual(this.f12510b, c33157Gp5.f12510b) && Intrinsics.areEqual(this.f12511c, c33157Gp5.f12511c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f12509a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f12510b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f12511c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f12509a;
        String str2 = this.f12510b;
        String str3 = this.f12511c;
        return "ScrapRejectionViewModel(rejectReason=" + str + ", rejectReasonMessage=" + str2 + ", reviewedDate=" + str3 + ")";
    }
}
