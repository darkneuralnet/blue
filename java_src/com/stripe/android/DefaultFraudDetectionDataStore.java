package com.stripe.android;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.networking.FraudDetectionData;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/DefaultFraudDetectionDataStore;", "Lcom/stripe/android/FraudDetectionDataStore;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs$delegate", "Lkotlin/Lazy;", "get", "Lcom/stripe/android/networking/FraudDetectionData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "", "fraudDetectionData", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nFraudDetectionDataStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FraudDetectionDataStore.kt\ncom/stripe/android/DefaultFraudDetectionDataStore\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,49:1\n39#2,12:50\n*S KotlinDebug\n*F\n+ 1 FraudDetectionDataStore.kt\ncom/stripe/android/DefaultFraudDetectionDataStore\n*L\n39#1:50,12\n*E\n"})
/* loaded from: classes6.dex */
public final class DefaultFraudDetectionDataStore implements FraudDetectionDataStore {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String KEY_DATA = "key_fraud_detection_data";
    @Deprecated
    private static final String PREF_FILE = "FraudDetectionDataStore";
    private final Lazy prefs$delegate;
    private final CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/DefaultFraudDetectionDataStore$Companion;", "", "()V", "KEY_DATA", "", "PREF_FILE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DefaultFraudDetectionDataStore(Context context, CoroutineContext workContext) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.workContext = workContext;
        lazy = LazyKt__LazyJVMKt.lazy(new DefaultFraudDetectionDataStore$prefs$2(context));
        this.prefs$delegate = lazy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences getPrefs() {
        return (SharedPreferences) this.prefs$delegate.getValue();
    }

    @Override // com.stripe.android.FraudDetectionDataStore
    public Object get(Continuation<? super FraudDetectionData> continuation) {
        return X30.m77504g(this.workContext, new DefaultFraudDetectionDataStore$get$2(this, null), continuation);
    }

    @Override // com.stripe.android.FraudDetectionDataStore
    public void save(FraudDetectionData fraudDetectionData) {
        Intrinsics.checkNotNullParameter(fraudDetectionData, "fraudDetectionData");
        SharedPreferences prefs = getPrefs();
        Intrinsics.checkNotNullExpressionValue(prefs, "prefs");
        SharedPreferences.Editor editor = prefs.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_DATA, fraudDetectionData.toJson().toString());
        editor.apply();
    }

    public /* synthetic */ DefaultFraudDetectionDataStore(Context context, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? T41.m84377b() : coroutineContext);
    }
}
