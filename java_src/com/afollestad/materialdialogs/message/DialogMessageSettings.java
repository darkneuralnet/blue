package com.afollestad.materialdialogs.message;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.afollestad.materialdialogs.C16848R;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.internal.message.LinkTransformationMethod;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J-\u0010\f\u001a\u00020\u00002%\b\u0002\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000eJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J%\u0010\u0017\u001a\u00020\u00132\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b*\u0004\u0018\u00010\u001b2\u0006\u0010\t\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001f"}, m28432d2 = {"Lcom/afollestad/materialdialogs/message/DialogMessageSettings;", "", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "messageTextView", "Landroid/widget/TextView;", "(Lcom/afollestad/materialdialogs/MaterialDialog;Landroid/widget/TextView;)V", "didSetLineSpacing", "", "isHtml", "getMessageTextView", "()Landroid/widget/TextView;", "html", "onLinkClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "link", "", "lineSpacing", "multiplier", "", "setText", "res", "", Entry.TYPE_TEXT, "", "setText$core", "(Ljava/lang/Integer;Ljava/lang/CharSequence;)V", "maybeWrapHtml", "core"}, m28431k = 1, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class DialogMessageSettings {
    private final MaterialDialog dialog;
    private boolean didSetLineSpacing;
    private boolean isHtml;
    private final TextView messageTextView;

    public DialogMessageSettings(MaterialDialog materialDialog, TextView textView) {
        this.dialog = materialDialog;
        this.messageTextView = textView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialogMessageSettings html$default(DialogMessageSettings dialogMessageSettings, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return dialogMessageSettings.html(function1);
    }

    private final CharSequence maybeWrapHtml(CharSequence charSequence, boolean z) {
        if (charSequence == null) {
            return null;
        }
        return z ? Html.fromHtml(charSequence.toString()) : charSequence;
    }

    public final TextView getMessageTextView() {
        return this.messageTextView;
    }

    public final DialogMessageSettings html(Function1<? super String, Unit> function1) {
        this.isHtml = true;
        if (function1 != null) {
            this.messageTextView.setTransformationMethod(new LinkTransformationMethod(function1));
        }
        this.messageTextView.setMovementMethod(LinkMovementMethod.getInstance());
        return this;
    }

    public final DialogMessageSettings lineSpacing(float f) {
        this.didSetLineSpacing = true;
        this.messageTextView.setLineSpacing(0.0f, f);
        return this;
    }

    public final void setText$core(Integer num, CharSequence charSequence) {
        if (!this.didSetLineSpacing) {
            lineSpacing(MDUtil.INSTANCE.resolveFloat(this.dialog.getWindowContext(), C16848R.attr.md_line_spacing_body, 1.1f));
        }
        TextView textView = this.messageTextView;
        CharSequence maybeWrapHtml = maybeWrapHtml(charSequence, this.isHtml);
        if (maybeWrapHtml == null) {
            maybeWrapHtml = MDUtil.resolveString$default(MDUtil.INSTANCE, this.dialog, num, (Integer) null, this.isHtml, 4, (Object) null);
        }
        textView.setText(maybeWrapHtml);
    }
}
