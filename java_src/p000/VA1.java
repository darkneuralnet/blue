package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LVA1;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "()Ljava/lang/String;", "name", "b", "Z", "()Z", "value", "<init>", "(Ljava/lang/String;Z)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: VA1 */
/* loaded from: classes5.dex */
public final class VA1 {

    /* renamed from: a */
    public final String f38702a;

    /* renamed from: b */
    public final boolean f38703b;

    public VA1(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f38702a = name;
        this.f38703b = z;
    }

    /* renamed from: a */
    public final String m80266a() {
        return this.f38702a;
    }

    /* renamed from: b */
    public final boolean m80265b() {
        return this.f38703b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VA1) {
                VA1 va1 = (VA1) obj;
                return Intrinsics.areEqual(this.f38702a, va1.f38702a) && this.f38703b == va1.f38703b;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f38702a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f38703b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "GateKeeper(name=" + this.f38702a + ", value=" + this.f38703b + ")";
    }
}
