package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* renamed from: pm5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C47068pm5 {

    /* renamed from: a */
    public Context f104069a;

    /* renamed from: b */
    public int f104070b = -1;

    /* renamed from: c */
    public ViewGroup f104071c;

    /* renamed from: d */
    public View f104072d;

    /* renamed from: e */
    public Runnable f104073e;

    /* renamed from: f */
    public Runnable f104074f;

    public C47068pm5(ViewGroup viewGroup, View view) {
        this.f104071c = viewGroup;
        this.f104072d = view;
    }

    /* renamed from: c */
    public static C47068pm5 m18714c(ViewGroup viewGroup) {
        return (C47068pm5) viewGroup.getTag(C36351Ug4.transition_current_scene);
    }

    /* renamed from: f */
    public static void m18711f(ViewGroup viewGroup, C47068pm5 c47068pm5) {
        viewGroup.setTag(C36351Ug4.transition_current_scene, c47068pm5);
    }

    /* renamed from: a */
    public void m18716a() {
        if (this.f104070b > 0 || this.f104072d != null) {
            m18713d().removeAllViews();
            if (this.f104070b > 0) {
                LayoutInflater.from(this.f104069a).inflate(this.f104070b, this.f104071c);
            } else {
                this.f104071c.addView(this.f104072d);
            }
        }
        Runnable runnable = this.f104073e;
        if (runnable != null) {
            runnable.run();
        }
        m18711f(this.f104071c, this);
    }

    /* renamed from: b */
    public void m18715b() {
        Runnable runnable;
        if (m18714c(this.f104071c) == this && (runnable = this.f104074f) != null) {
            runnable.run();
        }
    }

    /* renamed from: d */
    public ViewGroup m18713d() {
        return this.f104071c;
    }

    /* renamed from: e */
    public boolean m18712e() {
        return this.f104070b > 0;
    }
}
