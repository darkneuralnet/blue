package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, m28432d2 = {"LAo6;", "LAa6;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", C17296a.f69688o, "Ljava/lang/String;", "()Ljava/lang/String;", "verbatim", "<init>", "(Ljava/lang/String;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ao6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31745Ao6 extends AbstractC31619Aa6 {

    /* renamed from: a */
    public final String f1151a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31745Ao6(String verbatim) {
        super(null);
        Intrinsics.checkNotNullParameter(verbatim, "verbatim");
        this.f1151a = verbatim;
    }

    /* renamed from: a */
    public final String m115146a() {
        return this.f1151a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C31745Ao6) && Intrinsics.areEqual(this.f1151a, ((C31745Ao6) obj).f1151a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1151a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f1151a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
