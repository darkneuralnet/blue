package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Ltr2;", "", "", "headerLabel", "LHQ5;", "statusViewModel", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "LHQ5;", "c", "()LHQ5;", "<init>", "(Ljava/lang/String;LHQ5;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tr2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49486tr2 {

    /* renamed from: a */
    public final String f111149a;

    /* renamed from: b */
    public final HQ5 f111150b;

    public C49486tr2(String headerLabel, HQ5 statusViewModel) {
        Intrinsics.checkNotNullParameter(headerLabel, "headerLabel");
        Intrinsics.checkNotNullParameter(statusViewModel, "statusViewModel");
        this.f111149a = headerLabel;
        this.f111150b = statusViewModel;
    }

    public static /* synthetic */ C49486tr2 copy$default(C49486tr2 c49486tr2, String str, HQ5 hq5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c49486tr2.f111149a;
        }
        if ((i & 2) != 0) {
            hq5 = c49486tr2.f111150b;
        }
        return c49486tr2.m11594a(str, hq5);
    }

    /* renamed from: a */
    public final C49486tr2 m11594a(String headerLabel, HQ5 statusViewModel) {
        Intrinsics.checkNotNullParameter(headerLabel, "headerLabel");
        Intrinsics.checkNotNullParameter(statusViewModel, "statusViewModel");
        return new C49486tr2(headerLabel, statusViewModel);
    }

    /* renamed from: b */
    public final String m11593b() {
        return this.f111149a;
    }

    /* renamed from: c */
    public final HQ5 m11592c() {
        return this.f111150b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C49486tr2) {
            C49486tr2 c49486tr2 = (C49486tr2) obj;
            return Intrinsics.areEqual(this.f111149a, c49486tr2.f111149a) && Intrinsics.areEqual(this.f111150b, c49486tr2.f111150b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f111149a.hashCode() * 31) + this.f111150b.hashCode();
    }

    public String toString() {
        String str = this.f111149a;
        HQ5 hq5 = this.f111150b;
        return "LineItemStatusViewModel(headerLabel=" + str + ", statusViewModel=" + hq5 + ")";
    }
}
