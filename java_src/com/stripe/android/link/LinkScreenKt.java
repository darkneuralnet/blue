package com.stripe.android.link;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002¨\u0006\u0002"}, m28432d2 = {"urlEncode", "", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class LinkScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String urlEncode(String str) {
        String encode = URLEncoder.encode(str, StandardCharsets.UTF_8.name());
        Intrinsics.checkNotNullExpressionValue(encode, "encode(this, StandardCharsets.UTF_8.name())");
        return encode;
    }
}
