package com.stripe.android.googlepaylauncher;

import com.amazonaws.services.p026s3.model.BucketLifecycleConfiguration;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0005J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "", "LEu1;", "", "isReady", BucketLifecycleConfiguration.DISABLED, "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public interface GooglePayRepository {

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayRepository$Disabled;", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "LEu1;", "", "isReady", "<init>", "()V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Disabled implements GooglePayRepository {
        public static final int $stable = 0;
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayRepository
        public InterfaceC32730Eu1<Boolean> isReady() {
            return C36708Vu1.m79281G(Boolean.FALSE);
        }
    }

    InterfaceC32730Eu1<Boolean> isReady();
}
