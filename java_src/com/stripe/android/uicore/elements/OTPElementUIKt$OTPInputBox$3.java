package com.stripe.android.uicore.elements;

import androidx.compose.p003ui.focus.C11299c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nOTPElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,257:1\n1855#2,2:258\n*S KotlinDebug\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$3\n*L\n200#1:258,2\n*E\n"})
/* loaded from: classes7.dex */
public final class OTPElementUIKt$OTPInputBox$3 extends Lambda implements Function1<F16, Unit> {
    final /* synthetic */ OTPElement $element;
    final /* synthetic */ InterfaceC32037Bv1 $focusManager;
    final /* synthetic */ int $index;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPElementUIKt$OTPInputBox$3(OTPElement oTPElement, int i, InterfaceC32037Bv1 interfaceC32037Bv1) {
        super(1);
        this.$element = oTPElement;
        this.$index = i;
        this.$focusManager = interfaceC32037Bv1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(F16 f16) {
        invoke2(f16);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(F16 it) {
        IntRange until;
        Intrinsics.checkNotNullParameter(it, "it");
        until = RangesKt___RangesKt.until(0, this.$element.getController().onValueChanged(this.$index, it.m108102h()));
        InterfaceC32037Bv1 interfaceC32037Bv1 = this.$focusManager;
        Iterator<Integer> it2 = until.iterator();
        while (it2.hasNext()) {
            ((IntIterator) it2).nextInt();
            interfaceC32037Bv1.mo68851i(C11299c.f52961b.m68803e());
        }
    }
}
