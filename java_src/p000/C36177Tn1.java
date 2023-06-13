package p000;

import com.facebook.share.internal.C17296a;
import com.google.firebase.perf.metrics.Trace;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0001H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0011"}, m28432d2 = {"LTn1;", "Lb66;", "", "name", "value", "b", "", "incrementBy", C17296a.f69688o, "start", "", "stop", "Lcom/google/firebase/perf/metrics/Trace;", "Lcom/google/firebase/perf/metrics/Trace;", "trace", "<init>", "(Lcom/google/firebase/perf/metrics/Trace;)V", "co.bird.android.lib.performance"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFirebaseTrace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseTrace.kt\nco/bird/android/lib/performance/FirebaseTrace\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
/* renamed from: Tn1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36177Tn1 implements InterfaceC38356b66 {

    /* renamed from: a */
    public final Trace f36071a;

    public C36177Tn1(Trace trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        this.f36071a = trace;
    }

    @Override // p000.InterfaceC38356b66
    /* renamed from: a */
    public InterfaceC38356b66 mo64962a(String name, long j) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f36071a.incrementMetric(name, j);
        return this;
    }

    @Override // p000.InterfaceC38356b66
    /* renamed from: b */
    public InterfaceC38356b66 mo64961b(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f36071a.putAttribute(name, value);
        return this;
    }

    @Override // p000.InterfaceC38356b66
    public InterfaceC38356b66 start() {
        this.f36071a.start();
        return this;
    }

    @Override // p000.InterfaceC38356b66
    public void stop() {
        this.f36071a.stop();
    }
}
