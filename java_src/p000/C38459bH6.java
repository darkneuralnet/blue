package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.WS0;
import p000.YD3;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\u001b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00180\u0017¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u0010\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000eH\u0016J*\u0010\u0013\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0012H\u0016J*\u0010\u0014\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0012H\u0016R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R,\u0010\u001b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001d¨\u0006!"}, m28432d2 = {"LbH6;", "", "K", "A", "B", "LYD3;", "LWS0$d;", "onInvalidatedCallback", "", "c", "k", "f", "LYD3$c;", "params", "LYD3$b;", "callback", "v", "LYD3$d;", "LYD3$a;", "t", "r", "LYD3;", Stripe3ds2AuthParams.FIELD_SOURCE, "LxA1;", "", "g", "LxA1;", "listFunction", "", "()Z", "isInvalid", "<init>", "(LYD3;LxA1;)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: bH6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38459bH6<K, A, B> extends YD3<K, B> {

    /* renamed from: f */
    public final YD3<K, A> f57224f;

    /* renamed from: g */
    public final InterfaceC51452xA1<List<A>, List<B>> f57225g;

    @Metadata(m28433d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J'\u0010\u0006\u001a\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"bH6$a", "LYD3$a;", "", MessageExtension.FIELD_DATA, "adjacentPageKey", "", C17296a.f69688o, "(Ljava/util/List;Ljava/lang/Object;)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: bH6$a */
    /* loaded from: classes.dex */
    public static final class C12349a extends YD3.AbstractC9707a<K, A> {

        /* renamed from: a */
        public final /* synthetic */ YD3.AbstractC9707a<K, B> f57226a;

        /* renamed from: b */
        public final /* synthetic */ C38459bH6<K, A, B> f57227b;

        public C12349a(YD3.AbstractC9707a<K, B> abstractC9707a, C38459bH6<K, A, B> c38459bH6) {
            this.f57226a = abstractC9707a;
            this.f57227b = c38459bH6;
        }

        @Override // p000.YD3.AbstractC9707a
        /* renamed from: a */
        public void mo64717a(List<? extends A> data, K k) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f57226a.mo64717a(WS0.f41027e.m78421a(this.f57227b.f57225g, data), k);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J'\u0010\u0006\u001a\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"bH6$b", "LYD3$a;", "", MessageExtension.FIELD_DATA, "adjacentPageKey", "", C17296a.f69688o, "(Ljava/util/List;Ljava/lang/Object;)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: bH6$b */
    /* loaded from: classes.dex */
    public static final class C12350b extends YD3.AbstractC9707a<K, A> {

        /* renamed from: a */
        public final /* synthetic */ YD3.AbstractC9707a<K, B> f57228a;

        /* renamed from: b */
        public final /* synthetic */ C38459bH6<K, A, B> f57229b;

        public C12350b(YD3.AbstractC9707a<K, B> abstractC9707a, C38459bH6<K, A, B> c38459bH6) {
            this.f57228a = abstractC9707a;
            this.f57229b = c38459bH6;
        }

        @Override // p000.YD3.AbstractC9707a
        /* renamed from: a */
        public void mo64717a(List<? extends A> data, K k) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f57228a.mo64717a(WS0.f41027e.m78421a(this.f57229b.f57225g, data), k);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001JA\u0010\n\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m28432d2 = {"bH6$c", "LYD3$b;", "", MessageExtension.FIELD_DATA, "", "position", "totalCount", "previousPageKey", "nextPageKey", "", C17296a.f69688o, "(Ljava/util/List;IILjava/lang/Object;Ljava/lang/Object;)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: bH6$c */
    /* loaded from: classes.dex */
    public static final class C12351c extends YD3.AbstractC9708b<K, A> {

        /* renamed from: a */
        public final /* synthetic */ C38459bH6<K, A, B> f57230a;

        /* renamed from: b */
        public final /* synthetic */ YD3.AbstractC9708b<K, B> f57231b;

        public C12351c(C38459bH6<K, A, B> c38459bH6, YD3.AbstractC9708b<K, B> abstractC9708b) {
            this.f57230a = c38459bH6;
            this.f57231b = abstractC9708b;
        }

        @Override // p000.YD3.AbstractC9708b
        /* renamed from: a */
        public void mo64716a(List<? extends A> data, int i, int i2, K k, K k2) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f57231b.mo64716a(WS0.f41027e.m78421a(this.f57230a.f57225g, data), i, i2, k, k2);
        }
    }

    public C38459bH6(YD3<K, A> source, InterfaceC51452xA1<List<A>, List<B>> listFunction) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(listFunction, "listFunction");
        this.f57224f = source;
        this.f57225g = listFunction;
    }

    @Override // p000.WS0
    /* renamed from: c */
    public void mo64721c(WS0.InterfaceC9028d onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.f57224f.mo64721c(onInvalidatedCallback);
    }

    @Override // p000.WS0
    /* renamed from: f */
    public void mo64720f() {
        this.f57224f.mo64720f();
    }

    @Override // p000.WS0
    /* renamed from: g */
    public boolean mo64719g() {
        return this.f57224f.mo64719g();
    }

    @Override // p000.WS0
    /* renamed from: k */
    public void mo64718k(WS0.InterfaceC9028d onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.f57224f.mo64718k(onInvalidatedCallback);
    }

    @Override // p000.YD3
    /* renamed from: r */
    public void mo20029r(YD3.C9710d<K> params, YD3.AbstractC9707a<K, B> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f57224f.mo20029r(params, new C12349a(callback, this));
    }

    @Override // p000.YD3
    /* renamed from: t */
    public void mo20028t(YD3.C9710d<K> params, YD3.AbstractC9707a<K, B> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f57224f.mo20028t(params, new C12350b(callback, this));
    }

    @Override // p000.YD3
    /* renamed from: v */
    public void mo20027v(YD3.C9709c<K> params, YD3.AbstractC9708b<K, B> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f57224f.mo20027v(params, new C12351c(this, callback));
    }
}
