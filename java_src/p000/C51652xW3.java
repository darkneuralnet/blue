package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* renamed from: xW3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C51652xW3 implements InterfaceC7912Th {

    /* renamed from: a */
    public final String f117744a;

    /* renamed from: b */
    public final S52 f117745b;

    /* renamed from: c */
    public final C52610z73 f117746c;

    /* renamed from: d */
    public final Executor f117747d;

    /* renamed from: e */
    public final Executor f117748e;

    /* renamed from: f */
    public final PN4 f117749f;

    public C51652xW3(C31722Am1 c31722Am1, @InterfaceC36673Vq2 Executor executor, @InterfaceC8305UW Executor executor2) {
        this(c31722Am1.m115290m().m18704d(), U52.m81995a(c31722Am1.m115293j()), new C52610z73(c31722Am1), executor, executor2, new PN4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ C44347lB1 m5092g(C43754kB1 c43754kB1) throws Exception {
        return C44347lB1.m27688a(this.f117746c.m1776c(c43754kB1.m29201a().getBytes(Constants.DEFAULT_ENCODING), this.f117749f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Task m5091h(C44347lB1 c44347lB1) throws Exception {
        return this.f117745b.mo12042a(V52.m80427a().mo79595b(Long.parseLong(this.f117744a)).mo79594c(c44347lB1.m27687b()).mo79596a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ C9439Xh m5090i(C49385th1 c49385th1) throws Exception {
        return this.f117746c.m1777b(c49385th1.m11921a().getBytes(Constants.DEFAULT_ENCODING), 3, this.f117749f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ Task m5089j(W52 w52) throws Exception {
        final C49385th1 c49385th1 = new C49385th1(w52.mo78850a());
        return Tasks.call(this.f117748e, new Callable() { // from class: wW3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C9439Xh m5090i;
                m5090i = C51652xW3.this.m5090i(c49385th1);
                return m5090i;
            }
        });
    }

    /* renamed from: k */
    public static /* synthetic */ Task m5088k(C9439Xh c9439Xh) throws Exception {
        return Tasks.forResult(C46907pW0.m19169c(c9439Xh));
    }

    /* renamed from: f */
    public final Task<W52> m5093f() {
        final C43754kB1 c43754kB1 = new C43754kB1();
        return Tasks.call(this.f117748e, new Callable() { // from class: uW3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C44347lB1 m5092g;
                m5092g = C51652xW3.this.m5092g(c43754kB1);
                return m5092g;
            }
        }).onSuccessTask(this.f117747d, new SuccessContinuation() { // from class: vW3
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m5091h;
                m5091h = C51652xW3.this.m5091h((C44347lB1) obj);
                return m5091h;
            }
        });
    }

    @Override // p000.InterfaceC7912Th
    public Task<AbstractC8723Vh> getToken() {
        return m5093f().onSuccessTask(this.f117747d, new SuccessContinuation() { // from class: sW3
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m5089j;
                m5089j = C51652xW3.this.m5089j((W52) obj);
                return m5089j;
            }
        }).onSuccessTask(this.f117747d, new SuccessContinuation() { // from class: tW3
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m5088k;
                m5088k = C51652xW3.m5088k((C9439Xh) obj);
                return m5088k;
            }
        });
    }

    public C51652xW3(String str, S52 s52, C52610z73 c52610z73, Executor executor, Executor executor2, PN4 pn4) {
        this.f117744a = str;
        this.f117745b = s52;
        this.f117746c = c52610z73;
        this.f117747d = executor;
        this.f117748e = executor2;
        this.f117749f = pn4;
    }
}
