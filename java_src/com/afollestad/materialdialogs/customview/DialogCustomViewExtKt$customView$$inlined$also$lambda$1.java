package com.afollestad.materialdialogs.customview;

import android.view.View;
import com.afollestad.materialdialogs.MaterialDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, m28432d2 = {"<anonymous>", "", "Landroid/view/View;", "invoke", "com/afollestad/materialdialogs/customview/DialogCustomViewExtKt$customView$1$1"}, m28431k = 3, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class DialogCustomViewExtKt$customView$$inlined$also$lambda$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ boolean $dialogWrapContent$inlined;
    final /* synthetic */ MaterialDialog $this_customView$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogCustomViewExtKt$customView$$inlined$also$lambda$1(MaterialDialog materialDialog, boolean z) {
        super(1);
        this.$this_customView$inlined = materialDialog;
        this.$dialogWrapContent$inlined = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view) {
        MaterialDialog.maxWidth$default(this.$this_customView$inlined, null, Integer.valueOf(view.getMeasuredWidth()), 1, null);
    }
}