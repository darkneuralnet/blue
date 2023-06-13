package com.stripe.android.financialconnections.features.manualentry;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ManualEntryScreenKt$InputWithError$5 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $hint;
    final /* synthetic */ Pair<String, Integer> $inputWithError;
    final /* synthetic */ int $label;
    final /* synthetic */ Function0<Unit> $onFocusGained;
    final /* synthetic */ Function1<String, Unit> $onInputChanged;
    final /* synthetic */ String $testTag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ManualEntryScreenKt$InputWithError$5(Pair<String, Integer> pair, int i, String str, String str2, Function0<Unit> function0, Function1<? super String, Unit> function1, int i2) {
        super(2);
        this.$inputWithError = pair;
        this.$label = i;
        this.$testTag = str;
        this.$hint = str2;
        this.$onFocusGained = function0;
        this.$onInputChanged = function1;
        this.$$changed = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        ManualEntryScreenKt.InputWithError(this.$inputWithError, this.$label, this.$testTag, this.$hint, this.$onFocusGained, this.$onInputChanged, interfaceC32720Et0, this.$$changed | 1);
    }
}
