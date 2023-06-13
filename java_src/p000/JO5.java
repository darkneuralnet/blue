package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.OperatorOrderViewType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"LJO5;", "Ll7;", "", "orderId", "Lco/bird/android/model/constant/OperatorOrderViewType;", "type", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lco/bird/android/model/constant/OperatorOrderViewType;", "c", "()Lco/bird/android/model/constant/OperatorOrderViewType;", "<init>", "(Ljava/lang/String;Lco/bird/android/model/constant/OperatorOrderViewType;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: JO5 */
/* loaded from: classes3.dex */
public final class JO5 extends AbstractC25599l7 {

    /* renamed from: a */
    public final String f17492a;

    /* renamed from: b */
    public final OperatorOrderViewType f17493b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JO5(String orderId, OperatorOrderViewType type) {
        super(null);
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f17492a = orderId;
        this.f17493b = type;
    }

    public static /* synthetic */ JO5 copy$default(JO5 jo5, String str, OperatorOrderViewType operatorOrderViewType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jo5.f17492a;
        }
        if ((i & 2) != 0) {
            operatorOrderViewType = jo5.f17493b;
        }
        return jo5.m100521a(str, operatorOrderViewType);
    }

    /* renamed from: a */
    public final JO5 m100521a(String orderId, OperatorOrderViewType type) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(type, "type");
        return new JO5(orderId, type);
    }

    /* renamed from: b */
    public final String m100520b() {
        return this.f17492a;
    }

    /* renamed from: c */
    public final OperatorOrderViewType m100519c() {
        return this.f17493b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JO5) {
            JO5 jo5 = (JO5) obj;
            return Intrinsics.areEqual(this.f17492a, jo5.f17492a) && this.f17493b == jo5.f17493b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f17492a.hashCode() * 31) + this.f17493b.hashCode();
    }

    public String toString() {
        String str = this.f17492a;
        OperatorOrderViewType operatorOrderViewType = this.f17493b;
        return "StartLoad(orderId=" + str + ", type=" + operatorOrderViewType + ")";
    }
}
