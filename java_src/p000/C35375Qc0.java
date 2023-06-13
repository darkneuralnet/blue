package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LQc0;", "LMc0;", "", "cause", "", C17296a.f69688o, "", "toString", "Lws5;", "b", "Lws5;", "segment", "", "c", "I", "index", "<init>", "(Lws5;I)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Qc0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C35375Qc0 extends AbstractC34439Mc0 {

    /* renamed from: b */
    public final C51277ws5 f30571b;

    /* renamed from: c */
    public final int f30572c;

    public C35375Qc0(C51277ws5 c51277ws5, int i) {
        this.f30571b = c51277ws5;
        this.f30572c = i;
    }

    @Override // p000.AbstractC34673Nc0
    /* renamed from: a */
    public void mo14797a(Throwable th) {
        this.f30571b.m6195q(this.f30572c);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo14797a(th);
        return Unit.INSTANCE;
    }

    public String toString() {
        return "CancelSemaphoreAcquisitionHandler[" + this.f30571b + ", " + this.f30572c + ']';
    }
}
