package p000;

import android.view.MenuItem;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.IdToolOption;
import co.bird.android.model.OperatorRole;
import co.bird.android.model.RepairFlowStatus;
import co.bird.android.model.User;
import co.bird.android.model.UserKt;
import co.bird.android.model.UserRoleItemKt;
import co.bird.android.model.constant.InspectionContext;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.constant.RepairStep;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.constant.UserRole;
import co.bird.android.model.constant.VehicleInventoryAction;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.configs.Config;
import co.bird.api.error.RetrofitException;
import co.bird.api.response.OperatorAttributesResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.D03;
import p000.InterfaceC40099e13;
import p000.M03;
@Metadata(m28433d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u009f\u0001\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010G\u001a\u00020F\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010O\u001a\u00020N\u0012\u000e\b\u0001\u00105\u001a\b\u0012\u0004\u0012\u00020201\u0012\b\b\u0001\u0010;\u001a\u000206\u0012\b\b\u0001\u0010A\u001a\u00020<\u0012\b\b\u0001\u0010E\u001a\u00020B¢\u0006\u0004\bP\u0010QJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0017\u0010;\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010A\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006R"}, m28432d2 = {"LD03;", "LOB;", "", "F0", "", "itemId", "I0", C17296a.f69688o, "onResume", "Landroid/view/MenuItem;", "item", "", "b", "c", "checked", DateTokenConverter.CONVERTER_KEY, Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lgl;", "n", "Lgl;", "preference", "LTq4;", "o", "LTq4;", "reactiveConfig", "Lom3;", "p", "Lom3;", "operatorManager", "LEa;", "q", "LEa;", "analyticsManager", "LZ85;", "r", "LZ85;", "demandManager", "Lrn6;", "s", "Lrn6;", "vehicleServicingManager", "LAz6;", "t", "LAz6;", "webArchiveManager", "LO86;", "u", "LO86;", "transferOrderManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "v", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LM03;", "w", "LM03;", "H0", "()LM03;", "ui", "Le13;", "x", "Le13;", "G0", "()Le13;", "navigator", "LDQ3;", "y", "LDQ3;", "permissionManager", "LGI3;", "partnerManager", "LOh;", "appBuildConfig", "LaS2;", "merchantManager", "LRh6;", "userStream", "LOi;", "appContextStream", "<init>", "(Lgl;LTq4;LGI3;Lom3;LEa;LOh;LZ85;LaS2;Lrn6;LAz6;LO86;LRh6;LOi;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LM03;Le13;LDQ3;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavigationDrawerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawerPresenterImpl.kt\nco/bird/android/app/feature/operator/presenter/NavigationDrawerPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/Observables\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,586:1\n180#2:587\n180#2:588\n180#2:589\n180#2:590\n180#2:591\n180#2:592\n180#2:595\n180#2:598\n180#2:599\n180#2:600\n180#2:601\n180#2:602\n180#2:605\n180#2:606\n180#2:607\n180#2:608\n180#2:609\n180#2:610\n180#2:611\n180#2:612\n180#2:613\n180#2:614\n180#2:615\n180#2:616\n180#2:617\n180#2:618\n180#2:619\n180#2:620\n180#2:621\n180#2:622\n180#2:623\n180#2:624\n180#2:625\n180#2:626\n180#2:627\n180#2:628\n180#2:629\n237#2:630\n237#2:631\n237#2:632\n237#2:637\n199#2:638\n218#2:639\n199#2:640\n61#3,2:593\n71#3,2:596\n61#3,2:603\n1#4:633\n1747#5,3:634\n*S KotlinDebug\n*F\n+ 1 NavigationDrawerPresenterImpl.kt\nco/bird/android/app/feature/operator/presenter/NavigationDrawerPresenterImpl\n*L\n103#1:587\n111#1:588\n119#1:589\n125#1:590\n134#1:591\n140#1:592\n150#1:595\n164#1:598\n172#1:599\n178#1:600\n188#1:601\n196#1:602\n212#1:605\n220#1:606\n228#1:607\n236#1:608\n244#1:609\n250#1:610\n256#1:611\n262#1:612\n268#1:613\n273#1:614\n278#1:615\n283#1:616\n288#1:617\n293#1:618\n298#1:619\n306#1:620\n314#1:621\n319#1:622\n324#1:623\n329#1:624\n334#1:625\n342#1:626\n347#1:627\n351#1:628\n355#1:629\n360#1:630\n373#1:631\n381#1:632\n457#1:637\n483#1:638\n512#1:639\n536#1:640\n143#1:593,2\n156#1:596,2\n201#1:603,2\n454#1:634,3\n*E\n"})
/* renamed from: D03 */
/* loaded from: classes2.dex */
public final class D03 extends AbstractC5914OB {

    /* renamed from: n */
    public final C22454gl f5027n;

    /* renamed from: o */
    public final C36207Tq4 f5028o;

    /* renamed from: p */
    public final InterfaceC46473om3 f5029p;

    /* renamed from: q */
    public final InterfaceC1880Ea f5030q;

    /* renamed from: r */
    public final Z85 f5031r;

    /* renamed from: s */
    public final InterfaceC48265rn6 f5032s;

    /* renamed from: t */
    public final InterfaceC31844Az6 f5033t;

    /* renamed from: u */
    public final O86 f5034u;

    /* renamed from: v */
    public final LifecycleScopeProvider<EnumC7097RE> f5035v;

    /* renamed from: w */
    public final M03 f5036w;

    /* renamed from: x */
    public final InterfaceC40099e13 f5037x;

