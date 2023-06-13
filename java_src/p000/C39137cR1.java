package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.feature.servicecenter.idtools.identify.IdAction;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.IdToolOption;
import co.bird.android.model.RadarTagMetadata;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.persistence.BrainSwapRecord;
import co.bird.android.model.persistence.nestedstructures.Part;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePart;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.joda.time.DateTime;
import org.joda.time.Seconds;
import p000.C39137cR1;
import p000.C45672nQ5;
import p000.FQ5;
import p000.GR1;
import p000.H31;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001bB\u0099\u0001\b\u0007\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010G\u001a\u00020F\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010O\u001a\u00020N\u0012\u0006\u0010Q\u001a\u00020P\u0012\u0006\u0010S\u001a\u00020R\u0012\u0006\u0010U\u001a\u00020T\u0012\u0006\u0010W\u001a\u00020V\u0012\u0006\u0010Y\u001a\u00020X\u0012\u0006\u0010[\u001a\u00020Z\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,¢\u0006\u0004\b\\\u0010]J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00100\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\"\u0010\u0013\u001a\u00020\u00072\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00100\rH\u0002J(\u0010\u0016\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00100\r0\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\f*\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\u0016\u0010\u001c\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J\u001a\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0005H\u0016R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010<¨\u0006^"}, m28432d2 = {"LcR1;", "LhB;", "Lco/bird/android/model/wire/WireBird;", "bird", "", "Lco/bird/android/model/wire/WirePart;", "parts", "", "W0", "(Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/wire/WirePart;)V", "Lco/bird/android/model/IdToolOption;", "option", "Lio/reactivex/F;", "Lkotlin/Pair;", "", "LH6;", "", "d1", "pair", "v1", "", "e", "t1", "Lio/reactivex/p;", "Lco/bird/android/model/persistence/BrainSwapRecord;", "b1", "showStepOne", "f", "H", "part", "b", DateTokenConverter.CONVERTER_KEY, "LTq4;", "t", "LTq4;", "reactiveConfig", "Ln10;", "u", "Ln10;", "brainSwapManager", "Lrd5;", "v", "Lrd5;", "rxBleBirdBluetoothManager", "LmQ1;", "w", "LmQ1;", "statusConverter", "Lco/bird/android/model/RadarTagMetadata;", "x", "Lco/bird/android/model/RadarTagMetadata;", "radarTagMetadata", "y", "Lco/bird/android/model/wire/WirePart;", "sourcePart", "z", "Lco/bird/android/model/IdToolOption;", "idToolOption", "", "i1", "()I", "brainSwapTimeoutSeconds", "h1", "brainSwapTimeoutMin", "LnS1;", "idToolsManager", "Lom3;", "operatorManager", "LSM;", "birdPartManager", "LpJ;", "bluetoothManager", "LZF;", "beaconConfigurationManager", "LEa;", "analyticsManager", "LDQ3;", "permissionManager", "LTk0;", "clipboardManager", "LaM;", "birdManager", "LTo0;", "commandManager", "Le13;", "navigator", "LGR1;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "", "sessionId", "<init>", "(LnS1;Lom3;LSM;LpJ;LZF;LEa;LDQ3;LTk0;LaM;LTo0;Le13;LGR1;Lcom/uber/autodispose/ScopeProvider;Ljava/lang/String;LTq4;Ln10;Lrd5;LmQ1;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdToolsIdentifyAssociatePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsIdentifyAssociatePresenter.kt\nco/bird/android/feature/servicecenter/idtools/identify/associate/IdToolsIdentifyAssociatePresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,418:1\n180#2:419\n180#2:420\n180#2:421\n237#2:422\n237#2:423\n199#2:424\n180#2:425\n199#2:426\n199#2:431\n11335#3:427\n11670#3,3:428\n*S KotlinDebug\n*F\n+ 1 IdToolsIdentifyAssociatePresenter.kt\nco/bird/android/feature/servicecenter/idtools/identify/associate/IdToolsIdentifyAssociatePresenter\n*L\n143#1:419\n155#1:420\n164#1:421\n175#1:422\n196#1:423\n208#1:424\n238#1:425\n265#1:426\n350#1:431\n269#1:427\n269#1:428,3\n*E\n"})
/* renamed from: cR1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39137cR1 extends AbstractC22565hB {

    /* renamed from: t */
    public final C36207Tq4 f60622t;

    /* renamed from: u */
    public final InterfaceC45433n10 f60623u;

    /* renamed from: v */
    public final InterfaceC48164rd5 f60624v;

    /* renamed from: w */
    public final InterfaceC45075mQ1 f60625w;

    /* renamed from: x */
    public RadarTagMetadata f60626x;

    /* renamed from: y */
    public WirePart f60627y;

    /* renamed from: z */
    public IdToolOption f60628z;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "LH6;", "sections", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cR1$A */
    /* loaded from: classes3.dex */
    public static final class C13544A extends Lambda implements Function1<List<? extends C3023H6>, Pair<? extends List<? extends C3023H6>, ? extends Boolean>> {

        /* renamed from: g */
        public static final C13544A f60629g = new C13544A();

        public C13544A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<List<C3023H6>, Boolean> invoke(List<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            return TuplesKt.m28425to(sections, Boolean.FALSE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cR1$a */
    /* loaded from: classes3.dex */
    public static final class C13545a extends Lambda implements Function1<Unit, InterfaceC23434B<? extends Pair<? extends WireBird, ? extends WirePart>>> {
        public C13545a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Pair<WireBird, WirePart>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            WireBird m36751K = C39137cR1.this.m36751K();
            WirePart wirePart = C39137cR1.this.f60627y;
            if (m36751K != null && wirePart != null && C39137cR1.this.m36746P() != null) {
                return Observable.just(TuplesKt.m28425to(m36751K, wirePart));
            }
            return Observable.empty();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001az\u00126\b\u0001\u00122\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0006*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00050\u0005 \u0006*<\u00126\b\u0001\u00122\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0006*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/wire/WirePart;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lkotlin/Triple;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cR1$b */
    /* loaded from: classes3.dex */
    public static final class C13546b extends Lambda implements Function1<Pair<? extends WireBird, ? extends WirePart>, InterfaceC24574u<? extends Triple<? extends WireBird, ? extends WirePart, ? extends WirePart>>> {

        /* renamed from: g */
        public final /* synthetic */ GR1 f60631g;

        /* renamed from: h */
        public final /* synthetic */ C39137cR1 f60632h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: cR1$b$a */
        /* loaded from: classes3.dex */
        public static final class C13547a extends Lambda implements Function1<DialogResponse, Boolean> {

            /* renamed from: g */
            public static final C13547a f60633g = new C13547a();

            public C13547a() {
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

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a2\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lkotlin/Triple;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: cR1$b$b */
        /* loaded from: classes3.dex */
        public static final class C13548b extends Lambda implements Function1<DialogResponse, Triple<? extends WireBird, ? extends WirePart, ? extends WirePart>> {

            /* renamed from: g */
            public final /* synthetic */ WireBird f60634g;

            /* renamed from: h */
            public final /* synthetic */ WirePart f60635h;

            /* renamed from: i */
            public final /* synthetic */ C39137cR1 f60636i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13548b(WireBird wireBird, WirePart wirePart, C39137cR1 c39137cR1) {
                super(1);
                this.f60634g = wireBird;
                this.f60635h = wirePart;
                this.f60636i = c39137cR1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Triple<WireBird, WirePart, WirePart> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Triple<>(this.f60634g, this.f60635h, this.f60636i.m36746P());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13546b(GR1 gr1, C39137cR1 c39137cR1) {
            super(1);
            this.f60631g = gr1;
            this.f60632h = c39137cR1;
        }

        /* renamed from: d */
        public static final Triple m61347d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends Triple<WireBird, WirePart, WirePart>> invoke(Pair<WireBird, WirePart> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WirePart component2 = pair.component2();
            AbstractC23442F dialog$default = H31.C3014a.dialog$default(this.f60631g, new C43802kG4(this.f60632h.m36743S(), component2.getKey()), false, false, 6, null);
            final C13547a c13547a = C13547a.f60633g;
            AbstractC24507p m33098z = dialog$default.m33098z(new InterfaceC23494q() { // from class: dR1
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = C39137cR1.C13546b.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C13548b c13548b = new C13548b(pair.component1(), component2, this.f60632h);
            return m33098z.m32067H(new InterfaceC23492o() { // from class: eR1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Triple m61347d;
                    m61347d = C39137cR1.C13546b.m61347d(Function1.this, obj);
                    return m61347d;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0010\u0007\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005 \u0006*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/wire/WirePart;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Triple;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cR1$c */
    /* loaded from: classes3.dex */
    public static final class C13549c extends Lambda implements Function1<Triple<? extends WireBird, ? extends WirePart, ? extends WirePart>, Pair<? extends WireBird, ? extends WirePart[]>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: cR1$c$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C13550a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IdToolOption.values().length];
                try {
                    iArr[IdToolOption.ONE_CODE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C13549c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<WireBird, WirePart[]> invoke(Triple<WireBird, WirePart, WirePart> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            WireBird component1 = triple.component1();
            WirePart component2 = triple.component2();
            return TuplesKt.m28425to(component1, C13550a.$EnumSwitchMapping$0[C39137cR1.this.m36743S().ordinal()] == 1 ? new WirePart[]{component2, WirePart.copy$default(component2, null, PartKind.PLATE, null, 5, null)} : new WirePart[]{component2});
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "", "Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cR1$d */
    /* loaded from: classes3.dex */
    public static final class C13551d extends Lambda implements Function1<Pair<? extends WireBird, ? extends WirePart[]>, Unit> {
        public C13551d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireBird, ? extends WirePart[]> pair) {
            invoke2((Pair<WireBird, WirePart[]>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireBird, WirePart[]> pair) {
            WirePart[] component2 = pair.component2();
            C39137cR1.this.m61390W0(pair.component1(), (WirePart[]) Arrays.copyOf(component2, component2.length));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"LcR1$f;", "", "Lco/bird/android/model/persistence/BrainSwapRecord;", "b", "Lco/bird/android/model/persistence/BrainSwapRecord;", C17296a.f69688o, "()Lco/bird/android/model/persistence/BrainSwapRecord;", "record", "<init>", "(Lco/bird/android/model/persistence/BrainSwapRecord;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: cR1$f */
    /* loaded from: classes3.dex */
    public static final class C13556f extends Throwable {

        /* renamed from: b */
        public final BrainSwapRecord f60647b;

        public C13556f(BrainSwapRecord record) {
            Intrinsics.checkNotNullParameter(record, "record");
            this.f60647b = record;
        }

        /* renamed from: a */
        public final BrainSwapRecord m61338a() {
            return this.f60647b;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cR1$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13557g {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdToolOption.values().length];
            try {
                iArr[IdToolOption.BEACON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/wire/WirePart;", "swappedParts", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cR1$h */
    /* loaded from: classes3.dex */
    public static final class C13558h extends Lambda implements Function1<List<? extends WirePart>, InterfaceC23447K<? extends List<? extends WirePart>>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f60649h;

        /* renamed from: i */
        public final /* synthetic */ WirePart[] f60650i;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: cR1$h$a */
        /* loaded from: classes3.dex */
        public static final class C13559a extends Lambda implements Function1<DialogResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C39137cR1 f60651g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13559a(C39137cR1 c39137cR1) {
                super(1);
                this.f60651g = c39137cR1;
            }

            /* renamed from: a */
            public final void m61330a(DialogResponse dialogResponse) {
                if (dialogResponse == DialogResponse.OK) {
                    this.f60651g.m36745Q().mo37030e3();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                m61330a(dialogResponse);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/K;", "", "Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: cR1$h$b */
        /* loaded from: classes3.dex */
        public static final class C13560b extends Lambda implements Function1<DialogResponse, InterfaceC23447K<? extends List<? extends WirePart>>> {

            /* renamed from: g */
            public final /* synthetic */ List<WirePart> f60652g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13560b(List<WirePart> list) {
                super(1);
                this.f60652g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends List<WirePart>> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC23442F.m33158H(this.f60652g);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13558h(WireBird wireBird, WirePart[] wirePartArr) {
            super(1);
            this.f60649h = wireBird;
            this.f60650i = wirePartArr;
        }

        /* renamed from: e */
        public static final void m61333e(C39137cR1 this$0, WireBird bird) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(bird, "$bird");
            this$0.mo1371b(bird, null);
        }

        /* renamed from: f */
        public static final void m61332f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: g */
        public static final InterfaceC23447K m61331g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23447K<? extends List<WirePart>> invoke(List<WirePart> swappedParts) {
            Object first;
            List listOf;
            Intrinsics.checkNotNullParameter(swappedParts, "swappedParts");
            if (C39137cR1.this.m36743S() == IdToolOption.BRAIN) {
                InterfaceC45433n10 interfaceC45433n10 = C39137cR1.this.f60623u;
                String id = this.f60649h.getId();
                String id2 = this.f60650i[0].getId();
                String key = this.f60650i[0].getKey();
                String code = this.f60649h.getCode();
                first = ArraysKt___ArraysKt.first(this.f60650i);
                Part m9024a = C50289vC6.m9024a((WirePart) first);
                DateTime now = DateTime.now();
                Intrinsics.checkNotNullExpressionValue(now, "now()");
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{C39137cR1.this.f60623u.mo21981h0(this.f60649h.getId()), interfaceC45433n10.mo21980l0(new BrainSwapRecord(id, id2, key, code, m9024a, null, now))});
                AbstractC23461c m33070P = AbstractC23461c.m33037r(listOf).m33070P(C23454a.m33087a());
                final C39137cR1 c39137cR1 = C39137cR1.this;
                final WireBird wireBird = this.f60649h;
                AbstractC23461c m33029z = m33070P.m33029z(new InterfaceC23478a() { // from class: hR1
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C39137cR1.C13558h.m61333e(C39137cR1.this, wireBird);
                    }
                });
                AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(C39137cR1.this.m36739W(), new C50176v10(C39137cR1.this.m61376h1()), false, false, 6, null);
                final C13559a c13559a = new C13559a(C39137cR1.this);
                AbstractC23442F m33101w = birdDialog$default.m33101w(new InterfaceC23484g() { // from class: iR1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C39137cR1.C13558h.m61332f(Function1.this, obj);
                    }
                });
                final C13560b c13560b = new C13560b(swappedParts);
                return m33029z.m33042m(m33101w.m33165A(new InterfaceC23492o() { // from class: jR1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23447K m61331g;
                        m61331g = C39137cR1.C13558h.m61331g(Function1.this, obj);
                        return m61331g;
                    }
                }));
            }
            return AbstractC23442F.m33158H(swappedParts);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001ar\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004 \u0007*8\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "Lco/bird/android/model/wire/WirePart;", "it", "Lio/reactivex/K;", "Lkotlin/Pair;", "LH6;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cR1$i */
    /* loaded from: classes3.dex */
    public static final class C13561i extends Lambda implements Function1<List<? extends WirePart>, InterfaceC23447K<? extends Pair<? extends List<? extends C3023H6>, ? extends Boolean>>> {
        public C13561i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Pair<List<C3023H6>, Boolean>> invoke(List<WirePart> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C39137cR1 c39137cR1 = C39137cR1.this;
            return c39137cR1.m61382d1(c39137cR1.m36743S());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\n\u001ar\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003 \u0007*8\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "e", "Lio/reactivex/K;", "Lkotlin/Pair;", "", "LH6;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cR1$j */
    /* loaded from: classes3.dex */
    public static final class C13562j extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends Pair<? extends List<? extends C3023H6>, ? extends Boolean>>> {
        public C13562j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Pair<List<C3023H6>, Boolean>> invoke(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if (C39137cR1.this.m36743S() == IdToolOption.BRAIN) {
                C39137cR1.this.m36739W().errorGeneric();
                return AbstractC23442F.m33153M();
            }
            return C39137cR1.this.m61360t1(e);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cR1$k */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13563k extends FunctionReferenceImpl implements Function1<Pair<? extends List<? extends C3023H6>, ? extends Boolean>, Unit> {
        public C13563k(Object obj) {
            super(1, obj, C39137cR1.class, "onSuccess", "onSuccess(Lkotlin/Pair;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends C3023H6>, ? extends Boolean> pair) {
            invoke2((Pair<? extends List<C3023H6>, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<C3023H6>, Boolean> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C39137cR1) this.receiver).m61356v1(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/BrainSwapRecord;", "record", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "e", "(Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cR1$l */
    /* loaded from: classes3.dex */
    public static final class C13564l extends Lambda implements Function1<BrainSwapRecord, InterfaceC23447K<? extends BrainSwapRecord>> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/persistence/BrainSwapRecord;", "record", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/BrainSwapRecord;)Lco/bird/android/model/persistence/BrainSwapRecord;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: cR1$l$a */
        /* loaded from: classes3.dex */
        public static final class C13565a extends Lambda implements Function1<BrainSwapRecord, BrainSwapRecord> {

            /* renamed from: g */
            public static final C13565a f60656g = new C13565a();

            public C13565a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final BrainSwapRecord invoke(BrainSwapRecord record) {
                Intrinsics.checkNotNullParameter(record, "record");
                if (record.getStatus() != null) {
                    return record;
                }
                throw new C13556f(record);
            }
        }

        public C13564l() {
            super(1);
        }

        /* renamed from: f */
        public static final InterfaceC23496h m61322f(C39137cR1 this$0, BrainSwapRecord record, Object it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(record, "$record");
            Intrinsics.checkNotNullParameter(it, "it");
            return this$0.f60623u.mo21985B0(record.getImei());
        }

        /* renamed from: g */
        public static final InterfaceC23447K m61321g(C39137cR1 this$0, BrainSwapRecord record) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(record, "$record");
            AbstractC23442F<BrainSwapRecord> firstOrError = this$0.f60623u.mo21984E0(record.getBirdId()).firstOrError();
            final C13565a c13565a = C13565a.f60656g;
            return firstOrError.m33157I(new InterfaceC23492o() { // from class: nR1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    BrainSwapRecord m61320h;
                    m61320h = C39137cR1.C13564l.m61320h(Function1.this, obj);
                    return m61320h;
                }
            });
        }

        /* renamed from: h */
        public static final BrainSwapRecord m61320h(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (BrainSwapRecord) tmp0.invoke(obj);
        }

        /* renamed from: i */
        public static final boolean m61319i(C39137cR1 this$0, Throwable e) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(e, "e");
            if ((e instanceof C13556f) && ((C13556f) e).m61338a().getCreatedAt().plusSeconds(this$0.m61375i1()).isAfterNow()) {
                return true;
            }
            return false;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final InterfaceC23447K<? extends BrainSwapRecord> invoke(final BrainSwapRecord record) {
            int coerceAtLeast;
            Intrinsics.checkNotNullParameter(record, "record");
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(Seconds.secondsBetween(DateTime.now(), record.getCreatedAt().plusSeconds(C39137cR1.this.m61375i1())).getSeconds(), 0);
            Observable merge = Observable.merge(Observable.timer(coerceAtLeast, TimeUnit.SECONDS), Observable.just(Unit.INSTANCE));
            final C39137cR1 c39137cR1 = C39137cR1.this;
            AbstractC23461c flatMapCompletable = merge.flatMapCompletable(new InterfaceC23492o() { // from class: kR1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m61322f;
                    m61322f = C39137cR1.C13564l.m61322f(C39137cR1.this, record, obj);
                    return m61322f;
                }
            });
            final C39137cR1 c39137cR12 = C39137cR1.this;
            AbstractC23442F m33042m = flatMapCompletable.m33042m(AbstractC23442F.m33124k(new Callable() { // from class: lR1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23447K m61321g;
                    m61321g = C39137cR1.C13564l.m61321g(C39137cR1.this, record);
                    return m61321g;
                }
            }));
            final C39137cR1 c39137cR13 = C39137cR1.this;
            return m33042m.m33143W(SN4.m85592l(new InterfaceC23494q() { // from class: mR1
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m61319i;
                    m61319i = C39137cR1.C13564l.m61319i(C39137cR1.this, (Throwable) obj);
                    return m61319i;
                }
            }).m85584b(1L, TimeUnit.MINUTES).m85585a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "LH6;", "sections", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cR1$m */
    /* loaded from: classes3.dex */
    public static final class C13566m extends Lambda implements Function1<List<? extends C3023H6>, Pair<? extends List<? extends C3023H6>, ? extends Boolean>> {

        /* renamed from: g */
        public static final C13566m f60657g = new C13566m();

        public C13566m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<List<C3023H6>, Boolean> invoke(List<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            return TuplesKt.m28425to(sections, Boolean.TRUE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "macAddress", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cR1$n */
    /* loaded from: classes3.dex */
    public static final class C13567n extends Lambda implements Function1<String, Unit> {
        public C13567n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String macAddress) {
            C39137cR1 c39137cR1 = C39137cR1.this;
            PartKind partKind = PartKind.BEACON;
            Intrinsics.checkNotNullExpressionValue(macAddress, "macAddress");
            c39137cR1.mo1370d(new WirePart(null, partKind, macAddress, 1, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cR1$o */
    /* loaded from: classes3.dex */
    public static final class C13568o extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C13568o f60659g = new C13568o();

        public C13568o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while detecting nearby beacon", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/BrainSwapRecord;", "kotlin.jvm.PlatformType", "record", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/BrainSwapRecord;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cR1$p */
    /* loaded from: classes3.dex */
    public static final class C13569p extends Lambda implements Function1<BrainSwapRecord, Unit> {
        public C13569p() {
            super(1);
        }

        /* renamed from: a */
        public final void m61316a(BrainSwapRecord brainSwapRecord) {
            if (C39137cR1.this.f60627y == null) {
                C39137cR1.this.f60627y = new WirePart(brainSwapRecord.getPartId(), PartKind.BRAIN, brainSwapRecord.getImei());
            }
            C39137cR1.this.m36739W().mo103895C8(brainSwapRecord.getStatus());
            C39137cR1.this.m36739W().mo103876c3(brainSwapRecord.getStatus(), brainSwapRecord.getCreatedAt());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrainSwapRecord brainSwapRecord) {
            m61316a(brainSwapRecord);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "e", "Lio/reactivex/K;", "Lco/bird/android/model/persistence/BrainSwapRecord;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cR1$q */
    /* loaded from: classes3.dex */
    public static final class C13570q extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends BrainSwapRecord>> {
        public C13570q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends BrainSwapRecord> invoke(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if (e instanceof C13556f) {
                C13556f c13556f = (C13556f) e;
                return C39137cR1.this.f60623u.mo21983U(c13556f.m61338a().getImei(), Boolean.FALSE).m33042m(AbstractC23442F.m33158H(c13556f.m61338a()));
            }
            return AbstractC23442F.m33100x(e);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/BrainSwapRecord;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/BrainSwapRecord;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cR1$r */
    /* loaded from: classes3.dex */
    public static final class C13571r extends Lambda implements Function1<BrainSwapRecord, Unit> {

        /* renamed from: g */
        public static final C13571r f60662g = new C13571r();

        public C13571r() {
            super(1);
        }

        /* renamed from: a */
        public final void m61315a(BrainSwapRecord brainSwapRecord) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrainSwapRecord brainSwapRecord) {
            m61315a(brainSwapRecord);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cR1$s */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13572s extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C13572s(Object obj) {
            super(1, obj, C38689bg5.class, "logAndDisplayError", "logAndDisplayError(Lco/bird/android/core/base/ui/SnackUi;Ljava/lang/Throwable;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            C38689bg5.m64175f((InterfaceC37910aM5) this.receiver, p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "<anonymous parameter 0>", "Lco/bird/android/model/persistence/BrainSwapRecord;", "record", C17296a.f69688o, "(Ljava/lang/Long;Lco/bird/android/model/persistence/BrainSwapRecord;)Lco/bird/android/model/persistence/BrainSwapRecord;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cR1$t */
    /* loaded from: classes3.dex */
    public static final class C13573t extends Lambda implements Function2<Long, BrainSwapRecord, BrainSwapRecord> {

        /* renamed from: g */
        public static final C13573t f60663g = new C13573t();

        public C13573t() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final BrainSwapRecord invoke(Long l, BrainSwapRecord record) {
            Intrinsics.checkNotNullParameter(l, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(record, "record");
            return record;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LFQ3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cR1$u */
    /* loaded from: classes3.dex */
    public static final class C13574u extends Lambda implements Function1<Unit, InterfaceC23447K<? extends FQ3>> {
        public C13574u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C39137cR1.this.m36742T().m110485l(Permission.CAMERA);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cR1$v */
    /* loaded from: classes3.dex */
    public static final class C13575v extends Lambda implements Function1<FQ3, Unit> {

        /* renamed from: h */
        public final /* synthetic */ IdToolOption f60666h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13575v(IdToolOption idToolOption) {
            super(1);
            this.f60666h = idToolOption;
        }

        /* renamed from: a */
        public final void m61313a(FQ3 fq3) {
            if (fq3.m107154a()) {
                InterfaceC40099e13.C19924a.goToScanCode$default(C39137cR1.this.m36745Q(), null, null, this.f60666h.getSourceKind(), null, false, false, false, null, 251, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m61313a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cR1$w */
    /* loaded from: classes3.dex */
    public static final class C13576w extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ IdToolOption f60668h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13576w(IdToolOption idToolOption) {
            super(1);
            this.f60668h = idToolOption;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToEnterCode$default(C39137cR1.this.m36745Q(), null, this.f60668h.getSourceKind(), 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cR1$x */
    /* loaded from: classes3.dex */
    public static final class C13577x extends Lambda implements Function1<Unit, Boolean> {
        public C13577x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Unit it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (C39137cR1.this.m36751K() != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cR1$y */
    /* loaded from: classes3.dex */
    public static final class C13578y extends Lambda implements Function1<Unit, InterfaceC23496h> {
        public C13578y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C39137cR1 c39137cR1 = C39137cR1.this;
            WireBird m36751K = c39137cR1.m36751K();
            Intrinsics.checkNotNull(m36751K);
            return c39137cR1.m36713m0(m36751K.getId());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cR1$z */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13579z extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C13579z f60671b = new C13579z();

        public C13579z() {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39137cR1(InterfaceC45686nS1 idToolsManager, InterfaceC46473om3 operatorManager, InterfaceC7381SM birdPartManager, InterfaceC27246pJ bluetoothManager, InterfaceC10163ZF beaconConfigurationManager, InterfaceC1880Ea analyticsManager, DQ3 permissionManager, InterfaceC36149Tk0 clipboardManager, InterfaceC10636aM birdManager, InterfaceC36185To0 commandManager, InterfaceC40099e13 navigator, GR1 ui, ScopeProvider scopeProvider, String sessionId, C36207Tq4 reactiveConfig, InterfaceC45433n10 brainSwapManager, InterfaceC48164rd5 rxBleBirdBluetoothManager, InterfaceC45075mQ1 statusConverter) {
        super(idToolsManager, operatorManager, bluetoothManager, birdPartManager, beaconConfigurationManager, analyticsManager, permissionManager, clipboardManager, birdManager, commandManager, navigator, ui, scopeProvider, sessionId);
        Intrinsics.checkNotNullParameter(idToolsManager, "idToolsManager");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(birdPartManager, "birdPartManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
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
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(brainSwapManager, "brainSwapManager");
        Intrinsics.checkNotNullParameter(rxBleBirdBluetoothManager, "rxBleBirdBluetoothManager");
        Intrinsics.checkNotNullParameter(statusConverter, "statusConverter");
        this.f60622t = reactiveConfig;
        this.f60623u = brainSwapManager;
        this.f60624v = rxBleBirdBluetoothManager;
        this.f60625w = statusConverter;
        Observable<Unit> mo103874f = ui.mo103874f();
        final C13545a c13545a = new C13545a();
        Observable<R> flatMap = mo103874f.flatMap(new InterfaceC23492o() { // from class: BQ1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m61395R0;
                m61395R0 = C39137cR1.m61395R0(Function1.this, obj);
                return m61395R0;
            }
        });
        final C13546b c13546b = new C13546b(ui, this);
        Observable flatMapMaybe = flatMap.flatMapMaybe(new InterfaceC23492o() { // from class: MQ1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m61394S0;
                m61394S0 = C39137cR1.m61394S0(Function1.this, obj);
                return m61394S0;
            }
        });
        final C13549c c13549c = new C13549c();
        Observable map = flatMapMaybe.map(new InterfaceC23492o() { // from class: UQ1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m61393T0;
                m61393T0 = C39137cR1.m61393T0(Function1.this, obj);
                return m61393T0;
            }
        });
        final C13551d c13551d = new C13551d();
        Observable doAfterNext = map.doAfterNext(new InterfaceC23484g() { // from class: VQ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39137cR1.m61392U0(Function1.this, obj);
            }
        });
        final C13552e c13552e = new C13552e(ui, navigator);
        Observable switchMap = doAfterNext.switchMap(new InterfaceC23492o() { // from class: WQ1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m61391V0;
                m61391V0 = C39137cR1.m61391V0(Function1.this, obj);
                return m61391V0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap, "ui.confirmClicks()\n     …      }\n        }\n      }");
        Object m33094as = switchMap.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
    }

    /* renamed from: R0 */
    public static final InterfaceC23434B m61395R0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: S0 */
    public static final InterfaceC24574u m61394S0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: T0 */
    public static final Pair m61393T0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: U0 */
    public static final void m61392U0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V0 */
    public static final InterfaceC23434B m61391V0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: X0 */
    public static final InterfaceC23447K m61389X0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Y0 */
    public static final InterfaceC23447K m61388Y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Z0 */
    public static final InterfaceC23447K m61387Z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: a1 */
    public static final void m61386a1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c1 */
    public static final InterfaceC23447K m61384c1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final InterfaceC23447K m61383d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m61381e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e1 */
    public static final Pair m61380e1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m61379f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f1 */
    public static final void m61378f1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g1 */
    public static final void m61377g1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j1 */
    public static final BrainSwapRecord m61374j1(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (BrainSwapRecord) tmp0.invoke(obj, obj2);
    }

    /* renamed from: k1 */
    public static final InterfaceC23434B m61373k1(Observable statusObservable) {
        Intrinsics.checkNotNullParameter(statusObservable, "$statusObservable");
        return statusObservable;
    }

    /* renamed from: l1 */
    public static final void m61372l1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m1 */
    public static final InterfaceC23447K m61371m1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: n1 */
    public static final void m61370n1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o1 */
    public static final void m61369o1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p1 */
    public static final void m61368p1() {
    }

    /* renamed from: q1 */
    public static final void m61366q1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r1 */
    public static final boolean m61364r1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: s1 */
    public static final InterfaceC23496h m61362s1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: u1 */
    public static final Pair m61358u1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    @Override // p000.AbstractC22565hB
    /* renamed from: H */
    public void mo36754H(List<WirePart> parts) {
        Intrinsics.checkNotNullParameter(parts, "parts");
        super.mo36754H(parts);
        if (C13557g.$EnumSwitchMapping$0[m36743S().ordinal()] == 1) {
            AbstractC23442F<String> m33140a0 = m36752J().mo44477a().m33140a0(10L, TimeUnit.SECONDS);
            Intrinsics.checkNotNullExpressionValue(m33140a0, "beaconConfigurationManag…out(10, TimeUnit.SECONDS)");
            Object m33135e = m33140a0.m33135e(AutoDispose.m45239a(m36741U()));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C13567n c13567n = new C13567n();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: RQ1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C39137cR1.m61378f1(Function1.this, obj);
                }
            };
            final C13568o c13568o = C13568o.f60659g;
            ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: SQ1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C39137cR1.m61377g1(Function1.this, obj);
                }
            });
        }
    }

    /* renamed from: W0 */
    public final void m61390W0(WireBird wireBird, WirePart... wirePartArr) {
        AbstractC23442F<List<WirePart>> mo6822a = m36747O().mo6822a(wireBird, (WirePart[]) Arrays.copyOf(wirePartArr, wirePartArr.length), m36740V(), this.f60626x);
        S74 mo12605oc = m36739W().mo12605oc();
        if (mo12605oc == null) {
            mo12605oc = m36739W();
        }
        AbstractC23442F m33152N = C28237sD.progress$default(mo6822a, mo12605oc, 0, 2, (Object) null).m33152N(C23454a.m33087a());
        final C13558h c13558h = new C13558h(wireBird, wirePartArr);
        AbstractC23442F m33165A = m33152N.m33165A(new InterfaceC23492o() { // from class: NQ1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m61389X0;
                m61389X0 = C39137cR1.m61389X0(Function1.this, obj);
                return m61389X0;
            }
        });
        final C13561i c13561i = new C13561i();
        AbstractC23442F m33165A2 = m33165A.m33165A(new InterfaceC23492o() { // from class: OQ1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m61388Y0;
                m61388Y0 = C39137cR1.m61388Y0(Function1.this, obj);
                return m61388Y0;
            }
        });
        final C13562j c13562j = new C13562j();
        AbstractC23442F m33152N2 = m33165A2.m33150P(new InterfaceC23492o() { // from class: PQ1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m61387Z0;
                m61387Z0 = C39137cR1.m61387Z0(Function1.this, obj);
                return m61387Z0;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N2, "private fun attachParts(…ubscribe(::onSuccess)\n  }");
        Object m33135e = m33152N2.m33135e(AutoDispose.m45239a(m36741U()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13563k c13563k = new C13563k(this);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: QQ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39137cR1.m61386a1(Function1.this, obj);
            }
        });
    }

    @Override // p000.AbstractC22565hB, p000.FR1
    /* renamed from: b */
    public void mo1371b(WireBird bird, WirePart wirePart) {
        List list;
        PartKind kind;
        PartKind partKind;
        AbstractC23461c m33039p;
        Intrinsics.checkNotNullParameter(bird, "bird");
        super.mo1371b(bird, wirePart);
        IdToolOption idToolOption = null;
        if (m36743S() == IdToolOption.BRAIN) {
            Observable<Long> interval = Observable.interval(0L, 1L, TimeUnit.SECONDS);
            Observable<BrainSwapRecord> mo21984E0 = this.f60623u.mo21984E0(bird.getId());
            final C13573t c13573t = C13573t.f60663g;
            final Observable combineLatest = Observable.combineLatest(interval, mo21984E0, new InterfaceC23480c() { // from class: GQ1
                @Override // io.reactivex.functions.InterfaceC23480c
                public final Object apply(Object obj, Object obj2) {
                    BrainSwapRecord m61374j1;
                    m61374j1 = C39137cR1.m61374j1(Function2.this, obj, obj2);
                    return m61374j1;
                }
            });
            Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(\n        O…) { _, record -> record }");
            if (wirePart != null) {
                partKind = wirePart.getKind();
            } else {
                partKind = null;
            }
            if (partKind == PartKind.STICKER) {
                m33039p = this.f60623u.mo21981h0(bird.getId()).m33069Q();
            } else {
                m33039p = AbstractC23461c.m33039p();
            }
            Observable observeOn = m33039p.m33043l(Observable.defer(new Callable() { // from class: HQ1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23434B m61373k1;
                    m61373k1 = C39137cR1.m61373k1(Observable.this);
                    return m61373k1;
                }
            })).observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn, "if (part?.kind == PartKi…dSchedulers.mainThread())");
            Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m36741U()));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C13569p c13569p = new C13569p();
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: IQ1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C39137cR1.m61372l1(Function1.this, obj);
                }
            });
            AbstractC24507p<BrainSwapRecord> firstElement = this.f60623u.mo21984E0(bird.getId()).firstElement();
            Intrinsics.checkNotNullExpressionValue(firstElement, "brainSwapManager.streamB…)\n        .firstElement()");
            AbstractC23442F<BrainSwapRecord> m61385b1 = m61385b1(firstElement);
            final C13570q c13570q = new C13570q();
            AbstractC23442F<BrainSwapRecord> m33150P = m61385b1.m33150P(new InterfaceC23492o() { // from class: JQ1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m61371m1;
                    m61371m1 = C39137cR1.m61371m1(Function1.this, obj);
                    return m61371m1;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33150P, "override fun onBirdIdent…TE.name\n      )\n    )\n  }");
            Object m33135e = m33150P.m33135e(AutoDispose.m45239a(m36741U()));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C13571r c13571r = C13571r.f60662g;
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: KQ1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C39137cR1.m61370n1(Function1.this, obj);
                }
            };
            final C13572s c13572s = new C13572s(m36739W());
            ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: LQ1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C39137cR1.m61369o1(Function1.this, obj);
                }
            });
        }
        IdToolOption idToolOption2 = this.f60628z;
        if (idToolOption2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("idToolOption");
        } else {
            idToolOption = idToolOption2;
        }
        PartKind[] correspondingPartKinds = idToolOption.getCorrespondingPartKinds();
        ArrayList arrayList = new ArrayList(correspondingPartKinds.length);
        for (PartKind partKind2 : correspondingPartKinds) {
            arrayList.add(partKind2.name());
        }
        list = CollectionsKt___CollectionsKt.toList(arrayList);
        WirePart m36746P = m36746P();
        m36753I().mo55905y(new HS1(null, bird.getId(), m36740V(), null, null, null, list, (m36746P == null || (kind = m36746P.getKind()) == null || (r1 = kind.name()) == null) ? "REPAIRS" : "REPAIRS", EnumC52782zQ1.ASSOCIATE.name(), 57, null));
    }

    /* renamed from: b1 */
    public final AbstractC23442F<BrainSwapRecord> m61385b1(AbstractC24507p<BrainSwapRecord> abstractC24507p) {
        final C13564l c13564l = new C13564l();
        AbstractC23442F m32072C = abstractC24507p.m32072C(new InterfaceC23492o() { // from class: TQ1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m61384c1;
                m61384c1 = C39137cR1.m61384c1(Function1.this, obj);
                return m61384c1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32072C, "private fun Maybe<BrainS…ild()\n        )\n    }\n  }");
        return m32072C;
    }

    @Override // p000.FR1
    /* renamed from: d */
    public void mo1370d(WirePart part) {
        String str;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(part, "part");
        if (part.getKind() == PartKind.BRAIN) {
            part = part.copy(part.getId(), part.getKind(), m36725g0(part.getKey()));
        }
        this.f60627y = part;
        GR1 m36739W = m36739W();
        IdAction idAction = IdAction.ASSOCIATE;
        IdToolOption m36743S = m36743S();
        WirePart wirePart = this.f60627y;
        if (wirePart != null) {
            str = wirePart.getKey();
        } else {
            str = null;
        }
        m36739W.mo103897Ac(idAction, m36743S, str, Integer.valueOf(m61376h1()));
        GR1 m36739W2 = m36739W();
        boolean z3 = true;
        if (this.f60627y == null && C37942aQ1.m71429b(m36743S())) {
            z = true;
        } else {
            z = false;
        }
        m36739W2.mo103870se(z);
        GR1 m36739W3 = m36739W();
        if (this.f60627y == null && C37942aQ1.m71430a(m36743S())) {
            z2 = true;
        } else {
            z2 = false;
        }
        m36739W3.mo103885Ri(z2);
        GR1 m36739W4 = m36739W();
        if (m36751K() == null || m36746P() == null || this.f60627y == null) {
            z3 = false;
        }
        m36739W4.mo103877b2(z3);
    }

    /* renamed from: d1 */
    public final AbstractC23442F<Pair<List<C3023H6>, Boolean>> m61382d1(IdToolOption idToolOption) {
        AbstractC23442F<List<C3023H6>> mo19330c = this.f60625w.mo19330c(idToolOption);
        final C13566m c13566m = C13566m.f60657g;
        AbstractC23442F m33157I = mo19330c.m33157I(new InterfaceC23492o() { // from class: FQ1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m61380e1;
                m61380e1 = C39137cR1.m61380e1(Function1.this, obj);
                return m61380e1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "statusConverter.convertF…ons -> sections to true }");
        return m33157I;
    }

    @Override // p000.AbstractC22565hB, p000.FR1
    /* renamed from: f */
    public void mo1369f(IdToolOption option, boolean z) {
        Intrinsics.checkNotNullParameter(option, "option");
        super.mo1369f(option, z);
        this.f60628z = option;
        Observable<Unit> mo103878ak = m36739W().mo103878ak();
        final C13574u c13574u = new C13574u();
        Observable observeOn = mo103878ak.flatMapSingle(new InterfaceC23492o() { // from class: XQ1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m61383d0;
                m61383d0 = C39137cR1.m61383d0(Function1.this, obj);
                return m61383d0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onCreate(op…{ }, Timber::e)\n    }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m36741U()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13575v c13575v = new C13575v(option);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: YQ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39137cR1.m61381e0(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn2 = m36739W().mo103871of().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.stepTwoEnterCodeClick…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(m36741U()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13576w c13576w = new C13576w(option);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: ZQ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39137cR1.m61379f0(Function1.this, obj);
            }
        });
        Observable<Unit> mo103880Xh = m36739W().mo103880Xh();
        final C13577x c13577x = new C13577x();
        Observable<Unit> filter = mo103880Xh.filter(new InterfaceC23494q() { // from class: aR1
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m61364r1;
                m61364r1 = C39137cR1.m61364r1(Function1.this, obj);
                return m61364r1;
            }
        });
        final C13578y c13578y = new C13578y();
        AbstractC23461c m33066T = filter.flatMapCompletable(new InterfaceC23492o() { // from class: bR1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m61362s1;
                m61362s1 = C39137cR1.m61362s1(Function1.this, obj);
                return m61362s1;
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "override fun onCreate(op…{ }, Timber::e)\n    }\n  }");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(m36741U()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        GR1.C2848a.setStepTwoDescription$default(m36739W(), IdAction.ASSOCIATE, option, null, Integer.valueOf(m61376h1()), 4, null);
        m36739W().mo103870se(C37942aQ1.m71429b(option));
        m36739W().mo103885Ri(C37942aQ1.m71430a(option));
        if (option == IdToolOption.BRAIN) {
            AbstractC23461c m33065U = this.f60624v.mo15677i(this.f60622t.m82623f8().m73665a().getOperatorConfig().getFeatures().getIdTool().getB2BrainSwapMinRssiSetRentalMode()).m33065U(3L);
            Intrinsics.checkNotNullExpressionValue(m33065U, "rxBleBirdBluetoothManage…inRssi)\n        .retry(3)");
            Object m33041n2 = m33065U.m33041n(AutoDispose.m45239a(m36741U()));
            Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: CQ1
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C39137cR1.m61368p1();
                }
            };
            final C13579z c13579z = C13579z.f60671b;
            ((CompletableSubscribeProxy) m33041n2).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: DQ1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C39137cR1.m61366q1(Function1.this, obj);
                }
            });
        }
    }

    /* renamed from: h1 */
    public final int m61376h1() {
        return Seconds.seconds(m61375i1()).toStandardMinutes().getMinutes();
    }

    /* renamed from: i1 */
    public final int m61375i1() {
        return this.f60622t.m82623f8().m73665a().getOperatorConfig().getFeatures().getIdTool().getBrainSwapTimeoutSeconds();
    }

    /* renamed from: t1 */
    public final AbstractC23442F<Pair<List<C3023H6>, Boolean>> m61360t1(Throwable th) {
        String str;
        Throwable m87362c = R36.m87362c(th);
        C41318g46.m40159e(m87362c);
        if (m87362c instanceof HttpException) {
            str = th.getMessage();
        } else {
            str = null;
        }
        AbstractC23442F<List<C3023H6>> mo19331b = this.f60625w.mo19331b(m36743S(), str);
        final C13544A c13544a = C13544A.f60629g;
        AbstractC23442F m33157I = mo19331b.m33157I(new InterfaceC23492o() { // from class: EQ1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m61358u1;
                m61358u1 = C39137cR1.m61358u1(Function1.this, obj);
                return m61358u1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "statusConverter.convertF…ns -> sections to false }");
        return m33157I;
    }

    /* renamed from: v1 */
    public final void m61356v1(Pair<? extends List<C3023H6>, Boolean> pair) {
        List<C3023H6> component1 = pair.component1();
        if (pair.component2().booleanValue()) {
            m36739W().mo12610b1(component1);
        } else {
            m36739W().mo12607g1(component1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "", "Lco/bird/android/model/wire/WirePart;", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "LnQ5$b;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cR1$e */
    /* loaded from: classes3.dex */
    public static final class C13552e extends Lambda implements Function1<Pair<? extends WireBird, ? extends WirePart[]>, InterfaceC23434B<? extends C45672nQ5.EnumC26504b>> {

        /* renamed from: h */
        public final /* synthetic */ GR1 f60640h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC40099e13 f60641i;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: cR1$e$a */
        /* loaded from: classes3.dex */
        public static final class C13553a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ GR1 f60642g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13553a(GR1 gr1) {
                super(1);
                this.f60642g = gr1;
            }

            /* renamed from: a */
            public final void m61340a(InterfaceC23465c interfaceC23465c) {
                C45672nQ5 mo12605oc = this.f60642g.mo12605oc();
                if (mo12605oc != null) {
                    mo12605oc.startProgress();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m61340a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LnQ5$b;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LnQ5$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: cR1$e$b */
        /* loaded from: classes3.dex */
        public static final class C13554b extends Lambda implements Function1<C45672nQ5.EnumC26504b, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C39137cR1 f60643g;

            /* renamed from: h */
            public final /* synthetic */ WireBird f60644h;

            /* renamed from: i */
            public final /* synthetic */ WirePart[] f60645i;

            /* renamed from: j */
            public final /* synthetic */ InterfaceC40099e13 f60646j;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: cR1$e$b$a */
            /* loaded from: classes3.dex */
            public /* synthetic */ class C13555a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[C45672nQ5.EnumC26504b.values().length];
                    try {
                        iArr[C45672nQ5.EnumC26504b.TRY_AGAIN.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[C45672nQ5.EnumC26504b.NEXT_ONE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13554b(C39137cR1 c39137cR1, WireBird wireBird, WirePart[] wirePartArr, InterfaceC40099e13 interfaceC40099e13) {
                super(1);
                this.f60643g = c39137cR1;
                this.f60644h = wireBird;
                this.f60645i = wirePartArr;
                this.f60646j = interfaceC40099e13;
            }

            /* renamed from: a */
            public final void m61339a(C45672nQ5.EnumC26504b enumC26504b) {
                int i;
                if (enumC26504b == null) {
                    i = -1;
                } else {
                    i = C13555a.$EnumSwitchMapping$0[enumC26504b.ordinal()];
                }
                if (i != 1) {
                    if (i != 2) {
                        Intent intent = new Intent();
                        intent.putParcelableArrayListExtra("repairs", new ArrayList<>());
                        this.f60646j.mo37190C1(-1, intent);
                        return;
                    }
                    this.f60646j.mo37030e3();
                    InterfaceC40099e13.C19924a.goToAssociateId$default(this.f60646j, this.f60643g.m36743S(), null, false, 4, null);
                    return;
                }
                C39137cR1 c39137cR1 = this.f60643g;
                WireBird wireBird = this.f60644h;
                WirePart[] wirePartArr = this.f60645i;
                c39137cR1.m61390W0(wireBird, (WirePart[]) Arrays.copyOf(wirePartArr, wirePartArr.length));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C45672nQ5.EnumC26504b enumC26504b) {
                m61339a(enumC26504b);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13552e(GR1 gr1, InterfaceC40099e13 interfaceC40099e13) {
            super(1);
            this.f60640h = gr1;
            this.f60641i = interfaceC40099e13;
        }

        /* renamed from: c */
        public static final void m61341c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends C45672nQ5.EnumC26504b> invoke2(Pair<WireBird, WirePart[]> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireBird component1 = pair.component1();
            WirePart[] component2 = pair.component2();
            IdToolOption idToolOption = C39137cR1.this.f60628z;
            if (idToolOption == null) {
                Intrinsics.throwUninitializedPropertyAccessException("idToolOption");
                idToolOption = null;
            }
            if (idToolOption == IdToolOption.BRAIN) {
                return Observable.empty();
            }
            Observable showStatusDialog$default = FQ5.C2274a.showStatusDialog$default(this.f60640h, null, 1, null);
            final C13553a c13553a = new C13553a(this.f60640h);
            Observable doOnSubscribe = showStatusDialog$default.doOnSubscribe(new InterfaceC23484g() { // from class: fR1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C39137cR1.C13552e.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C13554b c13554b = new C13554b(C39137cR1.this, component1, component2, this.f60641i);
            return doOnSubscribe.doOnNext(new InterfaceC23484g() { // from class: gR1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C39137cR1.C13552e.m61341c(Function1.this, obj);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends C45672nQ5.EnumC26504b> invoke(Pair<? extends WireBird, ? extends WirePart[]> pair) {
            return invoke2((Pair<WireBird, WirePart[]>) pair);
        }
    }
}
