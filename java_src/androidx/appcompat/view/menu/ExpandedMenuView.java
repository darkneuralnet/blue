package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C11028e;
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C11028e.InterfaceC11030b, InterfaceC11039j, AdapterView.OnItemClickListener {

    /* renamed from: c */
    public static final int[] f51786c = {16842964, 16843049};

    /* renamed from: b */
    public C11028e f51787b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11039j
    /* renamed from: a */
    public void mo49346a(C11028e c11028e) {
        this.f51787b = c11028e;
    }

    @Override // androidx.appcompat.view.menu.C11028e.InterfaceC11030b
    /* renamed from: b */
    public boolean mo70000b(C11032g c11032g) {
        return this.f51787b.m70164N(c11032g, 0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo70000b((C11032g) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        Z46 m73747v = Z46.m73747v(context, attributeSet, f51786c, i, 0);
        if (m73747v.m73750s(0)) {
            setBackgroundDrawable(m73747v.m73762g(0));
        }
        if (m73747v.m73750s(1)) {
            setDivider(m73747v.m73762g(1));
        }
        m73747v.m73746w();
    }
}
