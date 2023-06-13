package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 \n2\u00020\u0001:\u0001\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m28432d2 = {"LPV2;", "Lkotlin/coroutines/CoroutineContext$Element;", "", "I", "()F", "scaleFactor", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "d0", "b", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: PV2 */
/* loaded from: classes.dex */
public interface PV2 extends CoroutineContext.Element {

    /* renamed from: d0 */
    public static final C6384b f28583d0 = C6384b.f28584b;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: PV2$a */
    /* loaded from: classes.dex */
    public static final class C6383a {
        /* renamed from: a */
        public static <R> R m90183a(PV2 pv2, R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) CoroutineContext.Element.DefaultImpls.fold(pv2, r, operation);
        }

        /* renamed from: b */
        public static <E extends CoroutineContext.Element> E m90182b(PV2 pv2, CoroutineContext.Key<E> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (E) CoroutineContext.Element.DefaultImpls.get(pv2, key);
        }

        /* renamed from: c */
        public static CoroutineContext m90181c(PV2 pv2, CoroutineContext.Key<?> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return CoroutineContext.Element.DefaultImpls.minusKey(pv2, key);
        }

        /* renamed from: d */
        public static CoroutineContext m90180d(PV2 pv2, CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return CoroutineContext.Element.DefaultImpls.plus(pv2, context);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"LPV2$b;", "Lkotlin/coroutines/CoroutineContext$Key;", "LPV2;", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: PV2$b */
    /* loaded from: classes.dex */
    public static final class C6384b implements CoroutineContext.Key<PV2> {

        /* renamed from: b */
        public static final /* synthetic */ C6384b f28584b = new C6384b();

        private C6384b() {
        }
    }

    /* renamed from: I */
    float mo40807I();

    @Override // kotlin.coroutines.CoroutineContext.Element
    default CoroutineContext.Key<?> getKey() {
        return f28583d0;
    }
}
