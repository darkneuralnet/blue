package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.AlarmType;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.OperatorScanIntent;
import co.bird.android.model.Vehicle;
import co.bird.android.model.constant.AlarmCommand;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.constant.BulkScanPurpose;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.WireBatch;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireInventoryPart;
import co.bird.api.exception.HttpException;
import co.bird.api.response.AdjustInventoryCountResponse;
import co.bird.api.response.OpsBatchJobActionKind;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24520c;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.AbstractC20252fA;
import p000.H31;
import p000.InterfaceC27246pJ;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u0089\u00012\u00020\u00012\u00020\u0002:\u0001*Bk\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010E\u001a\u00020C\u0012\u0006\u0010I\u001a\u00020F\u0012\u0006\u0010M\u001a\u00020J\u0012\u0006\u0010Q\u001a\u00020N\u0012\u0006\u0010U\u001a\u00020R\u0012\u0006\u0010X\u001a\u00020\u0002\u0012\u0006\u0010\\\u001a\u00020Y\u0012\b\u0010`\u001a\u0004\u0018\u00010]\u0012\u0006\u0010d\u001a\u00020a¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0002J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0003H\u0002J$\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u0011\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u001fH\u0096\u0001J\u0019\u0010%\u001a\u00020\u00032\u000e\u0010$\u001a\n #*\u0004\u0018\u00010\u00060\u0006H\u0096\u0001J\t\u0010&\u001a\u00020\u0003H\u0096\u0001J\t\u0010'\u001a\u00020\u0003H\u0096\u0001J\t\u0010(\u001a\u00020\u0003H\u0096\u0001J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u001eH\u0096\u0001J\b\u0010*\u001a\u00020\u0003H\u0016J\"\u00100\u001a\u00020\u00032\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\u001e2\u0006\u00101\u001a\u00020\tH\u0016J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\t0\u001e2\u0006\u00101\u001a\u00020\tH\u0016J\b\u00104\u001a\u00020\u0003H\u0016J\b\u00105\u001a\u00020\u0003H\u0016J\b\u00106\u001a\u00020\u0003H\u0016R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010`\u001a\u0004\u0018\u00010]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010i\u001a\u00020\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR4\u0010q\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020l #*\n\u0012\u0004\u0012\u00020l\u0018\u00010k0k0j8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR(\u0010t\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\t0\t0j8\u0004X\u0084\u0004¢\u0006\f\n\u0004\br\u0010n\u001a\u0004\bs\u0010pR(\u0010v\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\u000b0\u000b0j8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b6\u0010n\u001a\u0004\bu\u0010pR\"\u0010x\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\u00030\u00030j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010nR\u0016\u0010z\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u00102R$\u0010|\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010+0+0j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010nR\u0016\u0010~\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010fR\u0017\u0010\u0082\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0083\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u008a\u0001"}, m28432d2 = {"LfA;", "Lm40;", "Let3;", "", "q0", "x0", "LbN4;", "rawResult", "Lio/reactivex/p;", "Lco/bird/android/model/persistence/Bird;", "n0", "LDI3;", "o0", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "d0", "sku", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireInventoryPart;", "h0", "", "e", "Z0", "m0", "birdId", "LfA$a$a;", "scanMethod", "Lorg/joda/time/DateTime;", "scanTime", "i1", "Lio/reactivex/Observable;", "", "X", "enabled", "a5", "kotlin.jvm.PlatformType", "p0", "handleResult", "onPause", "onResume", "N6", "d4", C17296a.f69688o, "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "bird", "Z", "f1", "onBackPressed", "t8", "q", "Lco/bird/android/core/mvp/BaseActivity;", "b", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LXl3;", "c", "LXl3;", "inventoryManager", "Lom3;", DateTokenConverter.CONVERTER_KEY, "Lom3;", "operatorManager", "LpJ;", "LpJ;", "bluetoothManager", "Lcom/uber/autodispose/ScopeProvider;", "f", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lv40;", "g", "Lv40;", "ui", "Le13;", "h", "Le13;", "navigator", "Lco/bird/android/model/constant/BulkScanPurpose;", "i", "Lco/bird/android/model/constant/BulkScanPurpose;", "purpose", "j", "Let3;", "delegate", "LEa;", "k", "LEa;", "analyticsManager", "Lco/bird/android/model/wire/WireBatch;", "l", "Lco/bird/android/model/wire/WireBatch;", "batch", "LTq4;", "m", "LTq4;", "reactiveConfig", "n", "Ljava/lang/String;", "k0", "()Ljava/lang/String;", "sessionId", "Lio/reactivex/subjects/a;", "", "Lco/bird/android/model/wire/WireBird;", "o", "Lio/reactivex/subjects/a;", "l0", "()Lio/reactivex/subjects/a;", "tasksSubject", "p", "g0", "birdsSubject", "i0", "partsSubject", "r", "partUpdateSubject", "s", "peripheralKeyboardActive", "t", "scannedCountSubject", "u", "tripStopId", "Lco/bird/android/model/OperatorScanIntent;", "v", "Lco/bird/android/model/OperatorScanIntent;", "operatorScanIntent", "Lco/bird/android/model/constant/ScanIntention;", "j0", "()Lco/bird/android/model/constant/ScanIntention;", "scanIntention", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LXl3;Lom3;LpJ;Lcom/uber/autodispose/ScopeProvider;Lv40;Le13;Lco/bird/android/model/constant/BulkScanPurpose;Let3;LEa;Lco/bird/android/model/wire/WireBatch;LTq4;)V", "w", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkScannerPresenter.kt\nco/bird/android/feature/bulkscanner/scan/base/BaseBulkScannerPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,534:1\n199#2:535\n180#2:536\n180#2:537\n180#2:538\n180#2:539\n180#2:540\n180#2:541\n180#2:542\n180#2:543\n199#2:544\n218#2:545\n218#2:546\n*S KotlinDebug\n*F\n+ 1 BulkScannerPresenter.kt\nco/bird/android/feature/bulkscanner/scan/base/BaseBulkScannerPresenterImpl\n*L\n121#1:535\n156#1:536\n163#1:537\n168#1:538\n189#1:539\n194#1:540\n225#1:541\n251#1:542\n267#1:543\n326#1:544\n390#1:545\n425#1:546\n*E\n"})
/* renamed from: fA */
/* loaded from: classes3.dex */
public abstract class AbstractC20252fA implements InterfaceC44870m40, InterfaceC40613et3 {

    /* renamed from: w */
    public static final C20279a f79551w = new C20279a(null);

    /* renamed from: b */
    public final BaseActivity f79552b;

    /* renamed from: c */
    public final InterfaceC37097Xl3 f79553c;

    /* renamed from: d */
    public final InterfaceC46473om3 f79554d;

    /* renamed from: e */
    public final InterfaceC27246pJ f79555e;

    /* renamed from: f */
    public final ScopeProvider f79556f;

    /* renamed from: g */
    public final InterfaceC50205v40 f79557g;

    /* renamed from: h */
    public final InterfaceC40099e13 f79558h;

    /* renamed from: i */
    public final BulkScanPurpose f79559i;

    /* renamed from: j */
    public final InterfaceC40613et3 f79560j;

    /* renamed from: k */
    public final InterfaceC1880Ea f79561k;

    /* renamed from: l */
    public final WireBatch f79562l;

    /* renamed from: m */
    public final C36207Tq4 f79563m;

    /* renamed from: n */
    public final String f79564n;

    /* renamed from: o */
    public final C24552a<List<WireBird>> f79565o;

    /* renamed from: p */
    public final C24552a<Bird> f79566p;

    /* renamed from: q */
    public final C24552a<DI3> f79567q;

    /* renamed from: r */
    public final C24552a<Unit> f79568r;

    /* renamed from: s */
    public boolean f79569s;

    /* renamed from: t */
    public C24552a<Integer> f79570t;

    /* renamed from: u */
    public final String f79571u;

