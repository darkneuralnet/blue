package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.WS0;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b&\u0018\u0000 \u001c*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0006\u001a \u000e\u0017\u001c\u0010B\u0011\b\u0000\u0012\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b,\u0010-J>\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00012\u001e\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00060\u0005H\u0016J>\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00012\u001e\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00060\tH\u0016J2\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0016J2\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0017J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0017J\b\u0010\u0010\u001a\u00020\rH\u0017J'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H @ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001H ¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010'\u001a\u00020#8\u0010X\u0090D¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010)\u001a\u00020#8\u0010X\u0090D¢\u0006\f\n\u0004\b\u0017\u0010$\u001a\u0004\b(\u0010&R\u0014\u0010+\u001a\u00020#8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, m28432d2 = {"LWS0;", "", "Key", "Value", "ToValue", "LxA1;", "", "function", "mapByPage", "Lkotlin/Function1;", "map", "LWS0$d;", "onInvalidatedCallback", "", "c", "k", "f", "LWS0$f;", "params", "LWS0$a;", "h", "(LWS0$f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "item", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/lang/Object;", "LWS0$e;", C17296a.f69688o, "LWS0$e;", "e", "()LWS0$e;", "type", "Ll72;", "b", "Ll72;", "invalidateCallbackTracker", "", "Z", "isContiguous$paging_common", "()Z", "isContiguous", "getSupportsPageDropping$paging_common", "supportsPageDropping", "g", "isInvalid", "<init>", "(LWS0$e;)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: WS0 */
/* loaded from: classes.dex */
public abstract class WS0<Key, Value> {

    /* renamed from: e */
    public static final C9024b f41027e = new C9024b(null);

    /* renamed from: a */
    public final EnumC9029e f41028a;

    /* renamed from: b */
    public final C44309l72<InterfaceC9028d> f41029b;

    /* renamed from: c */
    public final boolean f41030c;

