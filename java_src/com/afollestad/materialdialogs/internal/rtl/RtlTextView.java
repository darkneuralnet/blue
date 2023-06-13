package com.afollestad.materialdialogs.internal.rtl;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.CoreConstants;
import com.afollestad.materialdialogs.utils.ViewsKt;
import kotlin.Metadata;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/afollestad/materialdialogs/internal/rtl/RtlTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, m28431k = 1, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class RtlTextView extends AppCompatTextView {
    public RtlTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewsKt.setGravityStartCompat(this);
    }
}
