package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.search.SearchBar;
import java.util.LinkedHashSet;
import java.util.Set;
/* renamed from: oq5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C46515oq5 {

    /* renamed from: d */
    public Animator f102550d;

    /* renamed from: e */
    public Animator f102551e;

    /* renamed from: a */
    public final Set<Object> f102547a = new LinkedHashSet();

    /* renamed from: b */
    public final Set<AnimatorListenerAdapter> f102548b = new LinkedHashSet();

    /* renamed from: c */
    public final Set<AnimatorListenerAdapter> f102549c = new LinkedHashSet();

    /* renamed from: f */
    public boolean f102552f = true;

    /* renamed from: g */
    public Animator f102553g = null;

    /* renamed from: a */
    public void m20465a(boolean z) {
        this.f102552f = z;
    }

    /* renamed from: b */
    public void m20464b(SearchBar searchBar) {
        Animator animator = this.f102550d;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.f102551e;
        if (animator2 != null) {
            animator2.end();
        }
        View m49225l0 = searchBar.m49225l0();
        if (m49225l0 instanceof InterfaceC3723Ie) {
            ((InterfaceC3723Ie) m49225l0).m101853a();
        }
        if (m49225l0 != null) {
            m49225l0.setAlpha(0.0f);
        }
    }
}
