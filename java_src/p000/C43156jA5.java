package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.ReleaseInfo;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LjA5;", "LEu4;", "Lco/bird/android/model/persistence/nestedstructures/ReleaseInfo;", "info", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/persistence/nestedstructures/ReleaseInfo;", "b", "()Lco/bird/android/model/persistence/nestedstructures/ReleaseInfo;", "<init>", "(Lco/bird/android/model/persistence/nestedstructures/ReleaseInfo;)V", "release-assignment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jA5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43156jA5 implements InterfaceC32733Eu4 {

    /* renamed from: a */
    public final ReleaseInfo f92261a;

    public C43156jA5(ReleaseInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f92261a = info;
    }

    public static /* synthetic */ C43156jA5 copy$default(C43156jA5 c43156jA5, ReleaseInfo releaseInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            releaseInfo = c43156jA5.f92261a;
        }
        return c43156jA5.m31034a(releaseInfo);
    }

    /* renamed from: a */
    public final C43156jA5 m31034a(ReleaseInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        return new C43156jA5(info);
    }

    /* renamed from: b */
    public final ReleaseInfo m31033b() {
        return this.f92261a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C43156jA5) && Intrinsics.areEqual(this.f92261a, ((C43156jA5) obj).f92261a);
    }

    public int hashCode() {
        return this.f92261a.hashCode();
    }

    public String toString() {
        ReleaseInfo releaseInfo = this.f92261a;
        return "ShowInfo(info=" + releaseInfo + ")";
    }
}
