package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LaA5;", "Luw3;", "LSc0;", "cancelTaskData", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "LSc0;", "b", "()LSc0;", "<init>", "(LSc0;)V", "task-list-v2_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: aA5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37802aA5 extends AbstractC50130uw3 {

    /* renamed from: a */
    public final C35843Sc0 f50032a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37802aA5(C35843Sc0 cancelTaskData) {
        super(null);
        Intrinsics.checkNotNullParameter(cancelTaskData, "cancelTaskData");
        this.f50032a = cancelTaskData;
    }

    public static /* synthetic */ C37802aA5 copy$default(C37802aA5 c37802aA5, C35843Sc0 c35843Sc0, int i, Object obj) {
        if ((i & 1) != 0) {
            c35843Sc0 = c37802aA5.f50032a;
        }
        return c37802aA5.m71807a(c35843Sc0);
    }

    /* renamed from: a */
    public final C37802aA5 m71807a(C35843Sc0 cancelTaskData) {
        Intrinsics.checkNotNullParameter(cancelTaskData, "cancelTaskData");
        return new C37802aA5(cancelTaskData);
    }

    /* renamed from: b */
    public final C35843Sc0 m71806b() {
        return this.f50032a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37802aA5) && Intrinsics.areEqual(this.f50032a, ((C37802aA5) obj).f50032a);
    }

    public int hashCode() {
        return this.f50032a.hashCode();
    }

    public String toString() {
        C35843Sc0 c35843Sc0 = this.f50032a;
        return "ShowCancelTaskDialog(cancelTaskData=" + c35843Sc0 + ")";
    }
}
