package com.stripe.android.link.p042ui.inline;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkInlineSignup$1$3 */
/* loaded from: classes7.dex */
public /* synthetic */ class LinkInlineSignupKt$LinkInlineSignup$1$3 extends FunctionReferenceImpl implements Function0<Unit> {
    public LinkInlineSignupKt$LinkInlineSignup$1$3(Object obj) {
        super(0, obj, InlineSignupViewModel.class, "toggleExpanded", "toggleExpanded()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((InlineSignupViewModel) this.receiver).toggleExpanded();
    }
}
