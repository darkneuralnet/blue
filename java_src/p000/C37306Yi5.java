package p000;

import androidx.compose.p003ui.graphics.C11333f;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0014ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0013\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\n\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, m28432d2 = {"LYi5;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "", C17296a.f69688o, "F", "b", "()F", "scale", "Landroidx/compose/ui/graphics/f;", "J", "c", "()J", "transformOrigin", "Ltm1;", "Ltm1;", "()Ltm1;", "animationSpec", "<init>", "(FJLtm1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Yi5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37306Yi5 {

    /* renamed from: a */
    public final float f46352a;

    /* renamed from: b */
    public final long f46353b;

    /* renamed from: c */
    public final InterfaceC49435tm1<Float> f46354c;

    public /* synthetic */ C37306Yi5(float f, long j, InterfaceC49435tm1 interfaceC49435tm1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, j, interfaceC49435tm1);
    }

    /* renamed from: a */
    public final InterfaceC49435tm1<Float> m74364a() {
        return this.f46354c;
    }

    /* renamed from: b */
    public final float m74363b() {
        return this.f46352a;
    }

    /* renamed from: c */
    public final long m74362c() {
        return this.f46353b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37306Yi5) {
            C37306Yi5 c37306Yi5 = (C37306Yi5) obj;
            return Float.compare(this.f46352a, c37306Yi5.f46352a) == 0 && C11333f.m68632e(this.f46353b, c37306Yi5.f46353b) && Intrinsics.areEqual(this.f46354c, c37306Yi5.f46354c);
        }
        return false;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f46352a) * 31) + C11333f.m68629h(this.f46353b)) * 31) + this.f46354c.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.f46352a + ", transformOrigin=" + ((Object) C11333f.m68628i(this.f46353b)) + ", animationSpec=" + this.f46354c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C37306Yi5(float f, long j, InterfaceC49435tm1<Float> interfaceC49435tm1) {
        this.f46352a = f;
        this.f46353b = j;
        this.f46354c = interfaceC49435tm1;
    }
}
