package com.braze.p028ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;
/* renamed from: com.braze.ui.inappmessage.views.InAppMessageWebView */
/* loaded from: classes5.dex */
public class InAppMessageWebView extends WebView {
    public InAppMessageWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isInTouchMode() && keyEvent.getKeyCode() == 4 && C42478i20.m35358s().m6655e()) {
            DZ1.m110187a();
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && C42478i20.m35358s().m6655e()) {
            DZ1.m110187a();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
