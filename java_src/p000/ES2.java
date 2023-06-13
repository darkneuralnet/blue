package p000;

import android.view.MenuItem;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.UserRoleItemKt;
import co.bird.android.model.constant.UserRole;
import co.bird.android.model.wire.WireMerchantDescription;
import co.bird.android.model.wire.WireMerchantSite;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B_\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u00020/0.\u0012\u0006\u00106\u001a\u000203¢\u0006\u0004\b>\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R.\u0010=\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000209 :*\n\u0012\u0004\u0012\u000209\u0018\u00010808078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006@"}, m28432d2 = {"LES2;", "LOB;", "", C17296a.f69688o, "Landroid/view/MenuItem;", "item", "", "b", "", "itemId", "c", "checked", DateTokenConverter.CONVERTER_KEY, Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lgl;", "n", "Lgl;", "preference", "LTq4;", "o", "LTq4;", "reactiveConfig", "LEa;", "p", "LEa;", "analyticsManager", "LOh;", "q", "LOh;", "appBuildConfig", "LZ85;", "r", "LZ85;", "demandManager", "LaS2;", "s", "LaS2;", "merchantManager", "LGS2;", "t", "LGS2;", "navigationDrawerUi", "Le13;", "u", "Le13;", "navigator", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "v", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "lifecycleScopeProvider", "LRh6;", "w", "LRh6;", "userStream", "LAG;", "", "", "kotlin.jvm.PlatformType", "x", "LAG;", "supportTagsRelay", "<init>", "(Lgl;LTq4;LEa;LOh;LZ85;LaS2;LGS2;Le13;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LRh6;)V", "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMerchantNavigationDrawerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantNavigationDrawerPresenter.kt\nco/bird/android/feature/merchant/presenter/MerchantNavigationDrawerPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,147:1\n180#2:148\n180#2:149\n180#2:150\n180#2:151\n180#2:154\n180#2:155\n180#2:156\n52#3,2:152\n*S KotlinDebug\n*F\n+ 1 MerchantNavigationDrawerPresenter.kt\nco/bird/android/feature/merchant/presenter/MerchantNavigationDrawerPresenter\n*L\n58#1:148\n63#1:149\n72#1:150\n84#1:151\n99#1:154\n112#1:155\n117#1:156\n90#1:152,2\n*E\n"})
/* renamed from: ES2 */
/* loaded from: classes3.dex */
public final class ES2 extends AbstractC5914OB {

    /* renamed from: n */
    public final C22454gl f7477n;

    /* renamed from: o */
    public final C36207Tq4 f7478o;

    /* renamed from: p */
    public final InterfaceC1880Ea f7479p;

    /* renamed from: q */
    public final InterfaceC6097Oh f7480q;

    /* renamed from: r */
    public final Z85 f7481r;

    /* renamed from: s */
    public final InterfaceC37961aS2 f7482s;

    /* renamed from: t */
    public final GS2 f7483t;

    /* renamed from: u */
    public final InterfaceC40099e13 f7484u;

    /* renamed from: v */
    public final LifecycleScopeProvider<EnumC7097RE> f7485v;

    /* renamed from: w */
    public final InterfaceC35660Rh6 f7486w;

