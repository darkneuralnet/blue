package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0013ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R \u0010\u0018\u001a\u00020\u00138\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001b"}, m28432d2 = {"LpN5;", "La30;", "LxB5;", "size", "LkE3;", "p", "", "alpha", "", C17296a.f69688o, "(JLkE3;F)V", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "Lpm0;", "c", "J", "b", "()J", "value", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pN5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46831pN5 extends AbstractC37727a30 {

    /* renamed from: c */
    public final long f103603c;

    public /* synthetic */ C46831pN5(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    @Override // p000.AbstractC37727a30
    /* renamed from: a */
    public void mo19362a(long j, InterfaceC43783kE3 p, float f) {
        boolean z;
        long j2;
        Intrinsics.checkNotNullParameter(p, "p");
        p.mo29178g(1.0f);
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            long j3 = this.f103603c;
            j2 = C47063pm0.m18743m(j3, C47063pm0.m18740p(j3) * f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j2 = this.f103603c;
        }
        p.mo29179f(j2);
        if (p.mo29173l() != null) {
            p.mo29162w(null);
        }
    }

    /* renamed from: b */
    public final long m19361b() {
        return this.f103603c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C46831pN5) && C47063pm0.m18741o(this.f103603c, ((C46831pN5) obj).f103603c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C47063pm0.m18735u(this.f103603c);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) C47063pm0.m18734v(this.f103603c)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C46831pN5(long j) {
        super(null);
        this.f103603c = j;
    }
}
