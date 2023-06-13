package p000;

import android.content.Context;
import android.graphics.Color;
import kotlin.KotlinVersion;
/* renamed from: oa1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C46351oa1 {

    /* renamed from: f */
    public static final int f102153f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a */
    public final boolean f102154a;

    /* renamed from: b */
    public final int f102155b;

    /* renamed from: c */
    public final int f102156c;

    /* renamed from: d */
    public final int f102157d;

    /* renamed from: e */
    public final float f102158e;

    public C46351oa1(Context context) {
        this(BM2.m114084b(context, C49961uf4.elevationOverlayEnabled, false), HM2.m103954b(context, C49961uf4.elevationOverlayColor, 0), HM2.m103954b(context, C49961uf4.elevationOverlayAccentColor, 0), HM2.m103954b(context, C49961uf4.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: a */
    public float m20834a(float f) {
        float f2 = this.f102158e;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int m20833b(int i, float f) {
        int i2;
        float m20834a = m20834a(f);
        int alpha = Color.alpha(i);
        int m103947i = HM2.m103947i(C33827Jm0.m99845p(i, KotlinVersion.MAX_COMPONENT_VALUE), this.f102155b, m20834a);
        if (m20834a > 0.0f && (i2 = this.f102156c) != 0) {
            m103947i = HM2.m103948h(m103947i, C33827Jm0.m99845p(i2, f102153f));
        }
        return C33827Jm0.m99845p(m103947i, alpha);
    }

    /* renamed from: c */
    public int m20832c(int i, float f) {
        if (this.f102154a && m20829f(i)) {
            return m20833b(i, f);
        }
        return i;
    }

    /* renamed from: d */
    public int m20831d(float f) {
        return m20832c(this.f102157d, f);
    }

    /* renamed from: e */
    public boolean m20830e() {
        return this.f102154a;
    }

    /* renamed from: f */
    public final boolean m20829f(int i) {
        return C33827Jm0.m99845p(i, KotlinVersion.MAX_COMPONENT_VALUE) == this.f102157d;
    }

    public C46351oa1(boolean z, int i, int i2, int i3, float f) {
        this.f102154a = z;
        this.f102155b = i;
        this.f102156c = i2;
        this.f102157d = i3;
        this.f102158e = f;
    }
}
