package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0014R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "handleResult", "savedInstanceState", "onCreate", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;", "args$delegate", "Lkotlin/Lazy;", "getArgs", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;", "args", "Lwy1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lwy1;", "<init>", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PollingActivity extends AppCompatActivity {
    private final Lazy args$delegate;
    private final InterfaceC51333wy1 listener;

    public PollingActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new PollingActivity$args$2(this));
        this.args$delegate = lazy;
        this.listener = new InterfaceC51333wy1() { // from class: zX3
            @Override // p000.InterfaceC51333wy1
            /* renamed from: a */
            public final void mo1245a(String str, Bundle bundle) {
                PollingActivity.listener$lambda$0(PollingActivity.this, str, bundle);
            }
        };
    }

    private final PollingContract.Args getArgs() {
        return (PollingContract.Args) this.args$delegate.getValue();
    }

    private final void handleResult(Bundle bundle) {
        getWindow().setStatusBarColor(0);
        setResult(-1, new Intent().putExtras(bundle));
        finish();
        overridePendingTransition(0, C19159R.anim.slide_down);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listener$lambda$0(PollingActivity this$0, String str, Bundle result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(result, "result");
        this$0.handleResult(result);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getSupportFragmentManager().m67416B1(PollingFragment.KEY_FRAGMENT_RESULT, this, this.listener);
        Integer statusBarColor = getArgs().getStatusBarColor();
        if (statusBarColor != null) {
            getWindow().setStatusBarColor(statusBarColor.intValue());
        }
        if (bundle == null) {
            PollingFragment newInstance = PollingFragment.Companion.newInstance(getArgs());
            newInstance.setCancelable(false);
            newInstance.show(getSupportFragmentManager(), newInstance.getTag());
        }
    }
}
