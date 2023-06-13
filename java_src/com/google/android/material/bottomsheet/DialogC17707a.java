package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* renamed from: com.google.android.material.bottomsheet.a */
/* loaded from: classes6.dex */
public class DialogC17707a extends DialogC26167mi {
    private BottomSheetBehavior<FrameLayout> behavior;
    private FrameLayout bottomSheet;
    private BottomSheetBehavior.AbstractC17702f bottomSheetCallback;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    private CoordinatorLayout coordinator;
    boolean dismissWithAnimation;
    private C17713f edgeToEdgeCallback;
    private boolean edgeToEdgeEnabled;

    /* renamed from: com.google.android.material.bottomsheet.a$a */
    /* loaded from: classes6.dex */
    public class C17708a implements InterfaceC36332Ue3 {
        public C17708a() {
        }

        @Override // p000.InterfaceC36332Ue3
        /* renamed from: a */
        public DB6 mo7930a(View view, DB6 db6) {
            if (DialogC17707a.this.edgeToEdgeCallback != null) {
                DialogC17707a.this.behavior.m50118V(DialogC17707a.this.edgeToEdgeCallback);
            }
            if (db6 != null) {
                DialogC17707a dialogC17707a = DialogC17707a.this;
                dialogC17707a.edgeToEdgeCallback = new C17713f(dialogC17707a.bottomSheet, db6, null);
                DialogC17707a.this.edgeToEdgeCallback.m50041b(DialogC17707a.this.getWindow());
                DialogC17707a.this.behavior.m50073u(DialogC17707a.this.edgeToEdgeCallback);
            }
            return db6;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$b */
    /* loaded from: classes6.dex */
    public class View$OnClickListenerC17709b implements View.OnClickListener {
        public View$OnClickListenerC17709b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC17707a dialogC17707a = DialogC17707a.this;
            if (dialogC17707a.cancelable && dialogC17707a.isShowing() && DialogC17707a.this.shouldWindowCloseOnTouchOutside()) {
                DialogC17707a.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$c */
    /* loaded from: classes6.dex */
    public class C17710c extends C5148M1 {
        public C17710c() {
        }

        @Override // p000.C5148M1
        public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
            super.onInitializeAccessibilityNodeInfo(view, c27125p2);
            if (DialogC17707a.this.cancelable) {
                c27125p2.m20091a(1048576);
                c27125p2.m20068l0(true);
                return;
            }
            c27125p2.m20068l0(false);
        }

        @Override // p000.C5148M1
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                DialogC17707a dialogC17707a = DialogC17707a.this;
                if (dialogC17707a.cancelable) {
                    dialogC17707a.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$d */
    /* loaded from: classes6.dex */
    public class View$OnTouchListenerC17711d implements View.OnTouchListener {
        public View$OnTouchListenerC17711d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$e */
    /* loaded from: classes6.dex */
    public class C17712e extends BottomSheetBehavior.AbstractC17702f {
        public C17712e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onSlide(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onStateChanged(View view, int i) {
            if (i == 5) {
                DialogC17707a.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$f */
    /* loaded from: classes6.dex */
    public static class C17713f extends BottomSheetBehavior.AbstractC17702f {

        /* renamed from: a */
        public final Boolean f72449a;

        /* renamed from: b */
        public final DB6 f72450b;

        /* renamed from: c */
        public Window f72451c;

        /* renamed from: d */
        public boolean f72452d;

        public /* synthetic */ C17713f(View view, DB6 db6, C17708a c17708a) {
            this(view, db6);
        }

        /* renamed from: a */
        public final void m50042a(View view) {
            boolean booleanValue;
            if (view.getTop() < this.f72450b.m110777m()) {
                Window window = this.f72451c;
                if (window != null) {
                    Boolean bool = this.f72449a;
                    if (bool == null) {
                        booleanValue = this.f72452d;
                    } else {
                        booleanValue = bool.booleanValue();
                    }
                    K91.m99121f(window, booleanValue);
                }
                view.setPadding(view.getPaddingLeft(), this.f72450b.m110777m() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                Window window2 = this.f72451c;
                if (window2 != null) {
                    K91.m99121f(window2, this.f72452d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        /* renamed from: b */
        public void m50041b(Window window) {
            if (this.f72451c == window) {
                return;
            }
            this.f72451c = window;
            if (window != null) {
                this.f72452d = C43166jB6.m31027a(window, window.getDecorView()).m36623b();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onLayout(View view) {
            m50042a(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onSlide(View view, float f) {
            m50042a(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onStateChanged(View view, int i) {
            m50042a(view);
        }

        public C17713f(View view, DB6 db6) {
            ColorStateList m62455u;
            this.f72450b = db6;
            PM2 m50130J = BottomSheetBehavior.m50133G(view).m50130J();
            if (m50130J != null) {
                m62455u = m50130J.m90379x();
            } else {
                m62455u = C38790bq6.m62455u(view);
            }
            if (m62455u != null) {
                this.f72449a = Boolean.valueOf(HM2.m103949g(m62455u.getDefaultColor()));
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f72449a = Boolean.valueOf(HM2.m103949g(((ColorDrawable) view.getBackground()).getColor()));
            } else {
                this.f72449a = null;
            }
        }
    }

    public DialogC17707a(Context context) {
        this(context, 0);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{C49961uf4.enableEdgeToEdge}).getBoolean(0, false);
    }

    private FrameLayout ensureContainerAndBehavior() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C50603vk4.design_bottom_sheet_dialog, null);
            this.container = frameLayout;
            this.coordinator = (CoordinatorLayout) frameLayout.findViewById(C33795Ji4.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.container.findViewById(C33795Ji4.design_bottom_sheet);
            this.bottomSheet = frameLayout2;
            BottomSheetBehavior<FrameLayout> m50133G = BottomSheetBehavior.m50133G(frameLayout2);
            this.behavior = m50133G;
            m50133G.m50073u(this.bottomSheetCallback);
            this.behavior.m50098h0(this.cancelable);
        }
        return this.container;
    }

    private static int getThemeResId(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(C49961uf4.bottomSheetDialogTheme, typedValue, true)) {
                return typedValue.resourceId;
            }
            return C50021ul4.Theme_Design_Light_BottomSheetDialog;
        }
        return i;
    }

    @Deprecated
    public static void setLightStatusBar(View view, boolean z) {
        int i;
        int systemUiVisibility = view.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility | 8192;
        } else {
            i = systemUiVisibility & (-8193);
        }
        view.setSystemUiVisibility(i);
    }

    private View wrapInBottomSheet(int i, View view, ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.container.findViewById(C33795Ji4.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.edgeToEdgeEnabled) {
            C38790bq6.m62531L0(this.bottomSheet, new C17708a());
        }
        this.bottomSheet.removeAllViews();
        if (layoutParams == null) {
            this.bottomSheet.addView(view);
        } else {
            this.bottomSheet.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C33795Ji4.touch_outside).setOnClickListener(new View$OnClickListenerC17709b());
        C38790bq6.m62452v0(this.bottomSheet, new C17710c());
        this.bottomSheet.setOnTouchListener(new View$OnTouchListenerC17711d());
        return this.container;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior = getBehavior();
        if (this.dismissWithAnimation && behavior.m50128L() != 5) {
            behavior.m50082p0(5);
        } else {
            super.cancel();
        }
    }

    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    public boolean getDismissWithAnimation() {
        return this.dismissWithAnimation;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.edgeToEdgeEnabled;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.edgeToEdgeEnabled && Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            } else {
                z = false;
            }
            FrameLayout frameLayout = this.container;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.coordinator;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            C43166jB6.m31026b(window, !z);
            C17713f c17713f = this.edgeToEdgeCallback;
            if (c17713f != null) {
                c17713f.m50041b(window);
            }
        }
    }

    @Override // p000.DialogC26167mi, p000.DialogC35519Qs0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        C17713f c17713f = this.edgeToEdgeCallback;
        if (c17713f != null) {
            c17713f.m50041b(null);
        }
    }

    @Override // p000.DialogC35519Qs0, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior != null && bottomSheetBehavior.m50128L() == 5) {
            this.behavior.m50082p0(4);
        }
    }

    public void removeDefaultCallback() {
        this.behavior.m50118V(this.bottomSheetCallback);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.cancelable != z) {
            this.cancelable = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.m50098h0(z);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z;
        this.canceledOnTouchOutsideSet = true;
    }

    @Override // p000.DialogC26167mi, p000.DialogC35519Qs0, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(wrapInBottomSheet(i, null, null));
    }

    public void setDismissWithAnimation(boolean z) {
        this.dismissWithAnimation = z;
    }

    public boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.canceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    @Override // p000.DialogC26167mi, p000.DialogC35519Qs0, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(wrapInBottomSheet(0, view, null));
    }

    @Override // p000.DialogC26167mi, p000.DialogC35519Qs0, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInBottomSheet(0, view, layoutParams));
    }

    public DialogC17707a(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new C17712e();
        supportRequestWindowFeature(1);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{C49961uf4.enableEdgeToEdge}).getBoolean(0, false);
    }

    public DialogC17707a(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new C17712e();
        supportRequestWindowFeature(1);
        this.cancelable = z;
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{C49961uf4.enableEdgeToEdge}).getBoolean(0, false);
    }
}
