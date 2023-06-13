package com.stripe.android.core.networking;

import com.stripe.android.core.networking.QueryStringFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/core/networking/QueryStringFactory$Parameter;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class QueryStringFactory$create$1 extends Lambda implements Function1<QueryStringFactory.Parameter, CharSequence> {
    public static final QueryStringFactory$create$1 INSTANCE = new QueryStringFactory$create$1();

    public QueryStringFactory$create$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(QueryStringFactory.Parameter it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.toString();
    }
}
