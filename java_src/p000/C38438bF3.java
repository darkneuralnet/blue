package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BE\b\u0007\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010#\u001a\u00020\"\u0012\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006&"}, m28432d2 = {"LbF3;", "LYE3;", "Landroid/content/Intent;", "intent", "", "b", "", C17296a.f69688o, "LEa;", "LEa;", "analyticsManager", "Lgl;", "Lgl;", "preference", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "c", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LfF3;", DateTokenConverter.CONVERTER_KEY, "LfF3;", "ui", "Le13;", "e", "Le13;", "navigator", "", "f", "Ljava/lang/String;", "cityName", "g", "Z", "hasSeenBefore", "LTq4;", "reactiveConfig", "<init>", "(LEa;Lgl;LTq4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LfF3;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nParkingAnnouncementPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingAnnouncementPresenter.kt\nco/bird/android/app/feature/parking/presenter/ParkingAnnouncementPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,70:1\n180#2:71\n*S KotlinDebug\n*F\n+ 1 ParkingAnnouncementPresenter.kt\nco/bird/android/app/feature/parking/presenter/ParkingAnnouncementPresenterImpl\n*L\n57#1:71\n*E\n"})
/* renamed from: bF3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38438bF3 implements YE3 {

    /* renamed from: a */
    public final InterfaceC1880Ea f57186a;

    /* renamed from: b */
    public final C22454gl f57187b;

    /* renamed from: c */
    public final LifecycleScopeProvider<EnumC7097RE> f57188c;

    /* renamed from: d */
    public final InterfaceC40827fF3 f57189d;

    /* renamed from: e */
    public final InterfaceC40099e13 f57190e;

    /* renamed from: f */
    public final String f57191f;

    /* renamed from: g */
    public final boolean f57192g;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bF3$a */
    /* loaded from: classes2.dex */
    public static final class C12341a extends Lambda implements Function1<Unit, Unit> {
        public C12341a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C22454gl c22454gl = C38438bF3.this.f57187b;
            String str = C38438bF3.this.f57191f;
            c22454gl.m37565u2("parking_announcement_" + str);
            C38438bF3.this.f57190e.mo37030e3();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bF3$b */
    /* loaded from: classes2.dex */
    public static final class C12342b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C12342b f57194g = new C12342b();

        public C12342b() {
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

    public C38438bF3(InterfaceC1880Ea analyticsManager, C22454gl preference, C36207Tq4 reactiveConfig, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC40827fF3 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f57186a = analyticsManager;
        this.f57187b = preference;
        this.f57188c = scopeProvider;
        this.f57189d = ui;
        this.f57190e = navigator;
        String parkingAnnouncementCityName = reactiveConfig.m82623f8().m73665a().getParkingConfig().getParkingAnnouncementCityName();
        this.f57191f = parkingAnnouncementCityName;
        this.f57192g = preference.m37578r1("parking_announcement_" + parkingAnnouncementCityName);
    }

    /* renamed from: e */
    public static final void m64752e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m64751f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.YE3
    /* renamed from: a */
    public boolean mo64756a() {
        return this.f57192g;
    }

    @Override // p000.YE3
    /* renamed from: b */
    public void mo64755b(Intent intent) {
        String str;
        int i;
        Intrinsics.checkNotNullParameter(intent, "intent");
        InterfaceC1880Ea interfaceC1880Ea = this.f57186a;
        String str2 = this.f57191f;
        if (this.f57192g) {
            str = "parking_tips_button";
        } else {
            str = "forced_display";
        }
        interfaceC1880Ea.mo55905y(new XE3(null, null, null, str2, str, 7, null));
        this.f57189d.mo39785hh(C45871nl4.parking_announcement_message_title, this.f57191f);
        this.f57189d.mo39784ji(C45871nl4.parking_announcement_message_body, this.f57191f);
        InterfaceC40827fF3 interfaceC40827fF3 = this.f57189d;
        if (this.f57192g) {
            i = C45871nl4.parking_announcement_seen_confirm_button;
        } else {
            i = C45871nl4.parking_announcement_confirm_button;
        }
        interfaceC40827fF3.mo39787U3(i);
        this.f57189d.mo39788Ah(this.f57192g);
        Object m33094as = this.f57189d.mo39786e().m33094as(AutoDispose.m45239a(this.f57188c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C12341a c12341a = new C12341a();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: ZE3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38438bF3.m64752e(Function1.this, obj);
            }
        };
        final C12342b c12342b = C12342b.f57194g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: aF3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38438bF3.m64751f(Function1.this, obj);
            }
        });
    }
}
