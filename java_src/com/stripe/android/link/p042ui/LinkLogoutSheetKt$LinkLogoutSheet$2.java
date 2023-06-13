package com.stripe.android.link.p042ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.LinkLogoutSheetKt$LinkLogoutSheet$2 */
/* loaded from: classes7.dex */
public final class LinkLogoutSheetKt$LinkLogoutSheet$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $onCancelClick;
    final /* synthetic */ Function0<Unit> $onLogoutClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkLogoutSheetKt$LinkLogoutSheet$2(Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.$onLogoutClick = function0;
        this.$onCancelClick = function02;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        LinkLogoutSheetKt.LinkLogoutSheet(this.$onLogoutClick, this.$onCancelClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
