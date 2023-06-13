package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.TokenPair;
import co.bird.android.model.TokenPairState;
import co.bird.android.model.wire.WireLocation;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23470e;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C10390Zp;
import p000.InterfaceC5093Lp;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%¢\u0006\u0004\b)\u0010*J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016ø\u0001\u0000J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0016ø\u0001\u0000J#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002ø\u0001\u0000J\b\u0010\u0011\u001a\u00020\tH\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, m28432d2 = {"LZp;", "LRp;", "", "email", "Lco/bird/android/model/wire/WireLocation;", "location", "Lio/reactivex/F;", "Lqa1;", "s", "Lio/reactivex/c;", "b", "token", "u", "idToken", "t", "locationHeader", "i", "p", "Lwi2;", C17296a.f69688o, "Lwi2;", "deserializer", "Lgl;", "Lgl;", "preference", "Lhq;", "c", "Lhq;", "tokenManager", "LLp;", DateTokenConverter.CONVERTER_KEY, "LLp;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "LVo2;", "e", "LVo2;", "legacyClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "f", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "googleSignInClient", "<init>", "(Lwi2;Lgl;Lhq;LLp;LVo2;Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;)V", "auth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAuthManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthManagerImpl.kt\nco/bird/android/auth/manager/AuthManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
/* renamed from: Zp */
/* loaded from: classes2.dex */
public final class C10390Zp implements InterfaceC7277Rp {

    /* renamed from: a */
    public final C51174wi2 f49288a;

    /* renamed from: b */
    public final C22454gl f49289b;

    /* renamed from: c */
    public final InterfaceC22767hq f49290c;

    /* renamed from: d */
    public final InterfaceC5093Lp f49291d;

    /* renamed from: e */
    public final InterfaceC36655Vo2 f49292e;

    /* renamed from: f */
    public final GoogleSignInClient f49293f;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lco/bird/android/model/TokenPairState;", "it", C17296a.f69688o, "(Lco/bird/android/model/TokenPairState;)Lco/bird/android/model/TokenPairState;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAuthManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthManagerImpl.kt\nco/bird/android/auth/manager/AuthManagerImpl$emailLogin$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
    /* renamed from: Zp$a */
    /* loaded from: classes2.dex */
    public static final class C10391a extends Lambda implements Function1<TokenPairState, TokenPairState> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<C48722sa1> f49294g;

        /* renamed from: h */
        public final /* synthetic */ C10390Zp f49295h;

        /* renamed from: i */
        public final /* synthetic */ String f49296i;

