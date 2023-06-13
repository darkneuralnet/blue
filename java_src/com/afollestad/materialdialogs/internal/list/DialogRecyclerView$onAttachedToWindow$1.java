package com.afollestad.materialdialogs.internal.list;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "invoke"}, m28431k = 3, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class DialogRecyclerView$onAttachedToWindow$1 extends Lambda implements Function1<DialogRecyclerView, Unit> {
    public static final DialogRecyclerView$onAttachedToWindow$1 INSTANCE = new DialogRecyclerView$onAttachedToWindow$1();

    public DialogRecyclerView$onAttachedToWindow$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DialogRecyclerView dialogRecyclerView) {
        invoke2(dialogRecyclerView);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DialogRecyclerView dialogRecyclerView) {
        dialogRecyclerView.invalidateDividers();
        dialogRecyclerView.invalidateOverScroll();
    }
}
