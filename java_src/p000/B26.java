package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u000f\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, m28432d2 = {"LB26;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "Lpm0;", C17296a.f69688o, "J", "b", "()J", "handleColor", "backgroundColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: B26 */
/* loaded from: classes.dex */
public final class B26 {

    /* renamed from: a */
    public final long f1561a;

    /* renamed from: b */
    public final long f1562b;

    public /* synthetic */ B26(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: a */
    public final long m114777a() {
        return this.f1562b;
    }

    /* renamed from: b */
    public final long m114776b() {
        return this.f1561a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B26)) {
            return false;
        }
        B26 b26 = (B26) obj;
        if (C47063pm0.m18741o(this.f1561a, b26.f1561a) && C47063pm0.m18741o(this.f1562b, b26.f1562b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (C47063pm0.m18735u(this.f1561a) * 31) + C47063pm0.m18735u(this.f1562b);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) C47063pm0.m18734v(this.f1561a)) + ", selectionBackgroundColor=" + ((Object) C47063pm0.m18734v(this.f1562b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public B26(long j, long j2) {
        this.f1561a = j;
        this.f1562b = j2;
    }
}
