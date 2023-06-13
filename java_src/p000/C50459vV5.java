package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"LvV5;", "", "", "iconRes", "", "description", C17296a.f69688o, "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "I", "b", "()I", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vV5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50459vV5 {

    /* renamed from: a */
    public final int f114180a;

    /* renamed from: b */
    public final String f114181b;

    public C50459vV5(int i, String str) {
        this.f114180a = i;
        this.f114181b = str;
    }

    public static /* synthetic */ C50459vV5 copy$default(C50459vV5 c50459vV5, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c50459vV5.f114180a;
        }
        if ((i2 & 2) != 0) {
            str = c50459vV5.f114181b;
        }
        return c50459vV5.m8574a(i, str);
    }

    /* renamed from: a */
    public final C50459vV5 m8574a(int i, String str) {
        return new C50459vV5(i, str);
    }

    /* renamed from: b */
    public final int m8573b() {
        return this.f114180a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50459vV5) {
            C50459vV5 c50459vV5 = (C50459vV5) obj;
            return this.f114180a == c50459vV5.f114180a && Intrinsics.areEqual(this.f114181b, c50459vV5.f114181b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f114180a) * 31;
        String str = this.f114181b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i = this.f114180a;
        String str = this.f114181b;
        return "SupportedPaymentBrandViewModel(iconRes=" + i + ", description=" + str + ")";
    }

    public /* synthetic */ C50459vV5(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str);
    }
}
