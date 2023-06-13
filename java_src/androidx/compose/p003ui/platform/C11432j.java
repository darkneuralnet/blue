package androidx.compose.p003ui.platform;

import com.facebook.share.internal.C17296a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"Landroidx/compose/ui/platform/j;", "", "", C17296a.f69688o, "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "started", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.j */
/* loaded from: classes.dex */
public final class C11432j {

    /* renamed from: a */
    public static final C11432j f53379a = new C11432j();

    /* renamed from: b */
    public static final AtomicBoolean f53380b = new AtomicBoolean(false);

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", m28418f = "GlobalSnapshotManager.android.kt", m28417i = {0}, m28416l = {63}, m28415m = "invokeSuspend", m28414n = {"$this$consume$iv$iv"}, m28413s = {"L$0"})
    @SourceDebugExtension({"SMAP\nGlobalSnapshotManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalSnapshotManager.android.kt\nandroidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,55:1\n103#2:56\n80#2,6:57\n104#2,2:63\n90#2:65\n86#2,4:66\n*S KotlinDebug\n*F\n+ 1 GlobalSnapshotManager.android.kt\nandroidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1\n*L\n45#1:56\n45#1:57,6\n45#1:63,2\n45#1:65\n45#1:66,4\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.j$a */
    /* loaded from: classes.dex */
    public static final class C11433a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public Object f53381h;

        /* renamed from: i */
        public Object f53382i;

        /* renamed from: j */
        public int f53383j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC32846Fh0<Unit> f53384k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11433a(InterfaceC32846Fh0<Unit> interfaceC32846Fh0, Continuation<? super C11433a> continuation) {
            super(2, continuation);
            this.f53384k = interfaceC32846Fh0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C11433a(this.f53384k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C11433a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:16:0x0041, B:18:0x0049), top: B:29:0x0041 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003b -> B:29:0x0041). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            InterfaceC44162ks4 interfaceC44162ks4;
            InterfaceC34952Oh0 it;
            C11433a c11433a;
            Object mo31286a;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f53383j;
            try {
                if (i != 0) {
                    if (i == 1) {
                        InterfaceC34952Oh0 interfaceC34952Oh0 = (InterfaceC34952Oh0) this.f53382i;
                        InterfaceC44162ks4 interfaceC44162ks42 = (InterfaceC44162ks4) this.f53381h;
                        ResultKt.throwOnFailure(obj);
                        InterfaceC44162ks4 interfaceC44162ks43 = interfaceC44162ks42;
                        InterfaceC34952Oh0 interfaceC34952Oh02 = interfaceC34952Oh0;
                        Object obj2 = coroutine_suspended;
                        C11433a c11433a2 = this;
                        try {
                            if (!((Boolean) obj).booleanValue()) {
                                Unit unit = (Unit) interfaceC34952Oh02.next();
                                AbstractC48600sM5.f108670e.m14275g();
                                c11433a = c11433a2;
                                coroutine_suspended = obj2;
                                it = interfaceC34952Oh02;
                                interfaceC44162ks4 = interfaceC44162ks43;
                                c11433a.f53381h = interfaceC44162ks4;
                                c11433a.f53382i = it;
                                c11433a.f53383j = 1;
                                mo31286a = it.mo31286a(c11433a);
                                if (mo31286a != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                Object obj3 = coroutine_suspended;
                                c11433a2 = c11433a;
                                obj = mo31286a;
                                interfaceC44162ks43 = interfaceC44162ks4;
                                interfaceC34952Oh02 = it;
                                obj2 = obj3;
                                if (!((Boolean) obj).booleanValue()) {
                                    C35654Rh0.m86443a(interfaceC44162ks43, null);
                                    return Unit.INSTANCE;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            interfaceC44162ks4 = interfaceC44162ks43;
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                C35654Rh0.m86443a(interfaceC44162ks4, th);
                                throw th2;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    interfaceC44162ks4 = this.f53384k;
                    it = interfaceC44162ks4.iterator();
                    c11433a = this;
                    c11433a.f53381h = interfaceC44162ks4;
                    c11433a.f53382i = it;
                    c11433a.f53383j = 1;
                    mo31286a = it.mo31286a(c11433a);
                    if (mo31286a != coroutine_suspended) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.platform.j$b */
    /* loaded from: classes.dex */
    public static final class C11434b extends Lambda implements Function1<Object, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC32846Fh0<Unit> f53385g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11434b(InterfaceC32846Fh0<Unit> interfaceC32846Fh0) {
            super(1);
            this.f53385g = interfaceC32846Fh0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f53385g.mo2349h(Unit.INSTANCE);
        }
    }

    private C11432j() {
    }

    /* renamed from: a */
    public final void m68291a() {
        if (f53380b.compareAndSet(false, true)) {
            InterfaceC32846Fh0 m89918b = C35186Ph0.m89918b(-1, null, null, 6, null);
            Z30.m73800d(C37824aD0.m71790a(C11426i.f53362m.m68292b()), null, null, new C11433a(m89918b, null), 3, null);
            AbstractC48600sM5.f108670e.m14276f(new C11434b(m89918b));
        }
    }
}
