package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import ch.qos.logback.core.CoreConstants;
import com.afollestad.materialdialogs.C16848R;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.internal.main.BaseSubLayout;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.afollestad.materialdialogs.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0014J\b\u0010'\u001a\u00020$H\u0014J0\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0010H\u0014J\u0018\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u0010H\u0014J\b\u00101\u001a\u00020\u0010H\u0002R\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086.¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u001cX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u000b¨\u00063"}, m28432d2 = {"Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "Lcom/afollestad/materialdialogs/internal/main/BaseSubLayout;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "actionButtons", "", "Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "getActionButtons", "()[Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "setActionButtons", "([Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;)V", "[Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "buttonFramePadding", "", "buttonFramePaddingNeutral", "buttonFrameSpecHeight", "checkBoxPrompt", "Landroidx/appcompat/widget/AppCompatCheckBox;", "getCheckBoxPrompt", "()Landroidx/appcompat/widget/AppCompatCheckBox;", "setCheckBoxPrompt", "(Landroidx/appcompat/widget/AppCompatCheckBox;)V", "checkBoxPromptMarginHorizontal", "checkBoxPromptMarginVertical", "stackButtons", "", "getStackButtons$core", "()Z", "setStackButtons$core", "(Z)V", "visibleButtons", "getVisibleButtons", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onFinishInflate", "onLayout", "changed", "left", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "requiredHeightForButtons", "Companion", "core"}, m28431k = 1, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class DialogActionButtonLayout extends BaseSubLayout {
    public static final Companion Companion = new Companion(null);
    public static final int INDEX_NEGATIVE = 1;
    public static final int INDEX_NEUTRAL = 2;
    public static final int INDEX_POSITIVE = 0;
    public DialogActionButton[] actionButtons;
    private final int buttonFramePadding;
    private final int buttonFramePaddingNeutral;
    private final int buttonFrameSpecHeight;
    public AppCompatCheckBox checkBoxPrompt;
    private final int checkBoxPromptMarginHorizontal;
    private final int checkBoxPromptMarginVertical;
    private boolean stackButtons;

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout$Companion;", "", "()V", "INDEX_NEGATIVE", "", "INDEX_NEUTRAL", "INDEX_POSITIVE", "core"}, m28431k = 1, m28430mv = {1, 1, 16})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DialogActionButtonLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final int requiredHeightForButtons() {
        boolean z;
        if (getVisibleButtons().length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0;
        }
        if (this.stackButtons) {
            return this.buttonFrameSpecHeight * getVisibleButtons().length;
        }
        return this.buttonFrameSpecHeight;
    }

    public final DialogActionButton[] getActionButtons() {
        DialogActionButton[] dialogActionButtonArr = this.actionButtons;
        if (dialogActionButtonArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
        }
        return dialogActionButtonArr;
    }

    public final AppCompatCheckBox getCheckBoxPrompt() {
        AppCompatCheckBox appCompatCheckBox = this.checkBoxPrompt;
        if (appCompatCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
        }
        return appCompatCheckBox;
    }

    public final boolean getStackButtons$core() {
        return this.stackButtons;
    }

    public final DialogActionButton[] getVisibleButtons() {
        DialogActionButton[] dialogActionButtonArr = this.actionButtons;
        if (dialogActionButtonArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
        }
        ArrayList arrayList = new ArrayList();
        for (DialogActionButton dialogActionButton : dialogActionButtonArr) {
            if (ViewsKt.isVisible(dialogActionButton)) {
                arrayList.add(dialogActionButton);
            }
        }
        Object[] array = arrayList.toArray(new DialogActionButton[0]);
        if (array != null) {
            return (DialogActionButton[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(0.0f, 0.0f, getMeasuredWidth(), getDividerHeight(), dividerPaint());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(C16848R.C16850id.md_button_positive);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.md_button_positive)");
        View findViewById2 = findViewById(C16848R.C16850id.md_button_negative);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.md_button_negative)");
        View findViewById3 = findViewById(C16848R.C16850id.md_button_neutral);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.md_button_neutral)");
        this.actionButtons = new DialogActionButton[]{(DialogActionButton) findViewById, (DialogActionButton) findViewById2, (DialogActionButton) findViewById3};
        View findViewById4 = findViewById(C16848R.C16850id.md_checkbox_prompt);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.md_checkbox_prompt)");
        this.checkBoxPrompt = (AppCompatCheckBox) findViewById4;
        DialogActionButton[] dialogActionButtonArr = this.actionButtons;
        if (dialogActionButtonArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
        }
        int length = dialogActionButtonArr.length;
        for (int i = 0; i < length; i++) {
            DialogActionButton dialogActionButton = dialogActionButtonArr[i];
            final WhichButton fromIndex = WhichButton.Companion.fromIndex(i);
            dialogActionButton.setOnClickListener(new View.OnClickListener() { // from class: com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout$onFinishInflate$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DialogActionButtonLayout.this.getDialog().onActionButtonClicked$core(fromIndex);
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        List<DialogActionButton> reversed;
        int i5;
        int i6;
        int measuredWidth;
        int measuredHeight;
        if (!DialogActionButtonLayoutKt.shouldBeVisible(this)) {
            return;
        }
        AppCompatCheckBox appCompatCheckBox = this.checkBoxPrompt;
        if (appCompatCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
        }
        if (ViewsKt.isVisible(appCompatCheckBox)) {
            if (ViewsKt.isRtl(this)) {
                measuredWidth = getMeasuredWidth() - this.checkBoxPromptMarginHorizontal;
                i6 = this.checkBoxPromptMarginVertical;
                AppCompatCheckBox appCompatCheckBox2 = this.checkBoxPrompt;
                if (appCompatCheckBox2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
                }
                i5 = measuredWidth - appCompatCheckBox2.getMeasuredWidth();
                AppCompatCheckBox appCompatCheckBox3 = this.checkBoxPrompt;
                if (appCompatCheckBox3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
                }
                measuredHeight = appCompatCheckBox3.getMeasuredHeight();
            } else {
                i5 = this.checkBoxPromptMarginHorizontal;
                i6 = this.checkBoxPromptMarginVertical;
                AppCompatCheckBox appCompatCheckBox4 = this.checkBoxPrompt;
                if (appCompatCheckBox4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
                }
                measuredWidth = appCompatCheckBox4.getMeasuredWidth() + i5;
                AppCompatCheckBox appCompatCheckBox5 = this.checkBoxPrompt;
                if (appCompatCheckBox5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
                }
                measuredHeight = appCompatCheckBox5.getMeasuredHeight();
            }
            int i7 = measuredHeight + i6;
            AppCompatCheckBox appCompatCheckBox6 = this.checkBoxPrompt;
            if (appCompatCheckBox6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
            }
            appCompatCheckBox6.layout(i5, i6, measuredWidth, i7);
        }
        if (this.stackButtons) {
            int i8 = this.buttonFramePadding;
            int measuredWidth2 = getMeasuredWidth() - this.buttonFramePadding;
            int measuredHeight2 = getMeasuredHeight();
            reversed = ArraysKt___ArraysKt.reversed(getVisibleButtons());
            for (DialogActionButton dialogActionButton : reversed) {
                int i9 = measuredHeight2 - this.buttonFrameSpecHeight;
                dialogActionButton.layout(i8, i9, measuredWidth2, measuredHeight2);
                measuredHeight2 = i9;
            }
            return;
        }
        int measuredHeight3 = getMeasuredHeight() - this.buttonFrameSpecHeight;
        int measuredHeight4 = getMeasuredHeight();
        if (ViewsKt.isRtl(this)) {
            DialogActionButton[] dialogActionButtonArr = this.actionButtons;
            if (dialogActionButtonArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
            }
            if (ViewsKt.isVisible(dialogActionButtonArr[2])) {
                DialogActionButton[] dialogActionButtonArr2 = this.actionButtons;
                if (dialogActionButtonArr2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
                }
                DialogActionButton dialogActionButton2 = dialogActionButtonArr2[2];
                int measuredWidth3 = getMeasuredWidth() - this.buttonFramePaddingNeutral;
                dialogActionButton2.layout(measuredWidth3 - dialogActionButton2.getMeasuredWidth(), measuredHeight3, measuredWidth3, measuredHeight4);
            }
            int i10 = this.buttonFramePadding;
            DialogActionButton[] dialogActionButtonArr3 = this.actionButtons;
            if (dialogActionButtonArr3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
            }
            if (ViewsKt.isVisible(dialogActionButtonArr3[0])) {
                DialogActionButton[] dialogActionButtonArr4 = this.actionButtons;
                if (dialogActionButtonArr4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
                }
                DialogActionButton dialogActionButton3 = dialogActionButtonArr4[0];
                int measuredWidth4 = dialogActionButton3.getMeasuredWidth() + i10;
                dialogActionButton3.layout(i10, measuredHeight3, measuredWidth4, measuredHeight4);
                i10 = measuredWidth4;
            }
            DialogActionButton[] dialogActionButtonArr5 = this.actionButtons;
            if (dialogActionButtonArr5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
            }
            if (ViewsKt.isVisible(dialogActionButtonArr5[1])) {
                DialogActionButton[] dialogActionButtonArr6 = this.actionButtons;
                if (dialogActionButtonArr6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
                }
                DialogActionButton dialogActionButton4 = dialogActionButtonArr6[1];
                dialogActionButton4.layout(i10, measuredHeight3, dialogActionButton4.getMeasuredWidth() + i10, measuredHeight4);
                return;
            }
            return;
        }
        DialogActionButton[] dialogActionButtonArr7 = this.actionButtons;
        if (dialogActionButtonArr7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
        }
        if (ViewsKt.isVisible(dialogActionButtonArr7[2])) {
            DialogActionButton[] dialogActionButtonArr8 = this.actionButtons;
            if (dialogActionButtonArr8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
            }
            DialogActionButton dialogActionButton5 = dialogActionButtonArr8[2];
            int i11 = this.buttonFramePaddingNeutral;
            dialogActionButton5.layout(i11, measuredHeight3, dialogActionButton5.getMeasuredWidth() + i11, measuredHeight4);
        }
        int measuredWidth5 = getMeasuredWidth() - this.buttonFramePadding;
        DialogActionButton[] dialogActionButtonArr9 = this.actionButtons;
        if (dialogActionButtonArr9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
        }
        if (ViewsKt.isVisible(dialogActionButtonArr9[0])) {
            DialogActionButton[] dialogActionButtonArr10 = this.actionButtons;
            if (dialogActionButtonArr10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
            }
            DialogActionButton dialogActionButton6 = dialogActionButtonArr10[0];
            int measuredWidth6 = measuredWidth5 - dialogActionButton6.getMeasuredWidth();
            dialogActionButton6.layout(measuredWidth6, measuredHeight3, measuredWidth5, measuredHeight4);
            measuredWidth5 = measuredWidth6;
        }
        DialogActionButton[] dialogActionButtonArr11 = this.actionButtons;
        if (dialogActionButtonArr11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
        }
        if (ViewsKt.isVisible(dialogActionButtonArr11[1])) {
            DialogActionButton[] dialogActionButtonArr12 = this.actionButtons;
            if (dialogActionButtonArr12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
            }
            DialogActionButton dialogActionButton7 = dialogActionButtonArr12[1];
            dialogActionButton7.layout(measuredWidth5 - dialogActionButton7.getMeasuredWidth(), measuredHeight3, measuredWidth5, measuredHeight4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        DialogActionButton[] visibleButtons;
        boolean z;
        DialogActionButton[] visibleButtons2;
        if (!DialogActionButtonLayoutKt.shouldBeVisible(this)) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        AppCompatCheckBox appCompatCheckBox = this.checkBoxPrompt;
        if (appCompatCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
        }
        if (ViewsKt.isVisible(appCompatCheckBox)) {
            int i3 = size - (this.checkBoxPromptMarginHorizontal * 2);
            AppCompatCheckBox appCompatCheckBox2 = this.checkBoxPrompt;
            if (appCompatCheckBox2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
            }
            appCompatCheckBox2.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        Context context = getDialog().getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "dialog.context");
        Context windowContext = getDialog().getWindowContext();
        for (DialogActionButton dialogActionButton : getVisibleButtons()) {
            dialogActionButton.update$core(context, windowContext, this.stackButtons);
            if (this.stackButtons) {
                dialogActionButton.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.buttonFrameSpecHeight, 1073741824));
            } else {
                dialogActionButton.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(this.buttonFrameSpecHeight, 1073741824));
            }
        }
        if (getVisibleButtons().length == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((!z) && !this.stackButtons) {
            int i4 = 0;
            for (DialogActionButton dialogActionButton2 : getVisibleButtons()) {
                i4 += dialogActionButton2.getMeasuredWidth();
            }
            if (i4 >= size && !this.stackButtons) {
                this.stackButtons = true;
                for (DialogActionButton dialogActionButton3 : getVisibleButtons()) {
                    dialogActionButton3.update$core(context, windowContext, true);
                    dialogActionButton3.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.buttonFrameSpecHeight, 1073741824));
                }
            }
        }
        int requiredHeightForButtons = requiredHeightForButtons();
        AppCompatCheckBox appCompatCheckBox3 = this.checkBoxPrompt;
        if (appCompatCheckBox3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
        }
        if (ViewsKt.isVisible(appCompatCheckBox3)) {
            AppCompatCheckBox appCompatCheckBox4 = this.checkBoxPrompt;
            if (appCompatCheckBox4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
            }
            requiredHeightForButtons += appCompatCheckBox4.getMeasuredHeight() + (this.checkBoxPromptMarginVertical * 2);
        }
        setMeasuredDimension(size, requiredHeightForButtons);
    }

    public final void setActionButtons(DialogActionButton[] dialogActionButtonArr) {
        this.actionButtons = dialogActionButtonArr;
    }

    public final void setCheckBoxPrompt(AppCompatCheckBox appCompatCheckBox) {
        this.checkBoxPrompt = appCompatCheckBox;
    }

    public final void setStackButtons$core(boolean z) {
        this.stackButtons = z;
    }

    public DialogActionButtonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MDUtil mDUtil = MDUtil.INSTANCE;
        this.buttonFramePadding = mDUtil.dimenPx(this, C16848R.dimen.md_action_button_frame_padding) - mDUtil.dimenPx(this, C16848R.dimen.md_action_button_inset_horizontal);
        this.buttonFramePaddingNeutral = mDUtil.dimenPx(this, C16848R.dimen.md_action_button_frame_padding_neutral);
        this.buttonFrameSpecHeight = mDUtil.dimenPx(this, C16848R.dimen.md_action_button_frame_spec_height);
        this.checkBoxPromptMarginVertical = mDUtil.dimenPx(this, C16848R.dimen.md_checkbox_prompt_margin_vertical);
        this.checkBoxPromptMarginHorizontal = mDUtil.dimenPx(this, C16848R.dimen.md_checkbox_prompt_margin_horizontal);
    }
}
