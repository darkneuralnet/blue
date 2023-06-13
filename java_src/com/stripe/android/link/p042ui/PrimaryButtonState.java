package com.stripe.android.link.p042ui;

import com.amazonaws.services.p026s3.model.BucketLifecycleConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/link/ui/PrimaryButtonState;", "", "isBlocking", "", "(Ljava/lang/String;IZ)V", "()Z", "Enabled", BucketLifecycleConfiguration.DISABLED, "Processing", "Completed", "Companion", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.PrimaryButtonState */
/* loaded from: classes7.dex */
public enum PrimaryButtonState {
    Enabled(false),
    Disabled(false),
    Processing(true),
    Completed(true);
    
    public static final long COMPLETED_DELAY_MS = 1000;
    public static final Companion Companion = new Companion(null);
    private final boolean isBlocking;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/link/ui/PrimaryButtonState$Companion;", "", "()V", "COMPLETED_DELAY_MS", "", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.PrimaryButtonState$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    PrimaryButtonState(boolean z) {
        this.isBlocking = z;
    }

    public final boolean isBlocking() {
        return this.isBlocking;
    }
}
