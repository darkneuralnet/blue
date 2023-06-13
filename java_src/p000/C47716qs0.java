package p000;

import com.facebook.share.internal.C17296a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u000f"}, m28432d2 = {"Lqs0;", "", "", "b", "()Z", "", "toString", "()Ljava/lang/String;", "", C17296a.f69688o, "Ljava/lang/Throwable;", "cause", "handled", "<init>", "(Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: qs0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C47716qs0 {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f105941b = AtomicIntegerFieldUpdater.newUpdater(C47716qs0.class, "_handled");
    private volatile /* synthetic */ int _handled;
    @JvmField

    /* renamed from: a */
    public final Throwable f105942a;

    public C47716qs0(Throwable th, boolean z) {
        this.f105942a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: a */
    public final boolean m16901a() {
        return this._handled;
    }

    /* renamed from: b */
    public final boolean m16900b() {
        return f105941b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return C39783dV0.m44216a(this) + '[' + this.f105942a + ']';
    }

    public /* synthetic */ C47716qs0(Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
