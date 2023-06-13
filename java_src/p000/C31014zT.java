package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"LzT;", "", "", "success", "LyT;", "error", "Lco/bird/android/model/wire/WireBird;", "bird", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Z", "getSuccess", "()Z", "LyT;", "getError", "()LyT;", "Lco/bird/android/model/wire/WireBird;", "getBird", "()Lco/bird/android/model/wire/WireBird;", "<init>", "(ZLyT;Lco/bird/android/model/wire/WireBird;)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: zT */
/* loaded from: classes4.dex */
public final class C31014zT {
    @JsonProperty("bird")
    @InterfaceC41208ft5("bird")
    private final WireBird bird;
    @JsonProperty("error")
    @InterfaceC41208ft5("error")
    private final C30595yT error;
    @JsonProperty("success")
    @InterfaceC41208ft5("success")
    private final boolean success;

    public C31014zT(boolean z, C30595yT c30595yT, WireBird wireBird) {
        this.success = z;
        this.error = c30595yT;
        this.bird = wireBird;
    }

    public static /* synthetic */ C31014zT copy$default(C31014zT c31014zT, boolean z, C30595yT c30595yT, WireBird wireBird, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c31014zT.success;
        }
        if ((i & 2) != 0) {
            c30595yT = c31014zT.error;
        }
        if ((i & 4) != 0) {
            wireBird = c31014zT.bird;
        }
        return c31014zT.m1334a(z, c30595yT, wireBird);
    }

    /* renamed from: a */
    public final C31014zT m1334a(boolean z, C30595yT c30595yT, WireBird wireBird) {
        return new C31014zT(z, c30595yT, wireBird);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C31014zT) {
            C31014zT c31014zT = (C31014zT) obj;
            return this.success == c31014zT.success && Intrinsics.areEqual(this.error, c31014zT.error) && Intrinsics.areEqual(this.bird, c31014zT.bird);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.success;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        C30595yT c30595yT = this.error;
        int hashCode = (i + (c30595yT == null ? 0 : c30595yT.hashCode())) * 31;
        WireBird wireBird = this.bird;
        return hashCode + (wireBird != null ? wireBird.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.success;
        C30595yT c30595yT = this.error;
        WireBird wireBird = this.bird;
        return "BirdUserActionResponse(success=" + z + ", error=" + c30595yT + ", bird=" + wireBird + ")";
    }
}
