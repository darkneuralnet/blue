package com.stripe.android.paymentsheet.p047ui;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowMetrics;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.AbstractC11719f;
import co.bird.android.model.LegacyRepairType;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.paymentsheet.BottomSheetController;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.LinkHandler;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.p047ui.BaseSheetActivity;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.utils.AnimationConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000 ;*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002;<B\u0005¢\u0006\u0002\u0010\u0003J\u0015\u0010/\u001a\u0002002\u0006\u00101\u001a\u00028\u0000H\u0004¢\u0006\u0002\u00102J\b\u00103\u001a\u000200H\u0016J\u0012\u00104\u001a\u0002002\b\u00105\u001a\u0004\u0018\u000106H\u0014J\u0015\u00107\u001a\u0002002\u0006\u00101\u001a\u00028\u0000H&¢\u0006\u0002\u00102J\b\u00108\u001a\u000200H\u0002J\u0010\u00109\u001a\u0002002\u0006\u0010:\u001a\u00020\u0016H\u0002R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R/\u0010\b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00050\u00050\t8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u0016X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0012\u0010)\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0007R\u0012\u0010+\u001a\u00020,X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006="}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;", "ResultType", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "bottomSheet", "Landroid/view/ViewGroup;", "getBottomSheet", "()Landroid/view/ViewGroup;", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "kotlin.jvm.PlatformType", "getBottomSheetBehavior$paymentsheet_release$annotations", "getBottomSheetBehavior$paymentsheet_release", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior$delegate", "Lkotlin/Lazy;", "bottomSheetController", "Lcom/stripe/android/paymentsheet/BottomSheetController;", "getBottomSheetController", "()Lcom/stripe/android/paymentsheet/BottomSheetController;", "bottomSheetController$delegate", "earlyExitDueToIllegalState", "", "getEarlyExitDueToIllegalState", "()Z", "setEarlyExitDueToIllegalState", "(Z)V", "formArgs", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "getFormArgs", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "setFormArgs", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;)V", "linkHandler", "Lcom/stripe/android/paymentsheet/LinkHandler;", "getLinkHandler", "()Lcom/stripe/android/paymentsheet/LinkHandler;", "linkLauncher", "Lcom/stripe/android/link/LinkPaymentLauncher;", "getLinkLauncher", "()Lcom/stripe/android/link/LinkPaymentLauncher;", "rootView", "getRootView", "viewModel", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "closeSheet", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "(Ljava/lang/Object;)V", "finish", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setActivityResult", "setSheetWidthForTablets", "updateRootViewClickHandling", "isProcessing", "Companion", "ToolbarResources", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nBaseSheetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSheetActivity.kt\ncom/stripe/android/paymentsheet/ui/BaseSheetActivity\n+ 2 UiUtils.kt\ncom/stripe/android/paymentsheet/utils/UiUtilsKt\n*L\n1#1,168:1\n16#2,11:169\n16#2,11:180\n*S KotlinDebug\n*F\n+ 1 BaseSheetActivity.kt\ncom/stripe/android/paymentsheet/ui/BaseSheetActivity\n*L\n80#1:169,11\n90#1:180,11\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.BaseSheetActivity */
/* loaded from: classes7.dex */
public abstract class BaseSheetActivity<ResultType> extends AppCompatActivity {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_STARTER_ARGS = "com.stripe.android.paymentsheet.extra_starter_args";
    public static final double TABLET_WIDTH_RATIO = 0.6d;
    private final Lazy bottomSheetBehavior$delegate;
    private final Lazy bottomSheetController$delegate;
    private boolean earlyExitDueToIllegalState;
    private FormArguments formArgs;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$Companion;", "", "()V", "EXTRA_STARTER_ARGS", "", "TABLET_WIDTH_RATIO", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.BaseSheetActivity$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$ToolbarResources;", "", "icon", "", "description", "(II)V", "getDescription", "()I", "getIcon", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.BaseSheetActivity$ToolbarResources */
    /* loaded from: classes7.dex */
    public static final class ToolbarResources {
        private final int description;
        private final int icon;

        public ToolbarResources(int i, int i2) {
            this.icon = i;
            this.description = i2;
        }

        public static /* synthetic */ ToolbarResources copy$default(ToolbarResources toolbarResources, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = toolbarResources.icon;
            }
            if ((i3 & 2) != 0) {
                i2 = toolbarResources.description;
            }
            return toolbarResources.copy(i, i2);
        }

        public final int component1() {
            return this.icon;
        }

        public final int component2() {
            return this.description;
        }

        public final ToolbarResources copy(int i, int i2) {
            return new ToolbarResources(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ToolbarResources) {
                ToolbarResources toolbarResources = (ToolbarResources) obj;
                return this.icon == toolbarResources.icon && this.description == toolbarResources.description;
            }
            return false;
        }

        public final int getDescription() {
            return this.description;
        }

        public final int getIcon() {
            return this.icon;
        }

        public int hashCode() {
            return (Integer.hashCode(this.icon) * 31) + Integer.hashCode(this.description);
        }

