package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001c\u0010\u001dJH\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001e"}, m28432d2 = {"LOj6;", "LRm;", "", "titleIcon", "", "title", "titleBackgroundColor", "description", "zendeskArticleId", C17296a.f69688o, "(Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)LOj6;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "I", DateTokenConverter.CONVERTER_KEY, "()I", "f", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "co.bird.android.feature.operator.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Oj6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34976Oj6 implements InterfaceC7269Rm {

    /* renamed from: a */
    public final Integer f27145a;

    /* renamed from: b */
    public final String f27146b;

    /* renamed from: c */
    public final int f27147c;

    /* renamed from: d */
    public final String f27148d;

    /* renamed from: e */
    public final String f27149e;

    public C34976Oj6(Integer num, String str, int i, String description, String str2) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f27145a = num;
        this.f27146b = str;
        this.f27147c = i;
        this.f27148d = description;
        this.f27149e = str2;
    }

    public static /* synthetic */ C34976Oj6 copy$default(C34976Oj6 c34976Oj6, Integer num, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = c34976Oj6.f27145a;
        }
        if ((i2 & 2) != 0) {
            str = c34976Oj6.f27146b;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            i = c34976Oj6.f27147c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = c34976Oj6.f27148d;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = c34976Oj6.f27149e;
        }
        return c34976Oj6.m91608a(num, str4, i3, str5, str3);
    }

    /* renamed from: a */
    public final C34976Oj6 m91608a(Integer num, String str, int i, String description, String str2) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new C34976Oj6(num, str, i, description, str2);
    }

    /* renamed from: b */
    public final String m91607b() {
        return this.f27148d;
    }

    /* renamed from: c */
    public final String m91606c() {
        return this.f27146b;
    }

    /* renamed from: d */
    public final int m91605d() {
        return this.f27147c;
    }

    /* renamed from: e */
    public final Integer m91604e() {
        return this.f27145a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34976Oj6) {
            C34976Oj6 c34976Oj6 = (C34976Oj6) obj;
            return Intrinsics.areEqual(this.f27145a, c34976Oj6.f27145a) && Intrinsics.areEqual(this.f27146b, c34976Oj6.f27146b) && this.f27147c == c34976Oj6.f27147c && Intrinsics.areEqual(this.f27148d, c34976Oj6.f27148d) && Intrinsics.areEqual(this.f27149e, c34976Oj6.f27149e);
        }
        return false;
    }

    /* renamed from: f */
    public final String m91603f() {
        return this.f27149e;
    }

    public int hashCode() {
        Integer num = this.f27145a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f27146b;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f27147c)) * 31) + this.f27148d.hashCode()) * 31;
        String str2 = this.f27149e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.f27145a;
        String str = this.f27146b;
        int i = this.f27147c;
        String str2 = this.f27148d;
        String str3 = this.f27149e;
        return "VariableFeeAreaBottomSheetModel(titleIcon=" + num + ", title=" + str + ", titleBackgroundColor=" + i + ", description=" + str2 + ", zendeskArticleId=" + str3 + ")";
    }

    public /* synthetic */ C34976Oj6(Integer num, String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : str, i, str2, (i2 & 16) != 0 ? null : str3);
    }
}
