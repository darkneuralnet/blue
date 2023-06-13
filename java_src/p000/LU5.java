package p000;

import android.location.Location;
import co.bird.android.buava.Optional;
import co.bird.android.model.Folder;
import co.bird.android.model.PhotoBannerViewModel;
import co.bird.android.model.wire.WireArea;
import co.bird.android.model.wire.WireNestArea;
import co.bird.android.model.wire.configs.OperatorNestSuggestionConfig;
import co.bird.api.response.NestSuggestionResponse;
import co.bird.api.response.OperatorMapNestResponse;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.stripe.android.model.PaymentMethod;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23450a;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
import p000.LU5;
@Metadata(m28433d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B9\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&¢\u0006\u0004\b6\u00107J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00050\u0004H\u0002J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010-\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\u00070\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00101\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\b0\b0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R.\u00105\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000203 **\n\u0012\u0004\u0012\u000203\u0018\u000102020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00100¨\u00068"}, m28432d2 = {"LLU5;", "Lf1;", "LNU5;", "LOU5;", "Lio/reactivex/Observable;", "Lkotlin/Triple;", "Lcom/google/android/gms/maps/model/LatLng;", "Landroid/location/Location;", "Lco/bird/api/response/OperatorMapNestResponse;", "Lio/reactivex/k;", "LBj6;", "M", "T", "Lio/reactivex/F;", "m0", "renderer", "", "O", "Ldr4;", "e", "Ldr4;", "locationManager", "Ls43;", "f", "Ls43;", "nestManager", "LFs5;", "g", "LFs5;", "sensorManager", "LTq4;", "h", "LTq4;", "reactiveConfig", "Le13;", "i", "Le13;", "navigator", "Lco/bird/android/model/PhotoBannerViewModel;", "j", "Lco/bird/android/model/PhotoBannerViewModel;", "photoBannerViewModel", "kotlin.jvm.PlatformType", "k", "Lio/reactivex/Observable;", "locationUpdates", "Lma4;", "l", "Lma4;", "invalidNestAreas", "Lco/bird/android/buava/Optional;", "", "m", "assetIdRelay", "<init>", "(Ldr4;Ls43;LFs5;LTq4;Le13;Lco/bird/android/model/PhotoBannerViewModel;)V", "suggest-a-nest_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSuggestNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestPresenter.kt\nco/bird/android/feature/suggestanest/SuggestNestPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,252:1\n180#2:253\n199#2:254\n180#2:255\n180#2:256\n161#2:257\n180#2:258\n180#2:259\n180#2:260\n180#2:261\n180#2:262\n180#2:263\n180#2:264\n*S KotlinDebug\n*F\n+ 1 SuggestNestPresenter.kt\nco/bird/android/feature/suggestanest/SuggestNestPresenter\n*L\n57#1:253\n71#1:254\n84#1:255\n91#1:256\n103#1:257\n130#1:258\n137#1:259\n144#1:260\n151#1:261\n158#1:262\n164#1:263\n208#1:264\n*E\n"})
/* renamed from: LU5 */
/* loaded from: classes3.dex */
public final class LU5 extends AbstractC20169f1<NU5, OU5> {

    /* renamed from: e */
    public final InterfaceC40001dr4 f21529e;

    /* renamed from: f */
    public final InterfaceC48430s43 f21530f;

    /* renamed from: g */
    public final InterfaceC32950Fs5 f21531g;

    /* renamed from: h */
    public final C36207Tq4 f21532h;

    /* renamed from: i */
    public final InterfaceC40099e13 f21533i;

    /* renamed from: j */
    public final PhotoBannerViewModel f21534j;

    /* renamed from: k */
    public final Observable<Location> f21535k;

    /* renamed from: l */
    public final C45168ma4<OperatorMapNestResponse> f21536l;

    /* renamed from: m */
    public final C45168ma4<Optional<String>> f21537m;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"T", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Throwable;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LU5$A */
    /* loaded from: classes3.dex */
    public static final class C4972A extends Lambda implements Function2<T, Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "LOU5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LOU5;)LOU5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: LU5$A$a */
        /* loaded from: classes3.dex */
        public static final class C4973a extends Lambda implements Function1<OU5, OU5> {

            /* renamed from: g */
            public static final C4973a f21539g = new C4973a();

            public C4973a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final OU5 invoke(OU5 state) {
                OU5 m92190a;
                Intrinsics.checkNotNullParameter(state, "state");
                m92190a = state.m92190a((r30 & 1) != 0 ? state.f26647a : state.m92178m() - 1, (r30 & 2) != 0 ? state.f26648b : null, (r30 & 4) != 0 ? state.f26649c : null, (r30 & 8) != 0 ? state.f26650d : null, (r30 & 16) != 0 ? state.f26651e : null, (r30 & 32) != 0 ? state.f26652f : 0.0d, (r30 & 64) != 0 ? state.f26653g : null, (r30 & 128) != 0 ? state.f26654h : null, (r30 & 256) != 0 ? state.f26655i : null, (r30 & 512) != 0 ? state.f26656j : null, (r30 & 1024) != 0 ? state.f26657k : null, (r30 & 2048) != 0 ? state.f26658l : null, (r30 & 4096) != 0 ? state.f26659m : null);
                return m92190a;
            }
        }

        public C4972A() {
            super(2);
        }

        /* renamed from: a */
        public final void m96829a(T t, Throwable th) {
            LU5.this.m42279i(C4973a.f21539g);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th) {
            m96829a(obj, th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lcom/google/android/gms/maps/model/LatLng;", "Landroid/location/Location;", "Lco/bird/api/response/OperatorMapNestResponse;", "<name for destructuring parameter 0>", "LBj6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Triple;)LBj6;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSuggestNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestPresenter.kt\nco/bird/android/feature/suggestanest/SuggestNestPresenter$computeValidNestLocation$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,252:1\n1747#2,3:253\n1747#2,3:256\n*S KotlinDebug\n*F\n+ 1 SuggestNestPresenter.kt\nco/bird/android/feature/suggestanest/SuggestNestPresenter$computeValidNestLocation$1\n*L\n232#1:253,3\n233#1:256,3\n*E\n"})
    /* renamed from: LU5$a */
    /* loaded from: classes3.dex */
    public static final class C4974a extends Lambda implements Function1<Triple<? extends LatLng, ? extends Location, ? extends OperatorMapNestResponse>, EnumC31934Bj6> {
        public C4974a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final EnumC31934Bj6 invoke(Triple<LatLng, ? extends Location, OperatorMapNestResponse> triple) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            LatLng component1 = triple.component1();
            OperatorMapNestResponse component3 = triple.component3();
            Location m60884e = C39339cm2.m60884e(component1);
            LU5.this.f21532h.m82623f8().m73665a();
            if (RN5.m86795c(C39339cm2.m60885d(triple.component2()), component1) > LU5.this.f21532h.m82623f8().m73665a().getOperatorConfig().getFeatures().getNestSuggestion().getMaxNestDistanceFromUserMeters()) {
                return EnumC31934Bj6.INVALID_OUTSIDE_CIRCLE;
            }
            List<WireArea> areas = component3.getAreas();
            boolean z3 = true;
            if (!(areas instanceof Collection) || !areas.isEmpty()) {
                for (WireArea wireArea : areas) {
                    if (JX3.contains$default(wireArea.getRegion(), m60884e, 0.0d, 0.0d, 4, null)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                List<WireNestArea> nests = component3.getNests();
                if (!(nests instanceof Collection) || !nests.isEmpty()) {
                    for (WireNestArea wireNestArea : nests) {
                        if (RN5.m86795c(component1, new LatLng(wireNestArea.getLocation().getLatitude(), wireNestArea.getLocation().getLongitude())) < wireNestArea.getRadius()) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            break;
                        }
                    }
                }
                z3 = false;
                if (!z3) {
                    return EnumC31934Bj6.VALID;
                }
            }
            return EnumC31934Bj6.INVALID_NOT_PERMITTED;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LBj6;", "kotlin.jvm.PlatformType", "validityState", "", C17296a.f69688o, "(LBj6;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LU5$b */
    /* loaded from: classes3.dex */
    public static final class C4975b extends Lambda implements Function1<EnumC31934Bj6, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LOU5;)LOU5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: LU5$b$a */
        /* loaded from: classes3.dex */
        public static final class C4976a extends Lambda implements Function1<OU5, OU5> {

            /* renamed from: g */
            public final /* synthetic */ EnumC31934Bj6 f21542g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4976a(EnumC31934Bj6 enumC31934Bj6) {
                super(1);
                this.f21542g = enumC31934Bj6;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final OU5 invoke(OU5 state) {
                OU5 m92190a;
                Intrinsics.checkNotNullParameter(state, "state");
                m92190a = state.m92190a((r30 & 1) != 0 ? state.f26647a : 0, (r30 & 2) != 0 ? state.f26648b : null, (r30 & 4) != 0 ? state.f26649c : null, (r30 & 8) != 0 ? state.f26650d : null, (r30 & 16) != 0 ? state.f26651e : null, (r30 & 32) != 0 ? state.f26652f : 0.0d, (r30 & 64) != 0 ? state.f26653g : this.f21542g, (r30 & 128) != 0 ? state.f26654h : null, (r30 & 256) != 0 ? state.f26655i : null, (r30 & 512) != 0 ? state.f26656j : null, (r30 & 1024) != 0 ? state.f26657k : null, (r30 & 2048) != 0 ? state.f26658l : null, (r30 & 4096) != 0 ? state.f26659m : null);
                return m92190a;
            }
        }

        public C4975b() {
            super(1);
        }

        /* renamed from: a */
        public final void m96826a(EnumC31934Bj6 enumC31934Bj6) {
            LU5.this.m42279i(new C4976a(enumC31934Bj6));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EnumC31934Bj6 enumC31934Bj6) {
            m96826a(enumC31934Bj6);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LOU5;)LOU5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LU5$c */
    /* loaded from: classes3.dex */
    public static final class C4977c extends Lambda implements Function1<OU5, OU5> {
        public C4977c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final OU5 invoke(OU5 state) {
            OU5 m92190a;
            Intrinsics.checkNotNullParameter(state, "state");
            OperatorNestSuggestionConfig nestSuggestion = LU5.this.f21532h.m82623f8().m73665a().getOperatorConfig().getFeatures().getNestSuggestion();
            m92190a = state.m92190a((r30 & 1) != 0 ? state.f26647a : 0, (r30 & 2) != 0 ? state.f26648b : null, (r30 & 4) != 0 ? state.f26649c : null, (r30 & 8) != 0 ? state.f26650d : null, (r30 & 16) != 0 ? state.f26651e : null, (r30 & 32) != 0 ? state.f26652f : nestSuggestion.getMaxNestDistanceFromUserMeters(), (r30 & 64) != 0 ? state.f26653g : null, (r30 & 128) != 0 ? state.f26654h : null, (r30 & 256) != 0 ? state.f26655i : null, (r30 & 512) != 0 ? state.f26656j : null, (r30 & 1024) != 0 ? state.f26657k : null, (r30 & 2048) != 0 ? state.f26658l : null, (r30 & 4096) != 0 ? state.f26659m : Integer.valueOf(nestSuggestion.getMaxNestCapacity()));
            return m92190a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "<anonymous parameter 0>", "Lcom/google/android/gms/maps/model/LatLng;", "pinLatLng", C17296a.f69688o, "(Lkotlin/Unit;Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLng;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LU5$d */
    /* loaded from: classes3.dex */
    public static final class C4978d extends Lambda implements Function2<Unit, LatLng, LatLng> {

        /* renamed from: g */
        public static final C4978d f21544g = new C4978d();

        public C4978d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final LatLng invoke(Unit unit, LatLng pinLatLng) {
            Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(pinLatLng, "pinLatLng");
            return pinLatLng;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lcom/google/android/gms/maps/model/LatLng;", "pinLatLng", "Lio/reactivex/K;", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "b", "(Lcom/google/android/gms/maps/model/LatLng;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LU5$e */
    /* loaded from: classes3.dex */
    public static final class C4979e extends Lambda implements Function1<LatLng, InterfaceC23447K<? extends Pair<? extends LatLng, ? extends String>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/google/android/gms/maps/model/LatLng;", "", "kotlin.jvm.PlatformType", PaymentMethod.BillingDetails.PARAM_ADDRESS, "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: LU5$e$a */
        /* loaded from: classes3.dex */
        public static final class C4980a extends Lambda implements Function1<String, Pair<? extends LatLng, ? extends String>> {

            /* renamed from: g */
            public final /* synthetic */ LatLng f21546g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4980a(LatLng latLng) {
                super(1);
                this.f21546g = latLng;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Pair<LatLng, String> invoke(String address) {
                Intrinsics.checkNotNullParameter(address, "address");
                return TuplesKt.m28425to(this.f21546g, address);
            }
        }

        public C4979e() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<LatLng, String>> invoke(LatLng pinLatLng) {
            Intrinsics.checkNotNullParameter(pinLatLng, "pinLatLng");
            LU5 lu5 = LU5.this;
            AbstractC23442F<String> firstOrError = lu5.f21529e.mo43614r(pinLatLng.f71430b, pinLatLng.f71431c).firstOrError();
            Intrinsics.checkNotNullExpressionValue(firstOrError, "locationManager.address(…          .firstOrError()");
            AbstractC23442F m96845m0 = lu5.m96845m0(firstOrError);
            final C4980a c4980a = new C4980a(pinLatLng);
            return m96845m0.m33157I(new InterfaceC23492o() { // from class: MU5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = LU5.C4979e.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/google/android/gms/maps/model/LatLng;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LU5$f */
    /* loaded from: classes3.dex */
    public static final class C4981f extends Lambda implements Function1<Pair<? extends LatLng, ? extends String>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LOU5;)LOU5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: LU5$f$a */
        /* loaded from: classes3.dex */
        public static final class C4982a extends Lambda implements Function1<OU5, OU5> {

            /* renamed from: g */
            public final /* synthetic */ LatLng f21548g;

            /* renamed from: h */
            public final /* synthetic */ String f21549h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4982a(LatLng latLng, String str) {
                super(1);
                this.f21548g = latLng;
                this.f21549h = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final OU5 invoke(OU5 state) {
                OU5 m92190a;
                Intrinsics.checkNotNullParameter(state, "state");
                m92190a = state.m92190a((r30 & 1) != 0 ? state.f26647a : 0, (r30 & 2) != 0 ? state.f26648b : null, (r30 & 4) != 0 ? state.f26649c : null, (r30 & 8) != 0 ? state.f26650d : null, (r30 & 16) != 0 ? state.f26651e : null, (r30 & 32) != 0 ? state.f26652f : 0.0d, (r30 & 64) != 0 ? state.f26653g : null, (r30 & 128) != 0 ? state.f26654h : this.f21548g, (r30 & 256) != 0 ? state.f26655i : this.f21549h, (r30 & 512) != 0 ? state.f26656j : null, (r30 & 1024) != 0 ? state.f26657k : null, (r30 & 2048) != 0 ? state.f26658l : null, (r30 & 4096) != 0 ? state.f26659m : null);
                return m92190a;
            }
        }

        public C4981f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends LatLng, ? extends String> pair) {
            invoke2((Pair<LatLng, String>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<LatLng, String> pair) {
            LU5.this.m42279i(new C4982a(pair.component1(), pair.component2()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LU5$g */
    /* loaded from: classes3.dex */
    public static final class C4983g extends Lambda implements Function1<Unit, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LOU5;)LOU5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: LU5$g$a */
        /* loaded from: classes3.dex */
        public static final class C4984a extends Lambda implements Function1<OU5, OU5> {

            /* renamed from: g */
            public static final C4984a f21551g = new C4984a();

            public C4984a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final OU5 invoke(OU5 state) {
                OU5 m92190a;
                Intrinsics.checkNotNullParameter(state, "state");
                m92190a = state.m92190a((r30 & 1) != 0 ? state.f26647a : 0, (r30 & 2) != 0 ? state.f26648b : null, (r30 & 4) != 0 ? state.f26649c : null, (r30 & 8) != 0 ? state.f26650d : null, (r30 & 16) != 0 ? state.f26651e : null, (r30 & 32) != 0 ? state.f26652f : 0.0d, (r30 & 64) != 0 ? state.f26653g : null, (r30 & 128) != 0 ? state.f26654h : null, (r30 & 256) != 0 ? state.f26655i : null, (r30 & 512) != 0 ? state.f26656j : null, (r30 & 1024) != 0 ? state.f26657k : null, (r30 & 2048) != 0 ? state.f26658l : null, (r30 & 4096) != 0 ? state.f26659m : null);
                return m92190a;
            }
        }

        public C4983g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            LU5.this.m42279i(C4984a.f21551g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "name", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LU5$h */
    /* loaded from: classes3.dex */
    public static final class C4985h extends Lambda implements Function1<Optional<String>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LOU5;)LOU5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: LU5$h$a */
        /* loaded from: classes3.dex */
        public static final class C4986a extends Lambda implements Function1<OU5, OU5> {

            /* renamed from: g */
            public final /* synthetic */ Optional<String> f21553g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4986a(Optional<String> optional) {
                super(1);
                this.f21553g = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final OU5 invoke(OU5 state) {
                OU5 m92190a;
                Intrinsics.checkNotNullParameter(state, "state");
                m92190a = state.m92190a((r30 & 1) != 0 ? state.f26647a : 0, (r30 & 2) != 0 ? state.f26648b : null, (r30 & 4) != 0 ? state.f26649c : null, (r30 & 8) != 0 ? state.f26650d : null, (r30 & 16) != 0 ? state.f26651e : null, (r30 & 32) != 0 ? state.f26652f : 0.0d, (r30 & 64) != 0 ? state.f26653g : null, (r30 & 128) != 0 ? state.f26654h : null, (r30 & 256) != 0 ? state.f26655i : null, (r30 & 512) != 0 ? state.f26656j : this.f21553g.m59035e(), (r30 & 1024) != 0 ? state.f26657k : null, (r30 & 2048) != 0 ? state.f26658l : null, (r30 & 4096) != 0 ? state.f26659m : null);
                return m92190a;
            }
        }

        public C4985h() {
            super(1);
        }

        /* renamed from: a */
        public final void m96818a(Optional<String> optional) {
            LU5.this.m42279i(new C4986a(optional));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<String> optional) {
            m96818a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "note", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LU5$i */
    /* loaded from: classes3.dex */
    public static final class C4987i extends Lambda implements Function1<Optional<String>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LOU5;)LOU5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: LU5$i$a */
        /* loaded from: classes3.dex */
        public static final class C4988a extends Lambda implements Function1<OU5, OU5> {

            /* renamed from: g */
            public final /* synthetic */ Optional<String> f21555g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4988a(Optional<String> optional) {
                super(1);
                this.f21555g = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final OU5 invoke(OU5 state) {
                OU5 m92190a;
                Intrinsics.checkNotNullParameter(state, "state");
                m92190a = state.m92190a((r30 & 1) != 0 ? state.f26647a : 0, (r30 & 2) != 0 ? state.f26648b : null, (r30 & 4) != 0 ? state.f26649c : null, (r30 & 8) != 0 ? state.f26650d : null, (r30 & 16) != 0 ? state.f26651e : null, (r30 & 32) != 0 ? state.f26652f : 0.0d, (r30 & 64) != 0 ? state.f26653g : null, (r30 & 128) != 0 ? state.f26654h : null, (r30 & 256) != 0 ? state.f26655i : null, (r30 & 512) != 0 ? state.f26656j : null, (r30 & 1024) != 0 ? state.f26657k : this.f21555g.m59035e(), (r30 & 2048) != 0 ? state.f26658l : null, (r30 & 4096) != 0 ? state.f26659m : null);
                return m92190a;
            }
        }

        public C4987i() {
            super(1);
        }

        /* renamed from: a */
        public final void m96816a(Optional<String> optional) {
            LU5.this.m42279i(new C4988a(optional));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<String> optional) {
            m96816a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "suggestedCapacity", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LU5$j */
    /* loaded from: classes3.dex */
    public static final class C4989j extends Lambda implements Function1<Integer, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LOU5;)LOU5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: LU5$j$a */
        /* loaded from: classes3.dex */
        public static final class C4990a extends Lambda implements Function1<OU5, OU5> {

            /* renamed from: g */
            public final /* synthetic */ Integer f21557g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4990a(Integer num) {
                super(1);
                this.f21557g = num;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final OU5 invoke(OU5 state) {
                OU5 m92190a;
                Intrinsics.checkNotNullParameter(state, "state");
                m92190a = state.m92190a((r30 & 1) != 0 ? state.f26647a : 0, (r30 & 2) != 0 ? state.f26648b : null, (r30 & 4) != 0 ? state.f26649c : null, (r30 & 8) != 0 ? state.f26650d : null, (r30 & 16) != 0 ? state.f26651e : null, (r30 & 32) != 0 ? state.f26652f : 0.0d, (r30 & 64) != 0 ? state.f26653g : null, (r30 & 128) != 0 ? state.f26654h : null, (r30 & 256) != 0 ? state.f26655i : null, (r30 & 512) != 0 ? state.f26656j : null, (r30 & 1024) != 0 ? state.f26657k : null, (r30 & 2048) != 0 ? state.f26658l : this.f21557g, (r30 & 4096) != 0 ? state.f26659m : null);
                return m92190a;
            }
        }

        public C4989j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer num) {
            LU5.this.m42279i(new C4990a(num));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LU5$k */
    /* loaded from: classes3.dex */
    public static final class C4991k extends Lambda implements Function1<Unit, Unit> {
        public C4991k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            if (LU5.this.f21532h.m82623f8().m73665a().getOperatorConfig().getFeatures().getNestSuggestion().getPhotoRequired()) {
                InterfaceC40099e13.C19924a.goToRetakeablePhoto$default(LU5.this.f21533i, LU5.this.f21534j, null, Folder.NEST_PHOTOS, 10079, null, true, 18, null);
                return;
            }
            LU5.this.f21537m.accept(Optional.f63040c.m59034a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/location/Location;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LU5$l */
    /* loaded from: classes3.dex */
    public static final class C4992l extends Lambda implements Function1<Location, Unit> {

        /* renamed from: g */
        public static final C4992l f21559g = new C4992l();

        public C4992l() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Location it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Location location) {
            invoke2(location);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LU5$m */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C4993m extends FunctionReferenceImpl implements Function1<String, Optional<String>> {

        /* renamed from: b */
        public static final C4993m f21560b = new C4993m();

        public C4993m() {
            super(1, Optional.class, "<init>", "<init>(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<String> invoke(String str) {
            return new Optional<>(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a2\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "assetId", "Lcom/google/android/gms/maps/model/LatLng;", "suggestedLatLng", "name", "note", "", "capacity", "LRe4;", C17296a.f69688o, "(Lco/bird/android/buava/Optional;Lcom/google/android/gms/maps/model/LatLng;Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;Ljava/lang/Integer;)LRe4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LU5$n */
    /* loaded from: classes3.dex */
    public static final class C4994n extends Lambda implements Function5<Optional<String>, LatLng, Optional<String>, Optional<String>, Integer, C35631Re4<? extends LatLng, ? extends Optional<String>, ? extends Optional<String>, ? extends Integer, ? extends Optional<String>>> {

        /* renamed from: g */
        public static final C4994n f21561g = new C4994n();

        public C4994n() {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        /* renamed from: a */
        public final C35631Re4<LatLng, Optional<String>, Optional<String>, Integer, Optional<String>> invoke(Optional<String> assetId, LatLng suggestedLatLng, Optional<String> name, Optional<String> note, Integer capacity) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(suggestedLatLng, "suggestedLatLng");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(note, "note");
            Intrinsics.checkNotNullParameter(capacity, "capacity");
            return new C35631Re4<>(suggestedLatLng, name, note, capacity, assetId);
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a*\u0012\u000e\b\u0001\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0014\u0012\u000e\b\u0001\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u000626\u0010\u0005\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"LRe4;", "Lcom/google/android/gms/maps/model/LatLng;", "Lco/bird/android/buava/Optional;", "", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/api/response/NestSuggestionResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LRe4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LU5$o */
    /* loaded from: classes3.dex */
    public static final class C4995o extends Lambda implements Function1<C35631Re4<? extends LatLng, ? extends Optional<String>, ? extends Optional<String>, ? extends Integer, ? extends Optional<String>>, InterfaceC23447K<? extends NestSuggestionResponse>> {
        public C4995o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends NestSuggestionResponse> invoke(C35631Re4<LatLng, Optional<String>, Optional<String>, Integer, Optional<String>> c35631Re4) {
            Intrinsics.checkNotNullParameter(c35631Re4, "<name for destructuring parameter 0>");
            LatLng m86500a = c35631Re4.m86500a();
            Integer capacity = c35631Re4.m86497d();
            LU5 lu5 = LU5.this;
            Intrinsics.checkNotNullExpressionValue(capacity, "capacity");
            return lu5.m96845m0(lu5.f21530f.mo10898c(m86500a.f71430b, m86500a.f71431c, c35631Re4.m86499b().m59035e(), c35631Re4.m86498c().m59035e(), capacity.intValue(), c35631Re4.m86496e().m59035e()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LU5$p */
    /* loaded from: classes3.dex */
    public static final class C4996p extends Lambda implements Function1<Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LOU5;)LOU5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nSuggestNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestPresenter.kt\nco/bird/android/feature/suggestanest/SuggestNestPresenter$consume$23$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"})
        /* renamed from: LU5$p$a */
        /* loaded from: classes3.dex */
        public static final class C4997a extends Lambda implements Function1<OU5, OU5> {

            /* renamed from: g */
            public final /* synthetic */ Throwable f21564g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4997a(Throwable th) {
                super(1);
                this.f21564g = th;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final OU5 invoke(OU5 state) {
                OU5 m92190a;
                Intrinsics.checkNotNullParameter(state, "state");
                m92190a = state.m92190a((r30 & 1) != 0 ? state.f26647a : 0, (r30 & 2) != 0 ? state.f26648b : null, (r30 & 4) != 0 ? state.f26649c : null, (r30 & 8) != 0 ? state.f26650d : null, (r30 & 16) != 0 ? state.f26651e : null, (r30 & 32) != 0 ? state.f26652f : 0.0d, (r30 & 64) != 0 ? state.f26653g : null, (r30 & 128) != 0 ? state.f26654h : null, (r30 & 256) != 0 ? state.f26655i : null, (r30 & 512) != 0 ? state.f26656j : null, (r30 & 1024) != 0 ? state.f26657k : null, (r30 & 2048) != 0 ? state.f26658l : null, (r30 & 4096) != 0 ? state.f26659m : null);
                m92190a.m92173r(this.f21564g);
                return m92190a;
            }
        }

        public C4996p() {
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
            LU5.this.m42279i(new C4997a(th));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/NestSuggestionResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/NestSuggestionResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LU5$q */
    /* loaded from: classes3.dex */
    public static final class C4998q extends Lambda implements Function1<NestSuggestionResponse, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LOU5;)LOU5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nSuggestNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestPresenter.kt\nco/bird/android/feature/suggestanest/SuggestNestPresenter$consume$24$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"})
        /* renamed from: LU5$q$a */
        /* loaded from: classes3.dex */
        public static final class C4999a extends Lambda implements Function1<OU5, OU5> {

            /* renamed from: g */
            public final /* synthetic */ NestSuggestionResponse f21566g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4999a(NestSuggestionResponse nestSuggestionResponse) {
                super(1);
                this.f21566g = nestSuggestionResponse;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final OU5 invoke(OU5 state) {
                OU5 m92190a;
                Intrinsics.checkNotNullParameter(state, "state");
                m92190a = state.m92190a((r30 & 1) != 0 ? state.f26647a : 0, (r30 & 2) != 0 ? state.f26648b : null, (r30 & 4) != 0 ? state.f26649c : null, (r30 & 8) != 0 ? state.f26650d : null, (r30 & 16) != 0 ? state.f26651e : null, (r30 & 32) != 0 ? state.f26652f : 0.0d, (r30 & 64) != 0 ? state.f26653g : null, (r30 & 128) != 0 ? state.f26654h : null, (r30 & 256) != 0 ? state.f26655i : null, (r30 & 512) != 0 ? state.f26656j : null, (r30 & 1024) != 0 ? state.f26657k : null, (r30 & 2048) != 0 ? state.f26658l : null, (r30 & 4096) != 0 ? state.f26659m : null);
                m92190a.m92172s(this.f21566g.getMessage());
                return m92190a;
            }
        }

        public C4998q() {
            super(1);
        }

        /* renamed from: a */
        public final void m96809a(NestSuggestionResponse nestSuggestionResponse) {
            LU5.this.m42279i(new C4999a(nestSuggestionResponse));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NestSuggestionResponse nestSuggestionResponse) {
            m96809a(nestSuggestionResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "<anonymous parameter 0>", "Landroid/location/Location;", "location", C17296a.f69688o, "(Lkotlin/Unit;Landroid/location/Location;)Landroid/location/Location;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LU5$r */
    /* loaded from: classes3.dex */
    public static final class C5000r extends Lambda implements Function2<Unit, Location, Location> {

        /* renamed from: g */
        public static final C5000r f21567g = new C5000r();

        public C5000r() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Location invoke(Unit unit, Location location) {
            Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(location, "location");
            return location;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "location", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LU5$s */
    /* loaded from: classes3.dex */
    public static final class C5001s extends Lambda implements Function1<Location, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LOU5;)LOU5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nSuggestNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestPresenter.kt\nco/bird/android/feature/suggestanest/SuggestNestPresenter$consume$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"})
        /* renamed from: LU5$s$a */
        /* loaded from: classes3.dex */
        public static final class C5002a extends Lambda implements Function1<OU5, OU5> {

            /* renamed from: g */
            public final /* synthetic */ Location f21569g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5002a(Location location) {
                super(1);
                this.f21569g = location;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final OU5 invoke(OU5 state) {
                OU5 m92190a;
                Intrinsics.checkNotNullParameter(state, "state");
                m92190a = state.m92190a((r30 & 1) != 0 ? state.f26647a : 0, (r30 & 2) != 0 ? state.f26648b : null, (r30 & 4) != 0 ? state.f26649c : null, (r30 & 8) != 0 ? state.f26650d : null, (r30 & 16) != 0 ? state.f26651e : null, (r30 & 32) != 0 ? state.f26652f : 0.0d, (r30 & 64) != 0 ? state.f26653g : null, (r30 & 128) != 0 ? state.f26654h : null, (r30 & 256) != 0 ? state.f26655i : null, (r30 & 512) != 0 ? state.f26656j : null, (r30 & 1024) != 0 ? state.f26657k : null, (r30 & 2048) != 0 ? state.f26658l : null, (r30 & 4096) != 0 ? state.f26659m : null);
                m92190a.m92171t(this.f21569g);
                return m92190a;
            }
        }

        public C5001s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Location location) {
            invoke2(location);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Location location) {
            LU5.this.m42279i(new C5002a(location));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/location/Location;", "location", "Lio/reactivex/K;", "Lco/bird/api/response/OperatorMapNestResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/location/Location;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LU5$t */
    /* loaded from: classes3.dex */
    public static final class C5003t extends Lambda implements Function1<Location, InterfaceC23447K<? extends OperatorMapNestResponse>> {
        public C5003t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends OperatorMapNestResponse> invoke(Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            LU5 lu5 = LU5.this;
            return lu5.m96845m0(lu5.f21530f.mo10896e(location)).m33146T(3L);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/OperatorMapNestResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/OperatorMapNestResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LU5$u */
    /* loaded from: classes3.dex */
    public static final class C5004u extends Lambda implements Function1<OperatorMapNestResponse, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LOU5;)LOU5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: LU5$u$a */
        /* loaded from: classes3.dex */
        public static final class C5005a extends Lambda implements Function1<OU5, OU5> {

            /* renamed from: g */
            public final /* synthetic */ OperatorMapNestResponse f21572g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5005a(OperatorMapNestResponse operatorMapNestResponse) {
                super(1);
                this.f21572g = operatorMapNestResponse;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final OU5 invoke(OU5 state) {
                OU5 m92190a;
                Intrinsics.checkNotNullParameter(state, "state");
                m92190a = state.m92190a((r30 & 1) != 0 ? state.f26647a : 0, (r30 & 2) != 0 ? state.f26648b : this.f21572g.getAreas(), (r30 & 4) != 0 ? state.f26649c : this.f21572g.getNests(), (r30 & 8) != 0 ? state.f26650d : null, (r30 & 16) != 0 ? state.f26651e : null, (r30 & 32) != 0 ? state.f26652f : 0.0d, (r30 & 64) != 0 ? state.f26653g : null, (r30 & 128) != 0 ? state.f26654h : null, (r30 & 256) != 0 ? state.f26655i : null, (r30 & 512) != 0 ? state.f26656j : null, (r30 & 1024) != 0 ? state.f26657k : null, (r30 & 2048) != 0 ? state.f26658l : null, (r30 & 4096) != 0 ? state.f26659m : null);
                return m92190a;
            }
        }

        public C5004u() {
            super(1);
        }

        /* renamed from: a */
        public final void m96804a(OperatorMapNestResponse operatorMapNestResponse) {
            LU5.this.f21536l.accept(operatorMapNestResponse);
            LU5.this.m42279i(new C5005a(operatorMapNestResponse));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OperatorMapNestResponse operatorMapNestResponse) {
            m96804a(operatorMapNestResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LU5$v */
    /* loaded from: classes3.dex */
    public static final class C5006v extends Lambda implements Function1<Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LOU5;)LOU5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nSuggestNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestPresenter.kt\nco/bird/android/feature/suggestanest/SuggestNestPresenter$consume$6$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"})
        /* renamed from: LU5$v$a */
        /* loaded from: classes3.dex */
        public static final class C5007a extends Lambda implements Function1<OU5, OU5> {

            /* renamed from: g */
            public final /* synthetic */ Throwable f21574g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5007a(Throwable th) {
                super(1);
                this.f21574g = th;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final OU5 invoke(OU5 state) {
                OU5 m92190a;
                Intrinsics.checkNotNullParameter(state, "state");
                m92190a = state.m92190a((r30 & 1) != 0 ? state.f26647a : 0, (r30 & 2) != 0 ? state.f26648b : null, (r30 & 4) != 0 ? state.f26649c : null, (r30 & 8) != 0 ? state.f26650d : null, (r30 & 16) != 0 ? state.f26651e : null, (r30 & 32) != 0 ? state.f26652f : 0.0d, (r30 & 64) != 0 ? state.f26653g : null, (r30 & 128) != 0 ? state.f26654h : null, (r30 & 256) != 0 ? state.f26655i : null, (r30 & 512) != 0 ? state.f26656j : null, (r30 & 1024) != 0 ? state.f26657k : null, (r30 & 2048) != 0 ? state.f26658l : null, (r30 & 4096) != 0 ? state.f26659m : null);
                m92190a.m92173r(this.f21574g);
                return m92190a;
            }
        }

        public C5006v() {
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
            LU5.this.m42279i(new C5007a(th));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "location", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LU5$w */
    /* loaded from: classes3.dex */
    public static final class C5008w extends Lambda implements Function1<Location, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LOU5;)LOU5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: LU5$w$a */
        /* loaded from: classes3.dex */
        public static final class C5009a extends Lambda implements Function1<OU5, OU5> {

            /* renamed from: g */
            public final /* synthetic */ Location f21576g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5009a(Location location) {
                super(1);
                this.f21576g = location;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final OU5 invoke(OU5 state) {
                OU5 m92190a;
                Intrinsics.checkNotNullParameter(state, "state");
                m92190a = state.m92190a((r30 & 1) != 0 ? state.f26647a : 0, (r30 & 2) != 0 ? state.f26648b : null, (r30 & 4) != 0 ? state.f26649c : null, (r30 & 8) != 0 ? state.f26650d : this.f21576g, (r30 & 16) != 0 ? state.f26651e : null, (r30 & 32) != 0 ? state.f26652f : 0.0d, (r30 & 64) != 0 ? state.f26653g : null, (r30 & 128) != 0 ? state.f26654h : null, (r30 & 256) != 0 ? state.f26655i : null, (r30 & 512) != 0 ? state.f26656j : null, (r30 & 1024) != 0 ? state.f26657k : null, (r30 & 2048) != 0 ? state.f26658l : null, (r30 & 4096) != 0 ? state.f26659m : null);
                return m92190a;
            }
        }

        public C5008w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Location location) {
            invoke2(location);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Location location) {
            LU5.this.m42279i(new C5009a(location));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "heading", "", C17296a.f69688o, "(Ljava/lang/Float;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LU5$x */
    /* loaded from: classes3.dex */
    public static final class C5010x extends Lambda implements Function1<Float, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LOU5;)LOU5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: LU5$x$a */
        /* loaded from: classes3.dex */
        public static final class C5011a extends Lambda implements Function1<OU5, OU5> {

            /* renamed from: g */
            public final /* synthetic */ Float f21578g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5011a(Float f) {
                super(1);
                this.f21578g = f;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final OU5 invoke(OU5 state) {
                OU5 m92190a;
                Intrinsics.checkNotNullParameter(state, "state");
                m92190a = state.m92190a((r30 & 1) != 0 ? state.f26647a : 0, (r30 & 2) != 0 ? state.f26648b : null, (r30 & 4) != 0 ? state.f26649c : null, (r30 & 8) != 0 ? state.f26650d : null, (r30 & 16) != 0 ? state.f26651e : this.f21578g, (r30 & 32) != 0 ? state.f26652f : 0.0d, (r30 & 64) != 0 ? state.f26653g : null, (r30 & 128) != 0 ? state.f26654h : null, (r30 & 256) != 0 ? state.f26655i : null, (r30 & 512) != 0 ? state.f26656j : null, (r30 & 1024) != 0 ? state.f26657k : null, (r30 & 2048) != 0 ? state.f26658l : null, (r30 & 4096) != 0 ? state.f26659m : null);
                return m92190a;
            }
        }

        public C5010x() {
            super(1);
        }

        /* renamed from: a */
        public final void m96800a(Float f) {
            LU5.this.m42279i(new C5011a(f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Float f) {
            m96800a(f);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lcom/google/android/gms/maps/model/LatLng;", "pinLocation", "Landroid/location/Location;", "userLocation", "Lco/bird/api/response/OperatorMapNestResponse;", "response", "Lkotlin/Triple;", C17296a.f69688o, "(Lcom/google/android/gms/maps/model/LatLng;Landroid/location/Location;Lco/bird/api/response/OperatorMapNestResponse;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LU5$y */
    /* loaded from: classes3.dex */
    public static final class C5012y extends Lambda implements Function3<LatLng, Location, OperatorMapNestResponse, Triple<? extends LatLng, ? extends Location, ? extends OperatorMapNestResponse>> {

        /* renamed from: g */
        public static final C5012y f21579g = new C5012y();

        public C5012y() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final Triple<LatLng, Location, OperatorMapNestResponse> invoke(LatLng pinLocation, Location userLocation, OperatorMapNestResponse response) {
            Intrinsics.checkNotNullParameter(pinLocation, "pinLocation");
            Intrinsics.checkNotNullParameter(userLocation, "userLocation");
            Intrinsics.checkNotNullParameter(response, "response");
            return new Triple<>(pinLocation, userLocation, response);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LU5$z */
    /* loaded from: classes3.dex */
    public static final class C5013z extends Lambda implements Function1<InterfaceC23465c, Unit> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "LOU5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LOU5;)LOU5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: LU5$z$a */
        /* loaded from: classes3.dex */
        public static final class C5014a extends Lambda implements Function1<OU5, OU5> {

            /* renamed from: g */
            public static final C5014a f21581g = new C5014a();

            public C5014a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final OU5 invoke(OU5 state) {
                OU5 m92190a;
                Intrinsics.checkNotNullParameter(state, "state");
                m92190a = state.m92190a((r30 & 1) != 0 ? state.f26647a : state.m92178m() + 1, (r30 & 2) != 0 ? state.f26648b : null, (r30 & 4) != 0 ? state.f26649c : null, (r30 & 8) != 0 ? state.f26650d : null, (r30 & 16) != 0 ? state.f26651e : null, (r30 & 32) != 0 ? state.f26652f : 0.0d, (r30 & 64) != 0 ? state.f26653g : null, (r30 & 128) != 0 ? state.f26654h : null, (r30 & 256) != 0 ? state.f26655i : null, (r30 & 512) != 0 ? state.f26656j : null, (r30 & 1024) != 0 ? state.f26657k : null, (r30 & 2048) != 0 ? state.f26658l : null, (r30 & 4096) != 0 ? state.f26659m : null);
                return m92190a;
            }
        }

        public C5013z() {
            super(1);
        }

        /* renamed from: a */
        public final void m96797a(InterfaceC23465c interfaceC23465c) {
            LU5.this.m42279i(C5014a.f21581g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m96797a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LU5(InterfaceC40001dr4 locationManager, InterfaceC48430s43 nestManager, InterfaceC32950Fs5 sensorManager, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator, PhotoBannerViewModel photoBannerViewModel) {
        super(new OU5(0, null, null, null, null, 0.0d, null, null, null, null, null, null, null, 8191, null));
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(nestManager, "nestManager");
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(photoBannerViewModel, "photoBannerViewModel");
        this.f21529e = locationManager;
        this.f21530f = nestManager;
        this.f21531g = sensorManager;
        this.f21532h = reactiveConfig;
        this.f21533i = navigator;
        this.f21534j = photoBannerViewModel;
        Observable<Location> m32084i = locationManager.mo43619m(true).replay(1).m32084i();
        Intrinsics.checkNotNullExpressionValue(m32084i, "locationManager.frequent…replay(1)\n    .refCount()");
        this.f21535k = m32084i;
        C45168ma4<OperatorMapNestResponse> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<OperatorMapNestResponse>()");
        this.f21536l = m25409g;
        C45168ma4<Optional<String>> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Optional<String>>()");
        this.f21537m = m25409g2;
    }

    /* renamed from: N */
    public static final EnumC31934Bj6 m96871N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (EnumC31934Bj6) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final Unit m96869P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final Location m96868Q(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Location) tmp0.invoke(obj, obj2);
    }

    /* renamed from: R */
    public static final LatLng m96867R(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (LatLng) tmp0.invoke(obj, obj2);
    }

    /* renamed from: S */
    public static final InterfaceC23447K m96866S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m96865T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m96864U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m96863V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m96862W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m96861X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m96860Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final Optional m96859Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final C35631Re4 m96858a0(Function5 tmp0, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C35631Re4) tmp0.invoke(obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: b0 */
    public static final void m96857b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final InterfaceC23447K m96856c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m96855d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m96854e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final InterfaceC23447K m96853f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m96852g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m96851h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m96850i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final void m96849j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final Triple m96848k0(Function3 tmp0, Object obj, Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Triple) tmp0.invoke(obj, obj2, obj3);
    }

    /* renamed from: l0 */
    public static final void m96847l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m96843n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final void m96841o0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj, obj2);
    }

    /* renamed from: M */
    public final AbstractC24490k<EnumC31934Bj6> m96872M(Observable<Triple<LatLng, Location, OperatorMapNestResponse>> observable) {
        AbstractC24490k<Triple<LatLng, Location, OperatorMapNestResponse>> m32111s0 = observable.toFlowable(EnumC23460b.LATEST).m32100w0(1L, null, EnumC23450a.DROP_OLDEST).m32111s0(C24542a.m31934a());
        final C4974a c4974a = new C4974a();
        AbstractC24490k m32117q0 = m32111s0.m32117q0(new InterfaceC23492o() { // from class: CU5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                EnumC31934Bj6 m96871N;
                m96871N = LU5.m96871N(Function1.this, obj);
                return m96871N;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32117q0, "private fun Observable<T…LID\n        }\n      }\n  }");
        return m32117q0;
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: O */
    public void consume(NU5 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Observable<Unit> myLocationClicks = renderer.myLocationClicks();
        Observable<Location> m33123k0 = this.f21535k.firstOrError().m33123k0();
        final C4992l c4992l = C4992l.f21559g;
        Observable merge = Observable.merge(myLocationClicks, m33123k0.map(new InterfaceC23492o() { // from class: DU5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit m96869P;
                m96869P = LU5.m96869P(Function1.this, obj);
                return m96869P;
            }
        }));
        Observable<Location> observable = this.f21535k;
        final C5000r c5000r = C5000r.f21567g;
        Observable withLatestFrom = merge.withLatestFrom(observable, new InterfaceC23480c() { // from class: pU5
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Location m96868Q;
                m96868Q = LU5.m96868Q(Function2.this, obj, obj2);
                return m96868Q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(withLatestFrom, "merge(\n      renderer.my…_, location -> location }");
        Object m33094as = withLatestFrom.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5001s c5001s = new C5001s();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: tU5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LU5.m96857b0(Function1.this, obj);
            }
        });
        AbstractC23442F<Location> firstOrError = this.f21535k.firstOrError();
        final C5003t c5003t = new C5003t();
        AbstractC23442F<R> m33165A = firstOrError.m33165A(new InterfaceC23492o() { // from class: uU5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m96853f0;
                m96853f0 = LU5.m96853f0(Function1.this, obj);
                return m96853f0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun consume(ren…e }\n        }\n      }\n  }");
        Object m33135e = m33165A.m33135e(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5004u c5004u = new C5004u();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: vU5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LU5.m96852g0(Function1.this, obj);
            }
        };
        final C5006v c5006v = new C5006v();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: xU5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LU5.m96851h0(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f21535k.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5008w c5008w = new C5008w();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: yU5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LU5.m96850i0(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f21531g.mo103275a().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5010x c5010x = new C5010x();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: zU5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LU5.m96849j0(Function1.this, obj);
            }
        });
        Observable<LatLng> mo56644C2 = renderer.mo56644C2();
        Observable<Location> observable2 = this.f21535k;
        C45168ma4<OperatorMapNestResponse> c45168ma4 = this.f21536l;
        final C5012y c5012y = C5012y.f21579g;
        Observable<Triple<LatLng, Location, OperatorMapNestResponse>> combineLatest = Observable.combineLatest(mo56644C2, observable2, c45168ma4, new InterfaceC23485h() { // from class: AU5
            @Override // io.reactivex.functions.InterfaceC23485h
            public final Object apply(Object obj, Object obj2, Object obj3) {
                Triple m96848k0;
                m96848k0 = LU5.m96848k0(Function3.this, obj, obj2, obj3);
                return m96848k0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(\n      ren…userLocation, response) }");
        Object m32150f = m96872M(combineLatest).m32150f(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4975b c4975b = new C4975b();
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: BU5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LU5.m96847l0(Function1.this, obj);
            }
        });
        m42279i(new C4977c());
        Observable<Unit> mo56639F8 = renderer.mo56639F8();
        Observable<LatLng> mo56644C22 = renderer.mo56644C2();
        final C4978d c4978d = C4978d.f21544g;
        Observable<R> withLatestFrom2 = mo56639F8.withLatestFrom(mo56644C22, new InterfaceC23480c() { // from class: EU5
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                LatLng m96867R;
                m96867R = LU5.m96867R(Function2.this, obj, obj2);
                return m96867R;
            }
        });
        final C4979e c4979e = new C4979e();
        Observable flatMapSingle = withLatestFrom2.flatMapSingle(new InterfaceC23492o() { // from class: FU5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m96866S;
                m96866S = LU5.m96866S(Function1.this, obj);
                return m96866S;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun consume(ren…e }\n        }\n      }\n  }");
        Object m33094as4 = flatMapSingle.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4981f c4981f = new C4981f();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: GU5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LU5.m96865T(Function1.this, obj);
            }
        });
        Object m33094as5 = renderer.mo56608b7().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4983g c4983g = new C4983g();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: HU5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LU5.m96864U(Function1.this, obj);
            }
        });
        Object m33094as6 = renderer.mo56618W0().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4985h c4985h = new C4985h();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: IU5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LU5.m96863V(Function1.this, obj);
            }
        });
        Object m33094as7 = renderer.mo56577z().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4987i c4987i = new C4987i();
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: JU5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LU5.m96862W(Function1.this, obj);
            }
        });
        Object m33094as8 = renderer.mo56601h4().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4989j c4989j = new C4989j();
        ((ObservableSubscribeProxy) m33094as8).subscribe(new InterfaceC23484g() { // from class: KU5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LU5.m96861X(Function1.this, obj);
            }
        });
        Object m33094as9 = renderer.mo56606f().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as9, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4991k c4991k = new C4991k();
        ((ObservableSubscribeProxy) m33094as9).subscribe(new InterfaceC23484g() { // from class: mU5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LU5.m96860Y(Function1.this, obj);
            }
        });
        Observable<String> mo56617W4 = renderer.mo56617W4();
        final C4993m c4993m = C4993m.f21560b;
        Observable merge2 = Observable.merge(mo56617W4.map(new InterfaceC23492o() { // from class: nU5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m96859Z;
                m96859Z = LU5.m96859Z(Function1.this, obj);
                return m96859Z;
            }
        }), this.f21537m);
        Observable<LatLng> mo56644C23 = renderer.mo56644C2();
        Observable<Optional<String>> mo56618W0 = renderer.mo56618W0();
        Optional.C14443a c14443a = Optional.f63040c;
        Observable<Optional<String>> startWith = mo56618W0.startWith((Observable<Optional<String>>) c14443a.m59034a());
        Observable<Optional<String>> startWith2 = renderer.mo56577z().startWith((Observable<Optional<String>>) c14443a.m59034a());
        Observable<Integer> startWith3 = renderer.mo56601h4().startWith((Observable<Integer>) 1);
        final C4994n c4994n = C4994n.f21561g;
        Observable withLatestFrom3 = merge2.withLatestFrom(mo56644C23, startWith, startWith2, startWith3, new InterfaceC23487j() { // from class: oU5
            @Override // io.reactivex.functions.InterfaceC23487j
            public final Object apply(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                C35631Re4 m96858a0;
                m96858a0 = LU5.m96858a0(Function5.this, obj, obj2, obj3, obj4, obj5);
                return m96858a0;
            }
        });
        final C4995o c4995o = new C4995o();
        Observable flatMapSingle2 = withLatestFrom3.flatMapSingle(new InterfaceC23492o() { // from class: qU5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m96856c0;
                m96856c0 = LU5.m96856c0(Function1.this, obj);
                return m96856c0;
            }
        });
        final C4996p c4996p = new C4996p();
        Observable retry = flatMapSingle2.doOnError(new InterfaceC23484g() { // from class: rU5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LU5.m96855d0(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun consume(ren…e }\n        }\n      }\n  }");
        Object m33094as10 = retry.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as10, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4998q c4998q = new C4998q();
        ((ObservableSubscribeProxy) m33094as10).subscribe(new InterfaceC23484g() { // from class: sU5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LU5.m96854e0(Function1.this, obj);
            }
        });
    }

    /* renamed from: m0 */
    public final <T> AbstractC23442F<T> m96845m0(AbstractC23442F<T> abstractC23442F) {
        final C5013z c5013z = new C5013z();
        AbstractC23442F<T> m33102v = abstractC23442F.m33102v(new InterfaceC23484g() { // from class: lU5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LU5.m96843n0(Function1.this, obj);
            }
        });
        final C4972A c4972a = new C4972A();
        AbstractC23442F<T> m33104u = m33102v.m33104u(new InterfaceC23479b() { // from class: wU5
            @Override // io.reactivex.functions.InterfaceC23479b
            public final void accept(Object obj, Object obj2) {
                LU5.m96841o0(Function2.this, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33104u, "private fun <T> Single<T…ogress - 1) }\n      }\n  }");
        return m33104u;
    }
}
