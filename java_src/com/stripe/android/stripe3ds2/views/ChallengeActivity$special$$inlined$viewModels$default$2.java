package com.stripe.android.stripe3ds2.views;

import androidx.activity.ComponentActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LOr6;", "VM", "LWr6;", "invoke", "()LWr6;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
/* loaded from: classes7.dex */
public final class ChallengeActivity$special$$inlined$viewModels$default$2 extends Lambda implements Function0<C36920Wr6> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$special$$inlined$viewModels$default$2(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C36920Wr6 invoke() {
        C36920Wr6 viewModelStore = this.$this_viewModels.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
        return viewModelStore;
    }
}