        /* renamed from: j */
        public final /* synthetic */ String f49297j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10391a(Ref.ObjectRef<C48722sa1> objectRef, C10390Zp c10390Zp, String str, String str2) {
            super(1);
            this.f49294g = objectRef;
            this.f49295h = c10390Zp;
            this.f49296i = str;
            this.f49297j = str2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final TokenPairState invoke(TokenPairState tokenPairState) {
            C48722sa1 c48722sa1;
            Ref.ObjectRef<C48722sa1> objectRef = this.f49294g;
            ?? m33132g = InterfaceC5093Lp.C5094a.emailLogin$default(this.f49295h.f49291d, new C48130ra1(this.f49296i), this.f49297j, null, 4, null).m33132g();
            Intrinsics.checkNotNullExpressionValue(m33132g, "client.emailLogin(EmailM…tionHeader).blockingGet()");
            objectRef.element = m33132g;
            C48722sa1 c48722sa12 = this.f49294g.element;
            if (c48722sa12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT);
                c48722sa1 = null;
            } else {
                c48722sa1 = c48722sa12;
            }
            TokenPair m13990b = c48722sa1.m13990b();
            if (m13990b == null) {
                return null;
            }
            return new TokenPairState(m13990b, false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zp$b */
    /* loaded from: classes2.dex */
    public static final class C10392b extends Lambda implements Function1<Optional<String>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f49299h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10392b(String str) {
            super(1);
            this.f49299h = str;
        }

        /* renamed from: a */
        public final void m72454a(Optional<String> optional) {
            C10390Zp.this.f49289b.m37601l2(this.f49299h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<String> optional) {
            m72454a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "locationHeader", "Lio/reactivex/K;", "Lqa1;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zp$c */
    /* loaded from: classes2.dex */
    public static final class C10393c extends Lambda implements Function1<Optional<String>, InterfaceC23447K<? extends C47537qa1>> {

        /* renamed from: h */
        public final /* synthetic */ String f49301h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10393c(String str) {
            super(1);
            this.f49301h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends C47537qa1> invoke(Optional<String> locationHeader) {
            Intrinsics.checkNotNullParameter(locationHeader, "locationHeader");
            return C10390Zp.this.m72467i(this.f49301h, locationHeader.m59035e());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lco/bird/android/model/TokenPairState;", "it", C17296a.f69688o, "(Lco/bird/android/model/TokenPairState;)Lco/bird/android/model/TokenPairState;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAuthManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthManagerImpl.kt\nco/bird/android/auth/manager/AuthManagerImpl$loginWithGoogle$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
    /* renamed from: Zp$d */
    /* loaded from: classes2.dex */
    public static final class C10394d extends Lambda implements Function1<TokenPairState, TokenPairState> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<C48722sa1> f49302g;

        /* renamed from: h */
        public final /* synthetic */ C10390Zp f49303h;

        /* renamed from: i */
        public final /* synthetic */ String f49304i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10394d(Ref.ObjectRef<C48722sa1> objectRef, C10390Zp c10390Zp, String str) {
            super(1);
            this.f49302g = objectRef;
            this.f49303h = c10390Zp;
            this.f49304i = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final TokenPairState invoke(TokenPairState tokenPairState) {
            C48722sa1 c48722sa1;
            Ref.ObjectRef<C48722sa1> objectRef = this.f49302g;
            ?? m33132g = this.f49303h.f49291d.m96323d(new C37447Yy2(this.f49304i)).m33132g();
            Intrinsics.checkNotNullExpressionValue(m33132g, "client.loginWithGoogle(L…t(idToken)).blockingGet()");
            objectRef.element = m33132g;
            C48722sa1 c48722sa12 = this.f49302g.element;
            if (c48722sa12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT);
                c48722sa1 = null;
            } else {
                c48722sa1 = c48722sa12;
            }
            TokenPair m13990b = c48722sa1.m13990b();
            if (m13990b == null) {
                return null;
            }
            return new TokenPairState(m13990b, false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "lastAuthHeader", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zp$e */
    /* loaded from: classes2.dex */
    public static final class C10395e extends Lambda implements Function1<String, Unit> {
        public C10395e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            AbstractC23461c.m33073M(C10390Zp.this.f49292e.m79410a(str).m33159G().m33069Q(), C10390Zp.this.m72460p().m33069Q()).m33061Z(10L, TimeUnit.SECONDS).subscribe();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/e;", "emitter", "", "c", "(Lio/reactivex/e;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zp$f */
    /* loaded from: classes2.dex */
    public static final class C10396f extends Lambda implements Function1<InterfaceC23470e, Unit> {
        public C10396f() {
            super(1);
        }

        /* renamed from: d */
        public static final void m72448d(InterfaceC23470e emitter, Task it) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            Intrinsics.checkNotNullParameter(it, "it");
            emitter.onComplete();
        }

        /* renamed from: e */
        public static final void m72447e(InterfaceC23470e emitter, Exception it) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            Intrinsics.checkNotNullParameter(it, "it");
            emitter.onError(it);
        }

        /* renamed from: c */
        public final void m72449c(final InterfaceC23470e emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            C10390Zp.this.f49293f.signOut().addOnCompleteListener(new OnCompleteListener() { // from class: aq
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C10390Zp.C10396f.m72448d(InterfaceC23470e.this, task);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: bq
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    C10390Zp.C10396f.m72447e(InterfaceC23470e.this, exc);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23470e interfaceC23470e) {
            m72449c(interfaceC23470e);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lco/bird/android/model/TokenPairState;", "it", C17296a.f69688o, "(Lco/bird/android/model/TokenPairState;)Lco/bird/android/model/TokenPairState;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zp$g */
    /* loaded from: classes2.dex */
    public static final class C10397g extends Lambda implements Function1<TokenPairState, TokenPairState> {

        /* renamed from: h */
        public final /* synthetic */ String f49308h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10397g(String str) {
            super(1);
            this.f49308h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final TokenPairState invoke(TokenPairState tokenPairState) {
            TokenPair tokenPair = C10390Zp.this.f49291d.m96324c(new C34958Oh6(this.f49308h)).m33132g();
            Intrinsics.checkNotNullExpressionValue(tokenPair, "tokenPair");
            return new TokenPairState(tokenPair, false);
        }
    }

    public C10390Zp(C51174wi2 deserializer, C22454gl preference, InterfaceC22767hq tokenManager, InterfaceC5093Lp client, InterfaceC36655Vo2 legacyClient, GoogleSignInClient googleSignInClient) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(tokenManager, "tokenManager");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(legacyClient, "legacyClient");
        Intrinsics.checkNotNullParameter(googleSignInClient, "googleSignInClient");
        this.f49288a = deserializer;
        this.f49289b = preference;
        this.f49290c = tokenManager;
        this.f49291d = client;
        this.f49292e = legacyClient;
        this.f49293f = googleSignInClient;
    }

    /* renamed from: j */
    public static final C47537qa1 m72466j(C10390Zp this$0, String email, String str) {
        C48722sa1 c48722sa1;
        boolean z;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(email, "$email");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        this$0.f49290c.mo15259h(new C10391a(objectRef, this$0, email, str));
        Object obj = objectRef.element;
        C48722sa1 c48722sa12 = null;
        if (obj == null) {
            Intrinsics.throwUninitializedPropertyAccessException(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT);
            c48722sa1 = null;
        } else {
            c48722sa1 = (C48722sa1) obj;
        }
        if (c48722sa1.m13990b() != null) {
            Object obj2 = objectRef.element;
            if (obj2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT);
            } else {
                c48722sa12 = (C48722sa1) obj2;
            }
            if (!c48722sa12.m13989c()) {
                z = false;
                return C47537qa1.m118445boximpl(C47537qa1.m17434a(z));
            }
        }
        z = true;
        return C47537qa1.m118445boximpl(C47537qa1.m17434a(z));
    }

    /* renamed from: k */
    public static final Optional m72465k(WireLocation wireLocation, C10390Zp this$0) {
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Optional.C14443a c14443a = Optional.f63040c;
        if (wireLocation != null) {
            str = this$0.f49288a.m6453i(wireLocation.toString());
        } else {
            str = null;
        }
        return c14443a.m59033b(str);
    }

    /* renamed from: l */
    public static final void m72464l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final InterfaceC23447K m72463m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final C47537qa1 m72462n(C10390Zp this$0, String idToken) {
        C48722sa1 c48722sa1;
        boolean z;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(idToken, "$idToken");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        this$0.f49290c.mo15259h(new C10394d(objectRef, this$0, idToken));
        Object obj = objectRef.element;
        C48722sa1 c48722sa12 = null;
        if (obj == null) {
            Intrinsics.throwUninitializedPropertyAccessException(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT);
            c48722sa1 = null;
        } else {
            c48722sa1 = (C48722sa1) obj;
        }
        if (c48722sa1.m13990b() != null) {
            Object obj2 = objectRef.element;
            if (obj2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT);
            } else {
                c48722sa12 = (C48722sa1) obj2;
            }
            if (!c48722sa12.m13989c()) {
                z = false;
                return C47537qa1.m118445boximpl(C47537qa1.m17434a(z));
            }
        }
        z = true;
        return C47537qa1.m118445boximpl(C47537qa1.m17434a(z));
    }

    /* renamed from: o */
    public static final Unit m72461o(C10390Zp this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f49290c.mo15256k(new C10395e());
        return Unit.INSTANCE;
    }

    /* renamed from: q */
    public static final Unit m72459q(C10390Zp this$0, String token) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(token, "$token");
        this$0.f49290c.mo15259h(new C10397g(token));
        return Unit.INSTANCE;
    }

    @Override // p000.InterfaceC7277Rp
    /* renamed from: b */
    public AbstractC23461c mo72474b() {
        AbstractC23461c m33063X = AbstractC23461c.m33078H(new Callable() { // from class: Xp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m72461o;
                m72461o = C10390Zp.m72461o(C10390Zp.this);
                return m72461o;
            }
        }).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "fromCallable {\n      tok…scribeOn(Schedulers.io())");
        return m33063X;
    }

    /* renamed from: i */
    public final AbstractC23442F<C47537qa1> m72467i(final String str, final String str2) {
        AbstractC23442F<C47537qa1> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: Vp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C47537qa1 m72466j;
                m72466j = C10390Zp.m72466j(C10390Zp.this, str, str2);
                return m72466j;
            }
        }).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      lat…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    /* renamed from: p */
    public final AbstractC23461c m72460p() {
        return C45832nh5.m23311e(new C10396f());
    }

    @Override // p000.InterfaceC7277Rp
    /* renamed from: s */
    public AbstractC23442F<C47537qa1> mo72458s(String email, final WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(email, "email");
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: Sp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Optional m72465k;
                m72465k = C10390Zp.m72465k(WireLocation.this, this);
                return m72465k;
            }
        });
        final C10392b c10392b = new C10392b(email);
        AbstractC23442F m33101w = m33161E.m33101w(new InterfaceC23484g() { // from class: Tp
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C10390Zp.m72464l(Function1.this, obj);
            }
        });
        final C10393c c10393c = new C10393c(email);
        AbstractC23442F<C47537qa1> m33165A = m33101w.m33165A(new InterfaceC23492o() { // from class: Up
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m72463m;
                m72463m = C10390Zp.m72463m(Function1.this, obj);
                return m72463m;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun login(email…der.orNull())\n      }\n  }");
        return m33165A;
    }

    @Override // p000.InterfaceC7277Rp
    /* renamed from: t */
    public AbstractC23442F<C47537qa1> mo72457t(final String idToken) {
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        AbstractC23442F<C47537qa1> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: Yp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C47537qa1 m72462n;
                m72462n = C10390Zp.m72462n(C10390Zp.this, idToken);
                return m72462n;
            }
        }).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      lat…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC7277Rp
    /* renamed from: u */
    public AbstractC23461c mo72456u(final String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        AbstractC23461c m33063X = AbstractC23461c.m33078H(new Callable() { // from class: Wp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m72459q;
                m72459q = C10390Zp.m72459q(C10390Zp.this, token);
                return m72459q;
            }
        }).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "fromCallable {\n      tok…scribeOn(Schedulers.io())");
        return m33063X;
    }
}
