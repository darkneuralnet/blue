package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.OperatorOrderViewType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"Lm7;", "Lmp3;", "", "orderId", "Lco/bird/android/model/constant/OperatorOrderViewType;", "type", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lco/bird/android/model/constant/OperatorOrderViewType;", "c", "()Lco/bird/android/model/constant/OperatorOrderViewType;", "<init>", "(Ljava/lang/String;Lco/bird/android/model/constant/OperatorOrderViewType;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: m7 */
/* loaded from: classes3.dex */
public final class C25915m7 extends AbstractC45317mp3 {

    /* renamed from: a */
    public final String f97367a;

    /* renamed from: b */
    public final OperatorOrderViewType f97368b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25915m7(String orderId, OperatorOrderViewType type) {
        super(null);
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f97367a = orderId;
        this.f97368b = type;
    }

    public static /* synthetic */ C25915m7 copy$default(C25915m7 c25915m7, String str, OperatorOrderViewType operatorOrderViewType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c25915m7.f97367a;
        }
        if ((i & 2) != 0) {
            operatorOrderViewType = c25915m7.f97368b;
        }
        return c25915m7.m26331a(str, operatorOrderViewType);
    }

    /* renamed from: a */
    public final C25915m7 m26331a(String orderId, OperatorOrderViewType type) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(type, "type");
        return new C25915m7(orderId, type);
    }

    /* renamed from: b */
    public final String m26330b() {
        return this.f97367a;
    }

    /* renamed from: c */
    public final OperatorOrderViewType m26329c() {
        return this.f97368b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C25915m7) {
            C25915m7 c25915m7 = (C25915m7) obj;
            return Intrinsics.areEqual(this.f97367a, c25915m7.f97367a) && this.f97368b == c25915m7.f97368b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f97367a.hashCode() * 31) + this.f97368b.hashCode();
    }

    public String toString() {
        String str = this.f97367a;
        OperatorOrderViewType operatorOrderViewType = this.f97368b;
        return "AddBol(orderId=" + str + ", type=" + operatorOrderViewType + ")";
    }
}
