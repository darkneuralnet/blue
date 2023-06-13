package bo.app;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00018\u0000H'¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\r\u001a\u00020\u0006R\u0011\u0010\u000f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Lbo/app/a;", "T", "", "outboundObject", "", "isSuccessful", "", "b", "(Ljava/lang/Object;Z)V", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Object;", C17296a.f69688o, "(Ljava/lang/Object;Z)Z", "c", "()Z", "isLocked", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.a */
/* loaded from: classes.dex */
public abstract class AbstractC12501a<T> {

    /* renamed from: a */
    private final InterfaceC49499ts5 f58195a = C50684vs5.m7887b(1, 0, 2, null);

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"T", "", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.a$a */
    /* loaded from: classes.dex */
    public static final class C12502a extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ T f58196b;

        /* renamed from: c */
        final /* synthetic */ boolean f58197c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12502a(T t, boolean z) {
            super(0);
            this.f58196b = t;
            this.f58197c = z;
        }

        /* renamed from: a */
        public final String m63967a() {
            return "Tried to confirm outboundObject [" + this.f58196b + "] with success [" + this.f58197c + "], but the cache wasn't locked, so not doing anything.";
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
            return m63967a();
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"T", "", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.a$b */
    /* loaded from: classes.dex */
    public static final class C12503b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ AbstractC12501a<T> f58198b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12503b(AbstractC12501a<T> abstractC12501a) {
            super(0);
            this.f58198b = abstractC12501a;
        }

        /* renamed from: a */
        public final String m63966a() {
            return Intrinsics.stringPlus("Notifying confirmAndUnlock listeners for cache: ", this.f58198b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
            return m63966a();
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"T", "", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.a$c */
    /* loaded from: classes.dex */
    public static final class C12504c extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ AbstractC12501a<T> f58199b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12504c(AbstractC12501a<T> abstractC12501a) {
            super(0);
            this.f58199b = abstractC12501a;
        }

        /* renamed from: a */
        public final String m63965a() {
            return Intrinsics.stringPlus("Cache locked successfully for export: ", this.f58199b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
            return m63965a();
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"T", "", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.a$d */
    /* loaded from: classes.dex */
    public static final class C12505d extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12505d f58200b = new C12505d();

        static {
        }

        public C12505d() {
            super(0);
        }

        /* renamed from: a */
        public final String m63964a() {
            return "Received call to export dirty object, but the cache was already locked.";
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
            return m63964a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.storage.AbstractLockedCache$lockAndUnlock$1", m28418f = "AbstractLockedCache.kt", m28417i = {0}, m28416l = {90}, m28415m = "invokeSuspend", m28414n = {"$this$withPermit$iv"}, m28413s = {"L$0"})
    /* renamed from: bo.app.a$e */
    /* loaded from: classes.dex */
    public static final class C12506e extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: b */
        Object f58201b;

        /* renamed from: c */
        int f58202c;

        /* renamed from: d */
        final /* synthetic */ AbstractC12501a<T> f58203d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12506e(AbstractC12501a<T> abstractC12501a, Continuation<? super C12506e> continuation) {
            super(2, continuation);
            this.f58203d = abstractC12501a;
        }

        /* renamed from: a */
        public final Object m63963a(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C12506e) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C12506e(this.f58203d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return m63963a(zc0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            InterfaceC49499ts5 interfaceC49499ts5;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f58202c;
            if (i != 0) {
                if (i == 1) {
                    interfaceC49499ts5 = (InterfaceC49499ts5) this.f58201b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC49499ts5 interfaceC49499ts52 = ((AbstractC12501a) this.f58203d).f58195a;
                this.f58201b = interfaceC49499ts52;
                this.f58202c = 1;
                if (interfaceC49499ts52.mo9628c(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC49499ts5 = interfaceC49499ts52;
            }
            try {
                Unit unit = Unit.INSTANCE;
                interfaceC49499ts5.release();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                interfaceC49499ts5.release();
                throw th;
            }
        }
    }

    public AbstractC12501a() {
    }

    /* renamed from: b */
    public abstract void mo63140b(T t, boolean z);

    /* renamed from: b */
    public final boolean m63969b() {
        return this.f58195a.mo9629b() == 0;
    }

    /* renamed from: c */
    public final void m63968c() {
        Y30.m75794b(null, new C12506e(this, null), 1, null);
    }

    /* renamed from: d */
    public abstract T mo63134d();

    /* renamed from: a */
    public final synchronized T m63972a() {
        T t;
        if (this.f58195a.mo9630a()) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12504c(this), 7, null);
            t = mo63134d();
        } else {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12505d.f58200b, 7, null);
            t = null;
        }
        return t;
    }

    /* renamed from: a */
    public final synchronized boolean m63970a(T t, boolean z) {
        if (this.f58195a.mo9629b() != 0) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C12502a(t, z), 6, null);
            return false;
        }
        mo63140b(t, z);
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C12503b(this), 6, null);
        this.f58195a.release();
        return true;
    }
}
