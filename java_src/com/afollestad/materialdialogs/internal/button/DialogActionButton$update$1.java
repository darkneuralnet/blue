package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import com.afollestad.materialdialogs.C16848R;
import com.afollestad.materialdialogs.utils.MDUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class DialogActionButton$update$1 extends Lambda implements Function0<Integer> {
    final /* synthetic */ Context $appContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogActionButton$update$1(Context context) {
        super(0);
        this.$appContext = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Integer invoke() {
        return Integer.valueOf(invoke2());
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final int invoke2() {
        return MDUtil.resolveColor$default(MDUtil.INSTANCE, this.$appContext, null, Integer.valueOf(C16848R.attr.colorPrimary), null, 10, null);
    }
}
