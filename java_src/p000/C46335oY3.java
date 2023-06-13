package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.OperatorOrderView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LoY3;", "Lmp3;", "Lco/bird/android/model/persistence/OperatorOrderView;", "order", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/persistence/OperatorOrderView;", "b", "()Lco/bird/android/model/persistence/OperatorOrderView;", "<init>", "(Lco/bird/android/model/persistence/OperatorOrderView;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oY3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46335oY3 extends AbstractC45317mp3 {

    /* renamed from: a */
    public final OperatorOrderView f102131a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46335oY3(OperatorOrderView order) {
        super(null);
        Intrinsics.checkNotNullParameter(order, "order");
        this.f102131a = order;
    }

    public static /* synthetic */ C46335oY3 copy$default(C46335oY3 c46335oY3, OperatorOrderView operatorOrderView, int i, Object obj) {
        if ((i & 1) != 0) {
            operatorOrderView = c46335oY3.f102131a;
        }
        return c46335oY3.m20907a(operatorOrderView);
    }

    /* renamed from: a */
    public final C46335oY3 m20907a(OperatorOrderView order) {
        Intrinsics.checkNotNullParameter(order, "order");
        return new C46335oY3(order);
    }

    /* renamed from: b */
    public final OperatorOrderView m20906b() {
        return this.f102131a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46335oY3) && Intrinsics.areEqual(this.f102131a, ((C46335oY3) obj).f102131a);
    }

    public int hashCode() {
        return this.f102131a.hashCode();
    }

    public String toString() {
        OperatorOrderView operatorOrderView = this.f102131a;
        return "PopulateAdapter(order=" + operatorOrderView + ")";
    }
}
