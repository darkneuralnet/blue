package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lwd;", "LdX3;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", C17296a.f69688o, "I", "()I", "type", "<init>", "(I)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wd */
/* loaded from: classes.dex */
public final class C29924wd implements InterfaceC39804dX3 {

    /* renamed from: a */
    public final int f116275a;

    public C29924wd(int i) {
        this.f116275a = i;
    }

    /* renamed from: a */
    public final int m6589a() {
        return this.f116275a;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(C29924wd.class, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        if (this.f116275a == ((C29924wd) obj).f116275a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f116275a;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.f116275a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
