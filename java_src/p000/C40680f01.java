package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Lf01;", "", "", "titleLabel", "Lorg/joda/time/DateTime;", "lastUpdate", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;)V", "co.bird.android.feature.operator.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: f01  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40680f01 {

    /* renamed from: a */
    public final String f79267a;

    /* renamed from: b */
    public final DateTime f79268b;

    public C40680f01(String titleLabel, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        this.f79267a = titleLabel;
        this.f79268b = dateTime;
    }

    public static /* synthetic */ C40680f01 copy$default(C40680f01 c40680f01, String str, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c40680f01.f79267a;
        }
        if ((i & 2) != 0) {
            dateTime = c40680f01.f79268b;
        }
        return c40680f01.m42289a(str, dateTime);
    }

    /* renamed from: a */
    public final C40680f01 m42289a(String titleLabel, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        return new C40680f01(titleLabel, dateTime);
    }

    /* renamed from: b */
    public final DateTime m42288b() {
        return this.f79268b;
    }

    /* renamed from: c */
    public final String m42287c() {
        return this.f79267a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C40680f01) {
            C40680f01 c40680f01 = (C40680f01) obj;
            return Intrinsics.areEqual(this.f79267a, c40680f01.f79267a) && Intrinsics.areEqual(this.f79268b, c40680f01.f79268b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f79267a.hashCode() * 31;
        DateTime dateTime = this.f79268b;
        return hashCode + (dateTime == null ? 0 : dateTime.hashCode());
    }

    public String toString() {
        String str = this.f79267a;
        DateTime dateTime = this.f79268b;
        return "DemandAreaViewModel(titleLabel=" + str + ", lastUpdate=" + dateTime + ")";
    }

    public /* synthetic */ C40680f01(String str, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : dateTime);
    }
}
