package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0012"}, m28432d2 = {"LlF0;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", C17296a.f69688o, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "label", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "action", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lF0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44382lF0 {

    /* renamed from: a */
    public final String f95768a;

    /* renamed from: b */
    public final Function0<Boolean> f95769b;

    /* renamed from: a */
    public final Function0<Boolean> m27628a() {
        return this.f95769b;
    }

    /* renamed from: b */
    public final String m27627b() {
        return this.f95768a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44382lF0)) {
            return false;
        }
        C44382lF0 c44382lF0 = (C44382lF0) obj;
        if (Intrinsics.areEqual(this.f95768a, c44382lF0.f95768a) && Intrinsics.areEqual(this.f95769b, c44382lF0.f95769b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f95768a.hashCode() * 31) + this.f95769b.hashCode();
    }

    public String toString() {
        return "CustomAccessibilityAction(label=" + this.f95768a + ", action=" + this.f95769b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
