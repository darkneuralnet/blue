package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m28432d2 = {"Lyy3;", "", "", "id", "locationLabel", "LHQ5;", "statusViewModel", "", "success", C17296a.f69688o, "(Ljava/lang/String;Ljava/lang/String;LHQ5;Ljava/lang/Boolean;)Lyy3;", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "LHQ5;", DateTokenConverter.CONVERTER_KEY, "()LHQ5;", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;LHQ5;Ljava/lang/Boolean;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: yy3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52521yy3 {

    /* renamed from: a */
    public final String f120461a;

    /* renamed from: b */
    public final String f120462b;

    /* renamed from: c */
    public final HQ5 f120463c;

    /* renamed from: d */
    public final Boolean f120464d;

    public C52521yy3(String id, String locationLabel, HQ5 statusViewModel, Boolean bool) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(locationLabel, "locationLabel");
        Intrinsics.checkNotNullParameter(statusViewModel, "statusViewModel");
        this.f120461a = id;
        this.f120462b = locationLabel;
        this.f120463c = statusViewModel;
        this.f120464d = bool;
    }

    public static /* synthetic */ C52521yy3 copy$default(C52521yy3 c52521yy3, String str, String str2, HQ5 hq5, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c52521yy3.f120461a;
        }
        if ((i & 2) != 0) {
            str2 = c52521yy3.f120462b;
        }
        if ((i & 4) != 0) {
            hq5 = c52521yy3.f120463c;
        }
        if ((i & 8) != 0) {
            bool = c52521yy3.f120464d;
        }
        return c52521yy3.m2203a(str, str2, hq5, bool);
    }

    /* renamed from: a */
    public final C52521yy3 m2203a(String id, String locationLabel, HQ5 statusViewModel, Boolean bool) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(locationLabel, "locationLabel");
        Intrinsics.checkNotNullParameter(statusViewModel, "statusViewModel");
        return new C52521yy3(id, locationLabel, statusViewModel, bool);
    }

    /* renamed from: b */
    public final String m2202b() {
        return this.f120461a;
    }

    /* renamed from: c */
    public final String m2201c() {
        return this.f120462b;
    }

    /* renamed from: d */
    public final HQ5 m2200d() {
        return this.f120463c;
    }

    /* renamed from: e */
    public final Boolean m2199e() {
        return this.f120464d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C52521yy3) {
            C52521yy3 c52521yy3 = (C52521yy3) obj;
            return Intrinsics.areEqual(this.f120461a, c52521yy3.f120461a) && Intrinsics.areEqual(this.f120462b, c52521yy3.f120462b) && Intrinsics.areEqual(this.f120463c, c52521yy3.f120463c) && Intrinsics.areEqual(this.f120464d, c52521yy3.f120464d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f120461a.hashCode() * 31) + this.f120462b.hashCode()) * 31) + this.f120463c.hashCode()) * 31;
        Boolean bool = this.f120464d;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        String str = this.f120461a;
        String str2 = this.f120462b;
        HQ5 hq5 = this.f120463c;
        Boolean bool = this.f120464d;
        return "OrderViewModel(id=" + str + ", locationLabel=" + str2 + ", statusViewModel=" + hq5 + ", success=" + bool + ")";
    }

    public /* synthetic */ C52521yy3(String str, String str2, HQ5 hq5, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, hq5, (i & 8) != 0 ? null : bool);
    }
}
