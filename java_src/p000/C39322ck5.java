package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.TransferOrderDemandSource;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Lck5;", "", "Lco/bird/android/model/constant/TransferOrderDemandSource;", "demandSource", "", "errorCode", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/constant/TransferOrderDemandSource;", "b", "()Lco/bird/android/model/constant/TransferOrderDemandSource;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "<init>", "(Lco/bird/android/model/constant/TransferOrderDemandSource;Ljava/lang/String;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ck5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39322ck5 {

    /* renamed from: a */
    public final TransferOrderDemandSource f61167a;

    /* renamed from: b */
    public final String f61168b;

    public C39322ck5(TransferOrderDemandSource transferOrderDemandSource, String errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f61167a = transferOrderDemandSource;
        this.f61168b = errorCode;
    }

    public static /* synthetic */ C39322ck5 copy$default(C39322ck5 c39322ck5, TransferOrderDemandSource transferOrderDemandSource, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            transferOrderDemandSource = c39322ck5.f61167a;
        }
        if ((i & 2) != 0) {
            str = c39322ck5.f61168b;
        }
        return c39322ck5.m60976a(transferOrderDemandSource, str);
    }

    /* renamed from: a */
    public final C39322ck5 m60976a(TransferOrderDemandSource transferOrderDemandSource, String errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        return new C39322ck5(transferOrderDemandSource, errorCode);
    }

    /* renamed from: b */
    public final TransferOrderDemandSource m60975b() {
        return this.f61167a;
    }

    /* renamed from: c */
    public final String m60974c() {
        return this.f61168b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C39322ck5) {
            C39322ck5 c39322ck5 = (C39322ck5) obj;
            return this.f61167a == c39322ck5.f61167a && Intrinsics.areEqual(this.f61168b, c39322ck5.f61168b);
        }
        return false;
    }

    public int hashCode() {
        TransferOrderDemandSource transferOrderDemandSource = this.f61167a;
        return ((transferOrderDemandSource == null ? 0 : transferOrderDemandSource.hashCode()) * 31) + this.f61168b.hashCode();
    }

    public String toString() {
        TransferOrderDemandSource transferOrderDemandSource = this.f61167a;
        String str = this.f61168b;
        return "ScanError(demandSource=" + transferOrderDemandSource + ", errorCode=" + str + ")";
    }
}
