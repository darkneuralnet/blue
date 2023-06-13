package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.paymentsheet.DefaultPrefsRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;", "customerConfig", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule$Companion$providePrefsRepositoryFactory$1 */
/* loaded from: classes7.dex */
public final class C19227xce022e72 extends Lambda implements Function1<PaymentSheet.CustomerConfiguration, DefaultPrefsRepository> {
    final /* synthetic */ Context $appContext;
    final /* synthetic */ CoroutineContext $workContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19227xce022e72(Context context, CoroutineContext coroutineContext) {
        super(1);
        this.$appContext = context;
        this.$workContext = coroutineContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DefaultPrefsRepository invoke(PaymentSheet.CustomerConfiguration customerConfiguration) {
        return new DefaultPrefsRepository(this.$appContext, customerConfiguration != null ? customerConfiguration.getId() : null, this.$workContext);
    }
}
