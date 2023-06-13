package com.braze.p028ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import com.appboy.p027ui.R$id;
/* renamed from: com.braze.ui.inappmessage.views.InAppMessageHtmlFullView */
/* loaded from: classes5.dex */
public class InAppMessageHtmlFullView extends InAppMessageHtmlBaseView {
    public InAppMessageHtmlFullView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p000.EO1
    public void applyWindowInsets(DB6 db6) {
    }

    @Override // com.braze.p028ui.inappmessage.views.InAppMessageHtmlBaseView
    public int getWebViewViewId() {
        return R$id.com_braze_inappmessage_html_full_webview;
    }

    @Override // p000.EO1
    public boolean hasAppliedWindowInsets() {
        return true;
    }
}
