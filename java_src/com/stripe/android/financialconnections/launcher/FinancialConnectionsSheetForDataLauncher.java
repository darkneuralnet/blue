package com.stripe.android.financialconnections.launcher;

import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.Fragment;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResultCallback;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataLauncher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u0013B!\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataLauncher;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "configuration", "", "present", "LB5;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;", "activityResultLauncher", "LB5;", "<init>", "(LB5;)V", "Landroidx/activity/ComponentActivity;", "activity", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;", "callback", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;)V", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "(Landroidx/fragment/app/Fragment;Landroidx/activity/result/ActivityResultRegistry;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetForDataLauncher implements FinancialConnectionsSheetLauncher {
    private final AbstractC0407B5<FinancialConnectionsSheetActivityArgs.ForData> activityResultLauncher;

    public FinancialConnectionsSheetForDataLauncher(AbstractC0407B5<FinancialConnectionsSheetActivityArgs.ForData> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
        this.activityResultLauncher = activityResultLauncher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(FinancialConnectionsSheetResultCallback callback, FinancialConnectionsSheetResult it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        callback.onFinancialConnectionsSheetResult(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(FinancialConnectionsSheetResultCallback callback, FinancialConnectionsSheetResult it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        callback.onFinancialConnectionsSheetResult(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(FinancialConnectionsSheetResultCallback callback, FinancialConnectionsSheetResult it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        callback.onFinancialConnectionsSheetResult(it);
    }

    @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher
    public void present(FinancialConnectionsSheet.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.activityResultLauncher.m114705a(new FinancialConnectionsSheetActivityArgs.ForData(configuration));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FinancialConnectionsSheetForDataLauncher(ComponentActivity activity, final FinancialConnectionsSheetResultCallback callback) {
        this(r3);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC0407B5 registerForActivityResult = activity.registerForActivityResult(new FinancialConnectionsSheetForDataContract(), new InterfaceC28515t5() { // from class: em1
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                FinancialConnectionsSheetForDataLauncher._init_$lambda$0(FinancialConnectionsSheetResultCallback.this, (FinancialConnectionsSheetResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "activity.registerForActi…SheetResult(it)\n        }");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FinancialConnectionsSheetForDataLauncher(Fragment fragment, final FinancialConnectionsSheetResultCallback callback) {
        this(r3);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC0407B5 registerForActivityResult = fragment.registerForActivityResult(new FinancialConnectionsSheetForDataContract(), new InterfaceC28515t5() { // from class: cm1
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                FinancialConnectionsSheetForDataLauncher._init_$lambda$1(FinancialConnectionsSheetResultCallback.this, (FinancialConnectionsSheetResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "fragment.registerForActi…SheetResult(it)\n        }");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FinancialConnectionsSheetForDataLauncher(Fragment fragment, ActivityResultRegistry registry, final FinancialConnectionsSheetResultCallback callback) {
        this(r3);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC0407B5 registerForActivityResult = fragment.registerForActivityResult(new FinancialConnectionsSheetForDataContract(), registry, new InterfaceC28515t5() { // from class: dm1
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                FinancialConnectionsSheetForDataLauncher._init_$lambda$2(FinancialConnectionsSheetResultCallback.this, (FinancialConnectionsSheetResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "fragment.registerForActi…SheetResult(it)\n        }");
    }
}
