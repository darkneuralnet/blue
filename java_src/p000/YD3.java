package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000.WS0;
@Deprecated(message = "PageKeyedDataSource is deprecated and has been replaced by PagingSource", replaceWith = @ReplaceWith(expression = "PagingSource<Key, Value>", imports = {"androidx.paging.PagingSource"}))
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0004+,-\u0014B\u0007¢\u0006\u0004\b)\u0010*J'\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH&J*\u0010\u0011\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H&J*\u0010\u0012\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H&J\u0017\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0001H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J<\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0016*\u00020\u00012\u001e\u0010\u0019\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00180\u0017J<\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0016*\u00020\u00012\u001e\u0010\u0019\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00180\u001bJ0\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0016*\u00020\u00012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0017J0\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0016*\u00020\u00012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001bJ'\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b#\u0010\"J0\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070$2\u0006\u0010'\u001a\u00020&H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, m28432d2 = {"LYD3;", "", "Key", "Value", "LWS0;", "LWS0$f;", "params", "LWS0$a;", "h", "(LWS0$f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LYD3$c;", "LYD3$b;", "callback", "", "v", "LYD3$d;", "LYD3$a;", "t", "r", "item", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/lang/Object;", "ToValue", "LxA1;", "", "function", "A", "Lkotlin/Function1;", "B", "w", "x", "u", "(LYD3$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "s", "(LYD3$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "q", "LWc0;", "continuation", "", "isAppend", "p", "<init>", "()V", C17296a.f69688o, "b", "c", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: YD3 */
/* loaded from: classes.dex */
public abstract class YD3<Key, Value> extends WS0<Key, Value> {

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\b\u001a\u00020\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042\b\u0010\u0006\u001a\u0004\u0018\u00018\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, m28432d2 = {"LYD3$a;", "Key", "Value", "", "", MessageExtension.FIELD_DATA, "adjacentPageKey", "", C17296a.f69688o, "(Ljava/util/List;Ljava/lang/Object;)V", "<init>", "()V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: YD3$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC9707a<Key, Value> {
        /* renamed from: a */
        public abstract void mo64717a(List<? extends Value> list, Key key);
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00018\u00022\b\u0010\n\u001a\u0004\u0018\u00018\u0002H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"LYD3$b;", "Key", "Value", "", "", MessageExtension.FIELD_DATA, "", "position", "totalCount", "previousPageKey", "nextPageKey", "", C17296a.f69688o, "(Ljava/util/List;IILjava/lang/Object;Ljava/lang/Object;)V", "<init>", "()V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: YD3$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC9708b<Key, Value> {
        /* renamed from: a */
        public abstract void mo64716a(List<? extends Value> list, int i, int i2, Key key, Key key2);
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, m28432d2 = {"LYD3$c;", "", "Key", "", C17296a.f69688o, "I", "requestedLoadSize", "", "b", "Z", "placeholdersEnabled", "<init>", "(IZ)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: YD3$c */
    /* loaded from: classes.dex */
    public static class C9709c<Key> {
        @JvmField

        /* renamed from: a */
        public final int f44844a;
        @JvmField

        /* renamed from: b */
        public final boolean f44845b;

        public C9709c(int i, boolean z) {
            this.f44844a = i;
            this.f44845b = z;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00028\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"LYD3$d;", "", "Key", C17296a.f69688o, "Ljava/lang/Object;", "key", "", "b", "I", "requestedLoadSize", "<init>", "(Ljava/lang/Object;I)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: YD3$d */
    /* loaded from: classes.dex */
    public static class C9710d<Key> {
        @JvmField

        /* renamed from: a */
        public final Key f44846a;
        @JvmField

        /* renamed from: b */
        public final int f44847b;

        public C9710d(Key key, int i) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f44846a = key;
            this.f44847b = i;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J'\u0010\u0006\u001a\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"YD3$e", "LYD3$a;", "", MessageExtension.FIELD_DATA, "adjacentPageKey", "", C17296a.f69688o, "(Ljava/util/List;Ljava/lang/Object;)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: YD3$e */
    /* loaded from: classes.dex */
    public static final class C9711e extends AbstractC9707a<Key, Value> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC36779Wc0<WS0.C9022a<Value>> f44848a;

        /* renamed from: b */
        public final /* synthetic */ boolean f44849b;

        /* JADX WARN: Multi-variable type inference failed */
        public C9711e(InterfaceC36779Wc0<? super WS0.C9022a<Value>> interfaceC36779Wc0, boolean z) {
            this.f44848a = interfaceC36779Wc0;
            this.f44849b = z;
        }

        @Override // p000.YD3.AbstractC9707a
        /* renamed from: a */
        public void mo64717a(List<? extends Value> data, Key key) {
            Key key2;
            Key key3;
            Intrinsics.checkNotNullParameter(data, "data");
            InterfaceC36779Wc0<WS0.C9022a<Value>> interfaceC36779Wc0 = this.f44848a;
            Result.Companion companion = Result.Companion;
            boolean z = this.f44849b;
            if (z) {
                key2 = null;
            } else {
                key2 = key;
            }
            if (z) {
                key3 = key;
            } else {
                key3 = null;
            }
            interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(new WS0.C9022a(data, key2, key3, 0, 0, 24, null)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001JA\u0010\n\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m28432d2 = {"YD3$f", "LYD3$b;", "", MessageExtension.FIELD_DATA, "", "position", "totalCount", "previousPageKey", "nextPageKey", "", C17296a.f69688o, "(Ljava/util/List;IILjava/lang/Object;Ljava/lang/Object;)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: YD3$f */
    /* loaded from: classes.dex */
    public static final class C9712f extends AbstractC9708b<Key, Value> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC36779Wc0<WS0.C9022a<Value>> f44850a;

        /* JADX WARN: Multi-variable type inference failed */
        public C9712f(InterfaceC36779Wc0<? super WS0.C9022a<Value>> interfaceC36779Wc0) {
            this.f44850a = interfaceC36779Wc0;
        }

        @Override // p000.YD3.AbstractC9708b
        /* renamed from: a */
        public void mo64716a(List<? extends Value> data, int i, int i2, Key key, Key key2) {
            Intrinsics.checkNotNullParameter(data, "data");
            InterfaceC36779Wc0<WS0.C9022a<Value>> interfaceC36779Wc0 = this.f44850a;
            Result.Companion companion = Result.Companion;
            interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(new WS0.C9022a(data, key, key2, i, (i2 - data.size()) - i)));
        }
    }

    public YD3() {
        super(WS0.EnumC9029e.PAGE_KEYED);
    }

    /* renamed from: C */
    public static final List m75409C(Function1 function, List it) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        return (List) function.invoke(it);
    }

    /* renamed from: y */
    public static final List m75396y(InterfaceC51452xA1 function, List list) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(list, "list");
        List<Object> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Object obj : list2) {
            arrayList.add(function.apply(obj));
        }
        return arrayList;
    }

    /* renamed from: z */
    public static final List m75395z(Function1 function, List list) {
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

    @Override // p000.WS0
    /* renamed from: A */
    public final <ToValue> YD3<Key, ToValue> mapByPage(InterfaceC51452xA1<List<Value>, List<ToValue>> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new C38459bH6(this, function);
    }

    @Override // p000.WS0
    /* renamed from: B */
    public final <ToValue> YD3<Key, ToValue> mapByPage(final Function1<? super List<? extends Value>, ? extends List<? extends ToValue>> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return mapByPage(new InterfaceC51452xA1() { // from class: VD3
            @Override // p000.InterfaceC51452xA1
            public final Object apply(Object obj) {
                List m75409C;
                m75409C = YD3.m75409C(Function1.this, (List) obj);
                return m75409C;
            }
        });
    }

    @Override // p000.WS0
    /* renamed from: d */
    public Key mo75408d(Value item) {
        Intrinsics.checkNotNullParameter(item, "item");
        throw new IllegalStateException("Cannot get key by item in pageKeyedDataSource");
    }

    @Override // p000.WS0
    /* renamed from: h */
    public final Object mo75407h(WS0.C9030f<Key> c9030f, Continuation<? super WS0.C9022a<Value>> continuation) {
        if (c9030f.m78408e() == EnumC47135pt2.REFRESH) {
            return m75399u(new C9709c<>(c9030f.m78412a(), c9030f.m78409d()), continuation);
        }
        if (c9030f.m78411b() == null) {
            return WS0.C9022a.f41032f.m78422a();
        }
        if (c9030f.m78408e() == EnumC47135pt2.PREPEND) {
            return m75400s(new C9710d<>(c9030f.m78411b(), c9030f.m78410c()), continuation);
        }
        if (c9030f.m78408e() == EnumC47135pt2.APPEND) {
            return m75401q(new C9710d<>(c9030f.m78411b(), c9030f.m78410c()), continuation);
        }
        throw new IllegalArgumentException("Unsupported type " + c9030f.m78408e());
    }

    /* renamed from: p */
    public final AbstractC9707a<Key, Value> m75402p(InterfaceC36779Wc0<? super WS0.C9022a<Value>> interfaceC36779Wc0, boolean z) {
        return new C9711e(interfaceC36779Wc0, z);
    }

    /* renamed from: q */
    public final Object m75401q(C9710d<Key> c9710d, Continuation<? super WS0.C9022a<Value>> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
        c37013Xc0.m76766u();
        mo20029r(c9710d, m75402p(c37013Xc0, true));
        Object m76770q = c37013Xc0.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m76770q;
    }

    /* renamed from: r */
    public abstract void mo20029r(C9710d<Key> c9710d, AbstractC9707a<Key, Value> abstractC9707a);

    /* renamed from: s */
    public final Object m75400s(C9710d<Key> c9710d, Continuation<? super WS0.C9022a<Value>> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
        c37013Xc0.m76766u();
        mo20028t(c9710d, m75402p(c37013Xc0, false));
        Object m76770q = c37013Xc0.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m76770q;
    }

    /* renamed from: t */
    public abstract void mo20028t(C9710d<Key> c9710d, AbstractC9707a<Key, Value> abstractC9707a);

    /* renamed from: u */
    public final Object m75399u(C9709c<Key> c9709c, Continuation<? super WS0.C9022a<Value>> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
        c37013Xc0.m76766u();
        mo20027v(c9709c, new C9712f(c37013Xc0));
        Object m76770q = c37013Xc0.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m76770q;
    }

    /* renamed from: v */
    public abstract void mo20027v(C9709c<Key> c9709c, AbstractC9708b<Key, Value> abstractC9708b);

    @Override // p000.WS0
    /* renamed from: w */
    public final <ToValue> YD3<Key, ToValue> map(final InterfaceC51452xA1<Value, ToValue> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return mapByPage(new InterfaceC51452xA1() { // from class: XD3
            @Override // p000.InterfaceC51452xA1
            public final Object apply(Object obj) {
                List m75396y;
                m75396y = YD3.m75396y(InterfaceC51452xA1.this, (List) obj);
                return m75396y;
            }
        });
    }

    @Override // p000.WS0
    /* renamed from: x */
    public final <ToValue> YD3<Key, ToValue> map(final Function1<? super Value, ? extends ToValue> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return mapByPage(new InterfaceC51452xA1() { // from class: WD3
            @Override // p000.InterfaceC51452xA1
            public final Object apply(Object obj) {
                List m75395z;
                m75395z = YD3.m75395z(Function1.this, (List) obj);
                return m75395z;
            }
        });
    }
}
