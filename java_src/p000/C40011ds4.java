package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ<\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u001c"}, m28432d2 = {"Lds4;", "LRm;", "", "titleIcon", "", "title", "titleBackgroundColor", "description", C17296a.f69688o, "(Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;)Lds4;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "I", DateTokenConverter.CONVERTER_KEY, "()I", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;)V", "co.bird.android.feature.operator.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ds4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40011ds4 implements InterfaceC7269Rm {

    /* renamed from: a */
    public final Integer f77327a;

    /* renamed from: b */
    public final String f77328b;

    /* renamed from: c */
    public final int f77329c;

    /* renamed from: d */
    public final String f77330d;

    public C40011ds4(Integer num, String str, int i, String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f77327a = num;
        this.f77328b = str;
        this.f77329c = i;
        this.f77330d = description;
    }

    public static /* synthetic */ C40011ds4 copy$default(C40011ds4 c40011ds4, Integer num, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = c40011ds4.f77327a;
        }
        if ((i2 & 2) != 0) {
            str = c40011ds4.f77328b;
        }
        if ((i2 & 4) != 0) {
            i = c40011ds4.f77329c;
        }
        if ((i2 & 8) != 0) {
            str2 = c40011ds4.f77330d;
        }
        return c40011ds4.m43574a(num, str, i, str2);
    }

    /* renamed from: a */
    public final C40011ds4 m43574a(Integer num, String str, int i, String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new C40011ds4(num, str, i, description);
    }

    /* renamed from: b */
    public final String m43573b() {
        return this.f77330d;
    }

    /* renamed from: c */
    public final String m43572c() {
        return this.f77328b;
    }

    /* renamed from: d */
    public final int m43571d() {
        return this.f77329c;
    }

    /* renamed from: e */
    public final Integer m43570e() {
        return this.f77327a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C40011ds4) {
            C40011ds4 c40011ds4 = (C40011ds4) obj;
            return Intrinsics.areEqual(this.f77327a, c40011ds4.f77327a) && Intrinsics.areEqual(this.f77328b, c40011ds4.f77328b) && this.f77329c == c40011ds4.f77329c && Intrinsics.areEqual(this.f77330d, c40011ds4.f77330d);
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f77327a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f77328b;
        return ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.f77329c)) * 31) + this.f77330d.hashCode();
    }

    public String toString() {
        Integer num = this.f77327a;
        String str = this.f77328b;
        int i = this.f77329c;
        String str2 = this.f77330d;
        return "RebalanceAreaBottomSheetModel(titleIcon=" + num + ", title=" + str + ", titleBackgroundColor=" + i + ", description=" + str2 + ")";
    }

    public /* synthetic */ C40011ds4(Integer num, String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : str, i, str2);
    }
}
