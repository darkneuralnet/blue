package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Issue;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m28432d2 = {"LEa2;", "", "Lco/bird/android/model/Issue;", C17296a.f69688o, "", "b", "LH6;", "c", "supertype", "repairInfo", "subtypesSection", DateTokenConverter.CONVERTER_KEY, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/Issue;", "f", "()Lco/bird/android/model/Issue;", "Ljava/lang/String;", "getRepairInfo", "()Ljava/lang/String;", "LH6;", "e", "()LH6;", "<init>", "(Lco/bird/android/model/Issue;Ljava/lang/String;LH6;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ea2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32551Ea2 {

    /* renamed from: a */
    public final Issue f7715a;

    /* renamed from: b */
    public final String f7716b;

    /* renamed from: c */
    public final C3023H6 f7717c;

    public C32551Ea2(Issue supertype, String repairInfo, C3023H6 subtypesSection) {
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        Intrinsics.checkNotNullParameter(repairInfo, "repairInfo");
        Intrinsics.checkNotNullParameter(subtypesSection, "subtypesSection");
        this.f7715a = supertype;
        this.f7716b = repairInfo;
        this.f7717c = subtypesSection;
    }

    public static /* synthetic */ C32551Ea2 copy$default(C32551Ea2 c32551Ea2, Issue issue, String str, C3023H6 c3023h6, int i, Object obj) {
        if ((i & 1) != 0) {
            issue = c32551Ea2.f7715a;
        }
        if ((i & 2) != 0) {
            str = c32551Ea2.f7716b;
        }
        if ((i & 4) != 0) {
            c3023h6 = c32551Ea2.f7717c;
        }
        return c32551Ea2.m108784d(issue, str, c3023h6);
    }

    /* renamed from: a */
    public final Issue m108787a() {
        return this.f7715a;
    }

    /* renamed from: b */
    public final String m108786b() {
        return this.f7716b;
    }

    /* renamed from: c */
    public final C3023H6 m108785c() {
        return this.f7717c;
    }

    /* renamed from: d */
    public final C32551Ea2 m108784d(Issue supertype, String repairInfo, C3023H6 subtypesSection) {
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        Intrinsics.checkNotNullParameter(repairInfo, "repairInfo");
        Intrinsics.checkNotNullParameter(subtypesSection, "subtypesSection");
        return new C32551Ea2(supertype, repairInfo, subtypesSection);
    }

    /* renamed from: e */
    public final C3023H6 m108783e() {
        return this.f7717c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C32551Ea2) {
            C32551Ea2 c32551Ea2 = (C32551Ea2) obj;
            return Intrinsics.areEqual(this.f7715a, c32551Ea2.f7715a) && Intrinsics.areEqual(this.f7716b, c32551Ea2.f7716b) && Intrinsics.areEqual(this.f7717c, c32551Ea2.f7717c);
        }
        return false;
    }

    /* renamed from: f */
    public final Issue m108782f() {
        return this.f7715a;
    }

    public int hashCode() {
        return (((this.f7715a.hashCode() * 31) + this.f7716b.hashCode()) * 31) + this.f7717c.hashCode();
    }

    public String toString() {
        Issue issue = this.f7715a;
        String str = this.f7716b;
        C3023H6 c3023h6 = this.f7717c;
        return "IssueSupertypeViewModel(supertype=" + issue + ", repairInfo=" + str + ", subtypesSection=" + c3023h6 + ")";
    }
}
