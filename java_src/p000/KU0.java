package p000;

import android.util.Log;
import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* renamed from: KU0 */
/* loaded from: classes6.dex */
public class KU0 implements InterfaceC7912Th {

    /* renamed from: f */
    public static final String f19671f = "KU0";

    /* renamed from: a */
    public final C52610z73 f19672a;

    /* renamed from: b */
    public final Executor f19673b;

    /* renamed from: c */
    public final Executor f19674c;

    /* renamed from: d */
    public final PN4 f19675d;

    /* renamed from: e */
    public final Task<String> f19676e;

    public KU0(C31722Am1 c31722Am1, X94<InterfaceC46671p62> x94, @InterfaceC36673Vq2 Executor executor, @InterfaceC10076Yv Executor executor2, @InterfaceC8305UW Executor executor3) {
        String str;
        Task<String> forResult;
        Preconditions.checkNotNull(c31722Am1);
        this.f19672a = new C52610z73(c31722Am1);
        this.f19673b = executor;
        this.f19674c = executor3;
        this.f19675d = new PN4();
        if (x94.get() != null) {
            str = x94.get().m19957a();
        } else {
            str = null;
        }
        if (str == null) {
            forResult = m98843e(c31722Am1, executor2);
        } else {
            forResult = Tasks.forResult(str);
        }
        this.f19676e = forResult;
    }

    /* renamed from: e */
    public static Task<String> m98843e(final C31722Am1 c31722Am1, Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: GU0
            @Override // java.lang.Runnable
            public final void run() {
                KU0.m98842f(C31722Am1.this, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: f */
    public static /* synthetic */ void m98842f(C31722Am1 c31722Am1, TaskCompletionSource taskCompletionSource) {
        C39141cR5 c39141cR5 = new C39141cR5(c31722Am1.m115293j(), c31722Am1.m115289n());
        String m61308a = c39141cR5.m61308a();
        if (m61308a == null) {
            m61308a = UUID.randomUUID().toString();
            c39141cR5.m61307b(m61308a);
        }
        String str = f19671f;
        Log.d(str, "Enter this debug secret into the allow list in the Firebase Console for your project: " + m61308a);
        taskCompletionSource.setResult(m61308a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ C9439Xh m98841g(C48792sh1 c48792sh1) throws Exception {
        return this.f19672a.m1777b(c48792sh1.m13823a().getBytes(Constants.DEFAULT_ENCODING), 2, this.f19675d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Task m98840h(String str) throws Exception {
        final C48792sh1 c48792sh1 = new C48792sh1(str);
        return Tasks.call(this.f19674c, new Callable() { // from class: JU0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C9439Xh m98841g;
                m98841g = KU0.this.m98841g(c48792sh1);
                return m98841g;
            }
        });
    }

    /* renamed from: i */
    public static /* synthetic */ Task m98839i(C9439Xh c9439Xh) throws Exception {
        return Tasks.forResult(C46907pW0.m19169c(c9439Xh));
    }

    @Override // p000.InterfaceC7912Th
    public Task<AbstractC8723Vh> getToken() {
        return this.f19676e.onSuccessTask(this.f19673b, new SuccessContinuation() { // from class: HU0
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m98840h;
                m98840h = KU0.this.m98840h((String) obj);
                return m98840h;
            }
        }).onSuccessTask(this.f19673b, new SuccessContinuation() { // from class: IU0
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m98839i;
                m98839i = KU0.m98839i((C9439Xh) obj);
                return m98839i;
            }
        });
    }
}
