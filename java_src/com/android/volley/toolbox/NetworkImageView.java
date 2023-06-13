package com.android.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.volley.VolleyError;
import p000.EM4;
/* loaded from: classes.dex */
public class NetworkImageView extends ImageView {

    /* renamed from: b */
    public String f68614b;

    /* renamed from: c */
    public int f68615c;

    /* renamed from: d */
    public Drawable f68616d;

    /* renamed from: e */
    public Bitmap f68617e;

    /* renamed from: f */
    public int f68618f;

    /* renamed from: g */
    public Drawable f68619g;

    /* renamed from: h */
    public Bitmap f68620h;

    /* renamed from: com.android.volley.toolbox.NetworkImageView$a */
    /* loaded from: classes.dex */
    public class C16935a implements EM4.InterfaceC1799a {

        /* renamed from: a */
        public final /* synthetic */ boolean f68621a;

        public C16935a(boolean z) {
            this.f68621a = z;
        }

        @Override // p000.EM4.InterfaceC1799a
        public void onErrorResponse(VolleyError volleyError) {
            if (NetworkImageView.this.f68618f != 0) {
                NetworkImageView networkImageView = NetworkImageView.this;
                networkImageView.setImageResource(networkImageView.f68618f);
            } else if (NetworkImageView.this.f68619g != null) {
                NetworkImageView networkImageView2 = NetworkImageView.this;
                networkImageView2.setImageDrawable(networkImageView2.f68619g);
            } else if (NetworkImageView.this.f68620h != null) {
                NetworkImageView networkImageView3 = NetworkImageView.this;
                networkImageView3.setImageBitmap(networkImageView3.f68620h);
            }
        }
    }

    public NetworkImageView(Context context) {
        this(context, null);
    }

    /* renamed from: d */
    public void m53502d(boolean z) {
        boolean z2;
        boolean z3;
        int width = getWidth();
        int height = getHeight();
        getScaleType();
        boolean z4 = true;
        if (getLayoutParams() != null) {
            if (getLayoutParams().width == -2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getLayoutParams().height == -2) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z2 = false;
            z3 = false;
        }
        if (!z2 || !z3) {
            z4 = false;
        }
        if (width == 0 && height == 0 && !z4) {
            return;
        }
        if (TextUtils.isEmpty(this.f68614b)) {
            m53501e();
        } else {
            new C16935a(z);
            throw null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    /* renamed from: e */
    public final void m53501e() {
        int i = this.f68615c;
        if (i != 0) {
            setImageResource(i);
            return;
        }
        Drawable drawable = this.f68616d;
        if (drawable != null) {
            setImageDrawable(drawable);
            return;
        }
        Bitmap bitmap = this.f68617e;
        if (bitmap != null) {
            setImageBitmap(bitmap);
        } else {
            setImageBitmap(null);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m53502d(true);
    }

    public void setDefaultImageBitmap(Bitmap bitmap) {
        this.f68615c = 0;
        this.f68616d = null;
        this.f68617e = bitmap;
    }

    public void setDefaultImageDrawable(Drawable drawable) {
        this.f68615c = 0;
        this.f68617e = null;
        this.f68616d = drawable;
    }

    public void setDefaultImageResId(int i) {
        this.f68617e = null;
        this.f68616d = null;
        this.f68615c = i;
    }

    public void setErrorImageBitmap(Bitmap bitmap) {
        this.f68618f = 0;
        this.f68619g = null;
        this.f68620h = bitmap;
    }

    public void setErrorImageDrawable(Drawable drawable) {
        this.f68618f = 0;
        this.f68620h = null;
        this.f68619g = drawable;
    }

    public void setErrorImageResId(int i) {
        this.f68620h = null;
        this.f68619g = null;
        this.f68618f = i;
    }

    public void setImageUrl(String str, AX1 ax1) {
        N36.m94404a();
        this.f68614b = str;
        m53502d(false);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
