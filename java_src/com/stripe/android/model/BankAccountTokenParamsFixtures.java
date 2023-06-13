package com.stripe.android.model;

import com.stripe.android.model.BankAccountTokenParams;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/BankAccountTokenParamsFixtures;", "", "()V", "DEFAULT", "Lcom/stripe/android/model/BankAccountTokenParams;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class BankAccountTokenParamsFixtures {
    public static final int $stable = 0;
    public static final BankAccountTokenParamsFixtures INSTANCE = new BankAccountTokenParamsFixtures();
    @JvmField
    public static final BankAccountTokenParams DEFAULT = new BankAccountTokenParams("US", Source.USD, "000123456789", BankAccountTokenParams.Type.Individual, "Jenny Rosen", "110000000");

    private BankAccountTokenParamsFixtures() {
    }
}
