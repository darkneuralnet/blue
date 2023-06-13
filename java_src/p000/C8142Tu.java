package p000;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\b\u0004B\u001d\u0012\u0014\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m28432d2 = {"LTu;", "T", "", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "LhZ0;", C17296a.f69688o, "[LhZ0;", "deferreds", "<init>", "([LhZ0;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Tu */
/* loaded from: classes8.dex */
public final class C8142Tu<T> {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f36422b = AtomicIntegerFieldUpdater.newUpdater(C8142Tu.class, "notCompletedCount");

    /* renamed from: a */
    public final InterfaceC42190hZ0<T>[] f36423a;
    volatile /* synthetic */ int notCompletedCount;

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R<\u0010\u001b\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0016\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LTu$a;", "LPh2;", "", "cause", "", "P", "(Ljava/lang/Throwable;)V", "LWc0;", "", "f", "LWc0;", "continuation", "Lo51;", "g", "Lo51;", "U", "()Lo51;", "W", "(Lo51;)V", "handle", "LTu$b;", "LTu;", "value", "T", "()LTu$b;", "V", "(LTu$b;)V", "disposer", "<init>", "(LTu;LWc0;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: Tu$a */
    /* loaded from: classes8.dex */
    public final class C8143a extends AbstractC35188Ph2 {
        private volatile /* synthetic */ Object _disposer = null;

        /* renamed from: f */
        public final InterfaceC36779Wc0<List<? extends T>> f36424f;

        /* renamed from: g */
        public InterfaceC46067o51 f36425g;

        /* JADX WARN: Multi-variable type inference failed */
        public C8143a(InterfaceC36779Wc0<? super List<? extends T>> interfaceC36779Wc0) {
            this.f36424f = interfaceC36779Wc0;
        }

        @Override // p000.AbstractC48901ss0
        /* renamed from: P */
        public void mo13153P(Throwable th) {
            if (th != null) {
                Object mo76790L = this.f36424f.mo76790L(th);
                if (mo76790L != null) {
                    this.f36424f.mo76800B(mo76790L);
                    C8142Tu<T>.C8144b m82281T = m82281T();
                    if (m82281T != null) {
                        m82281T.m82277b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C8142Tu.f36422b.decrementAndGet(C8142Tu.this) == 0) {
                InterfaceC36779Wc0<List<? extends T>> interfaceC36779Wc0 = this.f36424f;
                InterfaceC42190hZ0[] interfaceC42190hZ0Arr = C8142Tu.this.f36423a;
                ArrayList arrayList = new ArrayList(interfaceC42190hZ0Arr.length);
                for (InterfaceC42190hZ0 interfaceC42190hZ0 : interfaceC42190hZ0Arr) {
                    arrayList.add(interfaceC42190hZ0.mo29822g());
                }
                interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(arrayList));
            }
        }

        /* renamed from: T */
        public final C8142Tu<T>.C8144b m82281T() {
            return (C8144b) this._disposer;
        }

        /* renamed from: U */
        public final InterfaceC46067o51 m82280U() {
            InterfaceC46067o51 interfaceC46067o51 = this.f36425g;
            if (interfaceC46067o51 != null) {
                return interfaceC46067o51;
            }
            Intrinsics.throwUninitializedPropertyAccessException("handle");
            return null;
        }

        /* renamed from: V */
        public final void m82279V(C8142Tu<T>.C8144b c8144b) {
            this._disposer = c8144b;
        }

        /* renamed from: W */
        public final void m82278W(InterfaceC46067o51 interfaceC46067o51) {
            this.f36425g = interfaceC46067o51;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            mo13153P(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\r\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R$\u0010\r\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u0010"}, m28432d2 = {"LTu$b;", "LMc0;", "", "b", "", "cause", C17296a.f69688o, "", "toString", "", "LTu$a;", "LTu;", "[LTu$a;", "nodes", "<init>", "(LTu;[LTu$a;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: Tu$b */
    /* loaded from: classes8.dex */
    public final class C8144b extends AbstractC34439Mc0 {

        /* renamed from: b */
        public final C8142Tu<T>.C8143a[] f36427b;

        public C8144b(C8142Tu<T>.C8143a[] c8143aArr) {
            this.f36427b = c8143aArr;
        }

        @Override // p000.AbstractC34673Nc0
        /* renamed from: a */
        public void mo14797a(Throwable th) {
            m82277b();
        }

        /* renamed from: b */
        public final void m82277b() {
            for (C8142Tu<T>.C8143a c8143a : this.f36427b) {
                c8143a.m82280U().dispose();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            mo14797a(th);
            return Unit.INSTANCE;
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f36427b + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8142Tu(InterfaceC42190hZ0<? extends T>[] interfaceC42190hZ0Arr) {
        this.f36423a = interfaceC42190hZ0Arr;
        this.notCompletedCount = interfaceC42190hZ0Arr.length;
    }

    /* renamed from: b */
    public final Object m82282b(Continuation<? super List<? extends T>> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
        c37013Xc0.m76766u();
        int length = this.f36423a.length;
        C8143a[] c8143aArr = new C8143a[length];
        for (int i = 0; i < length; i++) {
            InterfaceC42190hZ0 interfaceC42190hZ0 = this.f36423a[i];
            interfaceC42190hZ0.start();
            C8143a c8143a = new C8143a(c37013Xc0);
            c8143a.m82278W(interfaceC42190hZ0.mo551n(c8143a));
            Unit unit = Unit.INSTANCE;
            c8143aArr[i] = c8143a;
        }
        C8142Tu<T>.C8144b c8144b = new C8144b(c8143aArr);
        for (int i2 = 0; i2 < length; i2++) {
            c8143aArr[i2].m82279V(c8144b);
        }
        if (c37013Xc0.mo76783c()) {
            c8144b.m82277b();
        } else {
            c37013Xc0.mo76794H(c8144b);
        }
        Object m76770q = c37013Xc0.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m76770q;
    }
}
