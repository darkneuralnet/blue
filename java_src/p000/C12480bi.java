package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
/* renamed from: bi */
/* loaded from: classes.dex */
public class C12480bi {

    /* renamed from: a */
    public final CheckedTextView f57924a;

    /* renamed from: b */
    public ColorStateList f57925b = null;

    /* renamed from: c */
    public PorterDuff.Mode f57926c = null;

    /* renamed from: d */
    public boolean f57927d = false;

    /* renamed from: e */
    public boolean f57928e = false;

    /* renamed from: f */
    public boolean f57929f;

    public C12480bi(CheckedTextView checkedTextView) {
        this.f57924a = checkedTextView;
    }

    /* renamed from: a */
    public void m64117a() {
        Drawable m9866a = C49987ui0.m9866a(this.f57924a);
        if (m9866a != null) {
            if (this.f57927d || this.f57928e) {
                Drawable mutate = P61.m90834r(m9866a).mutate();
                if (this.f57927d) {
                    P61.m90837o(mutate, this.f57925b);
                }
                if (this.f57928e) {
                    P61.m90836p(mutate, this.f57926c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f57924a.getDrawableState());
                }
                this.f57924a.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m64116b(AttributeSet attributeSet, int i) {
        boolean z;
        int i2;
        int i3;
        int m73755n;
        int m73755n2;
        Context context = this.f57924a.getContext();
        int[] iArr = C43509jm4.CheckedTextView;
        Z46 m73747v = Z46.m73747v(context, attributeSet, iArr, i, 0);
        CheckedTextView checkedTextView = this.f57924a;
        C38790bq6.m62456t0(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, m73747v.m73751r(), i, 0);
        try {
            int i4 = C43509jm4.CheckedTextView_checkMarkCompat;
            if (m73747v.m73750s(i4) && (m73755n2 = m73747v.m73755n(i4, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f57924a;
                    checkedTextView2.setCheckMarkDrawable(C29611vi.m8248b(checkedTextView2.getContext(), m73755n2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                }
                if (!z) {
                    int i5 = C43509jm4.CheckedTextView_android_checkMark;
                    if (m73747v.m73750s(i5) && (m73755n = m73747v.m73755n(i5, 0)) != 0) {
                        CheckedTextView checkedTextView3 = this.f57924a;
                        checkedTextView3.setCheckMarkDrawable(C29611vi.m8248b(checkedTextView3.getContext(), m73755n));
                    }
                }
                i2 = C43509jm4.CheckedTextView_checkMarkTint;
                if (m73747v.m73750s(i2)) {
                    C49987ui0.m9865b(this.f57924a, m73747v.m73766c(i2));
                }
                i3 = C43509jm4.CheckedTextView_checkMarkTintMode;
                if (m73747v.m73750s(i3)) {
                    C49987ui0.m9864c(this.f57924a, C39565d71.m44598e(m73747v.m73758k(i3, -1), null));
                }
            }
            z = false;
            if (!z) {
            }
            i2 = C43509jm4.CheckedTextView_checkMarkTint;
            if (m73747v.m73750s(i2)) {
            }
            i3 = C43509jm4.CheckedTextView_checkMarkTintMode;
            if (m73747v.m73750s(i3)) {
            }
        } finally {
            m73747v.m73746w();
        }
    }

    /* renamed from: c */
    public void m64115c() {
        if (this.f57929f) {
            this.f57929f = false;
            return;
        }
        this.f57929f = true;
        m64117a();
    }

    /* renamed from: d */
    public void m64114d(ColorStateList colorStateList) {
        this.f57925b = colorStateList;
        this.f57927d = true;
        m64117a();
    }

    /* renamed from: e */
    public void m64113e(PorterDuff.Mode mode) {
        this.f57926c = mode;
        this.f57928e = true;
        m64117a();
    }
}
