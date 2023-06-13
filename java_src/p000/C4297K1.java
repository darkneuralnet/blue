package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0004B\u001b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LK1;", "Lkotlin/Function;", "", "T", "", LegacyRepairType.OTHER_KEY, "equals", "", "hashCode", "", "toString", C17296a.f69688o, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "label", "Lkotlin/Function;", "()Lkotlin/Function;", "action", "<init>", "(Ljava/lang/String;Lkotlin/Function;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: K1 */
/* loaded from: classes.dex */
public final class C4297K1<T extends Function<? extends Boolean>> {

    /* renamed from: a */
    public final String f18924a;

    /* renamed from: b */
    public final T f18925b;

    public C4297K1(String str, T t) {
        this.f18924a = str;
        this.f18925b = t;
    }

    /* renamed from: a */
    public final T m99357a() {
        return this.f18925b;
    }

    /* renamed from: b */
    public final String m99356b() {
        return this.f18924a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4297K1)) {
            return false;
        }
        C4297K1 c4297k1 = (C4297K1) obj;
        if (Intrinsics.areEqual(this.f18924a, c4297k1.f18924a) && Intrinsics.areEqual(this.f18925b, c4297k1.f18925b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.f18924a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        T t = this.f18925b;
        if (t != null) {
            i2 = t.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f18924a + ", action=" + this.f18925b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
