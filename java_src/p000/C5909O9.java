package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010!\u001a\u00020\u0019\u0012\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%ø\u0001\u0001¢\u0006\u0004\b'\u0010(J)\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001e\u001a\u00020\u00198\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010!\u001a\u00020\u00198\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001d\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006)"}, m28432d2 = {"LO9;", "LBm2;", "LT42;", "LzO2;", "LvO2;", "measurable", "Lkz0;", "constraints", "LyO2;", "f", "(LzO2;LvO2;J)LyO2;", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "toString", "LL9;", "c", "LL9;", "getAlignmentLine", "()LL9;", "alignmentLine", "Lk61;", DateTokenConverter.CONVERTER_KEY, "F", "getBefore-D9Ej5fM", "()F", "before", "e", "getAfter-D9Ej5fM", "after", "Lkotlin/Function1;", "LS42;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "<init>", "(LL9;FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: O9 */
/* loaded from: classes.dex */
public final class C5909O9 extends T42 implements InterfaceC31957Bm2 {

    /* renamed from: c */
    public final AbstractC4750L9 f26061c;

    /* renamed from: d */
    public final float f26062d;

    /* renamed from: e */
    public final float f26063e;

    public /* synthetic */ C5909O9(AbstractC4750L9 abstractC4750L9, float f, float f2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC4750L9, f, f2, function1);
    }

    public boolean equals(Object obj) {
        C5909O9 c5909o9;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5909O9) {
            c5909o9 = (C5909O9) obj;
        } else {
            c5909o9 = null;
        }
        if (c5909o9 == null) {
            return false;
        }
        if (Intrinsics.areEqual(this.f26061c, c5909o9.f26061c) && C43705k61.m29301i(this.f26062d, c5909o9.f26062d) && C43705k61.m29301i(this.f26063e, c5909o9.f26063e)) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC31957Bm2
    /* renamed from: f */
    public InterfaceC52172yO2 mo3871f(InterfaceC52765zO2 measure, InterfaceC50393vO2 measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return C5211M9.m95686a(measure, this.f26061c, this.f26062d, this.f26063e, measurable, j);
    }

    public int hashCode() {
        return (((this.f26061c.hashCode() * 31) + C43705k61.m29300j(this.f26062d)) * 31) + C43705k61.m29300j(this.f26063e);
    }

    public String toString() {
        return "AlignmentLineOffset(alignmentLine=" + this.f26061c + ", before=" + ((Object) C43705k61.m29299k(this.f26062d)) + ", after=" + ((Object) C43705k61.m29299k(this.f26063e)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C5909O9(AbstractC4750L9 abstractC4750L9, float f, float f2, Function1<? super S42, Unit> function1) {
        super(function1);
        this.f26061c = abstractC4750L9;
        this.f26062d = f;
        this.f26063e = f2;
        if (!((f >= 0.0f || C43705k61.m29301i(f, C43705k61.f93903c.m29295c())) && (f2 >= 0.0f || C43705k61.m29301i(f2, C43705k61.f93903c.m29295c())))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
        }
    }
}
