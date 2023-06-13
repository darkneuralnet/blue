package com.facebook.share.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
@Deprecated
/* loaded from: classes5.dex */
public class LikeBoxCountView extends FrameLayout {

    /* renamed from: b */
    public TextView f69663b;

    /* renamed from: c */
    public EnumC17292b f69664c;

    /* renamed from: d */
    public float f69665d;

    /* renamed from: e */
    public float f69666e;

    /* renamed from: f */
    public float f69667f;

    /* renamed from: g */
    public Paint f69668g;

    /* renamed from: h */
    public int f69669h;

    /* renamed from: i */
    public int f69670i;

    /* renamed from: com.facebook.share.internal.LikeBoxCountView$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C17291a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f69671a;

        static {
            int[] iArr = new int[EnumC17292b.values().length];
            f69671a = iArr;
            try {
                iArr[EnumC17292b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69671a[EnumC17292b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69671a[EnumC17292b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69671a[EnumC17292b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.facebook.share.internal.LikeBoxCountView$b */
    /* loaded from: classes5.dex */
    public enum EnumC17292b {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM
    }

    @Deprecated
    public LikeBoxCountView(Context context) {
        super(context);
        this.f69664c = EnumC17292b.LEFT;
        m52400b(context);
    }

    /* renamed from: a */
    public final void m52401a(Canvas canvas, float f, float f2, float f3, float f4) {
        Path path = new Path();
        float f5 = this.f69667f * 2.0f;
        float f6 = f + f5;
        float f7 = f2 + f5;
        path.addArc(new RectF(f, f2, f6, f7), -180.0f, 90.0f);
        if (this.f69664c == EnumC17292b.TOP) {
            float f8 = f3 - f;
            path.lineTo(((f8 - this.f69666e) / 2.0f) + f, f2);
            path.lineTo((f8 / 2.0f) + f, f2 - this.f69665d);
            path.lineTo(((f8 + this.f69666e) / 2.0f) + f, f2);
        }
        path.lineTo(f3 - this.f69667f, f2);
        float f9 = f3 - f5;
        path.addArc(new RectF(f9, f2, f3, f7), -90.0f, 90.0f);
        if (this.f69664c == EnumC17292b.RIGHT) {
            float f10 = f4 - f2;
            path.lineTo(f3, ((f10 - this.f69666e) / 2.0f) + f2);
            path.lineTo(this.f69665d + f3, (f10 / 2.0f) + f2);
            path.lineTo(f3, ((f10 + this.f69666e) / 2.0f) + f2);
        }
        path.lineTo(f3, f4 - this.f69667f);
        float f11 = f4 - f5;
        path.addArc(new RectF(f9, f11, f3, f4), 0.0f, 90.0f);
        if (this.f69664c == EnumC17292b.BOTTOM) {
            float f12 = f3 - f;
            path.lineTo(((this.f69666e + f12) / 2.0f) + f, f4);
            path.lineTo((f12 / 2.0f) + f, this.f69665d + f4);
            path.lineTo(((f12 - this.f69666e) / 2.0f) + f, f4);
        }
        path.lineTo(this.f69667f + f, f4);
        path.addArc(new RectF(f, f11, f6, f4), 90.0f, 90.0f);
        if (this.f69664c == EnumC17292b.LEFT) {
            float f13 = f4 - f2;
            path.lineTo(f, ((this.f69666e + f13) / 2.0f) + f2);
            path.lineTo(f - this.f69665d, (f13 / 2.0f) + f2);
            path.lineTo(f, ((f13 - this.f69666e) / 2.0f) + f2);
        }
        path.lineTo(f, f2 + this.f69667f);
        canvas.drawPath(path, this.f69668g);
    }

    /* renamed from: b */
    public final void m52400b(Context context) {
        setWillNotDraw(false);
        this.f69665d = getResources().getDimension(C34470Mf4.com_facebook_likeboxcountview_caret_height);
        this.f69666e = getResources().getDimension(C34470Mf4.com_facebook_likeboxcountview_caret_width);
        this.f69667f = getResources().getDimension(C34470Mf4.com_facebook_likeboxcountview_border_radius);
        Paint paint = new Paint();
        this.f69668g = paint;
        paint.setColor(getResources().getColor(C33300Hf4.com_facebook_likeboxcountview_border_color));
        this.f69668g.setStrokeWidth(getResources().getDimension(C34470Mf4.com_facebook_likeboxcountview_border_width));
        this.f69668g.setStyle(Paint.Style.STROKE);
        m52399c(context);
        addView(this.f69663b);
        setCaretPosition(this.f69664c);
    }

    /* renamed from: c */
    public final void m52399c(Context context) {
        this.f69663b = new TextView(context);
        this.f69663b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f69663b.setGravity(17);
        this.f69663b.setTextSize(0, getResources().getDimension(C34470Mf4.com_facebook_likeboxcountview_text_size));
        this.f69663b.setTextColor(getResources().getColor(C33300Hf4.com_facebook_likeboxcountview_text_color));
        this.f69669h = getResources().getDimensionPixelSize(C34470Mf4.com_facebook_likeboxcountview_text_padding);
        this.f69670i = getResources().getDimensionPixelSize(C34470Mf4.com_facebook_likeboxcountview_caret_height);
    }

    /* renamed from: d */
    public final void m52398d(int i, int i2, int i3, int i4) {
        TextView textView = this.f69663b;
        int i5 = this.f69669h;
        textView.setPadding(i + i5, i2 + i5, i3 + i5, i5 + i4);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int i = C17291a.f69671a[this.f69664c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        height = (int) (height - this.f69665d);
                    }
                } else {
                    width = (int) (width - this.f69665d);
                }
            } else {
                paddingTop = (int) (paddingTop + this.f69665d);
            }
        } else {
            paddingLeft = (int) (paddingLeft + this.f69665d);
        }
        m52401a(canvas, paddingLeft, paddingTop, width, height);
    }

    @Deprecated
    public void setCaretPosition(EnumC17292b enumC17292b) {
        this.f69664c = enumC17292b;
        int i = C17291a.f69671a[enumC17292b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        m52398d(0, 0, 0, this.f69670i);
                        return;
                    }
                    return;
                }
                m52398d(0, 0, this.f69670i, 0);
                return;
            }
            m52398d(0, this.f69670i, 0, 0);
            return;
        }
        m52398d(this.f69670i, 0, 0, 0);
    }

    @Deprecated
    public void setText(String str) {
        this.f69663b.setText(str);
    }
}
