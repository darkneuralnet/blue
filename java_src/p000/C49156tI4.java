package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireTransferOrderClosedIncompleteReason;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0005\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"LtI4;", "Lrv1;", "", "Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", "reasons", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tI4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49156tI4 extends AbstractC48340rv1 {

    /* renamed from: a */
    public final List<WireTransferOrderClosedIncompleteReason> f110275a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49156tI4(List<WireTransferOrderClosedIncompleteReason> reasons) {
        super(null);
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        this.f110275a = reasons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C49156tI4 copy$default(C49156tI4 c49156tI4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c49156tI4.f110275a;
        }
        return c49156tI4.m12522a(list);
    }

    /* renamed from: a */
    public final C49156tI4 m12522a(List<WireTransferOrderClosedIncompleteReason> reasons) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        return new C49156tI4(reasons);
    }

    /* renamed from: b */
    public final List<WireTransferOrderClosedIncompleteReason> m12521b() {
        return this.f110275a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C49156tI4) && Intrinsics.areEqual(this.f110275a, ((C49156tI4) obj).f110275a);
    }

    public int hashCode() {
        return this.f110275a.hashCode();
    }

    public String toString() {
        List<WireTransferOrderClosedIncompleteReason> list = this.f110275a;
        return "RequestCloseIncomplete(reasons=" + list + ")";
    }
}
