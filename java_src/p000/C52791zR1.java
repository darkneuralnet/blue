package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.feature.servicecenter.idtools.identify.IdAction;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.IdToolOption;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePart;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C45672nQ5;
import p000.C52791zR1;
import p000.FQ5;
import p000.GR1;
import p000.H31;
@Metadata(m28433d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0081\u0001\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b?\u0010@J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J+\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0017\u001a\u00020\u00062\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00040\u0013H\u0002J(\u0010\u001b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00040\u00130\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!¨\u0006A"}, m28432d2 = {"LzR1;", "LhB;", "Lco/bird/android/model/IdToolOption;", "option", "", "showStepOne", "", "f", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/wire/WirePart;", "part", "b", DateTokenConverter.CONVERTER_KEY, "", "Lco/bird/android/model/constant/PartKind;", "kinds", "C0", "(Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/constant/PartKind;)V", "Lkotlin/Pair;", "", "LH6;", "pair", "J0", "", "e", "Lio/reactivex/F;", "H0", "LtQ1;", "t", "LtQ1;", "statusConverter", "u", "Lco/bird/android/model/IdToolOption;", "idToolOption", "LnS1;", "idToolsManager", "Lom3;", "operatorManager", "LpJ;", "bluetoothManager", "LSM;", "birdPartManager", "LZF;", "beaconConfigurationManager", "LEa;", "analyticsManager", "LDQ3;", "permissionManager", "LTk0;", "clipboardManager", "LaM;", "birdManager", "LTo0;", "commandManager", "Le13;", "navigator", "LGR1;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "", "sessionId", "<init>", "(LnS1;Lom3;LpJ;LSM;LZF;LEa;LDQ3;LTk0;LaM;LTo0;Le13;LGR1;Lcom/uber/autodispose/ScopeProvider;Ljava/lang/String;LtQ1;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdToolsIdentifyDissociatePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsIdentifyDissociatePresenter.kt\nco/bird/android/feature/servicecenter/idtools/identify/dissociate/IdToolsIdentifyDissociatePresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,163:1\n180#2:164\n199#2:177\n11335#3:165\n11670#3,3:166\n3792#3:169\n4307#3:170\n4308#3:174\n1747#4,3:171\n37#5,2:175\n9#6,4:178\n*S KotlinDebug\n*F\n+ 1 IdToolsIdentifyDissociatePresenter.kt\nco/bird/android/feature/servicecenter/idtools/identify/dissociate/IdToolsIdentifyDissociatePresenter\n*L\n95#1:164\n144#1:177\n110#1:165\n110#1:166,3\n130#1:169\n130#1:170\n130#1:174\n131#1:171,3\n134#1:175,2\n159#1:178,4\n*E\n"})
/* renamed from: zR1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52791zR1 extends AbstractC22565hB {

    /* renamed from: t */
    public final InterfaceC49225tQ1 f121359t;

    /* renamed from: u */
    public IdToolOption f121360u;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/IdToolOption;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zR1$a */
    /* loaded from: classes3.dex */
    public static final class C31000a extends Lambda implements Function1<Unit, InterfaceC23434B<? extends Pair<? extends WireBird, ? extends IdToolOption>>> {
        public C31000a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Pair<WireBird, IdToolOption>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            WireBird m36751K = C52791zR1.this.m36751K();
            IdToolOption m36743S = C52791zR1.this.m36743S();
            if (m36751K != null) {
                return Observable.just(TuplesKt.m28425to(m36751K, m36743S));
            }
            return Observable.empty();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00000\u0000 \u0007*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/IdToolOption;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "", "Lco/bird/android/model/constant/PartKind;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zR1$b */
    /* loaded from: classes3.dex */
    public static final class C31001b extends Lambda implements Function1<Pair<? extends WireBird, ? extends IdToolOption>, InterfaceC24574u<? extends Pair<? extends WireBird, ? extends PartKind[]>>> {

        /* renamed from: g */
        public final /* synthetic */ GR1 f121362g;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: zR1$b$a */
        /* loaded from: classes3.dex */
        public static final class C31002a extends Lambda implements Function1<DialogResponse, Boolean> {

            /* renamed from: g */
            public static final C31002a f121363g = new C31002a();

            public C31002a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(DialogResponse response) {
                boolean z;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response == DialogResponse.OK) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a.\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "", "Lco/bird/android/model/constant/PartKind;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: zR1$b$b */
        /* loaded from: classes3.dex */
        public static final class C31003b extends Lambda implements Function1<DialogResponse, Pair<? extends WireBird, ? extends PartKind[]>> {

            /* renamed from: g */
            public final /* synthetic */ WireBird f121364g;

            /* renamed from: h */
            public final /* synthetic */ IdToolOption f121365h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C31003b(WireBird wireBird, IdToolOption idToolOption) {
                super(1);
                this.f121364g = wireBird;
                this.f121365h = idToolOption;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<WireBird, PartKind[]> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f121364g, this.f121365h.getCorrespondingPartKinds());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31001b(GR1 gr1) {
            super(1);
            this.f121362g = gr1;
        }

        /* renamed from: d */
        public static final Pair m1355d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends Pair<WireBird, PartKind[]>> invoke(Pair<WireBird, ? extends IdToolOption> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            IdToolOption component2 = pair.component2();
            AbstractC23442F dialog$default = H31.C3014a.dialog$default(this.f121362g, new F51(component2), false, false, 6, null);
            final C31002a c31002a = C31002a.f121363g;
            AbstractC24507p m33098z = dialog$default.m33098z(new InterfaceC23494q() { // from class: AR1
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = C52791zR1.C31001b.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C31003b c31003b = new C31003b(pair.component1(), component2);
            return m33098z.m32067H(new InterfaceC23492o() { // from class: BR1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair m1355d;
                    m1355d = C52791zR1.C31001b.m1355d(Function1.this, obj);
                    return m1355d;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "", "Lco/bird/android/model/constant/PartKind;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zR1$c */
    /* loaded from: classes3.dex */
    public static final class C31004c extends Lambda implements Function1<Pair<? extends WireBird, ? extends PartKind[]>, Unit> {
        public C31004c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireBird, ? extends PartKind[]> pair) {
            invoke2((Pair<WireBird, PartKind[]>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireBird, PartKind[]> pair) {
            PartKind[] component2 = pair.component2();
            C52791zR1.this.m1380C0(pair.component1(), (PartKind[]) Arrays.copyOf(component2, component2.length));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "detachedKinds", "", "Lco/bird/android/model/constant/PartKind;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nIdToolsIdentifyDissociatePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsIdentifyDissociatePresenter.kt\nco/bird/android/feature/servicecenter/idtools/identify/dissociate/IdToolsIdentifyDissociatePresenter$detachParts$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
    /* renamed from: zR1$e */
    /* loaded from: classes3.dex */
    public static final class C31007e extends Lambda implements Function1<List<? extends PartKind>, Unit> {

        /* renamed from: g */
        public static final C31007e f121374g = new C31007e();

        public C31007e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends PartKind> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends PartKind> detachedKinds) {
            Intrinsics.checkNotNullExpressionValue(detachedKinds, "detachedKinds");
            if (!(!detachedKinds.isEmpty())) {
                throw new IllegalArgumentException("No matching Parts associated with vehicle to be dissociated".toString());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001ar\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004 \u0007*8\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "Lco/bird/android/model/constant/PartKind;", "it", "Lio/reactivex/K;", "Lkotlin/Pair;", "LH6;", "", "kotlin.jvm.PlatformType", "b", "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zR1$f */
    /* loaded from: classes3.dex */
    public static final class C31008f extends Lambda implements Function1<List<? extends PartKind>, InterfaceC23447K<? extends Pair<? extends List<? extends C3023H6>, ? extends Boolean>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "LH6;", "sections", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: zR1$f$a */
        /* loaded from: classes3.dex */
        public static final class C31009a extends Lambda implements Function1<List<? extends C3023H6>, Pair<? extends List<? extends C3023H6>, ? extends Boolean>> {

            /* renamed from: g */
            public static final C31009a f121376g = new C31009a();

            public C31009a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<List<C3023H6>, Boolean> invoke(List<C3023H6> sections) {
                Intrinsics.checkNotNullParameter(sections, "sections");
                return TuplesKt.m28425to(sections, Boolean.TRUE);
            }
        }

        public C31008f() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<List<C3023H6>, Boolean>> invoke(List<? extends PartKind> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F<List<C3023H6>> mo6859c = C52791zR1.this.f121359t.mo6859c(C52791zR1.this.m36743S());
            final C31009a c31009a = C31009a.f121376g;
            return mo6859c.m33157I(new InterfaceC23492o() { // from class: DR1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C52791zR1.C31008f.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zR1$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C31010g extends FunctionReferenceImpl implements Function1<Throwable, AbstractC23442F<Pair<? extends List<? extends C3023H6>, ? extends Boolean>>> {
        public C31010g(Object obj) {
            super(1, obj, C52791zR1.class, "onError", "onError(Ljava/lang/Throwable;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<Pair<List<C3023H6>, Boolean>> invoke(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((C52791zR1) this.receiver).m1374H0(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zR1$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C31011h extends FunctionReferenceImpl implements Function1<Pair<? extends List<? extends C3023H6>, ? extends Boolean>, Unit> {
        public C31011h(Object obj) {
            super(1, obj, C52791zR1.class, "onSuccess", "onSuccess(Lkotlin/Pair;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends C3023H6>, ? extends Boolean> pair) {
            invoke2((Pair<? extends List<C3023H6>, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<C3023H6>, Boolean> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C52791zR1) this.receiver).m1372J0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "LH6;", "sections", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zR1$i */
    /* loaded from: classes3.dex */
    public static final class C31012i extends Lambda implements Function1<List<? extends C3023H6>, Pair<? extends List<? extends C3023H6>, ? extends Boolean>> {

        /* renamed from: g */
        public static final C31012i f121377g = new C31012i();

        public C31012i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<List<C3023H6>, Boolean> invoke(List<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            return TuplesKt.m28425to(sections, Boolean.FALSE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52791zR1(InterfaceC45686nS1 idToolsManager, InterfaceC46473om3 operatorManager, InterfaceC27246pJ bluetoothManager, InterfaceC7381SM birdPartManager, InterfaceC10163ZF beaconConfigurationManager, InterfaceC1880Ea analyticsManager, DQ3 permissionManager, InterfaceC36149Tk0 clipboardManager, InterfaceC10636aM birdManager, InterfaceC36185To0 commandManager, InterfaceC40099e13 navigator, GR1 ui, ScopeProvider scopeProvider, String sessionId, InterfaceC49225tQ1 statusConverter) {
        super(idToolsManager, operatorManager, bluetoothManager, birdPartManager, beaconConfigurationManager, analyticsManager, permissionManager, clipboardManager, birdManager, commandManager, navigator, ui, scopeProvider, sessionId);
        Intrinsics.checkNotNullParameter(idToolsManager, "idToolsManager");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(birdPartManager, "birdPartManager");
        Intrinsics.checkNotNullParameter(beaconConfigurationManager, "beaconConfigurationManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(clipboardManager, "clipboardManager");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(commandManager, "commandManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(statusConverter, "statusConverter");
        this.f121359t = statusConverter;
        Observable<Unit> mo103874f = ui.mo103874f();
        final C31000a c31000a = new C31000a();
        Observable<R> flatMap = mo103874f.flatMap(new InterfaceC23492o() { // from class: vR1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m1359z0;
                m1359z0 = C52791zR1.m1359z0(Function1.this, obj);
                return m1359z0;
            }
        });
        final C31001b c31001b = new C31001b(ui);
        Observable flatMapMaybe = flatMap.flatMapMaybe(new InterfaceC23492o() { // from class: wR1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m1382A0;
                m1382A0 = C52791zR1.m1382A0(Function1.this, obj);
                return m1382A0;
            }
        });
        final C31004c c31004c = new C31004c();
        Observable doAfterNext = flatMapMaybe.doAfterNext(new InterfaceC23484g() { // from class: xR1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52791zR1.m1381B0(Function1.this, obj);
            }
        });
        final C31005d c31005d = new C31005d(ui, this, navigator);
        Observable observeOn = doAfterNext.flatMap(new InterfaceC23492o() { // from class: yR1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m1379D;
                m1379D = C52791zR1.m1379D(Function1.this, obj);
                return m1379D;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.confirmClicks()\n     …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
    }

    /* renamed from: A0 */
    public static final InterfaceC24574u m1382A0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: B0 */
    public static final void m1381B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final InterfaceC23434B m1379D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: D0 */
    public static final void m1378D0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E0 */
    public static final void m1377E0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F0 */
    public static final InterfaceC23447K m1376F0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: G0 */
    public static final InterfaceC23447K m1375G0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: I0 */
    public static final Pair m1373I0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: z0 */
    public static final InterfaceC23434B m1359z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: C0 */
    public final void m1380C0(WireBird wireBird, PartKind... partKindArr) {
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        for (PartKind partKind : partKindArr) {
            List<WirePart> m36750L = m36750L();
            if (!(m36750L instanceof Collection) || !m36750L.isEmpty()) {
                for (WirePart wirePart : m36750L) {
                    z = true;
                    if (wirePart.getKind() == partKind) {
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
            z = false;
            if (z) {
                arrayList.add(partKind);
            }
        }
        InterfaceC45686nS1 m36747O = m36747O();
        PartKind[] partKindArr2 = (PartKind[]) arrayList.toArray(new PartKind[0]);
        AbstractC23442F<List<PartKind>> mo6821b = m36747O.mo6821b(wireBird, (PartKind[]) Arrays.copyOf(partKindArr2, partKindArr2.length), m36740V());
        S74 mo12605oc = m36739W().mo12605oc();
        if (mo12605oc == null) {
            mo12605oc = m36739W();
        }
        AbstractC23442F progress$default = C28237sD.progress$default(mo6821b, mo12605oc, 0, 2, (Object) null);
        final C31007e c31007e = C31007e.f121374g;
        AbstractC23442F m33101w = progress$default.m33101w(new InterfaceC23484g() { // from class: rR1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52791zR1.m1377E0(Function1.this, obj);
            }
        });
        final C31008f c31008f = new C31008f();
        AbstractC23442F m33165A = m33101w.m33165A(new InterfaceC23492o() { // from class: sR1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m1376F0;
                m1376F0 = C52791zR1.m1376F0(Function1.this, obj);
                return m1376F0;
            }
        });
        final C31010g c31010g = new C31010g(this);
        AbstractC23442F m33152N = m33165A.m33150P(new InterfaceC23492o() { // from class: tR1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m1375G0;
                m1375G0 = C52791zR1.m1375G0(Function1.this, obj);
                return m1375G0;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "private fun detachParts(…ubscribe(::onSuccess)\n  }");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(m36741U()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C31011h c31011h = new C31011h(this);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: uR1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52791zR1.m1378D0(Function1.this, obj);
            }
        });
    }

    /* renamed from: H0 */
    public final AbstractC23442F<Pair<List<C3023H6>, Boolean>> m1374H0(Throwable th) {
        C41318g46.m40159e(th);
        String str = null;
        if (!(th instanceof HttpException)) {
            th = null;
        }
        HttpException httpException = (HttpException) th;
        if (httpException != null) {
            str = httpException.getMessage();
        }
        AbstractC23442F<List<C3023H6>> mo6860b = this.f121359t.mo6860b(m36743S(), str);
        final C31012i c31012i = C31012i.f121377g;
        AbstractC23442F m33157I = mo6860b.m33157I(new InterfaceC23492o() { // from class: qR1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m1373I0;
                m1373I0 = C52791zR1.m1373I0(Function1.this, obj);
                return m1373I0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "statusConverter.convertF…ns -> sections to false }");
        return m33157I;
    }

    /* renamed from: J0 */
    public final void m1372J0(Pair<? extends List<C3023H6>, Boolean> pair) {
        List<C3023H6> component1 = pair.component1();
        if (pair.component2().booleanValue()) {
            m36739W().mo12610b1(component1);
        } else {
            m36739W().mo12607g1(component1);
        }
    }

    @Override // p000.AbstractC22565hB, p000.FR1
    /* renamed from: b */
    public void mo1371b(WireBird bird, WirePart wirePart) {
        List list;
        PartKind kind;
        Intrinsics.checkNotNullParameter(bird, "bird");
        super.mo1371b(bird, wirePart);
        IdToolOption idToolOption = this.f121360u;
        if (idToolOption == null) {
            Intrinsics.throwUninitializedPropertyAccessException("idToolOption");
            idToolOption = null;
        }
        PartKind[] correspondingPartKinds = idToolOption.getCorrespondingPartKinds();
        ArrayList arrayList = new ArrayList(correspondingPartKinds.length);
        boolean z = false;
        for (PartKind partKind : correspondingPartKinds) {
            arrayList.add(partKind.name());
        }
        list = CollectionsKt___CollectionsKt.toList(arrayList);
        WirePart m36746P = m36746P();
        m36753I().mo55905y(new HS1(null, bird.getId(), m36740V(), null, null, null, list, (m36746P == null || (kind = m36746P.getKind()) == null || (r2 = kind.name()) == null) ? "REPAIRS" : "REPAIRS", EnumC52782zQ1.DISSOCIATE.name(), 57, null));
        GR1 m36739W = m36739W();
        if (m36751K() != null && m36746P() != null) {
            z = true;
        }
        m36739W.mo103877b2(z);
    }

    @Override // p000.FR1
    /* renamed from: d */
    public void mo1370d(WirePart part) {
        Intrinsics.checkNotNullParameter(part, "part");
    }

    @Override // p000.AbstractC22565hB, p000.FR1
    /* renamed from: f */
    public void mo1369f(IdToolOption option, boolean z) {
        Intrinsics.checkNotNullParameter(option, "option");
        super.mo1369f(option, z);
        this.f121360u = option;
        GR1.C2848a.setStepTwoDescription$default(m36739W(), IdAction.DISSOCIATE, option, null, null, 12, null);
        m36739W().mo103894Db(option);
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "", "Lco/bird/android/model/constant/PartKind;", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "LnQ5$b;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zR1$d */
    /* loaded from: classes3.dex */
    public static final class C31005d extends Lambda implements Function1<Pair<? extends WireBird, ? extends PartKind[]>, InterfaceC23434B<? extends C45672nQ5.EnumC26504b>> {

        /* renamed from: g */
        public final /* synthetic */ GR1 f121367g;

        /* renamed from: h */
        public final /* synthetic */ C52791zR1 f121368h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC40099e13 f121369i;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LnQ5$b;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LnQ5$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: zR1$d$a */
        /* loaded from: classes3.dex */
        public static final class C31006a extends Lambda implements Function1<C45672nQ5.EnumC26504b, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C52791zR1 f121370g;

            /* renamed from: h */
            public final /* synthetic */ WireBird f121371h;

            /* renamed from: i */
            public final /* synthetic */ PartKind[] f121372i;

            /* renamed from: j */
            public final /* synthetic */ InterfaceC40099e13 f121373j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C31006a(C52791zR1 c52791zR1, WireBird wireBird, PartKind[] partKindArr, InterfaceC40099e13 interfaceC40099e13) {
                super(1);
                this.f121370g = c52791zR1;
                this.f121371h = wireBird;
                this.f121372i = partKindArr;
                this.f121373j = interfaceC40099e13;
            }

            /* renamed from: a */
            public final void m1351a(C45672nQ5.EnumC26504b enumC26504b) {
                if (enumC26504b == C45672nQ5.EnumC26504b.TRY_AGAIN) {
                    C52791zR1 c52791zR1 = this.f121370g;
                    WireBird wireBird = this.f121371h;
                    PartKind[] partKindArr = this.f121372i;
                    c52791zR1.m1380C0(wireBird, (PartKind[]) Arrays.copyOf(partKindArr, partKindArr.length));
                    return;
                }
                this.f121373j.close();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C45672nQ5.EnumC26504b enumC26504b) {
                m1351a(enumC26504b);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31005d(GR1 gr1, C52791zR1 c52791zR1, InterfaceC40099e13 interfaceC40099e13) {
            super(1);
            this.f121367g = gr1;
            this.f121368h = c52791zR1;
            this.f121369i = interfaceC40099e13;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends C45672nQ5.EnumC26504b> invoke2(Pair<WireBird, PartKind[]> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Observable showStatusDialog$default = FQ5.C2274a.showStatusDialog$default(this.f121367g, null, 1, null);
            final C31006a c31006a = new C31006a(this.f121368h, pair.component1(), pair.component2(), this.f121369i);
            return showStatusDialog$default.doOnNext(new InterfaceC23484g() { // from class: CR1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C52791zR1.C31005d.invoke$lambda$0(Function1.this, obj);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends C45672nQ5.EnumC26504b> invoke(Pair<? extends WireBird, ? extends PartKind[]> pair) {
            return invoke2((Pair<WireBird, PartKind[]>) pair);
        }
    }
}
