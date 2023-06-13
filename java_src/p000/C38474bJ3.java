package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.PastWorkOrderButton;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001c"}, m28432d2 = {"LbJ3;", "", "", "issuesCount", "updatedAt", "", "issues", "Lco/bird/android/model/PastWorkOrderButton;", "button", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "e", "c", "Ljava/util/List;", "()Ljava/util/List;", "Lco/bird/android/model/PastWorkOrderButton;", "()Lco/bird/android/model/PastWorkOrderButton;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/PastWorkOrderButton;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bJ3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38474bJ3 {

    /* renamed from: a */
    public final String f57266a;

    /* renamed from: b */
    public final String f57267b;

    /* renamed from: c */
    public final List<String> f57268c;

    /* renamed from: d */
    public final PastWorkOrderButton f57269d;

    public C38474bJ3(String issuesCount, String updatedAt, List<String> issues, PastWorkOrderButton button) {
        Intrinsics.checkNotNullParameter(issuesCount, "issuesCount");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(issues, "issues");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f57266a = issuesCount;
        this.f57267b = updatedAt;
        this.f57268c = issues;
        this.f57269d = button;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C38474bJ3 copy$default(C38474bJ3 c38474bJ3, String str, String str2, List list, PastWorkOrderButton pastWorkOrderButton, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c38474bJ3.f57266a;
        }
        if ((i & 2) != 0) {
            str2 = c38474bJ3.f57267b;
        }
        if ((i & 4) != 0) {
            list = c38474bJ3.f57268c;
        }
        if ((i & 8) != 0) {
            pastWorkOrderButton = c38474bJ3.f57269d;
        }
        return c38474bJ3.m64691a(str, str2, list, pastWorkOrderButton);
    }

    /* renamed from: a */
    public final C38474bJ3 m64691a(String issuesCount, String updatedAt, List<String> issues, PastWorkOrderButton button) {
        Intrinsics.checkNotNullParameter(issuesCount, "issuesCount");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(issues, "issues");
        Intrinsics.checkNotNullParameter(button, "button");
        return new C38474bJ3(issuesCount, updatedAt, issues, button);
    }

    /* renamed from: b */
    public final PastWorkOrderButton m64690b() {
        return this.f57269d;
    }

    /* renamed from: c */
    public final List<String> m64689c() {
        return this.f57268c;
    }

    /* renamed from: d */
    public final String m64688d() {
        return this.f57266a;
    }

    /* renamed from: e */
    public final String m64687e() {
        return this.f57267b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C38474bJ3) {
            C38474bJ3 c38474bJ3 = (C38474bJ3) obj;
            return Intrinsics.areEqual(this.f57266a, c38474bJ3.f57266a) && Intrinsics.areEqual(this.f57267b, c38474bJ3.f57267b) && Intrinsics.areEqual(this.f57268c, c38474bJ3.f57268c) && Intrinsics.areEqual(this.f57269d, c38474bJ3.f57269d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f57266a.hashCode() * 31) + this.f57267b.hashCode()) * 31) + this.f57268c.hashCode()) * 31) + this.f57269d.hashCode();
    }

    public String toString() {
        String str = this.f57266a;
        String str2 = this.f57267b;
        List<String> list = this.f57268c;
        PastWorkOrderButton pastWorkOrderButton = this.f57269d;
        return "PastWorkOrderViewModel(issuesCount=" + str + ", updatedAt=" + str2 + ", issues=" + list + ", button=" + pastWorkOrderButton + ")";
    }
}
