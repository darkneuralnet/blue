package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"Lr36;", "", "LVw2;", "location", "Lorg/joda/time/DateTime;", "dateTime", "expires", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "LVw2;", "c", "()LVw2;", "b", "Lorg/joda/time/DateTime;", "getDateTime", "()Lorg/joda/time/DateTime;", "<init>", "(LVw2;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: r36  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47831r36 {

    /* renamed from: a */
    public final C36727Vw2 f106364a;

    /* renamed from: b */
    public final DateTime f106365b;

    /* renamed from: c */
    public final DateTime f106366c;

    public C47831r36(C36727Vw2 location, DateTime dateTime, DateTime expires) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        Intrinsics.checkNotNullParameter(expires, "expires");
        this.f106364a = location;
        this.f106365b = dateTime;
        this.f106366c = expires;
    }

    public static /* synthetic */ C47831r36 copy$default(C47831r36 c47831r36, C36727Vw2 c36727Vw2, DateTime dateTime, DateTime dateTime2, int i, Object obj) {
        if ((i & 1) != 0) {
            c36727Vw2 = c47831r36.f106364a;
        }
        if ((i & 2) != 0) {
            dateTime = c47831r36.f106365b;
        }
        if ((i & 4) != 0) {
            dateTime2 = c47831r36.f106366c;
        }
        return c47831r36.m16555a(c36727Vw2, dateTime, dateTime2);
    }

    /* renamed from: a */
    public final C47831r36 m16555a(C36727Vw2 location, DateTime dateTime, DateTime expires) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        Intrinsics.checkNotNullParameter(expires, "expires");
        return new C47831r36(location, dateTime, expires);
    }

    /* renamed from: b */
    public final DateTime m16554b() {
        return this.f106366c;
    }

    /* renamed from: c */
    public final C36727Vw2 m16553c() {
        return this.f106364a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C47831r36) {
            C47831r36 c47831r36 = (C47831r36) obj;
            return Intrinsics.areEqual(this.f106364a, c47831r36.f106364a) && Intrinsics.areEqual(this.f106365b, c47831r36.f106365b) && Intrinsics.areEqual(this.f106366c, c47831r36.f106366c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f106364a.hashCode() * 31) + this.f106365b.hashCode()) * 31) + this.f106366c.hashCode();
    }

    public String toString() {
        C36727Vw2 c36727Vw2 = this.f106364a;
        DateTime dateTime = this.f106365b;
        DateTime dateTime2 = this.f106366c;
        return "ThirdPartyLocationWithExpiration(location=" + c36727Vw2 + ", dateTime=" + dateTime + ", expires=" + dateTime2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C47831r36(C36727Vw2 c36727Vw2, DateTime dateTime, DateTime dateTime2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c36727Vw2, dateTime, dateTime2);
        if ((i & 2) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
