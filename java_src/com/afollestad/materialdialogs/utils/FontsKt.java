package com.afollestad.materialdialogs.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;
import com.afollestad.materialdialogs.MaterialDialog;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import kotlin.Metadata;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0002\u001a+\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00072\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m28432d2 = {"safeGetFont", "Landroid/graphics/Typeface;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "res", "", PaymentSheetEvent.FIELD_FONT, "Lcom/afollestad/materialdialogs/MaterialDialog;", "attr", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/Integer;)Landroid/graphics/Typeface;", "core"}, m28431k = 2, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class FontsKt {
    public static final Typeface font(MaterialDialog materialDialog, Integer num, Integer num2) {
        MDUtil.INSTANCE.assertOneSet(PaymentSheetEvent.FIELD_FONT, num2, num);
        if (num != null) {
            return safeGetFont(materialDialog.getWindowContext(), num.intValue());
        }
        if (num2 != null) {
            TypedArray obtainStyledAttributes = materialDialog.getWindowContext().getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
            try {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId == 0) {
                    obtainStyledAttributes.recycle();
                    return null;
                }
                return safeGetFont(materialDialog.getWindowContext(), resourceId);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static /* synthetic */ Typeface font$default(MaterialDialog materialDialog, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        return font(materialDialog, num, num2);
    }

    private static final Typeface safeGetFont(Context context, int i) {
        try {
            return C49785uM4.m10395h(context, i);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
