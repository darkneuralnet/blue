package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\n\u001a\u0004\b\t\u0010\r¨\u0006\u0011"}, m28432d2 = {"LEH1;", "", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "", "toString", C17296a.f69688o, "Ljava/lang/String;", "normalized", "b", "()Ljava/lang/String;", "name", "<init>", "(Ljava/lang/String;)V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: EH1 */
/* loaded from: classes5.dex */
public final class EH1 {

    /* renamed from: a */
    public final String f7184a;

    /* renamed from: b */
    public final String f7185b;

    public EH1(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f7185b = name;
        if (name != null) {
            String upperCase = name.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            this.f7184a = upperCase;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public final String m109248a() {
        return this.f7185b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof EH1) {
            return Intrinsics.areEqual(((EH1) obj).f7184a, this.f7184a);
        }
        if (obj instanceof String) {
            return Intrinsics.areEqual(new EH1((String) obj).f7184a, this.f7184a);
        }
        return false;
    }

    public int hashCode() {
        return this.f7184a.hashCode();
    }

    public String toString() {
        return this.f7185b;
    }
}
