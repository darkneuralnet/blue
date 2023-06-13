package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireTransferOrderClosedIncompleteReason;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Ltr5;", "Lxl0;", "Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", "reason", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", "b", "()Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", "<init>", "(Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tr5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49489tr5 extends AbstractC51795xl0 {

    /* renamed from: a */
    public final WireTransferOrderClosedIncompleteReason f111153a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49489tr5(WireTransferOrderClosedIncompleteReason reason) {
        super(null);
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f111153a = reason;
    }

    public static /* synthetic */ C49489tr5 copy$default(C49489tr5 c49489tr5, WireTransferOrderClosedIncompleteReason wireTransferOrderClosedIncompleteReason, int i, Object obj) {
        if ((i & 1) != 0) {
            wireTransferOrderClosedIncompleteReason = c49489tr5.f111153a;
        }
        return c49489tr5.m11591a(wireTransferOrderClosedIncompleteReason);
    }

    /* renamed from: a */
    public final C49489tr5 m11591a(WireTransferOrderClosedIncompleteReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new C49489tr5(reason);
    }

    /* renamed from: b */
    public final WireTransferOrderClosedIncompleteReason m11590b() {
        return this.f111153a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C49489tr5) && Intrinsics.areEqual(this.f111153a, ((C49489tr5) obj).f111153a);
    }

    public int hashCode() {
        return this.f111153a.hashCode();
    }

    public String toString() {
        WireTransferOrderClosedIncompleteReason wireTransferOrderClosedIncompleteReason = this.f111153a;
        return "SelectReason(reason=" + wireTransferOrderClosedIncompleteReason + ")";
    }
}
