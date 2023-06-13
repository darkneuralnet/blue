package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"LZG;", "", "", "birdId", "", "lights", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getBirdId", "()Ljava/lang/String;", "Z", "getLights", "()Z", "<init>", "(Ljava/lang/String;Z)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ZG */
/* loaded from: classes4.dex */
public final class C10181ZG {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("lights")
    @InterfaceC41208ft5("lights")
    private final boolean lights;

    public C10181ZG(String birdId, boolean z) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.birdId = birdId;
        this.lights = z;
    }

    public static /* synthetic */ C10181ZG copy$default(C10181ZG c10181zg, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c10181zg.birdId;
        }
        if ((i & 2) != 0) {
            z = c10181zg.lights;
        }
        return c10181zg.m73472a(str, z);
    }

    /* renamed from: a */
    public final C10181ZG m73472a(String birdId, boolean z) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return new C10181ZG(birdId, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10181ZG) {
            C10181ZG c10181zg = (C10181ZG) obj;
            return Intrinsics.areEqual(this.birdId, c10181zg.birdId) && this.lights == c10181zg.lights;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.birdId.hashCode() * 31;
        boolean z = this.lights;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.birdId;
        boolean z = this.lights;
        return "BirdActionLightsRequest(birdId=" + str + ", lights=" + z + ")";
    }
}