        public String toString() {
            int i = this.icon;
            int i2 = this.description;
            return "ToolbarResources(icon=" + i + ", description=" + i2 + ")";
        }
    }

    public BaseSheetActivity() {
        Lazy lazy;
        Lazy lazy2;
        lazy = LazyKt__LazyJVMKt.lazy(new BaseSheetActivity$bottomSheetBehavior$2(this));
        this.bottomSheetBehavior$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new BaseSheetActivity$bottomSheetController$2(this));
        this.bottomSheetController$delegate = lazy2;
    }

    public static /* synthetic */ void getBottomSheetBehavior$paymentsheet_release$annotations() {
    }

    private final BottomSheetController getBottomSheetController() {
        return (BottomSheetController) this.bottomSheetController$delegate.getValue();
    }

    private final void setSheetWidthForTablets() {
        int i;
        int roundToInt;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int systemBars;
        Insets insetsIgnoringVisibility;
        Rect bounds;
        int i2;
        int i3;
        if (!getResources().getBoolean(C19159R.bool.isTablet)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = getWindowManager().getCurrentWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "windowManager.currentWindowMetrics");
            windowInsets = currentWindowMetrics.getWindowInsets();
            systemBars = WindowInsets.Type.systemBars();
            insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(systemBars);
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "windowMetrics.windowInse…Insets.Type.systemBars())");
            bounds = currentWindowMetrics.getBounds();
            int width = bounds.width();
            i2 = insetsIgnoringVisibility.left;
            i3 = insetsIgnoringVisibility.right;
            i = (width - i2) - i3;
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            i = displayMetrics.widthPixels;
        }
        ViewGroup.LayoutParams layoutParams = getBottomSheet().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.C11529e c11529e = (CoordinatorLayout.C11529e) layoutParams;
        c11529e.f54214c |= 1;
        roundToInt = MathKt__MathJVMKt.roundToInt(i * 0.6d);
        ((ViewGroup.MarginLayoutParams) c11529e).width = roundToInt;
        getBottomSheet().setLayoutParams(c11529e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateRootViewClickHandling(boolean z) {
        if (!z) {
            getRootView().setOnClickListener(new View.OnClickListener() { // from class: qE
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseSheetActivity.updateRootViewClickHandling$lambda$3(BaseSheetActivity.this, view);
                }
            });
            return;
        }
        getRootView().setOnClickListener(null);
        getRootView().setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateRootViewClickHandling$lambda$3(BaseSheetActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onUserCancel();
    }

    public final void closeSheet(ResultType resulttype) {
        setActivityResult(resulttype);
        getBottomSheetController().hide();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        AnimationConstants animationConstants = AnimationConstants.INSTANCE;
        overridePendingTransition(animationConstants.getFADE_IN(), animationConstants.getFADE_OUT());
    }

    public abstract ViewGroup getBottomSheet();

    public final BottomSheetBehavior<ViewGroup> getBottomSheetBehavior$paymentsheet_release() {
        return (BottomSheetBehavior) this.bottomSheetBehavior$delegate.getValue();
    }

    public final boolean getEarlyExitDueToIllegalState() {
        return this.earlyExitDueToIllegalState;
    }

    public final FormArguments getFormArgs() {
        return this.formArgs;
    }

    public final LinkHandler getLinkHandler() {
        return getViewModel().getLinkHandler();
    }

    public final LinkPaymentLauncher getLinkLauncher() {
        return getLinkHandler().getLinkLauncher();
    }

    public abstract ViewGroup getRootView();

    public abstract BaseSheetViewModel getViewModel();

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.earlyExitDueToIllegalState) {
            return;
        }
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        getBottomSheet().getLayoutTransition().enableTransitionType(4);
        getBottomSheetController().setup(getBottomSheet());
        InterfaceC32730Eu1<Boolean> shouldFinish$paymentsheet_release = getBottomSheetController().getShouldFinish$paymentsheet_release();
        AbstractC11719f.EnumC11724b enumC11724b = AbstractC11719f.EnumC11724b.STARTED;
        Z30.m73800d(C33163Gq2.m104689a(this), null, null, new BaseSheetActivity$onCreate$$inlined$launchAndCollectIn$default$1(this, enumC11724b, shouldFinish$paymentsheet_release, null, this), 3, null);
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "onBackPressedDispatcher");
        C38677bf3.m64201b(onBackPressedDispatcher, null, false, new BaseSheetActivity$onCreate$2(this), 3, null);
        Z30.m73800d(C33163Gq2.m104689a(this), null, null, new BaseSheetActivity$onCreate$$inlined$launchAndCollectIn$default$2(this, enumC11724b, getViewModel().getProcessing(), null, this), 3, null);
        getBottomSheet().setClickable(true);
        Context baseContext = getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
        boolean isSystemDarkTheme = StripeThemeKt.isSystemDarkTheme(baseContext);
        PaymentSheet.Configuration config$paymentsheet_release = getViewModel().getConfig$paymentsheet_release();
        if (config$paymentsheet_release != null) {
            getBottomSheet().setBackgroundColor(C50619vm0.m8173h(C50619vm0.m8179b(config$paymentsheet_release.getAppearance().getColors(isSystemDarkTheme).getSurface())));
        }
        setSheetWidthForTablets();
    }

    public abstract void setActivityResult(ResultType resulttype);

    public final void setEarlyExitDueToIllegalState(boolean z) {
        this.earlyExitDueToIllegalState = z;
    }

    public final void setFormArgs(FormArguments formArguments) {
        this.formArgs = formArguments;
    }
}
