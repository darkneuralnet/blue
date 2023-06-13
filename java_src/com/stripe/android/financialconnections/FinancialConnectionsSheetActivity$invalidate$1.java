package com.stripe.android.financialconnections;

import android.content.Intent;
import android.net.Uri;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewEffect;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetNativeActivityArgs;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.presentation.CreateBrowserIntentForUrl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", TransferTable.COLUMN_STATE, "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;", "invoke", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lkotlin/Unit;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetActivity$invalidate$1 extends Lambda implements Function1<FinancialConnectionsSheetState, Unit> {
    final /* synthetic */ FinancialConnectionsSheetActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetActivity$invalidate$1(FinancialConnectionsSheetActivity financialConnectionsSheetActivity) {
        super(1);
        this.this$0 = financialConnectionsSheetActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(FinancialConnectionsSheetState state) {
        AbstractC0407B5 abstractC0407B5;
        AbstractC0407B5 abstractC0407B52;
        Intrinsics.checkNotNullParameter(state, "state");
        FinancialConnectionsSheetViewEffect viewEffect = state.getViewEffect();
        if (viewEffect != null) {
            FinancialConnectionsSheetActivity financialConnectionsSheetActivity = this.this$0;
            if (viewEffect instanceof FinancialConnectionsSheetViewEffect.OpenAuthFlowWithUrl) {
                abstractC0407B52 = financialConnectionsSheetActivity.startBrowserForResult;
                CreateBrowserIntentForUrl createBrowserIntentForUrl = CreateBrowserIntentForUrl.INSTANCE;
                Uri parse = Uri.parse(((FinancialConnectionsSheetViewEffect.OpenAuthFlowWithUrl) viewEffect).getUrl());
                Intrinsics.checkNotNullExpressionValue(parse, "parse(viewEffect.url)");
                abstractC0407B52.m114705a(createBrowserIntentForUrl.invoke(financialConnectionsSheetActivity, parse));
            } else if (viewEffect instanceof FinancialConnectionsSheetViewEffect.FinishWithResult) {
                financialConnectionsSheetActivity.finishWithResult(((FinancialConnectionsSheetViewEffect.FinishWithResult) viewEffect).getResult());
            } else if (viewEffect instanceof FinancialConnectionsSheetViewEffect.OpenNativeAuthFlow) {
                abstractC0407B5 = financialConnectionsSheetActivity.startNativeAuthFlowForResult;
                Intent intent = new Intent(financialConnectionsSheetActivity, FinancialConnectionsSheetNativeActivity.class);
                intent.addFlags(65536);
                FinancialConnectionsSheetViewEffect.OpenNativeAuthFlow openNativeAuthFlow = (FinancialConnectionsSheetViewEffect.OpenNativeAuthFlow) viewEffect;
                intent.putExtra("mavericks:arg", new FinancialConnectionsSheetNativeActivityArgs(openNativeAuthFlow.getConfiguration(), openNativeAuthFlow.getInitialSyncResponse()));
                abstractC0407B5.m114705a(intent);
            }
            financialConnectionsSheetActivity.getViewModel().onViewEffectLaunched$financial_connections_release();
            return Unit.INSTANCE;
        }
        return null;
    }
}
