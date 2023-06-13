package com.stripe.android.paymentsheet.p047ui;

import android.graphics.Typeface;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt$EditButton$1 */
/* loaded from: classes7.dex */
public final class PaymentSheetTopBarKt$EditButton$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $editButtonFontSize;
    final /* synthetic */ Typeface $editButtonTypeface;
    final /* synthetic */ int $labelResourceId;
    final /* synthetic */ long $tintColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetTopBarKt$EditButton$1(int i, int i2, long j, long j2, Typeface typeface) {
        super(2);
        this.$labelResourceId = i;
        this.$$dirty = i2;
        this.$tintColor = j;
        this.$editButtonFontSize = j2;
        this.$editButtonTypeface = typeface;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1983637009, i, -1, "com.stripe.android.paymentsheet.ui.EditButton.<anonymous> (PaymentSheetTopBar.kt:139)");
        }
        String upperCase = C40946fS5.m41310c(this.$labelResourceId, interfaceC32720Et0, this.$$dirty & 14).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        long j = this.$tintColor;
        long j2 = this.$editButtonFontSize;
        Typeface editButtonTypeface = this.$editButtonTypeface;
        Intrinsics.checkNotNullExpressionValue(editButtonTypeface, "editButtonTypeface");
        C38909c26.m62000e(upperCase, null, j, j2, null, null, C9434Xd.m76752a(editButtonTypeface), 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et0, this.$$dirty & 896, 0, 65458);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
