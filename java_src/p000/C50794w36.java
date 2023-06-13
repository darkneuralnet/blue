package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0000\"\u0014\u0010\u000b\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n\"*\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\"2\u0010\u0011\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0010\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00100\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e\"&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, m28432d2 = {"Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "countOrElement", "c", "oldState", "", C17296a.f69688o, "LuX5;", "LuX5;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/jvm/functions/Function2;", "countAll", "Lv36;", "findOne", "LL36;", DateTokenConverter.CONVERTER_KEY, "updateState", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: w36  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50794w36 {
    @JvmField

    /* renamed from: a */
    public static final C49885uX5 f115218a = new C49885uX5("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    public static final Function2<Object, CoroutineContext.Element, Object> f115219b = C29748a.f115222g;

    /* renamed from: c */
    public static final Function2<InterfaceC50201v36<?>, CoroutineContext.Element, InterfaceC50201v36<?>> f115220c = C29749b.f115223g;

    /* renamed from: d */
    public static final Function2<L36, CoroutineContext.Element, L36> f115221d = C29750c.f115224g;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "countOrElement", "Lkotlin/coroutines/CoroutineContext$Element;", "element", C17296a.f69688o, "(Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: w36$a */
    /* loaded from: classes8.dex */
    public static final class C29748a extends Lambda implements Function2<Object, CoroutineContext.Element, Object> {

        /* renamed from: g */
        public static final C29748a f115222g = new C29748a();

        public C29748a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(Object obj, CoroutineContext.Element element) {
            Integer num;
            int i;
            if (element instanceof InterfaceC50201v36) {
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 1;
                }
                if (i != 0) {
                    return Integer.valueOf(i + 1);
                }
                return element;
            }
            return obj;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lv36;", "found", "Lkotlin/coroutines/CoroutineContext$Element;", "element", C17296a.f69688o, "(Lv36;Lkotlin/coroutines/CoroutineContext$Element;)Lv36;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: w36$b */
    /* loaded from: classes8.dex */
    public static final class C29749b extends Lambda implements Function2<InterfaceC50201v36<?>, CoroutineContext.Element, InterfaceC50201v36<?>> {

        /* renamed from: g */
        public static final C29749b f115223g = new C29749b();

        public C29749b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final InterfaceC50201v36<?> invoke(InterfaceC50201v36<?> interfaceC50201v36, CoroutineContext.Element element) {
            if (interfaceC50201v36 != null) {
                return interfaceC50201v36;
            }
            if (element instanceof InterfaceC50201v36) {
                return (InterfaceC50201v36) element;
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LL36;", TransferTable.COLUMN_STATE, "Lkotlin/coroutines/CoroutineContext$Element;", "element", C17296a.f69688o, "(LL36;Lkotlin/coroutines/CoroutineContext$Element;)LL36;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: w36$c */
    /* loaded from: classes8.dex */
    public static final class C29750c extends Lambda implements Function2<L36, CoroutineContext.Element, L36> {

        /* renamed from: g */
        public static final C29750c f115224g = new C29750c();

        public C29750c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final L36 invoke(L36 l36, CoroutineContext.Element element) {
            if (element instanceof InterfaceC50201v36) {
                InterfaceC50201v36<?> interfaceC50201v36 = (InterfaceC50201v36) element;
                l36.m97889a(interfaceC50201v36, interfaceC50201v36.m9264R(l36.f20653a));
            }
            return l36;
        }
    }

    /* renamed from: a */
    public static final void m7523a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f115218a) {
            return;
        }
        if (obj instanceof L36) {
            ((L36) obj).m97888b(coroutineContext);
            return;
        }
        Object fold = coroutineContext.fold(null, f115220c);
        if (fold != null) {
            ((InterfaceC50201v36) fold).m9263q(coroutineContext, obj);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }

    /* renamed from: b */
    public static final Object m7522b(CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, f115219b);
        Intrinsics.checkNotNull(fold);
        return fold;
    }

    /* renamed from: c */
    public static final Object m7521c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = m7522b(coroutineContext);
        }
        if (obj == 0) {
            return f115218a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new L36(coroutineContext, ((Number) obj).intValue()), f115221d);
        }
        return ((InterfaceC50201v36) obj).m9264R(coroutineContext);
    }
}
