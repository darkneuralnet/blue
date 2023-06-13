package com.stripe.android.cards;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class DefaultCardAccountRangeStore$prefs$2 extends Lambda implements Function0<SharedPreferences> {
    final /* synthetic */ DefaultCardAccountRangeStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultCardAccountRangeStore$prefs$2(DefaultCardAccountRangeStore defaultCardAccountRangeStore) {
        super(0);
        this.this$0 = defaultCardAccountRangeStore;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        Context context;
        context = this.this$0.context;
        return context.getSharedPreferences("InMemoryCardAccountRangeSource.Store", 0);
    }
}
