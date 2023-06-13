package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Detail;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.IdToolOption;
import co.bird.android.model.constant.AlarmCommand;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.WireBirdPart;
import co.bird.android.model.wire.WirePart;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import p000.AbstractC22565hB;
import p000.H31;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010!\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001By\u0012\u0006\u0010%\u001a\u00020!\u0012\u0006\u0010*\u001a\u00020&\u0012\u0006\u0010/\u001a\u00020+\u0012\u0006\u00105\u001a\u000200\u0012\u0006\u0010:\u001a\u000206\u0012\u0006\u0010?\u001a\u00020;\u0012\u0006\u0010E\u001a\u00020@\u0012\u0006\u0010K\u001a\u00020F\u0012\u0006\u0010Q\u001a\u00020L\u0012\u0006\u0010W\u001a\u00020R\u0012\u0006\u0010]\u001a\u00020X\u0012\u0006\u0010c\u001a\u00020^\u0012\u0006\u0010i\u001a\u00020d\u0012\u0006\u0010n\u001a\u00020\u0019¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0017J\b\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016J\u001a\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0016\u0010\u001e\u001a\u00020\b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001cH\u0016J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0019H\u0004R\u001a\u0010%\u001a\u00020!8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010*\u001a\u00020&8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0018\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010/\u001a\u00020+8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b-\u0010.R\u001a\u00105\u001a\u0002008\u0004X\u0084\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010:\u001a\u0002068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b8\u00109R\u001a\u0010?\u001a\u00020;8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010E\u001a\u00020@8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010K\u001a\u00020F8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010Q\u001a\u00020L8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010W\u001a\u00020R8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010]\u001a\u00020X8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001a\u0010c\u001a\u00020^8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001a\u0010i\u001a\u00020d8\u0004X\u0084\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010n\u001a\u00020\u00198\u0004X\u0084\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010{\u001a\u0004\u0018\u00010\u00168\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR$\u0010\u000b\u001a\u00020\n8\u0004@\u0004X\u0084.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R&\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0082\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008d\u0001"}, m28432d2 = {"LhB;", "LFR1;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/c;", "E", "Lio/reactivex/Observable;", "l0", "", "onBackPressed", "Lco/bird/android/model/IdToolOption;", "option", "", "showStepOne", "f", "e", "Landroid/content/Intent;", "intent", C17296a.f69688o, "onResume", "onPause", "c", "Lco/bird/android/model/wire/WirePart;", "part", "b", "", "birdId", "m0", "", "parts", "H", PaymentMethodOptionsParams.Blik.PARAM_CODE, "g0", "LnS1;", "LnS1;", "O", "()LnS1;", "idToolsManager", "Lom3;", "Lom3;", "R", "()Lom3;", "operatorManager", "LpJ;", "LpJ;", "getBluetoothManager", "()LpJ;", "bluetoothManager", "LSM;", DateTokenConverter.CONVERTER_KEY, "LSM;", "getBirdPartManager", "()LSM;", "birdPartManager", "LZF;", "LZF;", "J", "()LZF;", "beaconConfigurationManager", "LEa;", "LEa;", "I", "()LEa;", "analyticsManager", "LDQ3;", "g", "LDQ3;", "T", "()LDQ3;", "permissionManager", "LTk0;", "h", "LTk0;", "M", "()LTk0;", "clipboardManager", "LaM;", "i", "LaM;", "getBirdManager", "()LaM;", "birdManager", "LTo0;", "j", "LTo0;", "N", "()LTo0;", "commandManager", "Le13;", "k", "Le13;", "Q", "()Le13;", "navigator", "LGR1;", "l", "LGR1;", "W", "()LGR1;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "m", "Lcom/uber/autodispose/ScopeProvider;", "U", "()Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "n", "Ljava/lang/String;", "V", "()Ljava/lang/String;", "sessionId", "o", "Lco/bird/android/model/wire/WireBird;", "K", "()Lco/bird/android/model/wire/WireBird;", "setBird", "(Lco/bird/android/model/wire/WireBird;)V", "p", "Lco/bird/android/model/wire/WirePart;", "P", "()Lco/bird/android/model/wire/WirePart;", "j0", "(Lco/bird/android/model/wire/WirePart;)V", "identifyingPart", "q", "Lco/bird/android/model/IdToolOption;", "S", "()Lco/bird/android/model/IdToolOption;", "k0", "(Lco/bird/android/model/IdToolOption;)V", "", "r", "Ljava/util/List;", "L", "()Ljava/util/List;", "birdParts", "s", "Z", "confirmBeforeExiting", "<init>", "(LnS1;Lom3;LpJ;LSM;LZF;LEa;LDQ3;LTk0;LaM;LTo0;Le13;LGR1;Lcom/uber/autodispose/ScopeProvider;Ljava/lang/String;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdToolsIdentifyPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsIdentifyPresenter.kt\nco/bird/android/feature/servicecenter/idtools/identify/BaseIdToolsIdentifyPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,286:1\n180#2:287\n180#2:288\n237#2:289\n180#2:290\n199#2:291\n180#2:292\n180#2:293\n199#2:294\n237#2:295\n199#2:296\n*S KotlinDebug\n*F\n+ 1 IdToolsIdentifyPresenter.kt\nco/bird/android/feature/servicecenter/idtools/identify/BaseIdToolsIdentifyPresenter\n*L\n82#1:287\n87#1:288\n95#1:289\n100#1:290\n108#1:291\n132#1:292\n140#1:293\n152#1:294\n177#1:295\n207#1:296\n*E\n"})
/* renamed from: hB */
/* loaded from: classes3.dex */
public abstract class AbstractC22565hB implements FR1 {

    /* renamed from: a */
    public final InterfaceC45686nS1 f84772a;

    /* renamed from: b */
    public final InterfaceC46473om3 f84773b;

    /* renamed from: c */
    public final InterfaceC27246pJ f84774c;

    /* renamed from: d */
    public final InterfaceC7381SM f84775d;

    /* renamed from: e */
    public final InterfaceC10163ZF f84776e;

    /* renamed from: f */
    public final InterfaceC1880Ea f84777f;

    /* renamed from: g */
    public final DQ3 f84778g;

    /* renamed from: h */
    public final InterfaceC36149Tk0 f84779h;

    /* renamed from: i */
    public final InterfaceC10636aM f84780i;

    /* renamed from: j */
    public final InterfaceC36185To0 f84781j;

    /* renamed from: k */
    public final InterfaceC40099e13 f84782k;

    /* renamed from: l */
    public final GR1 f84783l;

    /* renamed from: m */
    public final ScopeProvider f84784m;

    /* renamed from: n */
    public final String f84785n;

    /* renamed from: o */
    public WireBird f84786o;

    /* renamed from: p */
    public WirePart f84787p;

    /* renamed from: q */
    public IdToolOption f84788q;

    /* renamed from: r */
    public final List<WirePart> f84789r;

    /* renamed from: s */
    public boolean f84790s;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hB$a */
    /* loaded from: classes3.dex */
    public static final class C22566a extends Lambda implements Function1<Unit, Unit> {
        public C22566a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToNearbyBirds$default(AbstractC22565hB.this.m36745Q(), true, null, null, null, null, null, null, null, 254, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/constant/PartKind;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hB$b */
    /* loaded from: classes3.dex */
    public static final class C22567b extends Lambda implements Function1<Pair<? extends PartKind, ? extends String>, Unit> {
        public C22567b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends PartKind, ? extends String> pair) {
            invoke2((Pair<? extends PartKind, String>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends PartKind, String> pair) {
            PartKind component1 = pair.component1();
            AbstractC22565hB.this.m36749M().mo79490a(component1.toString(), pair.component2());
            AbstractC22565hB.this.m36739W().mo103887Qk(component1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIdToolsIdentifyPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsIdentifyPresenter.kt\nco/bird/android/feature/servicecenter/idtools/identify/BaseIdToolsIdentifyPresenter$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,286:1\n1#2:287\n*E\n"})
    /* renamed from: hB$c */
    /* loaded from: classes3.dex */
    public static final class C22568c extends Lambda implements Function1<Unit, InterfaceC23496h> {
        public C22568c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Unit it) {
            AbstractC23461c m36757E;
            Intrinsics.checkNotNullParameter(it, "it");
            WireBird m36751K = AbstractC22565hB.this.m36751K();
            if (m36751K == null || (m36757E = AbstractC22565hB.this.m36757E(m36751K)) == null) {
                return AbstractC23461c.m33039p();
            }
            return m36757E;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIdToolsIdentifyPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsIdentifyPresenter.kt\nco/bird/android/feature/servicecenter/idtools/identify/BaseIdToolsIdentifyPresenter$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,286:1\n1#2:287\n*E\n"})
    /* renamed from: hB$d */
    /* loaded from: classes3.dex */
    public static final class C22569d extends Lambda implements Function1<Unit, InterfaceC23434B<? extends WireBird>> {
        public C22569d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends WireBird> invoke(Unit it) {
            Observable m36715l0;
            Intrinsics.checkNotNullParameter(it, "it");
            WireBird m36751K = AbstractC22565hB.this.m36751K();
            return (m36751K == null || (m36715l0 = AbstractC22565hB.this.m36715l0(m36751K)) == null) ? Observable.empty() : m36715l0;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hB$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C22570e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdToolOption.values().length];
            try {
                iArr[IdToolOption.HANDLEBAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdToolOption.PCM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hB$f */
    /* loaded from: classes3.dex */
    public static final class C22571f extends Lambda implements Function1<Throwable, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f84796h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22571f(WireBird wireBird) {
            super(1);
            this.f84796h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C28237sD.progress$default(AbstractC22565hB.this.m36744R().mo8119Z0(this.f84796h, AlarmCommand.AUTO), AbstractC22565hB.this.m36739W(), 0, 2, (Object) null).ignoreElements();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hB$g */
    /* loaded from: classes3.dex */
    public static final class C22572g extends Lambda implements Function1<DialogResponse, Unit> {
        public C22572g() {
            super(1);
        }

        /* renamed from: a */
        public final void m36694a(DialogResponse dialogResponse) {
            if (dialogResponse == DialogResponse.OK) {
                AbstractC22565hB.this.m36745Q().close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m36694a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "birdParts", "", "Lco/bird/android/model/wire/WireBirdPart;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nIdToolsIdentifyPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsIdentifyPresenter.kt\nco/bird/android/feature/servicecenter/idtools/identify/BaseIdToolsIdentifyPresenter$onBirdIdentified$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n1747#2,3:287\n223#2,2:290\n*S KotlinDebug\n*F\n+ 1 IdToolsIdentifyPresenter.kt\nco/bird/android/feature/servicecenter/idtools/identify/BaseIdToolsIdentifyPresenter$onBirdIdentified$2\n*L\n191#1:287,3\n192#1:290,2\n*E\n"})
    /* renamed from: hB$h */
    /* loaded from: classes3.dex */
    public static final class C22573h extends Lambda implements Function1<List<? extends WireBirdPart>, Unit> {
        public C22573h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireBirdPart> list) {
            invoke2((List<WireBirdPart>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireBirdPart> birdParts) {
            boolean z;
            boolean z2;
            Object first;
            WirePart part;
            boolean z3;
            if (AbstractC22565hB.this.m36746P() == null) {
                AbstractC22565hB abstractC22565hB = AbstractC22565hB.this;
                Intrinsics.checkNotNullExpressionValue(birdParts, "birdParts");
                List<WireBirdPart> list = birdParts;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (WireBirdPart wireBirdPart : list) {
                        if (wireBirdPart.getKind() == PartKind.STICKER) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                if (!z2) {
                    first = CollectionsKt___CollectionsKt.first((List<? extends Object>) birdParts);
                    part = ((WireBirdPart) first).toPart();
                } else {
                    for (WireBirdPart wireBirdPart2 : list) {
                        if (wireBirdPart2.getKind() == PartKind.STICKER) {
                            z3 = true;
                            continue;
                        } else {
                            z3 = false;
                            continue;
                        }
                        if (z3) {
                            part = wireBirdPart2.toPart();
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                abstractC22565hB.m36719j0(part);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireBirdPart;", "wireBirdParts", "", "Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIdToolsIdentifyPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsIdentifyPresenter.kt\nco/bird/android/feature/servicecenter/idtools/identify/BaseIdToolsIdentifyPresenter$onBirdIdentified$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n766#2:287\n857#2,2:288\n1549#2:290\n1620#2,3:291\n*S KotlinDebug\n*F\n+ 1 IdToolsIdentifyPresenter.kt\nco/bird/android/feature/servicecenter/idtools/identify/BaseIdToolsIdentifyPresenter$onBirdIdentified$3\n*L\n200#1:287\n200#1:288,2\n201#1:290\n201#1:291,3\n*E\n"})
    /* renamed from: hB$i */
    /* loaded from: classes3.dex */
    public static final class C22574i extends Lambda implements Function1<List<? extends WireBirdPart>, List<WirePart>> {
        public C22574i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WirePart> invoke(List<WireBirdPart> wireBirdParts) {
            int collectionSizeOrDefault;
            boolean z;
            Intrinsics.checkNotNullParameter(wireBirdParts, "wireBirdParts");
            AbstractC22565hB.this.m36750L().clear();
            ArrayList<WireBirdPart> arrayList = new ArrayList();
            for (Object obj : wireBirdParts) {
                if (((WireBirdPart) obj).getKind() != PartKind.UNKNOWN) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (WireBirdPart wireBirdPart : arrayList) {
                arrayList2.add(wireBirdPart.toPart());
            }
            AbstractC22565hB.this.m36750L().addAll(arrayList2);
            return AbstractC22565hB.this.m36750L();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "birdParts", "", "Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hB$j */
    /* loaded from: classes3.dex */
    public static final class C22575j extends Lambda implements Function1<List<WirePart>, Unit> {
        public C22575j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<WirePart> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WirePart> birdParts) {
            AbstractC22565hB abstractC22565hB = AbstractC22565hB.this;
            Intrinsics.checkNotNullExpressionValue(birdParts, "birdParts");
            abstractC22565hB.mo36754H(birdParts);
            AbstractC22565hB.this.m36739W().mo103898A4(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hB$k */
    /* loaded from: classes3.dex */
    public static final class C22576k extends Lambda implements Function1<Throwable, Unit> {
        public C22576k() {
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
            AbstractC22565hB.this.m36739W().mo103898A4(false);
            if (th instanceof HttpException) {
                AbstractC22565hB.this.m36739W().error(th.getMessage());
            } else {
                AbstractC22565hB.this.m36739W().error(C45871nl4.error_generic_body);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LFQ3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hB$l */
    /* loaded from: classes3.dex */
    public static final class C22577l extends Lambda implements Function1<Unit, InterfaceC23447K<? extends FQ3>> {
        public C22577l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC22565hB.this.m36742T().m110485l(Permission.CAMERA);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hB$m */
    /* loaded from: classes3.dex */
    public static final class C22578m extends Lambda implements Function1<FQ3, Unit> {

        /* renamed from: h */
        public final /* synthetic */ List<BirdModel> f84804h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22578m(List<? extends BirdModel> list) {
            super(1);
            this.f84804h = list;
        }

        /* renamed from: a */
        public final void m36692a(FQ3 fq3) {
            if (fq3.m107154a()) {
                InterfaceC40099e13.C19924a.goToScanCode$default(AbstractC22565hB.this.m36745Q(), null, this.f84804h, null, null, false, false, false, null, 253, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m36692a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hB$n */
    /* loaded from: classes3.dex */
    public static final class C22579n extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ List<BirdModel> f84806h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22579n(List<? extends BirdModel> list) {
            super(1);
            this.f84806h = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToEnterCode$default(AbstractC22565hB.this.m36745Q(), this.f84806h, null, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hB$o */
    /* loaded from: classes3.dex */
    public static final class C22580o extends Lambda implements Function1<FQ3, Unit> {
        public C22580o() {
            super(1);
        }

        /* renamed from: a */
        public final void m36691a(FQ3 fq3) {
            if (fq3.m107154a()) {
                InterfaceC40099e13.C19924a.goToScanCode$default(AbstractC22565hB.this.m36745Q(), null, null, null, null, false, false, false, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m36691a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hB$p */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C22581p extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C22581p f84808b = new C22581p();

        public C22581p() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hB$q */
    /* loaded from: classes3.dex */
    public static final class C22582q extends Lambda implements Function1<Bird, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Throwable;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: hB$q$a */
        /* loaded from: classes3.dex */
        public static final class C22583a extends Lambda implements Function1<Throwable, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ AbstractC22565hB f84810g;

            /* renamed from: h */
            public final /* synthetic */ Bird f84811h;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: hB$q$a$a */
            /* loaded from: classes3.dex */
            public static final class C22584a extends Lambda implements Function1<Throwable, Unit> {

                /* renamed from: g */
                public final /* synthetic */ AbstractC22565hB f84812g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C22584a(AbstractC22565hB abstractC22565hB) {
                    super(1);
                    this.f84812g = abstractC22565hB;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    C41318g46.m40158f(th, "Failed to unlock battery in Id tools", new Object[0]);
                    this.f84812g.m36739W().error(C45871nl4.error_generic_title);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22583a(AbstractC22565hB abstractC22565hB, Bird bird) {
                super(1);
                this.f84810g = abstractC22565hB;
                this.f84811h = bird;
            }

            public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC23496h invoke(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                C41318g46.m40159e(it);
                InterfaceC36185To0 m36748N = this.f84810g.m36748N();
                Bird bird = this.f84811h;
                Intrinsics.checkNotNullExpressionValue(bird, "bird");
                AbstractC23461c mo31804k = m36748N.mo31804k(bird, false);
                final C22584a c22584a = new C22584a(this.f84810g);
                return mo31804k.m33084B(new InterfaceC23484g() { // from class: jB
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        AbstractC22565hB.C22582q.C22583a.invoke$lambda$0(Function1.this, obj);
                    }
                }).m33069Q();
            }
        }

        public C22582q() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC23496h m36688c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(Bird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            AbstractC23461c mo31804k = AbstractC22565hB.this.m36748N().mo31804k(bird, true);
            final C22583a c22583a = new C22583a(AbstractC22565hB.this, bird);
            return mo31804k.m33067S(new InterfaceC23492o() { // from class: iB
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m36688c;
                    m36688c = AbstractC22565hB.C22582q.m36688c(Function1.this, obj);
                    return m36688c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hB$r */
    /* loaded from: classes3.dex */
    public static final class C22585r extends Lambda implements Function1<Throwable, Unit> {
        public C22585r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Failed to fetch bird information to lock battery", new Object[0]);
            AbstractC22565hB.this.m36739W().error(C45871nl4.error_generic_title);
        }
    }

    public AbstractC22565hB(InterfaceC45686nS1 idToolsManager, InterfaceC46473om3 operatorManager, InterfaceC27246pJ bluetoothManager, InterfaceC7381SM birdPartManager, InterfaceC10163ZF beaconConfigurationManager, InterfaceC1880Ea analyticsManager, DQ3 permissionManager, InterfaceC36149Tk0 clipboardManager, InterfaceC10636aM birdManager, InterfaceC36185To0 commandManager, InterfaceC40099e13 navigator, GR1 ui, ScopeProvider scopeProvider, String sessionId) {
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
        this.f84772a = idToolsManager;
        this.f84773b = operatorManager;
        this.f84774c = bluetoothManager;
        this.f84775d = birdPartManager;
        this.f84776e = beaconConfigurationManager;
        this.f84777f = analyticsManager;
        this.f84778g = permissionManager;
        this.f84779h = clipboardManager;
        this.f84780i = birdManager;
        this.f84781j = commandManager;
        this.f84782k = navigator;
        this.f84783l = ui;
        this.f84784m = scopeProvider;
        this.f84785n = sessionId;
        this.f84789r = new ArrayList();
        ui.mo103891Ni(false);
        ui.mo103892M4(false);
        Object m33094as = ui.mo103875d0().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22566a c22566a = new C22566a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: RA
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC22565hB.m36761A(Function1.this, obj);
            }
        });
        Observable<Pair<PartKind, String>> observeOn = ui.mo103896Bd().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.idLongClicks()\n      …dSchedulers.mainThread())");
        Object m33094as2 = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22567b c22567b = new C22567b();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: SA
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC22565hB.m36760B(Function1.this, obj);
            }
        });
        Observable<Unit> mo103893Hk = ui.mo103893Hk();
        final C22568c c22568c = new C22568c();
        AbstractC23461c flatMapCompletable = mo103893Hk.flatMapCompletable(new InterfaceC23492o() { // from class: TA
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m36759C;
                m36759C = AbstractC22565hB.m36759C(Function1.this, obj);
                return m36759C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "ui.chirpClicks()\n      .… Completable.complete() }");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable<Unit> mo103888Q9 = ui.mo103888Q9();
        final C22569d c22569d = new C22569d();
        Observable<R> flatMap = mo103888Q9.flatMap(new InterfaceC23492o() { // from class: UA
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m36758D;
                m36758D = AbstractC22565hB.m36758D(Function1.this, obj);
                return m36758D;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "ui.headlightsClicks()\n  …} ?: Observable.empty() }");
        Object m33094as3 = flatMap.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as3).subscribe();
    }

    /* renamed from: A */
    public static final void m36761A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m36760B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC23496h m36759C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final InterfaceC23434B m36758D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final InterfaceC23496h m36756F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m36755G(AbstractC22565hB this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f84783l.mo103890Nj();
    }

    /* renamed from: X */
    public static final void m36738X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m36737Y(AbstractC22565hB this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f84783l.mo103891Ni(true);
    }

    /* renamed from: Z */
    public static final void m36736Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final List m36734a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m36733b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m36731c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final InterfaceC23447K m36730d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m36728e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m36727f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m36723h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m36721i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final InterfaceC23447K m36711n0(AbstractC22565hB this$0, String birdId) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(birdId, "$birdId");
        return this$0.f84773b.mo8118a(birdId).firstOrError();
    }

    /* renamed from: o0 */
    public static final InterfaceC23496h m36709o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final void m36707p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public final AbstractC23461c m36757E(WireBird wireBird) {
        AbstractC23461c mo31806i = this.f84781j.mo31806i(wireBird, wireBird.getBluetooth());
        final C22571f c22571f = new C22571f(wireBird);
        AbstractC23461c m33029z = mo31806i.m33067S(new InterfaceC23492o() { // from class: cB
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m36756F;
                m36756F = AbstractC22565hB.m36756F(Function1.this, obj);
                return m36756F;
            }
        }).m33070P(C23454a.m33087a()).m33029z(new InterfaceC23478a() { // from class: dB
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                AbstractC22565hB.m36755G(AbstractC22565hB.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "private fun chirpBird(bi…ui.showChirpToast() }\n  }");
        return m33029z;
    }

    /* renamed from: H */
    public void mo36754H(List<WirePart> parts) {
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f84783l.mo103892M4(true);
        this.f84783l.mo103881W2(this.f84789r);
    }

    /* renamed from: I */
    public final InterfaceC1880Ea m36753I() {
        return this.f84777f;
    }

    /* renamed from: J */
    public final InterfaceC10163ZF m36752J() {
        return this.f84776e;
    }

    /* renamed from: K */
    public final WireBird m36751K() {
        return this.f84786o;
    }

    /* renamed from: L */
    public final List<WirePart> m36750L() {
        return this.f84789r;
    }

    /* renamed from: M */
    public final InterfaceC36149Tk0 m36749M() {
        return this.f84779h;
    }

    /* renamed from: N */
    public final InterfaceC36185To0 m36748N() {
        return this.f84781j;
    }

    /* renamed from: O */
    public final InterfaceC45686nS1 m36747O() {
        return this.f84772a;
    }

    /* renamed from: P */
    public final WirePart m36746P() {
        return this.f84787p;
    }

    /* renamed from: Q */
    public final InterfaceC40099e13 m36745Q() {
        return this.f84782k;
    }

    /* renamed from: R */
    public final InterfaceC46473om3 m36744R() {
        return this.f84773b;
    }

    /* renamed from: S */
    public final IdToolOption m36743S() {
        IdToolOption idToolOption = this.f84788q;
        if (idToolOption != null) {
            return idToolOption;
        }
        Intrinsics.throwUninitializedPropertyAccessException("option");
        return null;
    }

    /* renamed from: T */
    public final DQ3 m36742T() {
        return this.f84778g;
    }

    /* renamed from: U */
    public final ScopeProvider m36741U() {
        return this.f84784m;
    }

    /* renamed from: V */
    public final String m36740V() {
        return this.f84785n;
    }

    /* renamed from: W */
    public final GR1 m36739W() {
        return this.f84783l;
    }

    @Override // p000.FR1
    /* renamed from: a */
    public void mo36735a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
    }

    @Override // p000.FR1
    /* renamed from: b */
    public void mo1371b(WireBird bird, WirePart wirePart) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f84786o = bird;
        this.f84787p = wirePart;
        if (WireBirdKt.isSwappable(bird) && m36743S() == IdToolOption.BATTERY_SERIAL) {
            this.f84783l.mo103879ac(true);
            Object m33041n = m36713m0(bird.getId()).m33041n(AutoDispose.m45239a(this.f84784m));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            ((CompletableSubscribeProxy) m33041n).subscribe();
        } else {
            this.f84783l.mo103879ac(false);
        }
        AbstractC23442F m33152N = C28237sD.progress$default(this.f84775d.mo78564b(bird.getId()), this.f84783l, 0, 2, (Object) null).m33152N(C23454a.m33087a()).m33110r(new InterfaceC23478a() { // from class: NA
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                AbstractC22565hB.m36737Y(AbstractC22565hB.this);
            }
        }).m33152N(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33152N, "birdPartManager.getParts…bserveOn(Schedulers.io())");
        AbstractC23442F m70883l = C38096ag5.m70883l(m33152N);
        final C22573h c22573h = new C22573h();
        AbstractC23442F m33101w = m70883l.m33101w(new InterfaceC23484g() { // from class: YA
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC22565hB.m36736Z(Function1.this, obj);
            }
        });
        final C22574i c22574i = new C22574i();
        AbstractC23442F m33152N2 = m33101w.m33157I(new InterfaceC23492o() { // from class: ZA
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m36734a0;
                m36734a0 = AbstractC22565hB.m36734a0(Function1.this, obj);
                return m36734a0;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N2, "override fun onBirdIdent…y)\n        }\n      })\n  }");
        Object m33135e = m33152N2.m33135e(AutoDispose.m45239a(this.f84784m));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22575j c22575j = new C22575j();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: aB
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC22565hB.m36733b0(Function1.this, obj);
            }
        };
        final C22576k c22576k = new C22576k();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: bB
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC22565hB.m36731c0(Function1.this, obj);
            }
        });
    }

    @Override // p000.FR1
    /* renamed from: c */
    public void mo36732c() {
        this.f84782k.mo37030e3();
    }

    @Override // p000.FR1
    /* renamed from: e */
    public void mo36729e() {
        this.f84790s = true;
        AbstractC23442F<FQ3> m33152N = this.f84778g.m110485l(Permission.CAMERA).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "permissionManager.reques…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f84784m));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22580o c22580o = new C22580o();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: OA
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC22565hB.m36723h0(Function1.this, obj);
            }
        };
        final C22581p c22581p = C22581p.f84808b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: PA
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC22565hB.m36721i0(Function1.this, obj);
            }
        });
    }

    @Override // p000.FR1
    /* renamed from: f */
    public void mo1369f(IdToolOption option, boolean z) {
        List<BirdModel> v2BrainList;
        Intrinsics.checkNotNullParameter(option, "option");
        m36717k0(option);
        this.f84783l.mo103891Ni(z);
        int i = C22570e.$EnumSwitchMapping$0[option.ordinal()];
        if (i != 1) {
            if (i != 2) {
                v2BrainList = null;
            } else {
                v2BrainList = BirdModel.Companion.getBirdOnePcmList();
            }
        } else {
            v2BrainList = BirdModel.Companion.getV2BrainList();
        }
        Observable<Unit> mo103873h = this.f84783l.mo103873h();
        final C22577l c22577l = new C22577l();
        Observable<R> flatMapSingle = mo103873h.flatMapSingle(new InterfaceC23492o() { // from class: eB
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m36730d0;
                m36730d0 = AbstractC22565hB.m36730d0(Function1.this, obj);
                return m36730d0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "@CallSuper\n  override fu…trictModels)\n      }\n\n  }");
        Object m33094as = flatMapSingle.m33094as(AutoDispose.m45239a(this.f84784m));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22578m c22578m = new C22578m(v2BrainList);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: fB
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC22565hB.m36728e0(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f84783l.mo103872n().m33094as(AutoDispose.m45239a(this.f84784m));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22579n c22579n = new C22579n(v2BrainList);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: gB
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC22565hB.m36727f0(Function1.this, obj);
            }
        });
    }

    /* renamed from: g0 */
    public final String m36725g0(String code) {
        boolean contains$default;
        List split$default;
        List split$default2;
        Intrinsics.checkNotNullParameter(code, "code");
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) code, (CharSequence) Detail.EMPTY_CHAR, false, 2, (Object) null);
        if (contains$default) {
            split$default2 = StringsKt__StringsKt.split$default((CharSequence) code, new String[]{Detail.EMPTY_CHAR}, false, 0, 6, (Object) null);
            return (String) split$default2.get(1);
        }
        split$default = StringsKt__StringsKt.split$default((CharSequence) code, new String[]{";"}, false, 0, 6, (Object) null);
        return (String) split$default.get(0);
    }

    /* renamed from: j0 */
    public final void m36719j0(WirePart wirePart) {
        this.f84787p = wirePart;
    }

    /* renamed from: k0 */
    public final void m36717k0(IdToolOption idToolOption) {
        Intrinsics.checkNotNullParameter(idToolOption, "<set-?>");
        this.f84788q = idToolOption;
    }

    /* renamed from: l0 */
    public final Observable<WireBird> m36715l0(WireBird wireBird) {
        Observable<WireBird> just = Observable.just(wireBird);
        Intrinsics.checkNotNullExpressionValue(just, "just(bird)");
        return just;
    }

    /* renamed from: m0 */
    public AbstractC23461c m36713m0(final String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F m33042m = this.f84773b.mo8133S0(birdId).m33042m(AbstractC23442F.m33124k(new Callable() { // from class: VA
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23447K m36711n0;
                m36711n0 = AbstractC22565hB.m36711n0(AbstractC22565hB.this, birdId);
                return m36711n0;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(m33042m, "operatorManager.fetchBir…birdId).firstOrError() })");
        AbstractC23442F progress$default = C28237sD.progress$default(m33042m, this.f84783l, 0, 2, (Object) null);
        final C22582q c22582q = new C22582q();
        AbstractC23461c m33164B = progress$default.m33164B(new InterfaceC23492o() { // from class: WA
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m36709o0;
                m36709o0 = AbstractC22565hB.m36709o0(Function1.this, obj);
                return m36709o0;
            }
        });
        final C22585r c22585r = new C22585r();
        AbstractC23461c m33069Q = m33164B.m33084B(new InterfaceC23484g() { // from class: XA
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC22565hB.m36707p0(Function1.this, obj);
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "override fun unlockBatte…   .onErrorComplete()\n  }");
        return m33069Q;
    }

    @Override // p000.FR1
    public void onBackPressed() {
        if (this.f84790s) {
            AbstractC23442F m33152N = H31.C3014a.dialog$default(this.f84783l, C35719Ro2.f32625d, false, false, 6, null).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "ui.dialog(LeavePageConfi…dSchedulers.mainThread())");
            Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f84784m));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C22572g c22572g = new C22572g();
            ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: QA
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    AbstractC22565hB.m36738X(Function1.this, obj);
                }
            });
            return;
        }
        this.f84782k.close();
    }

    @Override // p000.FR1
    public void onPause() {
    }

    @Override // p000.FR1
    public void onResume() {
    }
}
