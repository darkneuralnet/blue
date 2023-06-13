package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m28432d2 = {"Lws5;", "LUq5;", "", "index", "", "q", "(I)V", "", "toString", "()Ljava/lang/String;", "n", "()I", "maxSlots", "", "id", "prev", "pointers", "<init>", "(JLws5;I)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: ws5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C51277ws5 extends AbstractC36442Uq5<C51277ws5> {

    /* renamed from: e */
    public /* synthetic */ AtomicReferenceArray f116700e;

    public C51277ws5(long j, C51277ws5 c51277ws5, int i) {
        super(j, c51277ws5, i);
        int i2;
        i2 = C50684vs5.f114834f;
        this.f116700e = new AtomicReferenceArray(i2);
    }

    @Override // p000.AbstractC36442Uq5
    /* renamed from: n */
    public int mo6196n() {
        int i;
        i = C50684vs5.f114834f;
        return i;
    }

    /* renamed from: q */
    public final void m6195q(int i) {
        C49885uX5 c49885uX5;
        c49885uX5 = C50684vs5.f114833e;
        this.f116700e.set(i, c49885uX5);
        m80764o();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + m80765m() + ", hashCode=" + hashCode() + ']';
    }
}
