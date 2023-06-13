package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LBo3;", "", "", "date", "time", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Bo3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31976Bo3 {

    /* renamed from: a */
    public final String f2915a;

    /* renamed from: b */
    public final String f2916b;

    public C31976Bo3(String date, String time) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        this.f2915a = date;
        this.f2916b = time;
    }

    public static /* synthetic */ C31976Bo3 copy$default(C31976Bo3 c31976Bo3, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c31976Bo3.f2915a;
        }
        if ((i & 2) != 0) {
            str2 = c31976Bo3.f2916b;
        }
        return c31976Bo3.m113471a(str, str2);
    }

    /* renamed from: a */
    public final C31976Bo3 m113471a(String date, String time) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        return new C31976Bo3(date, time);
    }

    /* renamed from: b */
    public final String m113470b() {
        return this.f2915a;
    }

    /* renamed from: c */
    public final String m113469c() {
        return this.f2916b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C31976Bo3) {
            C31976Bo3 c31976Bo3 = (C31976Bo3) obj;
            return Intrinsics.areEqual(this.f2915a, c31976Bo3.f2915a) && Intrinsics.areEqual(this.f2916b, c31976Bo3.f2916b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f2915a.hashCode() * 31) + this.f2916b.hashCode();
    }

    public String toString() {
        String str = this.f2915a;
        String str2 = this.f2916b;
        return "OperatorOrderDateTimeViewModel(date=" + str + ", time=" + str2 + ")";
    }
}
