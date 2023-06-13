package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0005B'\b\u0007\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0012"}, m28432d2 = {"LyH3;", "LvH3;", "", "c", "Lcom/uber/autodispose/ScopeProvider;", C17296a.f69688o, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LCH3;", "b", "LCH3;", "ui", "Le13;", "Le13;", "navigator", "<init>", "(Lcom/uber/autodispose/ScopeProvider;LCH3;Le13;)V", DateTokenConverter.CONVERTER_KEY, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nParkingRulesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingRulesPresenter.kt\nco/bird/android/app/feature/ride/parking/ParkingRulesPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,48:1\n180#2:49\n180#2:50\n*S KotlinDebug\n*F\n+ 1 ParkingRulesPresenter.kt\nco/bird/android/app/feature/ride/parking/ParkingRulesPresenterImpl\n*L\n37#1:49\n42#1:50\n*E\n"})
/* renamed from: yH3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52110yH3 implements InterfaceC50331vH3 {

    /* renamed from: d */
    public static final C30541a f119292d = new C30541a(null);

    /* renamed from: e */
    public static final int f119293e = 8;

    /* renamed from: a */
    public final ScopeProvider f119294a;

    /* renamed from: b */
    public final CH3 f119295b;

    /* renamed from: c */
    public final InterfaceC40099e13 f119296c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LyH3$a;", "", "", "PARKING_RULES_ZENDESK_ARTICLE_ID", "J", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yH3$a */
    /* loaded from: classes2.dex */
    public static final class C30541a {
        public /* synthetic */ C30541a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C30541a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yH3$b */
    /* loaded from: classes2.dex */
    public static final class C30542b extends Lambda implements Function1<Unit, Unit> {
        public C30542b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C52110yH3.this.f119296c.close();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yH3$c */
    /* loaded from: classes2.dex */
    public static final class C30543c extends Lambda implements Function1<Unit, Unit> {
        public C30543c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C52110yH3.this.f119296c.mo36922w3(360035015992L);
        }
    }

    public C52110yH3(ScopeProvider scopeProvider, CH3 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f119294a = scopeProvider;
        this.f119295b = ui;
        this.f119296c = navigator;
    }

    /* renamed from: d */
    public static final void m3718d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public static final void m3717e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c */
    public void m3719c() {
        this.f119295b.mo110614Rj();
        this.f119295b.mo110611z6();
        Object m33094as = this.f119295b.mo110612u().m33094as(AutoDispose.m45239a(this.f119294a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30542b c30542b = new C30542b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: wH3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52110yH3.m3718d(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f119295b.mo110613ma().m33094as(AutoDispose.m45239a(this.f119294a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30543c c30543c = new C30543c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: xH3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52110yH3.m3717e(Function1.this, obj);
            }
        });
    }
}
