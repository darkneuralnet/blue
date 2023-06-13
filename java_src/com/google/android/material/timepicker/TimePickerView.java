package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class TimePickerView extends ConstraintLayout {

    /* renamed from: b */
    public final Chip f73654b;

    /* renamed from: c */
    public final Chip f73655c;

    /* renamed from: d */
    public final ClockHandView f73656d;

    /* renamed from: e */
    public final ClockFaceView f73657e;

    /* renamed from: f */
    public final MaterialButtonToggleGroup f73658f;

    /* renamed from: g */
    public final View.OnClickListener f73659g;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    /* loaded from: classes6.dex */
    public class View$OnClickListenerC17943a implements View.OnClickListener {
        public View$OnClickListenerC17943a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.this.getClass();
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$b */
    /* loaded from: classes6.dex */
    public class C17944b extends GestureDetector.SimpleOnGestureListener {
        public C17944b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.this.getClass();
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$c */
    /* loaded from: classes6.dex */
    public class View$OnTouchListenerC17945c implements View.OnTouchListener {

        /* renamed from: b */
        public final /* synthetic */ GestureDetector f73662b;

        public View$OnTouchListenerC17945c(GestureDetector gestureDetector) {
            this.f73662b = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f73662b.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC17946d {
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$e */
    /* loaded from: classes6.dex */
    public interface InterfaceC17947e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m48503h(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
    }

    /* renamed from: i */
    public final void m48502i() {
        Chip chip = this.f73654b;
        int i = C33795Ji4.selection_type;
        chip.setTag(i, 12);
        this.f73655c.setTag(i, 10);
        this.f73654b.setOnClickListener(this.f73659g);
        this.f73655c.setOnClickListener(this.f73659g);
        this.f73654b.setAccessibilityClassName("android.view.View");
        this.f73655c.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: j */
    public final void m48501j() {
        View$OnTouchListenerC17945c view$OnTouchListenerC17945c = new View$OnTouchListenerC17945c(new GestureDetector(getContext(), new C17944b()));
        this.f73654b.setOnTouchListener(view$OnTouchListenerC17945c);
        this.f73655c.setOnTouchListener(view$OnTouchListenerC17945c);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f73655c.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f73659g = new View$OnClickListenerC17943a();
        LayoutInflater.from(context).inflate(C50603vk4.material_timepicker, this);
        this.f73657e = (ClockFaceView) findViewById(C33795Ji4.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C33795Ji4.material_clock_period_toggle);
        this.f73658f = materialButtonToggleGroup;
        materialButtonToggleGroup.m50034b(new MaterialButtonToggleGroup.InterfaceC17723d() { // from class: com.google.android.material.timepicker.c
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.InterfaceC17723d
            /* renamed from: a */
            public final void mo48500a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i2, boolean z) {
                TimePickerView.this.m48503h(materialButtonToggleGroup2, i2, z);
            }
        });
        this.f73654b = (Chip) findViewById(C33795Ji4.material_minute_tv);
        this.f73655c = (Chip) findViewById(C33795Ji4.material_hour_tv);
        this.f73656d = (ClockHandView) findViewById(C33795Ji4.material_clock_hand);
        m48501j();
        m48502i();
    }
}
