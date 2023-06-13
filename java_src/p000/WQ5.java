package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LWQ5;", "Lm66;", "Lco/bird/android/model/wire/WireBird;", "bird", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WireBird;", "b", "()Lco/bird/android/model/wire/WireBird;", "<init>", "(Lco/bird/android/model/wire/WireBird;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: WQ5 */
/* loaded from: classes2.dex */
public final class WQ5 extends AbstractC44896m66 {

    /* renamed from: a */
    public final WireBird f40995a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WQ5(WireBird bird) {
        super(null);
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f40995a = bird;
    }

    public static /* synthetic */ WQ5 copy$default(WQ5 wq5, WireBird wireBird, int i, Object obj) {
        if ((i & 1) != 0) {
            wireBird = wq5.f40995a;
        }
        return wq5.m78478a(wireBird);
    }

    /* renamed from: a */
    public final WQ5 m78478a(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return new WQ5(bird);
    }

    /* renamed from: b */
    public final WireBird m78477b() {
        return this.f40995a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WQ5) && Intrinsics.areEqual(this.f40995a, ((WQ5) obj).f40995a);
    }

    public int hashCode() {
        return this.f40995a.hashCode();
    }

    public String toString() {
        WireBird wireBird = this.f40995a;
        return "StopTrackingOperation(bird=" + wireBird + ")";
    }
}
