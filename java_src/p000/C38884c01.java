package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"Lc01;", "", "", "id", "Lorg/joda/time/DateTime;", "deliveryWindowStart", "deliveryWindowEnd", "returnBy", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "c", "()Lorg/joda/time/DateTime;", "e", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: c01  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38884c01 {

    /* renamed from: a */
    public final String f59872a;

    /* renamed from: b */
    public final DateTime f59873b;

    /* renamed from: c */
    public final DateTime f59874c;

    /* renamed from: d */
    public final DateTime f59875d;

    public C38884c01(String id, DateTime deliveryWindowStart, DateTime deliveryWindowEnd, DateTime returnBy) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(deliveryWindowStart, "deliveryWindowStart");
        Intrinsics.checkNotNullParameter(deliveryWindowEnd, "deliveryWindowEnd");
        Intrinsics.checkNotNullParameter(returnBy, "returnBy");
        this.f59872a = id;
        this.f59873b = deliveryWindowStart;
        this.f59874c = deliveryWindowEnd;
        this.f59875d = returnBy;
    }

    public static /* synthetic */ C38884c01 copy$default(C38884c01 c38884c01, String str, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c38884c01.f59872a;
        }
        if ((i & 2) != 0) {
            dateTime = c38884c01.f59873b;
        }
        if ((i & 4) != 0) {
            dateTime2 = c38884c01.f59874c;
        }
        if ((i & 8) != 0) {
            dateTime3 = c38884c01.f59875d;
        }
        return c38884c01.m62046a(str, dateTime, dateTime2, dateTime3);
    }

    /* renamed from: a */
    public final C38884c01 m62046a(String id, DateTime deliveryWindowStart, DateTime deliveryWindowEnd, DateTime returnBy) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(deliveryWindowStart, "deliveryWindowStart");
        Intrinsics.checkNotNullParameter(deliveryWindowEnd, "deliveryWindowEnd");
        Intrinsics.checkNotNullParameter(returnBy, "returnBy");
        return new C38884c01(id, deliveryWindowStart, deliveryWindowEnd, returnBy);
    }

    /* renamed from: b */
    public final DateTime m62045b() {
        return this.f59874c;
    }

    /* renamed from: c */
    public final DateTime m62044c() {
        return this.f59873b;
    }

    /* renamed from: d */
    public final String m62043d() {
        return this.f59872a;
    }

    /* renamed from: e */
    public final DateTime m62042e() {
        return this.f59875d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C38884c01) {
            C38884c01 c38884c01 = (C38884c01) obj;
            return Intrinsics.areEqual(this.f59872a, c38884c01.f59872a) && Intrinsics.areEqual(this.f59873b, c38884c01.f59873b) && Intrinsics.areEqual(this.f59874c, c38884c01.f59874c) && Intrinsics.areEqual(this.f59875d, c38884c01.f59875d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f59872a.hashCode() * 31) + this.f59873b.hashCode()) * 31) + this.f59874c.hashCode()) * 31) + this.f59875d.hashCode();
    }

    public String toString() {
        String str = this.f59872a;
        DateTime dateTime = this.f59873b;
        DateTime dateTime2 = this.f59874c;
        DateTime dateTime3 = this.f59875d;
        return "DeliveryWindowOptionModel(id=" + str + ", deliveryWindowStart=" + dateTime + ", deliveryWindowEnd=" + dateTime2 + ", returnBy=" + dateTime3 + ")";
    }
}