    /* renamed from: y */
    public final DQ3 f5038y;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$A */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1271A extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1271A(Object obj) {
            super(1, obj, M03.class, "showServiceCenterTransferOrder", "showServiceCenterTransferOrder(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84464ch(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$B */
    /* loaded from: classes2.dex */
    public static final class C1272B extends Lambda implements Function1<Pair<? extends Boolean, ? extends Integer>, Unit> {
        public C1272B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Integer> pair) {
            invoke2((Pair<Boolean, Integer>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Integer> pair) {
            boolean booleanValue = pair.component1().booleanValue();
            int intValue = pair.component2().intValue();
            D03.this.m111144H0().mo84474Wh(booleanValue);
            if (booleanValue) {
                D03.this.m111144H0().mo84457jh(intValue);
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$C */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1273C extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1273C(Object obj) {
            super(1, obj, M03.class, "showScrapOrder", "showScrapOrder(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84485O5(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$D */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1274D extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1274D(Object obj) {
            super(1, obj, M03.class, "showVehicleInventoryCheckIn", "showVehicleInventoryCheckIn(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84452ob(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$E */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1275E extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1275E(Object obj) {
            super(1, obj, M03.class, "showVehicleInventoryCheckOut", "showVehicleInventoryCheckOut(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84461fj(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$F */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1276F extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1276F(Object obj) {
            super(1, obj, M03.class, "showVehicleInventoryPickUp", "showVehicleInventoryPickUp(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84460fk(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$G */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1277G extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1277G(Object obj) {
            super(1, obj, M03.class, "showVehicleInventoryDropOff", "showVehicleInventoryDropOff(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84448wl(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "config", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$H */
    /* loaded from: classes2.dex */
    public static final class C1278H extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C1278H f5040g = new C1278H();

        public C1278H() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return Boolean.valueOf(config.getOperatorConfig().getFeatures().getReport().getEnabled());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$I */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1279I extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1279I(Object obj) {
            super(1, obj, M03.class, "showReport", "showReport(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84487Md(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$J */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1280J extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1280J(Object obj) {
            super(1, obj, M03.class, "showNestSuggestion", "showNestSuggestion(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84472X8(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$K */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1281K extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1281K(Object obj) {
            super(1, obj, M03.class, "showBulkServiceCenterStatus", "showBulkServiceCenterStatus(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84451qf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Landroid/view/MenuItem;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: D03$L */
    /* loaded from: classes2.dex */
    public static final class C1282L extends Lambda implements Function1<MenuItem, Unit> {
        public C1282L() {
            super(1);
        }

        /* renamed from: a */
        public final void m111051a(MenuItem it) {
            D03 d03 = D03.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            d03.mo71219b(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MenuItem menuItem) {
            m111051a(menuItem);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$M */
    /* loaded from: classes2.dex */
    public static final class C1283M extends Lambda implements Function1<Boolean, Unit> {
        public C1283M() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean it) {
            D03 d03 = D03.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            d03.mo71217d(it.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nNavigationDrawerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawerPresenterImpl.kt\nco/bird/android/app/feature/operator/presenter/NavigationDrawerPresenterImpl$onCreate$43\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,586:1\n1#2:587\n*E\n"})
    /* renamed from: D03$N */
    /* loaded from: classes2.dex */
    public static final class C1284N extends Lambda implements Function1<Throwable, Unit> {
        public C1284N() {
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
            Unit unit = null;
            RetrofitException retrofitException = th instanceof RetrofitException ? (RetrofitException) th : null;
            if (retrofitException != null) {
                D03.this.m111144H0().error(retrofitException);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                D03.this.m111144H0().errorGeneric();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "enabled", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$O */
    /* loaded from: classes2.dex */
    public static final class C1285O extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C1285O f5044g = new C1285O();

        public C1285O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean enabled) {
            Intrinsics.checkNotNullParameter(enabled, "enabled");
            return enabled;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: D03$P */
    /* loaded from: classes2.dex */
    public static final class C1286P extends Lambda implements Function1<Boolean, InterfaceC23496h> {
        public C1286P() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23496h invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return D03.this.f5034u.mo80290m0();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$Q */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1287Q extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C1287Q f5046b = new C1287Q();

        public C1287Q() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
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
    /* renamed from: D03$R */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1288R extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C1288R f5047b = new C1288R();

        public C1288R() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
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
    /* renamed from: D03$S */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1289S extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1289S(Object obj) {
            super(1, obj, M03.class, "showWhitelist", "showWhitelist(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84468Zh(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$T */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1290T extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1290T(Object obj) {
            super(1, obj, M03.class, "showHardCount", "showHardCount(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84480Sg(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$U */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1291U extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1291U(Object obj) {
            super(1, obj, M03.class, "showScrap", "showScrap(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84471Ya(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062N\u0010\u0005\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0004\u0012\u00020\u0004 \u0003*$\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lwb4;", "", "Lco/bird/api/response/OperatorAttributesResponse;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lwb4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNavigationDrawerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawerPresenterImpl.kt\nco/bird/android/app/feature/operator/presenter/NavigationDrawerPresenterImpl$onCreate$8\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,586:1\n1#2:587\n*E\n"})
    /* renamed from: D03$V */
    /* loaded from: classes2.dex */
    public static final class C1292V extends Lambda implements Function1<C51106wb4<? extends Boolean, ? extends Boolean, ? extends OperatorAttributesResponse, ? extends Integer>, Unit> {
        public C1292V() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
            if (r1 != false) goto L7;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m111050a(C51106wb4<Boolean, Boolean, OperatorAttributesResponse, Integer> c51106wb4) {
            boolean booleanValue = c51106wb4.m6614a().booleanValue();
            boolean booleanValue2 = c51106wb4.m6613b().booleanValue();
            OperatorAttributesResponse m6612c = c51106wb4.m6612c();
            int intValue = c51106wb4.m6611d().intValue();
            D03.this.m111144H0().mo84482Qf(booleanValue);
            if (booleanValue) {
                M03 m111144H0 = D03.this.m111144H0();
                Integer taskLimit = m6612c.getTaskLimit();
                if (taskLimit != null) {
                    taskLimit.intValue();
                }
                taskLimit = null;
                m111144H0.mo84479Ti(intValue, taskLimit);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C51106wb4<? extends Boolean, ? extends Boolean, ? extends OperatorAttributesResponse, ? extends Integer> c51106wb4) {
            m111050a(c51106wb4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nNavigationDrawerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawerPresenterImpl.kt\nco/bird/android/app/feature/operator/presenter/NavigationDrawerPresenterImpl$onNavigationItemSelected$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,586:1\n1#2:587\n*E\n"})
    /* renamed from: D03$W */
    /* loaded from: classes2.dex */
    public static final class C1293W extends Lambda implements Function1<Throwable, Unit> {
        public C1293W() {
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
            Unit unit = null;
            RetrofitException retrofitException = th instanceof RetrofitException ? (RetrofitException) th : null;
            if (retrofitException != null) {
                D03.this.m111144H0().error(retrofitException);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                D03.this.m111144H0().errorGeneric();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LFQ3;", "response", "Lio/reactivex/u;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LFQ3;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: D03$X */
    /* loaded from: classes2.dex */
    public static final class C1294X extends Lambda implements Function1<FQ3, InterfaceC24574u<? extends WireBird>> {
        public C1294X() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends WireBird> invoke(FQ3 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m107154a()) {
                return D03.this.m111144H0().mo84483Q7(ScanMode.ADMIN, ScanIntention.OPERATOR_ACTION, Integer.valueOf(C45871nl4.operator_scan_instruction_inspection), !D03.this.f5028o.m82623f8().m73665a().getOperatorConfig().getFeatures().getRepair().getRemoveManualEntryFromInspectionScanner()).m33125j0();
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/constant/RepairStep;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: D03$Y */
    /* loaded from: classes2.dex */
    public static final class C1295Y extends Lambda implements Function1<WireBird, InterfaceC23447K<? extends Pair<? extends WireBird, ? extends RepairStep>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/RepairFlowStatus;", "flow", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/constant/RepairStep;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RepairFlowStatus;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: D03$Y$a */
        /* loaded from: classes2.dex */
        public static final class C1296a extends Lambda implements Function1<RepairFlowStatus, Pair<? extends WireBird, ? extends RepairStep>> {

            /* renamed from: g */
            public final /* synthetic */ WireBird f5052g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1296a(WireBird wireBird) {
                super(1);
                this.f5052g = wireBird;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<WireBird, RepairStep> invoke(RepairFlowStatus flow) {
                Intrinsics.checkNotNullParameter(flow, "flow");
                return TuplesKt.m28425to(this.f5052g, flow.getFlow());
            }
        }

        public C1295Y() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<WireBird, RepairStep>> invoke(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            AbstractC23442F<RepairFlowStatus> mo13671a = D03.this.f5032s.mo13671a(bird.getId());
            final C1296a c1296a = new C1296a(bird);
            return mo13671a.m33157I(new InterfaceC23492o() { // from class: E03
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = D03.C1295Y.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/constant/RepairStep;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$Z */
    /* loaded from: classes2.dex */
    public static final class C1297Z extends Lambda implements Function1<Pair<? extends WireBird, ? extends RepairStep>, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: D03$Z$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C1298a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RepairStep.values().length];
                try {
                    iArr[RepairStep.INSPECTION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RepairStep.REPAIR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C1297Z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireBird, ? extends RepairStep> pair) {
            invoke2((Pair<WireBird, ? extends RepairStep>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireBird, ? extends RepairStep> pair) {
            WireBird component1 = pair.component1();
            int i = C1298a.$EnumSwitchMapping$0[pair.component2().ordinal()];
            if (i == 1) {
                D03.this.m111146G0().mo36909y4(component1.getId(), InspectionContext.SCANNER, 10035);
            } else if (i != 2) {
            } else {
                D03.this.m111146G0().mo36992l(component1.getId(), 10036);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: D03$a */
    /* loaded from: classes2.dex */
    public static final class C1299a extends Lambda implements Function1<FQ3, Unit> {

        /* renamed from: g */
        public final /* synthetic */ int f5054g;

        /* renamed from: h */
        public final /* synthetic */ D03 f5055h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1299a(int i, D03 d03) {
            super(1);
            this.f5054g = i;
            this.f5055h = d03;
        }

        /* renamed from: a */
        public final void m111045a(FQ3 fq3) {
            int i = this.f5054g;
            if (i == C50583vi4.nav_bulk_scan) {
                if (fq3.m107154a()) {
                    InterfaceC40099e13.C19924a.goToBulkScanner$default(this.f5055h.m111146G0(), null, null, null, null, 15, null);
                }
            } else if (i == C50583vi4.nav_wake_vehicles) {
                if (fq3.m107154a()) {
                    this.f5055h.m111146G0().mo36964p3();
                }
            } else if (i == C50583vi4.nav_command_center) {
                this.f5055h.m111146G0().mo36989l2();
            } else if (i == C50583vi4.nav_inventory) {
                this.f5055h.m111146G0().mo37016h();
            } else if (i == C50583vi4.nav_whitelist) {
                this.f5055h.m111146G0().mo37017g4();
            } else if (i == C50583vi4.nav_scrap_order) {
                this.f5055h.m111146G0().mo36908z();
            } else if (i == C50583vi4.nav_vehicle_inventory_check_in) {
                this.f5055h.m111146G0().mo36960q1(VehicleInventoryAction.CHECK_IN);
            } else if (i == C50583vi4.nav_vehicle_inventory_check_out) {
                this.f5055h.m111146G0().mo36960q1(VehicleInventoryAction.CHECK_OUT);
            } else if (i == C50583vi4.nav_vehicle_inventory_pick_up) {
                this.f5055h.m111146G0().mo36960q1(VehicleInventoryAction.PICK_UP);
            } else if (i == C50583vi4.nav_vehicle_inventory_drop_off) {
                this.f5055h.m111146G0().mo36960q1(VehicleInventoryAction.DROP_OFF);
            }
            if (!fq3.m107154a()) {
                C41318g46.m40151m("User denied camera permission!", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m111045a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LFQ3;", "response", "Lio/reactivex/u;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LFQ3;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: D03$a0 */
    /* loaded from: classes2.dex */
    public static final class C1300a0 extends Lambda implements Function1<FQ3, InterfaceC24574u<? extends WireBird>> {
        public C1300a0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends WireBird> invoke(FQ3 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m107154a()) {
                return M03.C5147a.operatorScanForBird$default(D03.this.m111144H0(), ScanMode.ADMIN, ScanIntention.OPERATOR_ACTION, Integer.valueOf(C45871nl4.operator_scan_instruction_connectivity), false, 8, null).m33125j0();
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$b */
    /* loaded from: classes2.dex */
    public static final class C1301b extends Lambda implements Function1<Throwable, Unit> {
        public C1301b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            M03 m111144H0 = D03.this.m111144H0();
            Intrinsics.checkNotNullExpressionValue(it, "it");
            m111144H0.error(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: D03$b0 */
    /* loaded from: classes2.dex */
    public static final class C1302b0 extends Lambda implements Function1<WireBird, Unit> {
        public C1302b0() {
            super(1);
        }

        /* renamed from: a */
        public final void m111043a(WireBird bird) {
            InterfaceC40099e13 m111146G0 = D03.this.m111146G0();
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            m111146G0.mo36920x(bird);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m111043a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\f\u0010\f\u001a\u00028\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "T1", "T2", "T3", "T4", "R", "t1", "t2", "t3", "t4", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$5\n+ 2 NavigationDrawerPresenterImpl.kt\nco/bird/android/app/feature/operator/presenter/NavigationDrawerPresenterImpl\n*L\n1#1,304:1\n148#2:305\n*E\n"})
    /* renamed from: D03$c */
    /* loaded from: classes2.dex */
    public static final class C1303c<T1, T2, T3, T4, R> implements InterfaceC23486i<T1, T2, T3, T4, R> {
        @Override // io.reactivex.functions.InterfaceC23486i
        public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            int intValue = ((Number) t4).intValue();
            boolean booleanValue = ((Boolean) t2).booleanValue();
            return (R) new C51106wb4(Boolean.valueOf(((Boolean) t1).booleanValue()), Boolean.valueOf(booleanValue), (OperatorAttributesResponse) t3, Integer.valueOf(intValue));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u000e\u0010\u000e\u001a\u00028\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u0000\"\b\b\u0005\u0010\u0006*\u00020\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u00022\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u0004H\n¢\u0006\u0004\b\f\u0010\r"}, m28432d2 = {"", "T1", "T2", "T3", "T4", "T5", "R", "t1", "t2", "t3", "t4", "t5", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$6\n+ 2 NavigationDrawerPresenterImpl.kt\nco/bird/android/app/feature/operator/presenter/NavigationDrawerPresenterImpl\n*L\n1#1,304:1\n162#2:305\n*E\n"})
    /* renamed from: D03$d */
    /* loaded from: classes2.dex */
    public static final class C1304d<T1, T2, T3, T4, T5, R> implements InterfaceC23487j<T1, T2, T3, T4, T5, R> {
        @Override // io.reactivex.functions.InterfaceC23487j
        public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            List listOf;
            boolean booleanValue = ((Boolean) t5).booleanValue();
            boolean booleanValue2 = ((Boolean) t4).booleanValue();
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.valueOf(((Boolean) t1).booleanValue()), Boolean.valueOf(((Boolean) t2).booleanValue()), Boolean.valueOf(((Boolean) t3).booleanValue()), Boolean.valueOf(booleanValue2), Boolean.valueOf(booleanValue)});
            return (R) listOf;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\f\u0010\f\u001a\u00028\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "T1", "T2", "T3", "T4", "R", "t1", "t2", "t3", "t4", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$5\n+ 2 NavigationDrawerPresenterImpl.kt\nco/bird/android/app/feature/operator/presenter/NavigationDrawerPresenterImpl\n*L\n1#1,304:1\n209#2:305\n*E\n"})
    /* renamed from: D03$e */
    /* loaded from: classes2.dex */
    public static final class C1305e<T1, T2, T3, T4, R> implements InterfaceC23486i<T1, T2, T3, T4, R> {
        @Override // io.reactivex.functions.InterfaceC23486i
        public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            boolean z;
            boolean booleanValue = ((Boolean) t4).booleanValue();
            boolean booleanValue2 = ((Boolean) t3).booleanValue();
            boolean booleanValue3 = ((Boolean) t2).booleanValue();
            if ((((Boolean) t1).booleanValue() || booleanValue3 || booleanValue2) && booleanValue) {
                z = true;
            } else {
                z = false;
            }
            return (R) Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$f */
    /* loaded from: classes2.dex */
    public static final class C1306f extends Lambda implements Function1<List<? extends Boolean>, Unit> {
        public C1306f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Boolean> list) {
            invoke2((List<Boolean>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<Boolean> list) {
            Intrinsics.checkNotNullExpressionValue(list, "(enableWakeIndividual, e…e, enableBulkScannerWake)");
            boolean z = false;
            boolean booleanValue = list.get(0).booleanValue();
            boolean booleanValue2 = list.get(1).booleanValue();
            boolean booleanValue3 = list.get(2).booleanValue();
            boolean booleanValue4 = list.get(3).booleanValue();
            boolean booleanValue5 = list.get(4).booleanValue();
            M03 m111144H0 = D03.this.m111144H0();
            if (booleanValue || booleanValue2 || booleanValue3 || booleanValue4 || booleanValue5) {
                z = true;
            }
            m111144H0.mo84455ka(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$g */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1307g extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1307g(Object obj) {
            super(1, obj, M03.class, "showBluetoothLocks", "showBluetoothLocks(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84459g5(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$h */
    /* loaded from: classes2.dex */
    public static final class C1308h extends Lambda implements Function1<Boolean, Unit> {
        public C1308h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enabled) {
            M03 m111144H0 = D03.this.m111144H0();
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            m111144H0.mo84481R4(enabled.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$i */
    /* loaded from: classes2.dex */
    public static final class C1309i extends Lambda implements Function1<Boolean, Unit> {
        public C1309i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enabled) {
            M03 m111144H0 = D03.this.m111144H0();
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            m111144H0.mo84454lg(enabled.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$j */
    /* loaded from: classes2.dex */
    public static final class C1310j extends Lambda implements Function1<Boolean, Unit> {
        public C1310j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enabled) {
            M03 m111144H0 = D03.this.m111144H0();
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            m111144H0.mo84486Nf(enabled.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$k */
    /* loaded from: classes2.dex */
    public static final class C1311k extends Lambda implements Function1<Boolean, Unit> {
        public C1311k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enabled) {
            M03 m111144H0 = D03.this.m111144H0();
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            m111144H0.mo84473X7(enabled.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$l */
    /* loaded from: classes2.dex */
    public static final class C1312l extends Lambda implements Function1<Boolean, Unit> {
        public C1312l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enabled) {
            M03 m111144H0 = D03.this.m111144H0();
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            m111144H0.mo84476Va(enabled.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$m */
    /* loaded from: classes2.dex */
    public static final class C1313m extends Lambda implements Function1<Boolean, Unit> {
        public C1313m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enabled) {
            M03 m111144H0 = D03.this.m111144H0();
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            m111144H0.mo84488M7(enabled.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$n */
    /* loaded from: classes2.dex */
    public static final class C1314n extends Lambda implements Function1<Boolean, Unit> {
        public C1314n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enabled) {
            M03 m111144H0 = D03.this.m111144H0();
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            m111144H0.mo84478Ud(enabled.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$o */
    /* loaded from: classes2.dex */
    public static final class C1315o extends Lambda implements Function1<Boolean, Unit> {
        public C1315o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enabled) {
            M03 m111144H0 = D03.this.m111144H0();
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            m111144H0.mo84458gj(enabled.booleanValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$p */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1316p extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1316p(Object obj) {
            super(1, obj, M03.class, "showUpdateInventory", "showUpdateInventory(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84489L4(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$q */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1317q extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1317q(Object obj) {
            super(1, obj, M03.class, "showBatchActions", "showBatchActions(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84456k4(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$r */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1318r extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1318r(Object obj) {
            super(1, obj, M03.class, "showQualityControl", "showQualityControl(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84453mf(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$s */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1319s extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1319s(Object obj) {
            super(1, obj, M03.class, "showLookupBird", "showLookupBird(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84475Wc(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$t */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1320t extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1320t(Object obj) {
            super(1, obj, M03.class, "showPairHandheld", "showPairHandheld(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84477V6(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$u */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1321u extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1321u(Object obj) {
            super(1, obj, M03.class, "showInspection", "showInspection(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84490Hi(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$v */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1322v extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1322v(Object obj) {
            super(1, obj, M03.class, "showHealthCheck", "showHealthCheck(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84447y9(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$w */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1323w extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1323w(Object obj) {
            super(1, obj, M03.class, "showMaintenance", "showMaintenance(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84450s5(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$x */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1324x extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1324x(Object obj) {
            super(1, obj, M03.class, "showFleetStatus", "showFleetStatus(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84491G3(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$y */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1325y extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C1325y(Object obj) {
            super(1, obj, M03.class, "showFleetInsights", "showFleetInsights(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((M03) this.receiver).mo84493Bj(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D03$z */
    /* loaded from: classes2.dex */
    public static final class C1326z extends Lambda implements Function1<Boolean, Unit> {
        public C1326z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enabled) {
            M03 m111144H0 = D03.this.m111144H0();
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            m111144H0.mo84492D1(enabled.booleanValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D03(C22454gl preference, C36207Tq4 reactiveConfig, GI3 partnerManager, InterfaceC46473om3 operatorManager, InterfaceC1880Ea analyticsManager, InterfaceC6097Oh appBuildConfig, Z85 demandManager, InterfaceC37961aS2 merchantManager, InterfaceC48265rn6 vehicleServicingManager, InterfaceC31844Az6 webArchiveManager, O86 transferOrderManager, InterfaceC35660Rh6 userStream, InterfaceC6098Oi appContextStream, LifecycleScopeProvider<EnumC7097RE> scopeProvider, M03 ui, InterfaceC40099e13 navigator, DQ3 permissionManager) {
        super(appBuildConfig, scopeProvider, preference, reactiveConfig, ui, navigator, analyticsManager, demandManager, merchantManager, userStream, appContextStream, partnerManager);
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(partnerManager, "partnerManager");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        Intrinsics.checkNotNullParameter(demandManager, "demandManager");
        Intrinsics.checkNotNullParameter(merchantManager, "merchantManager");
        Intrinsics.checkNotNullParameter(vehicleServicingManager, "vehicleServicingManager");
        Intrinsics.checkNotNullParameter(webArchiveManager, "webArchiveManager");
        Intrinsics.checkNotNullParameter(transferOrderManager, "transferOrderManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(appContextStream, "appContextStream");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        this.f5027n = preference;
        this.f5028o = reactiveConfig;
        this.f5029p = operatorManager;
        this.f5030q = analyticsManager;
        this.f5031r = demandManager;
        this.f5032s = vehicleServicingManager;
        this.f5033t = webArchiveManager;
        this.f5034u = transferOrderManager;
        this.f5035v = scopeProvider;
        this.f5036w = ui;
        this.f5037x = navigator;
        this.f5038y = permissionManager;
    }

    /* renamed from: A */
    public static final void m111163A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A1 */
    public static final void m111161A1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B1 */
    public static final InterfaceC24574u m111159B1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: C1 */
    public static final InterfaceC23447K m111157C1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: D1 */
    public static final void m111154D1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E1 */
    public static final InterfaceC24574u m111151E1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: F1 */
    public static final void m111148F1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J0 */
    public static final void m111140J0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K0 */
    public static final void m111138K0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L0 */
    public static final void m111136L0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M0 */
    public static final void m111134M0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N0 */
    public static final void m111132N0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O0 */
    public static final void m111130O0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P0 */
    public static final void m111128P0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q0 */
    public static final void m111126Q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R0 */
    public static final void m111124R0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S0 */
    public static final void m111122S0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T0 */
    public static final void m111120T0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U0 */
    public static final void m111118U0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V0 */
    public static final void m111116V0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W0 */
    public static final void m111114W0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X0 */
    public static final void m111112X0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y0 */
    public static final void m111110Y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z0 */
    public static final void m111108Z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a1 */
    public static final void m111106a1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b1 */
    public static final void m111104b1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c1 */
    public static final void m111102c1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d1 */
    public static final void m111100d1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e1 */
    public static final void m111098e1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f1 */
    public static final void m111096f1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g1 */
    public static final void m111094g1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h1 */
    public static final void m111092h1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i1 */
    public static final void m111090i1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j1 */
    public static final void m111088j1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k1 */
    public static final void m111086k1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l1 */
    public static final Boolean m111084l1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: m1 */
    public static final void m111082m1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n1 */
    public static final void m111080n1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o1 */
    public static final void m111078o1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p1 */
    public static final void m111076p1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q1 */
    public static final void m111074q1() {
    }

    /* renamed from: r1 */
    public static final void m111072r1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s1 */
    public static final boolean m111070s1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: t1 */
    public static final InterfaceC23496h m111068t1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: u1 */
    public static final void m111066u1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m111065v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v1 */
    public static final void m111063v1() {
    }

    /* renamed from: w1 */
    public static final void m111061w1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m111060x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x1 */
    public static final void m111058x1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m111057y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y1 */
    public static final void m111055y1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m111054z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z1 */
    public static final void m111052z1() {
    }

    @Override // p000.AbstractC5914OB
    /* renamed from: C */
    public void mo92668C() {
        Object first;
        this.f5028o.m82623f8().getValue();
        User m37750B0 = this.f5027n.m37750B0();
        if (m37750B0 != null) {
            if (UserKt.isOperator(m37750B0)) {
                if (UserKt.hasOperatorRole(m37750B0)) {
                    List<OperatorRole> operatorRoles = m37750B0.getOperatorRoles();
                    if (operatorRoles != null) {
                        C22454gl c22454gl = this.f5027n;
                        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) operatorRoles);
                        c22454gl.m37732F2(((OperatorRole) first).toUserRoleItem());
                        return;
                    }
                    return;
                }
                this.f5027n.m37732F2(UserRoleItemKt.toUserRoleItem(UserRole.OPERATOR));
                return;
            }
            this.f5027n.m37732F2(UserRoleItemKt.toUserRoleItem(UserRole.OPERATOR));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m111149F0() {
        boolean z;
        User m37750B0;
        Unit unit;
        Object first;
        boolean z2;
        if (this.f5028o.m82623f8().m73665a().getZendeskConfig().getWebHelpCenter().getEnabled()) {
            String operatorHelpCenterUrl = this.f5028o.m82623f8().m73665a().getZendeskConfig().getWebHelpCenter().getOperatorHelpCenterUrl();
            if (operatorHelpCenterUrl != null && operatorHelpCenterUrl.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                z = true;
                this.f5036w.mo84462f0(z);
                this.f5036w.mo84449t9(false);
                m37750B0 = this.f5027n.m37750B0();
                if (m37750B0 == null) {
                    M03 m03 = this.f5036w;
                    if (UserKt.hasOperatorRole(m37750B0)) {
                        List<OperatorRole> operatorRoles = m37750B0.getOperatorRoles();
                        if (operatorRoles != null) {
                            M03 m032 = this.f5036w;
                            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) operatorRoles);
                            m032.mo73878Te(((OperatorRole) first).getTitle());
                            unit = Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            this.f5036w.mo73880Le(C45871nl4.drawer_ride_switch_operator);
                        }
                    } else {
                        this.f5036w.mo73880Le(C45871nl4.drawer_ride_switch_operator);
                    }
                    this.f5036w.setIcon(C52342yg4.ic_filled_logo_white);
                    m03.mo73879Mj(true);
                    return;
                }
                return;
            }
        }
        z = false;
        this.f5036w.mo84462f0(z);
        this.f5036w.mo84449t9(false);
        m37750B0 = this.f5027n.m37750B0();
        if (m37750B0 == null) {
        }
    }

    /* renamed from: G0 */
    public final InterfaceC40099e13 m111146G0() {
        return this.f5037x;
    }

    /* renamed from: H0 */
    public final M03 m111144H0() {
        return this.f5036w;
    }

    /* renamed from: I0 */
    public final void m111142I0(int i) {
        Object m33135e = this.f5038y.m110485l(Permission.CAMERA).m33135e(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1299a c1299a = new C1299a(i, this);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: q03
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111140J0(Function1.this, obj);
            }
        };
        final C1301b c1301b = new C1301b();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: r03
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111138K0(Function1.this, obj);
            }
        });
    }

    @Override // p000.AbstractC5914OB, p000.InterfaceC38024aZ2
    /* renamed from: a */
    public void mo71220a() {
        super.mo71220a();
        m111149F0();
        Observable<Boolean> observeOn = this.f5028o.m82750T6().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "reactiveConfig\n      .en…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1315o c1315o = new C1315o();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: cZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111065v(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn2 = this.f5028o.m82429x7().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "reactiveConfig\n      .en…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1326z c1326z = new C1326z();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: hZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111136L0(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn3 = this.f5028o.m82893F3().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "reactiveConfig\n      .en…dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1281K c1281k = new C1281K(this.f5036w);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: FZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111060x(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn4 = this.f5028o.m82709X7().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "reactiveConfig\n      .en…dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1289S c1289s = new C1289S(this.f5036w);
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: UZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111057y(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn5 = this.f5028o.m82536n7().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "reactiveConfig\n      .en…dSchedulers.mainThread())");
        Object m33094as5 = observeOn5.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1290T c1290t = new C1290T(this.f5036w);
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: a03
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111054z(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn6 = this.f5028o.m82449v7().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn6, "reactiveConfig\n      .en…dSchedulers.mainThread())");
        Object m33094as6 = observeOn6.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1291U c1291u = new C1291U(this.f5036w);
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: c03
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111163A(Function1.this, obj);
            }
        });
        C24523e c24523e = C24523e.f91168a;
        Observable<Boolean> m82410z6 = this.f5028o.m82410z6();
        Observable<Boolean> m82589i9 = this.f5028o.m82589i9();
        Observable<OperatorAttributesResponse> m33123k0 = this.f5029p.mo8101h1().m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "operatorManager.operator…tributes().toObservable()");
        Observable combineLatest = Observable.combineLatest(m82410z6, m82589i9, m33123k0, this.f5029p.mo8099i1(), new C1303c());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
        Observable observeOn7 = combineLatest.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn7, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as7 = observeOn7.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1292V c1292v = new C1292V();
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: e03
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111058x1(Function1.this, obj);
            }
        });
        Observable combineLatest2 = Observable.combineLatest(this.f5028o.m82729V7(), this.f5028o.m82929B7(), this.f5028o.m82496r3(), this.f5028o.m82909D7(), this.f5028o.m82913D3(), new C1304d());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest2, "Observable.combineLatest…on(t1, t2, t3, t4, t5) })");
        Observable observeOn8 = combineLatest2.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn8, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as8 = observeOn8.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1306f c1306f = new C1306f();
        ((ObservableSubscribeProxy) m33094as8).subscribe(new InterfaceC23484g() { // from class: f03
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111055y1(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn9 = this.f5028o.m82624f7().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn9, "reactiveConfig\n      .en…dSchedulers.mainThread())");
        Object m33094as9 = observeOn9.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as9, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1307g c1307g = new C1307g(this.f5036w);
        ((ObservableSubscribeProxy) m33094as9).subscribe(new InterfaceC23484g() { // from class: g03
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111134M0(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn10 = this.f5028o.m82559l6().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn10, "reactiveConfig\n      .en…dSchedulers.mainThread())");
        Object m33094as10 = observeOn10.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as10, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1308h c1308h = new C1308h();
        ((ObservableSubscribeProxy) m33094as10).subscribe(new InterfaceC23484g() { // from class: h03
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111132N0(Function1.this, obj);
            }
        });
        this.f5036w.mo84470Yb(this.f5028o.m82623f8().getValue().getOperatorConfig().getFeatures().getRelease().getReleaseAssignments().getEnabled());
        Observable<Boolean> observeOn11 = this.f5028o.m82493r6().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn11, "reactiveConfig\n      .en…dSchedulers.mainThread())");
        Object m33094as11 = observeOn11.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as11, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1309i c1309i = new C1309i();
        ((ObservableSubscribeProxy) m33094as11).subscribe(new InterfaceC23484g() { // from class: yZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111130O0(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn12 = this.f5028o.m82515p6().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn12, "reactiveConfig\n      .en…dSchedulers.mainThread())");
        Object m33094as12 = observeOn12.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as12, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1310j c1310j = new C1310j();
        ((ObservableSubscribeProxy) m33094as12).subscribe(new InterfaceC23484g() { // from class: PZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111128P0(Function1.this, obj);
            }
        });
        Observable combineLatest3 = Observable.combineLatest(this.f5028o.m82692Z4(), this.f5028o.m82670b5(), this.f5028o.m82752T4(), this.f5028o.m82712X4(), new C1305e());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest3, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
        Observable observeOn13 = combineLatest3.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn13, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as13 = observeOn13.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as13, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1311k c1311k = new C1311k();
        ((ObservableSubscribeProxy) m33094as13).subscribe(new InterfaceC23484g() { // from class: b03
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111126Q0(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn14 = this.f5028o.m82910D6().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn14, "reactiveConfig\n      .en…dSchedulers.mainThread())");
        Object m33094as14 = observeOn14.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as14, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1312l c1312l = new C1312l();
        ((ObservableSubscribeProxy) m33094as14).subscribe(new InterfaceC23484g() { // from class: n03
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111124R0(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn15 = this.f5028o.m82771R5().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn15, "reactiveConfig\n      .en…dSchedulers.mainThread())");
        Object m33094as15 = observeOn15.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as15, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1313m c1313m = new C1313m();
        ((ObservableSubscribeProxy) m33094as15).subscribe(new InterfaceC23484g() { // from class: t03
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111122S0(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn16 = this.f5028o.m82648d5().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn16, "reactiveConfig\n      .en…dSchedulers.mainThread())");
        Object m33094as16 = observeOn16.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as16, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1314n c1314n = new C1314n();
        ((ObservableSubscribeProxy) m33094as16).subscribe(new InterfaceC23484g() { // from class: v03
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111120T0(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn17 = this.f5028o.m82693Z3().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn17, "reactiveConfig\n      .en…dSchedulers.mainThread())");
        Object m33094as17 = observeOn17.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as17, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1316p c1316p = new C1316p(this.f5036w);
        ((ObservableSubscribeProxy) m33094as17).subscribe(new InterfaceC23484g() { // from class: x03
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111118U0(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn18 = this.f5028o.m82518p3().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn18, "reactiveConfig\n      .en…dSchedulers.mainThread())");
        Object m33094as18 = observeOn18.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as18, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1317q c1317q = new C1317q(this.f5036w);
        ((ObservableSubscribeProxy) m33094as18).subscribe(new InterfaceC23484g() { // from class: z03
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111116V0(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn19 = this.f5028o.m82470t7().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn19, "reactiveConfig\n      .en…dSchedulers.mainThread())");
        Object m33094as19 = observeOn19.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as19, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1318r c1318r = new C1318r(this.f5036w);
        ((ObservableSubscribeProxy) m33094as19).subscribe(new InterfaceC23484g() { // from class: B03
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111114W0(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn20 = this.f5028o.m82751T5().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn20, "reactiveConfig\n      .en…dSchedulers.mainThread())");
        Object m33094as20 = observeOn20.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as20, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1319s c1319s = new C1319s(this.f5036w);
        ((ObservableSubscribeProxy) m33094as20).subscribe(new InterfaceC23484g() { // from class: eZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111112X0(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn21 = this.f5028o.m82711X5().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn21, "reactiveConfig\n      .en…dSchedulers.mainThread())");
        Object m33094as21 = observeOn21.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as21, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1320t c1320t = new C1320t(this.f5036w);
        ((ObservableSubscribeProxy) m33094as21).subscribe(new InterfaceC23484g() { // from class: jZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111110Y0(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn22 = this.f5028o.m82537n6().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn22, "reactiveConfig.enableOpe…dSchedulers.mainThread())");
        Object m33094as22 = observeOn22.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as22, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1321u c1321u = new C1321u(this.f5036w);
        ((ObservableSubscribeProxy) m33094as22).subscribe(new InterfaceC23484g() { // from class: lZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111108Z0(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn23 = this.f5028o.m82811N5().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn23, "reactiveConfig.enableOpe…dSchedulers.mainThread())");
        Object m33094as23 = observeOn23.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as23, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1322v c1322v = new C1322v(this.f5036w);
        ((ObservableSubscribeProxy) m33094as23).subscribe(new InterfaceC23484g() { // from class: nZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111106a1(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn24 = this.f5028o.m82731V5().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn24, "reactiveConfig.enableOpe…dSchedulers.mainThread())");
        Object m33094as24 = observeOn24.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as24, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1323w c1323w = new C1323w(this.f5036w);
        ((ObservableSubscribeProxy) m33094as24).subscribe(new InterfaceC23484g() { // from class: pZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111104b1(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn25 = this.f5028o.m82831L5().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn25, "reactiveConfig.enableOpe…dSchedulers.mainThread())");
        Object m33094as25 = observeOn25.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as25, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1324x c1324x = new C1324x(this.f5036w);
        ((ObservableSubscribeProxy) m33094as25).subscribe(new InterfaceC23484g() { // from class: rZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111102c1(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn26 = this.f5028o.m82851J5().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn26, "reactiveConfig.enableOpe…dSchedulers.mainThread())");
        Object m33094as26 = observeOn26.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as26, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1325y c1325y = new C1325y(this.f5036w);
        ((ObservableSubscribeProxy) m33094as26).subscribe(new InterfaceC23484g() { // from class: tZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111100d1(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn27 = this.f5028o.m82409z7().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn27, "reactiveConfig.enableSer…dSchedulers.mainThread())");
        Object m33094as27 = observeOn27.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as27, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1271A c1271a = new C1271A(this.f5036w);
        ((ObservableSubscribeProxy) m33094as27).subscribe(new InterfaceC23484g() { // from class: vZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111098e1(Function1.this, obj);
            }
        });
        Observable observeOn28 = C24523e.f91168a.m31956a(this.f5028o.m82930B6(), this.f5034u.mo80307M()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn28, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as28 = observeOn28.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as28, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1272B c1272b = new C1272B();
        ((ObservableSubscribeProxy) m33094as28).subscribe(new InterfaceC23484g() { // from class: xZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111096f1(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn29 = this.f5028o.m82646d7().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn29, "reactiveConfig.enableScr…dSchedulers.mainThread())");
        Object m33094as29 = observeOn29.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as29, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1273C c1273c = new C1273C(this.f5036w);
        ((ObservableSubscribeProxy) m33094as29).subscribe(new InterfaceC23484g() { // from class: AZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111094g1(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn30 = this.f5028o.m82829L7().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn30, "reactiveConfig.enableVeh…dSchedulers.mainThread())");
        Object m33094as30 = observeOn30.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as30, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1274D c1274d = new C1274D(this.f5036w);
        ((ObservableSubscribeProxy) m33094as30).subscribe(new InterfaceC23484g() { // from class: DZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111092h1(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn31 = this.f5028o.m82809N7().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn31, "reactiveConfig.enableVeh…dSchedulers.mainThread())");
        Object m33094as31 = observeOn31.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as31, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1275E c1275e = new C1275E(this.f5036w);
        ((ObservableSubscribeProxy) m33094as31).subscribe(new InterfaceC23484g() { // from class: HZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111090i1(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn32 = this.f5028o.m82769R7().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn32, "reactiveConfig.enableVeh…dSchedulers.mainThread())");
        Object m33094as32 = observeOn32.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as32, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1276F c1276f = new C1276F(this.f5036w);
        ((ObservableSubscribeProxy) m33094as32).subscribe(new InterfaceC23484g() { // from class: JZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111088j1(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn33 = this.f5028o.m82789P7().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn33, "reactiveConfig.enableVeh…dSchedulers.mainThread())");
        Object m33094as33 = observeOn33.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as33, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1277G c1277g = new C1277G(this.f5036w);
        ((ObservableSubscribeProxy) m33094as33).subscribe(new InterfaceC23484g() { // from class: KZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111086k1(Function1.this, obj);
            }
        });
        Z84<Config> m82623f8 = this.f5028o.m82623f8();
        final C1278H c1278h = C1278H.f5040g;
        Observable observeOn34 = m82623f8.map(new InterfaceC23492o() { // from class: LZ2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m111084l1;
                m111084l1 = D03.m111084l1(Function1.this, obj);
                return m111084l1;
            }
        }).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn34, "reactiveConfig.config.ma…dSchedulers.mainThread())");
        Object m33094as34 = observeOn34.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as34, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1279I c1279i = new C1279I(this.f5036w);
        ((ObservableSubscribeProxy) m33094as34).subscribe(new InterfaceC23484g() { // from class: MZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111082m1(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn35 = this.f5028o.m82545m9().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn35, "reactiveConfig.suggestNe…dSchedulers.mainThread())");
        Object m33094as35 = observeOn35.m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as35, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1280J c1280j = new C1280J(this.f5036w);
        ((ObservableSubscribeProxy) m33094as35).subscribe(new InterfaceC23484g() { // from class: NZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111080n1(Function1.this, obj);
            }
        });
        Object m33094as36 = this.f5036w.mo84484Oe().m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as36, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1282L c1282l = new C1282L();
        ((ObservableSubscribeProxy) m33094as36).subscribe(new InterfaceC23484g() { // from class: OZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111078o1(Function1.this, obj);
            }
        });
        Object m33094as37 = this.f5036w.mo84494B8().m33094as(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as37, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1283M c1283m = new C1283M();
        ((ObservableSubscribeProxy) m33094as37).subscribe(new InterfaceC23484g() { // from class: QZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111076p1(Function1.this, obj);
            }
        });
        Object m33041n = this.f5033t.mo99404b(EnumC2421Fm.PARTNER_REPORTS.m106621b()).m33041n(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: SZ2
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                D03.m111074q1();
            }
        };
        final C1284N c1284n = new C1284N();
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: TZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111072r1(Function1.this, obj);
            }
        });
        Observable<Boolean> m82930B6 = this.f5028o.m82930B6();
        final C1285O c1285o = C1285O.f5044g;
        Observable<Boolean> filter = m82930B6.filter(new InterfaceC23494q() { // from class: VZ2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m111070s1;
                m111070s1 = D03.m111070s1(Function1.this, obj);
                return m111070s1;
            }
        });
        final C1286P c1286p = new C1286P();
        AbstractC23461c flatMapCompletable = filter.flatMapCompletable(new InterfaceC23492o() { // from class: WZ2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m111068t1;
                m111068t1 = D03.m111068t1(Function1.this, obj);
                return m111068t1;
            }
        });
        final C1287Q c1287q = C1287Q.f5046b;
        AbstractC23461c m33065U = flatMapCompletable.m33084B(new InterfaceC23484g() { // from class: XZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111066u1(Function1.this, obj);
            }
        }).m33065U(3L);
        Intrinsics.checkNotNullExpressionValue(m33065U, "override fun onCreate() …scribe({}, Timber::e)\n  }");
        Object m33041n2 = m33065U.m33041n(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a2 = new InterfaceC23478a() { // from class: YZ2
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                D03.m111063v1();
            }
        };
        final C1288R c1288r = C1288R.f5047b;
        ((CompletableSubscribeProxy) m33041n2).mo45217e(interfaceC23478a2, new InterfaceC23484g() { // from class: ZZ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D03.m111061w1(Function1.this, obj);
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
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if (i == C50583vi4.nav_repair) {
            if (this.f5028o.m82623f8().getValue().getOperatorConfig().getFeatures().getWorkOrders().getEnableRepair()) {
                this.f5037x.mo37171F2();
            } else {
                this.f5037x.mo37120O();
            }
        } else if (i == C50583vi4.nav_service_center_status) {
            this.f5037x.mo36981m4();
        } else if (i == C50583vi4.nav_bulk_service_center_status) {
            this.f5037x.mo36993k4();
        } else if (i == C50583vi4.nav_task_list) {
            if (this.f5028o.m82623f8().m73665a().getOperatorConfig().getFeatures().getTaskList().getV2()) {
                this.f5037x.mo36913y0();
            } else {
                this.f5037x.mo37038d1();
            }
        } else if (i == C50583vi4.nav_wake_sleep_birds) {
            this.f5037x.mo37011h4();
        } else {
            boolean z9 = false;
            if (i == C50583vi4.nav_help) {
                this.f5037x.mo37080V2(MapMode.OPERATOR, this.f5028o.m82623f8().getValue().getOperatorConfig().getHelpSideMenuZendeskArticleId(), false, Boolean.valueOf(m92655q().mo55891a()));
            } else if (i == C50583vi4.nav_faq) {
                String faqSideMenuWebUrl = this.f5028o.m82623f8().getValue().getOperatorConfig().getFaqSideMenuWebUrl();
                if (faqSideMenuWebUrl != null) {
                    InterfaceC40099e13.C19924a.goToWebView$default(this.f5037x, faqSideMenuWebUrl, null, null, false, 14, null);
                }
            } else if (i == C50583vi4.nav_nearby_vehicles) {
                InterfaceC40099e13.C19924a.goToNearbyBirds$default(this.f5037x, false, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
            } else if (i == C50583vi4.nav_batchActions) {
                this.f5037x.mo37018g3();
            } else if (i == C50583vi4.nav_replace_qr) {
                InterfaceC40099e13.C19924a.goToAssociateId$default(this.f5037x, IdToolOption.QR_CODE, null, false, 4, null);
            } else if (i == C50583vi4.nav_settings) {
                this.f5037x.mo37005i4();
            } else if (i == C50583vi4.nav_bluetooth_locks) {
                this.f5037x.mo37033e0();
            } else if (i == C50583vi4.nav_release_assignment) {
                this.f5037x.mo37036d3();
            } else if (i == C50583vi4.nav_id_tool) {
                InterfaceC40099e13.C19924a.goToIdTools$default(this.f5037x, null, false, 3, null);
            } else if (i == C50583vi4.nav_quality_control) {
                this.f5037x.mo36963p4();
            } else if (i == C50583vi4.nav_create_a_nest) {
                this.f5037x.mo37071X1();
            } else if (i == C50583vi4.nav_lookup_bird) {
                this.f5037x.mo37068Y();
            } else if (i == C50583vi4.nav_hard_count) {
                this.f5037x.mo37155I0();
            } else if (i == C50583vi4.nav_scrap) {
                this.f5037x.mo37149J0();
            } else if (i == C50583vi4.nav_fleet_status) {
                this.f5037x.mo36942t1();
            } else if (i == C50583vi4.nav_fleet_insights) {
                this.f5037x.mo37060Z2();
            } else if (i == C50583vi4.nav_maintenance) {
                this.f5037x.mo36921w4();
            } else if (i == C50583vi4.nav_transfer_order) {
                this.f5037x.mo37158H3();
            } else if (i == C50583vi4.nav_operator_transfer_order) {
                this.f5037x.mo36974o();
            } else if (i == C50583vi4.nav_report) {
                List<C50755vz6> value = this.f5033t.mo99405a().getValue();
                if (!(value instanceof Collection) || !value.isEmpty()) {
                    Iterator<T> it = value.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (Intrinsics.areEqual(((C50755vz6) it.next()).m7615e(), EnumC2421Fm.PARTNER_REPORTS.m106621b())) {
                            z9 = true;
                            break;
                        }
                    }
                }
                if (!z9) {
                    Object m33041n = this.f5033t.mo99404b(EnumC2421Fm.PARTNER_REPORTS.m106621b()).m33041n(AutoDispose.m45239a(this.f5035v));
                    Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                    InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: i03
                        @Override // io.reactivex.functions.InterfaceC23478a
                        public final void run() {
                            D03.m111052z1();
                        }
                    };
                    final C1293W c1293w = new C1293W();
                    ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: j03
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            D03.m111161A1(Function1.this, obj);
                        }
                    });
                }
                this.f5037x.mo37027f0(EnumC2421Fm.PARTNER_REPORTS.m106621b());
            } else if (i == C50583vi4.nav_inspection) {
                AbstractC23442F<FQ3> m110485l = this.f5038y.m110485l(Permission.CAMERA);
                final C1294X c1294x = new C1294X();
                AbstractC24507p<R> m33163C = m110485l.m33163C(new InterfaceC23492o() { // from class: k03
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m111159B1;
                        m111159B1 = D03.m111159B1(Function1.this, obj);
                        return m111159B1;
                    }
                });
                final C1295Y c1295y = new C1295Y();
                AbstractC23442F m32072C = m33163C.m32072C(new InterfaceC23492o() { // from class: l03
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23447K m111157C1;
                        m111157C1 = D03.m111157C1(Function1.this, obj);
                        return m111157C1;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m32072C, "override fun onNavigatio…wer()\n    return true\n  }");
                Object m33135e = m32072C.m33135e(AutoDispose.m45239a(this.f5035v));
                Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
                final C1297Z c1297z = new C1297Z();
                ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: m03
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        D03.m111154D1(Function1.this, obj);
                    }
                });
            } else if (i == C50583vi4.nav_health_check) {
                AbstractC23442F<FQ3> m110485l2 = this.f5038y.m110485l(Permission.CAMERA);
                final C1300a0 c1300a0 = new C1300a0();
                AbstractC24507p<R> m33163C2 = m110485l2.m33163C(new InterfaceC23492o() { // from class: o03
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m111151E1;
                        m111151E1 = D03.m111151E1(Function1.this, obj);
                        return m111151E1;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33163C2, "override fun onNavigatio…wer()\n    return true\n  }");
                Object m32048b = m33163C2.m32048b(AutoDispose.m45239a(this.f5035v));
                Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
                final C1302b0 c1302b0 = new C1302b0();
                ((MaybeSubscribeProxy) m32048b).subscribe(new InterfaceC23484g() { // from class: p03
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        D03.m111148F1(Function1.this, obj);
                    }
                });
            } else {
                if (i == C50583vi4.nav_bulk_scan || i == C50583vi4.nav_inventory) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || i == C50583vi4.nav_wake_vehicles) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 || i == C50583vi4.nav_command_center) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 || i == C50583vi4.nav_whitelist) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 || i == C50583vi4.nav_scrap_order) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5 || i == C50583vi4.nav_vehicle_inventory_check_in) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 || i == C50583vi4.nav_vehicle_inventory_check_out) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7 || i == C50583vi4.nav_vehicle_inventory_pick_up) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8 || i == C50583vi4.nav_vehicle_inventory_drop_off) {
                    z9 = true;
                }
                if (z9) {
                    m111142I0(i);
                }
            }
        }
        this.f5036w.mo73881Kh();
        return true;
    }

    @Override // p000.InterfaceC38024aZ2
    /* renamed from: d */
    public void mo71217d(boolean z) {
        if (!z) {
            m92655q().mo55890b("mode_switch");
            this.f5030q.mo55905y(new OU2(null, null, null, UserRole.RIDER.name(), 7, null));
            this.f5036w.success(C45871nl4.operator_switch_to_rider_mode);
            InterfaceC40099e13.C19924a.goToRider$default(this.f5037x, true, false, null, 6, null);
        }
    }

    @Override // p000.AbstractC5914OB, p000.InterfaceC38024aZ2
    public void onResume() {
        AbstractC23461c m33069Q = this.f5029p.mo8147I0().m33159G().m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "operatorManager.getTasks…\n      .onErrorComplete()");
        Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(this.f5035v));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }
}
