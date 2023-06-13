package p000;

import android.view.View;
/* renamed from: as6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C38217as6 {

    /* renamed from: a */
    public final View f56473a;

    /* renamed from: b */
    public int f56474b;

    /* renamed from: c */
    public int f56475c;

    /* renamed from: d */
    public int f56476d;

    /* renamed from: e */
    public int f56477e;

    /* renamed from: f */
    public boolean f56478f = true;

    /* renamed from: g */
    public boolean f56479g = true;

    public C38217as6(View view) {
        this.f56473a = view;
    }

    /* renamed from: a */
    public void m65350a() {
        View view = this.f56473a;
        C38790bq6.m62483g0(view, this.f56476d - (view.getTop() - this.f56474b));
        View view2 = this.f56473a;
        C38790bq6.m62486f0(view2, this.f56477e - (view2.getLeft() - this.f56475c));
    }

    /* renamed from: b */
    public int m65349b() {
        return this.f56474b;
    }

    /* renamed from: c */
    public int m65348c() {
        return this.f56477e;
    }

    /* renamed from: d */
    public int m65347d() {
        return this.f56476d;
    }

    /* renamed from: e */
    public boolean m65346e() {
        return this.f56479g;
    }

    /* renamed from: f */
    public boolean m65345f() {
        return this.f56478f;
    }

    /* renamed from: g */
    public void m65344g() {
        this.f56474b = this.f56473a.getTop();
        this.f56475c = this.f56473a.getLeft();
    }

    /* renamed from: h */
    public void m65343h(boolean z) {
        this.f56479g = z;
    }

    /* renamed from: i */
    public boolean m65342i(int i) {
        if (this.f56479g && this.f56477e != i) {
            this.f56477e = i;
            m65350a();
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m65341j(int i) {
        if (this.f56478f && this.f56476d != i) {
            this.f56476d = i;
            m65350a();
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void m65340k(boolean z) {
        this.f56478f = z;
    }
}