    /* renamed from: d */
    public final boolean f41031d;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJO\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00030\u0005\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u001e\u0010\u0006\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, m28432d2 = {"LWS0$b;", "", "A", "B", "LxA1;", "", "function", Stripe3ds2AuthParams.FIELD_SOURCE, C17296a.f69688o, "(LxA1;Ljava/util/List;)Ljava/util/List;", "<init>", "()V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: WS0$b */
    /* loaded from: classes.dex */
    public static final class C9024b {
        public /* synthetic */ C9024b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final <A, B> List<B> m78421a(InterfaceC51452xA1<List<A>, List<B>> function, List<? extends A> source) {
            Intrinsics.checkNotNullParameter(function, "function");
            Intrinsics.checkNotNullParameter(source, "source");
            List<B> dest = function.apply(source);
            if (dest.size() == source.size()) {
                Intrinsics.checkNotNullExpressionValue(dest, "dest");
                return dest;
            }
            throw new IllegalStateException("Invalid Function " + function + " changed return size. This is not supported.");
        }

        private C9024b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004H&J2\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00040\u0000\"\b\b\u0004\u0010\u0006*\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0007H\u0016J>\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00040\u0000\"\b\b\u0004\u0010\u0006*\u00020\u00012\u001e\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u000b0\nH\u0016J>\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00040\u0000\"\b\b\u0004\u0010\u0006*\u00020\u00012\u001e\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u000b0\u0007H\u0016J$\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00110\u00102\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¨\u0006\u0015"}, m28432d2 = {"LWS0$c;", "", "Key", "Value", "LWS0;", DateTokenConverter.CONVERTER_KEY, "ToValue", "Lkotlin/Function1;", "function", "map", "LxA1;", "", "f", "mapByPage", "LSC0;", "fetchDispatcher", "Lkotlin/Function0;", "LfE3;", "c", "<init>", "()V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: WS0$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC9025c<Key, Value> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0001*\u00020\u0000\"\b\b\u0003\u0010\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Key", "Value", "LfE3;", "b", "()LfE3;"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: WS0$c$a */
        /* loaded from: classes.dex */
        public static final class C9026a extends Lambda implements Function0<AbstractC40818fE3<Key, Value>> {

            /* renamed from: g */
            public final /* synthetic */ SC0 f41038g;

            /* renamed from: h */
            public final /* synthetic */ AbstractC9025c<Key, Value> f41039h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9026a(SC0 sc0, AbstractC9025c<Key, Value> abstractC9025c) {
                super(0);
                this.f41038g = sc0;
                this.f41039h = abstractC9025c;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b */
            public final AbstractC40818fE3<Key, Value> invoke() {
                return new C41165fp2(this.f41038g, this.f41039h.mo12437d());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"WS0$c$b", "LWS0$c;", "LWS0;", DateTokenConverter.CONVERTER_KEY, "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: WS0$c$b */
        /* loaded from: classes.dex */
        public static final class C9027b extends AbstractC9025c<Key, ToValue> {

            /* renamed from: a */
            public final /* synthetic */ AbstractC9025c<Key, Value> f41040a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC51452xA1<List<Value>, List<ToValue>> f41041b;

            public C9027b(AbstractC9025c<Key, Value> abstractC9025c, InterfaceC51452xA1<List<Value>, List<ToValue>> interfaceC51452xA1) {
                this.f41040a = abstractC9025c;
                this.f41041b = interfaceC51452xA1;
            }

            @Override // p000.WS0.AbstractC9025c
            /* renamed from: d */
            public WS0<Key, ToValue> mo12437d() {
                return this.f41040a.mo12437d().mapByPage(this.f41041b);
            }
        }

        public static /* synthetic */ Function0 asPagingSourceFactory$default(AbstractC9025c abstractC9025c, SC0 sc0, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    sc0 = T41.m84377b();
                }
                return abstractC9025c.m78418c(sc0);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asPagingSourceFactory");
        }

        /* renamed from: e */
        public static final List m78417e(Function1 function, List list) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(function, "$function");
            Intrinsics.checkNotNullExpressionValue(list, "list");
            List<Object> list2 = list;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Object obj : list2) {
                arrayList.add(function.invoke(obj));
            }
            return arrayList;
        }

        /* renamed from: g */
        public static final List m78415g(Function1 function, List it) {
            Intrinsics.checkNotNullParameter(function, "$function");
            Intrinsics.checkNotNullExpressionValue(it, "it");
            return (List) function.invoke(it);
        }

        @JvmOverloads
        /* renamed from: c */
        public final Function0<AbstractC40818fE3<Key, Value>> m78418c(SC0 fetchDispatcher) {
            Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
            return new C51654xW5(fetchDispatcher, new C9026a(fetchDispatcher, this));
        }

        /* renamed from: d */
        public abstract WS0<Key, Value> mo12437d();

        /* renamed from: f */
        public <ToValue> AbstractC9025c<Key, ToValue> m78416f(InterfaceC51452xA1<List<Value>, List<ToValue>> function) {
            Intrinsics.checkNotNullParameter(function, "function");
            return new C9027b(this, function);
        }

        public /* synthetic */ AbstractC9025c map(final Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            return m78416f(new InterfaceC51452xA1() { // from class: YS0
                @Override // p000.InterfaceC51452xA1
                public final Object apply(Object obj) {
                    List m78417e;
                    m78417e = WS0.AbstractC9025c.m78417e(Function1.this, (List) obj);
                    return m78417e;
                }
            });
        }

        public /* synthetic */ AbstractC9025c mapByPage(final Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            return m78416f(new InterfaceC51452xA1() { // from class: XS0
                @Override // p000.InterfaceC51452xA1
                public final Object apply(Object obj) {
                    List m78415g;
                    m78415g = WS0.AbstractC9025c.m78415g(Function1.this, (List) obj);
                    return m78415g;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0004"}, m28432d2 = {"LWS0$d;", "", "", C17296a.f69688o, "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: WS0$d */
    /* loaded from: classes.dex */
    public interface InterfaceC9028d {
        /* renamed from: a */
        void mo40789a();
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"LWS0$e;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: WS0$e */
    /* loaded from: classes.dex */
    public enum EnumC9029e {
        POSITIONAL,
        PAGE_KEYED,
        ITEM_KEYED
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B3\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00018\u0002\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\f\u001a\u0004\u0018\u00018\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0004\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u001a"}, m28432d2 = {"LWS0$f;", "", "K", "Lpt2;", C17296a.f69688o, "Lpt2;", "e", "()Lpt2;", "type", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "key", "", "c", "I", "()I", "initialLoadSize", "", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "placeholdersEnabled", "pageSize", "<init>", "(Lpt2;Ljava/lang/Object;IZI)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: WS0$f */
    /* loaded from: classes.dex */
    public static final class C9030f<K> {

        /* renamed from: a */
        public final EnumC47135pt2 f41046a;

        /* renamed from: b */
        public final K f41047b;

        /* renamed from: c */
        public final int f41048c;

        /* renamed from: d */
        public final boolean f41049d;

        /* renamed from: e */
        public final int f41050e;

        public C9030f(EnumC47135pt2 type, K k, int i, boolean z, int i2) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f41046a = type;
            this.f41047b = k;
            this.f41048c = i;
            this.f41049d = z;
            this.f41050e = i2;
            if (type != EnumC47135pt2.REFRESH && k == null) {
                throw new IllegalArgumentException("Key must be non-null for prepend/append");
            }
        }

        /* renamed from: a */
        public final int m78412a() {
            return this.f41048c;
        }

        /* renamed from: b */
        public final K m78411b() {
            return this.f41047b;
        }

        /* renamed from: c */
        public final int m78410c() {
            return this.f41050e;
        }

        /* renamed from: d */
        public final boolean m78409d() {
            return this.f41049d;
        }

        /* renamed from: e */
        public final EnumC47135pt2 m78408e() {
            return this.f41046a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Key", "Value", "LWS0$d;", "it", "", C17296a.f69688o, "(LWS0$d;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: WS0$g */
    /* loaded from: classes.dex */
    public static final class C9031g extends Lambda implements Function1<InterfaceC9028d, Unit> {

        /* renamed from: g */
        public static final C9031g f41051g = new C9031g();

        public C9031g() {
            super(1);
        }

        /* renamed from: a */
        public final void m78407a(InterfaceC9028d it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.mo40789a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9028d interfaceC9028d) {
            m78407a(interfaceC9028d);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "Key", "", "Value", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: WS0$h */
    /* loaded from: classes.dex */
    public static final class C9032h extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public final /* synthetic */ WS0<Key, Value> f41052g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9032h(WS0<Key, Value> ws0) {
            super(0);
            this.f41052g = ws0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f41052g.mo64719g());
        }
    }

    public WS0(EnumC9029e type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f41028a = type;
        this.f41029b = new C44309l72<>(C9031g.f41051g, new C9032h(this));
        this.f41030c = true;
        this.f41031d = true;
    }

    /* renamed from: i */
    public static final Object m78428i(Function1 function, Object it) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        return function.invoke(it);
    }

    /* renamed from: j */
    public static final List m78427j(Function1 function, List it) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        return (List) function.invoke(it);
    }

    /* renamed from: c */
    public void mo64721c(InterfaceC9028d onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.f41029b.m27824c(onInvalidatedCallback);
    }

    /* renamed from: d */
    public abstract Key mo75408d(Value value);

    /* renamed from: e */
    public final EnumC9029e m78429e() {
        return this.f41028a;
    }

    /* renamed from: f */
    public void mo64720f() {
        this.f41029b.m27825b();
    }

    /* renamed from: g */
    public boolean mo64719g() {
        return this.f41029b.m27826a();
    }

    /* renamed from: h */
    public abstract Object mo75407h(C9030f<Key> c9030f, Continuation<? super C9022a<Value>> continuation);

    /* renamed from: k */
    public void mo64718k(InterfaceC9028d onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.f41029b.m27823d(onInvalidatedCallback);
    }

    public /* synthetic */ WS0 map(final Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return map(new InterfaceC51452xA1() { // from class: VS0
            @Override // p000.InterfaceC51452xA1
            public final Object apply(Object obj) {
                Object m78428i;
                m78428i = WS0.m78428i(Function1.this, obj);
                return m78428i;
            }
        });
    }

    public abstract <ToValue> WS0<Key, ToValue> map(InterfaceC51452xA1<Value, ToValue> interfaceC51452xA1);

    public /* synthetic */ WS0 mapByPage(final Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return mapByPage(new InterfaceC51452xA1() { // from class: US0
            @Override // p000.InterfaceC51452xA1
            public final Object apply(Object obj) {
                List m78427j;
                m78427j = WS0.m78427j(Function1.this, (List) obj);
                return m78427j;
            }
        });
    }

    public abstract <ToValue> WS0<Key, ToValue> mapByPage(InterfaceC51452xA1<List<Value>, List<ToValue>> interfaceC51452xA1);

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000 \u0019*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0007B?\b\u0000\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\n\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0007\u0010\u0013¨\u0006\u001a"}, m28432d2 = {"LWS0$a;", "", "Value", LegacyRepairType.OTHER_KEY, "", "equals", "", C17296a.f69688o, "Ljava/util/List;", MessageExtension.FIELD_DATA, "b", "Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Object;", "prevKey", "c", "nextKey", "", "I", "()I", "itemsBefore", "e", "itemsAfter", "<init>", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)V", "f", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: WS0$a */
    /* loaded from: classes.dex */
    public static final class C9022a<Value> {

        /* renamed from: f */
        public static final C9023a f41032f = new C9023a(null);
        @JvmField

        /* renamed from: a */
        public final List<Value> f41033a;

        /* renamed from: b */
        public final Object f41034b;

        /* renamed from: c */
        public final Object f41035c;

        /* renamed from: d */
        public final int f41036d;

        /* renamed from: e */
        public final int f41037e;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\b\b\u0003\u0010\u0002*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"LWS0$a$a;", "", "T", "LWS0$a;", C17296a.f69688o, "()LWS0$a;", "<init>", "()V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: WS0$a$a */
        /* loaded from: classes.dex */
        public static final class C9023a {
            public /* synthetic */ C9023a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final <T> C9022a<T> m78422a() {
                List emptyList;
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return new C9022a<>(emptyList, null, null, 0, 0);
            }

            private C9023a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C9022a(List<? extends Value> data, Object obj, Object obj2, int i, int i2) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f41033a = data;
            this.f41034b = obj;
            this.f41035c = obj2;
            this.f41036d = i;
            this.f41037e = i2;
            if (i < 0 && i != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Position must be non-negative");
            }
            if (data.isEmpty() && (i > 0 || i2 > 0)) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            }
            if (i2 < 0 && i2 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            }
        }

        /* renamed from: a */
        public final int m78426a() {
            return this.f41037e;
        }

        /* renamed from: b */
        public final int m78425b() {
            return this.f41036d;
        }

        /* renamed from: c */
        public final Object m78424c() {
            return this.f41035c;
        }

        /* renamed from: d */
        public final Object m78423d() {
            return this.f41034b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C9022a)) {
                return false;
            }
            C9022a c9022a = (C9022a) obj;
            if (!Intrinsics.areEqual(this.f41033a, c9022a.f41033a) || !Intrinsics.areEqual(this.f41034b, c9022a.f41034b) || !Intrinsics.areEqual(this.f41035c, c9022a.f41035c) || this.f41036d != c9022a.f41036d || this.f41037e != c9022a.f41037e) {
                return false;
            }
            return true;
        }

        public /* synthetic */ C9022a(List list, Object obj, Object obj2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, obj, obj2, (i3 & 8) != 0 ? Integer.MIN_VALUE : i, (i3 & 16) != 0 ? Integer.MIN_VALUE : i2);
        }
    }
}
