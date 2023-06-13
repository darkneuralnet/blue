package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.maps.android.p037ui.RotationLayout;
/* renamed from: AP1 */
/* loaded from: classes6.dex */
public class AP1 {

    /* renamed from: a */
    public final Context f484a;

    /* renamed from: b */
    public ViewGroup f485b;

    /* renamed from: c */
    public RotationLayout f486c;

    /* renamed from: d */
    public TextView f487d;

    /* renamed from: e */
    public View f488e;

    /* renamed from: f */
    public int f489f;

    /* renamed from: g */
    public float f490g = 0.5f;

    /* renamed from: h */
    public float f491h = 1.0f;

    /* renamed from: i */
    public C41302g30 f492i;

    /* renamed from: j */
    public Bitmap f493j;

    public AP1(Context context) {
        this.f484a = context;
        this.f492i = new C41302g30(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C51196wk4.amu_text_bubble, (ViewGroup) null);
        this.f485b = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        this.f486c = rotationLayout;
        TextView textView = (TextView) rotationLayout.findViewById(C34029Ki4.amu_text);
        this.f487d = textView;
        this.f488e = textView;
        m115820h(1);
    }

    /* renamed from: a */
    public static int m115827a(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        return i != 7 ? -1 : -30720;
                    }
                    return -6736948;
                }
                return -10053376;
            }
            return -16737844;
        }
        return -3407872;
    }

    /* renamed from: b */
    public static int m115826b(int i) {
        if (i != 3 && i != 4 && i != 5 && i != 6 && i != 7) {
            return C50613vl4.amu_Bubble_TextAppearance_Dark;
        }
        return C50613vl4.amu_Bubble_TextAppearance_Light;
    }

    /* renamed from: c */
    public Bitmap m115825c() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f485b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = this.f485b.getMeasuredWidth();
        int measuredHeight = this.f485b.getMeasuredHeight();
        this.f485b.layout(0, 0, measuredWidth, measuredHeight);
        int i = this.f489f;
        if (i == 1 || i == 3) {
            measuredHeight = this.f485b.getMeasuredWidth();
            measuredWidth = this.f485b.getMeasuredHeight();
        }
        Bitmap bitmap = this.f493j;
        if (bitmap != null && bitmap.getHeight() == measuredHeight && this.f493j.getWidth() == measuredWidth) {
            this.f493j.eraseColor(0);
        } else {
            this.f493j = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(this.f493j);
        int i2 = this.f489f;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    canvas.translate(0.0f, measuredHeight);
                    canvas.rotate(270.0f);
                }
            } else {
                canvas.rotate(180.0f, measuredWidth / 2, measuredHeight / 2);
            }
        } else {
            canvas.translate(measuredWidth, 0.0f);
            canvas.rotate(90.0f);
        }
        this.f485b.draw(canvas);
        return this.f493j;
    }

    /* renamed from: d */
    public Bitmap m115824d(CharSequence charSequence) {
        TextView textView = this.f487d;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return m115825c();
    }

    /* renamed from: e */
    public void m115823e(Drawable drawable) {
        this.f485b.setBackgroundDrawable(drawable);
        if (drawable != null) {
            Rect rect = new Rect();
            drawable.getPadding(rect);
            this.f485b.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            return;
        }
        this.f485b.setPadding(0, 0, 0, 0);
    }

    /* renamed from: f */
    public void m115822f(int i) {
        this.f492i.m40249a(i);
        m115823e(this.f492i);
    }

    /* renamed from: g */
    public void m115821g(View view) {
        TextView textView;
        this.f486c.removeAllViews();
        this.f486c.addView(view);
        this.f488e = view;
        View findViewById = this.f486c.findViewById(C34029Ki4.amu_text);
        if (findViewById instanceof TextView) {
            textView = (TextView) findViewById;
        } else {
            textView = null;
        }
        this.f487d = textView;
    }

    /* renamed from: h */
    public void m115820h(int i) {
        m115822f(m115827a(i));
        m115818j(this.f484a, m115826b(i));
    }

    /* renamed from: i */
    public void m115819i(int i) {
        m115818j(this.f484a, i);
    }

    /* renamed from: j */
    public void m115818j(Context context, int i) {
        TextView textView = this.f487d;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }
}
