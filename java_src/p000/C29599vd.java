package p000;

import android.view.PointerIcon;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, m28432d2 = {"Lvd;", "LdX3;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "Landroid/view/PointerIcon;", C17296a.f69688o, "Landroid/view/PointerIcon;", "()Landroid/view/PointerIcon;", "pointerIcon", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vd */
/* loaded from: classes.dex */
public final class C29599vd implements InterfaceC39804dX3 {

    /* renamed from: a */
    public final PointerIcon f114415a;

    /* renamed from: a */
    public final PointerIcon m8338a() {
        return this.f114415a;
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
        if (!Intrinsics.areEqual(C29599vd.class, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return Intrinsics.areEqual(this.f114415a, ((C29599vd) obj).f114415a);
    }

    public int hashCode() {
        return this.f114415a.hashCode();
    }

    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.f114415a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
