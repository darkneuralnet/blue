package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"LD1;", "", "", "offerId", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getOfferId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "co.bird.android.manager.offer"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: D1 */
/* loaded from: classes4.dex */
public final class C1327D1 {
    @JsonProperty("id")
    @InterfaceC41208ft5("id")
    private final String offerId;

    public C1327D1(String offerId) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        this.offerId = offerId;
    }

    public static /* synthetic */ C1327D1 copy$default(C1327D1 c1327d1, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c1327d1.offerId;
        }
        return c1327d1.m111041a(str);
    }

    /* renamed from: a */
    public final C1327D1 m111041a(String offerId) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        return new C1327D1(offerId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1327D1) && Intrinsics.areEqual(this.offerId, ((C1327D1) obj).offerId);
    }

    public int hashCode() {
        return this.offerId.hashCode();
    }

    public String toString() {
        String str = this.offerId;
        return "AcceptOfferBody(offerId=" + str + ")";
    }
}
