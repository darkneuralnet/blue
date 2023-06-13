package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Countries;
import co.bird.android.model.Country;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.schedulers.C24542a;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.S74;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\"\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, m28432d2 = {"Lor5;", "LxC;", "Ljr5;", "Landroid/content/Intent;", "intent", "", "b", "", "", "countries", "Lio/reactivex/Observable;", "Lco/bird/android/model/Country;", "B", "Lpr5;", "c", "Lpr5;", "ui", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "LEg1;", "e", "LEg1;", "eventBus", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "scopeProvider", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lpr5;Le13;LEg1;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSelectCountryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectCountryPresenter.kt\nco/bird/android/app/feature/i18n/SelectCountryPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n180#2:74\n180#2:75\n766#3:76\n857#3,2:77\n1549#3:79\n1620#3,3:80\n*S KotlinDebug\n*F\n+ 1 SelectCountryPresenter.kt\nco/bird/android/app/feature/i18n/SelectCountryPresenterImpl\n*L\n38#1:74\n45#1:75\n58#1:76\n58#1:77,2\n66#1:79\n66#1:80,3\n*E\n"})
/* renamed from: or5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46525or5 extends C30060xC implements InterfaceC43560jr5 {

    /* renamed from: c */
    public final InterfaceC47118pr5 f102580c;

    /* renamed from: d */
    public final InterfaceC40099e13 f102581d;

    /* renamed from: e */
    public final InterfaceC32604Eg1 f102582e;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/Country;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: or5$a */
    /* loaded from: classes2.dex */
    public static final class C27075a extends Lambda implements Function1<List<? extends Country>, Unit> {
        public C27075a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Country> list) {
            invoke2((List<Country>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<Country> it) {
            S74.C7343a.showProgress$default(C46525or5.this.f102580c, false, 0, 2, null);
            InterfaceC47118pr5 interfaceC47118pr5 = C46525or5.this.f102580c;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC47118pr5.mo16907md(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Country;", "kotlin.jvm.PlatformType", "country", "", C17296a.f69688o, "(Lco/bird/android/model/Country;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: or5$b */
    /* loaded from: classes2.dex */
    public static final class C27076b extends Lambda implements Function1<Country, Unit> {
        public C27076b() {
            super(1);
        }

        /* renamed from: a */
        public final void m20428a(Country country) {
            InterfaceC32604Eg1 interfaceC32604Eg1 = C46525or5.this.f102582e;
            Intrinsics.checkNotNullExpressionValue(country, "country");
            interfaceC32604Eg1.mo104915c(new C42967ir5(country));
            Intent intent = new Intent();
            intent.putExtra("country", country);
            C46525or5.this.f102581d.mo37029e4(-1, intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Country country) {
            m20428a(country);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46525or5(LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC47118pr5 ui, InterfaceC40099e13 navigator, InterfaceC32604Eg1 eventBus) {
        super(scopeProvider);
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        this.f102580c = ui;
        this.f102581d = navigator;
        this.f102582e = eventBus;
    }

    /* renamed from: C */
    public static final List m20436C(List countryCodes) {
        int collectionSizeOrDefault;
        List sortedWith;
        Intrinsics.checkNotNullParameter(countryCodes, "$countryCodes");
        final Collator collator = Collator.getInstance();
        Comparator comparator = new Comparator() { // from class: nr5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m20435D;
                m20435D = C46525or5.m20435D(collator, (Country) obj, (Country) obj2);
                return m20435D;
            }
        };
        List<String> list = countryCodes;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (String str : list) {
            arrayList.add(Country.Factory.create(str));
        }
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, comparator);
        return sortedWith;
    }

    /* renamed from: D */
    public static final int m20435D(Collator collator, Country country, Country country2) {
        return collator.compare(country.getName(), country2.getName());
    }

    /* renamed from: E */
    public static final void m20434E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m20433F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public final Observable<List<Country>> m20437B(List<String> list) {
        final ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Countries.ALL.getCountries().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        Observable<List<Country>> observeOn = Observable.fromCallable(new Callable() { // from class: mr5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m20436C;
                m20436C = C46525or5.m20436C(arrayList);
                return m20436C;
            }
        }).subscribeOn(C24542a.m31932c()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "fromCallable {\n      val…dSchedulers.mainThread())");
        return observeOn;
    }

    @Override // p000.InterfaceC43560jr5
    /* renamed from: b */
    public void mo20432b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("countries");
        Intrinsics.checkNotNull(stringArrayListExtra);
        this.f102580c.init();
        S74.C7343a.showProgress$default(this.f102580c, true, 0, 2, null);
        Object m33094as = m20437B(stringArrayListExtra).m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27075a c27075a = new C27075a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: kr5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46525or5.m20434E(Function1.this, obj);
            }
        });
        Observable<Country> observeOn = this.f102580c.mo16906r6().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.getCountryClicks()\n  …dSchedulers.mainThread())");
        Object m33094as2 = observeOn.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27076b c27076b = new C27076b();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: lr5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46525or5.m20433F(Function1.this, obj);
            }
        });
    }
}
