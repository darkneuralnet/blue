package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import android.os.SystemClock;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/DefaultTimeProvider;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;", "()V", "currentTimeInMillis", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DefaultTimeProvider implements TimeProvider {
    @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.TimeProvider
    public long currentTimeInMillis() {
        return SystemClock.elapsedRealtime();
    }
}
