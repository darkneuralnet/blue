package com.stripe.android.uicore.elements;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class RowElementUIKt$RowElementUI$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ RowController $controller;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Set<IdentifierSpec> $hiddenIdentifiers;
    final /* synthetic */ IdentifierSpec $lastTextFieldIdentifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowElementUIKt$RowElementUI$2(boolean z, RowController rowController, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i) {
        super(2);
        this.$enabled = z;
        this.$controller = rowController;
        this.$hiddenIdentifiers = set;
        this.$lastTextFieldIdentifier = identifierSpec;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        RowElementUIKt.RowElementUI(this.$enabled, this.$controller, this.$hiddenIdentifiers, this.$lastTextFieldIdentifier, interfaceC32720Et0, this.$$changed | 1);
    }
}