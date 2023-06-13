package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LFj6;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "b", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Fj6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32870Fj6 {

    /* renamed from: a */
    public final String f10036a;

    /* renamed from: b */
    public final Object f10037b;

    public C32870Fj6(String name, Object obj) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f10036a = name;
        this.f10037b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C32870Fj6) {
            C32870Fj6 c32870Fj6 = (C32870Fj6) obj;
            return Intrinsics.areEqual(this.f10036a, c32870Fj6.f10036a) && Intrinsics.areEqual(this.f10037b, c32870Fj6.f10037b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f10036a.hashCode() * 31;
        Object obj = this.f10037b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "ValueElement(name=" + this.f10036a + ", value=" + this.f10037b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
