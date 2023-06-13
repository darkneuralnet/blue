package com.stripe.android.p049ui.core.elements;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, m28432d2 = {"LDf;", Entry.TYPE_TEXT, "LA96;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBsbConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BsbConfig.kt\ncom/stripe/android/ui/core/elements/BsbConfig$visualTransformation$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,102:1\n1183#2,3:103\n*S KotlinDebug\n*F\n+ 1 BsbConfig.kt\ncom/stripe/android/ui/core/elements/BsbConfig$visualTransformation$1\n*L\n40#1:103,3\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.BsbConfig$visualTransformation$1 */
/* loaded from: classes7.dex */
public final class BsbConfig$visualTransformation$1 implements InterfaceC32735Eu6 {
    public static final BsbConfig$visualTransformation$1 INSTANCE = new BsbConfig$visualTransformation$1();

    @Override // p000.InterfaceC32735Eu6
    public final A96 filter(C1577Df text) {
        Intrinsics.checkNotNullParameter(text, "text");
        StringBuilder sb = new StringBuilder();
        String m110052j = text.m110052j();
        int i = 0;
        int i2 = 0;
        while (i < m110052j.length()) {
            int i3 = i2 + 1;
            sb.append(m110052j.charAt(i));
            if (i2 == 2) {
                sb.append(" - ");
            }
            i++;
            i2 = i3;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "output.toString()");
        return new A96(new C1577Df(sb2, null, null, 6, null), new InterfaceC33290He3() { // from class: com.stripe.android.ui.core.elements.BsbConfig$visualTransformation$1$filter$2
            @Override // p000.InterfaceC33290He3
            public int originalToTransformed(int i4) {
                return i4 <= 2 ? i4 : i4 + r1.length();
            }

            @Override // p000.InterfaceC33290He3
            public int transformedToOriginal(int i4) {
                return i4 <= 3 ? i4 : i4 - r1.length();
            }
        });
    }
}
