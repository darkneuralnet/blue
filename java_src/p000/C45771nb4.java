package p000;

import androidx.recyclerview.widget.C11925l;
/* renamed from: nb4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45771nb4 {

    /* renamed from: a */
    public NU2 f100174a;

    /* renamed from: b */
    public EnumC41074fg1 f100175b;

    /* renamed from: c */
    public C32447Do6 f100176c;

    /* renamed from: d */
    public int f100177d = -1;

    /* renamed from: e */
    public G70 f100178e;

    /* renamed from: b */
    public static boolean m23482b(int i) {
        return i >= 0 && i < 8;
    }

    /* renamed from: a */
    public G70 m23483a() {
        return this.f100178e;
    }

    /* renamed from: c */
    public void m23481c(EnumC41074fg1 enumC41074fg1) {
        this.f100175b = enumC41074fg1;
    }

    /* renamed from: d */
    public void m23480d(int i) {
        this.f100177d = i;
    }

    /* renamed from: e */
    public void m23479e(G70 g70) {
        this.f100178e = g70;
    }

    /* renamed from: f */
    public void m23478f(NU2 nu2) {
        this.f100174a = nu2;
    }

    /* renamed from: g */
    public void m23477g(C32447Do6 c32447Do6) {
        this.f100176c = c32447Do6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f100174a);
        sb.append("\n ecLevel: ");
        sb.append(this.f100175b);
        sb.append("\n version: ");
        sb.append(this.f100176c);
        sb.append("\n maskPattern: ");
        sb.append(this.f100177d);
        if (this.f100178e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f100178e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
