package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\r\u001a\u00020\t\u0012#\b\u0002\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0018\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR5\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00188\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0013\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, m28432d2 = {"LEh0;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "LK9;", C17296a.f69688o, "LK9;", "()LK9;", "alignment", "Lkotlin/Function1;", "LG52;", "Lkotlin/ParameterName;", "name", "fullSize", "b", "Lkotlin/jvm/functions/Function1;", DateTokenConverter.CONVERTER_KEY, "()Lkotlin/jvm/functions/Function1;", "size", "Ltm1;", "c", "Ltm1;", "()Ltm1;", "animationSpec", "Z", "()Z", "clip", "<init>", "(LK9;Lkotlin/jvm/functions/Function1;Ltm1;Z)V", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Eh0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32612Eh0 {

    /* renamed from: a */
    public final InterfaceC4360K9 f7942a;

    /* renamed from: b */
    public final Function1<G52, G52> f7943b;

    /* renamed from: c */
    public final InterfaceC49435tm1<G52> f7944c;

    /* renamed from: d */
    public final boolean f7945d;

    /* JADX WARN: Multi-variable type inference failed */
    public C32612Eh0(InterfaceC4360K9 alignment, Function1<? super G52, G52> size, InterfaceC49435tm1<G52> animationSpec, boolean z) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.f7942a = alignment;
        this.f7943b = size;
        this.f7944c = animationSpec;
        this.f7945d = z;
    }

    /* renamed from: a */
    public final InterfaceC4360K9 m108582a() {
        return this.f7942a;
    }

    /* renamed from: b */
    public final InterfaceC49435tm1<G52> m108581b() {
        return this.f7944c;
    }

    /* renamed from: c */
    public final boolean m108580c() {
        return this.f7945d;
    }

    /* renamed from: d */
    public final Function1<G52, G52> m108579d() {
        return this.f7943b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C32612Eh0) {
            C32612Eh0 c32612Eh0 = (C32612Eh0) obj;
            return Intrinsics.areEqual(this.f7942a, c32612Eh0.f7942a) && Intrinsics.areEqual(this.f7943b, c32612Eh0.f7943b) && Intrinsics.areEqual(this.f7944c, c32612Eh0.f7944c) && this.f7945d == c32612Eh0.f7945d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f7942a.hashCode() * 31) + this.f7943b.hashCode()) * 31) + this.f7944c.hashCode()) * 31;
        boolean z = this.f7945d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.f7942a + ", size=" + this.f7943b + ", animationSpec=" + this.f7944c + ", clip=" + this.f7945d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
