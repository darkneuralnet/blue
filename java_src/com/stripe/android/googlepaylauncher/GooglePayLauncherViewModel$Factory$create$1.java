package com.stripe.android.googlepaylauncher;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LOr6;", "T", "", "invoke", "()Ljava/lang/String;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class GooglePayLauncherViewModel$Factory$create$1 extends Lambda implements Function0<String> {
    final /* synthetic */ String $publishableKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayLauncherViewModel$Factory$create$1(String str) {
        super(0);
        this.$publishableKey = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return this.$publishableKey;
    }
}
