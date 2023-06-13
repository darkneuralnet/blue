package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.ScanType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"LeT;", "Lg70;", "Lco/bird/android/model/ScanType;", "type", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/ScanType;", "c", "()Lco/bird/android/model/ScanType;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(Lco/bird/android/model/ScanType;Ljava/lang/String;)V", "eventbus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: eT */
/* loaded from: classes2.dex */
public final class C20042eT extends AbstractC41342g70 {

    /* renamed from: a */
    public final ScanType f78405a;

    /* renamed from: b */
    public final String f78406b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20042eT(ScanType type, String code) {
        super(null);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f78405a = type;
        this.f78406b = code;
    }

    public static /* synthetic */ C20042eT copy$default(C20042eT c20042eT, ScanType scanType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            scanType = c20042eT.f78405a;
        }
        if ((i & 2) != 0) {
            str = c20042eT.f78406b;
        }
        return c20042eT.m42871a(scanType, str);
    }

    /* renamed from: a */
    public final C20042eT m42871a(ScanType type, String code) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(code, "code");
        return new C20042eT(type, code);
    }

    /* renamed from: b */
    public final String m42870b() {
        return this.f78406b;
    }

    /* renamed from: c */
    public final ScanType m42869c() {
        return this.f78405a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20042eT) {
            C20042eT c20042eT = (C20042eT) obj;
            return this.f78405a == c20042eT.f78405a && Intrinsics.areEqual(this.f78406b, c20042eT.f78406b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f78405a.hashCode() * 31) + this.f78406b.hashCode();
    }

    public String toString() {
        ScanType scanType = this.f78405a;
        String str = this.f78406b;
        return "BirdSearchCodeScannedEvent(type=" + scanType + ", code=" + str + ")";
    }
}
