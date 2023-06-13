package com.stripe.android.uicore.elements;

import android.view.KeyEvent;
import androidx.compose.p003ui.focus.C11299c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$2 extends Lambda implements Function1<C42894ik2, Boolean> {
    final /* synthetic */ OTPElement $element;
    final /* synthetic */ InterfaceC32037Bv1 $focusManager;
    final /* synthetic */ int $index;
    final /* synthetic */ InterfaceC48627sP5<String> $value$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$2(int i, InterfaceC32037Bv1 interfaceC32037Bv1, OTPElement oTPElement, InterfaceC48627sP5<String> interfaceC48627sP5) {
        super(1);
        this.$index = i;
        this.$focusManager = interfaceC32037Bv1;
        this.$element = oTPElement;
        this.$value$delegate = interfaceC48627sP5;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(C42894ik2 c42894ik2) {
        return m116742invokeZmokQxo(c42894ik2.m33518f());
    }

    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    public final Boolean m116742invokeZmokQxo(KeyEvent event) {
        String invoke$lambda$0;
        boolean z;
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.$index != 0 && C44673lk2.m26890e(C45266mk2.m25124b(event), C44673lk2.f96650a.m26889a()) && event.getKeyCode() == 67) {
            invoke$lambda$0 = OTPElementUIKt$OTPElementUI$2$1$1.invoke$lambda$0(this.$value$delegate);
            if (invoke$lambda$0.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.$focusManager.mo68851i(C11299c.f52961b.m68802f());
                this.$element.getController().onValueChanged(this.$index - 1, "");
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
