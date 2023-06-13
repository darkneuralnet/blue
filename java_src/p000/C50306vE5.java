package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.networking.FraudDetectionData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ5\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, m28432d2 = {"LvE5;", "", "LsE5;", "smartlock", "LwE5;", "event", "", "exception", "Lorg/joda/time/DateTime;", FraudDetectionData.KEY_TIMESTAMP, C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "LsE5;", DateTokenConverter.CONVERTER_KEY, "()LsE5;", "b", "LwE5;", "()LwE5;", "c", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "Lorg/joda/time/DateTime;", "e", "()Lorg/joda/time/DateTime;", "<init>", "(LsE5;LwE5;Ljava/lang/Throwable;Lorg/joda/time/DateTime;)V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vE5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50306vE5 {

    /* renamed from: a */
    public final C48528sE5 f113726a;

    /* renamed from: b */
    public final EnumC50899wE5 f113727b;

    /* renamed from: c */
    public final Throwable f113728c;

    /* renamed from: d */
    public final DateTime f113729d;

    public C50306vE5(C48528sE5 c48528sE5, EnumC50899wE5 event, Throwable th, DateTime timestamp) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.f113726a = c48528sE5;
        this.f113727b = event;
        this.f113728c = th;
        this.f113729d = timestamp;
    }

    public static /* synthetic */ C50306vE5 copy$default(C50306vE5 c50306vE5, C48528sE5 c48528sE5, EnumC50899wE5 enumC50899wE5, Throwable th, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            c48528sE5 = c50306vE5.f113726a;
        }
        if ((i & 2) != 0) {
            enumC50899wE5 = c50306vE5.f113727b;
        }
        if ((i & 4) != 0) {
            th = c50306vE5.f113728c;
        }
        if ((i & 8) != 0) {
            dateTime = c50306vE5.f113729d;
        }
        return c50306vE5.m8986a(c48528sE5, enumC50899wE5, th, dateTime);
    }

    /* renamed from: a */
    public final C50306vE5 m8986a(C48528sE5 c48528sE5, EnumC50899wE5 event, Throwable th, DateTime timestamp) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return new C50306vE5(c48528sE5, event, th, timestamp);
    }

    /* renamed from: b */
    public final EnumC50899wE5 m8985b() {
        return this.f113727b;
    }

    /* renamed from: c */
    public final Throwable m8984c() {
        return this.f113728c;
    }

    /* renamed from: d */
    public final C48528sE5 m8983d() {
        return this.f113726a;
    }

    /* renamed from: e */
    public final DateTime m8982e() {
        return this.f113729d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50306vE5) {
            C50306vE5 c50306vE5 = (C50306vE5) obj;
            return Intrinsics.areEqual(this.f113726a, c50306vE5.f113726a) && this.f113727b == c50306vE5.f113727b && Intrinsics.areEqual(this.f113728c, c50306vE5.f113728c) && Intrinsics.areEqual(this.f113729d, c50306vE5.f113729d);
        }
        return false;
    }

    public int hashCode() {
        C48528sE5 c48528sE5 = this.f113726a;
        int hashCode = (((c48528sE5 == null ? 0 : c48528sE5.hashCode()) * 31) + this.f113727b.hashCode()) * 31;
        Throwable th = this.f113728c;
        return ((hashCode + (th != null ? th.hashCode() : 0)) * 31) + this.f113729d.hashCode();
    }

    public String toString() {
        C48528sE5 c48528sE5 = this.f113726a;
        EnumC50899wE5 enumC50899wE5 = this.f113727b;
        Throwable th = this.f113728c;
        DateTime dateTime = this.f113729d;
        return "SmartLockEvent(smartlock=" + c48528sE5 + ", event=" + enumC50899wE5 + ", exception=" + th + ", timestamp=" + dateTime + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C50306vE5(C48528sE5 c48528sE5, EnumC50899wE5 enumC50899wE5, Throwable th, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c48528sE5, enumC50899wE5, th, dateTime);
        c48528sE5 = (i & 1) != 0 ? null : c48528sE5;
        th = (i & 4) != 0 ? null : th;
        if ((i & 8) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
