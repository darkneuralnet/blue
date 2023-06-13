package p000;

import androidx.recyclerview.widget.C11881b;
import androidx.recyclerview.widget.C11882c;
import androidx.recyclerview.widget.C11905h;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KFunction;
import p000.AbstractC46542ot2;
import p000.ZD3;
@Deprecated(message = "AsyncPagedListDiffer is deprecated and has been replaced by AsyncPagingDataDiffer", replaceWith = @ReplaceWith(expression = "AsyncPagingDataDiffer<T>", imports = {"androidx.paging.AsyncPagingDataDiffer"}))
@Metadata(m28433d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u001e&B#\b\u0017\u0012\n\u0010b\u001a\u0006\u0012\u0002\b\u00030a\u0012\f\u0010d\u001a\b\u0012\u0004\u0012\u00028\u00000c¢\u0006\u0004\be\u0010fJ2\u0010\t\u001a\u00020\b2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0019\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016J\"\u0010\u0010\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016JM\u0010\u0018\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u001c\u001a\u00020\b2(\u0010\u001b\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0004\u0012\u00020\b0\u001aR\"\u0010$\u001a\u00020\u001d8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R&\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000%8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\"\u00103\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R,\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000005048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010+\u001a\u0004\b8\u00109R$\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\f\u0010<\u0012\u0004\b=\u0010+R$\u0010@\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b>\u0010<\u0012\u0004\b?\u0010+R(\u0010H\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\bA\u0010B\u0012\u0004\bG\u0010+\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b \u0010J\u0012\u0004\bK\u0010+RD\u0010U\u001a2\u0012\u0013\u0012\u00110N¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110R¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(S\u0012\u0004\u0012\u00020\b0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010TR2\u0010Y\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\b0\u001a0V8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010W\u001a\u0004\bA\u0010XR\u001a\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\"\u0010[\u0012\u0004\b\\\u0010+R\u0014\u0010^\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010DR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038VX\u0096\u0004¢\u0006\f\u0012\u0004\b`\u0010+\u001a\u0004\b6\u0010_¨\u0006g"}, m28432d2 = {"Lip;", "", "T", "LZD3;", "previousList", "currentList", "Ljava/lang/Runnable;", "commitCallback", "", "j", "", "index", "e", "(I)Ljava/lang/Object;", "pagedList", "l", "m", "newList", "diffSnapshot", "Lmd3;", "diffResult", "LLs4;", "recordingCallback", "lastAccessIndex", "i", "(LZD3;LZD3;Lmd3;LLs4;ILjava/lang/Runnable;)V", "Lkotlin/Function2;", "callback", "c", "LBs2;", C17296a.f69688o, "LBs2;", "h", "()LBs2;", "k", "(LBs2;)V", "updateCallback", "Landroidx/recyclerview/widget/c;", "b", "Landroidx/recyclerview/widget/c;", "getConfig$paging_runtime_release", "()Landroidx/recyclerview/widget/c;", "getConfig$paging_runtime_release$annotations", "()V", "config", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "getMainThreadExecutor$paging_runtime_release", "()Ljava/util/concurrent/Executor;", "setMainThreadExecutor$paging_runtime_release", "(Ljava/util/concurrent/Executor;)V", "mainThreadExecutor", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lip$b;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners$paging_runtime_release", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners$paging_runtime_release$annotations", "listeners", "LZD3;", "getPagedList$annotations", "f", "getSnapshot$annotations", "snapshot", "g", "I", "getMaxScheduledGeneration$paging_runtime_release", "()I", "setMaxScheduledGeneration$paging_runtime_release", "(I)V", "getMaxScheduledGeneration$paging_runtime_release$annotations", "maxScheduledGeneration", "LZD3$e;", "LZD3$e;", "getLoadStateManager$annotations", "loadStateManager", "Lkotlin/reflect/KFunction2;", "Lpt2;", "Lkotlin/ParameterName;", "name", "type", "Lot2;", TransferTable.COLUMN_STATE, "Lkotlin/reflect/KFunction;", "loadStateListener", "", "Ljava/util/List;", "()Ljava/util/List;", "loadStateListeners", "LZD3$b;", "LZD3$b;", "getPagedListCallback$annotations", "pagedListCallback", "itemCount", "()LZD3;", "getCurrentList$annotations", "Landroidx/recyclerview/widget/RecyclerView$h;", "adapter", "Landroidx/recyclerview/widget/h$f;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$h;Landroidx/recyclerview/widget/h$f;)V", "paging-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: ip */
/* loaded from: classes.dex */
public class C24583ip<T> {

    /* renamed from: a */
    public InterfaceC32011Bs2 f91307a;

    /* renamed from: b */
    public final C11882c<T> f91308b;

    /* renamed from: c */
    public Executor f91309c;

    /* renamed from: d */
    public final CopyOnWriteArrayList<InterfaceC24585b<T>> f91310d;

    /* renamed from: e */
    public ZD3<T> f91311e;

    /* renamed from: f */
    public ZD3<T> f91312f;

    /* renamed from: g */
    public int f91313g;

    /* renamed from: h */
    public final ZD3.AbstractC10149e f91314h;

    /* renamed from: i */
    public final KFunction<Unit> f91315i;

    /* renamed from: j */
    public final List<Function2<EnumC47135pt2, AbstractC46542ot2, Unit>> f91316j;

    /* renamed from: k */
    public final ZD3.AbstractC10142b f91317k;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B1\u0012(\u0010\r\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\b\u001a\u00020\u00072\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016R9\u0010\r\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lip$a;", "", "T", "Lip$b;", "LZD3;", "previousList", "currentList", "", C17296a.f69688o, "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function2;", "getCallback", "()Lkotlin/jvm/functions/Function2;", "callback", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "paging-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: ip$a */
    /* loaded from: classes.dex */
    public static final class C24584a<T> implements InterfaceC24585b<T> {

        /* renamed from: a */
        public final Function2<ZD3<T>, ZD3<T>, Unit> f91318a;

        /* JADX WARN: Multi-variable type inference failed */
        public C24584a(Function2<? super ZD3<T>, ? super ZD3<T>, Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f91318a = callback;
        }

        @Override // p000.C24583ip.InterfaceC24585b
        /* renamed from: a */
        public void mo31835a(ZD3<T> zd3, ZD3<T> zd32) {
            this.f91318a.invoke(zd3, zd32);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001J(\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003H&¨\u0006\b"}, m28432d2 = {"Lip$b;", "", "T", "LZD3;", "previousList", "currentList", "", C17296a.f69688o, "paging-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData")
    /* renamed from: ip$b */
    /* loaded from: classes.dex */
    public interface InterfaceC24585b<T> {
        /* renamed from: a */
        void mo31835a(ZD3<T> zd3, ZD3<T> zd32);
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: ip$c */
    /* loaded from: classes.dex */
    public /* synthetic */ class C24586c extends FunctionReferenceImpl implements Function2<EnumC47135pt2, AbstractC46542ot2, Unit> {
        public C24586c(Object obj) {
            super(2, obj, ZD3.AbstractC10149e.class, "setState", "setState(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", 0);
        }

        /* renamed from: a */
        public final void m31834a(EnumC47135pt2 p0, AbstractC46542ot2 p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((ZD3.AbstractC10149e) this.receiver).m73535e(p0, p1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(EnumC47135pt2 enumC47135pt2, AbstractC46542ot2 abstractC46542ot2) {
            m31834a(enumC47135pt2, abstractC46542ot2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"ip$d", "LZD3$e;", "Lpt2;", "type", "Lot2;", TransferTable.COLUMN_STATE, "", DateTokenConverter.CONVERTER_KEY, "paging-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: ip$d */
    /* loaded from: classes.dex */
    public static final class C24587d extends ZD3.AbstractC10149e {

        /* renamed from: d */
        public final /* synthetic */ C24583ip<T> f91319d;

        public C24587d(C24583ip<T> c24583ip) {
            this.f91319d = c24583ip;
        }

        @Override // p000.ZD3.AbstractC10149e
        /* renamed from: d */
        public void mo31833d(EnumC47135pt2 type, AbstractC46542ot2 state) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            Iterator<T> it = this.f91319d.m31844g().iterator();
            while (it.hasNext()) {
                ((Function2) it.next()).invoke(type, state);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, m28432d2 = {"ip$e", "LZD3$b;", "", "position", "count", "", "b", "c", C17296a.f69688o, "paging-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: ip$e */
    /* loaded from: classes.dex */
    public static final class C24588e extends ZD3.AbstractC10142b {

        /* renamed from: a */
        public final /* synthetic */ C24583ip<T> f91320a;

        public C24588e(C24583ip<T> c24583ip) {
            this.f91320a = c24583ip;
        }

        @Override // p000.ZD3.AbstractC10142b
        /* renamed from: a */
        public void mo31832a(int i, int i2) {
            this.f91320a.m31843h().onChanged(i, i2, null);
        }

        @Override // p000.ZD3.AbstractC10142b
        /* renamed from: b */
        public void mo31831b(int i, int i2) {
            this.f91320a.m31843h().onInserted(i, i2);
        }

        @Override // p000.ZD3.AbstractC10142b
        /* renamed from: c */
        public void mo31830c(int i, int i2) {
            this.f91320a.m31843h().onRemoved(i, i2);
        }
    }

    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "AsyncPagingDataDiffer(\n                Dispatchers.Main,\n                Dispatchers.IO,\n                diffCallback,\n                listUpdateCallback\n            )", imports = {"androidx.paging.AsyncPagingDataDiffer", "kotlinx.coroutines.Dispatchers"}))
    public C24583ip(RecyclerView.AbstractC11843h<?> adapter, C11905h.AbstractC11911f<T> diffCallback) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Executor m108395i = C1988Em.m108395i();
        Intrinsics.checkNotNullExpressionValue(m108395i, "getMainThreadExecutor()");
        this.f91309c = m108395i;
        this.f91310d = new CopyOnWriteArrayList<>();
        C24587d c24587d = new C24587d(this);
        this.f91314h = c24587d;
        this.f91315i = new C24586c(c24587d);
        this.f91316j = new CopyOnWriteArrayList();
        this.f91317k = new C24588e(this);
        m31840k(new C11881b(adapter));
        C11882c<T> m66328a = new C11882c.C11883a(diffCallback).m66328a();
        Intrinsics.checkNotNullExpressionValue(m66328a, "Builder(diffCallback).build()");
        this.f91308b = m66328a;
    }

    /* renamed from: n */
    public static final void m31837n(final ZD3 zd3, final ZD3 newSnapshot, final C24583ip this$0, final int i, final ZD3 zd32, final C34353Ls4 recordingCallback, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(newSnapshot, "$newSnapshot");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(recordingCallback, "$recordingCallback");
        InterfaceC45790nd3<T> m73568D = zd3.m73568D();
        InterfaceC45790nd3<T> m73568D2 = newSnapshot.m73568D();
        C11905h.AbstractC11911f<T> m66330b = this$0.f91308b.m66330b();
        Intrinsics.checkNotNullExpressionValue(m66330b, "config.diffCallback");
        final C45197md3 m20770a = C46383od3.m20770a(m73568D, m73568D2, m66330b);
        this$0.f91309c.execute(new Runnable() { // from class: hp
            @Override // java.lang.Runnable
            public final void run() {
                C24583ip.m31836o(C24583ip.this, i, zd32, newSnapshot, m20770a, recordingCallback, zd3, runnable);
            }
        });
    }

    /* renamed from: o */
    public static final void m31836o(C24583ip this$0, int i, ZD3 zd3, ZD3 newSnapshot, C45197md3 result, C34353Ls4 recordingCallback, ZD3 zd32, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(newSnapshot, "$newSnapshot");
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(recordingCallback, "$recordingCallback");
        if (this$0.f91313g == i) {
            this$0.m31842i(zd3, newSnapshot, result, recordingCallback, zd32.m73563K(), runnable);
        }
    }

    /* renamed from: c */
    public final void m31848c(Function2<? super ZD3<T>, ? super ZD3<T>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f91310d.add(new C24584a(callback));
    }

    /* renamed from: d */
    public ZD3<T> m31847d() {
        ZD3<T> zd3 = this.f91312f;
        return zd3 == null ? this.f91311e : zd3;
    }

    /* renamed from: e */
    public T m31846e(int i) {
        ZD3<T> zd3 = this.f91312f;
        ZD3<T> zd32 = this.f91311e;
        if (zd3 != null) {
            return zd3.get(i);
        }
        if (zd32 != null) {
            zd32.m73562L(i);
            return zd32.get(i);
        }
        throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
    }

    /* renamed from: f */
    public int m31845f() {
        ZD3<T> m31847d = m31847d();
        if (m31847d != null) {
            return m31847d.size();
        }
        return 0;
    }

    /* renamed from: g */
    public final List<Function2<EnumC47135pt2, AbstractC46542ot2, Unit>> m31844g() {
        return this.f91316j;
    }

    /* renamed from: h */
    public final InterfaceC32011Bs2 m31843h() {
        InterfaceC32011Bs2 interfaceC32011Bs2 = this.f91307a;
        if (interfaceC32011Bs2 != null) {
            return interfaceC32011Bs2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("updateCallback");
        return null;
    }

    /* renamed from: i */
    public final void m31842i(ZD3<T> newList, ZD3<T> diffSnapshot, C45197md3 diffResult, C34353Ls4 recordingCallback, int i, Runnable runnable) {
        int coerceIn;
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(diffSnapshot, "diffSnapshot");
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        Intrinsics.checkNotNullParameter(recordingCallback, "recordingCallback");
        ZD3<T> zd3 = this.f91312f;
        if (zd3 != null && this.f91311e == null) {
            this.f91311e = newList;
            newList.m73550v((Function2) this.f91315i);
            this.f91312f = null;
            C46383od3.m20769b(zd3.m73568D(), m31843h(), diffSnapshot.m73568D(), diffResult);
            recordingCallback.m96259d(this.f91317k);
            newList.m73552s(this.f91317k);
            if (!newList.isEmpty()) {
                coerceIn = RangesKt___RangesKt.coerceIn(C46383od3.m20768c(zd3.m73568D(), diffResult, diffSnapshot.m73568D(), i), 0, newList.size() - 1);
                newList.m73562L(coerceIn);
            }
            m31841j(zd3, this.f91311e, runnable);
            return;
        }
        throw new IllegalStateException("must be in snapshot state to apply diff");
    }

    /* renamed from: j */
    public final void m31841j(ZD3<T> zd3, ZD3<T> zd32, Runnable runnable) {
        Iterator<T> it = this.f91310d.iterator();
        while (it.hasNext()) {
            ((InterfaceC24585b) it.next()).mo31835a(zd3, zd32);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: k */
    public final void m31840k(InterfaceC32011Bs2 interfaceC32011Bs2) {
        Intrinsics.checkNotNullParameter(interfaceC32011Bs2, "<set-?>");
        this.f91307a = interfaceC32011Bs2;
    }

    /* renamed from: l */
    public void m31839l(ZD3<T> zd3) {
        m31838m(zd3, null);
    }

    /* renamed from: m */
    public void m31838m(final ZD3<T> zd3, final Runnable runnable) {
        final int i = this.f91313g + 1;
        this.f91313g = i;
        ZD3<T> zd32 = this.f91311e;
        if (zd3 == zd32) {
            if (runnable != null) {
                runnable.run();
            }
        } else if (zd32 != null && (zd3 instanceof C47224q22)) {
            zd32.m73557S(this.f91317k);
            zd32.m73556T((Function2) this.f91315i);
            this.f91314h.m73535e(EnumC47135pt2.REFRESH, AbstractC46542ot2.C27093b.f102708b);
            this.f91314h.m73535e(EnumC47135pt2.PREPEND, new AbstractC46542ot2.C27094c(false));
            this.f91314h.m73535e(EnumC47135pt2.APPEND, new AbstractC46542ot2.C27094c(false));
            if (runnable != null) {
                runnable.run();
            }
        } else {
            ZD3<T> m31847d = m31847d();
            if (zd3 == null) {
                int m31845f = m31845f();
                if (zd32 != null) {
                    zd32.m73557S(this.f91317k);
                    zd32.m73556T((Function2) this.f91315i);
                    this.f91311e = null;
                } else if (this.f91312f != null) {
                    this.f91312f = null;
                }
                m31843h().onRemoved(0, m31845f);
                m31841j(m31847d, null, runnable);
            } else if (m31847d() == null) {
                this.f91311e = zd3;
                zd3.m73550v((Function2) this.f91315i);
                zd3.m73552s(this.f91317k);
                m31843h().onInserted(0, zd3.size());
                m31841j(null, zd3, runnable);
            } else {
                ZD3<T> zd33 = this.f91311e;
                if (zd33 != null) {
                    zd33.m73557S(this.f91317k);
                    zd33.m73556T((Function2) this.f91315i);
                    List<T> m73554X = zd33.m73554X();
                    Intrinsics.checkNotNull(m73554X, "null cannot be cast to non-null type androidx.paging.PagedList<T of androidx.paging.AsyncPagedListDiffer.submitList$lambda-0>");
                    this.f91312f = (ZD3) m73554X;
                    this.f91311e = null;
                }
                final ZD3<T> zd34 = this.f91312f;
                if (zd34 != null && this.f91311e == null) {
                    List<T> m73554X2 = zd3.m73554X();
                    Intrinsics.checkNotNull(m73554X2, "null cannot be cast to non-null type androidx.paging.PagedList<T of androidx.paging.AsyncPagedListDiffer>");
                    final ZD3 zd35 = (ZD3) m73554X2;
                    final C34353Ls4 c34353Ls4 = new C34353Ls4();
                    zd3.m73552s(c34353Ls4);
                    this.f91308b.m66331a().execute(new Runnable() { // from class: gp
                        @Override // java.lang.Runnable
                        public final void run() {
                            C24583ip.m31837n(ZD3.this, zd35, this, i, zd3, c34353Ls4, runnable);
                        }
                    });
                    return;
                }
                throw new IllegalStateException("must be in snapshot state to diff");
            }
        }
    }
}
