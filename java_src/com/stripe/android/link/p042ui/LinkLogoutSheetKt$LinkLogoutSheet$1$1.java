package com.stripe.android.link.p042ui;

import com.stripe.android.link.p042ui.LinkLogoutMenuItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.LinkLogoutSheetKt$LinkLogoutSheet$1$1 */
/* loaded from: classes7.dex */
public final class LinkLogoutSheetKt$LinkLogoutSheet$1$1 extends Lambda implements Function1<LinkLogoutMenuItem, Unit> {
    final /* synthetic */ Function0<Unit> $onCancelClick;
    final /* synthetic */ Function0<Unit> $onLogoutClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkLogoutSheetKt$LinkLogoutSheet$1$1(Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$onLogoutClick = function0;
        this.$onCancelClick = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LinkLogoutMenuItem linkLogoutMenuItem) {
        invoke2(linkLogoutMenuItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LinkLogoutMenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (Intrinsics.areEqual(item, LinkLogoutMenuItem.Logout.INSTANCE)) {
            this.$onLogoutClick.invoke();
        } else if (Intrinsics.areEqual(item, LinkLogoutMenuItem.Cancel.INSTANCE)) {
            this.$onCancelClick.invoke();
        }
    }
}
