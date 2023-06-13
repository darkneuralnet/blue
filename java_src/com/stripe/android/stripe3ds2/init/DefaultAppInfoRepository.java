package com.stripe.android.stripe3ds2.init;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tB\u001f\b\u0001\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u000eH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;", "Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "appVersion", "", "(Landroid/content/Context;ILkotlin/coroutines/CoroutineContext;)V", "store", "Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;", "(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;ILkotlin/coroutines/CoroutineContext;)V", "get", "Lcom/stripe/android/stripe3ds2/init/AppInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initAppInfo", "Companion", "Store", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DefaultAppInfoRepository implements AppInfoRepository {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final int INVALID_VERSION_CODE = -1;
    private final int appVersion;
    private final Store store;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$1", m28418f = "DefaultAppInfoRepository.kt", m28417i = {}, m28416l = {49}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$1 */
    /* loaded from: classes7.dex */
    public static final class C193401 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        int label;

        public C193401(Continuation<? super C193401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C193401(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C193401) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = true;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Store store = DefaultAppInfoRepository.this.store;
                this.label = 1;
                obj = store.get(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            AppInfo appInfo = (AppInfo) obj;
            if (appInfo == null || DefaultAppInfoRepository.this.appVersion != appInfo.getVersion()) {
                z = false;
            }
            if (!z) {
                DefaultAppInfoRepository.this.initAppInfo();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Companion;", "", "()V", "INVALID_VERSION_CODE", "", "getAppVersion", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getAppVersion(Context context) {
            Integer m116783constructorimpl;
            try {
                Result.Companion companion = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m116789isFailureimpl(m116783constructorimpl)) {
                m116783constructorimpl = -1;
            }
            return ((Number) m116783constructorimpl).intValue();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H&ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;", "", "get", "Lcom/stripe/android/stripe3ds2/init/AppInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "", "appInfo", "Default", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface Store {

        @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store$Default;", "Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "appVersion", "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;ILkotlin/coroutines/CoroutineContext;)V", "sharedPrefs", "Landroid/content/SharedPreferences;", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "sharedPrefs$delegate", "Lkotlin/Lazy;", "get", "Lcom/stripe/android/stripe3ds2/init/AppInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "", "appInfo", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Default implements Store {
            private static final Companion Companion = new Companion(null);
            @Deprecated
            private static final String KEY_APP_VERSION = "app_version";
            @Deprecated
            private static final String KEY_SDK_APP_ID = "sdk_app_id";
            @Deprecated
            private static final String PREFS_NAME = "app_info";
            private final int appVersion;
            private final Lazy sharedPrefs$delegate;
            private final CoroutineContext workContext;

            @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store$Default$Companion;", "", "()V", "KEY_APP_VERSION", "", "KEY_SDK_APP_ID", "PREFS_NAME", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }

            public Default(Context context, int i, CoroutineContext workContext) {
                Lazy lazy;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(workContext, "workContext");
                this.appVersion = i;
                this.workContext = workContext;
                lazy = LazyKt__LazyJVMKt.lazy(new DefaultAppInfoRepository$Store$Default$sharedPrefs$2(context));
                this.sharedPrefs$delegate = lazy;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final SharedPreferences getSharedPrefs() {
                Object value = this.sharedPrefs$delegate.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "<get-sharedPrefs>(...)");
                return (SharedPreferences) value;
            }

            @Override // com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository.Store
            public Object get(Continuation<? super AppInfo> continuation) {
                return X30.m77504g(this.workContext, new DefaultAppInfoRepository$Store$Default$get$2(this, null), continuation);
            }

            @Override // com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository.Store
            public void save(AppInfo appInfo) {
                Intrinsics.checkNotNullParameter(appInfo, "appInfo");
                getSharedPrefs().edit().putInt("app_version", this.appVersion).putString(KEY_SDK_APP_ID, appInfo.getSdkAppId()).apply();
            }
        }

        Object get(Continuation<? super AppInfo> continuation);

        void save(AppInfo appInfo);
    }

    public DefaultAppInfoRepository(Store store, int i, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.store = store;
        this.appVersion = i;
        Z30.m73800d(C37824aD0.m71790a(workContext), null, null, new C193401(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppInfo initAppInfo() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        AppInfo appInfo = new AppInfo(uuid, this.appVersion);
        this.store.save(appInfo);
        return appInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // com.stripe.android.stripe3ds2.init.AppInfoRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object get(Continuation<? super AppInfo> continuation) {
        DefaultAppInfoRepository$get$1 defaultAppInfoRepository$get$1;
        Object coroutine_suspended;
        int i;
        DefaultAppInfoRepository defaultAppInfoRepository;
        AppInfo appInfo;
        if (continuation instanceof DefaultAppInfoRepository$get$1) {
            defaultAppInfoRepository$get$1 = (DefaultAppInfoRepository$get$1) continuation;
            int i2 = defaultAppInfoRepository$get$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultAppInfoRepository$get$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultAppInfoRepository$get$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultAppInfoRepository$get$1.label;
                if (i == 0) {
                    if (i == 1) {
                        defaultAppInfoRepository = (DefaultAppInfoRepository) defaultAppInfoRepository$get$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Store store = this.store;
                    defaultAppInfoRepository$get$1.L$0 = this;
                    defaultAppInfoRepository$get$1.label = 1;
                    obj = store.get(defaultAppInfoRepository$get$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    defaultAppInfoRepository = this;
                }
                appInfo = (AppInfo) obj;
                if (appInfo != null) {
                    return defaultAppInfoRepository.initAppInfo();
                }
                return appInfo;
            }
        }
        defaultAppInfoRepository$get$1 = new DefaultAppInfoRepository$get$1(this, continuation);
        Object obj2 = defaultAppInfoRepository$get$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultAppInfoRepository$get$1.label;
        if (i == 0) {
        }
        appInfo = (AppInfo) obj2;
        if (appInfo != null) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultAppInfoRepository(Context context, CoroutineContext workContext) {
        this(context, Companion.getAppVersion(context), workContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultAppInfoRepository(Context context, int i, CoroutineContext workContext) {
        this(new Store.Default(context, i, workContext), i, workContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }
}
