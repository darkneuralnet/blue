package com.afollestad.materialdialogs;

import com.afollestad.materialdialogs.utils.ColorsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 1, 16})
/* renamed from: com.afollestad.materialdialogs.MaterialDialog$invalidateBackgroundColorAndRadius$backgroundColor$1 */
/* loaded from: classes.dex */
public final class C16847xc4691f22 extends Lambda implements Function0<Integer> {
    final /* synthetic */ MaterialDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16847xc4691f22(MaterialDialog materialDialog) {
        super(0);
        this.this$0 = materialDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Integer invoke() {
        return Integer.valueOf(invoke2());
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final int invoke2() {
        return ColorsKt.resolveColor$default(this.this$0, null, Integer.valueOf(C16848R.attr.colorBackgroundFloating), null, 5, null);
    }
}
