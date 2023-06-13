package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001e\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, m28432d2 = {"LBA3;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "Lpm0;", C17296a.f69688o, "J", "b", "()J", "glowColor", "LPD3;", "LPD3;", "()LPD3;", "drawPadding", "<init>", "(JLPD3;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: BA3 */
/* loaded from: classes.dex */
public final class BA3 {

    /* renamed from: a */
    public final long f1939a;

    /* renamed from: b */
    public final PD3 f1940b;

    public /* synthetic */ BA3(long j, PD3 pd3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, pd3);
    }

    /* renamed from: a */
    public final PD3 m114313a() {
        return this.f1940b;
    }

    /* renamed from: b */
    public final long m114312b() {
        return this.f1939a;
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
        if (!Intrinsics.areEqual(BA3.class, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        BA3 ba3 = (BA3) obj;
        if (C47063pm0.m18741o(this.f1939a, ba3.f1939a) && Intrinsics.areEqual(this.f1940b, ba3.f1940b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (C47063pm0.m18735u(this.f1939a) * 31) + this.f1940b.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) C47063pm0.m18734v(this.f1939a)) + ", drawPadding=" + this.f1940b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public BA3(long j, PD3 pd3) {
        this.f1939a = j;
        this.f1940b = pd3;
    }

    public /* synthetic */ BA3(long j, PD3 pd3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C50619vm0.m8178c(4284900966L) : j, (i & 2) != 0 ? ND3.m94190c(0.0f, 0.0f, 3, null) : pd3, null);
    }
}
