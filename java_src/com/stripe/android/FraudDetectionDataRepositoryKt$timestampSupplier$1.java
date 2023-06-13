package com.stripe.android;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class FraudDetectionDataRepositoryKt$timestampSupplier$1 extends Lambda implements Function0<Long> {
    public static final FraudDetectionDataRepositoryKt$timestampSupplier$1 INSTANCE = new FraudDetectionDataRepositoryKt$timestampSupplier$1();

    public FraudDetectionDataRepositoryKt$timestampSupplier$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(Calendar.getInstance().getTimeInMillis());
    }
}
