package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.constant.PurchasePaymentReason;
import co.bird.android.model.constant.RidePassViewStatus;
import co.bird.android.model.persistence.RidePassView;
import co.bird.android.model.persistence.nestedstructures.RidePassUserSubscriptionView;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.C38601bX4;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B9\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, m28432d2 = {"LbX4;", "Lf1;", "LrX4;", "LsX4;", "renderer", "", "z", "LWU4;", "e", "LWU4;", "ridePassManager", "LAM3;", "f", "LAM3;", "paymentManager", "LiD1;", "g", "LiD1;", "googlePayManager", "LEa;", "h", "LEa;", "analyticsManager", "Le13;", "i", "Le13;", "navigator", "LTq4;", "j", "LTq4;", "reactiveConfig", "<init>", "(LWU4;LAM3;LiD1;LEa;Le13;LTq4;)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRidePassV4DetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV4DetailsPresenter.kt\nco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,208:1\n180#2:209\n237#2:210\n237#2:211\n237#2:212\n237#2:213\n180#2:214\n*S KotlinDebug\n*F\n+ 1 RidePassV4DetailsPresenter.kt\nco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsPresenter\n*L\n45#1:209\n70#1:210\n146#1:211\n169#1:212\n191#1:213\n202#1:214\n*E\n"})
/* renamed from: bX4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38601bX4 extends AbstractC20169f1<InterfaceC48106rX4, C48698sX4> {

    /* renamed from: e */
    public final WU4 f57628e;

    /* renamed from: f */
    public final AM3 f57629f;

    /* renamed from: g */
    public final InterfaceC42586iD1 f57630g;

    /* renamed from: h */
    public final InterfaceC1880Ea f57631h;

    /* renamed from: i */
    public final InterfaceC40099e13 f57632i;

    /* renamed from: j */
    public final C36207Tq4 f57633j;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001az\u00126\b\u0001\u00122\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003 \u0006*<\u00126\b\u0001\u00122\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "linkCode", "Lio/reactivex/B;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/RidePassView;", "", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bX4$a */
    /* loaded from: classes3.dex */
    public static final class C12405a extends Lambda implements Function1<String, InterfaceC23434B<? extends Pair<? extends RidePassView, ? extends Boolean>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "ridePasses", "", "Lco/bird/android/model/persistence/RidePassView;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nRidePassV4DetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV4DetailsPresenter.kt\nco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsPresenter$consume$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n1747#2,3:209\n*S KotlinDebug\n*F\n+ 1 RidePassV4DetailsPresenter.kt\nco/bird/android/feature/ridepass/v4/details/RidePassV4DetailsPresenter$consume$1$1\n*L\n41#1:209,3\n*E\n"})
        /* renamed from: bX4$a$a */
        /* loaded from: classes3.dex */
        public static final class C12406a extends Lambda implements Function1<List<? extends RidePassView>, Boolean> {

            /* renamed from: g */
            public static final C12406a f57635g = new C12406a();

            public C12406a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(List<? extends RidePassView> list) {
                return invoke2((List<RidePassView>) list);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Boolean invoke2(List<RidePassView> ridePasses) {
                Intrinsics.checkNotNullParameter(ridePasses, "ridePasses");
                List<RidePassView> list = ridePasses;
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((RidePassView) it.next()).isActive()) {
                            z = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }

        public C12405a() {
            super(1);
        }

        /* renamed from: c */
        public static final Boolean m64437c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Boolean) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends Pair<RidePassView, Boolean>> invoke(String linkCode) {
            Intrinsics.checkNotNullParameter(linkCode, "linkCode");
            C24523e c24523e = C24523e.f91168a;
            Observable<RidePassView> mo55500O = C38601bX4.this.f57628e.mo55500O(linkCode);
            Z84<List<RidePassView>> mo55503E0 = C38601bX4.this.f57628e.mo55503E0();
            final C12406a c12406a = C12406a.f57635g;
            Object map = mo55503E0.map(new InterfaceC23492o() { // from class: aX4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m64437c;
                    m64437c = C38601bX4.C12405a.m64437c(Function1.this, obj);
                    return m64437c;
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "ridePassManager.ridePass…ss.isActive }\n          }");
            return c24523e.m31956a(mo55500O, map);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/RidePassView;", "ridePass", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/persistence/RidePassView;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bX4$b */
    /* loaded from: classes3.dex */
    public static final class C12407b extends Lambda implements Function1<RidePassView, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC48106rX4 f57636g;

        /* renamed from: h */
        public final /* synthetic */ C38601bX4 f57637h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: bX4$b$a */
        /* loaded from: classes3.dex */
        public static final class C12408a extends Lambda implements Function1<Unit, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ C38601bX4 f57638g;

            /* renamed from: h */
            public final /* synthetic */ RidePassView f57639h;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: bX4$b$a$a */
            /* loaded from: classes3.dex */
            public static final class C12409a extends Lambda implements Function1<InterfaceC23465c, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C38601bX4 f57640g;

                @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LsX4;", "prev", C17296a.f69688o, "(LsX4;)LsX4;"}, m28431k = 3, m28430mv = {1, 8, 0})
                /* renamed from: bX4$b$a$a$a */
                /* loaded from: classes3.dex */
                public static final class C12410a extends Lambda implements Function1<C48698sX4, C48698sX4> {

                    /* renamed from: g */
                    public static final C12410a f57641g = new C12410a();

                    public C12410a() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a */
                    public final C48698sX4 invoke(C48698sX4 prev) {
                        C48698sX4 m14084a;
                        Intrinsics.checkNotNullParameter(prev, "prev");
                        m14084a = prev.m14084a((r18 & 1) != 0 ? prev.f108926a : null, (r18 & 2) != 0 ? prev.f108927b : false, (r18 & 4) != 0 ? prev.f108928c : false, (r18 & 8) != 0 ? prev.f108929d : false, (r18 & 16) != 0 ? prev.f108930e : false, (r18 & 32) != 0 ? prev.f108931f : false, (r18 & 64) != 0 ? prev.f108932g : true, (r18 & 128) != 0 ? prev.f108933h : null);
                        return m14084a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C12409a(C38601bX4 c38601bX4) {
                    super(1);
                    this.f57640g = c38601bX4;
                }

                /* renamed from: a */
                public final void m64429a(InterfaceC23465c interfaceC23465c) {
                    this.f57640g.m42279i(C12410a.f57641g);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                    m64429a(interfaceC23465c);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12408a(C38601bX4 c38601bX4, RidePassView ridePassView) {
                super(1);
                this.f57638g = c38601bX4;
                this.f57639h = ridePassView;
            }

            public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC23496h invoke(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                WU4 wu4 = this.f57638g.f57628e;
                RidePassView ridePass = this.f57639h;
                Intrinsics.checkNotNullExpressionValue(ridePass, "ridePass");
                AbstractC23461c m33049i = wu4.mo55497d(ridePass).m33049i(this.f57638g.f57628e.refresh());
                final C12409a c12409a = new C12409a(this.f57638g);
                return m33049i.m33081E(new InterfaceC23484g() { // from class: eX4
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C38601bX4.C12407b.C12408a.invoke$lambda$0(Function1.this, obj);
                    }
                });
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: bX4$b$b */
        /* loaded from: classes3.dex */
        public static final class C12411b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C38601bX4 f57642g;

            @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LsX4;", "prev", C17296a.f69688o, "(LsX4;)LsX4;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: bX4$b$b$a */
            /* loaded from: classes3.dex */
            public static final class C12412a extends Lambda implements Function1<C48698sX4, C48698sX4> {

                /* renamed from: g */
                public final /* synthetic */ Throwable f57643g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C12412a(Throwable th) {
                    super(1);
                    this.f57643g = th;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final C48698sX4 invoke(C48698sX4 prev) {
                    C48698sX4 m14084a;
                    Intrinsics.checkNotNullParameter(prev, "prev");
                    m14084a = prev.m14084a((r18 & 1) != 0 ? prev.f108926a : null, (r18 & 2) != 0 ? prev.f108927b : false, (r18 & 4) != 0 ? prev.f108928c : false, (r18 & 8) != 0 ? prev.f108929d : false, (r18 & 16) != 0 ? prev.f108930e : false, (r18 & 32) != 0 ? prev.f108931f : false, (r18 & 64) != 0 ? prev.f108932g : false, (r18 & 128) != 0 ? prev.f108933h : this.f57643g);
                    return m14084a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12411b(C38601bX4 c38601bX4) {
                super(1);
                this.f57642g = c38601bX4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40159e(th);
                this.f57642g.m42279i(new C12412a(th));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12407b(InterfaceC48106rX4 interfaceC48106rX4, C38601bX4 c38601bX4) {
            super(1);
            this.f57636g = interfaceC48106rX4;
            this.f57637h = c38601bX4;
        }

        /* renamed from: d */
        public static final InterfaceC23496h m64433d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final void m64432e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(RidePassView ridePass) {
            Intrinsics.checkNotNullParameter(ridePass, "ridePass");
            Observable<Unit> subscribeOn = this.f57636g.mo15812c0().subscribeOn(C23454a.m33087a());
            final C12408a c12408a = new C12408a(this.f57637h, ridePass);
            AbstractC23461c flatMapCompletable = subscribeOn.flatMapCompletable(new InterfaceC23492o() { // from class: cX4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m64433d;
                    m64433d = C38601bX4.C12407b.m64433d(Function1.this, obj);
                    return m64433d;
                }
            });
            final C12411b c12411b = new C12411b(this.f57637h);
            return flatMapCompletable.m33084B(new InterfaceC23484g() { // from class: dX4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C38601bX4.C12407b.m64432e(Function1.this, obj);
                }
            }).m33066T();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bX4$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12413c extends FunctionReferenceImpl implements Function1<String, Observable<RidePassView>> {
        public C12413c(Object obj) {
            super(1, obj, WU4.class, "streamRidePassByLinkCode", "streamRidePassByLinkCode(Ljava/lang/String;)Lio/reactivex/Observable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Observable<RidePassView> invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((WU4) this.receiver).mo55500O(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/RidePassView;", "ridePass", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/persistence/RidePassView;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bX4$d */
    /* loaded from: classes3.dex */
    public static final class C12414d extends Lambda implements Function1<RidePassView, InterfaceC23434B<? extends String>> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC48106rX4 f57644g;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: bX4$d$a */
        /* loaded from: classes3.dex */
        public static final class C12415a extends Lambda implements Function1<Unit, String> {

            /* renamed from: g */
            public final /* synthetic */ RidePassView f57645g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12415a(RidePassView ridePassView) {
                super(1);
                this.f57645g = ridePassView;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final String invoke(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f57645g.getZendeskArticleId();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12414d(InterfaceC48106rX4 interfaceC48106rX4) {
            super(1);
            this.f57644g = interfaceC48106rX4;
        }

        /* renamed from: c */
        public static final String m64423c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (String) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends String> invoke(RidePassView ridePass) {
            Intrinsics.checkNotNullParameter(ridePass, "ridePass");
            Observable<Unit> subscribeOn = this.f57644g.mo15809g0().subscribeOn(C23454a.m33087a());
            final C12415a c12415a = new C12415a(ridePass);
            return subscribeOn.map(new InterfaceC23492o() { // from class: fX4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    String m64423c;
                    m64423c = C38601bX4.C12414d.m64423c(Function1.this, obj);
                    return m64423c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "zendeskArticleId", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bX4$e */
    /* loaded from: classes3.dex */
    public static final class C12416e extends Lambda implements Function1<String, Unit> {
        public C12416e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String zendeskArticleId) {
            InterfaceC40099e13 interfaceC40099e13 = C38601bX4.this.f57632i;
            Intrinsics.checkNotNullExpressionValue(zendeskArticleId, "zendeskArticleId");
            interfaceC40099e13.mo36922w3(Long.parseLong(zendeskArticleId));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/RidePassView;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bX4$f */
    /* loaded from: classes3.dex */
    public static final class C12417f extends Lambda implements Function1<Pair<? extends RidePassView, ? extends Boolean>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LsX4;", "prev", C17296a.f69688o, "(LsX4;)LsX4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: bX4$f$a */
        /* loaded from: classes3.dex */
        public static final class C12418a extends Lambda implements Function1<C48698sX4, C48698sX4> {

            /* renamed from: g */
            public final /* synthetic */ RidePassView f57648g;

            /* renamed from: h */
            public final /* synthetic */ Boolean f57649h;

            /* renamed from: i */
            public final /* synthetic */ C38601bX4 f57650i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12418a(RidePassView ridePassView, Boolean bool, C38601bX4 c38601bX4) {
                super(1);
                this.f57648g = ridePassView;
                this.f57649h = bool;
                this.f57650i = c38601bX4;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C48698sX4 invoke(C48698sX4 prev) {
                boolean z;
                DateTime dateTime;
                Intrinsics.checkNotNullParameter(prev, "prev");
                RidePassView ridePassView = this.f57648g;
                boolean z2 = !this.f57649h.booleanValue();
                boolean z3 = false;
                if (this.f57648g.getStatus() == RidePassViewStatus.AVAILABLE) {
                    z = true;
                } else {
                    z = false;
                }
                RidePassUserSubscriptionView userSubscription = this.f57648g.getUserSubscription();
                if (userSubscription != null) {
                    dateTime = userSubscription.getNextRenewalAt();
                } else {
                    dateTime = null;
                }
                if (dateTime != null) {
                    z3 = true;
                }
                return prev.m14084a(ridePassView, z2, z, z3, this.f57648g.getNeedsDeviceTransfer(), this.f57650i.f57633j.m82623f8().m73665a().getRidePass().getEnableTax(), false, null);
            }
        }

        public C12417f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends RidePassView, ? extends Boolean> pair) {
            invoke2((Pair<RidePassView, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<RidePassView, Boolean> pair) {
            C38601bX4 c38601bX4 = C38601bX4.this;
            c38601bX4.m42279i(new C12418a(pair.component1(), pair.component2(), c38601bX4));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bX4$g */
    /* loaded from: classes3.dex */
    public static final class C12419g extends Lambda implements Function1<InterfaceC23465c, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LsX4;", "prev", C17296a.f69688o, "(LsX4;)LsX4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: bX4$g$a */
        /* loaded from: classes3.dex */
        public static final class C12420a extends Lambda implements Function1<C48698sX4, C48698sX4> {

            /* renamed from: g */
            public static final C12420a f57652g = new C12420a();

            public C12420a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C48698sX4 invoke(C48698sX4 prev) {
                C48698sX4 m14084a;
                Intrinsics.checkNotNullParameter(prev, "prev");
                m14084a = prev.m14084a((r18 & 1) != 0 ? prev.f108926a : null, (r18 & 2) != 0 ? prev.f108927b : false, (r18 & 4) != 0 ? prev.f108928c : false, (r18 & 8) != 0 ? prev.f108929d : false, (r18 & 16) != 0 ? prev.f108930e : false, (r18 & 32) != 0 ? prev.f108931f : false, (r18 & 64) != 0 ? prev.f108932g : true, (r18 & 128) != 0 ? prev.f108933h : null);
                return m14084a;
            }
        }

        public C12419g() {
            super(1);
        }

        /* renamed from: a */
        public final void m64420a(InterfaceC23465c interfaceC23465c) {
            C38601bX4.this.m42279i(C12420a.f57652g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m64420a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bX4$h */
    /* loaded from: classes3.dex */
    public static final class C12421h extends Lambda implements Function1<Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LsX4;", "prev", C17296a.f69688o, "(LsX4;)LsX4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: bX4$h$a */
        /* loaded from: classes3.dex */
        public static final class C12422a extends Lambda implements Function1<C48698sX4, C48698sX4> {

            /* renamed from: g */
            public final /* synthetic */ Throwable f57654g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12422a(Throwable th) {
                super(1);
                this.f57654g = th;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C48698sX4 invoke(C48698sX4 prev) {
                C48698sX4 m14084a;
                Intrinsics.checkNotNullParameter(prev, "prev");
                m14084a = prev.m14084a((r18 & 1) != 0 ? prev.f108926a : null, (r18 & 2) != 0 ? prev.f108927b : false, (r18 & 4) != 0 ? prev.f108928c : false, (r18 & 8) != 0 ? prev.f108929d : false, (r18 & 16) != 0 ? prev.f108930e : false, (r18 & 32) != 0 ? prev.f108931f : false, (r18 & 64) != 0 ? prev.f108932g : false, (r18 & 128) != 0 ? prev.f108933h : this.f57654g);
                return m14084a;
            }
        }

        public C12421h() {
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
            C38601bX4.this.m42279i(new C12422a(th));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bX4$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12423i extends FunctionReferenceImpl implements Function1<String, Observable<RidePassView>> {
        public C12423i(Object obj) {
            super(1, obj, WU4.class, "streamRidePassByLinkCode", "streamRidePassByLinkCode(Ljava/lang/String;)Lio/reactivex/Observable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Observable<RidePassView> invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((WU4) this.receiver).mo55500O(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bX4$k */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12433k extends FunctionReferenceImpl implements Function1<String, Observable<RidePassView>> {
        public C12433k(Object obj) {
            super(1, obj, WU4.class, "streamRidePassByLinkCode", "streamRidePassByLinkCode(Ljava/lang/String;)Lio/reactivex/Observable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Observable<RidePassView> invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((WU4) this.receiver).mo55500O(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/RidePassView;", "ridePass", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/persistence/RidePassView;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bX4$l */
    /* loaded from: classes3.dex */
    public static final class C12434l extends Lambda implements Function1<RidePassView, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC48106rX4 f57670g;

        /* renamed from: h */
        public final /* synthetic */ C38601bX4 f57671h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: bX4$l$a */
        /* loaded from: classes3.dex */
        public static final class C12435a extends Lambda implements Function1<Unit, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ RidePassView f57672g;

            /* renamed from: h */
            public final /* synthetic */ C38601bX4 f57673h;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: bX4$l$a$a */
            /* loaded from: classes3.dex */
            public static final class C12436a extends Lambda implements Function1<InterfaceC23465c, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C38601bX4 f57674g;

                @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LsX4;", "prev", C17296a.f69688o, "(LsX4;)LsX4;"}, m28431k = 3, m28430mv = {1, 8, 0})
                /* renamed from: bX4$l$a$a$a */
                /* loaded from: classes3.dex */
                public static final class C12437a extends Lambda implements Function1<C48698sX4, C48698sX4> {

                    /* renamed from: g */
                    public static final C12437a f57675g = new C12437a();

                    public C12437a() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a */
                    public final C48698sX4 invoke(C48698sX4 prev) {
                        C48698sX4 m14084a;
                        Intrinsics.checkNotNullParameter(prev, "prev");
                        m14084a = prev.m14084a((r18 & 1) != 0 ? prev.f108926a : null, (r18 & 2) != 0 ? prev.f108927b : false, (r18 & 4) != 0 ? prev.f108928c : false, (r18 & 8) != 0 ? prev.f108929d : false, (r18 & 16) != 0 ? prev.f108930e : false, (r18 & 32) != 0 ? prev.f108931f : false, (r18 & 64) != 0 ? prev.f108932g : true, (r18 & 128) != 0 ? prev.f108933h : null);
                        return m14084a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C12436a(C38601bX4 c38601bX4) {
                    super(1);
                    this.f57674g = c38601bX4;
                }

                /* renamed from: a */
                public final void m64385a(InterfaceC23465c interfaceC23465c) {
                    this.f57674g.m42279i(C12437a.f57675g);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                    m64385a(interfaceC23465c);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12435a(RidePassView ridePassView, C38601bX4 c38601bX4) {
                super(1);
                this.f57672g = ridePassView;
                this.f57673h = c38601bX4;
            }

            /* renamed from: d */
            public static final InterfaceC23496h m64387d(C38601bX4 this$0) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return this$0.f57628e.refresh();
            }

            /* renamed from: e */
            public static final void m64386e(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: c */
            public final InterfaceC23496h invoke(Unit it) {
                String id;
                Intrinsics.checkNotNullParameter(it, "it");
                RidePassUserSubscriptionView userSubscription = this.f57672g.getUserSubscription();
                if (userSubscription != null && (id = userSubscription.getId()) != null) {
                    AbstractC23461c mo55505C0 = this.f57673h.f57628e.mo55505C0(id);
                    final C38601bX4 c38601bX4 = this.f57673h;
                    AbstractC23461c m33049i = mo55505C0.m33049i(AbstractC23461c.m33035t(new Callable() { // from class: pX4
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            InterfaceC23496h m64387d;
                            m64387d = C38601bX4.C12434l.C12435a.m64387d(C38601bX4.this);
                            return m64387d;
                        }
                    }));
                    final C12436a c12436a = new C12436a(this.f57673h);
                    return m33049i.m33081E(new InterfaceC23484g() { // from class: qX4
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            C38601bX4.C12434l.C12435a.m64386e(Function1.this, obj);
                        }
                    });
                }
                return AbstractC23461c.m33039p();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: bX4$l$b */
        /* loaded from: classes3.dex */
        public static final class C12438b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C38601bX4 f57676g;

            @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LsX4;", "prev", C17296a.f69688o, "(LsX4;)LsX4;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: bX4$l$b$a */
            /* loaded from: classes3.dex */
            public static final class C12439a extends Lambda implements Function1<C48698sX4, C48698sX4> {

                /* renamed from: g */
                public final /* synthetic */ Throwable f57677g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C12439a(Throwable th) {
                    super(1);
                    this.f57677g = th;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final C48698sX4 invoke(C48698sX4 prev) {
                    C48698sX4 m14084a;
                    Intrinsics.checkNotNullParameter(prev, "prev");
                    m14084a = prev.m14084a((r18 & 1) != 0 ? prev.f108926a : null, (r18 & 2) != 0 ? prev.f108927b : false, (r18 & 4) != 0 ? prev.f108928c : false, (r18 & 8) != 0 ? prev.f108929d : false, (r18 & 16) != 0 ? prev.f108930e : false, (r18 & 32) != 0 ? prev.f108931f : false, (r18 & 64) != 0 ? prev.f108932g : false, (r18 & 128) != 0 ? prev.f108933h : this.f57677g);
                    return m14084a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12438b(C38601bX4 c38601bX4) {
                super(1);
                this.f57676g = c38601bX4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40159e(th);
                this.f57676g.m42279i(new C12439a(th));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12434l(InterfaceC48106rX4 interfaceC48106rX4, C38601bX4 c38601bX4) {
            super(1);
            this.f57670g = interfaceC48106rX4;
            this.f57671h = c38601bX4;
        }

        /* renamed from: d */
        public static final InterfaceC23496h m64392d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final void m64391e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(RidePassView ridePass) {
            Intrinsics.checkNotNullParameter(ridePass, "ridePass");
            Observable<Unit> subscribeOn = this.f57670g.mo15811d().subscribeOn(C23454a.m33087a());
            final C12435a c12435a = new C12435a(ridePass, this.f57671h);
            AbstractC23461c flatMapCompletable = subscribeOn.flatMapCompletable(new InterfaceC23492o() { // from class: nX4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m64392d;
                    m64392d = C38601bX4.C12434l.m64392d(Function1.this, obj);
                    return m64392d;
                }
            });
            final C12438b c12438b = new C12438b(this.f57671h);
            return flatMapCompletable.m33084B(new InterfaceC23484g() { // from class: oX4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C38601bX4.C12434l.m64391e(Function1.this, obj);
                }
            }).m33066T();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bX4$m */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12440m extends FunctionReferenceImpl implements Function1<String, Observable<RidePassView>> {
        public C12440m(Object obj) {
            super(1, obj, WU4.class, "streamRidePassByLinkCode", "streamRidePassByLinkCode(Ljava/lang/String;)Lio/reactivex/Observable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Observable<RidePassView> invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((WU4) this.receiver).mo55500O(p0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38601bX4(WU4 ridePassManager, AM3 paymentManager, InterfaceC42586iD1 googlePayManager, InterfaceC1880Ea analyticsManager, InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig) {
        super(new C48698sX4(null, false, false, false, false, false, false, null, KotlinVersion.MAX_COMPONENT_VALUE, null));
        Intrinsics.checkNotNullParameter(ridePassManager, "ridePassManager");
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f57628e = ridePassManager;
        this.f57629f = paymentManager;
        this.f57630g = googlePayManager;
        this.f57631h = analyticsManager;
        this.f57632i = navigator;
        this.f57633j = reactiveConfig;
    }

    /* renamed from: A */
    public static final InterfaceC23434B m64466A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final InterfaceC23434B m64465B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC23434B m64464C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m64463D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m64462E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m64461F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final InterfaceC23434B m64460G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final InterfaceC23496h m64459H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final InterfaceC23434B m64458I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final InterfaceC23496h m64457J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final InterfaceC23434B m64456K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final InterfaceC23496h m64455L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m64454g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: z */
    public void consume(InterfaceC48106rX4 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Observable<String> mo15814P8 = renderer.mo15814P8();
        final C12405a c12405a = new C12405a();
        Observable<R> switchMap = mo15814P8.switchMap(new InterfaceC23492o() { // from class: NW4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m64466A;
                m64466A = C38601bX4.m64466A(Function1.this, obj);
                return m64466A;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap, "override fun consume(ren…eId.toLong())\n      }\n  }");
        Object m33094as = switchMap.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C12417f c12417f = new C12417f();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: UW4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38601bX4.m64454g(Function1.this, obj);
            }
        });
        AbstractC23461c refresh = this.f57628e.refresh();
        final C12419g c12419g = new C12419g();
        AbstractC23461c m33081E = refresh.m33081E(new InterfaceC23484g() { // from class: VW4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38601bX4.m64462E(Function1.this, obj);
            }
        });
        final C12421h c12421h = new C12421h();
        AbstractC23461c m33084B = m33081E.m33084B(new InterfaceC23484g() { // from class: WW4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38601bX4.m64461F(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33084B, "override fun consume(ren…eId.toLong())\n      }\n  }");
        Object m33041n = m33084B.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable<String> mo15814P82 = renderer.mo15814P8();
        final C12423i c12423i = new C12423i(this.f57628e);
        Observable<R> switchMap2 = mo15814P82.switchMap(new InterfaceC23492o() { // from class: XW4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m64460G;
                m64460G = C38601bX4.m64460G(Function1.this, obj);
                return m64460G;
            }
        });
        final C12424j c12424j = new C12424j(renderer, this);
        AbstractC23461c switchMapCompletable = switchMap2.switchMapCompletable(new InterfaceC23492o() { // from class: YW4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m64459H;
                m64459H = C38601bX4.m64459H(Function1.this, obj);
                return m64459H;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "override fun consume(ren…eId.toLong())\n      }\n  }");
        Object m33041n2 = switchMapCompletable.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
        Observable<String> mo15814P83 = renderer.mo15814P8();
        final C12433k c12433k = new C12433k(this.f57628e);
        Observable<R> switchMap3 = mo15814P83.switchMap(new InterfaceC23492o() { // from class: ZW4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m64458I;
                m64458I = C38601bX4.m64458I(Function1.this, obj);
                return m64458I;
            }
        });
        final C12434l c12434l = new C12434l(renderer, this);
        AbstractC23461c switchMapCompletable2 = switchMap3.switchMapCompletable(new InterfaceC23492o() { // from class: OW4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m64457J;
                m64457J = C38601bX4.m64457J(Function1.this, obj);
                return m64457J;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable2, "override fun consume(ren…eId.toLong())\n      }\n  }");
        Object m33041n3 = switchMapCompletable2.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n3, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n3).subscribe();
        Observable<String> mo15814P84 = renderer.mo15814P8();
        final C12440m c12440m = new C12440m(this.f57628e);
        Observable<R> switchMap4 = mo15814P84.switchMap(new InterfaceC23492o() { // from class: PW4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m64456K;
                m64456K = C38601bX4.m64456K(Function1.this, obj);
                return m64456K;
            }
        });
        final C12407b c12407b = new C12407b(renderer, this);
        AbstractC23461c switchMapCompletable3 = switchMap4.switchMapCompletable(new InterfaceC23492o() { // from class: QW4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m64455L;
                m64455L = C38601bX4.m64455L(Function1.this, obj);
                return m64455L;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable3, "override fun consume(ren…eId.toLong())\n      }\n  }");
        Object m33041n4 = switchMapCompletable3.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n4, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n4).subscribe();
        Observable<String> mo15814P85 = renderer.mo15814P8();
        final C12413c c12413c = new C12413c(this.f57628e);
        Observable<R> switchMap5 = mo15814P85.switchMap(new InterfaceC23492o() { // from class: RW4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m64465B;
                m64465B = C38601bX4.m64465B(Function1.this, obj);
                return m64465B;
            }
        });
        final C12414d c12414d = new C12414d(renderer);
        Observable switchMap6 = switchMap5.switchMap(new InterfaceC23492o() { // from class: SW4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m64464C;
                m64464C = C38601bX4.m64464C(Function1.this, obj);
                return m64464C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap6, "renderer: RidePassV4Deta…endeskArticleId }\n      }");
        Object m33094as2 = switchMap6.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C12416e c12416e = new C12416e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: TW4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38601bX4.m64463D(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/RidePassView;", "ridePass", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/persistence/RidePassView;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bX4$j */
    /* loaded from: classes3.dex */
    public static final class C12424j extends Lambda implements Function1<RidePassView, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC48106rX4 f57655g;

        /* renamed from: h */
        public final /* synthetic */ C38601bX4 f57656h;

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00012z\u0010\u0006\u001av\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*:\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "", "it", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: bX4$j$a */
        /* loaded from: classes3.dex */
        public static final class C12425a extends Lambda implements Function1<Triple<? extends Unit, ? extends Optional<BirdPayment>, ? extends Boolean>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C38601bX4 f57657g;

            /* renamed from: h */
            public final /* synthetic */ RidePassView f57658h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12425a(C38601bX4 c38601bX4, RidePassView ridePassView) {
                super(1);
                this.f57657g = c38601bX4;
                this.f57658h = ridePassView;
            }

            /* renamed from: a */
            public final void m64411a(Triple<Unit, Optional<BirdPayment>, Boolean> triple) {
                this.f57657g.f57631h.mo55905y(new AV4(null, null, null, this.f57658h.getLinkCode(), 7, null));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Unit, ? extends Optional<BirdPayment>, ? extends Boolean> triple) {
                m64411a(triple);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: bX4$j$c */
        /* loaded from: classes3.dex */
        public static final class C12431c extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C38601bX4 f57668g;

            @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LsX4;", "prev", C17296a.f69688o, "(LsX4;)LsX4;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: bX4$j$c$a */
            /* loaded from: classes3.dex */
            public static final class C12432a extends Lambda implements Function1<C48698sX4, C48698sX4> {

                /* renamed from: g */
                public final /* synthetic */ Throwable f57669g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C12432a(Throwable th) {
                    super(1);
                    this.f57669g = th;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final C48698sX4 invoke(C48698sX4 prev) {
                    C48698sX4 m14084a;
                    Intrinsics.checkNotNullParameter(prev, "prev");
                    m14084a = prev.m14084a((r18 & 1) != 0 ? prev.f108926a : null, (r18 & 2) != 0 ? prev.f108927b : true, (r18 & 4) != 0 ? prev.f108928c : false, (r18 & 8) != 0 ? prev.f108929d : false, (r18 & 16) != 0 ? prev.f108930e : false, (r18 & 32) != 0 ? prev.f108931f : false, (r18 & 64) != 0 ? prev.f108932g : false, (r18 & 128) != 0 ? prev.f108933h : this.f57669g);
                    return m14084a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12431c(C38601bX4 c38601bX4) {
                super(1);
                this.f57668g = c38601bX4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40159e(th);
                this.f57668g.m42279i(new C12432a(th));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12424j(InterfaceC48106rX4 interfaceC48106rX4, C38601bX4 c38601bX4) {
            super(1);
            this.f57655g = interfaceC48106rX4;
            this.f57656h = c38601bX4;
        }

        /* renamed from: e */
        public static final void m64412e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final InterfaceC23496h invoke$lambda$1(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23496h invoke(RidePassView ridePass) {
            Intrinsics.checkNotNullParameter(ridePass, "ridePass");
            Observable<Unit> subscribeOn = this.f57655g.mo15810e0().subscribeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(subscribeOn, "renderer.subscribeClicks…dSchedulers.mainThread())");
            Z84<Optional<BirdPayment>> mo85677e = this.f57656h.f57629f.mo85677e();
            Observable<Boolean> m33123k0 = this.f57656h.f57630g.mo16237g().m33123k0();
            Intrinsics.checkNotNullExpressionValue(m33123k0, "googlePayManager.googlePayReady().toObservable()");
            Observable m31949b = C24527f.m31949b(subscribeOn, mo85677e, m33123k0);
            final C12425a c12425a = new C12425a(this.f57656h, ridePass);
            Observable doOnNext = m31949b.doOnNext(new InterfaceC23484g() { // from class: gX4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C38601bX4.C12424j.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C12426b c12426b = new C12426b(this.f57656h, ridePass, this.f57655g);
            AbstractC23461c flatMapCompletable = doOnNext.flatMapCompletable(new InterfaceC23492o() { // from class: hX4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h invoke$lambda$1;
                    invoke$lambda$1 = C38601bX4.C12424j.invoke$lambda$1(Function1.this, obj);
                    return invoke$lambda$1;
                }
            });
            final C12431c c12431c = new C12431c(this.f57656h);
            return flatMapCompletable.m33084B(new InterfaceC23484g() { // from class: iX4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C38601bX4.C12424j.m64412e(Function1.this, obj);
                }
            }).m33066T();
        }

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\n \u0002*\u0004\u0018\u00010\u00070\u00072<\u0010\u0006\u001a8\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Triple;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: bX4$j$b */
        /* loaded from: classes3.dex */
        public static final class C12426b extends Lambda implements Function1<Triple<? extends Unit, ? extends Optional<BirdPayment>, ? extends Boolean>, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ C38601bX4 f57659g;

            /* renamed from: h */
            public final /* synthetic */ RidePassView f57660h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC48106rX4 f57661i;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: bX4$j$b$a */
            /* loaded from: classes3.dex */
            public static final class C12427a extends Lambda implements Function1<Unit, InterfaceC23496h> {

                /* renamed from: g */
                public final /* synthetic */ C38601bX4 f57662g;

                /* renamed from: h */
                public final /* synthetic */ RidePassView f57663h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C12427a(C38601bX4 c38601bX4, RidePassView ridePassView) {
                    super(1);
                    this.f57662g = c38601bX4;
                    this.f57663h = ridePassView;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final InterfaceC23496h invoke(Unit it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return C12426b.m64404g(this.f57662g, this.f57663h);
                }
            }

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: bX4$j$b$b */
            /* loaded from: classes3.dex */
            public static final class C12428b extends Lambda implements Function1<Unit, InterfaceC23496h> {

                /* renamed from: g */
                public final /* synthetic */ C38601bX4 f57664g;

                /* renamed from: h */
                public final /* synthetic */ RidePassView f57665h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C12428b(C38601bX4 c38601bX4, RidePassView ridePassView) {
                    super(1);
                    this.f57664g = c38601bX4;
                    this.f57665h = ridePassView;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final InterfaceC23496h invoke(Unit it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return C12426b.m64404g(this.f57664g, this.f57665h);
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: bX4$j$b$c */
            /* loaded from: classes3.dex */
            public static final class C12429c extends Lambda implements Function1<InterfaceC23465c, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C38601bX4 f57666g;

                @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LsX4;", "prev", C17296a.f69688o, "(LsX4;)LsX4;"}, m28431k = 3, m28430mv = {1, 8, 0})
                /* renamed from: bX4$j$b$c$a */
                /* loaded from: classes3.dex */
                public static final class C12430a extends Lambda implements Function1<C48698sX4, C48698sX4> {

                    /* renamed from: g */
                    public static final C12430a f57667g = new C12430a();

                    public C12430a() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a */
                    public final C48698sX4 invoke(C48698sX4 prev) {
                        C48698sX4 m14084a;
                        Intrinsics.checkNotNullParameter(prev, "prev");
                        m14084a = prev.m14084a((r18 & 1) != 0 ? prev.f108926a : null, (r18 & 2) != 0 ? prev.f108927b : false, (r18 & 4) != 0 ? prev.f108928c : false, (r18 & 8) != 0 ? prev.f108929d : false, (r18 & 16) != 0 ? prev.f108930e : false, (r18 & 32) != 0 ? prev.f108931f : false, (r18 & 64) != 0 ? prev.f108932g : true, (r18 & 128) != 0 ? prev.f108933h : null);
                        return m14084a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C12429c(C38601bX4 c38601bX4) {
                    super(1);
                    this.f57666g = c38601bX4;
                }

                /* renamed from: a */
                public final void m64399a(InterfaceC23465c interfaceC23465c) {
                    this.f57666g.m42279i(C12430a.f57667g);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                    m64399a(interfaceC23465c);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12426b(C38601bX4 c38601bX4, RidePassView ridePassView, InterfaceC48106rX4 interfaceC48106rX4) {
                super(1);
                this.f57659g = c38601bX4;
                this.f57660h = ridePassView;
                this.f57661i = interfaceC48106rX4;
            }

            /* renamed from: f */
            public static final InterfaceC23496h m64405f(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC23496h) tmp0.invoke(obj);
            }

            /* renamed from: g */
            public static final AbstractC23461c m64404g(final C38601bX4 c38601bX4, RidePassView ridePassView) {
                AbstractC23461c m33049i = c38601bX4.f57628e.mo55485y0(ridePassView.getLinkCode()).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: lX4
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        InterfaceC23496h m64403h;
                        m64403h = C38601bX4.C12424j.C12426b.m64403h(C38601bX4.this);
                        return m64403h;
                    }
                }));
                final C12429c c12429c = new C12429c(c38601bX4);
                AbstractC23461c m33081E = m33049i.m33081E(new InterfaceC23484g() { // from class: mX4
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C38601bX4.C12424j.C12426b.m64402i(Function1.this, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33081E, "override fun consume(ren…eId.toLong())\n      }\n  }");
                return m33081E;
            }

            /* renamed from: h */
            public static final InterfaceC23496h m64403h(C38601bX4 this$0) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return this$0.f57628e.refresh();
            }

            /* renamed from: i */
            public static final void m64402i(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            public static final InterfaceC23496h invoke$lambda$3(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC23496h) tmp0.invoke(obj);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final InterfaceC23496h invoke2(Triple<Unit, Optional<BirdPayment>, Boolean> triple) {
                Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
                Optional<BirdPayment> component2 = triple.component2();
                Boolean googlePayReady = triple.component3();
                if (!component2.m59037c()) {
                    InterfaceC40099e13 interfaceC40099e13 = this.f57659g.f57632i;
                    PurchasePaymentReason purchasePaymentReason = PurchasePaymentReason.RIDE_PASS;
                    long price = this.f57660h.getPrice();
                    Long priceTax = this.f57660h.getPriceTax();
                    interfaceC40099e13.mo37201A2(purchasePaymentReason, 10046, price + (priceTax != null ? priceTax.longValue() : 0L), this.f57660h.getCurrency(), PaymentAddSource.RIDE_PASS_PURCHASE);
                    Observable<Unit> mo15813b1 = this.f57661i.mo15813b1();
                    final C12427a c12427a = new C12427a(this.f57659g, this.f57660h);
                    return mo15813b1.flatMapCompletable(new InterfaceC23492o() { // from class: jX4
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC23496h m64405f;
                            m64405f = C38601bX4.C12424j.C12426b.m64405f(Function1.this, obj);
                            return m64405f;
                        }
                    });
                }
                if (component2.m59038b().isGooglePay()) {
                    Intrinsics.checkNotNullExpressionValue(googlePayReady, "googlePayReady");
                    if (googlePayReady.booleanValue()) {
                        this.f57659g.f57630g.mo16239e(C45097mS5.m25591o(this.f57660h.getCurrency()), Long.valueOf(this.f57660h.getPrice()), this.f57660h.getPriceTax(), this.f57659g.m42277k().m14079f());
                        Observable<Unit> mo15813b12 = this.f57661i.mo15813b1();
                        final C12428b c12428b = new C12428b(this.f57659g, this.f57660h);
                        return mo15813b12.flatMapCompletable(new InterfaceC23492o() { // from class: kX4
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj) {
                                InterfaceC23496h invoke$lambda$3;
                                invoke$lambda$3 = C38601bX4.C12424j.C12426b.invoke$lambda$3(Function1.this, obj);
                                return invoke$lambda$3;
                            }
                        });
                    }
                }
                return m64404g(this.f57659g, this.f57660h);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Triple<? extends Unit, ? extends Optional<BirdPayment>, ? extends Boolean> triple) {
                return invoke2((Triple<Unit, Optional<BirdPayment>, Boolean>) triple);
            }
        }
    }
}
