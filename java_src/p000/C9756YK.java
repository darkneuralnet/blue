package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireBirdEvent;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LYK;", "Lg70;", "Lco/bird/android/model/wire/WireBirdEvent;", "event", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WireBirdEvent;", "b", "()Lco/bird/android/model/wire/WireBirdEvent;", "<init>", "(Lco/bird/android/model/wire/WireBirdEvent;)V", "eventbus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: YK */
/* loaded from: classes2.dex */
public final class C9756YK extends AbstractC41342g70 {

    /* renamed from: a */
    public final WireBirdEvent f44976a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9756YK(WireBirdEvent event) {
        super(null);
        Intrinsics.checkNotNullParameter(event, "event");
        this.f44976a = event;
    }

    public static /* synthetic */ C9756YK copy$default(C9756YK c9756yk, WireBirdEvent wireBirdEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            wireBirdEvent = c9756yk.f44976a;
        }
        return c9756yk.m75248a(wireBirdEvent);
    }

    /* renamed from: a */
    public final C9756YK m75248a(WireBirdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return new C9756YK(event);
    }

    /* renamed from: b */
    public final WireBirdEvent m75247b() {
        return this.f44976a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9756YK) && Intrinsics.areEqual(this.f44976a, ((C9756YK) obj).f44976a);
    }

    public int hashCode() {
        return this.f44976a.hashCode();
    }

    public String toString() {
        WireBirdEvent wireBirdEvent = this.f44976a;
        return "BirdCommandEvent(event=" + wireBirdEvent + ")";
    }
}
