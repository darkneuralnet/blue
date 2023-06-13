package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"LC22;", "LPa6;", "", "cost", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "co.bird.android.feature.tutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: C22 */
/* loaded from: classes3.dex */
public final class C22 extends AbstractC35129Pa6 {

    /* renamed from: a */
    public final String f3318a;

    public C22(String str) {
        super(null);
        this.f3318a = str;
    }

    public static /* synthetic */ C22 copy$default(C22 c22, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c22.f3318a;
        }
        return c22.m112958a(str);
    }

    /* renamed from: a */
    public final C22 m112958a(String str) {
        return new C22(str);
    }

    /* renamed from: b */
    public final String m112957b() {
        return this.f3318a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22) && Intrinsics.areEqual(this.f3318a, ((C22) obj).f3318a);
    }

    public int hashCode() {
        String str = this.f3318a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.f3318a;
        return "InitializeGroupRides(cost=" + str + ")";
    }
}
