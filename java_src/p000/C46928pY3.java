package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.OperatorOrderView;
import co.bird.android.model.persistence.OperatorOrderViewSection;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u00030\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0007\u001a\u00020\u00002 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u00030\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R/\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"LpY3;", "LFp3;", "", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/OperatorOrderViewSection;", "Lco/bird/android/model/persistence/OperatorOrderView;", "orders", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pY3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46928pY3 extends AbstractC32921Fp3 {

    /* renamed from: a */
    public final List<Pair<OperatorOrderViewSection, List<OperatorOrderView>>> f103787a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C46928pY3(List<? extends Pair<OperatorOrderViewSection, ? extends List<OperatorOrderView>>> orders) {
        super(null);
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.f103787a = orders;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C46928pY3 copy$default(C46928pY3 c46928pY3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c46928pY3.f103787a;
        }
        return c46928pY3.m19127a(list);
    }

    /* renamed from: a */
    public final C46928pY3 m19127a(List<? extends Pair<OperatorOrderViewSection, ? extends List<OperatorOrderView>>> orders) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        return new C46928pY3(orders);
    }

    /* renamed from: b */
    public final List<Pair<OperatorOrderViewSection, List<OperatorOrderView>>> m19126b() {
        return this.f103787a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46928pY3) && Intrinsics.areEqual(this.f103787a, ((C46928pY3) obj).f103787a);
    }

    public int hashCode() {
        return this.f103787a.hashCode();
    }

    public String toString() {
        List<Pair<OperatorOrderViewSection, List<OperatorOrderView>>> list = this.f103787a;
        return "PopulateAdapter(orders=" + list + ")";
    }
}
