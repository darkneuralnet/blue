package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000e\u001a\u00028\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u000e\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LYk1;", "T", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "value", "Lwj6;", "Lwj6;", "()Lwj6;", "validation", "<init>", "(Ljava/lang/Object;Lwj6;)V", "components-core_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: Yk1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37320Yk1<T> {

    /* renamed from: a */
    public final T f46517a;

    /* renamed from: b */
    public final AbstractC51188wj6 f46518b;

    public C37320Yk1(T t, AbstractC51188wj6 validation) {
        Intrinsics.checkNotNullParameter(validation, "validation");
        this.f46517a = t;
        this.f46518b = validation;
    }

    /* renamed from: a */
    public final AbstractC51188wj6 m74342a() {
        return this.f46518b;
    }

    /* renamed from: b */
    public final T m74341b() {
        return this.f46517a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37320Yk1) {
            C37320Yk1 c37320Yk1 = (C37320Yk1) obj;
            return Intrinsics.areEqual(this.f46517a, c37320Yk1.f46517a) && Intrinsics.areEqual(this.f46518b, c37320Yk1.f46518b);
        }
        return false;
    }

    public int hashCode() {
        T t = this.f46517a;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.f46518b.hashCode();
    }

    public String toString() {
        return "FieldState(value=" + this.f46517a + ", validation=" + this.f46518b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