    /* renamed from: x */
    public final C0058AG<List<String>> f7487x;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: ES2$a */
    /* loaded from: classes3.dex */
    public static final class C1827a<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C1827a<T1, T2, R> f7488a = new C1827a<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ES2$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1828b extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1828b(Object obj) {
            super(1, obj, ES2.class, "onSwitchCheckedChange", "onSwitchCheckedChange(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((ES2) this.receiver).mo71217d(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Landroid/view/MenuItem;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ES2$c */
    /* loaded from: classes3.dex */
    public static final class C1829c extends Lambda implements Function1<MenuItem, Unit> {
        public C1829c() {
            super(1);
        }

        /* renamed from: a */
        public final void m108980a(MenuItem it) {
            ES2 es2 = ES2.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            es2.mo71219b(it);
            ES2.this.f7483t.mo73881Kh();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MenuItem menuItem) {
            m108980a(menuItem);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantDescription;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ES2$d */
    /* loaded from: classes3.dex */
    public static final class C1830d extends Lambda implements Function1<Optional<WireMerchantDescription>, Boolean> {

        /* renamed from: g */
        public static final C1830d f7490g = new C1830d();

        public C1830d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<WireMerchantDescription> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantDescription;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ES2$e */
    /* loaded from: classes3.dex */
    public static final class C1831e extends Lambda implements Function1<Optional<WireMerchantDescription>, Unit> {
        public C1831e() {
            super(1);
        }

        /* renamed from: a */
        public final void m108978a(Optional<WireMerchantDescription> optional) {
            String replace$default;
            List listOf;
            WireMerchantDescription m59038b = optional.m59038b();
            replace$default = StringsKt__StringsJVMKt.replace$default(m59038b.getName(), " ", "_", false, 4, (Object) null);
            String id = m59038b.getId();
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"merchant_name:" + replace$default, "merchant_id:" + id, "source:side-menu"});
            ES2.this.f7487x.accept(listOf);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireMerchantDescription> optional) {
            m108978a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "storeOptional", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ES2$f */
    /* loaded from: classes3.dex */
    public static final class C1832f extends Lambda implements Function1<Optional<WireMerchantSite>, Unit> {
        public C1832f() {
            super(1);
        }

        /* renamed from: a */
        public final void m108977a(Optional<WireMerchantSite> optional) {
            ES2.this.f7483t.mo100433el(optional.m59037c() && optional.m59038b().getMobile());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireMerchantSite> optional) {
            m108977a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0004 \u0005*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0004\u0018\u00010\u00010\u00012\u001e\u0010\u0006\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u0001H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireMerchantSite;", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nMerchantNavigationDrawerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantNavigationDrawerPresenter.kt\nco/bird/android/feature/merchant/presenter/MerchantNavigationDrawerPresenter$onCreate$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n766#2:148\n857#2,2:149\n*S KotlinDebug\n*F\n+ 1 MerchantNavigationDrawerPresenter.kt\nco/bird/android/feature/merchant/presenter/MerchantNavigationDrawerPresenter$onCreate$6\n*L\n96#1:148\n96#1:149,2\n*E\n"})
    /* renamed from: ES2$g */
    /* loaded from: classes3.dex */
    public static final class C1833g extends Lambda implements Function1<Pair<? extends List<? extends WireMerchantSite>, ? extends Optional<WireMerchantSite>>, Pair<? extends List<? extends WireMerchantSite>, ? extends Optional<WireMerchantSite>>> {

        /* renamed from: g */
        public static final C1833g f7493g = new C1833g();

        public C1833g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends List<? extends WireMerchantSite>, ? extends Optional<WireMerchantSite>> invoke(Pair<? extends List<? extends WireMerchantSite>, ? extends Optional<WireMerchantSite>> pair) {
            return invoke2((Pair<? extends List<WireMerchantSite>, Optional<WireMerchantSite>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Pair<List<WireMerchantSite>, Optional<WireMerchantSite>> invoke2(Pair<? extends List<WireMerchantSite>, Optional<WireMerchantSite>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Optional<WireMerchantSite> component2 = pair.component2();
            ArrayList arrayList = new ArrayList();
            for (Object obj : pair.component1()) {
                String id = ((WireMerchantSite) obj).getId();
                WireMerchantSite m59035e = component2.m59035e();
                if (!Intrinsics.areEqual(id, m59035e != null ? m59035e.getId() : null)) {
                    arrayList.add(obj);
                }
            }
            return TuplesKt.m28425to(arrayList, component2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012>\u0010\u0002\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006 \u0007*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireMerchantSite;", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nMerchantNavigationDrawerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantNavigationDrawerPresenter.kt\nco/bird/android/feature/merchant/presenter/MerchantNavigationDrawerPresenter$onCreate$7\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
    /* renamed from: ES2$h */
    /* loaded from: classes3.dex */
    public static final class C1834h extends Lambda implements Function1<Pair<? extends List<? extends WireMerchantSite>, ? extends Optional<WireMerchantSite>>, Unit> {
        public C1834h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends WireMerchantSite>, ? extends Optional<WireMerchantSite>> pair) {
            invoke2((Pair<? extends List<WireMerchantSite>, Optional<WireMerchantSite>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<WireMerchantSite>, Optional<WireMerchantSite>> pair) {
            WireMerchantSite m59035e;
            List<WireMerchantSite> component1 = pair.component1();
            Optional<WireMerchantSite> component2 = pair.component2();
            ES2.this.f7483t.mo100432n8(component1);
            GS2 gs2 = ES2.this.f7483t;
            String str = null;
            if ((!component1.isEmpty()) && (m59035e = component2.m59035e()) != null) {
                String name = m59035e.getName();
                str = name == null ? m59035e.getMerchant().getName() : name;
            }
            gs2.mo100431t(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "store", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ES2$i */
    /* loaded from: classes3.dex */
    public static final class C1835i extends Lambda implements Function1<WireMerchantSite, Unit> {
        public C1835i() {
            super(1);
        }

        /* renamed from: a */
        public final void m108976a(WireMerchantSite store) {
            InterfaceC37961aS2 interfaceC37961aS2 = ES2.this.f7482s;
            Intrinsics.checkNotNullExpressionValue(store, "store");
            interfaceC37961aS2.mo12341f(store);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireMerchantSite wireMerchantSite) {
            m108976a(wireMerchantSite);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "reportsUrl", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ES2$j */
    /* loaded from: classes3.dex */
    public static final class C1836j extends Lambda implements Function1<String, Unit> {
        public C1836j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String reportsUrl) {
            GS2 gs2 = ES2.this.f7483t;
            Intrinsics.checkNotNullExpressionValue(reportsUrl, "reportsUrl");
            gs2.mo100439Ua(reportsUrl.length() > 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ES2(C22454gl preference, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, InterfaceC6097Oh appBuildConfig, Z85 demandManager, InterfaceC37961aS2 merchantManager, GS2 navigationDrawerUi, InterfaceC40099e13 navigator, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC35660Rh6 userStream) {
        super(appBuildConfig, lifecycleScopeProvider, preference, reactiveConfig, navigationDrawerUi, navigator, analyticsManager, demandManager, merchantManager, userStream, null, null, 3072, null);
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        Intrinsics.checkNotNullParameter(demandManager, "demandManager");
        Intrinsics.checkNotNullParameter(merchantManager, "merchantManager");
        Intrinsics.checkNotNullParameter(navigationDrawerUi, "navigationDrawerUi");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(lifecycleScopeProvider, "lifecycleScopeProvider");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        this.f7477n = preference;
        this.f7478o = reactiveConfig;
        this.f7479p = analyticsManager;
        this.f7480q = appBuildConfig;
        this.f7481r = demandManager;
        this.f7482s = merchantManager;
        this.f7483t = navigationDrawerUi;
        this.f7484u = navigator;
        this.f7485v = lifecycleScopeProvider;
        this.f7486w = userStream;
        C0058AG<List<String>> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<List<String>>()");
        this.f7487x = m115951g;
    }

    /* renamed from: B */
    public static final void m108999B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m108989M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final boolean m108988N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: O */
    public static final Pair m108987O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m108986P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m108985Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m108984v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m108983y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m108982z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC5914OB
    /* renamed from: C */
    public void mo92668C() {
        this.f7477n.m37732F2(UserRoleItemKt.toUserRoleItem(UserRole.MERCHANT));
    }

    @Override // p000.AbstractC5914OB, p000.InterfaceC38024aZ2
    /* renamed from: a */
    public void mo71220a() {
        super.mo71220a();
        Observable<Boolean> observeOn = this.f7483t.mo100440U6().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "navigationDrawerUi.roleS…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f7485v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1828b c1828b = new C1828b(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: vS2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ES2.m108984v(Function1.this, obj);
            }
        });
        Observable<MenuItem> observeOn2 = this.f7483t.mo100436ag().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "navigationDrawerUi.navig…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f7485v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1829c c1829c = new C1829c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: wS2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ES2.m108989M(Function1.this, obj);
            }
        });
        Observable<Optional<WireMerchantDescription>> distinctUntilChanged = this.f7482s.mo12339h().distinctUntilChanged();
        final C1830d c1830d = C1830d.f7490g;
        Observable<Optional<WireMerchantDescription>> filter = distinctUntilChanged.filter(new InterfaceC23494q() { // from class: xS2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m108988N;
                m108988N = ES2.m108988N(Function1.this, obj);
                return m108988N;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "merchantManager.merchant… .filter { it.isPresent }");
        Object m33094as3 = filter.m33094as(AutoDispose.m45239a(this.f7485v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1831e c1831e = new C1831e();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: yS2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ES2.m108983y(Function1.this, obj);
            }
        });
        Observable<Optional<WireMerchantSite>> observeOn3 = this.f7482s.mo12344c().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "merchantManager.currentS…dSchedulers.mainThread())");
        Object m33094as4 = observeOn3.m33094as(AutoDispose.m45239a(this.f7485v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1832f c1832f = new C1832f();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: zS2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ES2.m108982z(Function1.this, obj);
            }
        });
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(this.f7482s.mo12336k(), this.f7482s.mo12344c(), C1827a.f7488a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final C1833g c1833g = C1833g.f7493g;
        Observable observeOn4 = combineLatest.map(new InterfaceC23492o() { // from class: AS2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m108987O;
                m108987O = ES2.m108987O(Function1.this, obj);
                return m108987O;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as5 = observeOn4.m33094as(AutoDispose.m45239a(this.f7485v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1834h c1834h = new C1834h();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: BS2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ES2.m108999B(Function1.this, obj);
            }
        });
        Observable<WireMerchantSite> observeOn5 = this.f7483t.mo100430y6().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "navigationDrawerUi.store…dSchedulers.mainThread())");
        Object m33094as6 = observeOn5.m33094as(AutoDispose.m45239a(this.f7485v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1835i c1835i = new C1835i();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: CS2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ES2.m108986P(Function1.this, obj);
            }
        });
        Observable<String> observeOn6 = this.f7478o.m82918C8().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn6, "reactiveConfig.merchantR…dSchedulers.mainThread())");
        Object m33094as7 = observeOn6.m33094as(AutoDispose.m45239a(this.f7485v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1836j c1836j = new C1836j();
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: DS2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ES2.m108985Q(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC38024aZ2
    /* renamed from: b */
    public boolean mo71219b(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return mo71218c(item.getItemId());
    }

    @Override // p000.InterfaceC38024aZ2
    /* renamed from: c */
    public boolean mo71218c(int i) {
        if (i == C31914Bh4.nav_help) {
            InterfaceC40099e13 interfaceC40099e13 = this.f7484u;
            List<String> value = this.f7487x.getValue();
            if (value == null) {
                value = CollectionsKt__CollectionsKt.emptyList();
            }
            interfaceC40099e13.mo37074W3(value);
            return true;
        } else if (i == C31914Bh4.nav_history) {
            this.f7484u.mo37072X0(false);
            return true;
        } else if (i == C31914Bh4.nav_location) {
            this.f7484u.mo37105Q2();
            return true;
        } else if (i == C31914Bh4.nav_reports) {
            InterfaceC40099e13 interfaceC40099e132 = this.f7484u;
            String reportsUrl = this.f7478o.m82623f8().m73665a().getMerchantConfig().getReportsUrl();
            if (reportsUrl == null) {
                reportsUrl = "";
            }
            interfaceC40099e132.mo37035d4(reportsUrl);
            return true;
        } else {
            return true;
        }
    }

    @Override // p000.InterfaceC38024aZ2
    /* renamed from: d */
    public void mo71217d(boolean z) {
        if (z) {
            return;
        }
        InterfaceC40099e13.C19924a.goToRider$default(this.f7484u, true, false, null, 6, null);
    }
}
