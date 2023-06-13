package p000;

import android.content.Context;
import android.util.Base64OutputStream;
import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.InterfaceC50338vI1;
/* renamed from: tX0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C49287tX0 implements InterfaceC49746uI1, InterfaceC50338vI1 {

    /* renamed from: a */
    public final X94<CI1> f110618a;

    /* renamed from: b */
    public final Context f110619b;

    /* renamed from: c */
    public final X94<InterfaceC42265hg6> f110620c;

    /* renamed from: d */
    public final Set<InterfaceC48560sI1> f110621d;

    /* renamed from: e */
    public final Executor f110622e;

    public C49287tX0(final Context context, final String str, Set<InterfaceC48560sI1> set, X94<InterfaceC42265hg6> x94, Executor executor) {
        this(new X94() { // from class: sX0
            @Override // p000.X94
            public final Object get() {
                CI1 m12154j;
                m12154j = C49287tX0.m12154j(context, str);
                return m12154j;
            }
        }, set, executor, x94, context);
    }

    /* renamed from: g */
    public static C32711Es0<C49287tX0> m12157g() {
        final C52292yb4 m3203a = C52292yb4.m3203a(InterfaceC10076Yv.class, Executor.class);
        return C32711Es0.m108308f(C49287tX0.class, InterfaceC49746uI1.class, InterfaceC50338vI1.class).m108292b(C43645k01.m29483k(Context.class)).m108292b(C43645k01.m29483k(C31722Am1.class)).m108292b(C43645k01.m29481m(InterfaceC48560sI1.class)).m108292b(C43645k01.m29482l(InterfaceC42265hg6.class)).m108292b(C43645k01.m29484j(m3203a)).m108288f(new InterfaceC36455Us0() { // from class: rX0
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                C49287tX0 m12156h;
                m12156h = C49287tX0.m12156h(C52292yb4.this, interfaceC35051Os0);
                return m12156h;
            }
        }).m108290d();
    }

    /* renamed from: h */
    public static /* synthetic */ C49287tX0 m12156h(C52292yb4 c52292yb4, InterfaceC35051Os0 interfaceC35051Os0) {
        return new C49287tX0((Context) interfaceC35051Os0.get(Context.class), ((C31722Am1) interfaceC35051Os0.get(C31722Am1.class)).m115289n(), interfaceC35051Os0.m91274b(InterfaceC48560sI1.class), interfaceC35051Os0.mo85622d(InterfaceC42265hg6.class), (Executor) interfaceC35051Os0.mo85623c(c52292yb4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ String m12155i() throws Exception {
        String byteArrayOutputStream;
        synchronized (this) {
            CI1 ci1 = this.f110618a.get();
            List<DI1> m112383c = ci1.m112383c();
            ci1.m112384b();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < m112383c.size(); i++) {
                DI1 di1 = m112383c.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", di1.mo110606c());
                jSONObject.put("dates", new JSONArray((Collection) di1.mo110607b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
            try {
                gZIPOutputStream.write(jSONObject2.toString().getBytes(Constants.DEFAULT_ENCODING));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString(Constants.DEFAULT_ENCODING);
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    /* renamed from: j */
    public static /* synthetic */ CI1 m12154j(Context context, String str) {
        return new CI1(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Void m12153k() throws Exception {
        synchronized (this) {
            this.f110618a.get().m112375k(System.currentTimeMillis(), this.f110620c.get().mo36101a());
        }
        return null;
    }

    @Override // p000.InterfaceC50338vI1
    /* renamed from: a */
    public synchronized InterfaceC50338vI1.EnumC29474a mo8930a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        CI1 ci1 = this.f110618a.get();
        if (ci1.m112377i(currentTimeMillis)) {
            ci1.m112379g();
            return InterfaceC50338vI1.EnumC29474a.GLOBAL;
        }
        return InterfaceC50338vI1.EnumC29474a.NONE;
    }

    @Override // p000.InterfaceC49746uI1
    /* renamed from: b */
    public Task<String> mo10477b() {
        if (!C45240mh6.m25160a(this.f110619b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f110622e, new Callable() { // from class: qX0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String m12155i;
                m12155i = C49287tX0.this.m12155i();
                return m12155i;
            }
        });
    }

    /* renamed from: l */
    public Task<Void> m12152l() {
        if (this.f110621d.size() <= 0) {
            return Tasks.forResult(null);
        }
        if (!C45240mh6.m25160a(this.f110619b)) {
            return Tasks.forResult(null);
        }
        return Tasks.call(this.f110622e, new Callable() { // from class: pX0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m12153k;
                m12153k = C49287tX0.this.m12153k();
                return m12153k;
            }
        });
    }

    public C49287tX0(X94<CI1> x94, Set<InterfaceC48560sI1> set, Executor executor, X94<InterfaceC42265hg6> x942, Context context) {
        this.f110618a = x94;
        this.f110621d = set;
        this.f110622e = executor;
        this.f110620c = x942;
        this.f110619b = context;
    }
}
