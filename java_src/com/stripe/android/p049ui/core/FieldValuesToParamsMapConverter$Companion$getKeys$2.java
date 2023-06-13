package com.stripe.android.p049ui.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.FieldValuesToParamsMapConverter$Companion$getKeys$2 */
/* loaded from: classes7.dex */
public final class FieldValuesToParamsMapConverter$Companion$getKeys$2 extends Lambda implements Function1<String, Boolean> {
    public static final FieldValuesToParamsMapConverter$Companion$getKeys$2 INSTANCE = new FieldValuesToParamsMapConverter$Companion$getKeys$2();

    public FieldValuesToParamsMapConverter$Companion$getKeys$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.length() == 0);
    }
}
