package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.TransferOrderDemandSource;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Lbk5;", "", "", "errorCode", "Lco/bird/android/model/constant/TransferOrderDemandSource;", "demandSource", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Lco/bird/android/model/constant/TransferOrderDemandSource;", "()Lco/bird/android/model/constant/TransferOrderDemandSource;", "<init>", "(Ljava/lang/String;Lco/bird/android/model/constant/TransferOrderDemandSource;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bk5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38729bk5 {

    /* renamed from: a */
    public final String f58018a;

    /* renamed from: b */
    public final TransferOrderDemandSource f58019b;

    public C38729bk5(String errorCode, TransferOrderDemandSource transferOrderDemandSource) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f58018a = errorCode;
        this.f58019b = transferOrderDemandSource;
    }

    public static /* synthetic */ C38729bk5 copy$default(C38729bk5 c38729bk5, String str, TransferOrderDemandSource transferOrderDemandSource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c38729bk5.f58018a;
        }
        if ((i & 2) != 0) {
            transferOrderDemandSource = c38729bk5.f58019b;
        }
        return c38729bk5.m64057a(str, transferOrderDemandSource);
    }

    /* renamed from: a */
    public final C38729bk5 m64057a(String errorCode, TransferOrderDemandSource transferOrderDemandSource) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        return new C38729bk5(errorCode, transferOrderDemandSource);
    }

    /* renamed from: b */
    public final TransferOrderDemandSource m64056b() {
        return this.f58019b;
    }

    /* renamed from: c */
    public final String m64055c() {
        return this.f58018a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C38729bk5) {
            C38729bk5 c38729bk5 = (C38729bk5) obj;
            return Intrinsics.areEqual(this.f58018a, c38729bk5.f58018a) && this.f58019b == c38729bk5.f58019b;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f58018a.hashCode() * 31;
        TransferOrderDemandSource transferOrderDemandSource = this.f58019b;
        return hashCode + (transferOrderDemandSource == null ? 0 : transferOrderDemandSource.hashCode());
    }

    public String toString() {
        String str = this.f58018a;
        TransferOrderDemandSource transferOrderDemandSource = this.f58019b;
        return "ScanError(errorCode=" + str + ", demandSource=" + transferOrderDemandSource + ")";
    }
}
