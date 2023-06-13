package com.afollestad.materialdialogs.internal.message;

import android.text.style.URLSpan;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lcom/afollestad/materialdialogs/internal/message/CustomUrlSpan;", "Landroid/text/style/URLSpan;", "url", "", "onLinkClick", "Lkotlin/Function1;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "onClick", "widget", "Landroid/view/View;", "core"}, m28431k = 1, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class CustomUrlSpan extends URLSpan {
    private final Function1<String, Unit> onLinkClick;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomUrlSpan(String str, Function1<? super String, Unit> function1) {
        super(str);
        this.onLinkClick = function1;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        Function1<String, Unit> function1 = this.onLinkClick;
        String url = getURL();
        Intrinsics.checkExpressionValueIsNotNull(url, "url");
        function1.invoke(url);
    }
}
