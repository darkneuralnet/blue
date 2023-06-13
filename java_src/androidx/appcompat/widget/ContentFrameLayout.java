package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b */
    public TypedValue f52165b;

    /* renamed from: c */
    public TypedValue f52166c;

    /* renamed from: d */
    public TypedValue f52167d;

    /* renamed from: e */
    public TypedValue f52168e;

    /* renamed from: f */
    public TypedValue f52169f;

    /* renamed from: g */
    public TypedValue f52170g;

    /* renamed from: h */
    public final Rect f52171h;

    /* renamed from: i */
    public InterfaceC11087a f52172i;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    /* loaded from: classes.dex */
    public interface InterfaceC11087a {
        /* renamed from: a */
        void mo69907a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public TypedValue m69913a() {
        if (this.f52169f == null) {
            this.f52169f = new TypedValue();
        }
        return this.f52169f;
    }

    /* renamed from: b */
    public TypedValue m69912b() {
        if (this.f52170g == null) {
            this.f52170g = new TypedValue();
        }
        return this.f52170g;
    }

    /* renamed from: c */
    public TypedValue m69911c() {
        if (this.f52167d == null) {
            this.f52167d = new TypedValue();
        }
        return this.f52167d;
    }

    /* renamed from: d */
    public TypedValue m69910d() {
        if (this.f52168e == null) {
            this.f52168e = new TypedValue();
        }
        return this.f52168e;
    }

    /* renamed from: e */
    public TypedValue m69909e() {
        if (this.f52165b == null) {
            this.f52165b = new TypedValue();
        }
        return this.f52165b;
    }

    /* renamed from: f */
    public TypedValue m69908f() {
        if (this.f52166c == null) {
            this.f52166c = new TypedValue();
        }
        return this.f52166c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC11087a interfaceC11087a = this.f52172i;
        if (interfaceC11087a != null) {
            interfaceC11087a.mo69907a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC11087a interfaceC11087a = this.f52172i;
        if (interfaceC11087a != null) {
            interfaceC11087a.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        int measuredWidth;
        TypedValue typedValue;
        int i3;
        int i4;
        float fraction;
        TypedValue typedValue2;
        int i5;
        int i6;
        float fraction2;
        TypedValue typedValue3;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z3 = true;
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            z = true;
        } else {
            z = false;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            if (z) {
                typedValue3 = this.f52168e;
            } else {
                typedValue3 = this.f52167d;
            }
            if (typedValue3 != null && (i7 = typedValue3.type) != 0) {
                if (i7 == 5) {
                    fraction3 = typedValue3.getDimension(displayMetrics);
                } else if (i7 == 6) {
                    int i9 = displayMetrics.widthPixels;
                    fraction3 = typedValue3.getFraction(i9, i9);
                } else {
                    i8 = 0;
                    if (i8 > 0) {
                        Rect rect = this.f52171h;
                        i = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z2 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            if (z) {
                                typedValue2 = this.f52169f;
                            } else {
                                typedValue2 = this.f52170g;
                            }
                            if (typedValue2 != null && (i5 = typedValue2.type) != 0) {
                                if (i5 == 5) {
                                    fraction2 = typedValue2.getDimension(displayMetrics);
                                } else if (i5 == 6) {
                                    int i10 = displayMetrics.heightPixels;
                                    fraction2 = typedValue2.getFraction(i10, i10);
                                } else {
                                    i6 = 0;
                                    if (i6 > 0) {
                                        Rect rect2 = this.f52171h;
                                        i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect2.top + rect2.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                                    }
                                }
                                i6 = (int) fraction2;
                                if (i6 > 0) {
                                }
                            }
                        }
                        super.onMeasure(i, i2);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z2 && mode == Integer.MIN_VALUE) {
                            if (!z) {
                                typedValue = this.f52166c;
                            } else {
                                typedValue = this.f52165b;
                            }
                            if (typedValue != null && (i3 = typedValue.type) != 0) {
                                if (i3 != 5) {
                                    fraction = typedValue.getDimension(displayMetrics);
                                } else if (i3 == 6) {
                                    int i11 = displayMetrics.widthPixels;
                                    fraction = typedValue.getFraction(i11, i11);
                                } else {
                                    i4 = 0;
                                    if (i4 > 0) {
                                        Rect rect3 = this.f52171h;
                                        i4 -= rect3.left + rect3.right;
                                    }
                                    if (measuredWidth < i4) {
                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                                        if (z3) {
                                            super.onMeasure(makeMeasureSpec, i2);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i4 = (int) fraction;
                                if (i4 > 0) {
                                }
                                if (measuredWidth < i4) {
                                }
                            }
                        }
                        z3 = false;
                        if (z3) {
                        }
                    }
                }
                i8 = (int) fraction3;
                if (i8 > 0) {
                }
            }
        }
        z2 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        super.onMeasure(i, i2);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z2) {
            if (!z) {
            }
            if (typedValue != null) {
                if (i3 != 5) {
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                }
                if (measuredWidth < i4) {
                }
            }
        }
        z3 = false;
        if (z3) {
        }
    }

    public void setAttachListener(InterfaceC11087a interfaceC11087a) {
        this.f52172i = interfaceC11087a;
    }

    public void setDecorPadding(int i, int i2, int i3, int i4) {
        this.f52171h.set(i, i2, i3, i4);
        if (C38790bq6.m62504Z(this)) {
            requestLayout();
        }
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52171h = new Rect();
    }
}
