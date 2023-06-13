package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"LZS1;", "LbT1;", "Lorg/joda/time/DateTime;", "dateTime", "", "throwable", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lorg/joda/time/DateTime;", "getDateTime", "()Lorg/joda/time/DateTime;", "b", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "<init>", "(Lorg/joda/time/DateTime;Ljava/lang/Throwable;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ZS1 */
/* loaded from: classes2.dex */
public final class ZS1 extends AbstractC38562bT1 {

    /* renamed from: a */
    public final DateTime f48591a;

    /* renamed from: b */
    public final Throwable f48592b;

    public ZS1() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ZS1 copy$default(ZS1 zs1, DateTime dateTime, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            dateTime = zs1.f48591a;
        }
        if ((i & 2) != 0) {
            th = zs1.f48592b;
        }
        return zs1.m73097a(dateTime, th);
    }

    /* renamed from: a */
    public final ZS1 m73097a(DateTime dateTime, Throwable th) {
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        return new ZS1(dateTime, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZS1) {
            ZS1 zs1 = (ZS1) obj;
            return Intrinsics.areEqual(this.f48591a, zs1.f48591a) && Intrinsics.areEqual(this.f48592b, zs1.f48592b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f48591a.hashCode() * 31;
        Throwable th = this.f48592b;
        return hashCode + (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        DateTime dateTime = this.f48591a;
        Throwable th = this.f48592b;
        return "IdentificationBackgroundSubmissionFailed(dateTime=" + dateTime + ", throwable=" + th + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ZS1(DateTime dateTime, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dateTime, (i & 2) != 0 ? null : th);
        if ((i & 1) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZS1(DateTime dateTime, Throwable th) {
        super(null);
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        this.f48591a = dateTime;
        this.f48592b = th;
    }
}
