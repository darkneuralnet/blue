package com.stripe.android.stripe3ds2.views;

import androidx.fragment.app.C11672e;
import androidx.fragment.app.Fragment;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeProgressFragmentFactory;", "Landroidx/fragment/app/e;", "Ljava/lang/ClassLoader;", "classLoader", "", "className", "Landroidx/fragment/app/Fragment;", "instantiate", "directoryServerName", "Ljava/lang/String;", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "", "accentColor", "Ljava/lang/Integer;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/Integer;)V", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes7.dex */
public final class ChallengeProgressFragmentFactory extends C11672e {
    private final Integer accentColor;
    private final String directoryServerName;
    private final SdkTransactionId sdkTransactionId;

    public ChallengeProgressFragmentFactory(String directoryServerName, SdkTransactionId sdkTransactionId, Integer num) {
        Intrinsics.checkNotNullParameter(directoryServerName, "directoryServerName");
        Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
        this.directoryServerName = directoryServerName;
        this.sdkTransactionId = sdkTransactionId;
        this.accentColor = num;
    }

    @Override // androidx.fragment.app.C11672e
    public Fragment instantiate(ClassLoader classLoader, String className) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        Intrinsics.checkNotNullParameter(className, "className");
        if (Intrinsics.areEqual(className, ChallengeProgressFragment.class.getName())) {
            return new ChallengeProgressFragment(this.directoryServerName, this.sdkTransactionId, this.accentColor);
        }
        Fragment instantiate = super.instantiate(classLoader, className);
        Intrinsics.checkNotNullExpressionValue(instantiate, "{\n                super.… className)\n            }");
        return instantiate;
    }
}
