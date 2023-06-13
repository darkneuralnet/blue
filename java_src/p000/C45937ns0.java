package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.OperatorOrderViewType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Lns0;", "Lmp3;", "Lco/bird/android/model/constant/OperatorOrderViewType;", "type", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/constant/OperatorOrderViewType;", "b", "()Lco/bird/android/model/constant/OperatorOrderViewType;", "<init>", "(Lco/bird/android/model/constant/OperatorOrderViewType;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ns0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45937ns0 extends AbstractC45317mp3 {

    /* renamed from: a */
    public final OperatorOrderViewType f100934a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45937ns0(OperatorOrderViewType type) {
        super(null);
        Intrinsics.checkNotNullParameter(type, "type");
        this.f100934a = type;
    }

    public static /* synthetic */ C45937ns0 copy$default(C45937ns0 c45937ns0, OperatorOrderViewType operatorOrderViewType, int i, Object obj) {
        if ((i & 1) != 0) {
            operatorOrderViewType = c45937ns0.f100934a;
        }
        return c45937ns0.m22269a(operatorOrderViewType);
    }

    /* renamed from: a */
    public final C45937ns0 m22269a(OperatorOrderViewType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new C45937ns0(type);
    }

    /* renamed from: b */
    public final OperatorOrderViewType m22268b() {
        return this.f100934a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C45937ns0) && this.f100934a == ((C45937ns0) obj).f100934a;
    }

    public int hashCode() {
        return this.f100934a.hashCode();
    }

    public String toString() {
        OperatorOrderViewType operatorOrderViewType = this.f100934a;
        return "Completed(type=" + operatorOrderViewType + ")";
    }
}
