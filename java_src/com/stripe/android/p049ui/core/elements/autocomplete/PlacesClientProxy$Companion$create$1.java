package com.stripe.android.p049ui.core.elements.autocomplete;

import android.content.Context;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "kotlin.jvm.PlatformType", "it", "Landroid/content/Context;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.autocomplete.PlacesClientProxy$Companion$create$1 */
/* loaded from: classes7.dex */
public final class PlacesClientProxy$Companion$create$1 extends Lambda implements Function1<Context, PlacesClient> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesClientProxy$Companion$create$1(Context context) {
        super(1);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PlacesClient invoke(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PlacesClient createClient = Places.createClient(this.$context);
        Intrinsics.checkNotNullExpressionValue(createClient, "createClient(context)");
        return createClient;
    }
}
