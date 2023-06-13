package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.Bird;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\u0006HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m28432d2 = {"LK44;", "", "Lco/bird/android/model/persistence/Bird;", "bird", "", "scanDetected", "", "subtitle", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/persistence/Bird;", "b", "()Lco/bird/android/model/persistence/Bird;", "Z", "c", "()Z", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "<init>", "(Lco/bird/android/model/persistence/Bird;ZLjava/lang/String;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: K44 */
/* loaded from: classes3.dex */
public final class K44 {

    /* renamed from: a */
    public final Bird f19030a;

    /* renamed from: b */
    public final boolean f19031b;

    /* renamed from: c */
    public final String f19032c;

    public K44(Bird bird, boolean z, String subtitle) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f19030a = bird;
        this.f19031b = z;
        this.f19032c = subtitle;
    }

    public static /* synthetic */ K44 copy$default(K44 k44, Bird bird, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bird = k44.f19030a;
        }
        if ((i & 2) != 0) {
            z = k44.f19031b;
        }
        if ((i & 4) != 0) {
            str = k44.f19032c;
        }
        return k44.m99262a(bird, z, str);
    }

    /* renamed from: a */
    public final K44 m99262a(Bird bird, boolean z, String subtitle) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new K44(bird, z, subtitle);
    }

    /* renamed from: b */
    public final Bird m99261b() {
        return this.f19030a;
    }

    /* renamed from: c */
    public final boolean m99260c() {
        return this.f19031b;
    }

    /* renamed from: d */
    public final String m99259d() {
        return this.f19032c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof K44) {
            K44 k44 = (K44) obj;
            return Intrinsics.areEqual(this.f19030a, k44.f19030a) && this.f19031b == k44.f19031b && Intrinsics.areEqual(this.f19032c, k44.f19032c);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f19030a.hashCode() * 31;
        boolean z = this.f19031b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.f19032c.hashCode();
    }

    public String toString() {
        Bird bird = this.f19030a;
        boolean z = this.f19031b;
        String str = this.f19032c;
        return "PrivateBirdOverviewViewModel(bird=" + bird + ", scanDetected=" + z + ", subtitle=" + str + ")";
    }

    public /* synthetic */ K44(Bird bird, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bird, (i & 2) != 0 ? true : z, str);
    }
}
