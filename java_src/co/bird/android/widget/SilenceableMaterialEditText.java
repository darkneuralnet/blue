package co.bird.android.widget;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.textfield.TextInputEditText;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0014\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0014\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/widget/SilenceableMaterialEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "Landroid/text/TextWatcher;", "watcher", "", "addTextChangedListener", "removeTextChangedListener", "", Entry.TYPE_TEXT, "Landroid/widget/TextView$BufferType;", "type", "", "notifyObservers", "setText", "LWt0;", "b", "LWt0;", "compositeWatcher", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SilenceableMaterialEditText extends TextInputEditText {

    /* renamed from: b */
    public C36932Wt0 f67657b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SilenceableMaterialEditText(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        if (this.f67657b == null) {
            C36932Wt0 c36932Wt0 = new C36932Wt0();
            this.f67657b = c36932Wt0;
            super.addTextChangedListener(c36932Wt0);
        }
        C36932Wt0 c36932Wt02 = this.f67657b;
        Intrinsics.checkNotNull(c36932Wt02);
        c36932Wt02.m77748a(watcher);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        C36932Wt0 c36932Wt0 = this.f67657b;
        if (c36932Wt0 != null) {
            c36932Wt0.m77747b(watcher);
        }
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType, boolean z) {
        C36932Wt0 c36932Wt0 = this.f67657b;
        if (c36932Wt0 != null) {
            c36932Wt0.m77746c(z);
        }
        super.setText(charSequence, bufferType);
        C36932Wt0 c36932Wt02 = this.f67657b;
        if (c36932Wt02 != null) {
            c36932Wt02.m77746c(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SilenceableMaterialEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SilenceableMaterialEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
