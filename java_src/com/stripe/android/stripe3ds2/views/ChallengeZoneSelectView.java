package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import ch.qos.logback.core.CoreConstants;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.stripe.android.stripe3ds2.C19336R;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneMultiSelectViewBinding;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneSingleSelectViewBinding;
import com.stripe.android.stripe3ds2.init.p048ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.p048ui.LabelCustomization;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ'\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020!2\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020\nH\u0000¢\u0006\u0002\b-J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0014J\b\u00102\u001a\u000201H\u0014J\u000e\u00103\u001a\u00020/2\u0006\u00104\u001a\u00020\bJ \u00105\u001a\u00020/2\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00112\b\u0010*\u001a\u0004\u0018\u00010+J\u001a\u00107\u001a\u00020/2\b\u00108\u001a\u0004\u0018\u00010$2\b\u00109\u001a\u0004\u0018\u00010:R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00118F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006<"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;", "Landroid/widget/FrameLayout;", "Lcom/stripe/android/stripe3ds2/views/FormField;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "isSingleSelectMode", "", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "buttonBottomMargin", "buttonLabelPadding", "buttonMinHeight", "buttonOffsetMargin", "checkBoxes", "", "Landroid/widget/CheckBox;", "getCheckBoxes", "()Ljava/util/List;", "infoLabel", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getInfoLabel$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "()Z", "selectGroup", "Landroid/widget/LinearLayout;", "getSelectGroup$3ds2sdk_release", "()Landroid/widget/LinearLayout;", "selectedIndexes", "getSelectedIndexes$3ds2sdk_release", "selectedOptions", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;", "getSelectedOptions", "userEntry", "", "getUserEntry", "()Ljava/lang/String;", "buildButton", "Landroid/widget/CompoundButton;", "option", "buttonCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "lastButton", "buildButton$3ds2sdk_release", "onRestoreInstanceState", "", TransferTable.COLUMN_STATE, "Landroid/os/Parcelable;", "onSaveInstanceState", "selectOption", "index", "setChallengeSelectOptions", "options", "setTextEntryLabel", "label", "labelCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeZoneSelectView extends FrameLayout implements FormField {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String STATE_SELECTED_INDEXED = "state_selected_indexes";
    @Deprecated
    private static final String STATE_SUPER = "state_super";
    private final int buttonBottomMargin;
    private final int buttonLabelPadding;
    private final int buttonMinHeight;
    private final int buttonOffsetMargin;
    private final ThreeDS2TextView infoLabel;
    private final boolean isSingleSelectMode;
    private final LinearLayout selectGroup;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView$Companion;", "", "()V", "STATE_SELECTED_INDEXED", "", "STATE_SUPER", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChallengeZoneSelectView(Context context) {
        this(context, null, 0, false, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r1 != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CompoundButton buildButton$3ds2sdk_release(ChallengeResponseData.ChallengeSelectOption option, ButtonCustomization buttonCustomization, boolean z) {
        CompoundButton materialCheckBox;
        boolean z2;
        String textColor;
        boolean isBlank;
        boolean isBlank2;
        Intrinsics.checkNotNullParameter(option, "option");
        if (this.isSingleSelectMode) {
            materialCheckBox = new MaterialRadioButton(getContext());
        } else {
            materialCheckBox = new MaterialCheckBox(getContext());
        }
        if (buttonCustomization != null) {
            String backgroundColor = buttonCustomization.getBackgroundColor();
            boolean z3 = false;
            if (backgroundColor != null) {
                isBlank2 = StringsKt__StringsJVMKt.isBlank(backgroundColor);
                if (!isBlank2) {
                    z2 = false;
                    if (!z2) {
                        C48921su0.m13543d(materialCheckBox, ColorStateList.valueOf(Color.parseColor(buttonCustomization.getBackgroundColor())));
                    }
                    textColor = buttonCustomization.getTextColor();
                    if (textColor != null) {
                        isBlank = StringsKt__StringsJVMKt.isBlank(textColor);
                    }
                    z3 = true;
                    if (!z3) {
                        materialCheckBox.setTextColor(Color.parseColor(buttonCustomization.getTextColor()));
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
        materialCheckBox.setId(View.generateViewId());
        materialCheckBox.setTag(option);
        materialCheckBox.setText(option.getText());
        materialCheckBox.setPadding(this.buttonLabelPadding, materialCheckBox.getPaddingTop(), materialCheckBox.getPaddingRight(), materialCheckBox.getPaddingBottom());
        materialCheckBox.setMinimumHeight(this.buttonMinHeight);
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
        if (!z) {
            layoutParams.bottomMargin = this.buttonBottomMargin;
        }
        layoutParams.leftMargin = this.buttonOffsetMargin;
        materialCheckBox.setLayoutParams(layoutParams);
        return materialCheckBox;
    }

    public final List<CheckBox> getCheckBoxes() {
        IntRange until;
        int collectionSizeOrDefault;
        if (this.isSingleSelectMode) {
            return null;
        }
        until = RangesKt___RangesKt.until(0, this.selectGroup.getChildCount());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            View childAt = this.selectGroup.getChildAt(((IntIterator) it).nextInt());
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.CheckBox");
            arrayList.add((CheckBox) childAt);
        }
        return arrayList;
    }

    public final ThreeDS2TextView getInfoLabel$3ds2sdk_release() {
        return this.infoLabel;
    }

    public final LinearLayout getSelectGroup$3ds2sdk_release() {
        return this.selectGroup;
    }

    public final List<Integer> getSelectedIndexes$3ds2sdk_release() {
        IntRange until;
        int size;
        List<Integer> take;
        Integer num;
        until = RangesKt___RangesKt.until(0, this.selectGroup.getChildCount());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            View childAt = this.selectGroup.getChildAt(nextInt);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
            if (((CompoundButton) childAt).isChecked()) {
                num = Integer.valueOf(nextInt);
            } else {
                num = null;
            }
            if (num != null) {
                arrayList.add(num);
            }
        }
        if (this.isSingleSelectMode) {
            size = 1;
        } else {
            size = arrayList.size();
        }
        take = CollectionsKt___CollectionsKt.take(arrayList, size);
        return take;
    }

    public final List<ChallengeResponseData.ChallengeSelectOption> getSelectedOptions() {
        int collectionSizeOrDefault;
        List<Integer> selectedIndexes$3ds2sdk_release = getSelectedIndexes$3ds2sdk_release();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(selectedIndexes$3ds2sdk_release, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Number number : selectedIndexes$3ds2sdk_release) {
            Object tag = this.selectGroup.getChildAt(number.intValue()).getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.ChallengeSelectOption");
            arrayList.add((ChallengeResponseData.ChallengeSelectOption) tag);
        }
        return arrayList;
    }

    @Override // com.stripe.android.stripe3ds2.views.FormField
    public String getUserEntry() {
        String joinToString$default;
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(getSelectedOptions(), ",", null, null, 0, null, ChallengeZoneSelectView$userEntry$1.INSTANCE, 30, null);
        return joinToString$default;
    }

    public final boolean isSingleSelectMode() {
        return this.isSingleSelectMode;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            super.onRestoreInstanceState(bundle.getParcelable(STATE_SUPER));
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(STATE_SELECTED_INDEXED);
            if (integerArrayList != null) {
                for (Integer it : integerArrayList) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    selectOption(it.intValue());
                }
                return;
            }
            return;
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return C39564d70.m44603a(TuplesKt.m28425to(STATE_SUPER, super.onSaveInstanceState()), TuplesKt.m28425to(STATE_SELECTED_INDEXED, new ArrayList(getSelectedIndexes$3ds2sdk_release())));
    }

    public final void selectOption(int i) {
        View childAt = this.selectGroup.getChildAt(i);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
        ((CompoundButton) childAt).setChecked(true);
    }

    public final void setChallengeSelectOptions(List<ChallengeResponseData.ChallengeSelectOption> list, ButtonCustomization buttonCustomization) {
        IntRange until;
        if (list != null) {
            int size = list.size();
            until = RangesKt___RangesKt.until(0, size);
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                ChallengeResponseData.ChallengeSelectOption challengeSelectOption = list.get(nextInt);
                boolean z = true;
                if (nextInt != size - 1) {
                    z = false;
                }
                this.selectGroup.addView(buildButton$3ds2sdk_release(challengeSelectOption, buttonCustomization, z));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTextEntryLabel(String str, LabelCustomization labelCustomization) {
        boolean z;
        boolean isBlank;
        if (str != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                z = false;
                if (!z) {
                    this.infoLabel.setVisibility(8);
                    return;
                } else {
                    this.infoLabel.setText(str, labelCustomization);
                    return;
                }
            }
        }
        z = true;
        if (!z) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChallengeZoneSelectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChallengeZoneSelectView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ChallengeZoneSelectView(Context context, AttributeSet attributeSet, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChallengeZoneSelectView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isSingleSelectMode = z;
        if (getId() == -1) {
            setId(C19336R.C19338id.stripe_3ds2_default_challenge_zone_select_view_id);
        }
        this.buttonBottomMargin = context.getResources().getDimensionPixelSize(C19336R.dimen.stripe_3ds2_challenge_zone_select_button_vertical_margin);
        this.buttonLabelPadding = context.getResources().getDimensionPixelSize(C19336R.dimen.stripe_3ds2_challenge_zone_select_button_label_padding);
        this.buttonOffsetMargin = context.getResources().getDimensionPixelSize(C19336R.dimen.stripe_3ds2_challenge_zone_select_button_offset_margin);
        this.buttonMinHeight = context.getResources().getDimensionPixelSize(C19336R.dimen.stripe_3ds2_challenge_zone_select_button_min_height);
        if (z) {
            StripeChallengeZoneSingleSelectViewBinding inflate = StripeChallengeZoneSingleSelectViewBinding.inflate(LayoutInflater.from(context), this, true);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n               …   true\n                )");
            ThreeDS2TextView threeDS2TextView = inflate.label;
            Intrinsics.checkNotNullExpressionValue(threeDS2TextView, "viewBinding.label");
            this.infoLabel = threeDS2TextView;
            RadioGroup radioGroup = inflate.selectGroup;
            Intrinsics.checkNotNullExpressionValue(radioGroup, "viewBinding.selectGroup");
            this.selectGroup = radioGroup;
            return;
        }
        StripeChallengeZoneMultiSelectViewBinding inflate2 = StripeChallengeZoneMultiSelectViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(\n               …   true\n                )");
        ThreeDS2TextView threeDS2TextView2 = inflate2.label;
        Intrinsics.checkNotNullExpressionValue(threeDS2TextView2, "viewBinding.label");
        this.infoLabel = threeDS2TextView2;
        LinearLayout linearLayout = inflate2.selectGroup;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "viewBinding.selectGroup");
        this.selectGroup = linearLayout;
    }
}
