package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"LbT;", "Lg70;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/constant/BirdAction;", "action", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WireBird;", "getBird", "()Lco/bird/android/model/wire/WireBird;", "b", "Lco/bird/android/model/constant/BirdAction;", "getAction", "()Lco/bird/android/model/constant/BirdAction;", "<init>", "(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/constant/BirdAction;)V", "eventbus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bT */
/* loaded from: classes2.dex */
public final class C12395bT extends AbstractC41342g70 {

    /* renamed from: a */
    public final WireBird f57515a;

    /* renamed from: b */
    public final BirdAction f57516b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12395bT(WireBird bird, BirdAction birdAction) {
        super(null);
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f57515a = bird;
        this.f57516b = birdAction;
    }

    public static /* synthetic */ C12395bT copy$default(C12395bT c12395bT, WireBird wireBird, BirdAction birdAction, int i, Object obj) {
        if ((i & 1) != 0) {
            wireBird = c12395bT.f57515a;
        }
        if ((i & 2) != 0) {
            birdAction = c12395bT.f57516b;
        }
        return c12395bT.m64519a(wireBird, birdAction);
    }

    /* renamed from: a */
    public final C12395bT m64519a(WireBird bird, BirdAction birdAction) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return new C12395bT(bird, birdAction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12395bT) {
            C12395bT c12395bT = (C12395bT) obj;
            return Intrinsics.areEqual(this.f57515a, c12395bT.f57515a) && this.f57516b == c12395bT.f57516b;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f57515a.hashCode() * 31;
        BirdAction birdAction = this.f57516b;
        return hashCode + (birdAction == null ? 0 : birdAction.hashCode());
    }

    public String toString() {
        WireBird wireBird = this.f57515a;
        BirdAction birdAction = this.f57516b;
        return "BirdScannedEvent(bird=" + wireBird + ", action=" + birdAction + ")";
    }

    public /* synthetic */ C12395bT(WireBird wireBird, BirdAction birdAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wireBird, (i & 2) != 0 ? null : birdAction);
    }
}
