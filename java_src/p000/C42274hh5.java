package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0080\u0010¨\u0006\b"}, m28432d2 = {"Lfh5;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "", C17296a.f69688o, "Lzh2;", "collectJob", "b", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: hh5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42274hh5 {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "count", "Lkotlin/coroutines/CoroutineContext$Element;", "element", C17296a.f69688o, "(ILkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: hh5$a */
    /* loaded from: classes8.dex */
    public static final class C22709a extends Lambda implements Function2<Integer, CoroutineContext.Element, Integer> {

        /* renamed from: g */
        public final /* synthetic */ C41088fh5<?> f85678g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22709a(C41088fh5<?> c41088fh5) {
            super(2);
            this.f85678g = c41088fh5;
        }

        /* renamed from: a */
        public final Integer m36091a(int i, CoroutineContext.Element element) {
            int i2;
            CoroutineContext.Key<?> key = element.getKey();
            CoroutineContext.Element element2 = this.f85678g.f80460i.get(key);
            if (key != InterfaceC52943zh2.f122077a0) {
                if (element != element2) {
                    i2 = Integer.MIN_VALUE;
                } else {
                    i2 = i + 1;
                }
                return Integer.valueOf(i2);
            }
            InterfaceC52943zh2 interfaceC52943zh2 = (InterfaceC52943zh2) element2;
            InterfaceC52943zh2 m36092b = C42274hh5.m36092b((InterfaceC52943zh2) element, interfaceC52943zh2);
            if (m36092b == interfaceC52943zh2) {
                if (interfaceC52943zh2 != null) {
                    i++;
                }
                return Integer.valueOf(i);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + m36092b + ", expected child of " + interfaceC52943zh2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, CoroutineContext.Element element) {
            return m36091a(num.intValue(), element);
        }
    }

    @JvmName(name = "checkContext")
    /* renamed from: a */
    public static final void m36093a(C41088fh5<?> c41088fh5, CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.fold(0, new C22709a(c41088fh5))).intValue() == c41088fh5.f80461j) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + c41088fh5.f80460i + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* renamed from: b */
    public static final InterfaceC52943zh2 m36092b(InterfaceC52943zh2 interfaceC52943zh2, InterfaceC52943zh2 interfaceC52943zh22) {
        while (interfaceC52943zh2 != null) {
            if (interfaceC52943zh2 == interfaceC52943zh22) {
                return interfaceC52943zh2;
            }
            if (!(interfaceC52943zh2 instanceof C36406Um5)) {
                return interfaceC52943zh2;
            }
            interfaceC52943zh2 = ((C36406Um5) interfaceC52943zh2).m80875f1();
        }
        return null;
    }
}
