package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "LLn2;", "", "it", "", "invoke", "(LLn2;ILEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 InstitutionPickerScreen.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,423:1\n295#2:424\n296#2:432\n36#3:425\n1057#4,6:426\n*S KotlinDebug\n*F\n+ 1 InstitutionPickerScreen.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1\n*L\n295#1:425\n295#1:426,6\n*E\n"})
/* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$SearchInstitutionsList$1$1$invoke$$inlined$items$default$4 */
/* loaded from: classes7.dex */
public final class C18761x55655b7c extends Lambda implements Function4<InterfaceC34306Ln2, Integer, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ Function2 $onInstitutionSelected$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18761x55655b7c(List list, Function2 function2, int i) {
        super(4);
        this.$items = list;
        this.$onInstitutionSelected$inlined = function2;
        this.$$dirty$inlined = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC34306Ln2 interfaceC34306Ln2, Integer num, InterfaceC32720Et0 interfaceC32720Et0, Integer num2) {
        invoke(interfaceC34306Ln2, num.intValue(), interfaceC32720Et0, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC34306Ln2 items, int i, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i2 & 14) == 0) {
            i3 = (interfaceC32720Et0.mo89539n(items) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= interfaceC32720Et0.mo89527r(i) ? 32 : 16;
        }
        if ((i3 & 731) == 146 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
        }
        int i4 = i3 & 14;
        FinancialConnectionsInstitution financialConnectionsInstitution = (FinancialConnectionsInstitution) this.$items.get(i);
        interfaceC32720Et0.mo89638F(-1656119996);
        if ((i4 & 112) == 0) {
            i4 |= interfaceC32720Et0.mo89539n(financialConnectionsInstitution) ? 32 : 16;
        }
        if ((i4 & 721) == 144 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
        } else {
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n = interfaceC32720Et0.mo89539n(this.$onInstitutionSelected$inlined);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new InstitutionPickerScreenKt$SearchInstitutionsList$1$1$4$1$1(this.$onInstitutionSelected$inlined);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            InstitutionPickerScreenKt.InstitutionResultTile((Function1) mo89635G, financialConnectionsInstitution, interfaceC32720Et0, i4 & 112);
        }
        interfaceC32720Et0.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
