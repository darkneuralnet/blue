package p000;

import android.os.Handler;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.GraphRequest;
import com.facebook.share.internal.C17296a;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0016\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0011\u000e\u000bB\t\b\u0016¢\u0006\u0004\b<\u0010=B\u0017\b\u0016\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020>¢\u0006\u0004\b<\u0010?B\u001d\b\u0016\u0012\u0012\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020@\"\u00020\u0002¢\u0006\u0004\b<\u0010AJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0011\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0019\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0006\u0010\u0017\u001a\u00020\u0006R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R0\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R0\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b.\u0010,R$\u00104\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010#\u001a\u0004\b1\u0010%\"\u0004\b2\u00103R$\u00109\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00106¨\u0006C"}, m28432d2 = {"LVD1;", "Ljava/util/AbstractList;", "Lcom/facebook/GraphRequest;", "", "LWD1;", "h", "LUD1;", "o", "LVD1$a;", "callback", "", "c", "element", "", "b", "", "index", C17296a.f69688o, "clear", "s", "F", "G", "f", "j", "Landroid/os/Handler;", "Landroid/os/Handler;", "v", "()Landroid/os/Handler;", "H", "(Landroid/os/Handler;)V", "callbackHandler", "I", "timeoutInMilliseconds", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "x", "()Ljava/lang/String;", "id", "", "<set-?>", "e", "Ljava/util/List;", "y", "()Ljava/util/List;", "requests", "w", "callbacks", "g", "u", "setBatchApplicationId", "(Ljava/lang/String;)V", "batchApplicationId", "A", "()I", "setTimeout", "(I)V", "timeout", "z", "size", "<init>", "()V", "", "(Ljava/util/Collection;)V", "", "([Lcom/facebook/GraphRequest;)V", "i", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: VD1 */
/* loaded from: classes5.dex */
public final class VD1 extends AbstractList<GraphRequest> {

    /* renamed from: b */
    public Handler f38745b;

    /* renamed from: c */
    public int f38746c;

    /* renamed from: d */
    public final String f38747d;

    /* renamed from: e */
    public List<GraphRequest> f38748e;

    /* renamed from: f */
    public List<InterfaceC8575a> f38749f;

    /* renamed from: g */
    public String f38750g;

    /* renamed from: i */
    public static final C8576b f38744i = new C8576b(null);

    /* renamed from: h */
    public static final AtomicInteger f38743h = new AtomicInteger();

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LVD1$a;", "", "LVD1;", "batch", "", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: VD1$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC8575a {
        /* renamed from: a */
        void mo52308a(VD1 vd1);
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LVD1$b;", "", "Ljava/util/concurrent/atomic/AtomicInteger;", "idGenerator", "Ljava/util/concurrent/atomic/AtomicInteger;", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: VD1$b */
    /* loaded from: classes5.dex */
    public static final class C8576b {
        private C8576b() {
        }

        public /* synthetic */ C8576b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¨\u0006\t"}, m28432d2 = {"LVD1$c;", "LVD1$a;", "LVD1;", "batch", "", "current", "max", "", "b", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: VD1$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC8577c extends InterfaceC8575a {
        /* renamed from: b */
        void m80209b(VD1 vd1, long j, long j2);
    }

    public VD1() {
        this.f38747d = String.valueOf(f38743h.incrementAndGet());
        this.f38749f = new ArrayList();
        this.f38748e = new ArrayList();
    }

    /* renamed from: A */
    public final int m80231A() {
        return this.f38746c;
    }

    /* renamed from: C */
    public /* bridge */ int m80230C(GraphRequest graphRequest) {
        return super.indexOf(graphRequest);
    }

    /* renamed from: D */
    public /* bridge */ int m80229D(GraphRequest graphRequest) {
        return super.lastIndexOf(graphRequest);
    }

    /* renamed from: E */
    public /* bridge */ boolean m80228E(GraphRequest graphRequest) {
        return super.remove(graphRequest);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: F */
    public GraphRequest remove(int i) {
        return this.f38748e.remove(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: G */
    public GraphRequest set(int i, GraphRequest element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f38748e.set(i, element);
    }

    /* renamed from: H */
    public final void m80225H(Handler handler) {
        this.f38745b = handler;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, GraphRequest element) {
        Intrinsics.checkNotNullParameter(element, "element");
        this.f38748e.add(i, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b */
    public boolean add(GraphRequest element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f38748e.add(element);
    }

    /* renamed from: c */
    public final void m80222c(InterfaceC8575a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!this.f38749f.contains(callback)) {
            this.f38749f.add(callback);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f38748e.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null ? obj instanceof GraphRequest : true) {
            return m80221e((GraphRequest) obj);
        }
        return false;
    }

    /* renamed from: e */
    public /* bridge */ boolean m80221e(GraphRequest graphRequest) {
        return super.contains(graphRequest);
    }

    /* renamed from: f */
    public final List<WD1> m80220f() {
        return m80219h();
    }

    /* renamed from: h */
    public final List<WD1> m80219h() {
        return GraphRequest.f69390s.m52797g(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj != null ? obj instanceof GraphRequest : true) {
            return m80230C((GraphRequest) obj);
        }
        return -1;
    }

    /* renamed from: j */
    public final UD1 m80218j() {
        return m80217o();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj != null ? obj instanceof GraphRequest : true) {
            return m80229D((GraphRequest) obj);
        }
        return -1;
    }

    /* renamed from: o */
    public final UD1 m80217o() {
        return GraphRequest.f69390s.m52794j(this);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: s */
    public GraphRequest get(int i) {
        return this.f38748e.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return m80210z();
    }

    /* renamed from: u */
    public final String m80215u() {
        return this.f38750g;
    }

    /* renamed from: v */
    public final Handler m80214v() {
        return this.f38745b;
    }

    /* renamed from: w */
    public final List<InterfaceC8575a> m80213w() {
        return this.f38749f;
    }

    /* renamed from: x */
    public final String m80212x() {
        return this.f38747d;
    }

    /* renamed from: y */
    public final List<GraphRequest> m80211y() {
        return this.f38748e;
    }

    /* renamed from: z */
    public int m80210z() {
        return this.f38748e.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj != null ? obj instanceof GraphRequest : true) {
            return m80228E((GraphRequest) obj);
        }
        return false;
    }

    public VD1(Collection<GraphRequest> requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f38747d = String.valueOf(f38743h.incrementAndGet());
        this.f38749f = new ArrayList();
        this.f38748e = new ArrayList(requests);
    }

    public VD1(GraphRequest... requests) {
        List asList;
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f38747d = String.valueOf(f38743h.incrementAndGet());
        this.f38749f = new ArrayList();
        asList = ArraysKt___ArraysJvmKt.asList(requests);
        this.f38748e = new ArrayList(asList);
    }
}
