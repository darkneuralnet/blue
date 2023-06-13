package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0014\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, m28432d2 = {"LRr5;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "LHE1;", C17296a.f69688o, "LHE1;", "getHandle", "()LHE1;", "handle", "LCe3;", "b", "J", "getPosition-F1C5BW0", "()J", "position", "<init>", "(LHE1;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Rr5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35749Rr5 {

    /* renamed from: a */
    public final HE1 f32753a;

    /* renamed from: b */
    public final long f32754b;

    public /* synthetic */ C35749Rr5(HE1 he1, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(he1, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C35749Rr5) {
            C35749Rr5 c35749Rr5 = (C35749Rr5) obj;
            return this.f32753a == c35749Rr5.f32753a && C32120Ce3.m111947l(this.f32754b, c35749Rr5.f32754b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f32753a.hashCode() * 31) + C32120Ce3.m111942q(this.f32754b);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.f32753a + ", position=" + ((Object) C32120Ce3.m111937v(this.f32754b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C35749Rr5(HE1 he1, long j) {
        this.f32753a = he1;
        this.f32754b = j;
    }
}
