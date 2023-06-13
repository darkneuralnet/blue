package com.stripe.android.view;

import android.content.Context;
import android.view.LayoutInflater;
import com.stripe.android.databinding.BecsDebitWidgetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/databinding/BecsDebitWidgetBinding;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class BecsDebitWidget$viewBinding$2 extends Lambda implements Function0<BecsDebitWidgetBinding> {
    final /* synthetic */ Context $context;
    final /* synthetic */ BecsDebitWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BecsDebitWidget$viewBinding$2(Context context, BecsDebitWidget becsDebitWidget) {
        super(0);
        this.$context = context;
        this.this$0 = becsDebitWidget;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final BecsDebitWidgetBinding invoke() {
        BecsDebitWidgetBinding inflate = BecsDebitWidgetBinding.inflate(LayoutInflater.from(this.$context), this.this$0);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…           this\n        )");
        return inflate;
    }
}
