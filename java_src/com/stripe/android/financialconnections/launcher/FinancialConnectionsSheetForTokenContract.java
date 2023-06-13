package com.stripe.android.financialconnections.launcher;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.financialconnections.FinancialConnectionsSheetActivity;
import com.stripe.android.financialconnections.FinancialConnectionsSheetForTokenResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001a\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenContract;", "Lv5;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "toExposedResult", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "createIntent", "", "resultCode", "intent", "parseResult", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetForTokenContract extends AbstractC29414v5<FinancialConnectionsSheetActivityArgs.ForToken, FinancialConnectionsSheetForTokenResult> {
    private final FinancialConnectionsSheetForTokenResult toExposedResult(FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult) {
        FinancialConnectionsSheetForTokenResult completed;
        if (financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Canceled) {
            return FinancialConnectionsSheetForTokenResult.Canceled.INSTANCE;
        }
        if (financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Failed) {
            completed = new FinancialConnectionsSheetForTokenResult.Failed(((FinancialConnectionsSheetActivityResult.Failed) financialConnectionsSheetActivityResult).getError());
        } else if (financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Completed) {
            FinancialConnectionsSheetActivityResult.Completed completed2 = (FinancialConnectionsSheetActivityResult.Completed) financialConnectionsSheetActivityResult;
            if (completed2.getFinancialConnectionsSession() == null) {
                return new FinancialConnectionsSheetForTokenResult.Failed(new IllegalArgumentException("FinancialConnectionsSession is not set"));
            }
            if (completed2.getToken() == null) {
                return new FinancialConnectionsSheetForTokenResult.Failed(new IllegalArgumentException("PaymentAccount is not set on FinancialConnectionsSession"));
            }
            completed = new FinancialConnectionsSheetForTokenResult.Completed(completed2.getFinancialConnectionsSession(), completed2.getToken());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return completed;
    }

    @Override // p000.AbstractC29414v5
    public Intent createIntent(Context context, FinancialConnectionsSheetActivityArgs.ForToken input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtra = new Intent(context, FinancialConnectionsSheetActivity.class).putExtra("mavericks:arg", input);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, Financia…Mavericks.KEY_ARG, input)");
        return putExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.AbstractC29414v5
    public FinancialConnectionsSheetForTokenResult parseResult(int i, Intent intent) {
        FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult;
        FinancialConnectionsSheetForTokenResult exposedResult;
        return (intent == null || (financialConnectionsSheetActivityResult = (FinancialConnectionsSheetActivityResult) intent.getParcelableExtra(FinancialConnectionsSheetActivityResult.EXTRA_RESULT)) == null || (exposedResult = toExposedResult(financialConnectionsSheetActivityResult)) == null) ? new FinancialConnectionsSheetForTokenResult.Failed(new IllegalArgumentException("Failed to retrieve a ConnectionsSheetResult.")) : exposedResult;
    }
}
