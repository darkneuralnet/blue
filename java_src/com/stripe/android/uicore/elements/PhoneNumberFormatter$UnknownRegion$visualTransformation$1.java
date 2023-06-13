package com.stripe.android.uicore.elements;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, m28432d2 = {"LDf;", Entry.TYPE_TEXT, "LA96;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PhoneNumberFormatter$UnknownRegion$visualTransformation$1 implements InterfaceC32735Eu6 {
    public static final PhoneNumberFormatter$UnknownRegion$visualTransformation$1 INSTANCE = new PhoneNumberFormatter$UnknownRegion$visualTransformation$1();

    @Override // p000.InterfaceC32735Eu6
    public final A96 filter(C1577Df text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String m110052j = text.m110052j();
        return new A96(new C1577Df("+" + m110052j, null, null, 6, null), new InterfaceC33290He3() { // from class: com.stripe.android.uicore.elements.PhoneNumberFormatter$UnknownRegion$visualTransformation$1$filter$1
            @Override // p000.InterfaceC33290He3
            public int originalToTransformed(int i) {
                return i + 1;
            }

            @Override // p000.InterfaceC33290He3
            public int transformedToOriginal(int i) {
                return Math.max(i - 1, 0);
            }
        });
    }
}
