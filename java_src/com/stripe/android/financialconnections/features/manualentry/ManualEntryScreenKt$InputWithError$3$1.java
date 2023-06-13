package com.stripe.android.financialconnections.features.manualentry;

import com.stripe.android.financialconnections.p041ui.components.TextFieldKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ManualEntryScreenKt$InputWithError$3$1 extends Lambda implements Function1<F16, Unit> {
    final /* synthetic */ Function1<String, Unit> $onInputChanged;
    final /* synthetic */ EX2<F16> $textValue$delegate;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$InputWithError$3$1$1 */
    /* loaded from: classes7.dex */
    public static final class C188301 extends Lambda implements Function1<Character, Boolean> {
        public static final C188301 INSTANCE = new C188301();

        public C188301() {
            super(1);
        }

        public final Boolean invoke(char c) {
            return Boolean.valueOf(Character.isDigit(c));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch2) {
            return invoke(ch2.charValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ManualEntryScreenKt$InputWithError$3$1(Function1<? super String, Unit> function1, EX2<F16> ex2) {
        super(1);
        this.$onInputChanged = function1;
        this.$textValue$delegate = ex2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(F16 f16) {
        invoke2(f16);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(F16 text) {
        F16 InputWithError$lambda$12;
        Intrinsics.checkNotNullParameter(text, "text");
        this.$textValue$delegate.setValue(TextFieldKt.filtered(text, C188301.INSTANCE));
        Function1<String, Unit> function1 = this.$onInputChanged;
        InputWithError$lambda$12 = ManualEntryScreenKt.InputWithError$lambda$12(this.$textValue$delegate);
        function1.invoke(InputWithError$lambda$12.m108102h());
    }
}
