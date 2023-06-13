package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
/* renamed from: J56 */
/* loaded from: classes.dex */
public class J56 {

    /* renamed from: a */
    public final Context f16834a;

    /* renamed from: b */
    public final View f16835b;

    /* renamed from: c */
    public final TextView f16836c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f16837d;

    /* renamed from: e */
    public final Rect f16838e;

    /* renamed from: f */
    public final int[] f16839f;

    /* renamed from: g */
    public final int[] f16840g;

    public J56(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f16837d = layoutParams;
        this.f16838e = new Rect();
        this.f16839f = new int[2];
        this.f16840g = new int[2];
        this.f16834a = context;
        View inflate = LayoutInflater.from(context).inflate(C32643Ek4.abc_tooltip, (ViewGroup) null);
        this.f16835b = inflate;
        this.f16836c = (TextView) inflate.findViewById(C39902dh4.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C33588Il4.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: b */
    public static View m101173b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: a */
    public final void m101174a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        int i4;
        int i5;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f16834a.getResources().getDimensionPixelOffset(C39281cg4.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f16834a.getResources().getDimensionPixelOffset(C39281cg4.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f16834a.getResources();
        if (z) {
            i4 = C39281cg4.tooltip_y_offset_touch;
        } else {
            i4 = C39281cg4.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i4);
        View m101173b = m101173b(view);
        if (m101173b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        m101173b.getWindowVisibleDisplayFrame(this.f16838e);
        Rect rect = this.f16838e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources2 = this.f16834a.getResources();
            int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier != 0) {
                i5 = resources2.getDimensionPixelSize(identifier);
            } else {
                i5 = 0;
            }
            DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
            this.f16838e.set(0, i5, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        m101173b.getLocationOnScreen(this.f16840g);
        view.getLocationOnScreen(this.f16839f);
        int[] iArr = this.f16839f;
        int i6 = iArr[0];
        int[] iArr2 = this.f16840g;
        int i7 = i6 - iArr2[0];
        iArr[0] = i7;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i7 + i) - (m101173b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f16835b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f16835b.getMeasuredHeight();
        int i8 = this.f16839f[1];
        int i9 = ((i3 + i8) - dimensionPixelOffset3) - measuredHeight;
        int i10 = i8 + height + dimensionPixelOffset3;
        if (z) {
            if (i9 >= 0) {
                layoutParams.y = i9;
            } else {
                layoutParams.y = i10;
            }
        } else if (measuredHeight + i10 <= this.f16838e.height()) {
            layoutParams.y = i10;
        } else {
            layoutParams.y = i9;
        }
    }

    /* renamed from: c */
    public void m101172c() {
        if (!m101171d()) {
            return;
        }
        ((WindowManager) this.f16834a.getSystemService("window")).removeView(this.f16835b);
    }

    /* renamed from: d */
    public boolean m101171d() {
        return this.f16835b.getParent() != null;
    }

    /* renamed from: e */
    public void m101170e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m101171d()) {
            m101172c();
        }
        this.f16836c.setText(charSequence);
        m101174a(view, i, i2, z, this.f16837d);
        ((WindowManager) this.f16834a.getSystemService("window")).addView(this.f16835b, this.f16837d);
    }
}
