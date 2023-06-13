package com.stripe.android.core.model.parsers;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "key", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class StripeErrorJsonParser$parse$1$1$1$1 extends Lambda implements Function1<String, Pair<? extends String, ? extends String>> {
    final /* synthetic */ JSONObject $extraFieldsJson;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeErrorJsonParser$parse$1$1$1$1(JSONObject jSONObject) {
        super(1);
        this.$extraFieldsJson = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Pair<String, String> invoke(String str) {
        return TuplesKt.m28425to(str, this.$extraFieldsJson.get(str).toString());
    }
}
