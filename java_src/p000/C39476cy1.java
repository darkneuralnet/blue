package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.AbstractC11673f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
/* renamed from: cy1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C39476cy1 {

    /* renamed from: a */
    public final AbstractC11673f<?> f75906a;

    public C39476cy1(AbstractC11673f<?> abstractC11673f) {
        this.f75906a = abstractC11673f;
    }

    /* renamed from: b */
    public static C39476cy1 m44789b(AbstractC11673f<?> abstractC11673f) {
        return new C39476cy1((AbstractC11673f) HZ3.m103730h(abstractC11673f, "callbacks == null"));
    }

    /* renamed from: a */
    public void m44790a(Fragment fragment) {
        AbstractC11673f<?> abstractC11673f = this.f75906a;
        abstractC11673f.f54713f.m67317o(abstractC11673f, abstractC11673f, fragment);
    }

    /* renamed from: c */
    public void m44788c() {
        this.f75906a.f54713f.m67421A();
    }

    /* renamed from: d */
    public boolean m44787d(MenuItem menuItem) {
        return this.f75906a.f54713f.m67412D(menuItem);
    }

    /* renamed from: e */
    public void m44786e() {
        this.f75906a.f54713f.m67409E();
    }

    /* renamed from: f */
    public void m44785f() {
        this.f75906a.f54713f.m67403G();
    }

    /* renamed from: g */
    public void m44784g() {
        this.f75906a.f54713f.m67381P();
    }

    /* renamed from: h */
    public void m44783h() {
        this.f75906a.f54713f.m67373T();
    }

    /* renamed from: i */
    public void m44782i() {
        this.f75906a.f54713f.m67371U();
    }

    /* renamed from: j */
    public void m44781j() {
        this.f75906a.f54713f.m67367W();
    }

    /* renamed from: k */
    public boolean m44780k() {
        return this.f75906a.f54713f.m67349d0(true);
    }

    /* renamed from: l */
    public FragmentManager m44779l() {
        return this.f75906a.f54713f;
    }

    /* renamed from: m */
    public void m44778m() {
        this.f75906a.f54713f.m67345e1();
    }

    /* renamed from: n */
    public View m44777n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f75906a.f54713f.m67417B0().onCreateView(view, str, context, attributeSet);
    }
}
