package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016¨\u0006\u0019"}, m28432d2 = {"LAT5;", "T", "LZ21;", "LWX;", "currentOpSettings", "value", C17296a.f69688o, "(LWX;Ljava/lang/Object;)LAT5;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "b", "LWX;", "getCurrentOpSettings", "()LWX;", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "<init>", "(LWX;Ljava/lang/Object;)V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: AT5 */
/* loaded from: classes2.dex */
public final class AT5<T> implements Z21<T> {

    /* renamed from: b */
    public final InterfaceC9077WX f619b;

    /* renamed from: c */
    public final T f620c;

    public AT5(InterfaceC9077WX currentOpSettings, T t) {
        Intrinsics.checkNotNullParameter(currentOpSettings, "currentOpSettings");
        this.f619b = currentOpSettings;
        this.f620c = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AT5 copy$default(AT5 at5, InterfaceC9077WX interfaceC9077WX, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            interfaceC9077WX = at5.f619b;
        }
        if ((i & 2) != 0) {
            obj = at5.f620c;
        }
        return at5.m115733a(interfaceC9077WX, obj);
    }

    /* renamed from: a */
    public final AT5<T> m115733a(InterfaceC9077WX currentOpSettings, T t) {
        Intrinsics.checkNotNullParameter(currentOpSettings, "currentOpSettings");
        return new AT5<>(currentOpSettings, t);
    }

    /* renamed from: b */
    public final T m115732b() {
        return this.f620c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AT5) {
            AT5 at5 = (AT5) obj;
            return Intrinsics.areEqual(this.f619b, at5.f619b) && Intrinsics.areEqual(this.f620c, at5.f620c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f619b.hashCode() * 31;
        T t = this.f620c;
        return hashCode + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        InterfaceC9077WX interfaceC9077WX = this.f619b;
        T t = this.f620c;
        return "SuccessResult(currentOpSettings=" + interfaceC9077WX + ", value=" + t + ")";
    }
}
