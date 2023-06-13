package com.afollestad.materialdialogs;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.afollestad.materialdialogs.utils.MDUtil;
import kotlin.Metadata;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\b"}, m28432d2 = {"inferTheme", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "dialogBehavior", "Lcom/afollestad/materialdialogs/DialogBehavior;", "inferThemeIsLight", "", "core"}, m28431k = 2, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class ThemeKt {
    public static final int inferTheme(Context context, DialogBehavior dialogBehavior) {
        return dialogBehavior.getThemeRes(!inferThemeIsLight(context));
    }

    public static final boolean inferThemeIsLight(Context context) {
        MDUtil mDUtil = MDUtil.INSTANCE;
        return MDUtil.isColorDark$default(mDUtil, MDUtil.resolveColor$default(mDUtil, context, null, 16842806, null, 10, null), 0.0d, 1, null);
    }
}
