package dev.b3nedikt.reword.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J$\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\u0013"}, m28432d2 = {"Ldev/b3nedikt/reword/views/RewordTabLayout;", "Lcom/google/android/material/tabs/TabLayout;", "Landroid/view/View;", "child", "", "addView", "", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "d0", "c0", "f0", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "reword_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class RewordTabLayout extends TabLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewordTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m43948e0(RewordTabLayout rewordTabLayout, View view, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = rewordTabLayout.m48813E() - 1;
        }
        rewordTabLayout.m43949d0(view, i);
    }

    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        m43948e0(this, view, 0, 2, null);
    }

    /* renamed from: c0 */
    public final void m43950c0(View view, int i) {
        TabLayout.TabView tabView;
        Object obj;
        TabLayout.C17910g m48814D = m48814D(i);
        if (m48814D != null && (tabView = m48814D.f73520i) != null) {
            int i2 = C35415Qg4.view_tag;
            if (view != null) {
                obj = view.getTag(i2);
            } else {
                obj = null;
            }
            tabView.setTag(i2, obj);
        }
    }

    /* renamed from: d0 */
    public final void m43949d0(View view, int i) {
        m43950c0(view, i);
        m43947f0(view, i);
    }

    /* renamed from: f0 */
    public final void m43947f0(View view, int i) {
        RewordTabItem rewordTabItem;
        TabLayout.C17910g m48814D;
        Integer num = null;
        if (view instanceof RewordTabItem) {
            rewordTabItem = (RewordTabItem) view;
        } else {
            rewordTabItem = null;
        }
        if (rewordTabItem != null) {
            num = rewordTabItem.m43951a();
        }
        if (num != null && (m48814D = m48814D(i)) != null) {
            m48814D.m48705r(getContext().getResources().getText(num.intValue()));
        }
    }

    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        super.addView(view, i);
        m43949d0(view, i);
    }

    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        m43948e0(this, view, 0, 2, null);
    }

    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        m43949d0(view, i);
    }
}
