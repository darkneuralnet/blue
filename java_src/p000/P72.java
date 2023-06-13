package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.User;
import co.bird.android.model.constant.HealthStatus;
import co.bird.android.model.wire.WireInventoryPart;
import co.bird.android.model.wire.WirePart;
import co.bird.android.model.wire.WirePartCategory;
import co.bird.api.response.InventoryStatusResponse;
import co.bird.api.response.WireInventory;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.subjects.C24552a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import p000.InterfaceC40099e13;
import p000.P72;
@Metadata(m28433d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200¢\u0006\u0004\b;\u0010<J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0006\u0010\u0011\u001a\u00020\tJ\u0006\u0010\u0012\u001a\u00020\tJ \u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R.\u00108\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 5*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010:\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00020\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107¨\u0006="}, m28432d2 = {"LP72;", "", "", "query", "", "Lco/bird/android/model/wire/WireInventoryPart;", "searchResults", "LH6;", "adapterSections", "", "T", "", "e", "A", "Lco/bird/api/response/InventoryStatusResponse;", "healthStatus", "u", "w", "B", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "v", "LXl3;", C17296a.f69688o, "LXl3;", "inventoryManager", "Llh6;", "b", "Llh6;", "userManager", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "LS72;", "LS72;", "categoryUi", "Ls72;", "f", "Ls72;", "categoryConverter", "LL82;", "g", "LL82;", "searchResultsConverter", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "h", "Lio/reactivex/subjects/a;", "partSearchResultsSubject", "i", "searchTextSubject", "<init>", "(LXl3;Llh6;Lcom/uber/autodispose/ScopeProvider;Le13;LS72;Ls72;LL82;)V", "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInventoryCategoryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryCategoryPresenter.kt\nco/bird/android/feature/operatorinventory/presenter/InventoryCategoryPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,156:1\n199#2:157\n180#2:158\n180#2:159\n180#2:160\n180#2:161\n180#2:162\n180#2:163\n180#2:164\n237#2:165\n180#2:166\n180#2:167\n*S KotlinDebug\n*F\n+ 1 InventoryCategoryPresenter.kt\nco/bird/android/feature/operatorinventory/presenter/InventoryCategoryPresenter\n*L\n43#1:157\n54#1:158\n60#1:159\n67#1:160\n74#1:161\n81#1:162\n94#1:163\n103#1:164\n109#1:165\n114#1:166\n122#1:167\n*E\n"})
/* renamed from: P72 */
/* loaded from: classes3.dex */
public final class P72 {

    /* renamed from: a */
    public final InterfaceC37097Xl3 f27909a;

    /* renamed from: b */
    public final InterfaceC44647lh6 f27910b;

    /* renamed from: c */
    public final ScopeProvider f27911c;

    /* renamed from: d */
    public final InterfaceC40099e13 f27912d;

    /* renamed from: e */
    public final S72 f27913e;

    /* renamed from: f */
    public final C48459s72 f27914f;

    /* renamed from: g */
    public final L82 f27915g;

    /* renamed from: h */
    public final C24552a<List<WireInventoryPart>> f27916h;

    /* renamed from: i */
    public final C24552a<String> f27917i;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/wire/WirePartCategory;", "it", "Lio/reactivex/K;", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P72$a */
    /* loaded from: classes3.dex */
    public static final class C6246a extends Lambda implements Function1<List<? extends WirePartCategory>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C6246a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(List<WirePartCategory> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return P72.this.f27914f.m14766b(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P72$b */
    /* loaded from: classes3.dex */
    public static final class C6247b extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C6247b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> it) {
            S72 s72 = P72.this.f27913e;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            s72.m85975Wl(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: P72$c */
    /* loaded from: classes3.dex */
    public static final class C6248c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C6248c f27920g = new C6248c();

        public C6248c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: P72$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6249d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C6249d(Object obj) {
            super(1, obj, P72.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((P72) this.receiver).m90796A(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001aú\u0001\u0012v\b\u0001\u0012r\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003 \u0002*8\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0018\u00010\u00070\u0007 \u0002*|\u0012v\b\u0001\u0012r\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003 \u0002*8\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/wire/WireInventoryPart;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lkotlin/Triple;", "LH6;", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P72$e */
    /* loaded from: classes3.dex */
    public static final class C6250e extends Lambda implements Function1<Pair<? extends String, ? extends List<? extends WireInventoryPart>>, InterfaceC23447K<? extends Triple<? extends String, ? extends List<? extends WireInventoryPart>, ? extends List<? extends C3023H6>>>> {

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001ar\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0005*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*8\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0005*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "LH6;", "it", "Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireInventoryPart;", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: P72$e$a */
        /* loaded from: classes3.dex */
        public static final class C6251a extends Lambda implements Function1<List<? extends C3023H6>, Triple<? extends String, ? extends List<? extends WireInventoryPart>, ? extends List<? extends C3023H6>>> {

            /* renamed from: g */
            public final /* synthetic */ String f27922g;

            /* renamed from: h */
            public final /* synthetic */ List<WireInventoryPart> f27923h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6251a(String str, List<WireInventoryPart> list) {
                super(1);
                this.f27922g = str;
                this.f27923h = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Triple<String, List<WireInventoryPart>, List<C3023H6>> invoke(List<C3023H6> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Triple<>(this.f27922g, this.f27923h, it);
            }
        }

        public C6250e() {
            super(1);
        }

        /* renamed from: c */
        public static final Triple m90747c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Triple<String, List<WireInventoryPart>, List<C3023H6>>> invoke(Pair<String, ? extends List<WireInventoryPart>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<WireInventoryPart> searchResults = pair.component2();
            L82 l82 = P72.this.f27915g;
            Intrinsics.checkNotNullExpressionValue(searchResults, "searchResults");
            AbstractC23442F<List<C3023H6>> m97670b = l82.m97670b(searchResults);
            final C6251a c6251a = new C6251a(pair.component1(), searchResults);
            return m97670b.m33157I(new InterfaceC23492o() { // from class: Q72
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Triple m90747c;
                    m90747c = P72.C6250e.m90747c(Function1.this, obj);
                    return m90747c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072v\u0010\u0006\u001ar\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003 \u0002*8\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/wire/WireInventoryPart;", "LH6;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P72$f */
    /* loaded from: classes3.dex */
    public static final class C6252f extends Lambda implements Function1<Triple<? extends String, ? extends List<? extends WireInventoryPart>, ? extends List<? extends C3023H6>>, Unit> {
        public C6252f() {
            super(1);
        }

        /* renamed from: a */
        public final void m90745a(Triple<String, ? extends List<WireInventoryPart>, ? extends List<C3023H6>> triple) {
            String query = triple.component1();
            List<WireInventoryPart> searchResults = triple.component2();
            List<C3023H6> sections = triple.component3();
            P72 p72 = P72.this;
            Intrinsics.checkNotNullExpressionValue(query, "query");
            Intrinsics.checkNotNullExpressionValue(searchResults, "searchResults");
            Intrinsics.checkNotNullExpressionValue(sections, "sections");
            p72.m90777T(query, searchResults, sections);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends String, ? extends List<? extends WireInventoryPart>, ? extends List<? extends C3023H6>> triple) {
            m90745a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: P72$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6253g extends FunctionReferenceImpl implements Function1<InventoryStatusResponse, Unit> {
        public C6253g(Object obj) {
            super(1, obj, P72.class, "handleInventoryHealthStatus", "handleInventoryHealthStatus(Lco/bird/api/response/InventoryStatusResponse;)V", 0);
        }

        /* renamed from: a */
        public final void m90744a(InventoryStatusResponse p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((P72) this.receiver).m90756u(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InventoryStatusResponse inventoryStatusResponse) {
            m90744a(inventoryStatusResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/constant/HealthStatus;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/constant/HealthStatus;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P72$h */
    /* loaded from: classes3.dex */
    public static final class C6254h extends Lambda implements Function1<Unit, HealthStatus> {

        /* renamed from: g */
        public static final C6254h f27925g = new C6254h();

        public C6254h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final HealthStatus invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return HealthStatus.INCOMPLETE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/constant/HealthStatus;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/constant/HealthStatus;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P72$i */
    /* loaded from: classes3.dex */
    public static final class C6255i extends Lambda implements Function1<Unit, HealthStatus> {

        /* renamed from: g */
        public static final C6255i f27926g = new C6255i();

        public C6255i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final HealthStatus invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return HealthStatus.RUNNING_LOW;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/constant/HealthStatus;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/constant/HealthStatus;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P72$j */
    /* loaded from: classes3.dex */
    public static final class C6256j extends Lambda implements Function1<Unit, HealthStatus> {

        /* renamed from: g */
        public static final C6256j f27927g = new C6256j();

        public C6256j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final HealthStatus invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return HealthStatus.OUT_OF_STOCK;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: P72$k */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6257k extends FunctionReferenceImpl implements Function1<HealthStatus, Unit> {
        public C6257k(Object obj) {
            super(1, obj, InterfaceC40099e13.class, "goToInventoryHealthLevel", "goToInventoryHealthLevel(Lco/bird/android/model/constant/HealthStatus;)V", 0);
        }

        /* renamed from: a */
        public final void m90740a(HealthStatus p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC40099e13) this.receiver).mo37125N0(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HealthStatus healthStatus) {
            m90740a(healthStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WirePartCategory;", "kotlin.jvm.PlatformType", "category", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WirePartCategory;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P72$l */
    /* loaded from: classes3.dex */
    public static final class C6258l extends Lambda implements Function1<WirePartCategory, Unit> {
        public C6258l() {
            super(1);
        }

        /* renamed from: a */
        public final void m90739a(WirePartCategory category) {
            InterfaceC40099e13 interfaceC40099e13 = P72.this.f27912d;
            Intrinsics.checkNotNullExpressionValue(category, "category");
            interfaceC40099e13.mo36994k3(category);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WirePartCategory wirePartCategory) {
            m90739a(wirePartCategory);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", "part", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WirePart;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P72$m */
    /* loaded from: classes3.dex */
    public static final class C6259m extends Lambda implements Function1<WirePart, Unit> {
        public C6259m() {
            super(1);
        }

        /* renamed from: a */
        public final void m90738a(WirePart wirePart) {
            InterfaceC40099e13.C19924a.goToInventoryPartDetails$default(P72.this.f27912d, null, wirePart.getKey(), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WirePart wirePart) {
            m90738a(wirePart);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: P72$n */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6260n extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C6260n(Object obj) {
            super(1, obj, P72.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((P72) this.receiver).m90796A(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P72$o */
    /* loaded from: classes3.dex */
    public static final class C6261o extends Lambda implements Function1<Unit, InterfaceC23447K<? extends String>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: P72$o$a */
        /* loaded from: classes3.dex */
        public static final class C6262a extends Lambda implements Function1<User, String> {

            /* renamed from: g */
            public static final C6262a f27931g = new C6262a();

            public C6262a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final String invoke(User it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String warehouseId = it.getWarehouseId();
                if (warehouseId == null) {
                    return "";
                }
                return warehouseId;
            }
        }

        public C6261o() {
            super(1);
        }

        /* renamed from: b */
        public static final String m90736b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (String) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends String> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F<User> user = P72.this.f27910b.getUser();
            final C6262a c6262a = C6262a.f27931g;
            return user.m33157I(new InterfaceC23492o() { // from class: R72
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    String m90736b;
                    m90736b = P72.C6261o.m90736b(Function1.this, obj);
                    return m90736b;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "warehouseId", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: P72$p */
    /* loaded from: classes3.dex */
    public static final class C6263p extends Lambda implements Function1<String, Unit> {
        public C6263p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String warehouseId) {
            InterfaceC40099e13 interfaceC40099e13 = P72.this.f27912d;
            Intrinsics.checkNotNullExpressionValue(warehouseId, "warehouseId");
            interfaceC40099e13.mo36954r1(warehouseId, 10039);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireInventoryPart;", "kotlin.jvm.PlatformType", "part", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireInventoryPart;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P72$q */
    /* loaded from: classes3.dex */
    public static final class C6264q extends Lambda implements Function1<WireInventoryPart, Unit> {
        public C6264q() {
            super(1);
        }

        /* renamed from: a */
        public final void m90734a(WireInventoryPart wireInventoryPart) {
            InterfaceC40099e13.C19924a.goToInventoryPartDetails$default(P72.this.f27912d, null, wireInventoryPart.getSku(), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireInventoryPart wireInventoryPart) {
            m90734a(wireInventoryPart);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: P72$r */
    /* loaded from: classes3.dex */
    public static final class C6265r extends Lambda implements Function1<String, String> {

        /* renamed from: g */
        public static final C6265r f27934g = new C6265r();

        public C6265r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String it) {
            CharSequence trim;
            Intrinsics.checkNotNullParameter(it, "it");
            trim = StringsKt__StringsKt.trim((CharSequence) it);
            return trim.toString();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "searchQuery", "Lio/reactivex/K;", "", "Lco/bird/android/model/wire/WireInventoryPart;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P72$s */
    /* loaded from: classes3.dex */
    public static final class C6266s extends Lambda implements Function1<String, InterfaceC23447K<? extends List<? extends WireInventoryPart>>> {
        public C6266s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends List<WireInventoryPart>> invoke(String searchQuery) {
            List emptyList;
            Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
            if (searchQuery.length() == 0) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                AbstractC23442F m33158H = AbstractC23442F.m33158H(emptyList);
                Intrinsics.checkNotNullExpressionValue(m33158H, "{\n          Single.just(listOf())\n        }");
                return m33158H;
            }
            return P72.this.f27909a.mo40848c(searchQuery);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: P72$t */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6267t extends FunctionReferenceImpl implements Function1<List<? extends WireInventoryPart>, Unit> {
        public C6267t(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireInventoryPart> list) {
            invoke2((List<WireInventoryPart>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireInventoryPart> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }
    }

    public P72(InterfaceC37097Xl3 inventoryManager, InterfaceC44647lh6 userManager, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, S72 categoryUi, C48459s72 categoryConverter, L82 searchResultsConverter) {
        Intrinsics.checkNotNullParameter(inventoryManager, "inventoryManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(categoryUi, "categoryUi");
        Intrinsics.checkNotNullParameter(categoryConverter, "categoryConverter");
        Intrinsics.checkNotNullParameter(searchResultsConverter, "searchResultsConverter");
        this.f27909a = inventoryManager;
        this.f27910b = userManager;
        this.f27911c = scopeProvider;
        this.f27912d = navigator;
        this.f27913e = categoryUi;
        this.f27914f = categoryConverter;
        this.f27915g = searchResultsConverter;
        C24552a<List<WireInventoryPart>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<List<WireInventoryPart>>()");
        this.f27916h = m31922e;
        C24552a<String> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<String>()");
        this.f27917i = m31922e2;
    }

    /* renamed from: C */
    public static final InterfaceC23447K m90794C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m90793D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m90792E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final InterfaceC23447K m90791F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m90790G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m90789H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final HealthStatus m90788I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (HealthStatus) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final HealthStatus m90787J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (HealthStatus) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final HealthStatus m90786K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (HealthStatus) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m90785L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m90784M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m90783N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m90782O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final InterfaceC23447K m90781P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m90780Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m90779R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final String m90778S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC23447K m90753x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m90752y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m90751z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final void m90796A(Throwable th) {
        C41318g46.m40159e(th);
    }

    /* renamed from: B */
    public final void m90795B() {
        Observable<WirePartCategory> observeOn = this.f27913e.m85961n2().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "categoryUi.categoryClick…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f27911c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6258l c6258l = new C6258l();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: v72
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                P72.m90784M(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f27913e.m8924Ql().m33094as(AutoDispose.m45239a(this.f27911c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6259m c6259m = new C6259m();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: N72
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                P72.m90783N(Function1.this, obj);
            }
        };
        final C6260n c6260n = new C6260n(this);
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: O72
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                P72.m90782O(Function1.this, obj);
            }
        });
        Observable<Unit> m85973Yl = this.f27913e.m85973Yl();
        final C6261o c6261o = new C6261o();
        Observable<R> flatMapSingle = m85973Yl.flatMapSingle(new InterfaceC23492o() { // from class: w72
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m90781P;
                m90781P = P72.m90781P(Function1.this, obj);
                return m90781P;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "fun onResume() {\n    cat…InventoryHealthLevel)\n  }");
        Object m33094as3 = flatMapSingle.m33094as(AutoDispose.m45239a(this.f27911c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6263p c6263p = new C6263p();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: x72
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                P72.m90780Q(Function1.this, obj);
            }
        });
        Observable<WireInventoryPart> observeOn2 = this.f27913e.m85971am().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "categoryUi.searchResultC…dSchedulers.mainThread())");
        Object m33094as4 = observeOn2.m33094as(AutoDispose.m45239a(this.f27911c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6264q c6264q = new C6264q();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: y72
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                P72.m90779R(Function1.this, obj);
            }
        });
        Observable<String> m85970bm = this.f27913e.m85970bm();
        final C6265r c6265r = C6265r.f27934g;
        Observable<R> map = m85970bm.map(new InterfaceC23492o() { // from class: z72
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m90778S;
                m90778S = P72.m90778S(Function1.this, obj);
                return m90778S;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "categoryUi.searchTextCha…\n      .map { it.trim() }");
        Object m33094as5 = map.m33094as(AutoDispose.m45239a(this.f27911c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as5).subscribe(this.f27917i);
        Observable<String> distinctUntilChanged = this.f27917i.distinctUntilChanged();
        final C6266s c6266s = new C6266s();
        Observable retry = distinctUntilChanged.switchMapSingle(new InterfaceC23492o() { // from class: A72
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m90794C;
                m90794C = P72.m90794C(Function1.this, obj);
                return m90794C;
            }
        }).retry(3L);
        Intrinsics.checkNotNullExpressionValue(retry, "fun onResume() {\n    cat…InventoryHealthLevel)\n  }");
        Object m33094as6 = retry.m33094as(AutoDispose.m45239a(this.f27911c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6267t c6267t = new C6267t(this.f27916h);
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: B72
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                P72.m90793D(Function1.this, obj);
            }
        };
        final C6249d c6249d = new C6249d(this);
        ((ObservableSubscribeProxy) m33094as6).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: C72
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                P72.m90792E(Function1.this, obj);
            }
        });
        Observable m31956a = C24523e.f91168a.m31956a(this.f27917i, this.f27916h);
        final C6250e c6250e = new C6250e();
        Observable observeOn3 = m31956a.switchMapSingle(new InterfaceC23492o() { // from class: G72
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m90791F;
                m90791F = P72.m90791F(Function1.this, obj);
                return m90791F;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "fun onResume() {\n    cat…InventoryHealthLevel)\n  }");
        Object m33094as7 = observeOn3.m33094as(AutoDispose.m45239a(this.f27911c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6252f c6252f = new C6252f();
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: H72
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                P72.m90790G(Function1.this, obj);
            }
        });
        Object m33041n = this.f27909a.mo40846e().m33041n(AutoDispose.m45239a(this.f27911c));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable<InventoryStatusResponse> observeOn4 = this.f27909a.mo40844g().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "inventoryManager.healthS…dSchedulers.mainThread())");
        Object m33094as8 = observeOn4.m33094as(AutoDispose.m45239a(this.f27911c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6253g c6253g = new C6253g(this);
        ((ObservableSubscribeProxy) m33094as8).subscribe(new InterfaceC23484g() { // from class: I72
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                P72.m90789H(Function1.this, obj);
            }
        });
        Observable<Unit> m85977Ul = this.f27913e.m85977Ul();
        final C6254h c6254h = C6254h.f27925g;
        InterfaceC23434B map2 = m85977Ul.map(new InterfaceC23492o() { // from class: J72
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                HealthStatus m90788I;
                m90788I = P72.m90788I(Function1.this, obj);
                return m90788I;
            }
        });
        Observable<Unit> m85972Zl = this.f27913e.m85972Zl();
        final C6255i c6255i = C6255i.f27926g;
        InterfaceC23434B map3 = m85972Zl.map(new InterfaceC23492o() { // from class: K72
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                HealthStatus m90787J;
                m90787J = P72.m90787J(Function1.this, obj);
                return m90787J;
            }
        });
        Observable<Unit> m85976Vl = this.f27913e.m85976Vl();
        final C6256j c6256j = C6256j.f27927g;
        Observable merge = Observable.merge(map2, map3, m85976Vl.map(new InterfaceC23492o() { // from class: L72
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                HealthStatus m90786K;
                m90786K = P72.m90786K(Function1.this, obj);
                return m90786K;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      categoryUi.…atus.OUT_OF_STOCK }\n    )");
        Object m33094as9 = merge.m33094as(AutoDispose.m45239a(this.f27911c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as9, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6257k c6257k = new C6257k(this.f27912d);
        ((ObservableSubscribeProxy) m33094as9).subscribe(new InterfaceC23484g() { // from class: M72
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                P72.m90785L(Function1.this, obj);
            }
        });
    }

    /* renamed from: T */
    public final void m90777T(String str, List<WireInventoryPart> list, List<C3023H6> list2) {
        boolean z;
        boolean z2;
        S72 s72 = this.f27913e;
        boolean z3 = false;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        s72.m85969cm(z);
        this.f27913e.m85974Xl(list2);
        this.f27913e.m85963im(!list.isEmpty());
        S72 s722 = this.f27913e;
        if (str.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && list.isEmpty()) {
            z3 = true;
        }
        s722.m85966fm(z3, str);
    }

    /* renamed from: u */
    public final void m90756u(InventoryStatusResponse inventoryStatusResponse) {
        List<WireInventory> incompleteInventory = inventoryStatusResponse.getIncompleteInventory();
        List<WireInventory> runningLow = inventoryStatusResponse.getRunningLow();
        List<WireInventory> outOfStock = inventoryStatusResponse.getOutOfStock();
        boolean z = true;
        this.f27913e.m85967em(!incompleteInventory.isEmpty(), incompleteInventory.size());
        this.f27913e.m85962jm(!runningLow.isEmpty(), runningLow.size());
        this.f27913e.m85965gm(!outOfStock.isEmpty(), outOfStock.size());
        if (incompleteInventory.size() + outOfStock.size() + runningLow.size() <= 0) {
            z = false;
        }
        this.f27913e.m85968dm(z);
    }

    /* renamed from: v */
    public final void m90755v(int i, int i2, Intent intent) {
        if (i == 10039 && intent != null) {
            this.f27913e.m85964hm(intent.getIntExtra("part_count", 0));
        }
    }

    /* renamed from: w */
    public final void m90754w() {
        AbstractC23442F<List<WirePartCategory>> mo40849b = this.f27909a.mo40849b();
        final C6246a c6246a = new C6246a();
        AbstractC23442F m33152N = mo40849b.m33165A(new InterfaceC23492o() { // from class: D72
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m90753x;
                m90753x = P72.m90753x(Function1.this, obj);
                return m90753x;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "fun onCreate() {\n    inv…Timber.e(it)\n      })\n  }");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f27911c));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6247b c6247b = new C6247b();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: E72
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                P72.m90752y(Function1.this, obj);
            }
        };
        final C6248c c6248c = C6248c.f27920g;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: F72
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                P72.m90751z(Function1.this, obj);
            }
        });
    }
}
