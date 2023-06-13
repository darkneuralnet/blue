package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\n\u0010\u0017R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"LH96;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lvj1;", C17296a.f69688o, "Lvj1;", "b", "()Lvj1;", "fade", "LdE5;", "LdE5;", DateTokenConverter.CONVERTER_KEY, "()LdE5;", "slide", "LEh0;", "c", "LEh0;", "()LEh0;", "changeSize", "LYi5;", "LYi5;", "()LYi5;", "scale", "<init>", "(Lvj1;LdE5;LEh0;LYi5;)V", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: H96 */
/* loaded from: classes.dex */
public final class H96 {

    /* renamed from: a */
    public final C50590vj1 f12981a;

    /* renamed from: b */
    public final C39635dE5 f12982b;

    /* renamed from: c */
    public final C32612Eh0 f12983c;

    /* renamed from: d */
    public final C37306Yi5 f12984d;

    public H96() {
        this(null, null, null, null, 15, null);
    }

    /* renamed from: a */
    public final C32612Eh0 m104251a() {
        return this.f12983c;
    }

    /* renamed from: b */
    public final C50590vj1 m104250b() {
        return this.f12981a;
    }

    /* renamed from: c */
    public final C37306Yi5 m104249c() {
        return this.f12984d;
    }

    /* renamed from: d */
    public final C39635dE5 m104248d() {
        return this.f12982b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof H96) {
            H96 h96 = (H96) obj;
            return Intrinsics.areEqual(this.f12981a, h96.f12981a) && Intrinsics.areEqual(this.f12982b, h96.f12982b) && Intrinsics.areEqual(this.f12983c, h96.f12983c) && Intrinsics.areEqual(this.f12984d, h96.f12984d);
        }
        return false;
    }

    public int hashCode() {
        C50590vj1 c50590vj1 = this.f12981a;
        int hashCode = (c50590vj1 == null ? 0 : c50590vj1.hashCode()) * 31;
        C39635dE5 c39635dE5 = this.f12982b;
        int hashCode2 = (hashCode + (c39635dE5 == null ? 0 : c39635dE5.hashCode())) * 31;
        C32612Eh0 c32612Eh0 = this.f12983c;
        int hashCode3 = (hashCode2 + (c32612Eh0 == null ? 0 : c32612Eh0.hashCode())) * 31;
        C37306Yi5 c37306Yi5 = this.f12984d;
        return hashCode3 + (c37306Yi5 != null ? c37306Yi5.hashCode() : 0);
    }

    public String toString() {
        return "TransitionData(fade=" + this.f12981a + ", slide=" + this.f12982b + ", changeSize=" + this.f12983c + ", scale=" + this.f12984d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public H96(C50590vj1 c50590vj1, C39635dE5 c39635dE5, C32612Eh0 c32612Eh0, C37306Yi5 c37306Yi5) {
        this.f12981a = c50590vj1;
        this.f12982b = c39635dE5;
        this.f12983c = c32612Eh0;
        this.f12984d = c37306Yi5;
    }

    public /* synthetic */ H96(C50590vj1 c50590vj1, C39635dE5 c39635dE5, C32612Eh0 c32612Eh0, C37306Yi5 c37306Yi5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c50590vj1, (i & 2) != 0 ? null : c39635dE5, (i & 4) != 0 ? null : c32612Eh0, (i & 8) != 0 ? null : c37306Yi5);
    }
}
