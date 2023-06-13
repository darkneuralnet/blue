package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000.WS0;
@Deprecated(message = "ItemKeyedDataSource is deprecated and has been replaced by PagingSource", replaceWith = @ReplaceWith(expression = "PagingSource<Key, Value>", imports = {"androidx.paging.PagingSource"}))
@Metadata(m28433d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t*\u0001)\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0004./0\u001fB\u0007¢\u0006\u0004\b,\u0010-J'\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u0004\u0018\u00018\u0000*\b\u0012\u0004\u0012\u00028\u00010\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u0004\u0018\u00018\u0000*\b\u0012\u0004\u0012\u00028\u00010\nH\u0000¢\u0006\u0004\b\r\u0010\fJ'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0081@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013J$\u0010\u0018\u001a\u00020\u00172\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H&J$\u0010\u001a\u001a\u00020\u00172\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H&J$\u0010\u001b\u001a\u00020\u00172\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H&J\u0017\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0001H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0001H\u0010¢\u0006\u0004\b\u001f\u0010\u001eJ<\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010 *\u00020\u00012\u001e\u0010\"\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n0!J<\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010 *\u00020\u00012\u001e\u0010\"\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n0$J0\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010 *\u00020\u00012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020!J0\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010 *\u00020\u00012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020$J+\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070(H\u0002¢\u0006\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, m28432d2 = {"LEc2;", "", "Key", "Value", "LWS0;", "LWS0$f;", "params", "LWS0$a;", "h", "(LWS0$f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "q", "(Ljava/util/List;)Ljava/lang/Object;", "p", "LEc2$c;", "w", "(LEc2$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEc2$d;", "u", "(LEc2$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "s", "LEc2$b;", "callback", "", "v", "LEc2$a;", "r", "t", "item", "getKey", "(Ljava/lang/Object;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "ToValue", "LxA1;", "function", "B", "Lkotlin/Function1;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "x", "y", "LWc0;", "Ec2$f", "o", "(LWc0;)LEc2$f;", "<init>", "()V", C17296a.f69688o, "b", "c", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Ec2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC32569Ec2<Key, Value> extends WS0<Key, Value> {

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003H&¨\u0006\t"}, m28432d2 = {"LEc2$a;", "Value", "", "", MessageExtension.FIELD_DATA, "", C17296a.f69688o, "<init>", "()V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Ec2$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1912a<Value> {
        /* renamed from: a */
        public abstract void mo71704a(List<? extends Value> list);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0007¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\f"}, m28432d2 = {"LEc2$b;", "Value", "LEc2$a;", "", MessageExtension.FIELD_DATA, "", "position", "totalCount", "", "b", "<init>", "()V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Ec2$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1913b<Value> extends AbstractC1912a<Value> {
        /* renamed from: b */
        public abstract void mo71703b(List<? extends Value> list, int i, int i2);
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B!\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00018\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"LEc2$c;", "", "Key", C17296a.f69688o, "Ljava/lang/Object;", "requestedInitialKey", "", "b", "I", "requestedLoadSize", "", "c", "Z", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Ec2$c */
    /* loaded from: classes.dex */
    public static class C1914c<Key> {
        @JvmField

        /* renamed from: a */
        public final Key f7847a;
        @JvmField

        /* renamed from: b */
        public final int f7848b;
        @JvmField

        /* renamed from: c */
        public final boolean f7849c;

        public C1914c(Key key, int i, boolean z) {
            this.f7847a = key;
            this.f7848b = i;
            this.f7849c = z;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00028\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"LEc2$d;", "", "Key", C17296a.f69688o, "Ljava/lang/Object;", "key", "", "b", "I", "requestedLoadSize", "<init>", "(Ljava/lang/Object;I)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Ec2$d */
    /* loaded from: classes.dex */
    public static class C1915d<Key> {
        @JvmField

        /* renamed from: a */
        public final Key f7850a;
        @JvmField

        /* renamed from: b */
        public final int f7851b;

        public C1915d(Key key, int i) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f7850a = key;
            this.f7851b = i;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: Ec2$e */
    /* loaded from: classes.dex */
    public /* synthetic */ class C1916e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC47135pt2.values().length];
            iArr[EnumC47135pt2.REFRESH.ordinal()] = 1;
            iArr[EnumC47135pt2.PREPEND.ordinal()] = 2;
            iArr[EnumC47135pt2.APPEND.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"Ec2$f", "LEc2$a;", "", MessageExtension.FIELD_DATA, "", C17296a.f69688o, "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Ec2$f */
    /* loaded from: classes.dex */
    public static final class C1917f extends AbstractC1912a<Value> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC36779Wc0<WS0.C9022a<Value>> f7852a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC32569Ec2<Key, Value> f7853b;

        /* JADX WARN: Multi-variable type inference failed */
        public C1917f(InterfaceC36779Wc0<? super WS0.C9022a<Value>> interfaceC36779Wc0, AbstractC32569Ec2<Key, Value> abstractC32569Ec2) {
            this.f7852a = interfaceC36779Wc0;
            this.f7853b = abstractC32569Ec2;
        }

        @Override // p000.AbstractC32569Ec2.AbstractC1912a
        /* renamed from: a */
        public void mo71704a(List<? extends Value> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            InterfaceC36779Wc0<WS0.C9022a<Value>> interfaceC36779Wc0 = this.f7852a;
            Result.Companion companion = Result.Companion;
            interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(new WS0.C9022a(data, this.f7853b.m108649q(data), this.f7853b.m108650p(data), 0, 0, 24, null)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0016\u0010\t\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¨\u0006\n"}, m28432d2 = {"Ec2$g", "LEc2$b;", "", MessageExtension.FIELD_DATA, "", "position", "totalCount", "", "b", C17296a.f69688o, "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Ec2$g */
    /* loaded from: classes.dex */
    public static final class C1918g extends AbstractC1913b<Value> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC36779Wc0<WS0.C9022a<Value>> f7854a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC32569Ec2<Key, Value> f7855b;

        /* JADX WARN: Multi-variable type inference failed */
        public C1918g(InterfaceC36779Wc0<? super WS0.C9022a<Value>> interfaceC36779Wc0, AbstractC32569Ec2<Key, Value> abstractC32569Ec2) {
            this.f7854a = interfaceC36779Wc0;
            this.f7855b = abstractC32569Ec2;
        }

        @Override // p000.AbstractC32569Ec2.AbstractC1912a
        /* renamed from: a */
        public void mo71704a(List<? extends Value> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            InterfaceC36779Wc0<WS0.C9022a<Value>> interfaceC36779Wc0 = this.f7854a;
            Result.Companion companion = Result.Companion;
            interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(new WS0.C9022a(data, this.f7855b.m108649q(data), this.f7855b.m108650p(data), 0, 0, 24, null)));
        }

        @Override // p000.AbstractC32569Ec2.AbstractC1913b
        /* renamed from: b */
        public void mo71703b(List<? extends Value> data, int i, int i2) {
            Intrinsics.checkNotNullParameter(data, "data");
            InterfaceC36779Wc0<WS0.C9022a<Value>> interfaceC36779Wc0 = this.f7854a;
            Result.Companion companion = Result.Companion;
            interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(new WS0.C9022a(data, this.f7855b.m108649q(data), this.f7855b.m108650p(data), i, (i2 - data.size()) - i)));
        }
    }

    public AbstractC32569Ec2() {
        super(WS0.EnumC9029e.ITEM_KEYED);
    }

    /* renamed from: A */
    public static final List m108658A(Function1 function, List list) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(list, "list");
        List<Object> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Object obj : list2) {
            arrayList.add(function.invoke(obj));
        }
        return arrayList;
    }

    /* renamed from: D */
    public static final List m108655D(Function1 function, List it) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        return (List) function.invoke(it);
    }

    /* renamed from: z */
    public static final List m108643z(InterfaceC51452xA1 function, List list) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(list, "list");
        List<Object> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Object obj : list2) {
            arrayList.add(function.apply(obj));
        }
        return arrayList;
    }

    @Override // p000.WS0
    /* renamed from: B */
    public final <ToValue> AbstractC32569Ec2<Key, ToValue> mapByPage(InterfaceC51452xA1<List<Value>, List<ToValue>> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new C37866aH6(this, function);
    }

    @Override // p000.WS0
    /* renamed from: C */
    public final <ToValue> AbstractC32569Ec2<Key, ToValue> mapByPage(final Function1<? super List<? extends Value>, ? extends List<? extends ToValue>> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return mapByPage(new InterfaceC51452xA1() { // from class: Bc2
            @Override // p000.InterfaceC51452xA1
            public final Object apply(Object obj) {
                List m108655D;
                m108655D = AbstractC32569Ec2.m108655D(Function1.this, (List) obj);
                return m108655D;
            }
        });
    }

    @Override // p000.WS0
    /* renamed from: d */
    public Key mo75408d(Value item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return getKey(item);
    }

    public abstract Key getKey(Value value);

    @Override // p000.WS0
    /* renamed from: h */
    public final Object mo75407h(WS0.C9030f<Key> c9030f, Continuation<? super WS0.C9022a<Value>> continuation) {
        int i = C1916e.$EnumSwitchMapping$0[c9030f.m78408e().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    Key m78411b = c9030f.m78411b();
                    Intrinsics.checkNotNull(m78411b);
                    return m108648s(new C1915d<>(m78411b, c9030f.m78410c()), continuation);
                }
                throw new NoWhenBranchMatchedException();
            }
            Key m78411b2 = c9030f.m78411b();
            Intrinsics.checkNotNull(m78411b2);
            return m108647u(new C1915d<>(m78411b2, c9030f.m78410c()), continuation);
        }
        return m108646w(new C1914c<>(c9030f.m78411b(), c9030f.m78412a(), c9030f.m78409d()), continuation);
    }

    /* renamed from: o */
    public final C1917f m108651o(InterfaceC36779Wc0<? super WS0.C9022a<Value>> interfaceC36779Wc0) {
        return new C1917f(interfaceC36779Wc0, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public final Key m108650p(List<? extends Value> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Object lastOrNull = CollectionsKt.lastOrNull((List) list);
        if (lastOrNull != null) {
            return (Key) getKey(lastOrNull);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public final Key m108649q(List<? extends Value> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Object firstOrNull = CollectionsKt.firstOrNull((List) list);
        if (firstOrNull != null) {
            return (Key) getKey(firstOrNull);
        }
        return null;
    }

    /* renamed from: r */
    public abstract void mo71707r(C1915d<Key> c1915d, AbstractC1912a<Value> abstractC1912a);

    /* renamed from: s */
    public final Object m108648s(C1915d<Key> c1915d, Continuation<? super WS0.C9022a<Value>> continuation) {
        C37013Xc0 c37013Xc0 = new C37013Xc0(IntrinsicsKt.intercepted(continuation), 1);
        c37013Xc0.m76766u();
        mo71707r(c1915d, m108651o(c37013Xc0));
        Object m76770q = c37013Xc0.m76770q();
        if (m76770q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m76770q;
    }

    /* renamed from: t */
    public abstract void mo71706t(C1915d<Key> c1915d, AbstractC1912a<Value> abstractC1912a);

    /* renamed from: u */
    public final Object m108647u(C1915d<Key> c1915d, Continuation<? super WS0.C9022a<Value>> continuation) {
        C37013Xc0 c37013Xc0 = new C37013Xc0(IntrinsicsKt.intercepted(continuation), 1);
        c37013Xc0.m76766u();
        mo71706t(c1915d, m108651o(c37013Xc0));
        Object m76770q = c37013Xc0.m76770q();
        if (m76770q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m76770q;
    }

    /* renamed from: v */
    public abstract void mo71705v(C1914c<Key> c1914c, AbstractC1913b<Value> abstractC1913b);

    /* renamed from: w */
    public final Object m108646w(C1914c<Key> c1914c, Continuation<? super WS0.C9022a<Value>> continuation) {
        C37013Xc0 c37013Xc0 = new C37013Xc0(IntrinsicsKt.intercepted(continuation), 1);
        c37013Xc0.m76766u();
        mo71705v(c1914c, new C1918g(c37013Xc0, this));
        Object m76770q = c37013Xc0.m76770q();
        if (m76770q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m76770q;
    }

    @Override // p000.WS0
    /* renamed from: x */
    public final <ToValue> AbstractC32569Ec2<Key, ToValue> map(final InterfaceC51452xA1<Value, ToValue> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return mapByPage(new InterfaceC51452xA1() { // from class: Cc2
            @Override // p000.InterfaceC51452xA1
            public final Object apply(Object obj) {
                List m108643z;
                m108643z = AbstractC32569Ec2.m108643z(InterfaceC51452xA1.this, (List) obj);
                return m108643z;
            }
        });
    }

    @Override // p000.WS0
    /* renamed from: y */
    public final <ToValue> AbstractC32569Ec2<Key, ToValue> map(final Function1<? super Value, ? extends ToValue> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return mapByPage(new InterfaceC51452xA1() { // from class: Dc2
            @Override // p000.InterfaceC51452xA1
            public final Object apply(Object obj) {
                List m108658A;
                m108658A = AbstractC32569Ec2.m108658A(Function1.this, (List) obj);
                return m108658A;
            }
        });
    }
}
