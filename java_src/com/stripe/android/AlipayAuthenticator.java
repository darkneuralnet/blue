package com.stripe.android;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.Map;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H'¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/AlipayAuthenticator;", "", "onAuthenticationRequest", "", "", MessageExtension.FIELD_DATA, "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public interface AlipayAuthenticator {
    Map<String, String> onAuthenticationRequest(String str);
}
