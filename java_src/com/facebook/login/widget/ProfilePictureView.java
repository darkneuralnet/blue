package com.facebook.login.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.AccessToken;
import p000.NX1;
/* loaded from: classes5.dex */
public class ProfilePictureView extends FrameLayout {

    /* renamed from: k */
    public static final String f69621k = "ProfilePictureView";

    /* renamed from: b */
    public String f69622b;

    /* renamed from: c */
    public int f69623c;

    /* renamed from: d */
    public int f69624d;

    /* renamed from: e */
    public boolean f69625e;

    /* renamed from: f */
    public Bitmap f69626f;

    /* renamed from: g */
    public ImageView f69627g;

    /* renamed from: h */
    public int f69628h;

    /* renamed from: i */
    public NX1 f69629i;

    /* renamed from: j */
    public Bitmap f69630j;

    /* renamed from: com.facebook.login.widget.ProfilePictureView$a */
    /* loaded from: classes5.dex */
    public class C17279a implements NX1.InterfaceC5601b {
        public C17279a() {
        }

        @Override // p000.NX1.InterfaceC5601b
        /* renamed from: a */
        public void mo52436a(QX1 qx1) {
            ProfilePictureView.this.m52442f(qx1);
        }
    }

    /* renamed from: com.facebook.login.widget.ProfilePictureView$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC17280b {
    }

    public ProfilePictureView(Context context) {
        super(context);
        this.f69623c = 0;
        this.f69624d = 0;
        this.f69625e = true;
        this.f69628h = -1;
        this.f69630j = null;
        m52445c(context);
    }

    /* renamed from: b */
    public final int m52446b(boolean z) {
        int i;
        if (TD0.m84203d(this)) {
            return 0;
        }
        try {
            int i2 = this.f69628h;
            if (i2 != -4) {
                if (i2 != -3) {
                    if (i2 != -2) {
                        if (i2 != -1 || !z) {
                            return 0;
                        }
                        i = C34704Nf4.com_facebook_profilepictureview_preset_size_normal;
                    } else {
                        i = C34704Nf4.com_facebook_profilepictureview_preset_size_small;
                    }
                } else {
                    i = C34704Nf4.com_facebook_profilepictureview_preset_size_normal;
                }
            } else {
                i = C34704Nf4.com_facebook_profilepictureview_preset_size_large;
            }
            return getResources().getDimensionPixelSize(i);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return 0;
        }
    }

    /* renamed from: c */
    public final void m52445c(Context context) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            removeAllViews();
            this.f69627g = new ImageView(context);
            this.f69627g.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f69627g.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            addView(this.f69627g);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: d */
    public final boolean m52444d() {
        return this.f69625e;
    }

