package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012#\u0010\u0015\u001a\u001f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0002\b\u000eø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016RB\u0010\u0015\u001a\u001f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0002\b\u000e8\u0006@\u0006X\u0086\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, m28432d2 = {"LCm2;", "LDm2;", "LgV2$c;", "LzO2;", "LvO2;", "measurable", "Lkz0;", "constraints", "LyO2;", "f", "(LzO2;LvO2;J)LyO2;", "", "toString", "Lkotlin/Function3;", "Lkotlin/ExtensionFunctionType;", "l", "Lkotlin/jvm/functions/Function3;", "getMeasureBlock", "()Lkotlin/jvm/functions/Function3;", "e0", "(Lkotlin/jvm/functions/Function3;)V", "measureBlock", "<init>", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Cm2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32191Cm2 extends InterfaceC41563gV2.AbstractC20914c implements InterfaceC32425Dm2 {

    /* renamed from: l */
    public Function3<? super InterfaceC52765zO2, ? super InterfaceC50393vO2, ? super C44228kz0, ? extends InterfaceC52172yO2> f4640l;

    public C32191Cm2(Function3<? super InterfaceC52765zO2, ? super InterfaceC50393vO2, ? super C44228kz0, ? extends InterfaceC52172yO2> measureBlock) {
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        this.f4640l = measureBlock;
    }

    /* renamed from: e0 */
    public final void m111723e0(Function3<? super InterfaceC52765zO2, ? super InterfaceC50393vO2, ? super C44228kz0, ? extends InterfaceC52172yO2> function3) {
        Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.f4640l = function3;
    }

    @Override // p000.InterfaceC32425Dm2
    /* renamed from: f */
    public InterfaceC52172yO2 mo21524f(InterfaceC52765zO2 measure, InterfaceC50393vO2 measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return this.f4640l.invoke(measure, measurable, C44228kz0.m28075b(j));
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f4640l + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
