package com.stripe.android.view;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewStub;
import android.widget.ProgressBar;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.stripe.android.C18606R;
import com.stripe.android.databinding.StripeActivityBinding;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H$J\u0012\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010'H\u0014J\u0010\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020\nH\u0014J\u0010\u00101\u001a\u00020$2\u0006\u00102\u001a\u000203H\u0004R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\b\u001a\u0004\b \u0010!¨\u00064"}, m28432d2 = {"Lcom/stripe/android/view/StripeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "alertDisplayer", "Lcom/stripe/android/view/AlertDisplayer;", "getAlertDisplayer", "()Lcom/stripe/android/view/AlertDisplayer;", "alertDisplayer$delegate", "Lkotlin/Lazy;", "value", "", "isProgressBarVisible", "()Z", "setProgressBarVisible", "(Z)V", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar$payments_core_release", "()Landroid/widget/ProgressBar;", "progressBar$delegate", "stripeColorUtils", "Lcom/stripe/android/view/StripeColorUtils;", "getStripeColorUtils", "()Lcom/stripe/android/view/StripeColorUtils;", "stripeColorUtils$delegate", "viewBinding", "Lcom/stripe/android/databinding/StripeActivityBinding;", "getViewBinding", "()Lcom/stripe/android/databinding/StripeActivityBinding;", "viewBinding$delegate", "viewStub", "Landroid/view/ViewStub;", "getViewStub$payments_core_release", "()Landroid/view/ViewStub;", "viewStub$delegate", "onActionSave", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "onProgressBarVisibilityChanged", "visible", "showError", "error", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nStripeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeActivity.kt\ncom/stripe/android/view/StripeActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,95:1\n262#2,2:96\n*S KotlinDebug\n*F\n+ 1 StripeActivity.kt\ncom/stripe/android/view/StripeActivity\n*L\n31#1:96,2\n*E\n"})
/* loaded from: classes7.dex */
public abstract class StripeActivity extends AppCompatActivity {
    public static final int $stable = 8;
    private final Lazy alertDisplayer$delegate;
    private boolean isProgressBarVisible;
    private final Lazy progressBar$delegate;
    private final Lazy stripeColorUtils$delegate;
    private final Lazy viewBinding$delegate;
    private final Lazy viewStub$delegate;

    public StripeActivity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        lazy = LazyKt__LazyJVMKt.lazy(new StripeActivity$viewBinding$2(this));
        this.viewBinding$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new StripeActivity$progressBar$2(this));
        this.progressBar$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new StripeActivity$viewStub$2(this));
        this.viewStub$delegate = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new StripeActivity$alertDisplayer$2(this));
        this.alertDisplayer$delegate = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new StripeActivity$stripeColorUtils$2(this));
        this.stripeColorUtils$delegate = lazy5;
    }

    private final AlertDisplayer getAlertDisplayer() {
        return (AlertDisplayer) this.alertDisplayer$delegate.getValue();
    }

    private final StripeColorUtils getStripeColorUtils() {
        return (StripeColorUtils) this.stripeColorUtils$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StripeActivityBinding getViewBinding() {
        return (StripeActivityBinding) this.viewBinding$delegate.getValue();
    }

    public final ProgressBar getProgressBar$payments_core_release() {
        Object value = this.progressBar$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-progressBar>(...)");
        return (ProgressBar) value;
    }

    public final ViewStub getViewStub$payments_core_release() {
        return (ViewStub) this.viewStub$delegate.getValue();
    }

    public final boolean isProgressBarVisible() {
        return this.isProgressBarVisible;
    }

    public abstract void onActionSave();

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getViewBinding().getRoot());
        setSupportActionBar(getViewBinding().toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70212v(true);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C18606R.C18610menu.add_payment_method, menu);
        menu.findItem(C18606R.C18608id.action_save).setEnabled(!this.isProgressBarVisible);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C18606R.C18608id.action_save) {
            onActionSave();
            return true;
        }
        boolean onOptionsItemSelected = super.onOptionsItemSelected(item);
        if (!onOptionsItemSelected) {
            getOnBackPressedDispatcher().m70494f();
            return onOptionsItemSelected;
        }
        return onOptionsItemSelected;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        MenuItem findItem = menu.findItem(C18606R.C18608id.action_save);
        StripeColorUtils stripeColorUtils = getStripeColorUtils();
        Resources.Theme theme = getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "theme");
        findItem.setIcon(stripeColorUtils.getTintedIconWithAttribute(theme, C18606R.attr.titleTextColor, C18606R.C18607drawable.stripe_ic_checkmark));
        return super.onPrepareOptionsMenu(menu);
    }

    public void onProgressBarVisibilityChanged(boolean z) {
    }

    public final void setProgressBarVisible(boolean z) {
        int i;
        ProgressBar progressBar$payments_core_release = getProgressBar$payments_core_release();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar$payments_core_release.setVisibility(i);
        invalidateOptionsMenu();
        onProgressBarVisibilityChanged(z);
        this.isProgressBarVisible = z;
    }

    public final void showError(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        getAlertDisplayer().show(error);
    }
}
