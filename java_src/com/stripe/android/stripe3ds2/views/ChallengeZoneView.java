package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.stripe3ds2.C19336R;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneViewBinding;
import com.stripe.android.stripe3ds2.init.p048ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.p048ui.LabelCustomization;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010+\u001a\u00020,2\u0006\u0010\t\u001a\u00020-J\u001c\u0010.\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u000102J\u001c\u00103\u001a\u00020,2\b\u00104\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u000102J\u0010\u00105\u001a\u00020,2\b\b\u0001\u00106\u001a\u00020\u0007J\u0010\u00107\u001a\u00020,2\b\u00108\u001a\u0004\u0018\u000109J\u001c\u0010:\u001a\u00020,2\b\u0010;\u001a\u0004\u0018\u0001002\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=J\u001c\u0010>\u001a\u00020,2\b\u0010?\u001a\u0004\u0018\u0001002\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=J\u0010\u0010@\u001a\u00020,2\b\u00108\u001a\u0004\u0018\u000109J(\u0010A\u001a\u00020,2\b\u0010%\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=R\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001cX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u001cX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0014\u0010%\u001a\u00020\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0014R\u0014\u0010'\u001a\u00020(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006B"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;", "Landroid/widget/LinearLayout;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "challengeEntryView", "Landroid/widget/FrameLayout;", "getChallengeEntryView$3ds2sdk_release", "()Landroid/widget/FrameLayout;", "infoHeader", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", "getInfoHeader$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", "infoTextView", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getInfoTextView$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "resendButton", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "getResendButton$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "submitButton", "getSubmitButton$3ds2sdk_release", "whitelistNoRadioButton", "Landroid/widget/RadioButton;", "getWhitelistNoRadioButton$3ds2sdk_release", "()Landroid/widget/RadioButton;", "whitelistRadioGroup", "Landroid/widget/RadioGroup;", "getWhitelistRadioGroup$3ds2sdk_release", "()Landroid/widget/RadioGroup;", "whitelistYesRadioButton", "getWhitelistYesRadioButton$3ds2sdk_release", "whitelistingLabel", "getWhitelistingLabel$3ds2sdk_release", "whitelistingSelection", "", "getWhitelistingSelection$3ds2sdk_release", "()Z", "setChallengeEntryView", "", "Landroid/view/View;", "setInfoHeaderText", "headerText", "", "labelCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "setInfoText", "infoText", "setInfoTextIndicator", "indicatorResId", "setResendButtonClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "setResendButtonLabel", "resendButtonLabel", "buttonCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "setSubmitButton", "submitButtonLabel", "setSubmitButtonClickListener", "setWhitelistingLabel", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeZoneView extends LinearLayout {
    private final FrameLayout challengeEntryView;
    private final ThreeDS2HeaderTextView infoHeader;
    private final ThreeDS2TextView infoTextView;
    private final ThreeDS2Button resendButton;
    private final ThreeDS2Button submitButton;
    private final RadioButton whitelistNoRadioButton;
    private final RadioGroup whitelistRadioGroup;
    private final RadioButton whitelistYesRadioButton;
    private final ThreeDS2TextView whitelistingLabel;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChallengeZoneView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setInfoHeaderText$default(ChallengeZoneView challengeZoneView, String str, LabelCustomization labelCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            labelCustomization = null;
        }
        challengeZoneView.setInfoHeaderText(str, labelCustomization);
    }

    public static /* synthetic */ void setInfoText$default(ChallengeZoneView challengeZoneView, String str, LabelCustomization labelCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            labelCustomization = null;
        }
        challengeZoneView.setInfoText(str, labelCustomization);
    }

    public static /* synthetic */ void setResendButtonLabel$default(ChallengeZoneView challengeZoneView, String str, ButtonCustomization buttonCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            buttonCustomization = null;
        }
        challengeZoneView.setResendButtonLabel(str, buttonCustomization);
    }

    public static /* synthetic */ void setSubmitButton$default(ChallengeZoneView challengeZoneView, String str, ButtonCustomization buttonCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            buttonCustomization = null;
        }
        challengeZoneView.setSubmitButton(str, buttonCustomization);
    }

    public static /* synthetic */ void setWhitelistingLabel$default(ChallengeZoneView challengeZoneView, String str, LabelCustomization labelCustomization, ButtonCustomization buttonCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            labelCustomization = null;
        }
        if ((i & 4) != 0) {
            buttonCustomization = null;
        }
        challengeZoneView.setWhitelistingLabel(str, labelCustomization, buttonCustomization);
    }

    public final FrameLayout getChallengeEntryView$3ds2sdk_release() {
        return this.challengeEntryView;
    }

    public final ThreeDS2HeaderTextView getInfoHeader$3ds2sdk_release() {
        return this.infoHeader;
    }

    public final ThreeDS2TextView getInfoTextView$3ds2sdk_release() {
        return this.infoTextView;
    }

    public final ThreeDS2Button getResendButton$3ds2sdk_release() {
        return this.resendButton;
    }

    public final ThreeDS2Button getSubmitButton$3ds2sdk_release() {
        return this.submitButton;
    }

    public final RadioButton getWhitelistNoRadioButton$3ds2sdk_release() {
        return this.whitelistNoRadioButton;
    }

    public final RadioGroup getWhitelistRadioGroup$3ds2sdk_release() {
        return this.whitelistRadioGroup;
    }

    public final RadioButton getWhitelistYesRadioButton$3ds2sdk_release() {
        return this.whitelistYesRadioButton;
    }

    public final ThreeDS2TextView getWhitelistingLabel$3ds2sdk_release() {
        return this.whitelistingLabel;
    }

    public final boolean getWhitelistingSelection$3ds2sdk_release() {
        return this.whitelistRadioGroup.getCheckedRadioButtonId() == C19336R.C19338id.czv_whitelist_yes_button;
    }

    public final void setChallengeEntryView(View challengeEntryView) {
        Intrinsics.checkNotNullParameter(challengeEntryView, "challengeEntryView");
        this.challengeEntryView.addView(challengeEntryView);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setInfoHeaderText(String str, LabelCustomization labelCustomization) {
        boolean z;
        boolean isBlank;
        if (str != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                z = false;
                if (!z) {
                    this.infoHeader.setVisibility(8);
                    return;
                } else {
                    this.infoHeader.setText(str, labelCustomization);
                    return;
                }
            }
        }
        z = true;
        if (!z) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setInfoText(String str, LabelCustomization labelCustomization) {
        boolean z;
        boolean isBlank;
        if (str != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                z = false;
                if (!z) {
                    this.infoTextView.setVisibility(8);
                    return;
                } else {
                    this.infoTextView.setText(str, labelCustomization);
                    return;
                }
            }
        }
        z = true;
        if (!z) {
        }
    }

    public final void setInfoTextIndicator(int i) {
        this.infoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
    }

    public final void setResendButtonClickListener(View.OnClickListener onClickListener) {
        this.resendButton.setOnClickListener(onClickListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setResendButtonLabel(String str, ButtonCustomization buttonCustomization) {
        boolean z;
        boolean isBlank;
        if (str != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                z = false;
                if (z) {
                    this.resendButton.setVisibility(0);
                    this.resendButton.setText(str);
                    this.resendButton.setButtonCustomization(buttonCustomization);
                    return;
                }
                return;
            }
        }
        z = true;
        if (z) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setSubmitButton(String str, ButtonCustomization buttonCustomization) {
        boolean z;
        boolean isBlank;
        if (str != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                z = false;
                if (!z) {
                    this.submitButton.setVisibility(8);
                    return;
                }
                this.submitButton.setText(str);
                this.submitButton.setButtonCustomization(buttonCustomization);
                return;
            }
        }
        z = true;
        if (!z) {
        }
    }

    public final void setSubmitButtonClickListener(View.OnClickListener onClickListener) {
        this.submitButton.setOnClickListener(onClickListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setWhitelistingLabel(String str, LabelCustomization labelCustomization, ButtonCustomization buttonCustomization) {
        boolean z;
        IntRange until;
        boolean z2;
        String textColor;
        boolean z3;
        boolean isBlank;
        boolean isBlank2;
        RadioButton radioButton;
        boolean isBlank3;
        if (str != null) {
            isBlank3 = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank3) {
                z = false;
                if (z) {
                    this.whitelistingLabel.setText(str, labelCustomization);
                    if (buttonCustomization != null) {
                        until = RangesKt___RangesKt.until(0, this.whitelistRadioGroup.getChildCount());
                        ArrayList<RadioButton> arrayList = new ArrayList();
                        Iterator<Integer> it = until.iterator();
                        while (it.hasNext()) {
                            View childAt = this.whitelistRadioGroup.getChildAt(((IntIterator) it).nextInt());
                            if (childAt instanceof RadioButton) {
                                radioButton = (RadioButton) childAt;
                            } else {
                                radioButton = null;
                            }
                            if (radioButton != null) {
                                arrayList.add(radioButton);
                            }
                        }
                        for (RadioButton radioButton2 : arrayList) {
                            String backgroundColor = buttonCustomization.getBackgroundColor();
                            if (backgroundColor != null) {
                                isBlank2 = StringsKt__StringsJVMKt.isBlank(backgroundColor);
                                if (!isBlank2) {
                                    z2 = false;
                                    if (!z2) {
                                        C48921su0.m13543d(radioButton2, ColorStateList.valueOf(Color.parseColor(buttonCustomization.getBackgroundColor())));
                                    }
                                    textColor = buttonCustomization.getTextColor();
                                    if (textColor != null) {
                                        isBlank = StringsKt__StringsJVMKt.isBlank(textColor);
                                        if (!isBlank) {
                                            z3 = false;
                                            if (!z3) {
                                                radioButton2.setTextColor(Color.parseColor(buttonCustomization.getTextColor()));
                                            }
                                        }
                                    }
                                    z3 = true;
                                    if (!z3) {
                                    }
                                }
                            }
                            z2 = true;
                            if (!z2) {
                            }
                            textColor = buttonCustomization.getTextColor();
                            if (textColor != null) {
                            }
                            z3 = true;
                            if (!z3) {
                            }
                        }
                    }
                    this.whitelistingLabel.setVisibility(0);
                    this.whitelistRadioGroup.setVisibility(0);
                    return;
                }
                return;
            }
        }
        z = true;
        if (z) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChallengeZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ChallengeZoneView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChallengeZoneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        StripeChallengeZoneViewBinding inflate = StripeChallengeZoneViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…           this\n        )");
        ThreeDS2HeaderTextView threeDS2HeaderTextView = inflate.czvHeader;
        Intrinsics.checkNotNullExpressionValue(threeDS2HeaderTextView, "viewBinding.czvHeader");
        this.infoHeader = threeDS2HeaderTextView;
        ThreeDS2TextView threeDS2TextView = inflate.czvInfo;
        Intrinsics.checkNotNullExpressionValue(threeDS2TextView, "viewBinding.czvInfo");
        this.infoTextView = threeDS2TextView;
        ThreeDS2Button threeDS2Button = inflate.czvSubmitButton;
        Intrinsics.checkNotNullExpressionValue(threeDS2Button, "viewBinding.czvSubmitButton");
        this.submitButton = threeDS2Button;
        ThreeDS2Button threeDS2Button2 = inflate.czvResendButton;
        Intrinsics.checkNotNullExpressionValue(threeDS2Button2, "viewBinding.czvResendButton");
        this.resendButton = threeDS2Button2;
        ThreeDS2TextView threeDS2TextView2 = inflate.czvWhitelistingLabel;
        Intrinsics.checkNotNullExpressionValue(threeDS2TextView2, "viewBinding.czvWhitelistingLabel");
        this.whitelistingLabel = threeDS2TextView2;
        RadioGroup radioGroup = inflate.czvWhitelistRadioGroup;
        Intrinsics.checkNotNullExpressionValue(radioGroup, "viewBinding.czvWhitelistRadioGroup");
        this.whitelistRadioGroup = radioGroup;
        FrameLayout frameLayout = inflate.czvEntryView;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "viewBinding.czvEntryView");
        this.challengeEntryView = frameLayout;
        RadioButton radioButton = inflate.czvWhitelistYesButton;
        Intrinsics.checkNotNullExpressionValue(radioButton, "viewBinding.czvWhitelistYesButton");
        this.whitelistYesRadioButton = radioButton;
        RadioButton radioButton2 = inflate.czvWhitelistNoButton;
        Intrinsics.checkNotNullExpressionValue(radioButton2, "viewBinding.czvWhitelistNoButton");
        this.whitelistNoRadioButton = radioButton2;
    }
}
