package p000;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC29607vf;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B#\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0006\u001a\u00020\u0005H\u0016R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\b\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Ljf;", "T", "Lvf;", "V", "", "", "toString", "Lnf;", C17296a.f69688o, "Lnf;", "b", "()Lnf;", "endState", "Lff;", "Lff;", "()Lff;", "endReason", "<init>", "(Lnf;Lff;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jf */
/* loaded from: classes.dex */
public final class C24979jf<T, V extends AbstractC29607vf> {

    /* renamed from: a */
    public final C26565nf<T, V> f93104a;

    /* renamed from: b */
    public final EnumC20481ff f93105b;

    public C24979jf(C26565nf<T, V> endState, EnumC20481ff endReason) {
        Intrinsics.checkNotNullParameter(endState, "endState");
        Intrinsics.checkNotNullParameter(endReason, "endReason");
        this.f93104a = endState;
        this.f93105b = endReason;
    }

    /* renamed from: a */
    public final EnumC20481ff m30132a() {
        return this.f93105b;
    }

    /* renamed from: b */
    public final C26565nf<T, V> m30131b() {
        return this.f93104a;
    }

    public String toString() {
        return "AnimationResult(endReason=" + this.f93105b + ", endState=" + this.f93104a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
