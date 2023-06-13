package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LvT;", "Lg70;", "Lco/bird/android/model/wire/WireBird;", "bird", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WireBird;", "getBird", "()Lco/bird/android/model/wire/WireBird;", "<init>", "(Lco/bird/android/model/wire/WireBird;)V", "eventbus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vT */
/* loaded from: classes2.dex */
public final class C29560vT extends AbstractC41342g70 {

    /* renamed from: a */
    public final WireBird f114129a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29560vT(WireBird bird) {
        super(null);
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f114129a = bird;
    }

    public static /* synthetic */ C29560vT copy$default(C29560vT c29560vT, WireBird wireBird, int i, Object obj) {
        if ((i & 1) != 0) {
            wireBird = c29560vT.f114129a;
        }
        return c29560vT.m8624a(wireBird);
    }

    /* renamed from: a */
    public final C29560vT m8624a(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return new C29560vT(bird);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29560vT) && Intrinsics.areEqual(this.f114129a, ((C29560vT) obj).f114129a);
    }

    public int hashCode() {
        return this.f114129a.hashCode();
    }

    public String toString() {
        WireBird wireBird = this.f114129a;
        return "BirdStateChangedEvent(bird=" + wireBird + ")";
    }
}
