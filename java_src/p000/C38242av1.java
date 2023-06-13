package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aw\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032:\u0010\f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e\"*\u0010\u0012\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\"0\u0010\u0015\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u0012\u0004\b\u0014\u0010\u0011¨\u0006\u0016"}, m28432d2 = {"T", "LEu1;", C17296a.f69688o, "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "old", "new", "", "areEquivalent", "b", "(LEu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)LEu1;", "Lkotlin/jvm/functions/Function1;", "getDefaultKeySelector$annotations$FlowKt__DistinctKt", "()V", "defaultKeySelector", "Lkotlin/jvm/functions/Function2;", "getDefaultAreEquivalent$annotations$FlowKt__DistinctKt", "defaultAreEquivalent", "kotlinx-coroutines-core"}, m28431k = 5, m28430mv = {1, 6, 0}, m28427xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: av1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C38242av1 {

    /* renamed from: a */
    public static final Function1<Object, Object> f56539a = C12201b.f56542g;

    /* renamed from: b */
    public static final Function2<Object, Object, Boolean> f56540b = C12200a.f56541g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "old", "new", "", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: av1$a */
    /* loaded from: classes8.dex */
    public static final class C12200a extends Lambda implements Function2<Object, Object, Boolean> {

        /* renamed from: g */
        public static final C12200a f56541g = new C12200a();

        public C12200a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(Intrinsics.areEqual(obj, obj2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "it", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: av1$b */
    /* loaded from: classes8.dex */
    public static final class C12201b extends Lambda implements Function1<Object, Object> {

        /* renamed from: g */
        public static final C12201b f56542g = new C12201b();

        public C12201b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> InterfaceC32730Eu1<T> m65256a(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1) {
        if (!(interfaceC32730Eu1 instanceof InterfaceC49220tP5)) {
            return m65255b(interfaceC32730Eu1, f56539a, f56540b);
        }
        return interfaceC32730Eu1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final <T> InterfaceC32730Eu1<T> m65255b(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Function1<? super T, ? extends Object> function1, Function2<Object, Object, Boolean> function2) {
        if (interfaceC32730Eu1 instanceof J51) {
            J51 j51 = (J51) interfaceC32730Eu1;
            if (j51.f16802c == function1 && j51.f16803d == function2) {
                return interfaceC32730Eu1;
            }
        }
        return new J51(interfaceC32730Eu1, function1, function2);
    }
}
