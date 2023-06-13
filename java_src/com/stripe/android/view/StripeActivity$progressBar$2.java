package com.stripe.android.view;

import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.databinding.StripeActivityBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeActivity$progressBar$2 extends Lambda implements Function0<LinearProgressIndicator> {
    final /* synthetic */ StripeActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeActivity$progressBar$2(StripeActivity stripeActivity) {
        super(0);
        this.this$0 = stripeActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LinearProgressIndicator invoke() {
        StripeActivityBinding viewBinding;
        viewBinding = this.this$0.getViewBinding();
        return viewBinding.progressBar;
    }
}
