package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC32563Eb5;
import p000.InterfaceC45717nV5;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0014"}, m28432d2 = {"Landroidx/work/impl/WorkDatabase;", "LEb5;", "LIG6;", "I", "Lm01;", "D", "LMG6;", "J", "LXX5;", "F", "LeD6;", "G", "LzG6;", "H", "LRZ3;", "E", "<init>", "()V", "p", C17296a.f69688o, "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class WorkDatabase extends AbstractC32563Eb5 {

    /* renamed from: p */
    public static final C12131a f56223p = new C12131a(null);

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\f"}, m28432d2 = {"Landroidx/work/impl/WorkDatabase$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/util/concurrent/Executor;", "queryExecutor", "", "useTestDatabase", "Landroidx/work/impl/WorkDatabase;", "b", "<init>", "()V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: androidx.work.impl.WorkDatabase$a */
    /* loaded from: classes.dex */
    public static final class C12131a {
        public /* synthetic */ C12131a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static final InterfaceC45717nV5 m65555c(Context context, InterfaceC45717nV5.C26533b configuration) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            InterfaceC45717nV5.C26533b.C26534a m23585a = InterfaceC45717nV5.C26533b.f100065f.m23585a(context);
            m23585a.m23587d(configuration.f100067b).m23588c(configuration.f100068c).m23586e(true).m23590a(true);
            return new C36978Wy1().mo4888a(m23585a.m23589b());
        }

        @JvmStatic
        /* renamed from: b */
        public final WorkDatabase m65556b(final Context context, Executor queryExecutor, boolean z) {
            AbstractC32563Eb5.C1898a m108706f;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
            if (z) {
                m108706f = C32329Db5.m110124c(context, WorkDatabase.class).m108709c();
            } else {
                m108706f = C32329Db5.m110126a(context, WorkDatabase.class, "androidx.work.workdb").m108706f(new InterfaceC45717nV5.InterfaceC26536c() { // from class: KC6
                    @Override // p000.InterfaceC45717nV5.InterfaceC26536c
                    /* renamed from: a */
                    public final InterfaceC45717nV5 mo4888a(InterfaceC45717nV5.C26533b c26533b) {
                        InterfaceC45717nV5 m65555c;
                        m65555c = WorkDatabase.C12131a.m65555c(context, c26533b);
                        return m65555c;
                    }
                });
            }
            return (WorkDatabase) m108706f.m108705g(queryExecutor).m108711a(C35438Qj0.f30793a).m108710b(C41554gU2.f82328c).m108710b(new ZJ4(context, 2, 3)).m108710b(C42147hU2.f85283c).m108710b(C42740iU2.f87399c).m108710b(new ZJ4(context, 5, 6)).m108710b(C43333jU2.f92767c).m108710b(C43926kU2.f94429c).m108710b(C44519lU2.f96240c).m108710b(new C39016cD6(context)).m108710b(new ZJ4(context, 10, 11)).m108710b(C39776dU2.f76713c).m108710b(C40368eU2.f78430c).m108710b(C40961fU2.f80208c).m108707e().m108708d();
        }

        private C12131a() {
        }
    }

    @JvmStatic
    /* renamed from: C */
    public static final WorkDatabase m65558C(Context context, Executor executor, boolean z) {
        return f56223p.m65556b(context, executor, z);
    }

    /* renamed from: D */
    public abstract InterfaceC44831m01 mo65554D();

    /* renamed from: E */
    public abstract RZ3 mo65553E();

    /* renamed from: F */
    public abstract XX5 mo65552F();

    /* renamed from: G */
    public abstract InterfaceC40219eD6 mo65551G();

    /* renamed from: H */
    public abstract InterfaceC52697zG6 mo65550H();

    /* renamed from: I */
    public abstract IG6 mo65549I();

    /* renamed from: J */
    public abstract MG6 mo65548J();
}
