package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes6.dex */
public class TabItem extends View {

    /* renamed from: b */
    public final CharSequence f73435b;

    /* renamed from: c */
    public final Drawable f73436c;

    /* renamed from: d */
    public final int f73437d;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Z46 m73748u = Z46.m73748u(context, attributeSet, C37098Xl4.TabItem);
        this.f73435b = m73748u.m73753p(C37098Xl4.TabItem_android_text);
        this.f73436c = m73748u.m73762g(C37098Xl4.TabItem_android_icon);
        this.f73437d = m73748u.m73755n(C37098Xl4.TabItem_android_layout, 0);
        m73748u.m73746w();
    }
}
