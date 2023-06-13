package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"LO66;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/ContinuationInterceptor;", "b", "Lkotlin/coroutines/ContinuationInterceptor;", "e", "()Lkotlin/coroutines/ContinuationInterceptor;", "transactionDispatcher", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "c", C17296a.f69688o, "room-ktx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: O66 */
/* loaded from: classes.dex */
public final class O66 implements CoroutineContext.Element {

    /* renamed from: c */
    public static final C5824a f25904c = new C5824a(null);

    /* renamed from: b */
    public final ContinuationInterceptor f25905b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"LO66$a;", "Lkotlin/coroutines/CoroutineContext$Key;", "LO66;", "<init>", "()V", "room-ktx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: O66$a */
    /* loaded from: classes.dex */
    public static final class C5824a implements CoroutineContext.Key<O66> {
        public /* synthetic */ C5824a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5824a() {
        }
    }

    /* renamed from: e */
    public final ContinuationInterceptor m92901e() {
        return this.f25905b;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key<O66> getKey() {
        return f25904c;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }
}
