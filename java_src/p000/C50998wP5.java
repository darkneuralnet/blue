package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m28432d2 = {"LwP5;", "Lq1;", "LuP5;", "flow", "", "c", "(LuP5;)Z", "", "Lkotlin/coroutines/Continuation;", "", "e", "(LuP5;)[Lkotlin/coroutines/Continuation;", "f", "()V", "g", "()Z", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: wP5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50998wP5 extends AbstractC27450q1<C49813uP5<?>> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f115922a = AtomicReferenceFieldUpdater.newUpdater(C50998wP5.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    @Override // p000.AbstractC27450q1
    /* renamed from: c */
    public boolean mo6872a(C49813uP5<?> c49813uP5) {
        C49885uX5 c49885uX5;
        if (this._state != null) {
            return false;
        }
        c49885uX5 = C50405vP5.f114015a;
        this._state = c49885uX5;
        return true;
    }

    /* renamed from: d */
    public final Object m6869d(Continuation<? super Unit> continuation) {
        Continuation intercepted;
        C49885uX5 c49885uX5;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
        c37013Xc0.m76766u();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f115922a;
        c49885uX5 = C50405vP5.f114015a;
        if (!C22859i1.m35391a(atomicReferenceFieldUpdater, this, c49885uX5, c37013Xc0)) {
            Result.Companion companion = Result.Companion;
            c37013Xc0.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
        }
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

    @Override // p000.AbstractC27450q1
    /* renamed from: e */
    public Continuation<Unit>[] mo6871b(C49813uP5<?> c49813uP5) {
        this._state = null;
        return C27124p1.f102946a;
    }

    /* renamed from: f */
    public final void m6867f() {
        C49885uX5 c49885uX5;
        C49885uX5 c49885uX52;
        C49885uX5 c49885uX53;
        C49885uX5 c49885uX54;
        while (true) {
            Object obj = this._state;
            if (obj == null) {
                return;
            }
            c49885uX5 = C50405vP5.f114016b;
            if (obj == c49885uX5) {
                return;
            }
            c49885uX52 = C50405vP5.f114015a;
            if (obj == c49885uX52) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f115922a;
                c49885uX53 = C50405vP5.f114016b;
                if (C22859i1.m35391a(atomicReferenceFieldUpdater, this, obj, c49885uX53)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f115922a;
                c49885uX54 = C50405vP5.f114015a;
                if (C22859i1.m35391a(atomicReferenceFieldUpdater2, this, obj, c49885uX54)) {
                    Result.Companion companion = Result.Companion;
                    ((C37013Xc0) obj).resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public final boolean m6866g() {
        C49885uX5 c49885uX5;
        C49885uX5 c49885uX52;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f115922a;
        c49885uX5 = C50405vP5.f114015a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, c49885uX5);
        Intrinsics.checkNotNull(andSet);
        c49885uX52 = C50405vP5.f114016b;
        if (andSet == c49885uX52) {
            return true;
        }
        return false;
    }
}
