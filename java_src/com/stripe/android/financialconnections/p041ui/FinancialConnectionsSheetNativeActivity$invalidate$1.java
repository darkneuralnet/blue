package com.stripe.android.financialconnections.p041ui;

import android.content.Intent;
import android.net.Uri;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.financialconnections.presentation.CreateBrowserIntentForUrl;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewEffect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", TransferTable.COLUMN_STATE, "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "invoke", "(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lkotlin/Unit;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$invalidate$1 */
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetNativeActivity$invalidate$1 extends Lambda implements Function1<FinancialConnectionsSheetNativeState, Unit> {
    final /* synthetic */ FinancialConnectionsSheetNativeActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetNativeActivity$invalidate$1(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity) {
        super(1);
        this.this$0 = financialConnectionsSheetNativeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(FinancialConnectionsSheetNativeState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        FinancialConnectionsSheetNativeViewEffect viewEffect = state.getViewEffect();
        if (viewEffect != null) {
            FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = this.this$0;
            if (viewEffect instanceof FinancialConnectionsSheetNativeViewEffect.OpenUrl) {
                CreateBrowserIntentForUrl createBrowserIntentForUrl = CreateBrowserIntentForUrl.INSTANCE;
                Uri parse = Uri.parse(((FinancialConnectionsSheetNativeViewEffect.OpenUrl) viewEffect).getUrl());
                Intrinsics.checkNotNullExpressionValue(parse, "parse(viewEffect.url)");
                financialConnectionsSheetNativeActivity.startActivity(createBrowserIntentForUrl.invoke(financialConnectionsSheetNativeActivity, parse));
            } else if (viewEffect instanceof FinancialConnectionsSheetNativeViewEffect.Finish) {
                financialConnectionsSheetNativeActivity.setResult(-1, new Intent().putExtra(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, ((FinancialConnectionsSheetNativeViewEffect.Finish) viewEffect).getResult()));
                financialConnectionsSheetNativeActivity.finish();
            }
            financialConnectionsSheetNativeActivity.getViewModel().onViewEffectLaunched();
            return Unit.INSTANCE;
        }
        return null;
    }
}
