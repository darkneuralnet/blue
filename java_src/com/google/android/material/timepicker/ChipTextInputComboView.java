package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: b */
    public final Chip f73600b;

    /* renamed from: c */
    public final TextInputLayout f73601c;

    /* renamed from: d */
    public final EditText f73602d;

    /* renamed from: e */
    public TextWatcher f73603e;

    /* renamed from: f */
    public TextView f73604f;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    /* loaded from: classes6.dex */
    public class C17937b extends C38326b36 {
        public C17937b() {
        }

        @Override // p000.C38326b36, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f73600b.setText(ChipTextInputComboView.this.m48549c("00"));
                return;
            }
            String m48549c = ChipTextInputComboView.this.m48549c(editable);
            Chip chip = ChipTextInputComboView.this.f73600b;
            if (TextUtils.isEmpty(m48549c)) {
                m48549c = ChipTextInputComboView.this.m48549c("00");
            }
            chip.setText(m48549c);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public final String m48549c(CharSequence charSequence) {
        return TimeModel.m48511a(getResources(), charSequence);
    }

    /* renamed from: d */
    public final void m48548d() {
        this.f73602d.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f73600b.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m48548d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        int i;
        this.f73600b.setChecked(z);
        EditText editText = this.f73602d;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        editText.setVisibility(i);
        Chip chip = this.f73600b;
        if (z) {
            i2 = 8;
        }
        chip.setVisibility(i2);
        if (isChecked()) {
            C36704Vt6.m79291q(this.f73602d);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f73600b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.f73600b.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f73600b.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(C50603vk4.material_time_chip, (ViewGroup) this, false);
        this.f73600b = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(C50603vk4.material_time_input, (ViewGroup) this, false);
        this.f73601c = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f73602d = editText;
        editText.setVisibility(4);
        C17937b c17937b = new C17937b();
        this.f73603e = c17937b;
        editText.addTextChangedListener(c17937b);
        m48548d();
        addView(chip);
        addView(textInputLayout);
        this.f73604f = (TextView) findViewById(C33795Ji4.material_label);
        editText.setId(C38790bq6.m62473l());
        C38790bq6.m62535J0(this.f73604f, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
