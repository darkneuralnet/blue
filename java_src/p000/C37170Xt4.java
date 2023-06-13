package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireQuickLink;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"LXt4;", "", "Lco/bird/android/model/wire/WireQuickLink;", "quickLink", "", "iconRes", C17296a.f69688o, "(Lco/bird/android/model/wire/WireQuickLink;Ljava/lang/Integer;)LXt4;", "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WireQuickLink;", "c", "()Lco/bird/android/model/wire/WireQuickLink;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "<init>", "(Lco/bird/android/model/wire/WireQuickLink;Ljava/lang/Integer;)V", "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Xt4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37170Xt4 {

    /* renamed from: a */
    public final WireQuickLink f44154a;

    /* renamed from: b */
    public final Integer f44155b;

    public C37170Xt4(WireQuickLink quickLink, Integer num) {
        Intrinsics.checkNotNullParameter(quickLink, "quickLink");
        this.f44154a = quickLink;
        this.f44155b = num;
    }

    public static /* synthetic */ C37170Xt4 copy$default(C37170Xt4 c37170Xt4, WireQuickLink wireQuickLink, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            wireQuickLink = c37170Xt4.f44154a;
        }
        if ((i & 2) != 0) {
            num = c37170Xt4.f44155b;
        }
        return c37170Xt4.m76174a(wireQuickLink, num);
    }

    /* renamed from: a */
    public final C37170Xt4 m76174a(WireQuickLink quickLink, Integer num) {
        Intrinsics.checkNotNullParameter(quickLink, "quickLink");
        return new C37170Xt4(quickLink, num);
    }

    /* renamed from: b */
    public final Integer m76173b() {
        return this.f44155b;
    }

    /* renamed from: c */
    public final WireQuickLink m76172c() {
        return this.f44154a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37170Xt4) {
            C37170Xt4 c37170Xt4 = (C37170Xt4) obj;
            return Intrinsics.areEqual(this.f44154a, c37170Xt4.f44154a) && Intrinsics.areEqual(this.f44155b, c37170Xt4.f44155b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f44154a.hashCode() * 31;
        Integer num = this.f44155b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        WireQuickLink wireQuickLink = this.f44154a;
        Integer num = this.f44155b;
        return "RelatedLinkViewModel(quickLink=" + wireQuickLink + ", iconRes=" + num + ")";
    }
}
