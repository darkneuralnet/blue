package com.stripe.android.financialconnections.features.manualentry;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ManualEntryInputValidator$isUSRoutingNumber$usRoutingFactor$1 extends Lambda implements Function1<Integer, Integer> {
    public static final ManualEntryInputValidator$isUSRoutingNumber$usRoutingFactor$1 INSTANCE = new ManualEntryInputValidator$isUSRoutingNumber$usRoutingFactor$1();

    public ManualEntryInputValidator$isUSRoutingNumber$usRoutingFactor$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Integer invoke(int i) {
        int i2 = 3;
        int i3 = i % 3;
        if (i3 != 0) {
            i2 = 1;
            if (i3 == 1) {
                i2 = 7;
            }
        }
        return Integer.valueOf(i2);
    }
}
