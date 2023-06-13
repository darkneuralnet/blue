package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.TransferOrderDemandSource;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001e"}, m28432d2 = {"Lcz3;", "", "", "scanQuantity", "", "completeButtonLabel", "", "enableComplete", "Lco/bird/android/model/constant/TransferOrderDemandSource;", "demandSource", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/CharSequence;", "e", "()Ljava/lang/CharSequence;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "Lco/bird/android/model/constant/TransferOrderDemandSource;", "()Lco/bird/android/model/constant/TransferOrderDemandSource;", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/String;ZLco/bird/android/model/constant/TransferOrderDemandSource;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cz3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39488cz3 {

    /* renamed from: a */
    public final CharSequence f75920a;

    /* renamed from: b */
    public final String f75921b;

    /* renamed from: c */
    public final boolean f75922c;

    /* renamed from: d */
    public final TransferOrderDemandSource f75923d;

    public C39488cz3(CharSequence scanQuantity, String str, boolean z, TransferOrderDemandSource demandSource) {
        Intrinsics.checkNotNullParameter(scanQuantity, "scanQuantity");
        Intrinsics.checkNotNullParameter(demandSource, "demandSource");
        this.f75920a = scanQuantity;
        this.f75921b = str;
        this.f75922c = z;
        this.f75923d = demandSource;
    }

    public static /* synthetic */ C39488cz3 copy$default(C39488cz3 c39488cz3, CharSequence charSequence, String str, boolean z, TransferOrderDemandSource transferOrderDemandSource, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = c39488cz3.f75920a;
        }
        if ((i & 2) != 0) {
            str = c39488cz3.f75921b;
        }
        if ((i & 4) != 0) {
            z = c39488cz3.f75922c;
        }
        if ((i & 8) != 0) {
            transferOrderDemandSource = c39488cz3.f75923d;
        }
        return c39488cz3.m44774a(charSequence, str, z, transferOrderDemandSource);
    }

    /* renamed from: a */
    public final C39488cz3 m44774a(CharSequence scanQuantity, String str, boolean z, TransferOrderDemandSource demandSource) {
        Intrinsics.checkNotNullParameter(scanQuantity, "scanQuantity");
        Intrinsics.checkNotNullParameter(demandSource, "demandSource");
        return new C39488cz3(scanQuantity, str, z, demandSource);
    }

    /* renamed from: b */
    public final String m44773b() {
        return this.f75921b;
    }

    /* renamed from: c */
    public final TransferOrderDemandSource m44772c() {
        return this.f75923d;
    }

    /* renamed from: d */
    public final boolean m44771d() {
        return this.f75922c;
    }

    /* renamed from: e */
    public final CharSequence m44770e() {
        return this.f75920a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C39488cz3) {
            C39488cz3 c39488cz3 = (C39488cz3) obj;
            return Intrinsics.areEqual(this.f75920a, c39488cz3.f75920a) && Intrinsics.areEqual(this.f75921b, c39488cz3.f75921b) && this.f75922c == c39488cz3.f75922c && this.f75923d == c39488cz3.f75923d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f75920a.hashCode() * 31;
        String str = this.f75921b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f75922c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode2 + i) * 31) + this.f75923d.hashCode();
    }

    public String toString() {
        CharSequence charSequence = this.f75920a;
        String str = this.f75921b;
        boolean z = this.f75922c;
        TransferOrderDemandSource transferOrderDemandSource = this.f75923d;
        return "OutboundScanHeaderViewModel(scanQuantity=" + ((Object) charSequence) + ", completeButtonLabel=" + str + ", enableComplete=" + z + ", demandSource=" + transferOrderDemandSource + ")";
    }
}