    /* renamed from: e */
    public final void m52443e(AttributeSet attributeSet) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C35694Rl4.com_facebook_profile_picture_view);
            setPresetSize(obtainStyledAttributes.getInt(C35694Rl4.com_facebook_profile_picture_view_com_facebook_preset_size, -1));
            this.f69625e = obtainStyledAttributes.getBoolean(C35694Rl4.com_facebook_profile_picture_view_com_facebook_is_cropped, true);
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: f */
    public final void m52442f(QX1 qx1) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (qx1.m88436c() == this.f69629i) {
                this.f69629i = null;
                Bitmap m88438a = qx1.m88438a();
                Exception m88437b = qx1.m88437b();
                if (m88437b != null) {
                    C32992Fx2.m106221f(EnumC36034Sx2.REQUESTS, 6, f69621k, m88437b.toString());
                } else if (m88438a != null) {
                    m52438j(m88438a);
                    if (qx1.m88435d()) {
                        m52440h(false);
                    }
                }
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: g */
    public final void m52441g(boolean z) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            boolean m52437k = m52437k();
            String str = this.f69622b;
            if (str != null && str.length() != 0 && (this.f69624d != 0 || this.f69623c != 0)) {
                if (m52437k || z) {
                    m52440h(true);
                    return;
                }
                return;
            }
            m52439i();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: h */
    public final void m52440h(boolean z) {
        String str;
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (AccessToken.m52909o()) {
                str = AccessToken.m52920c().m52911m();
            } else {
                str = "";
            }
            NX1 m93803a = new NX1.C5600a(getContext(), NX1.m93805d(this.f69622b, this.f69624d, this.f69623c, str)).m93802b(z).m93800d(this).m93801c(new C17279a()).m93803a();
            NX1 nx1 = this.f69629i;
            if (nx1 != null) {
                C48695sX1.m14108c(nx1);
            }
            this.f69629i = m93803a;
            C48695sX1.m14106e(m93803a);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: i */
    public final void m52439i() {
        int i;
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            NX1 nx1 = this.f69629i;
            if (nx1 != null) {
                C48695sX1.m14108c(nx1);
            }
            if (this.f69630j == null) {
                if (m52444d()) {
                    i = C51156wg4.com_facebook_profile_picture_blank_square;
                } else {
                    i = C51156wg4.com_facebook_profile_picture_blank_portrait;
                }
                m52438j(BitmapFactory.decodeResource(getResources(), i));
                return;
            }
            m52437k();
            m52438j(Bitmap.createScaledBitmap(this.f69630j, this.f69624d, this.f69623c, false));
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: j */
    public final void m52438j(Bitmap bitmap) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            ImageView imageView = this.f69627g;
            if (imageView != null && bitmap != null) {
                this.f69626f = bitmap;
                imageView.setImageBitmap(bitmap);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: k */
    public final boolean m52437k() {
        if (TD0.m84203d(this)) {
            return false;
        }
        try {
            int height = getHeight();
            int width = getWidth();
            boolean z = true;
            if (width >= 1 && height >= 1) {
                int m52446b = m52446b(false);
                if (m52446b != 0) {
                    height = m52446b;
                    width = height;
                }
                if (width <= height) {
                    if (m52444d()) {
                        height = width;
                    } else {
                        height = 0;
                    }
                } else if (m52444d()) {
                    width = height;
                } else {
                    width = 0;
                }
                if (width == this.f69624d && height == this.f69623c) {
                    z = false;
                }
                this.f69624d = width;
                this.f69623c = height;
                return z;
            }
            return false;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f69629i = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m52441g(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        boolean z2 = true;
        if (View.MeasureSpec.getMode(i2) != 1073741824 && layoutParams.height == -2) {
            size = m52446b(true);
            i2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            z = true;
        } else {
            z = false;
        }
        if (View.MeasureSpec.getMode(i) != 1073741824 && layoutParams.width == -2) {
            size2 = m52446b(true);
            i = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        } else {
            z2 = z;
        }
        if (z2) {
            setMeasuredDimension(size2, size);
            measureChildren(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable.getClass() != Bundle.class) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("ProfilePictureView_superState"));
        this.f69622b = bundle.getString("ProfilePictureView_profileId");
        this.f69628h = bundle.getInt("ProfilePictureView_presetSize");
        this.f69625e = bundle.getBoolean("ProfilePictureView_isCropped");
        this.f69624d = bundle.getInt("ProfilePictureView_width");
        this.f69623c = bundle.getInt("ProfilePictureView_height");
        m52441g(true);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ProfilePictureView_superState", onSaveInstanceState);
        bundle.putString("ProfilePictureView_profileId", this.f69622b);
        bundle.putInt("ProfilePictureView_presetSize", this.f69628h);
        bundle.putBoolean("ProfilePictureView_isCropped", this.f69625e);
        bundle.putInt("ProfilePictureView_width", this.f69624d);
        bundle.putInt("ProfilePictureView_height", this.f69623c);
        if (this.f69629i != null) {
            z = true;
        } else {
            z = false;
        }
        bundle.putBoolean("ProfilePictureView_refresh", z);
        return bundle;
    }

    public final void setCropped(boolean z) {
        this.f69625e = z;
        m52441g(false);
    }

    public final void setDefaultProfilePicture(Bitmap bitmap) {
        this.f69630j = bitmap;
    }

    public final void setOnErrorListener(InterfaceC17280b interfaceC17280b) {
    }

    public final void setPresetSize(int i) {
        if (i != -4 && i != -3 && i != -2 && i != -1) {
            throw new IllegalArgumentException("Must use a predefined preset size");
        }
        this.f69628h = i;
        requestLayout();
    }

    public final void setProfileId(String str) {
        boolean z;
        if (!C52364yi6.m2860R(this.f69622b) && this.f69622b.equalsIgnoreCase(str)) {
            z = false;
        } else {
            m52439i();
            z = true;
        }
        this.f69622b = str;
        m52441g(z);
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69623c = 0;
        this.f69624d = 0;
        this.f69625e = true;
        this.f69628h = -1;
        this.f69630j = null;
        m52445c(context);
        m52443e(attributeSet);
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f69623c = 0;
        this.f69624d = 0;
        this.f69625e = true;
        this.f69628h = -1;
        this.f69630j = null;
        m52445c(context);
        m52443e(attributeSet);
    }
}
