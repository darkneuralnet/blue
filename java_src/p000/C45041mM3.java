package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LmM3;", "LN80;", "", "", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getCardId", "()Ljava/lang/String;", "cardId", "<init>", "(Ljava/lang/String;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mM3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45041mM3 extends N80 {

    /* renamed from: a */
    public final String f97844a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45041mM3(String cardId) {
        super(null);
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f97844a = cardId;
    }

    @Override // p000.N80
    /* renamed from: a */
    public Map<String, String> mo18351a() {
        Map<String, String> mapOf;
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("CARD_ID", this.f97844a));
        return mapOf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C45041mM3) && Intrinsics.areEqual(this.f97844a, ((C45041mM3) obj).f97844a);
    }

    public int hashCode() {
        return this.f97844a.hashCode();
    }

    public String toString() {
        String str = this.f97844a;
        return "PaymentFromCard(cardId=" + str + ")";
    }
}
