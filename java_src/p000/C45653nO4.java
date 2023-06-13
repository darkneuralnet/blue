package p000;

import co.bird.android.model.ContiguousDataState;
import co.bird.android.model.ContiguousInitialDataState;
import co.bird.android.model.RetryableContiguousDataSource;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC32569Ec2;
import p000.AbstractC38520bO4;
import p000.AbstractC39113cO4;
import p000.C45653nO4;
import p000.UD3;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00020\u0004B#\u0012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%\u0012\u0006\u0010,\u001a\u00020)¢\u0006\u0004\bB\u0010CJ\u001f\u0010\b\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u0015\u001a\u00020\u00142\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0016J0\u0010\u0018\u001a\u00020\u00142\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u00162\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H\u0016J0\u0010\u0019\u001a\u00020\u00142\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u00162\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J2\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001e0\u001d*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001e0\u001d2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0002J@\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 0\u001d*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 0\u001d2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00172\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002R \u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R(\u00104\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010.0.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R(\u00107\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\"0\"0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00103R(\u0010:\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\"0\"0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u00103R\"\u0010=\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u00140\u00140!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\"\u0010?\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u00140\u00140!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\"\u0010A\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u00140\u00140!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010<¨\u0006D"}, m28432d2 = {"LnO4;", "Key", "Value", "LUD3;", "Lco/bird/android/model/RetryableContiguousDataSource;", "", "position", "item", "G", "(JLjava/lang/Object;)Ljava/lang/Object;", "item1", "item2", "", "E", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "LEc2$c;", "LTD3;", "params", "LUD3$e;", "callback", "", "J", "LEc2$d;", "LUD3$c;", "H", "I", "retryInitial", "retryBefore", "retryAfter", "Lio/reactivex/F;", "LbO4;", "c0", "LcO4;", "LZt4;", "Lco/bird/android/model/ContiguousDataState;", "loadingState", "b0", "LrO4;", "f", "LrO4;", "dataSourceDelegate", "Lcom/uber/autodispose/ScopeProvider;", "g", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LAG;", "Lco/bird/android/model/ContiguousInitialDataState;", "kotlin.jvm.PlatformType", "h", "LAG;", "X", "()LAG;", "initialState", "i", "W", "beforeState", "j", "V", "afterState", "k", "LZt4;", "initialRetries", "l", "beforeRetries", "m", "afterRetries", "<init>", "(LrO4;Lcom/uber/autodispose/ScopeProvider;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRetryableIPagetemKeyedDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetryableIPagetemKeyedDataSource.kt\nco/bird/android/widget/paging/pageitem/RetryablePageItemKeyedDataSource\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,155:1\n144#1:156\n144#1:158\n144#1:160\n199#2:157\n199#2:159\n199#2:161\n*S KotlinDebug\n*F\n+ 1 RetryableIPagetemKeyedDataSource.kt\nco/bird/android/widget/paging/pageitem/RetryablePageItemKeyedDataSource\n*L\n39#1:156\n51#1:158\n63#1:160\n43#1:157\n55#1:159\n67#1:161\n*E\n"})
/* renamed from: nO4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45653nO4<Key, Value> extends UD3<Key, Value> implements RetryableContiguousDataSource {

    /* renamed from: f */
    public final InterfaceC48025rO4<Key, Value> f99862f;

    /* renamed from: g */
    public final ScopeProvider f99863g;

    /* renamed from: h */
    public final C0058AG<ContiguousInitialDataState> f99864h;

    /* renamed from: i */
    public final C0058AG<ContiguousDataState> f99865i;

    /* renamed from: j */
    public final C0058AG<ContiguousDataState> f99866j;

    /* renamed from: k */
    public final AbstractC37638Zt4<Unit> f99867k;

    /* renamed from: l */
    public final AbstractC37638Zt4<Unit> f99868l;

    /* renamed from: m */
    public final AbstractC37638Zt4<Unit> f99869m;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003 \u0006*\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00050\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"T", "Key", "Value", "", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Object;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRetryableIPagetemKeyedDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetryableIPagetemKeyedDataSource.kt\nco/bird/android/widget/paging/pageitem/RetryablePageItemKeyedDataSource$promoteTypeToErrorStream$1\n*L\n1#1,155:1\n*E\n"})
    /* renamed from: nO4$a */
    /* loaded from: classes4.dex */
    public static final class C26472a<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C26472a<T, R> f99870b = new C26472a<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public final InterfaceC23447K<? extends Object> apply(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof AbstractC39113cO4.C13536b) {
                AbstractC23442F m33100x = AbstractC23442F.m33100x(new C39724dO4());
                Intrinsics.checkNotNullExpressionValue(m33100x, "{\n        Single.error(R…oadResultError())\n      }");
                return m33100x;
            }
            AbstractC23442F m33158H = AbstractC23442F.m33158H(it);
            Intrinsics.checkNotNullExpressionValue(m33158H, "{\n        Single.just(it)\n      }");
            return m33158H;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Key", "Value", "Lio/reactivex/k;", "", "kotlin.jvm.PlatformType", "errors", "Lna4;", "b", "(Lio/reactivex/k;)Lna4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nO4$b */
    /* loaded from: classes4.dex */
    public static final class C26473b extends Lambda implements Function1<AbstractC24490k<Throwable>, InterfaceC45761na4<?>> {

        /* renamed from: g */
        public final /* synthetic */ C45653nO4<Key, Value> f99871g;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\t\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Key", "Value", "", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: nO4$b$a */
        /* loaded from: classes4.dex */
        public static final class C26474a extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends Unit>> {

            /* renamed from: g */
            public final /* synthetic */ C45653nO4<Key, Value> f99872g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26474a(C45653nO4<Key, Value> c45653nO4) {
                super(1);
                this.f99872g = c45653nO4;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23447K<? extends Unit> invoke(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f99872g.f99869m.firstOrError().m33152N(C24542a.m31932c());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26473b(C45653nO4<Key, Value> c45653nO4) {
            super(1);
            this.f99871g = c45653nO4;
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC45761na4<?> invoke(AbstractC24490k<Throwable> errors) {
            Intrinsics.checkNotNullParameter(errors, "errors");
            final C26474a c26474a = new C26474a(this.f99871g);
            return errors.m32149f0(new InterfaceC23492o() { // from class: oO4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = C45653nO4.C26473b.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003 \u0006*\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00050\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"T", "Key", "Value", "", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Object;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRetryableIPagetemKeyedDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetryableIPagetemKeyedDataSource.kt\nco/bird/android/widget/paging/pageitem/RetryablePageItemKeyedDataSource$promoteTypeToErrorStream$1\n*L\n1#1,155:1\n*E\n"})
    /* renamed from: nO4$c */
    /* loaded from: classes4.dex */
    public static final class C26475c<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C26475c<T, R> f99873b = new C26475c<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public final InterfaceC23447K<? extends Object> apply(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof AbstractC39113cO4.C13536b) {
                AbstractC23442F m33100x = AbstractC23442F.m33100x(new C39724dO4());
                Intrinsics.checkNotNullExpressionValue(m33100x, "{\n        Single.error(R…oadResultError())\n      }");
                return m33100x;
            }
            AbstractC23442F m33158H = AbstractC23442F.m33158H(it);
            Intrinsics.checkNotNullExpressionValue(m33158H, "{\n        Single.just(it)\n      }");
            return m33158H;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Key", "Value", "Lio/reactivex/k;", "", "kotlin.jvm.PlatformType", "errors", "Lna4;", "b", "(Lio/reactivex/k;)Lna4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nO4$d */
    /* loaded from: classes4.dex */
    public static final class C26476d extends Lambda implements Function1<AbstractC24490k<Throwable>, InterfaceC45761na4<?>> {

        /* renamed from: g */
        public final /* synthetic */ C45653nO4<Key, Value> f99874g;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\t\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Key", "Value", "", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: nO4$d$a */
        /* loaded from: classes4.dex */
        public static final class C26477a extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends Unit>> {

            /* renamed from: g */
            public final /* synthetic */ C45653nO4<Key, Value> f99875g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26477a(C45653nO4<Key, Value> c45653nO4) {
                super(1);
                this.f99875g = c45653nO4;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23447K<? extends Unit> invoke(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f99875g.f99868l.firstOrError().m33152N(C24542a.m31932c());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26476d(C45653nO4<Key, Value> c45653nO4) {
            super(1);
            this.f99874g = c45653nO4;
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC45761na4<?> invoke(AbstractC24490k<Throwable> errors) {
            Intrinsics.checkNotNullParameter(errors, "errors");
            final C26477a c26477a = new C26477a(this.f99874g);
            return errors.m32149f0(new InterfaceC23492o() { // from class: pO4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = C45653nO4.C26476d.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003 \u0006*\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00050\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"T", "Key", "Value", "", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Object;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRetryableIPagetemKeyedDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetryableIPagetemKeyedDataSource.kt\nco/bird/android/widget/paging/pageitem/RetryablePageItemKeyedDataSource$promoteTypeToErrorStream$1\n*L\n1#1,155:1\n*E\n"})
    /* renamed from: nO4$e */
    /* loaded from: classes4.dex */
    public static final class C26478e<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C26478e<T, R> f99876b = new C26478e<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public final InterfaceC23447K<? extends Object> apply(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof AbstractC38520bO4.C12380c) {
                AbstractC23442F m33100x = AbstractC23442F.m33100x(new C39724dO4());
                Intrinsics.checkNotNullExpressionValue(m33100x, "{\n        Single.error(R…oadResultError())\n      }");
                return m33100x;
            }
            AbstractC23442F m33158H = AbstractC23442F.m33158H(it);
            Intrinsics.checkNotNullExpressionValue(m33158H, "{\n        Single.just(it)\n      }");
            return m33158H;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Key", "Value", "Lio/reactivex/k;", "", "kotlin.jvm.PlatformType", "errors", "Lna4;", "b", "(Lio/reactivex/k;)Lna4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nO4$f */
    /* loaded from: classes4.dex */
    public static final class C26479f extends Lambda implements Function1<AbstractC24490k<Throwable>, InterfaceC45761na4<?>> {

        /* renamed from: g */
        public final /* synthetic */ C45653nO4<Key, Value> f99877g;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\t\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Key", "Value", "", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: nO4$f$a */
        /* loaded from: classes4.dex */
        public static final class C26480a extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends Unit>> {

            /* renamed from: g */
            public final /* synthetic */ C45653nO4<Key, Value> f99878g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26480a(C45653nO4<Key, Value> c45653nO4) {
                super(1);
                this.f99878g = c45653nO4;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23447K<? extends Unit> invoke(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f99878g.f99867k.firstOrError().m33152N(C24542a.m31932c());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26479f(C45653nO4<Key, Value> c45653nO4) {
            super(1);
            this.f99877g = c45653nO4;
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC45761na4<?> invoke(AbstractC24490k<Throwable> errors) {
            Intrinsics.checkNotNullParameter(errors, "errors");
            final C26480a c26480a = new C26480a(this.f99877g);
            return errors.m32149f0(new InterfaceC23492o() { // from class: qO4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = C45653nO4.C26479f.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Key", "Value", "Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nO4$g */
    /* loaded from: classes4.dex */
    public static final class C26481g extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C45653nO4<Key, Value> f99879g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26481g(C45653nO4<Key, Value> c45653nO4) {
            super(1);
            this.f99879g = c45653nO4;
        }

        /* renamed from: a */
        public final void m23861a(InterfaceC23465c interfaceC23465c) {
            this.f99879g.getInitialState().accept(ContiguousInitialDataState.Loading.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m23861a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00028\u0001 \u0003*\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Key", "Value", "LbO4;", "kotlin.jvm.PlatformType", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "(LbO4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nO4$h */
    /* loaded from: classes4.dex */
    public static final class C26482h extends Lambda implements Function1<AbstractC38520bO4<Value>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C45653nO4<Key, Value> f99880g;

        /* renamed from: h */
        public final /* synthetic */ UD3.InterfaceC8221e<Value> f99881h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26482h(C45653nO4<Key, Value> c45653nO4, UD3.InterfaceC8221e<Value> interfaceC8221e) {
            super(1);
            this.f99880g = c45653nO4;
            this.f99881h = interfaceC8221e;
        }

        /* renamed from: a */
        public final void m23860a(AbstractC38520bO4<Value> abstractC38520bO4) {
            ContiguousInitialDataState contiguousInitialDataState;
            ContiguousInitialDataState contiguousInitialDataState2;
            if (abstractC38520bO4 instanceof AbstractC38520bO4.C12379b) {
                C0058AG<ContiguousInitialDataState> initialState = this.f99880g.getInitialState();
                AbstractC38520bO4.C12379b c12379b = (AbstractC38520bO4.C12379b) abstractC38520bO4;
                if (c12379b.m64603b().isEmpty()) {
                    contiguousInitialDataState2 = ContiguousInitialDataState.Empty.INSTANCE;
                } else {
                    contiguousInitialDataState2 = ContiguousInitialDataState.Content.INSTANCE;
                }
                initialState.accept(contiguousInitialDataState2);
                if (c12379b.m64602c() > 0) {
                    this.f99880g.getBeforeState().accept(ContiguousDataState.Loading.INSTANCE);
                }
                if (c12379b.m64601d() > c12379b.m64603b().size() + c12379b.m64602c()) {
                    this.f99880g.getAfterState().accept(ContiguousDataState.Loading.INSTANCE);
                }
                this.f99881h.mo81808b(c12379b.m64603b(), c12379b.m64602c(), c12379b.m64601d());
            } else if (abstractC38520bO4 instanceof AbstractC38520bO4.C12378a) {
                C0058AG<ContiguousInitialDataState> initialState2 = this.f99880g.getInitialState();
                AbstractC38520bO4.C12378a c12378a = (AbstractC38520bO4.C12378a) abstractC38520bO4;
                if (c12378a.m64605b().isEmpty()) {
                    contiguousInitialDataState = ContiguousInitialDataState.Empty.INSTANCE;
                } else {
                    contiguousInitialDataState = ContiguousInitialDataState.Content.INSTANCE;
                }
                initialState2.accept(contiguousInitialDataState);
                if (!c12378a.m64605b().isEmpty()) {
                    this.f99880g.getAfterState().accept(ContiguousDataState.Loading.INSTANCE);
                }
                this.f99881h.mo81809a(c12378a.m64605b());
            } else if (abstractC38520bO4 instanceof AbstractC38520bO4.C12380c) {
                this.f99880g.getInitialState().accept(new ContiguousInitialDataState.Error(((AbstractC38520bO4.C12380c) abstractC38520bO4).m64599b()));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            m23860a((AbstractC38520bO4) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "Key", "Value", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nO4$i */
    /* loaded from: classes4.dex */
    public static final class C26483i extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C45653nO4<Key, Value> f99882g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26483i(C45653nO4<Key, Value> c45653nO4) {
            super(1);
            this.f99882g = c45653nO4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f99882g.getInitialState().accept(new ContiguousInitialDataState.Error(null, 1, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Key", "Value", "Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nO4$j */
    /* loaded from: classes4.dex */
    public static final class C26484j extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC37638Zt4<ContiguousDataState> f99883g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26484j(AbstractC37638Zt4<ContiguousDataState> abstractC37638Zt4) {
            super(1);
            this.f99883g = abstractC37638Zt4;
        }

        /* renamed from: a */
        public final void m23859a(InterfaceC23465c interfaceC23465c) {
            this.f99883g.accept(ContiguousDataState.Loading.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m23859a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00028\u0001 \u0003*\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Key", "Value", "LcO4;", "kotlin.jvm.PlatformType", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "(LcO4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nO4$k */
    /* loaded from: classes4.dex */
    public static final class C26485k extends Lambda implements Function1<AbstractC39113cO4<Value>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC37638Zt4<ContiguousDataState> f99884g;

        /* renamed from: h */
        public final /* synthetic */ UD3.InterfaceC8219c<Value> f99885h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26485k(AbstractC37638Zt4<ContiguousDataState> abstractC37638Zt4, UD3.InterfaceC8219c<Value> interfaceC8219c) {
            super(1);
            this.f99884g = abstractC37638Zt4;
            this.f99885h = interfaceC8219c;
        }

        /* renamed from: a */
        public final void m23858a(AbstractC39113cO4<Value> abstractC39113cO4) {
            if (abstractC39113cO4 instanceof AbstractC39113cO4.C13535a) {
                AbstractC39113cO4.C13535a c13535a = (AbstractC39113cO4.C13535a) abstractC39113cO4;
                if (c13535a.m61458b().isEmpty()) {
                    this.f99884g.accept(ContiguousDataState.Done.INSTANCE);
                }
                this.f99885h.mo81810a(c13535a.m61458b());
            } else if (abstractC39113cO4 instanceof AbstractC39113cO4.C13536b) {
                this.f99884g.accept(new ContiguousDataState.Error(((AbstractC39113cO4.C13536b) abstractC39113cO4).m61456b()));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            m23858a((AbstractC39113cO4) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "Key", "Value", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nO4$l */
    /* loaded from: classes4.dex */
    public static final class C26486l extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC37638Zt4<ContiguousDataState> f99886g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26486l(AbstractC37638Zt4<ContiguousDataState> abstractC37638Zt4) {
            super(1);
            this.f99886g = abstractC37638Zt4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f99886g.accept(new ContiguousDataState.Error(null, 1, null));
        }
    }

    public C45653nO4(InterfaceC48025rO4<Key, Value> dataSourceDelegate, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(dataSourceDelegate, "dataSourceDelegate");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f99862f = dataSourceDelegate;
        this.f99863g = scopeProvider;
        C0058AG<ContiguousInitialDataState> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<ContiguousInitialDataState>()");
        this.f99864h = m115951g;
        ContiguousDataState.Done done = ContiguousDataState.Done.INSTANCE;
        C0058AG<ContiguousDataState> m115950h = C0058AG.m115950h(done);
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault<Contiguous…ContiguousDataState.Done)");
        this.f99865i = m115950h;
        C0058AG<ContiguousDataState> m115950h2 = C0058AG.m115950h(done);
        Intrinsics.checkNotNullExpressionValue(m115950h2, "createDefault<Contiguous…ContiguousDataState.Done)");
        this.f99866j = m115950h2;
        AbstractC37638Zt4 m72348c = C45168ma4.m25409g().m72348c();
        Intrinsics.checkNotNullExpressionValue(m72348c, "create<Unit>().toSerialized()");
        this.f99867k = m72348c;
        AbstractC37638Zt4 m72348c2 = C45168ma4.m25409g().m72348c();
        Intrinsics.checkNotNullExpressionValue(m72348c2, "create<Unit>().toSerialized()");
        this.f99868l = m72348c2;
        AbstractC37638Zt4 m72348c3 = C45168ma4.m25409g().m72348c();
        Intrinsics.checkNotNullExpressionValue(m72348c3, "create<Unit>().toSerialized()");
        this.f99869m = m72348c3;
    }

    /* renamed from: Y */
    public static final InterfaceC45761na4 m23881Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final InterfaceC45761na4 m23880Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final InterfaceC45761na4 m23879a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m23876d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m23875e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m23874f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m23873g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m23872h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m23871i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.UD3
    /* renamed from: E */
    public boolean mo23898E(Value value, Value value2) {
        return this.f99862f.areItemsTheSame(value, value2);
    }

    @Override // p000.UD3
    /* renamed from: G */
    public Key mo23897G(long j, Value value) {
        return this.f99862f.getKey(j, value);
    }

    @Override // p000.UD3
    /* renamed from: H */
    public void mo23896H(AbstractC32569Ec2.C1915d<TD3<Key, Value>> params, UD3.InterfaceC8219c<Value> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC23442F<R> m33165A = m23878b0(this.f99862f.mo16007a(params), callback, getAfterState()).m33165A(C26472a.f99870b);
        Intrinsics.checkNotNullExpressionValue(m33165A, "flatMap {\n      if (it i…le.just(it)\n      }\n    }");
        final C26473b c26473b = new C26473b(this);
        AbstractC23442F m33143W = m33165A.m33143W(new InterfaceC23492o() { // from class: gO4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC45761na4 m23881Y;
                m23881Y = C45653nO4.m23881Y(Function1.this, obj);
                return m23881Y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33143W, "override fun loadAfter(p…r)\n      .subscribe()\n  }");
        Object m33135e = m33143W.m33135e(AutoDispose.m45239a(this.f99863g));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((SingleSubscribeProxy) m33135e).subscribe();
    }

    @Override // p000.UD3
    /* renamed from: I */
    public void mo23895I(AbstractC32569Ec2.C1915d<TD3<Key, Value>> params, UD3.InterfaceC8219c<Value> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC23442F<R> m33165A = m23878b0(this.f99862f.mo16006b(params), callback, getBeforeState()).m33165A(C26475c.f99873b);
        Intrinsics.checkNotNullExpressionValue(m33165A, "flatMap {\n      if (it i…le.just(it)\n      }\n    }");
        final C26476d c26476d = new C26476d(this);
        AbstractC23442F m33143W = m33165A.m33143W(new InterfaceC23492o() { // from class: fO4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC45761na4 m23880Z;
                m23880Z = C45653nO4.m23880Z(Function1.this, obj);
                return m23880Z;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33143W, "override fun loadBefore(…r)\n      .subscribe()\n  }");
        Object m33135e = m33143W.m33135e(AutoDispose.m45239a(this.f99863g));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((SingleSubscribeProxy) m33135e).subscribe();
    }

    @Override // p000.UD3
    /* renamed from: J */
    public void mo23894J(AbstractC32569Ec2.C1914c<TD3<Key, Value>> params, UD3.InterfaceC8221e<Value> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC23442F<R> m33165A = m23877c0(this.f99862f.mo16005c(params), callback).m33165A(C26478e.f99876b);
        Intrinsics.checkNotNullExpressionValue(m33165A, "flatMap {\n      if (it i…le.just(it)\n      }\n    }");
        final C26479f c26479f = new C26479f(this);
        AbstractC23442F m33143W = m33165A.m33143W(new InterfaceC23492o() { // from class: eO4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC45761na4 m23879a0;
                m23879a0 = C45653nO4.m23879a0(Function1.this, obj);
                return m23879a0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33143W, "override fun loadInitial…r)\n      .subscribe()\n  }");
        Object m33135e = m33143W.m33135e(AutoDispose.m45239a(this.f99863g));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((SingleSubscribeProxy) m33135e).subscribe();
    }

    @Override // co.bird.android.model.RetryableContiguousDataSource
    /* renamed from: V */
    public C0058AG<ContiguousDataState> getAfterState() {
        return this.f99866j;
    }

    @Override // co.bird.android.model.RetryableContiguousDataSource
    /* renamed from: W */
    public C0058AG<ContiguousDataState> getBeforeState() {
        return this.f99865i;
    }

    @Override // co.bird.android.model.RetryableContiguousDataSource
    /* renamed from: X */
    public C0058AG<ContiguousInitialDataState> getInitialState() {
        return this.f99864h;
    }

    /* renamed from: b0 */
    public final AbstractC23442F<AbstractC39113cO4<Value>> m23878b0(AbstractC23442F<AbstractC39113cO4<Value>> abstractC23442F, UD3.InterfaceC8219c<Value> interfaceC8219c, AbstractC37638Zt4<ContiguousDataState> abstractC37638Zt4) {
        final C26484j c26484j = new C26484j(abstractC37638Zt4);
        AbstractC23442F<AbstractC39113cO4<Value>> m33102v = abstractC23442F.m33102v(new InterfaceC23484g() { // from class: hO4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45653nO4.m23873g0(Function1.this, obj);
            }
        });
        final C26485k c26485k = new C26485k(abstractC37638Zt4, interfaceC8219c);
        AbstractC23442F<AbstractC39113cO4<Value>> m33101w = m33102v.m33101w(new InterfaceC23484g() { // from class: iO4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45653nO4.m23872h0(Function1.this, obj);
            }
        });
        final C26486l c26486l = new C26486l(abstractC37638Zt4);
        AbstractC23442F<AbstractC39113cO4<Value>> m33106t = m33101w.m33106t(new InterfaceC23484g() { // from class: jO4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45653nO4.m23871i0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33106t, "callback: LoadCallback<V…ataState.Error())\n      }");
        return m33106t;
    }

    /* renamed from: c0 */
    public final AbstractC23442F<AbstractC38520bO4<Value>> m23877c0(AbstractC23442F<AbstractC38520bO4<Value>> abstractC23442F, UD3.InterfaceC8221e<Value> interfaceC8221e) {
        final C26481g c26481g = new C26481g(this);
        AbstractC23442F<AbstractC38520bO4<Value>> m33102v = abstractC23442F.m33102v(new InterfaceC23484g() { // from class: kO4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45653nO4.m23876d0(Function1.this, obj);
            }
        });
        final C26482h c26482h = new C26482h(this, interfaceC8221e);
        AbstractC23442F<AbstractC38520bO4<Value>> m33101w = m33102v.m33101w(new InterfaceC23484g() { // from class: lO4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45653nO4.m23875e0(Function1.this, obj);
            }
        });
        final C26483i c26483i = new C26483i(this);
        AbstractC23442F<AbstractC38520bO4<Value>> m33106t = m33101w.m33106t(new InterfaceC23484g() { // from class: mO4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45653nO4.m23874f0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33106t, "private fun Single<Retry…tate.Error())\n      }\n  }");
        return m33106t;
    }

    @Override // co.bird.android.model.RetryableContiguousDataSource
    public void retryAfter() {
        this.f99869m.accept(Unit.INSTANCE);
    }

    @Override // co.bird.android.model.RetryableContiguousDataSource
    public void retryBefore() {
        this.f99868l.accept(Unit.INSTANCE);
    }

    @Override // co.bird.android.model.RetryableContiguousDataSource
    public void retryInitial() {
        this.f99867k.accept(Unit.INSTANCE);
    }
}
