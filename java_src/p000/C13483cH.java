package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"LcH;", "", "", "birdId", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getBirdId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cH */
/* loaded from: classes4.dex */
public final class C13483cH {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;

    public C13483cH(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.birdId = birdId;
    }

    public static /* synthetic */ C13483cH copy$default(C13483cH c13483cH, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c13483cH.birdId;
        }
        return c13483cH.m61626a(str);
    }

    /* renamed from: a */
    public final C13483cH m61626a(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return new C13483cH(birdId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13483cH) && Intrinsics.areEqual(this.birdId, ((C13483cH) obj).birdId);
    }

    public int hashCode() {
        return this.birdId.hashCode();
    }

    public String toString() {
        String str = this.birdId;
        return "BirdActionSleepRequest(birdId=" + str + ")";
    }
}
