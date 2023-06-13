package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
/* renamed from: ci */
/* loaded from: classes.dex */
public class C13649ci {

    /* renamed from: a */
    public final CompoundButton f61082a;

    /* renamed from: b */
    public ColorStateList f61083b = null;

    /* renamed from: c */
    public PorterDuff.Mode f61084c = null;

    /* renamed from: d */
    public boolean f61085d = false;

    /* renamed from: e */
    public boolean f61086e = false;

    /* renamed from: f */
    public boolean f61087f;

    public C13649ci(CompoundButton compoundButton) {
        this.f61082a = compoundButton;
    }

    /* renamed from: a */
    public void m61038a() {
        Drawable m13546a = C48921su0.m13546a(this.f61082a);
        if (m13546a != null) {
            if (this.f61085d || this.f61086e) {
                Drawable mutate = P61.m90834r(m13546a).mutate();
                if (this.f61085d) {
                    P61.m90837o(mutate, this.f61083b);
                }
                if (this.f61086e) {
                    P61.m90836p(mutate, this.f61084c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f61082a.getDrawableState());
                }
                this.f61082a.setButtonDrawable(mutate);
            }
        }
    }

    /* renamed from: b */
    public int m61037b(int i) {
        return i;
    }

    /* renamed from: c */
    public ColorStateList m61036c() {
        return this.f61083b;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m61035d(AttributeSet attributeSet, int i) {
        boolean z;
        int i2;
        int i3;
        int m73755n;
        int m73755n2;
        Context context = this.f61082a.getContext();
        int[] iArr = C43509jm4.CompoundButton;
        Z46 m73747v = Z46.m73747v(context, attributeSet, iArr, i, 0);
        CompoundButton compoundButton = this.f61082a;
        C38790bq6.m62456t0(compoundButton, compoundButton.getContext(), iArr, attributeSet, m73747v.m73751r(), i, 0);
        try {
            int i4 = C43509jm4.CompoundButton_buttonCompat;
            if (m73747v.m73750s(i4) && (m73755n2 = m73747v.m73755n(i4, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f61082a;
                    compoundButton2.setButtonDrawable(C29611vi.m8248b(compoundButton2.getContext(), m73755n2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                }
                if (!z) {
                    int i5 = C43509jm4.CompoundButton_android_button;
                    if (m73747v.m73750s(i5) && (m73755n = m73747v.m73755n(i5, 0)) != 0) {
                        CompoundButton compoundButton3 = this.f61082a;
                        compoundButton3.setButtonDrawable(C29611vi.m8248b(compoundButton3.getContext(), m73755n));
                    }
                }
                i2 = C43509jm4.CompoundButton_buttonTint;
                if (m73747v.m73750s(i2)) {
                    C48921su0.m13543d(this.f61082a, m73747v.m73766c(i2));
                }
                i3 = C43509jm4.CompoundButton_buttonTintMode;
                if (m73747v.m73750s(i3)) {
                    C48921su0.m13542e(this.f61082a, C39565d71.m44598e(m73747v.m73758k(i3, -1), null));
                }
            }
            z = false;
            if (!z) {
            }
            i2 = C43509jm4.CompoundButton_buttonTint;
            if (m73747v.m73750s(i2)) {
            }
            i3 = C43509jm4.CompoundButton_buttonTintMode;
            if (m73747v.m73750s(i3)) {
            }
        } finally {
            m73747v.m73746w();
        }
    }

    /* renamed from: e */
    public void m61034e() {
        if (this.f61087f) {
            this.f61087f = false;
            return;
        }
        this.f61087f = true;
        m61038a();
    }

    /* renamed from: f */
    public void m61033f(ColorStateList colorStateList) {
        this.f61083b = colorStateList;
        this.f61085d = true;
        m61038a();
    }

    /* renamed from: g */
    public void m61032g(PorterDuff.Mode mode) {
        this.f61084c = mode;
        this.f61086e = true;
        m61038a();
    }
}
