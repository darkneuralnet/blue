package com.afollestad.materialdialogs.internal.message;

import com.afollestad.materialdialogs.C16848R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class DialogContentLayout$frameHorizontalMargin$2 extends Lambda implements Function0<Integer> {
    final /* synthetic */ DialogContentLayout this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogContentLayout$frameHorizontalMargin$2(DialogContentLayout dialogContentLayout) {
        super(0);
        this.this$0 = dialogContentLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Integer invoke() {
        return Integer.valueOf(invoke2());
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final int invoke2() {
        return this.this$0.getResources().getDimensionPixelSize(C16848R.dimen.md_dialog_frame_margin_horizontal);
    }
}
