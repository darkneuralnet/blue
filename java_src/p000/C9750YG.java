package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\u0007HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m28432d2 = {"LYG;", "Lg70;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/constant/BirdAction;", "action", "", "", "nearbyBirds", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WireBird;", "c", "()Lco/bird/android/model/wire/WireBird;", "b", "Lco/bird/android/model/constant/BirdAction;", "()Lco/bird/android/model/constant/BirdAction;", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "<init>", "(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/constant/BirdAction;Ljava/util/List;)V", "eventbus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: YG */
/* loaded from: classes2.dex */
public final class C9750YG extends AbstractC41342g70 {

    /* renamed from: a */
    public final WireBird f44919a;

    /* renamed from: b */
    public final BirdAction f44920b;

    /* renamed from: c */
    public final List<String> f44921c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9750YG(WireBird bird, BirdAction action, List<String> list) {
        super(null);
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f44919a = bird;
        this.f44920b = action;
        this.f44921c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C9750YG copy$default(C9750YG c9750yg, WireBird wireBird, BirdAction birdAction, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            wireBird = c9750yg.f44919a;
        }
        if ((i & 2) != 0) {
            birdAction = c9750yg.f44920b;
        }
        if ((i & 4) != 0) {
            list = c9750yg.f44921c;
        }
        return c9750yg.m75289a(wireBird, birdAction, list);
    }

    /* renamed from: a */
    public final C9750YG m75289a(WireBird bird, BirdAction action, List<String> list) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(action, "action");
        return new C9750YG(bird, action, list);
    }

    /* renamed from: b */
    public final BirdAction m75288b() {
        return this.f44920b;
    }

    /* renamed from: c */
    public final WireBird m75287c() {
        return this.f44919a;
    }

    /* renamed from: d */
    public final List<String> m75286d() {
        return this.f44921c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9750YG) {
            C9750YG c9750yg = (C9750YG) obj;
            return Intrinsics.areEqual(this.f44919a, c9750yg.f44919a) && this.f44920b == c9750yg.f44920b && Intrinsics.areEqual(this.f44921c, c9750yg.f44921c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f44919a.hashCode() * 31) + this.f44920b.hashCode()) * 31;
        List<String> list = this.f44921c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        WireBird wireBird = this.f44919a;
        BirdAction birdAction = this.f44920b;
        List<String> list = this.f44921c;
        return "BirdActionClickEvent(bird=" + wireBird + ", action=" + birdAction + ", nearbyBirds=" + list + ")";
    }

    public /* synthetic */ C9750YG(WireBird wireBird, BirdAction birdAction, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wireBird, birdAction, (i & 4) != 0 ? null : list);
    }
}
