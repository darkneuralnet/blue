package com.stripe.android.stripe3ds2.transaction;

import android.util.Log;
import com.stripe.android.core.injection.NamedConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \n2\u00020\u0001:\u0003\n\u000b\fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/Logger;", "", "()V", "error", "", "msg", "", "t", "", "info", "Companion", "Noop", "Real", "Lcom/stripe/android/stripe3ds2/transaction/Logger$Noop;", "Lcom/stripe/android/stripe3ds2/transaction/Logger$Real;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class Logger {
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/Logger$Companion;", "", "()V", "get", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", NamedConstantsKt.ENABLE_LOGGING, "", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger get(boolean z) {
            if (z) {
                return Real.INSTANCE;
            }
            return Noop.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/Logger$Noop;", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "()V", "error", "", "msg", "", "t", "", "info", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Noop extends Logger {
        public static final Noop INSTANCE = new Noop();

        private Noop() {
            super(null);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.Logger
        public void error(String msg, Throwable th) {
            Intrinsics.checkNotNullParameter(msg, "msg");
        }

        @Override // com.stripe.android.stripe3ds2.transaction.Logger
        public void info(String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/Logger$Real;", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "()V", "TAG", "", "error", "", "msg", "t", "", "info", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Real extends Logger {
        public static final Real INSTANCE = new Real();
        private static final String TAG = "StripeSdk";

        private Real() {
            super(null);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.Logger
        public void error(String msg, Throwable th) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            Log.e(TAG, msg, th);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.Logger
        public void info(String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            Log.i(TAG, msg);
        }
    }

    public /* synthetic */ Logger(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void error$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        logger.error(str, th);
    }

    public abstract void error(String str, Throwable th);

    public abstract void info(String str);

    private Logger() {
    }
}
