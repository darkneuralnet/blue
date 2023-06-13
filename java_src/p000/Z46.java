package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p000.C49785uM4;
/* renamed from: Z46 */
/* loaded from: classes.dex */
public class Z46 {

    /* renamed from: a */
    public final Context f47821a;

    /* renamed from: b */
    public final TypedArray f47822b;

    /* renamed from: c */
    public TypedValue f47823c;

    public Z46(Context context, TypedArray typedArray) {
        this.f47821a = context;
        this.f47822b = typedArray;
    }

    /* renamed from: t */
    public static Z46 m73749t(Context context, int i, int[] iArr) {
        return new Z46(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: u */
    public static Z46 m73748u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new Z46(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static Z46 m73747v(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new Z46(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean m73768a(int i, boolean z) {
        return this.f47822b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int m73767b(int i, int i2) {
        return this.f47822b.getColor(i, i2);
    }

    /* renamed from: c */
    public ColorStateList m73766c(int i) {
        int resourceId;
        ColorStateList m8249a;
        if (this.f47822b.hasValue(i) && (resourceId = this.f47822b.getResourceId(i, 0)) != 0 && (m8249a = C29611vi.m8249a(this.f47821a, resourceId)) != null) {
            return m8249a;
        }
        return this.f47822b.getColorStateList(i);
    }

    /* renamed from: d */
    public float m73765d(int i, float f) {
        return this.f47822b.getDimension(i, f);
    }

    /* renamed from: e */
    public int m73764e(int i, int i2) {
        return this.f47822b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int m73763f(int i, int i2) {
        return this.f47822b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: g */
    public Drawable m73762g(int i) {
        int resourceId;
        if (this.f47822b.hasValue(i) && (resourceId = this.f47822b.getResourceId(i, 0)) != 0) {
            return C29611vi.m8248b(this.f47821a, resourceId);
        }
        return this.f47822b.getDrawable(i);
    }

    /* renamed from: h */
    public Drawable m73761h(int i) {
        int resourceId;
        if (this.f47822b.hasValue(i) && (resourceId = this.f47822b.getResourceId(i, 0)) != 0) {
            return C27043oi.m20611b().m20609d(this.f47821a, resourceId, true);
        }
        return null;
    }

    /* renamed from: i */
    public float m73760i(int i, float f) {
        return this.f47822b.getFloat(i, f);
    }

    /* renamed from: j */
    public Typeface m73759j(int i, int i2, C49785uM4.AbstractC29183e abstractC29183e) {
        int resourceId = this.f47822b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f47823c == null) {
            this.f47823c = new TypedValue();
        }
        return C49785uM4.m10394i(this.f47821a, resourceId, this.f47823c, i2, abstractC29183e);
    }

    /* renamed from: k */
    public int m73758k(int i, int i2) {
        return this.f47822b.getInt(i, i2);
    }

    /* renamed from: l */
    public int m73757l(int i, int i2) {
        return this.f47822b.getInteger(i, i2);
    }

    /* renamed from: m */
    public int m73756m(int i, int i2) {
        return this.f47822b.getLayoutDimension(i, i2);
    }

    /* renamed from: n */
    public int m73755n(int i, int i2) {
        return this.f47822b.getResourceId(i, i2);
    }

    /* renamed from: o */
    public String m73754o(int i) {
        return this.f47822b.getString(i);
    }

    /* renamed from: p */
    public CharSequence m73753p(int i) {
        return this.f47822b.getText(i);
    }

    /* renamed from: q */
    public CharSequence[] m73752q(int i) {
        return this.f47822b.getTextArray(i);
    }

    /* renamed from: r */
    public TypedArray m73751r() {
        return this.f47822b;
    }

    /* renamed from: s */
    public boolean m73750s(int i) {
        return this.f47822b.hasValue(i);
    }

    /* renamed from: w */
    public void m73746w() {
        this.f47822b.recycle();
    }
}
