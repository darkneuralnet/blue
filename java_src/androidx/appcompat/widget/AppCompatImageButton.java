package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {

    /* renamed from: b */
    public final C10331Zh f52122b;

    /* renamed from: c */
    public final C28369si f52123c;

    /* renamed from: d */
    public boolean f52124d;

    public AppCompatImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C10331Zh c10331Zh = this.f52122b;
        if (c10331Zh != null) {
            c10331Zh.m72690b();
        }
        C28369si c28369si = this.f52123c;
        if (c28369si != null) {
            c28369si.m13815c();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f52123c.m13814d() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C10331Zh c10331Zh = this.f52122b;
        if (c10331Zh != null) {
            c10331Zh.m72686f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C10331Zh c10331Zh = this.f52122b;
        if (c10331Zh != null) {
            c10331Zh.m72685g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C28369si c28369si = this.f52123c;
        if (c28369si != null) {
            c28369si.m13815c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C28369si c28369si = this.f52123c;
        if (c28369si != null && drawable != null && !this.f52124d) {
            c28369si.m13812f(drawable);
        }
        super.setImageDrawable(drawable);
        C28369si c28369si2 = this.f52123c;
        if (c28369si2 != null) {
            c28369si2.m13815c();
            if (!this.f52124d) {
                this.f52123c.m13816b();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f52124d = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f52123c.m13811g(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C28369si c28369si = this.f52123c;
        if (c28369si != null) {
            c28369si.m13815c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C10331Zh c10331Zh = this.f52122b;
        if (c10331Zh != null) {
            c10331Zh.m72683i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C10331Zh c10331Zh = this.f52122b;
        if (c10331Zh != null) {
            c10331Zh.m72682j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C28369si c28369si = this.f52123c;
        if (c28369si != null) {
            c28369si.m13810h(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C28369si c28369si = this.f52123c;
        if (c28369si != null) {
            c28369si.m13809i(mode);
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C50553vf4.imageButtonStyle);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(W46.m78859b(context), attributeSet, i);
        this.f52124d = false;
        C46645p36.m20010a(this, getContext());
        C10331Zh c10331Zh = new C10331Zh(this);
        this.f52122b = c10331Zh;
        c10331Zh.m72687e(attributeSet, i);
        C28369si c28369si = new C28369si(this);
        this.f52123c = c28369si;
        c28369si.m13813e(attributeSet, i);
    }
}
