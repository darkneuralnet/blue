package com.stripe.android;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.EphemeralOperation;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.model.parsers.EphemeralKeyJsonParser;
import java.util.Calendar;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__IndentKt;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 '2\u00020\u0001:\u0004&'()BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001cJ\u0017\u0010\u001d\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0002\b\u001eJ\u001a\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u0011H\u0002J \u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0011H\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m28432d2 = {"Lcom/stripe/android/EphemeralKeyManager;", "", "ephemeralKeyProvider", "Lcom/stripe/android/EphemeralKeyProvider;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;", "operationIdFactory", "Lcom/stripe/android/OperationIdFactory;", "shouldPrefetchEphemeralKey", "", "timeSupplier", "Lkotlin/Function0;", "", "Lcom/stripe/android/TimeSupplier;", "timeBufferInSeconds", "(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;Lcom/stripe/android/OperationIdFactory;ZLkotlin/jvm/functions/Function0;J)V", "apiVersion", "", "ephemeralKey", "Lcom/stripe/android/EphemeralKey;", "getEphemeralKey$payments_core_release", "()Lcom/stripe/android/EphemeralKey;", "setEphemeralKey$payments_core_release", "(Lcom/stripe/android/EphemeralKey;)V", "retrieveEphemeralKey", "", "operation", "Lcom/stripe/android/EphemeralOperation;", "retrieveEphemeralKey$payments_core_release", "shouldRefreshKey", "shouldRefreshKey$payments_core_release", "updateKey", "key", "updateKeyError", "operationId", "errorCode", "", "errorMessage", "ClientKeyUpdateListener", "Companion", "Factory", "KeyManagerListener", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nEphemeralKeyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EphemeralKeyManager.kt\ncom/stripe/android/EphemeralKeyManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n1#2:165\n*E\n"})
/* loaded from: classes6.dex */
public final class EphemeralKeyManager {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final long REFRESH_BUFFER_IN_SECONDS = 30;
    private final String apiVersion;
    private /* synthetic */ EphemeralKey ephemeralKey;
    private final EphemeralKeyProvider ephemeralKeyProvider;
    private final KeyManagerListener listener;
    private final long timeBufferInSeconds;
    private final Function0<Long> timeSupplier;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.EphemeralKeyManager$1 */
    /* loaded from: classes6.dex */
    public static final class C186021 extends Lambda implements Function0<Long> {
        public static final C186021 INSTANCE = new C186021();

        public C186021() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(Calendar.getInstance().getTimeInMillis());
        }
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/EphemeralKeyManager$ClientKeyUpdateListener;", "Lcom/stripe/android/EphemeralKeyUpdateListener;", "ephemeralKeyManager", "Lcom/stripe/android/EphemeralKeyManager;", "operation", "Lcom/stripe/android/EphemeralOperation;", "(Lcom/stripe/android/EphemeralKeyManager;Lcom/stripe/android/EphemeralOperation;)V", "onKeyUpdate", "", "stripeResponseJson", "", "onKeyUpdateFailure", "responseCode", "", "message", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class ClientKeyUpdateListener implements EphemeralKeyUpdateListener {
        private final EphemeralKeyManager ephemeralKeyManager;
        private final EphemeralOperation operation;

        public ClientKeyUpdateListener(EphemeralKeyManager ephemeralKeyManager, EphemeralOperation operation) {
            Intrinsics.checkNotNullParameter(ephemeralKeyManager, "ephemeralKeyManager");
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.ephemeralKeyManager = ephemeralKeyManager;
            this.operation = operation;
        }

        @Override // com.stripe.android.EphemeralKeyUpdateListener
        public void onKeyUpdate(String stripeResponseJson) {
            Intrinsics.checkNotNullParameter(stripeResponseJson, "stripeResponseJson");
            this.ephemeralKeyManager.updateKey(this.operation, stripeResponseJson);
        }

        @Override // com.stripe.android.EphemeralKeyUpdateListener
        public void onKeyUpdateFailure(int i, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.ephemeralKeyManager.updateKeyError(this.operation.getId$payments_core_release(), i, message);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/EphemeralKeyManager$Companion;", "", "()V", "REFRESH_BUFFER_IN_SECONDS", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;", "", "onKeyError", "", "operationId", "", "errorCode", "", "errorMessage", "onKeyUpdate", "ephemeralKey", "Lcom/stripe/android/EphemeralKey;", "operation", "Lcom/stripe/android/EphemeralOperation;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public interface KeyManagerListener {
        void onKeyError(String str, int i, String str2);

        void onKeyUpdate(EphemeralKey ephemeralKey, EphemeralOperation ephemeralOperation);
    }

    public EphemeralKeyManager(EphemeralKeyProvider ephemeralKeyProvider, KeyManagerListener listener, OperationIdFactory operationIdFactory, boolean z, Function0<Long> timeSupplier, long j) {
        Set emptySet;
        Intrinsics.checkNotNullParameter(ephemeralKeyProvider, "ephemeralKeyProvider");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(operationIdFactory, "operationIdFactory");
        Intrinsics.checkNotNullParameter(timeSupplier, "timeSupplier");
        this.ephemeralKeyProvider = ephemeralKeyProvider;
        this.listener = listener;
        this.timeSupplier = timeSupplier;
        this.timeBufferInSeconds = j;
        this.apiVersion = ApiVersion.Companion.get().getCode();
        if (z) {
            String create = operationIdFactory.create();
            emptySet = SetsKt__SetsKt.emptySet();
            retrieveEphemeralKey$payments_core_release(new EphemeralOperation.RetrieveKey(create, emptySet));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateKey(EphemeralOperation ephemeralOperation, String str) {
        Object m116783constructorimpl;
        String trimIndent;
        if (str == null) {
            this.listener.onKeyError(ephemeralOperation.getId$payments_core_release(), 500, "EphemeralKeyUpdateListener.onKeyUpdate was called with a null value");
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            EphemeralKey parse = new EphemeralKeyJsonParser().parse(new JSONObject(str));
            this.ephemeralKey = parse;
            m116783constructorimpl = Result.m116783constructorimpl(parse);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl == null) {
            this.listener.onKeyUpdate((EphemeralKey) m116783constructorimpl, ephemeralOperation);
            return;
        }
        if (m116786exceptionOrNullimpl instanceof JSONException) {
            String message = m116786exceptionOrNullimpl.getMessage();
            trimIndent = StringsKt__IndentKt.trimIndent("\n                        Received an ephemeral key that could not be parsed. See https://stripe.com/docs/mobile/android/basic for more details.\n                        \n                        " + message + "\n                        ");
        } else {
            String message2 = m116786exceptionOrNullimpl.getMessage();
            trimIndent = StringsKt__IndentKt.trimIndent("\n                        Received an invalid ephemeral key. See https://stripe.com/docs/mobile/android/basic for more details.\n                        \n                        " + message2 + "\n                        ");
        }
        this.listener.onKeyError(ephemeralOperation.getId$payments_core_release(), 500, trimIndent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateKeyError(String str, int i, String str2) {
        this.ephemeralKey = null;
        this.listener.onKeyError(str, i, str2);
    }

    public final EphemeralKey getEphemeralKey$payments_core_release() {
        return this.ephemeralKey;
    }

    public final /* synthetic */ void retrieveEphemeralKey$payments_core_release(EphemeralOperation operation) {
        boolean z;
        Intrinsics.checkNotNullParameter(operation, "operation");
        EphemeralKey ephemeralKey = this.ephemeralKey;
        if (ephemeralKey != null && !shouldRefreshKey$payments_core_release(ephemeralKey)) {
            z = false;
        } else {
            z = true;
        }
        Unit unit = null;
        if (z) {
            ephemeralKey = null;
        }
        if (ephemeralKey != null) {
            this.listener.onKeyUpdate(ephemeralKey, operation);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.ephemeralKeyProvider.createEphemeralKey(this.apiVersion, new ClientKeyUpdateListener(this, operation));
        }
    }

    public final void setEphemeralKey$payments_core_release(EphemeralKey ephemeralKey) {
        this.ephemeralKey = ephemeralKey;
    }

    public final boolean shouldRefreshKey$payments_core_release(EphemeralKey ephemeralKey) {
        if (ephemeralKey == null) {
            return true;
        }
        if (ephemeralKey.getExpires$payments_core_release() < TimeUnit.MILLISECONDS.toSeconds(this.timeSupplier.invoke().longValue()) + this.timeBufferInSeconds) {
            return true;
        }
        return false;
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/EphemeralKeyManager$Factory;", "", "create", "Lcom/stripe/android/EphemeralKeyManager;", "arg", "Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;", "Default", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public interface Factory {
        EphemeralKeyManager create(KeyManagerListener keyManagerListener);

        @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/EphemeralKeyManager$Factory$Default;", "Lcom/stripe/android/EphemeralKeyManager$Factory;", "keyProvider", "Lcom/stripe/android/EphemeralKeyProvider;", "shouldPrefetchEphemeralKey", "", "operationIdFactory", "Lcom/stripe/android/OperationIdFactory;", "timeSupplier", "Lkotlin/Function0;", "", "Lcom/stripe/android/TimeSupplier;", "(Lcom/stripe/android/EphemeralKeyProvider;ZLcom/stripe/android/OperationIdFactory;Lkotlin/jvm/functions/Function0;)V", "create", "Lcom/stripe/android/EphemeralKeyManager;", "arg", "Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Default implements Factory {
            public static final int $stable = 0;
            private final EphemeralKeyProvider keyProvider;
            private final OperationIdFactory operationIdFactory;
            private final boolean shouldPrefetchEphemeralKey;
            private final Function0<Long> timeSupplier;

            @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: com.stripe.android.EphemeralKeyManager$Factory$Default$1 */
            /* loaded from: classes6.dex */
            public static final class C186031 extends Lambda implements Function0<Long> {
                public static final C186031 INSTANCE = new C186031();

                public C186031() {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Long invoke() {
                    return Long.valueOf(Calendar.getInstance().getTimeInMillis());
                }
            }

            public Default(EphemeralKeyProvider keyProvider, boolean z, OperationIdFactory operationIdFactory, Function0<Long> timeSupplier) {
                Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
                Intrinsics.checkNotNullParameter(operationIdFactory, "operationIdFactory");
                Intrinsics.checkNotNullParameter(timeSupplier, "timeSupplier");
                this.keyProvider = keyProvider;
                this.shouldPrefetchEphemeralKey = z;
                this.operationIdFactory = operationIdFactory;
                this.timeSupplier = timeSupplier;
            }

            @Override // com.stripe.android.EphemeralKeyManager.Factory
            public /* synthetic */ EphemeralKeyManager create(KeyManagerListener arg) {
                Intrinsics.checkNotNullParameter(arg, "arg");
                return new EphemeralKeyManager(this.keyProvider, arg, this.operationIdFactory, this.shouldPrefetchEphemeralKey, this.timeSupplier, 0L, 32, null);
            }

            public /* synthetic */ Default(EphemeralKeyProvider ephemeralKeyProvider, boolean z, OperationIdFactory operationIdFactory, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(ephemeralKeyProvider, z, (i & 4) != 0 ? new StripeOperationIdFactory() : operationIdFactory, (i & 8) != 0 ? C186031.INSTANCE : function0);
            }
        }
    }

    public /* synthetic */ EphemeralKeyManager(EphemeralKeyProvider ephemeralKeyProvider, KeyManagerListener keyManagerListener, OperationIdFactory operationIdFactory, boolean z, Function0 function0, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ephemeralKeyProvider, keyManagerListener, (i & 4) != 0 ? new StripeOperationIdFactory() : operationIdFactory, (i & 8) != 0 ? true : z, (i & 16) != 0 ? C186021.INSTANCE : function0, (i & 32) != 0 ? 30L : j);
    }
}
