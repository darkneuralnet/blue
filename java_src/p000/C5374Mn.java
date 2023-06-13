package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LMn;", "LRm;", "Lorg/joda/time/DateTime;", "lastUpdate", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lorg/joda/time/DateTime;", "b", "()Lorg/joda/time/DateTime;", "<init>", "(Lorg/joda/time/DateTime;)V", "co.bird.android.feature.operator.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Mn */
/* loaded from: classes3.dex */
public final class C5374Mn implements InterfaceC7269Rm {

    /* renamed from: a */
    public final DateTime f23565a;

    public C5374Mn() {
        this(null, 1, null);
    }

    public static /* synthetic */ C5374Mn copy$default(C5374Mn c5374Mn, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            dateTime = c5374Mn.f23565a;
        }
        return c5374Mn.m94842a(dateTime);
    }

    /* renamed from: a */
    public final C5374Mn m94842a(DateTime dateTime) {
        return new C5374Mn(dateTime);
    }

    /* renamed from: b */
    public final DateTime m94841b() {
        return this.f23565a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5374Mn) && Intrinsics.areEqual(this.f23565a, ((C5374Mn) obj).f23565a);
    }

    public int hashCode() {
        DateTime dateTime = this.f23565a;
        if (dateTime == null) {
            return 0;
        }
        return dateTime.hashCode();
    }

    public String toString() {
        DateTime dateTime = this.f23565a;
        return "AreaRefreshBottomSheetModel(lastUpdate=" + dateTime + ")";
    }

    public C5374Mn(DateTime dateTime) {
        this.f23565a = dateTime;
    }

    public /* synthetic */ C5374Mn(DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dateTime);
    }
}
