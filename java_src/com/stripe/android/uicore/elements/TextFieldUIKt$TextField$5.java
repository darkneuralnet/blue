package com.stripe.android.uicore.elements;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldUIKt$TextField$5 extends Lambda implements Function1<C42894ik2, Boolean> {
    final /* synthetic */ InterfaceC32037Bv1 $focusManager;
    final /* synthetic */ int $previousFocusDirection;
    final /* synthetic */ InterfaceC48627sP5<String> $value$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldUIKt$TextField$5(InterfaceC32037Bv1 interfaceC32037Bv1, int i, InterfaceC48627sP5<String> interfaceC48627sP5) {
        super(1);
        this.$focusManager = interfaceC32037Bv1;
        this.$previousFocusDirection = i;
        this.$value$delegate = interfaceC48627sP5;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(C42894ik2 c42894ik2) {
        return m116752invokeZmokQxo(c42894ik2.m33518f());
    }

    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    public final Boolean m116752invokeZmokQxo(KeyEvent event) {
        String TextField_ndPIYpw$lambda$3;
        boolean z;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z2 = false;
        if (C44673lk2.m26890e(C45266mk2.m25124b(event), C44673lk2.f96650a.m26889a()) && event.getKeyCode() == 67) {
            TextField_ndPIYpw$lambda$3 = TextFieldUIKt.TextField_ndPIYpw$lambda$3(this.$value$delegate);
            if (TextField_ndPIYpw$lambda$3.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.$focusManager.mo68851i(this.$previousFocusDirection);
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
