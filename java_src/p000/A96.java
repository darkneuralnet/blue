package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LA96;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "LDf;", C17296a.f69688o, "LDf;", "b", "()LDf;", Entry.TYPE_TEXT, "LHe3;", "LHe3;", "()LHe3;", "offsetMapping", "<init>", "(LDf;LHe3;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: A96 */
/* loaded from: classes.dex */
public final class A96 {

    /* renamed from: a */
    public final C1577Df f220a;

    /* renamed from: b */
    public final InterfaceC33290He3 f221b;

    public A96(C1577Df text, InterfaceC33290He3 offsetMapping) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        this.f220a = text;
        this.f221b = offsetMapping;
    }

    /* renamed from: a */
    public final InterfaceC33290He3 m116052a() {
        return this.f221b;
    }

    /* renamed from: b */
    public final C1577Df m116051b() {
        return this.f220a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A96)) {
            return false;
        }
        A96 a96 = (A96) obj;
        if (Intrinsics.areEqual(this.f220a, a96.f220a) && Intrinsics.areEqual(this.f221b, a96.f221b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f220a.hashCode() * 31) + this.f221b.hashCode();
    }

    public String toString() {
        return "TransformedText(text=" + ((Object) this.f220a) + ", offsetMapping=" + this.f221b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
