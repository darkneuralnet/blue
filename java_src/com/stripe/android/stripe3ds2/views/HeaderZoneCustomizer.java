package com.stripe.android.stripe3ds2.views;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.stripe.android.stripe3ds2.C19336R;
import com.stripe.android.stripe3ds2.init.p048ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.p048ui.ToolbarCustomization;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "customize", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "toolbarCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;", "cancelButtonCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class HeaderZoneCustomizer {
    public static final Companion Companion = new Companion(null);
    private final FragmentActivity activity;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer$Companion;", "", "()V", "customizeStatusBar", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "toolbarCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void customizeStatusBar(AppCompatActivity activity, ToolbarCustomization toolbarCustomization) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(toolbarCustomization, "toolbarCustomization");
            if (toolbarCustomization.getStatusBarColor() != null) {
                CustomizeUtils.INSTANCE.setStatusBarColor(activity, Color.parseColor(toolbarCustomization.getStatusBarColor()));
            } else if (toolbarCustomization.getBackgroundColor() != null) {
                int parseColor = Color.parseColor(toolbarCustomization.getBackgroundColor());
                CustomizeUtils customizeUtils = CustomizeUtils.INSTANCE;
                customizeUtils.setStatusBarColor(activity, customizeUtils.darken$3ds2sdk_release(parseColor));
            }
        }

        private Companion() {
        }
    }

    public HeaderZoneCustomizer(FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
    }

    public static /* synthetic */ ThreeDS2Button customize$default(HeaderZoneCustomizer headerZoneCustomizer, ToolbarCustomization toolbarCustomization, ButtonCustomization buttonCustomization, int i, Object obj) {
        if ((i & 1) != 0) {
            toolbarCustomization = null;
        }
        if ((i & 2) != 0) {
            buttonCustomization = null;
        }
        return headerZoneCustomizer.customize(toolbarCustomization, buttonCustomization);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
        if (r0 != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ThreeDS2Button customize(ToolbarCustomization toolbarCustomization, ButtonCustomization buttonCustomization) {
        AppCompatActivity appCompatActivity;
        ActionBar supportActionBar;
        boolean z;
        String backgroundColor;
        String headerText;
        String string;
        boolean isBlank;
        boolean isBlank2;
        FragmentActivity fragmentActivity = this.activity;
        ThreeDS2Button threeDS2Button = null;
        if (fragmentActivity instanceof AppCompatActivity) {
            appCompatActivity = (AppCompatActivity) fragmentActivity;
        } else {
            appCompatActivity = null;
        }
        if (appCompatActivity != null && (supportActionBar = appCompatActivity.getSupportActionBar()) != null) {
            threeDS2Button = new ThreeDS2Button(new C37806aB0(this.activity, C19336R.style.Stripe3DS2ActionBarButton), null, 0, 6, null);
            boolean z2 = false;
            threeDS2Button.setBackgroundTintList(ColorStateList.valueOf(0));
            threeDS2Button.setButtonCustomization(buttonCustomization);
            supportActionBar.mo70214t(threeDS2Button, new ActionBar.LayoutParams(-2, -2, 8388629));
            supportActionBar.mo70211w(true);
            if (toolbarCustomization != null) {
                String buttonText = toolbarCustomization.getButtonText();
                if (buttonText != null) {
                    isBlank2 = StringsKt__StringsJVMKt.isBlank(buttonText);
                    if (!isBlank2) {
                        z = false;
                        if (z) {
                            threeDS2Button.setText(toolbarCustomization.getButtonText());
                        } else {
                            threeDS2Button.setText(C19336R.string.stripe_3ds2_hzv_cancel_label);
                        }
                        backgroundColor = toolbarCustomization.getBackgroundColor();
                        if (backgroundColor != null) {
                            supportActionBar.mo70215s(new ColorDrawable(Color.parseColor(backgroundColor)));
                            Companion.customizeStatusBar(appCompatActivity, toolbarCustomization);
                        }
                        headerText = toolbarCustomization.getHeaderText();
                        if (headerText != null) {
                            isBlank = StringsKt__StringsJVMKt.isBlank(headerText);
                        }
                        z2 = true;
                        if (z2) {
                            string = toolbarCustomization.getHeaderText();
                            Intrinsics.checkNotNullExpressionValue(string, "{\n                toolba….headerText\n            }");
                        } else {
                            string = this.activity.getString(C19336R.string.stripe_3ds2_hzv_header_label);
                            Intrinsics.checkNotNullExpressionValue(string, "{\n                activi…ader_label)\n            }");
                        }
                        supportActionBar.mo70242E(CustomizeUtils.INSTANCE.buildStyledText(this.activity, string, toolbarCustomization));
                    }
                }
                z = true;
                if (z) {
                }
                backgroundColor = toolbarCustomization.getBackgroundColor();
                if (backgroundColor != null) {
                }
                headerText = toolbarCustomization.getHeaderText();
                if (headerText != null) {
                }
                z2 = true;
                if (z2) {
                }
                supportActionBar.mo70242E(CustomizeUtils.INSTANCE.buildStyledText(this.activity, string, toolbarCustomization));
            } else {
                supportActionBar.mo70243D(C19336R.string.stripe_3ds2_hzv_header_label);
                threeDS2Button.setText(C19336R.string.stripe_3ds2_hzv_cancel_label);
            }
        }
        return threeDS2Button;
    }
}
