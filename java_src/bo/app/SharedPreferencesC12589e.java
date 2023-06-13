package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004H\u0016J\u001e\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0016J,\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\nH\u0016J\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u000eH\u0016J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0010H\u0016J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0012H\u0016J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0014H\u0016J\u0013\u0010\u0016\u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0012\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001c\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¨\u0006\""}, m28432d2 = {"Lbo/app/e;", "Landroid/content/SharedPreferences;", "", C17296a.f69688o, "", "", "getAll", "key", "defValue", "getString", "", "defValues", "", "getStringSet", "", "getInt", "", "getLong", "", "getFloat", "", "getBoolean", "contains", "Landroid/content/SharedPreferences$Editor;", "edit", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerOnSharedPreferenceChangeListener", "unregisterOnSharedPreferenceChangeListener", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.e */
/* loaded from: classes.dex */
public final class SharedPreferencesC12589e implements SharedPreferences {

    /* renamed from: a */
    private final Context f58366a;

    /* renamed from: b */
    private final String f58367b;

    /* renamed from: c */
    private SharedPreferences f58368c;

    /* renamed from: d */
    private final InterfaceC52943zh2 f58369d;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.storage.AsyncPrefs$storageInitJob$1", m28418f = "AsyncPrefs.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: bo.app.e$a */
    /* loaded from: classes.dex */
    public static final class C12590a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: b */
        int f58370b;

        public C12590a(Continuation<? super C12590a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C12590a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C12590a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f58370b == 0) {
                ResultKt.throwOnFailure(obj);
                SharedPreferencesC12589e.this.f58366a.getSharedPreferences(SharedPreferencesC12589e.this.f58367b, 0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.storage.AsyncPrefs$waitUntilReady$1", m28418f = "AsyncPrefs.kt", m28417i = {}, m28416l = {83}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: bo.app.e$b */
    /* loaded from: classes.dex */
    public static final class C12591b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: b */
        int f58372b;

        public C12591b(Continuation<? super C12591b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C12591b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C12591b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f58372b;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC52943zh2 interfaceC52943zh2 = SharedPreferencesC12589e.this.f58369d;
                this.f58372b = 1;
                if (interfaceC52943zh2.mo557P(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public SharedPreferencesC12589e(Context context, String name) {
        InterfaceC52943zh2 m73800d;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f58366a = context;
        this.f58367b = name;
        m73800d = Z30.m73800d(Z10.f47750b, null, null, new C12590a(null), 3, null);
        this.f58369d = m73800d;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        m63831a();
        SharedPreferences sharedPreferences = this.f58368c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.contains(str);
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        m63831a();
        SharedPreferences sharedPreferences = this.f58368c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(edit, "prefs.edit()");
        return edit;
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        m63831a();
        SharedPreferences sharedPreferences = this.f58368c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        Map<String, ?> all = sharedPreferences.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "prefs.all");
        return all;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        m63831a();
        SharedPreferences sharedPreferences = this.f58368c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getBoolean(str, z);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        m63831a();
        SharedPreferences sharedPreferences = this.f58368c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getFloat(str, f);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        m63831a();
        SharedPreferences sharedPreferences = this.f58368c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getInt(str, i);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        m63831a();
        SharedPreferences sharedPreferences = this.f58368c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getLong(str, j);
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        m63831a();
        SharedPreferences sharedPreferences = this.f58368c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getString(str, str2);
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        m63831a();
        SharedPreferences sharedPreferences = this.f58368c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getStringSet(str, set);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        m63831a();
        SharedPreferences sharedPreferences = this.f58368c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        m63831a();
        SharedPreferences sharedPreferences = this.f58368c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    /* renamed from: a */
    private final void m63831a() {
        if (!this.f58369d.mo554c()) {
            Y30.m75794b(null, new C12591b(null), 1, null);
        }
        SharedPreferences sharedPreferences = this.f58366a.getSharedPreferences(this.f58367b, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        this.f58368c = sharedPreferences;
    }
}
