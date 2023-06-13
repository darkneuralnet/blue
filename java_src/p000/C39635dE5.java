package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R5\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00148\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m28432d2 = {"LdE5;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lkotlin/Function1;", "LG52;", "Lkotlin/ParameterName;", "name", "fullSize", "LA52;", C17296a.f69688o, "Lkotlin/jvm/functions/Function1;", "b", "()Lkotlin/jvm/functions/Function1;", "slideOffset", "Ltm1;", "Ltm1;", "()Ltm1;", "animationSpec", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dE5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39635dE5 {

    /* renamed from: a */
    public final Function1<G52, A52> f76302a;

    /* renamed from: b */
    public final InterfaceC49435tm1<A52> f76303b;

    /* renamed from: a */
    public final InterfaceC49435tm1<A52> m44499a() {
        return this.f76303b;
    }

    /* renamed from: b */
    public final Function1<G52, A52> m44498b() {
        return this.f76302a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C39635dE5) {
            C39635dE5 c39635dE5 = (C39635dE5) obj;
            return Intrinsics.areEqual(this.f76302a, c39635dE5.f76302a) && Intrinsics.areEqual(this.f76303b, c39635dE5.f76303b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f76302a.hashCode() * 31) + this.f76303b.hashCode();
    }

    public String toString() {
        return "Slide(slideOffset=" + this.f76302a + ", animationSpec=" + this.f76303b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
