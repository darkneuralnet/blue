package com.stripe.android.core.networking;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "name", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.core.networking.StripeClientUserAgentHeaderFactory$Companion$DEFAULT_SYSTEM_PROPERTY_SUPPLIER$1 */
/* loaded from: classes6.dex */
public final class C18623x60e4aaf2 extends Lambda implements Function1<String, String> {
    public static final C18623x60e4aaf2 INSTANCE = new C18623x60e4aaf2();

    public C18623x60e4aaf2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String property = System.getProperty(name);
        return property == null ? "" : property;
    }
}
