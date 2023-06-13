package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\"\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m28432d2 = {"Ldm2;", "", "", DateTokenConverter.CONVERTER_KEY, "f", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", C17296a.f69688o, "Ljava/lang/Object;", "lock", "", "Lkotlin/coroutines/Continuation;", "b", "Ljava/util/List;", "awaiters", "spareList", "", "Z", "_isOpen", "e", "()Z", "isOpen", "<init>", "()V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,90:1\n70#2:91\n70#2:92\n70#2:93\n70#2:103\n314#3,9:94\n323#3,2:104\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n*L\n39#1:91\n51#1:92\n57#1:93\n79#1:103\n78#1:94,9\n78#1:104,2\n*E\n"})
/* renamed from: dm2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39950dm2 {

    /* renamed from: a */
    public final Object f77185a = new Object();

    /* renamed from: b */
    public List<Continuation<Unit>> f77186b = new ArrayList();

    /* renamed from: c */
    public List<Continuation<Unit>> f77187c = new ArrayList();

    /* renamed from: d */
    public boolean f77188d = true;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch$await$2$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,90:1\n70#2:91\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch$await$2$2\n*L\n84#1:91\n*E\n"})
    /* renamed from: dm2$a */
    /* loaded from: classes.dex */
    public static final class C19857a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC36779Wc0<Unit> f77190h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19857a(InterfaceC36779Wc0<? super Unit> interfaceC36779Wc0) {
            super(1);
            this.f77190h = interfaceC36779Wc0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            Object obj = C39950dm2.this.f77185a;
            C39950dm2 c39950dm2 = C39950dm2.this;
            InterfaceC36779Wc0<Unit> interfaceC36779Wc0 = this.f77190h;
            synchronized (obj) {
                c39950dm2.f77186b.remove(interfaceC36779Wc0);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* renamed from: c */
    public final Object m43728c(Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        if (m43726e()) {
            return Unit.INSTANCE;
        }
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
        c37013Xc0.m76766u();
        synchronized (this.f77185a) {
            this.f77186b.add(c37013Xc0);
        }
        c37013Xc0.mo76794H(new C19857a(c37013Xc0));
        Object m76770q = c37013Xc0.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended2) {
            return m76770q;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: d */
    public final void m43727d() {
        synchronized (this.f77185a) {
            this.f77188d = false;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: e */
    public final boolean m43726e() {
        boolean z;
        synchronized (this.f77185a) {
            z = this.f77188d;
        }
        return z;
    }

    /* renamed from: f */
    public final void m43725f() {
        synchronized (this.f77185a) {
            if (m43726e()) {
                return;
            }
            List<Continuation<Unit>> list = this.f77186b;
            this.f77186b = this.f77187c;
            this.f77187c = list;
            this.f77188d = true;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Result.Companion companion = Result.Companion;
                list.get(i).resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
            }
            list.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
