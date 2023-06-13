package com.stripe.android.financialconnections.features.institutionpicker;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Ltn2;", "", "it", "LdE1;", "invoke-_-orMbw", "(Ltn2;I)J", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$3\n*L\n1#1,493:1\n*E\n"})
/* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1$invoke$$inlined$items$default$3 */
/* loaded from: classes7.dex */
public final class C18755xca5b181c extends Lambda implements Function2<InterfaceC49446tn2, Integer, C39631dE1> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function2 $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18755xca5b181c(Function2 function2, List list) {
        super(2);
        this.$span = function2;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ C39631dE1 invoke(InterfaceC49446tn2 interfaceC49446tn2, Integer num) {
        return C39631dE1.m44518a(m116389invoke_orMbw(interfaceC49446tn2, num.intValue()));
    }

    /* renamed from: invoke-_-orMbw  reason: not valid java name */
    public final long m116389invoke_orMbw(InterfaceC49446tn2 interfaceC49446tn2, int i) {
        Intrinsics.checkNotNullParameter(interfaceC49446tn2, "$this$null");
        return ((C39631dE1) this.$span.invoke(interfaceC49446tn2, this.$items.get(i))).m44512g();
    }
}
