package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import p000.AbstractC36442Uq5;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005¨\u0006\u001a"}, m28432d2 = {"LUq5;", "S", "LBu0;", "", "p", "()Z", "l", "", "o", "()V", "", "c", "J", "m", "()J", "id", "", "n", "()I", "maxSlots", "g", "removed", "prev", "pointers", "<init>", "(JLUq5;I)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Uq5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC36442Uq5<S extends AbstractC36442Uq5<S>> extends AbstractC32027Bu0<S> {

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f38106d = AtomicIntegerFieldUpdater.newUpdater(AbstractC36442Uq5.class, "cleanedAndPointers");

    /* renamed from: c */
    public final long f38107c;
    private volatile /* synthetic */ int cleanedAndPointers;

    public AbstractC36442Uq5(long j, S s, int i) {
        super(s);
        this.f38107c = j;
        this.cleanedAndPointers = i << 16;
    }

    @Override // p000.AbstractC32027Bu0
    /* renamed from: g */
    public boolean mo80767g() {
        return this.cleanedAndPointers == mo6196n() && !m113378i();
    }

    /* renamed from: l */
    public final boolean m80766l() {
        return f38106d.addAndGet(this, -65536) == mo6196n() && !m113378i();
    }

    /* renamed from: m */
    public final long m80765m() {
        return this.f38107c;
    }

    /* renamed from: n */
    public abstract int mo6196n();

    /* renamed from: o */
    public final void m80764o() {
        if (f38106d.incrementAndGet(this) != mo6196n() || m113378i()) {
            return;
        }
        m113377j();
    }

    /* renamed from: p */
    public final boolean m80763p() {
        int i;
        boolean z;
        do {
            i = this.cleanedAndPointers;
            if (i == mo6196n() && !m113378i()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
        } while (!f38106d.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
