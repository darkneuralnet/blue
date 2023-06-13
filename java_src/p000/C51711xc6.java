package p000;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.emoji2.text.C11605f;
/* renamed from: xc6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C51711xc6 {

    /* renamed from: d */
    public static final ThreadLocal<LT2> f117865d = new ThreadLocal<>();

    /* renamed from: a */
    public final int f117866a;

    /* renamed from: b */
    public final C11605f f117867b;

    /* renamed from: c */
    public volatile int f117868c = 0;

    public C51711xc6(C11605f c11605f, int i) {
        this.f117867b = c11605f;
        this.f117866a = i;
    }

    /* renamed from: a */
    public void m4946a(Canvas canvas, float f, float f2, Paint paint) {
        Typeface m67450g = this.f117867b.m67450g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(m67450g);
        canvas.drawText(this.f117867b.m67454c(), this.f117866a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* renamed from: b */
    public int m4945b(int i) {
        return m4940g().m96911h(i);
    }

    /* renamed from: c */
    public int m4944c() {
        return m4940g().m96910i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: d */
    public int m4943d() {
        return this.f117868c & 3;
    }

    /* renamed from: e */
    public int m4942e() {
        return m4940g().m96908k();
    }

    /* renamed from: f */
    public int m4941f() {
        return m4940g().m96907l();
    }

    /* renamed from: g */
    public final LT2 m4940g() {
        ThreadLocal<LT2> threadLocal = f117865d;
        LT2 lt2 = threadLocal.get();
        if (lt2 == null) {
            lt2 = new LT2();
            threadLocal.set(lt2);
        }
        this.f117867b.m67453d().m95287j(lt2, this.f117866a);
        return lt2;
    }

    /* renamed from: h */
    public short m4939h() {
        return m4940g().m96906m();
    }

    /* renamed from: i */
    public int m4938i() {
        return m4940g().m96905n();
    }

    /* renamed from: j */
    public boolean m4937j() {
        return m4940g().m96909j();
    }

    /* renamed from: k */
    public boolean m4936k() {
        return (this.f117868c & 4) > 0;
    }

    /* renamed from: l */
    public void m4935l(boolean z) {
        int m4943d = m4943d();
        if (z) {
            this.f117868c = m4943d | 4;
        } else {
            this.f117868c = m4943d;
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: m */
    public void m4934m(boolean z) {
        int i;
        int i2 = this.f117868c & 4;
        if (z) {
            i = i2 | 2;
        } else {
            i = i2 | 1;
        }
        this.f117868c = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(m4941f()));
        sb.append(", codepoints:");
        int m4944c = m4944c();
        for (int i = 0; i < m4944c; i++) {
            sb.append(Integer.toHexString(m4945b(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