    /* renamed from: v */
    public final OperatorScanIntent f79572v;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$A */
    /* loaded from: classes3.dex */
    public static final class C20253A extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends Unit>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: fA$A$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C20254a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DialogResponse.values().length];
                try {
                    iArr[DialogResponse.CANCEL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DialogResponse.DISMISS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C20253A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Unit> invoke(DialogResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            int i = C20254a.$EnumSwitchMapping$0[response.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return AbstractC23461c.m33039p().m33045k(AbstractC24507p.m32068G(Unit.INSTANCE));
                }
                return AbstractC24507p.m32024u();
            }
            return AbstractC20252fA.this.f79554d.mo8080r1(AbstractC20252fA.this.f79559i).m33045k(AbstractC24507p.m32068G(Unit.INSTANCE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$B */
    /* loaded from: classes3.dex */
    public static final class C20255B extends Lambda implements Function1<Unit, Unit> {
        public C20255B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            AbstractC20252fA.this.f79558h.mo37030e3();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$D */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C20258D extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C20258D(Object obj) {
            super(1, obj, InterfaceC50205v40.class, "error", "error(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC50205v40) this.receiver).error(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$E */
    /* loaded from: classes3.dex */
    public static final class C20259E extends Lambda implements Function1<Bird, Unit> {
        public C20259E() {
            super(1);
        }

        /* renamed from: a */
        public final void m41828a(Bird bird) {
            AbstractC20252fA.this.f79557g.mo7490d8(false, false, false, false, false, false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bird bird) {
            m41828a(bird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$F */
    /* loaded from: classes3.dex */
    public static final class C20260F extends Lambda implements Function1<Unit, Unit> {
        public C20260F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToNearbyBirds$default(AbstractC20252fA.this.f79558h, true, null, null, null, null, Boolean.FALSE, Boolean.TRUE, null, 158, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$G */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C20261G extends FunctionReferenceImpl implements Function1<List<? extends WireBird>, Unit> {
        public C20261G(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireBird> list) {
            invoke2((List<WireBird>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireBird> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LXK;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LXK;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$H */
    /* loaded from: classes3.dex */
    public static final class C20262H extends Lambda implements Function1<C9400XK, Unit> {
        public C20262H() {
            super(1);
        }

        /* renamed from: a */
        public final void m41827a(C9400XK c9400xk) {
            AbstractC20252fA.this.f79557g.mo7482jl();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C9400XK c9400xk) {
            m41827a(c9400xk);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 \u0002*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00000\u0000 \u0002*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 \u0002*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00000\u0000\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "LXK;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lco/bird/android/model/persistence/Bird;", "Lorg/joda/time/DateTime;", "b", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$I */
    /* loaded from: classes3.dex */
    public static final class C20263I extends Lambda implements Function1<Pair<? extends C9400XK, ? extends Boolean>, InterfaceC24574u<? extends Pair<? extends Bird, ? extends DateTime>>> {

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u00002\u000e\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", C17296a.f69688o, "(Lkotlin/Pair;Ljava/lang/Throwable;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: fA$I$a */
        /* loaded from: classes3.dex */
        public static final class C20264a extends Lambda implements Function2<Pair<? extends Bird, ? extends DateTime>, Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ AbstractC20252fA f79580g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20264a(AbstractC20252fA abstractC20252fA) {
                super(2);
                this.f79580g = abstractC20252fA;
            }

            /* renamed from: a */
            public final void m41823a(Pair<Bird, DateTime> pair, Throwable th) {
                this.f79580g.f79557g.mo7498Vi(this.f79580g.f79563m.m82623f8().getValue().getOperatorConfig().getFeatures().getWakeBirds().getBulkWakeMaxVehicles());
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Bird, ? extends DateTime> pair, Throwable th) {
                m41823a(pair, th);
                return Unit.INSTANCE;
            }
        }

        public C20263I() {
            super(1);
        }

        /* renamed from: c */
        public static final void m41824c(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj, obj2);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Pair<Bird, DateTime>> invoke(Pair<C9400XK, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            C9400XK component1 = pair.component1();
            Boolean userCanScanMoreVehicles = pair.component2();
            Intrinsics.checkNotNullExpressionValue(userCanScanMoreVehicles, "userCanScanMoreVehicles");
            if (userCanScanMoreVehicles.booleanValue()) {
                String m99597e = C33894Jt4.f18402a.m99597e(component1.m77124b());
                if (m99597e == null) {
                    m99597e = component1.m77124b();
                }
                C24520c c24520c = C24520c.f91166a;
                AbstractC24507p m41877d0 = AbstractC20252fA.this.m41877d0(m99597e);
                AbstractC24507p m32068G = AbstractC24507p.m32068G(DateTime.now());
                Intrinsics.checkNotNullExpressionValue(m32068G, "just(DateTime.now())");
                return c24520c.m31960a(m41877d0, m32068G);
            }
            AbstractC24507p m32066I = AbstractC24507p.m32024u().m32066I(C23454a.m33087a());
            final C20264a c20264a = new C20264a(AbstractC20252fA.this);
            return m32066I.m32028q(new InterfaceC23479b() { // from class: jA
                @Override // io.reactivex.functions.InterfaceC23479b
                public final void accept(Object obj, Object obj2) {
                    AbstractC20252fA.C20263I.m41824c(Function2.this, obj, obj2);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$J */
    /* loaded from: classes3.dex */
    public static final class C20265J extends Lambda implements Function1<Pair<? extends Bird, ? extends DateTime>, Unit> {
        public C20265J() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Bird, ? extends DateTime> pair) {
            invoke2((Pair<Bird, DateTime>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Bird, DateTime> pair) {
            AbstractC20252fA.this.f79557g.mo7493c2();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$K */
    /* loaded from: classes3.dex */
    public static final class C20266K extends Lambda implements Function1<Pair<? extends Bird, ? extends DateTime>, Unit> {
        public C20266K() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Bird, ? extends DateTime> pair) {
            invoke2((Pair<Bird, DateTime>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Bird, DateTime> pair) {
            Bird component1 = pair.component1();
            DateTime component2 = pair.component2();
            if (AbstractC20252fA.this.f79569s) {
                AbstractC20252fA.this.m41862i1(component1.getId(), C20279a.EnumC20280a.PERIPHERAL_SCANNER, component2);
            } else {
                AbstractC20252fA.this.m41862i1(component1.getId(), C20279a.EnumC20280a.CODE_ENTERED, component2);
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$L */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C20267L extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C20267L(Object obj) {
            super(1, obj, AbstractC20252fA.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AbstractC20252fA) this.receiver).m41887Z0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$M */
    /* loaded from: classes3.dex */
    public static final class C20268M extends Lambda implements Function1<Pair<? extends Bird, ? extends DateTime>, Unit> {
        public C20268M() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Bird, ? extends DateTime> pair) {
            invoke2((Pair<Bird, DateTime>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Bird, DateTime> pair) {
            AbstractC20252fA.this.m41869g0().onNext(pair.component1());
            C24552a c24552a = AbstractC20252fA.this.f79570t;
            Integer num = (Integer) AbstractC20252fA.this.f79570t.getValue();
            c24552a.onNext(Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$N */
    /* loaded from: classes3.dex */
    public static final class C20269N extends Lambda implements Function1<Unit, Unit> {
        public C20269N() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            AbstractC20252fA.this.m41854m0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$O */
    /* loaded from: classes3.dex */
    public static final class C20270O extends Lambda implements Function1<Bird, Unit> {
        public C20270O() {
            super(1);
        }

        /* renamed from: a */
        public final void m41822a(Bird bird) {
            AbstractC20252fA.this.f79557g.mo7490d8(true, true, false, false, true, true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bird bird) {
            m41822a(bird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u009a\u0001\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00070\u0007 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00000\u0000 \u0003*L\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00070\u0007 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00000\u0000\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "LH31$b;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lco/bird/android/model/persistence/Bird;", "Lorg/joda/time/DateTime;", "c", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$P */
    /* loaded from: classes3.dex */
    public static final class C20271P extends Lambda implements Function1<Pair<? extends H31.AbstractC3016b, ? extends Boolean>, InterfaceC24574u<? extends Pair<? extends Bird, ? extends DateTime>>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: fA$P$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C20272a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
            public C20272a(Object obj) {
                super(1, obj, AbstractC20252fA.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((AbstractC20252fA) this.receiver).m41887Z0(p0);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u00002\u000e\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", C17296a.f69688o, "(Lkotlin/Pair;Ljava/lang/Throwable;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: fA$P$b */
        /* loaded from: classes3.dex */
        public static final class C20273b extends Lambda implements Function2<Pair<? extends Bird, ? extends DateTime>, Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Boolean f79587g;

            /* renamed from: h */
            public final /* synthetic */ AbstractC20252fA f79588h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20273b(Boolean bool, AbstractC20252fA abstractC20252fA) {
                super(2);
                this.f79587g = bool;
                this.f79588h = abstractC20252fA;
            }

            /* renamed from: a */
            public final void m41817a(Pair<Bird, DateTime> pair, Throwable th) {
                if (!this.f79587g.booleanValue()) {
                    this.f79588h.f79557g.mo7498Vi(this.f79588h.f79563m.m82623f8().getValue().getOperatorConfig().getFeatures().getWakeBirds().getBulkWakeMaxVehicles());
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Bird, ? extends DateTime> pair, Throwable th) {
                m41817a(pair, th);
                return Unit.INSTANCE;
            }
        }

        public C20271P() {
            super(1);
        }

        /* renamed from: d */
        public static final void m41818d(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj, obj2);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends Pair<Bird, DateTime>> invoke(Pair<? extends H31.AbstractC3016b, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            H31.AbstractC3016b component1 = pair.component1();
            Boolean userCanScanMoreVehicles = pair.component2();
            if (component1 instanceof H31.AbstractC3016b.C3019c) {
                Intrinsics.checkNotNullExpressionValue(userCanScanMoreVehicles, "userCanScanMoreVehicles");
                if (userCanScanMoreVehicles.booleanValue()) {
                    C24520c c24520c = C24520c.f91166a;
                    AbstractC24507p m41877d0 = AbstractC20252fA.this.m41877d0(((H31.AbstractC3016b.C3019c) component1).m104470b());
                    AbstractC24507p m32068G = AbstractC24507p.m32068G(DateTime.now());
                    Intrinsics.checkNotNullExpressionValue(m32068G, "just(DateTime.now())");
                    AbstractC24507p m32066I = c24520c.m31960a(m41877d0, m32068G).m32066I(C23454a.m33087a());
                    final C20272a c20272a = new C20272a(AbstractC20252fA.this);
                    return m32066I.m32029p(new InterfaceC23484g() { // from class: kA
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            AbstractC20252fA.C20271P.invoke$lambda$0(Function1.this, obj);
                        }
                    });
                }
            }
            AbstractC24507p m32066I2 = AbstractC24507p.m32024u().m32066I(C23454a.m33087a());
            final C20273b c20273b = new C20273b(userCanScanMoreVehicles, AbstractC20252fA.this);
            return m32066I2.m32028q(new InterfaceC23479b() { // from class: lA
                @Override // io.reactivex.functions.InterfaceC23479b
                public final void accept(Object obj, Object obj2) {
                    AbstractC20252fA.C20271P.m41818d(Function2.this, obj, obj2);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "Lorg/joda/time/DateTime;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$Q */
    /* loaded from: classes3.dex */
    public static final class C20274Q extends Lambda implements Function1<Pair<? extends Bird, ? extends DateTime>, Unit> {
        public C20274Q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Bird, ? extends DateTime> pair) {
            invoke2((Pair<Bird, DateTime>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Bird, DateTime> pair) {
            AbstractC20252fA.this.m41862i1(pair.component1().getId(), C20279a.EnumC20280a.CODE_ENTERED, pair.component2());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "Lorg/joda/time/DateTime;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$R */
    /* loaded from: classes3.dex */
    public static final class C20275R extends Lambda implements Function1<Pair<? extends Bird, ? extends DateTime>, Unit> {
        public C20275R() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Bird, ? extends DateTime> pair) {
            invoke2((Pair<Bird, DateTime>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Bird, DateTime> pair) {
            AbstractC20252fA.this.m41869g0().onNext(pair.component1());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$S */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C20276S extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C20276S f79591b = new C20276S();

        public C20276S() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$T */
    /* loaded from: classes3.dex */
    public static final class C20277T extends Lambda implements Function1<DialogResponse, Boolean> {

        /* renamed from: g */
        public static final C20277T f79592g = new C20277T();

        public C20277T() {
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

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$U */
    /* loaded from: classes3.dex */
    public static final class C20278U extends Lambda implements Function1<DialogResponse, InterfaceC23434B<? extends Bird>> {

        /* renamed from: h */
        public final /* synthetic */ Bird f79594h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20278U(Bird bird) {
            super(1);
            this.f79594h = bird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Bird> invoke(DialogResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC20252fA.this.f79554d.mo8076t(this.f79594h.getId()).m33043l(Observable.just(this.f79594h));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m28432d2 = {"LfA$a;", "", "<init>", "()V", C17296a.f69688o, "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: fA$a */
    /* loaded from: classes3.dex */
    public static final class C20279a {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"LfA$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: fA$a$a */
        /* loaded from: classes3.dex */
        public enum EnumC20280a {
            QR_SCANNED,
            CODE_ENTERED,
            PERIPHERAL_SCANNER,
            BLUETOOTH
        }

        public /* synthetic */ C20279a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C20279a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C20281b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BulkScanPurpose.values().length];
            try {
                iArr[BulkScanPurpose.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BulkScanPurpose.SERVICE_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BulkScanPurpose.WAKE_VEHICLES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BulkScanPurpose.ADD_TO_BATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BulkScanPurpose.PART_SCAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "vehicle", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$d */
    /* loaded from: classes3.dex */
    public static final class C20283d extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Boolean>> {
        public C20283d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Boolean> invoke(Vehicle vehicle) {
            Intrinsics.checkNotNullParameter(vehicle, "vehicle");
            return AbstractC20252fA.this.f79555e.mo19557a(vehicle);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$e */
    /* loaded from: classes3.dex */
    public static final class C20284e extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends Bird>> {

        /* renamed from: g */
        public final /* synthetic */ Bird f79602g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20284e(Bird bird) {
            super(1);
            this.f79602g = bird;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Bird> invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Observable.just(this.f79602g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/persistence/Bird;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$f */
    /* loaded from: classes3.dex */
    public static final class C20285f extends Lambda implements Function1<WireBird, Bird> {

        /* renamed from: g */
        public final /* synthetic */ Bird f79603g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20285f(Bird bird) {
            super(1);
            this.f79603g = bird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Bird invoke(WireBird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f79603g;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$g */
    /* loaded from: classes3.dex */
    public static final class C20286g extends Lambda implements Function1<Bird, Unit> {
        public C20286g() {
            super(1);
        }

        /* renamed from: a */
        public final void m41811a(Bird bird) {
            AbstractC20252fA.this.f79557g.vibrate(250L);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bird bird) {
            m41811a(bird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$h */
    /* loaded from: classes3.dex */
    public static final class C20287h extends Lambda implements Function1<Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: fA$h$a */
        /* loaded from: classes3.dex */
        public static final class C20288a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ AbstractC20252fA f79606g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20288a(AbstractC20252fA abstractC20252fA) {
                super(0);
                this.f79606g = abstractC20252fA;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f79606g.f79557g.dismissDialog();
            }
        }

        public C20287h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            C41318g46.m40159e(e);
            if (e instanceof C39933dk5) {
                C39933dk5 c39933dk5 = (C39933dk5) e;
                H31.C3014a.showDialog$default(AbstractC20252fA.this.f79557g, new C30680yh(c39933dk5.m43812e(), c39933dk5.m43815b()), false, false, new C20288a(AbstractC20252fA.this), null, null, null, 116, null);
            } else {
                InterfaceC50205v40 interfaceC50205v40 = AbstractC20252fA.this.f79557g;
                Intrinsics.checkNotNullExpressionValue(e, "e");
                interfaceC50205v40.error(e);
            }
            AbstractC20252fA.this.f79557g.vibrate(1000L);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireInventoryPart;", "wirePart", "LDI3;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireInventoryPart;)LDI3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$i */
    /* loaded from: classes3.dex */
    public static final class C20289i extends Lambda implements Function1<WireInventoryPart, DI3> {

        /* renamed from: g */
        public final /* synthetic */ int f79607g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20289i(int i) {
            super(1);
            this.f79607g = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DI3 invoke(WireInventoryPart wirePart) {
            Intrinsics.checkNotNullParameter(wirePart, "wirePart");
            int i = this.f79607g;
            if (i == 0) {
                i = wirePart.getDefaultScanQuantity();
            }
            return new DI3(wirePart, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LbN4;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LbN4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$j */
    /* loaded from: classes3.dex */
    public static final class C20290j extends Lambda implements Function1<C38511bN4, Unit> {
        public C20290j() {
            super(1);
        }

        /* renamed from: a */
        public final void m41809a(C38511bN4 c38511bN4) {
            AbstractC20252fA.this.f79560j.mo35634N6();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C38511bN4 c38511bN4) {
            m41809a(c38511bN4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 \u0002*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00000\u0000 \u0002*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 \u0002*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00000\u0000\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "LbN4;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lco/bird/android/model/persistence/Bird;", "Lorg/joda/time/DateTime;", "b", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$k */
    /* loaded from: classes3.dex */
    public static final class C20291k extends Lambda implements Function1<Pair<? extends C38511bN4, ? extends Boolean>, InterfaceC24574u<? extends Pair<? extends Bird, ? extends DateTime>>> {

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u00002\u000e\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", C17296a.f69688o, "(Lkotlin/Pair;Ljava/lang/Throwable;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: fA$k$a */
        /* loaded from: classes3.dex */
        public static final class C20292a extends Lambda implements Function2<Pair<? extends Bird, ? extends DateTime>, Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ AbstractC20252fA f79610g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20292a(AbstractC20252fA abstractC20252fA) {
                super(2);
                this.f79610g = abstractC20252fA;
            }

            /* renamed from: a */
            public final void m41805a(Pair<Bird, DateTime> pair, Throwable th) {
                this.f79610g.f79557g.mo7498Vi(this.f79610g.f79563m.m82623f8().getValue().getOperatorConfig().getFeatures().getWakeBirds().getBulkWakeMaxVehicles());
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Bird, ? extends DateTime> pair, Throwable th) {
                m41805a(pair, th);
                return Unit.INSTANCE;
            }
        }

        public C20291k() {
            super(1);
        }

        /* renamed from: c */
        public static final void m41806c(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj, obj2);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Pair<Bird, DateTime>> invoke(Pair<C38511bN4, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            C38511bN4 scanResult = pair.component1();
            Boolean userCanScanMoreVehicles = pair.component2();
            Intrinsics.checkNotNullExpressionValue(userCanScanMoreVehicles, "userCanScanMoreVehicles");
            if (userCanScanMoreVehicles.booleanValue()) {
                C24520c c24520c = C24520c.f91166a;
                AbstractC20252fA abstractC20252fA = AbstractC20252fA.this;
                Intrinsics.checkNotNullExpressionValue(scanResult, "scanResult");
                AbstractC24507p m41852n0 = abstractC20252fA.m41852n0(scanResult);
                AbstractC24507p m32068G = AbstractC24507p.m32068G(DateTime.now());
                Intrinsics.checkNotNullExpressionValue(m32068G, "just(DateTime.now())");
                return c24520c.m31960a(m41852n0, m32068G);
            }
            AbstractC24507p m32066I = AbstractC24507p.m32024u().m32066I(C23454a.m33087a());
            final C20292a c20292a = new C20292a(AbstractC20252fA.this);
            return m32066I.m32028q(new InterfaceC23479b() { // from class: gA
                @Override // io.reactivex.functions.InterfaceC23479b
                public final void accept(Object obj, Object obj2) {
                    AbstractC20252fA.C20291k.m41806c(Function2.this, obj, obj2);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$l */
    /* loaded from: classes3.dex */
    public static final class C20293l extends Lambda implements Function1<Pair<? extends Bird, ? extends DateTime>, Unit> {
        public C20293l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Bird, ? extends DateTime> pair) {
            invoke2((Pair<Bird, DateTime>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Bird, DateTime> pair) {
            AbstractC20252fA.this.m41862i1(pair.component1().getId(), C20279a.EnumC20280a.QR_SCANNED, pair.component2());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$m */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C20294m extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C20294m(Object obj) {
            super(1, obj, AbstractC20252fA.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AbstractC20252fA) this.receiver).m41887Z0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$n */
    /* loaded from: classes3.dex */
    public static final class C20295n extends Lambda implements Function1<Pair<? extends Bird, ? extends DateTime>, Unit> {
        public C20295n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Bird, ? extends DateTime> pair) {
            invoke2((Pair<Bird, DateTime>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Bird, DateTime> pair) {
            AbstractC20252fA.this.m41869g0().onNext(pair.component1());
            C24552a c24552a = AbstractC20252fA.this.f79570t;
            Integer num = (Integer) AbstractC20252fA.this.f79570t.getValue();
            c24552a.onNext(Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LbN4;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LbN4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$o */
    /* loaded from: classes3.dex */
    public static final class C20296o extends Lambda implements Function1<C38511bN4, Unit> {
        public C20296o() {
            super(1);
        }

        /* renamed from: a */
        public final void m41804a(C38511bN4 c38511bN4) {
            AbstractC20252fA.this.f79560j.mo35634N6();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C38511bN4 c38511bN4) {
            m41804a(c38511bN4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LbN4;", "scanResult", "", C17296a.f69688o, "(LbN4;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$p */
    /* loaded from: classes3.dex */
    public static final class C20297p extends Lambda implements Function1<C38511bN4, Boolean> {

        /* renamed from: g */
        public static final C20297p f79614g = new C20297p();

        public C20297p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C38511bN4 scanResult) {
            boolean z;
            Intrinsics.checkNotNullParameter(scanResult, "scanResult");
            try {
                String m64617f = scanResult.m64617f();
                Intrinsics.checkNotNullExpressionValue(m64617f, "scanResult.text");
                Integer.parseInt(m64617f);
                z = false;
            } catch (NumberFormatException unused) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LbN4;", "scanResult", "Lio/reactivex/u;", "LDI3;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LbN4;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$q */
    /* loaded from: classes3.dex */
    public static final class C20298q extends Lambda implements Function1<C38511bN4, InterfaceC24574u<? extends DI3>> {
        public C20298q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends DI3> invoke(C38511bN4 scanResult) {
            Intrinsics.checkNotNullParameter(scanResult, "scanResult");
            return AbstractC20252fA.this.m41850o0(scanResult);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$r */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C20299r extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C20299r(Object obj) {
            super(1, obj, AbstractC20252fA.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AbstractC20252fA) this.receiver).m41887Z0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LDI3;", "kotlin.jvm.PlatformType", "part", "", C17296a.f69688o, "(LDI3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$s */
    /* loaded from: classes3.dex */
    public static final class C20300s extends Lambda implements Function1<DI3, Unit> {
        public C20300s() {
            super(1);
        }

        /* renamed from: a */
        public final void m41801a(DI3 di3) {
            AbstractC20252fA.this.m41863i0().onNext(di3);
            C24552a c24552a = AbstractC20252fA.this.f79570t;
            Integer num = (Integer) AbstractC20252fA.this.f79570t.getValue();
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            c24552a.onNext(Integer.valueOf(i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DI3 di3) {
            m41801a(di3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "", "Lco/bird/api/response/AdjustInventoryCountResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBulkScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkScannerPresenter.kt\nco/bird/android/feature/bulkscanner/scan/base/BaseBulkScannerPresenterImpl$initPartScan$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,534:1\n1549#2:535\n1620#2,3:536\n*S KotlinDebug\n*F\n+ 1 BulkScannerPresenter.kt\nco/bird/android/feature/bulkscanner/scan/base/BaseBulkScannerPresenterImpl$initPartScan$6\n*L\n259#1:535\n259#1:536,3\n*E\n"})
    /* renamed from: fA$t */
    /* loaded from: classes3.dex */
    public static final class C20301t extends Lambda implements Function1<Unit, InterfaceC23447K<? extends List<? extends AdjustInventoryCountResponse>>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: fA$t$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C20302a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
            public C20302a(Object obj) {
                super(1, obj, InterfaceC50205v40.class, "error", "error(Ljava/lang/Throwable;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((InterfaceC50205v40) this.receiver).error(p0);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "", "Lco/bird/api/response/AdjustInventoryCountResponse;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: fA$t$b */
        /* loaded from: classes3.dex */
        public static final class C20303b extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends List<? extends AdjustInventoryCountResponse>>> {

            /* renamed from: g */
            public static final C20303b f79618g = new C20303b();

            public C20303b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23447K<? extends List<AdjustInventoryCountResponse>> invoke(Throwable it) {
                List emptyList;
                Intrinsics.checkNotNullParameter(it, "it");
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return AbstractC23442F.m33158H(emptyList);
            }
        }

        public C20301t() {
            super(1);
        }

        /* renamed from: c */
        public static final void m41798c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: d */
        public static final InterfaceC23447K m41797d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends List<AdjustInventoryCountResponse>> invoke(Unit it) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(it, "it");
            List<DI3> mo7508Hd = AbstractC20252fA.this.f79557g.mo7508Hd();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(mo7508Hd, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (DI3 di3 : mo7508Hd) {
                arrayList.add(new Pair(di3.m110601b().getSku(), Integer.valueOf(di3.m110600c())));
            }
            AbstractC23442F<List<AdjustInventoryCountResponse>> m33152N = AbstractC20252fA.this.f79553c.mo40843h(arrayList).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "inventoryManager.increme…dSchedulers.mainThread())");
            AbstractC23442F progress$default = C28237sD.progress$default(m33152N, AbstractC20252fA.this.f79557g, 0, 2, (Object) null);
            final C20302a c20302a = new C20302a(AbstractC20252fA.this.f79557g);
            AbstractC23442F m33106t = progress$default.m33106t(new InterfaceC23484g() { // from class: hA
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    AbstractC20252fA.C20301t.m41798c(Function1.this, obj);
                }
            });
            final C20303b c20303b = C20303b.f79618g;
            return m33106t.m33150P(new InterfaceC23492o() { // from class: iA
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m41797d;
                    m41797d = AbstractC20252fA.C20301t.m41797d(Function1.this, obj);
                    return m41797d;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "partsRecorded", "", "Lco/bird/api/response/AdjustInventoryCountResponse;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$u */
    /* loaded from: classes3.dex */
    public static final class C20304u extends Lambda implements Function1<List<? extends AdjustInventoryCountResponse>, Unit> {
        public C20304u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends AdjustInventoryCountResponse> list) {
            invoke2((List<AdjustInventoryCountResponse>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<AdjustInventoryCountResponse> partsRecorded) {
            Intrinsics.checkNotNullExpressionValue(partsRecorded, "partsRecorded");
            if (!partsRecorded.isEmpty()) {
                InterfaceC40099e13 interfaceC40099e13 = AbstractC20252fA.this.f79558h;
                Intent intent = new Intent();
                intent.putExtra("part_count", partsRecorded.size());
                Unit unit = Unit.INSTANCE;
                interfaceC40099e13.mo37029e4(-1, intent);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "canScan", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$v */
    /* loaded from: classes3.dex */
    public static final class C20305v extends Lambda implements Function1<Boolean, Unit> {
        public C20305v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            if (bool.booleanValue()) {
                return;
            }
            AbstractC20252fA.this.f79557g.mo7498Vi(AbstractC20252fA.this.f79563m.m82623f8().getValue().getOperatorConfig().getFeatures().getWakeBirds().getBulkWakeMaxVehicles());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "canScan", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fA$w */
    /* loaded from: classes3.dex */
    public static final class C20306w extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C20306w f79621g = new C20306w();

        public C20306w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean canScan) {
            Intrinsics.checkNotNullParameter(canScan, "canScan");
            return canScan;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$x */
    /* loaded from: classes3.dex */
    public static final class C20307x extends Lambda implements Function1<Boolean, InterfaceC23447K<? extends Bird>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f79623h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20307x(WireBird wireBird) {
            super(1);
            this.f79623h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Bird> invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC46473om3 interfaceC46473om3 = AbstractC20252fA.this.f79554d;
            WireBird bird = this.f79623h;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            return interfaceC46473om3.mo8070w0(bird);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "persistenceBird", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$y */
    /* loaded from: classes3.dex */
    public static final class C20308y extends Lambda implements Function1<Bird, Unit> {
        public C20308y() {
            super(1);
        }

        /* renamed from: a */
        public final void m41795a(Bird bird) {
            AbstractC20252fA.this.m41869g0().onNext(bird);
            C24552a c24552a = AbstractC20252fA.this.f79570t;
            Integer num = (Integer) AbstractC20252fA.this.f79570t.getValue();
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            c24552a.onNext(Integer.valueOf(i));
            AbstractC20252fA.m41860j1(AbstractC20252fA.this, bird.getId(), C20279a.EnumC20280a.BLUETOOTH, null, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bird bird) {
            m41795a(bird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Bird;", "birds", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$z */
    /* loaded from: classes3.dex */
    public static final class C20309z extends Lambda implements Function1<List<? extends Bird>, InterfaceC23447K<? extends DialogResponse>> {
        public C20309z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends DialogResponse> invoke(List<Bird> birds) {
            Intrinsics.checkNotNullParameter(birds, "birds");
            if (!birds.isEmpty()) {
                return H31.C3014a.birdDialog$default(AbstractC20252fA.this.f79557g, C44277l40.f95421d, false, false, 6, null);
            }
            AbstractC23442F m33158H = AbstractC23442F.m33158H(DialogResponse.OK);
            Intrinsics.checkNotNullExpressionValue(m33158H, "{\n          Single.just(…logResponse.OK)\n        }");
            return m33158H;
        }
    }

    public AbstractC20252fA(BaseActivity activity, InterfaceC37097Xl3 inventoryManager, InterfaceC46473om3 operatorManager, InterfaceC27246pJ bluetoothManager, ScopeProvider scopeProvider, InterfaceC50205v40 ui, InterfaceC40099e13 navigator, BulkScanPurpose purpose, InterfaceC40613et3 delegate, InterfaceC1880Ea analyticsManager, WireBatch wireBatch, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(inventoryManager, "inventoryManager");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f79552b = activity;
        this.f79553c = inventoryManager;
        this.f79554d = operatorManager;
        this.f79555e = bluetoothManager;
        this.f79556f = scopeProvider;
        this.f79557g = ui;
        this.f79558h = navigator;
        this.f79559i = purpose;
        this.f79560j = delegate;
        this.f79561k = analyticsManager;
        this.f79562l = wireBatch;
        this.f79563m = reactiveConfig;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f79564n = uuid;
        C24552a<List<WireBird>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<List<WireBird>>()");
        this.f79565o = m31922e;
        C24552a<Bird> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<Bird>()");
        this.f79566p = m31922e2;
        C24552a<DI3> m31922e3 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e3, "create<PartViewModel>()");
        this.f79567q = m31922e3;
        C24552a<Unit> m31922e4 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e4, "create<Unit>()");
        this.f79568r = m31922e4;
        C24552a<Integer> m31921g = C24552a.m31921g(0);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(0)");
        this.f79570t = m31921g;
        this.f79571u = activity.getIntent().getStringExtra("co.bird.android.ops_batch_job_trip_stop_id");
        String stringExtra = activity.getIntent().getStringExtra("bulk_scan_intent");
        stringExtra = stringExtra == null ? OperatorScanIntent.SCAN.name() : stringExtra;
        Intrinsics.checkNotNullExpressionValue(stringExtra, "activity.intent.getStrin…ratorScanIntent.SCAN.name");
        this.f79572v = OperatorScanIntent.valueOf(stringExtra);
    }

    /* renamed from: A0 */
    public static final InterfaceC24574u m41935A0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: B0 */
    public static final void m41933B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C0 */
    public static final void m41931C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D0 */
    public static final InterfaceC23447K m41929D0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: E0 */
    public static final void m41927E0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F0 */
    public static final void m41925F0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G0 */
    public static final boolean m41924G0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: H0 */
    public static final InterfaceC23447K m41922H0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: I0 */
    public static final void m41920I0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J0 */
    public static final InterfaceC23447K m41918J0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: K0 */
    public static final InterfaceC24574u m41916K0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: L0 */
    public static final void m41914L0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M0 */
    public static final void m41912M0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N0 */
    public static final void m41910N0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O0 */
    public static final void m41908O0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P0 */
    public static final void m41906P0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q0 */
    public static final void m41904Q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R0 */
    public static final InterfaceC24574u m41902R0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: S0 */
    public static final void m41900S0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T0 */
    public static final void m41899T0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U0 */
    public static final void m41897U0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V0 */
    public static final void m41895V0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W0 */
    public static final void m41893W0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X0 */
    public static final void m41891X0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final InterfaceC23434B m41890Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: Y0 */
    public static final InterfaceC23434B m41889Y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final Bird m41886a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Bird) tmp0.invoke(obj);
    }

    /* renamed from: a1 */
    public static final InterfaceC24574u m41885a1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final InterfaceC23434B m41883b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: b1 */
    public static final void m41882b1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final InterfaceC23434B m41880c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: c1 */
    public static final void m41879c1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m41875e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e1 */
    public static final void m41874e1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m41872f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g1 */
    public static final boolean m41868g1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: h1 */
    public static final InterfaceC23434B m41865h1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m41860j1(AbstractC20252fA abstractC20252fA, String str, C20279a.EnumC20280a enumC20280a, DateTime dateTime, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackBulkScannerVehicleScanned");
        }
        if ((i & 4) != 0) {
            dateTime = null;
        }
        abstractC20252fA.m41862i1(str, enumC20280a, dateTime);
    }

    /* renamed from: p0 */
    public static final DI3 m41848p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DI3) tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final void m41845r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final InterfaceC24574u m41843s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final void m41841t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final void m41839u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final void m41836w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y0 */
    public static final void m41832y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z0 */
    public static final boolean m41830z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    @Override // p000.InterfaceC40613et3
    /* renamed from: N6 */
    public void mo35634N6() {
        this.f79560j.mo35634N6();
    }

    /* renamed from: X */
    public final Observable<Boolean> m41892X() {
        Observable<Integer> hide = this.f79570t.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "scannedCountSubject.hide()");
        Observable m31950a = C24527f.m31950a(hide, this.f79563m.m82854J2());
        final C20282c c20282c = new C20282c();
        Observable<Boolean> flatMap = m31950a.flatMap(new InterfaceC23492o() { // from class: Hz
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m41890Y;
                m41890Y = AbstractC20252fA.m41890Y(Function1.this, obj);
                return m41890Y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "private fun canUserScanM…ue)\n        }\n      }\n  }");
        return flatMap;
    }

    /* renamed from: Z */
    public Observable<Bird> m41888Z(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Observable progress$default = C28237sD.progress$default(this.f79554d.mo8119Z0(C0613BT.m114027f(bird), AlarmCommand.CHIRP), this.f79557g, 0, 2, (Object) null);
        final C20285f c20285f = new C20285f(bird);
        Observable<Bird> map = progress$default.map(new InterfaceC23492o() { // from class: Jz
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Bird m41886a0;
                m41886a0 = AbstractC20252fA.m41886a0(Function1.this, obj);
                return m41886a0;
            }
        });
        if (bird.getBluetooth()) {
            Observable progress$default2 = C28237sD.progress$default(InterfaceC27246pJ.C27247a.alarm$default(this.f79555e, C0613BT.m114027f(bird), AlarmType.SHORT, true, false, 8, null), this.f79557g, 0, 2, (Object) null);
            final C20283d c20283d = new C20283d();
            Observable flatMap = progress$default2.flatMap(new InterfaceC23492o() { // from class: Kz
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m41883b0;
                    m41883b0 = AbstractC20252fA.m41883b0(Function1.this, obj);
                    return m41883b0;
                }
            });
            final C20284e c20284e = new C20284e(bird);
            Observable<Bird> onErrorResumeNext = flatMap.flatMap(new InterfaceC23492o() { // from class: Lz
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m41880c0;
                    m41880c0 = AbstractC20252fA.m41880c0(Function1.this, obj);
                    return m41880c0;
                }
            }).onErrorResumeNext(map);
            Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "override fun chirpAlarm(…   networkChirp\n    }\n  }");
            return onErrorResumeNext;
        }
        Intrinsics.checkNotNullExpressionValue(map, "{\n      networkChirp\n    }");
        return map;
    }

    /* renamed from: Z0 */
    public final void m41887Z0(Throwable th) {
        int i;
        C41318g46.m40159e(th);
        if (th instanceof HttpException) {
            this.f79557g.error(th);
        }
        this.f79557g.vibrate(1000L);
        if (this.f79559i == BulkScanPurpose.PART_SCAN) {
            i = C45871nl4.bulk_scan_part_toast_error;
        } else {
            i = C45871nl4.bulk_scan_toast_error;
        }
        this.f79557g.mo7494a2(i);
    }

    @Override // p000.InterfaceC40613et3
    /* renamed from: a */
    public void mo35633a() {
        this.f79560j.mo35633a();
        if (this.f79559i == BulkScanPurpose.PART_SCAN) {
            m41834x0();
        } else {
            m41847q0();
        }
        this.f79557g.mo7507I5();
        this.f79557g.mo7500Ve(false);
        this.f79560j.mo35632a5(true);
        Object m33135e = this.f79554d.mo8147I0().m33135e(AutoDispose.m45239a(this.f79556f));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20261G c20261g = new C20261G(this.f79565o);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: oz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41912M0(Function1.this, obj);
            }
        });
        Observable<C9400XK> mo7497W3 = this.f79557g.mo7497W3();
        final C20262H c20262h = new C20262H();
        Observable<C9400XK> doOnNext = mo7497W3.doOnNext(new InterfaceC23484g() { // from class: sz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41910N0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun onCreate() …utton = true)\n      }\n  }");
        Observable observeOn = C24527f.m31950a(doOnNext, m41892X()).observeOn(C23454a.m33087a());
        final C20263I c20263i = new C20263I();
        Observable observeOn2 = observeOn.flatMapMaybe(new InterfaceC23492o() { // from class: tz
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m41902R0;
                m41902R0 = AbstractC20252fA.m41902R0(Function1.this, obj);
                return m41902R0;
            }
        }).observeOn(C23454a.m33087a());
        final C20265J c20265j = new C20265J();
        Observable doAfterNext = observeOn2.doAfterNext(new InterfaceC23484g() { // from class: uz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41900S0(Function1.this, obj);
            }
        });
        final C20266K c20266k = new C20266K();
        Observable doOnNext2 = doAfterNext.doOnNext(new InterfaceC23484g() { // from class: vz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41899T0(Function1.this, obj);
            }
        });
        final C20267L c20267l = new C20267L(this);
        Observable retry = doOnNext2.doOnError(new InterfaceC23484g() { // from class: wz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41897U0(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun onCreate() …utton = true)\n      }\n  }");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(this.f79556f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20268M c20268m = new C20268M();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: yz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41895V0(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f79557g.mo7489dc().m33094as(AutoDispose.m45239a(this.f79556f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20269N c20269n = new C20269N();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: zz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41893W0(Function1.this, obj);
            }
        });
        Observable<Bird> observeOn3 = this.f79557g.mo7503Q0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.taskClicks()\n      .o…dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f79556f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20270O c20270o = new C20270O();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Az
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41891X0(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(this.f79557g.mo7501U0(), this.f79557g.mo7503Q0());
        final C20256C c20256c = new C20256C();
        Observable flatMap = m31950a.flatMap(new InterfaceC23492o() { // from class: Bz
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m41889Y0;
                m41889Y0 = AbstractC20252fA.m41889Y0(Function1.this, obj);
                return m41889Y0;
            }
        });
        final C20258D c20258d = new C20258D(this.f79557g);
        Observable observeOn4 = flatMap.doOnError(new InterfaceC23484g() { // from class: pz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41908O0(Function1.this, obj);
            }
        }).retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "override fun onCreate() …utton = true)\n      }\n  }");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(this.f79556f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20259E c20259e = new C20259E();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: qz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41906P0(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn5 = this.f79557g.mo7484ie().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "ui.bluetoothButtonClicks…dSchedulers.mainThread())");
        Object m33094as5 = observeOn5.m33094as(AutoDispose.m45239a(this.f79556f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20260F c20260f = new C20260F();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: rz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41904Q0(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC40613et3
    /* renamed from: a5 */
    public void mo35632a5(boolean z) {
        this.f79560j.mo35632a5(z);
    }

    /* renamed from: d0 */
    public final AbstractC24507p<Bird> m41877d0(String str) {
        AbstractC24507p m32066I = C28237sD.progress$default(this.f79554d.mo8150F0(str, ScanMode.ADMIN, mo10918j0(), this.f79559i), this.f79557g, 0, 2, (Object) null).m32066I(C23454a.m33087a());
        final C20286g c20286g = new C20286g();
        AbstractC24507p m32026s = m32066I.m32026s(new InterfaceC23484g() { // from class: Dz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41875e0(Function1.this, obj);
            }
        });
        final C20287h c20287h = new C20287h();
        AbstractC24507p<Bird> m32029p = m32026s.m32029p(new InterfaceC23484g() { // from class: Ez
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41872f0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32029p, "private fun getBirdForCo…ATE_DURATION)\n      }\n  }");
        return m32029p;
    }

    @Override // p000.InterfaceC40613et3
    /* renamed from: d4 */
    public Observable<C38511bN4> mo35628d4() {
        return this.f79560j.mo35628d4();
    }

    /* renamed from: f1 */
    public Observable<Bird> m41871f1(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        AbstractC23442F dialog$default = H31.C3014a.dialog$default(this.f79557g, new C44795lw4(bird.getCode()), false, false, 6, null);
        final C20277T c20277t = C20277T.f79592g;
        AbstractC24507p m33098z = dialog$default.m33098z(new InterfaceC23494q() { // from class: Fz
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m41868g1;
                m41868g1 = AbstractC20252fA.m41868g1(Function1.this, obj);
                return m41868g1;
            }
        });
        final C20278U c20278u = new C20278U(bird);
        Observable<Bird> m32073B = m33098z.m32073B(new InterfaceC23492o() { // from class: Gz
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m41865h1;
                m41865h1 = AbstractC20252fA.m41865h1(Function1.this, obj);
                return m41865h1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32073B, "override fun removeFromL…e.just(bird))\n      }\n  }");
        return m32073B;
    }

    /* renamed from: g0 */
    public final C24552a<Bird> m41869g0() {
        return this.f79566p;
    }

    /* renamed from: h0 */
    public final AbstractC23442F<WireInventoryPart> m41866h0(String str) {
        return this.f79553c.mo40850a(str);
    }

    @Override // me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler
    public void handleResult(C38511bN4 c38511bN4) {
        this.f79560j.handleResult(c38511bN4);
    }

    /* renamed from: i0 */
    public final C24552a<DI3> m41863i0() {
        return this.f79567q;
    }

    /* renamed from: i1 */
    public final void m41862i1(String str, C20279a.EnumC20280a enumC20280a, DateTime dateTime) {
        this.f79561k.mo55905y(new C51984y40(null, str, this.f79564n, null, null, enumC20280a.name(), dateTime, DateTime.now(), 25, null));
    }

    /* renamed from: j0 */
    public abstract ScanIntention mo10918j0();

    /* renamed from: k0 */
    public final String m41858k0() {
        return this.f79564n;
    }

    /* renamed from: l0 */
    public final C24552a<List<WireBird>> m41856l0() {
        return this.f79565o;
    }

    /* renamed from: m0 */
    public final void m41854m0() {
        this.f79557g.mo7480n0();
        int i = C20281b.$EnumSwitchMapping$0[this.f79559i.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            this.f79568r.onNext(Unit.INSTANCE);
                            return;
                        }
                        return;
                    }
                    InterfaceC40099e13 interfaceC40099e13 = this.f79558h;
                    BulkScanPurpose bulkScanPurpose = this.f79559i;
                    WireBatch wireBatch = this.f79562l;
                    Intrinsics.checkNotNull(wireBatch);
                    interfaceC40099e13.mo37199A4(bulkScanPurpose, wireBatch, OpsBatchJobActionKind.ADD_TO_BATCH, EnumC52120yI4.ADD_TO_BATCH.ordinal(), this.f79564n);
                    return;
                }
                InterfaceC40099e13.C19924a.goToBulkActionStatus$default(this.f79558h, this.f79559i, OpsBatchJobActionKind.WAKE_BLUETOOTH, EnumC52120yI4.BULK_WAKE.ordinal(), this.f79564n, null, 16, null);
                return;
            }
            this.f79558h.mo36906z1(10021, this.f79564n);
            return;
        }
        this.f79558h.mo36968p(EnumC52120yI4.BULK_UPDATE.ordinal(), this.f79564n, this.f79571u, this.f79572v);
    }

    /* renamed from: n0 */
    public final AbstractC24507p<Bird> m41852n0(C38511bN4 c38511bN4) {
        if (c38511bN4.m64617f() != null) {
            String raw = c38511bN4.m64617f();
            C33894Jt4 c33894Jt4 = C33894Jt4.f18402a;
            Intrinsics.checkNotNullExpressionValue(raw, "raw");
            String m99597e = c33894Jt4.m99597e(raw);
            if (m99597e != null) {
                raw = m99597e;
            }
            return m41877d0(raw);
        }
        AbstractC24507p<Bird> m32024u = AbstractC24507p.m32024u();
        Intrinsics.checkNotNullExpressionValue(m32024u, "{\n      Maybe.empty()\n    }");
        return m32024u;
    }

    /* renamed from: o0 */
    public final AbstractC24507p<DI3> m41850o0(C38511bN4 c38511bN4) {
        if (c38511bN4.m64617f() != null) {
            String raw = c38511bN4.m64617f();
            C33894Jt4 c33894Jt4 = C33894Jt4.f18402a;
            Intrinsics.checkNotNullExpressionValue(raw, "raw");
            Pair<String, String> m99600b = c33894Jt4.m99600b(raw);
            String component1 = m99600b.component1();
            String component2 = m99600b.component2();
            int i = 0;
            if (component2 != null) {
                try {
                    i = Integer.parseInt(component2);
                } catch (NumberFormatException unused) {
                }
            }
            if (component1 != null) {
                raw = component1;
            }
            AbstractC24507p<WireInventoryPart> m33125j0 = m41866h0(raw).m33125j0();
            final C20289i c20289i = new C20289i(i);
            AbstractC24507p m32067H = m33125j0.m32067H(new InterfaceC23492o() { // from class: Cz
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    DI3 m41848p0;
                    m41848p0 = AbstractC20252fA.m41848p0(Function1.this, obj);
                    return m41848p0;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32067H, "{\n      val raw = rawRes…)\n        }\n      }\n    }");
            return m32067H;
        }
        AbstractC24507p<DI3> m32024u = AbstractC24507p.m32024u();
        Intrinsics.checkNotNullExpressionValue(m32024u, "{\n      Maybe.empty()\n    }");
        return m32024u;
    }

    @Override // p000.InterfaceC44870m40
    public void onActivityResult(int i, int i2, Intent intent) {
        WireBird wireBird;
        if (i == EnumC52120yI4.ADD_TO_BATCH.ordinal()) {
            this.f79558h.close();
        } else if (i == 10000 && i2 == -1 && intent != null && (wireBird = (WireBird) intent.getParcelableExtra("co.bird.android.bird_filter_added_bird")) != null) {
            AbstractC23442F<Boolean> m33152N = m41892X().firstOrError().m33152N(C23454a.m33087a());
            final C20305v c20305v = new C20305v();
            AbstractC23442F<Boolean> m33101w = m33152N.m33101w(new InterfaceC23484g() { // from class: mz
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    AbstractC20252fA.m41925F0(Function1.this, obj);
                }
            });
            final C20306w c20306w = C20306w.f79621g;
            AbstractC24507p<Boolean> m33098z = m33101w.m33098z(new InterfaceC23494q() { // from class: xz
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m41924G0;
                    m41924G0 = AbstractC20252fA.m41924G0(Function1.this, obj);
                    return m41924G0;
                }
            });
            final C20307x c20307x = new C20307x(wireBird);
            AbstractC23442F<R> m32072C = m33098z.m32072C(new InterfaceC23492o() { // from class: Iz
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m41922H0;
                    m41922H0 = AbstractC20252fA.m41922H0(Function1.this, obj);
                    return m41922H0;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32072C, "override fun onActivityR… ui.closeCodeEditor()\n  }");
            Object m33135e = m32072C.m33135e(AutoDispose.m45239a(this.f79556f));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C20308y c20308y = new C20308y();
            ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: Tz
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    AbstractC20252fA.m41920I0(Function1.this, obj);
                }
            });
        }
        this.f79557g.mo7509Eb();
    }

    @Override // p000.InterfaceC44870m40
    public void onBackPressed() {
        AbstractC23442F<List<Bird>> m33152N = this.f79554d.mo8093l1(this.f79559i).firstOrError().m33152N(C23454a.m33087a());
        final C20309z c20309z = new C20309z();
        AbstractC23442F<R> m33165A = m33152N.m33165A(new InterfaceC23492o() { // from class: dA
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m41918J0;
                m41918J0 = AbstractC20252fA.m41918J0(Function1.this, obj);
                return m41918J0;
            }
        });
        final C20253A c20253a = new C20253A();
        AbstractC24507p m33163C = m33165A.m33163C(new InterfaceC23492o() { // from class: eA
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m41916K0;
                m41916K0 = AbstractC20252fA.m41916K0(Function1.this, obj);
                return m41916K0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33163C, "override fun onBackPress…vigator.closeDown() }\n  }");
        Object m32048b = m33163C.m32048b(AutoDispose.m45239a(this.f79556f));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20255B c20255b = new C20255B();
        ((MaybeSubscribeProxy) m32048b).subscribe(new InterfaceC23484g() { // from class: nz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41914L0(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC40613et3
    public void onPause() {
        this.f79560j.onPause();
    }

    @Override // p000.InterfaceC40613et3
    public void onResume() {
        this.f79560j.onResume();
    }

    @Override // p000.InterfaceC44870m40
    /* renamed from: q */
    public void mo26396q() {
        AbstractC23442F m74531s0 = C37279Yf5.m74531s0(this.f79557g.mo7505M(C45871nl4.enter_code, C45871nl4.enter_vehicle_code_dialog_hint), m41892X());
        final C20271P c20271p = new C20271P();
        AbstractC24507p m33163C = m74531s0.m33163C(new InterfaceC23492o() { // from class: Zz
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m41885a1;
                m41885a1 = AbstractC20252fA.m41885a1(Function1.this, obj);
                return m41885a1;
            }
        });
        final C20274Q c20274q = new C20274Q();
        AbstractC24507p m32026s = m33163C.m32026s(new InterfaceC23484g() { // from class: aA
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41882b1(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32026s, "override fun onQrCodeIco…t(bird) }, Timber::e)\n  }");
        Object m32048b = m32026s.m32048b(AutoDispose.m45239a(this.f79556f));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20275R c20275r = new C20275R();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: bA
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41879c1(Function1.this, obj);
            }
        };
        final C20276S c20276s = C20276S.f79591b;
        ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: cA
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41874e1(Function1.this, obj);
            }
        });
    }

    /* renamed from: q0 */
    public final void m41847q0() {
        this.f79557g.mo7483j5(true);
        Observable<C38511bN4> mo35628d4 = this.f79560j.mo35628d4();
        final C20290j c20290j = new C20290j();
        Observable<C38511bN4> doOnNext = mo35628d4.doOnNext(new InterfaceC23484g() { // from class: Uz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41845r0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "private fun initBirdScan…plus(1) ?: 1)\n      }\n  }");
        Observable m31950a = C24527f.m31950a(doOnNext, m41892X());
        final C20291k c20291k = new C20291k();
        Observable observeOn = m31950a.flatMapMaybe(new InterfaceC23492o() { // from class: Vz
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m41843s0;
                m41843s0 = AbstractC20252fA.m41843s0(Function1.this, obj);
                return m41843s0;
            }
        }).observeOn(C23454a.m33087a());
        final C20293l c20293l = new C20293l();
        Observable doOnNext2 = observeOn.doOnNext(new InterfaceC23484g() { // from class: Wz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41841t0(Function1.this, obj);
            }
        });
        final C20294m c20294m = new C20294m(this);
        Observable retry = doOnNext2.doOnError(new InterfaceC23484g() { // from class: Xz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41839u0(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun initBirdScan…plus(1) ?: 1)\n      }\n  }");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(this.f79556f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20295n c20295n = new C20295n();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Yz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41836w0(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC44870m40
    /* renamed from: t8 */
    public void mo26395t8() {
        this.f79569s = true;
        this.f79557g.mo7493c2();
        this.f79557g.mo7506K6();
        this.f79557g.mo7510Dd();
    }

    /* renamed from: x0 */
    public final void m41834x0() {
        this.f79557g.mo7504Nh();
        Observable<C38511bN4> mo35628d4 = this.f79560j.mo35628d4();
        final C20296o c20296o = new C20296o();
        Observable<C38511bN4> doOnNext = mo35628d4.doOnNext(new InterfaceC23484g() { // from class: Mz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41832y0(Function1.this, obj);
            }
        });
        final C20297p c20297p = C20297p.f79614g;
        Observable<C38511bN4> filter = doOnNext.filter(new InterfaceC23494q() { // from class: Nz
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m41830z0;
                m41830z0 = AbstractC20252fA.m41830z0(Function1.this, obj);
                return m41830z0;
            }
        });
        final C20298q c20298q = new C20298q();
        Observable observeOn = filter.flatMapMaybe(new InterfaceC23492o() { // from class: Oz
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m41935A0;
                m41935A0 = AbstractC20252fA.m41935A0(Function1.this, obj);
                return m41935A0;
            }
        }).observeOn(C23454a.m33087a());
        final C20299r c20299r = new C20299r(this);
        Observable retry = observeOn.doOnError(new InterfaceC23484g() { // from class: Pz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41933B0(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun initPartScan… })\n        }\n      }\n  }");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(this.f79556f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20300s c20300s = new C20300s();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Qz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41931C0(Function1.this, obj);
            }
        });
        C24552a<Unit> c24552a = this.f79568r;
        final C20301t c20301t = new C20301t();
        Observable observeOn2 = c24552a.flatMapSingle(new InterfaceC23492o() { // from class: Rz
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m41929D0;
                m41929D0 = AbstractC20252fA.m41929D0(Function1.this, obj);
                return m41929D0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "private fun initPartScan… })\n        }\n      }\n  }");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f79556f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20304u c20304u = new C20304u();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Sz
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC20252fA.m41927E0(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\"\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$c */
    /* loaded from: classes3.dex */
    public static final class C20282c extends Lambda implements Function1<Pair<? extends Integer, ? extends Integer>, InterfaceC23434B<? extends Boolean>> {
        public C20282c() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends Boolean> invoke2(Pair<Integer, Integer> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Integer birdsCount = pair.component1();
            Integer maxVehicles = pair.component2();
            if (AbstractC20252fA.this.f79559i == BulkScanPurpose.WAKE_VEHICLES) {
                Intrinsics.checkNotNullExpressionValue(birdsCount, "birdsCount");
                int intValue = birdsCount.intValue();
                Intrinsics.checkNotNullExpressionValue(maxVehicles, "maxVehicles");
                if (intValue < maxVehicles.intValue()) {
                    return Observable.just(Boolean.TRUE);
                }
                return Observable.just(Boolean.FALSE);
            }
            return Observable.just(Boolean.TRUE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends Boolean> invoke(Pair<? extends Integer, ? extends Integer> pair) {
            return invoke2((Pair<Integer, Integer>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/constant/BirdAction;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fA$C */
    /* loaded from: classes3.dex */
    public static final class C20256C extends Lambda implements Function1<Pair<? extends BirdAction, ? extends Bird>, InterfaceC23434B<? extends Bird>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: fA$C$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C20257a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BirdAction.values().length];
                try {
                    iArr[BirdAction.ALARM.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BirdAction.REMOVE_FROM_LIST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BirdAction.FLIGHT_SHEET.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C20256C() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends Bird> invoke2(Pair<? extends BirdAction, Bird> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Bird bird = pair.component2();
            int i = C20257a.$EnumSwitchMapping$0[pair.component1().ordinal()];
            if (i == 1) {
                AbstractC20252fA abstractC20252fA = AbstractC20252fA.this;
                Intrinsics.checkNotNullExpressionValue(bird, "bird");
                return abstractC20252fA.m41888Z(bird);
            } else if (i == 2) {
                AbstractC20252fA abstractC20252fA2 = AbstractC20252fA.this;
                Intrinsics.checkNotNullExpressionValue(bird, "bird");
                return abstractC20252fA2.m41871f1(bird);
            } else if (i != 3) {
                Observable just = Observable.just(bird);
                Intrinsics.checkNotNullExpressionValue(just, "just(bird)");
                return just;
            } else {
                InterfaceC40099e13 interfaceC40099e13 = AbstractC20252fA.this.f79558h;
                Intrinsics.checkNotNullExpressionValue(bird, "bird");
                interfaceC40099e13.mo36903z4(C0613BT.m114027f(bird));
                Observable just2 = Observable.just(bird);
                Intrinsics.checkNotNullExpressionValue(just2, "{\n            navigator.…le.just(bird)\n          }");
                return just2;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends Bird> invoke(Pair<? extends BirdAction, ? extends Bird> pair) {
            return invoke2((Pair<? extends BirdAction, Bird>) pair);
        }
    }
}
