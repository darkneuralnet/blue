package p000;

import androidx.work.AbstractC12126c;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.EG6;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, m28432d2 = {"LpQ3;", "LEG6;", "LpQ3$a;", "builder", "<init>", "(LpQ3$a;)V", "e", C17296a.f69688o, "b", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: pQ3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46856pQ3 extends EG6 {

    /* renamed from: e */
    public static final C27291b f103658e = new C27291b(null);

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B+\b\u0016\u0012\u0010\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00008PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"LpQ3$a;", "LEG6$a;", "LpQ3;", "l", "()LpQ3;", "m", "()LpQ3$a;", "thisObject", "Ljava/lang/Class;", "Landroidx/work/c;", "workerClass", "", "repeatInterval", "Ljava/util/concurrent/TimeUnit;", "repeatIntervalTimeUnit", "<init>", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: pQ3$a */
    /* loaded from: classes.dex */
    public static final class C27290a extends EG6.AbstractC1769a<C27290a, C46856pQ3> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27290a(Class<? extends AbstractC12126c> workerClass, long j, TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            m109253g().m104068k(repeatIntervalTimeUnit.toMillis(j));
        }

        @Override // p000.EG6.AbstractC1769a
        /* renamed from: l */
        public C46856pQ3 mo19321b() {
            boolean z;
            if (m109256c() && m109253g().f13200j.m26576h()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (!m109253g().f13207q) {
                    return new C46856pQ3(this);
                }
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        }

        @Override // p000.EG6.AbstractC1769a
        /* renamed from: m */
        public C27290a mo19320f() {
            return this;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LpQ3$b;", "", "", "MIN_PERIODIC_FLEX_MILLIS", "J", "MIN_PERIODIC_INTERVAL_MILLIS", "<init>", "()V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: pQ3$b */
    /* loaded from: classes.dex */
    public static final class C27291b {
        public /* synthetic */ C27291b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C27291b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46856pQ3(C27290a builder) {
        super(builder.m109255d(), builder.m109253g(), builder.m109254e());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }
}
