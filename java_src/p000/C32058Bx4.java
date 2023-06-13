package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0019"}, m28432d2 = {"LBx4;", "", "", "id", "Lorg/joda/time/DateTime;", "dropOffWindowStart", "dropOffWindowEnd", "location", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "c", "()Lorg/joda/time/DateTime;", "e", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Bx4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C32058Bx4 {

    /* renamed from: a */
    public final String f3097a;

    /* renamed from: b */
    public final DateTime f3098b;

    /* renamed from: c */
    public final DateTime f3099c;

    /* renamed from: d */
    public final String f3100d;

    public C32058Bx4(String id, DateTime dropOffWindowStart, DateTime dropOffWindowEnd, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(dropOffWindowStart, "dropOffWindowStart");
        Intrinsics.checkNotNullParameter(dropOffWindowEnd, "dropOffWindowEnd");
        this.f3097a = id;
        this.f3098b = dropOffWindowStart;
        this.f3099c = dropOffWindowEnd;
        this.f3100d = str;
    }

    public static /* synthetic */ C32058Bx4 copy$default(C32058Bx4 c32058Bx4, String str, DateTime dateTime, DateTime dateTime2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c32058Bx4.f3097a;
        }
        if ((i & 2) != 0) {
            dateTime = c32058Bx4.f3098b;
        }
        if ((i & 4) != 0) {
            dateTime2 = c32058Bx4.f3099c;
        }
        if ((i & 8) != 0) {
            str2 = c32058Bx4.f3100d;
        }
        return c32058Bx4.m113260a(str, dateTime, dateTime2, str2);
    }

    /* renamed from: a */
    public final C32058Bx4 m113260a(String id, DateTime dropOffWindowStart, DateTime dropOffWindowEnd, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(dropOffWindowStart, "dropOffWindowStart");
        Intrinsics.checkNotNullParameter(dropOffWindowEnd, "dropOffWindowEnd");
        return new C32058Bx4(id, dropOffWindowStart, dropOffWindowEnd, str);
    }

    /* renamed from: b */
    public final DateTime m113259b() {
        return this.f3099c;
    }

    /* renamed from: c */
    public final DateTime m113258c() {
        return this.f3098b;
    }

    /* renamed from: d */
    public final String m113257d() {
        return this.f3097a;
    }

    /* renamed from: e */
    public final String m113256e() {
        return this.f3100d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C32058Bx4) {
            C32058Bx4 c32058Bx4 = (C32058Bx4) obj;
            return Intrinsics.areEqual(this.f3097a, c32058Bx4.f3097a) && Intrinsics.areEqual(this.f3098b, c32058Bx4.f3098b) && Intrinsics.areEqual(this.f3099c, c32058Bx4.f3099c) && Intrinsics.areEqual(this.f3100d, c32058Bx4.f3100d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f3097a.hashCode() * 31) + this.f3098b.hashCode()) * 31) + this.f3099c.hashCode()) * 31;
        String str = this.f3100d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f3097a;
        DateTime dateTime = this.f3098b;
        DateTime dateTime2 = this.f3099c;
        String str2 = this.f3100d;
        return "RentalDropOffWindowOptionModel(id=" + str + ", dropOffWindowStart=" + dateTime + ", dropOffWindowEnd=" + dateTime2 + ", location=" + str2 + ")";
    }
}
