package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.RepairType;
import co.bird.android.model.Sticker;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdPart;
import co.bird.android.model.wire.WirePart;
import co.bird.api.error.RetrofitException;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import p000.C34039Kj5;
import p000.C47377qI3;
import p000.H31;
@Metadata(m28433d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u0000 _2\u00020\u0001:\u0001!BA\b\u0007\u0012\u0006\u0010/\u001a\u00020+\u0012\u0006\u00104\u001a\u000200\u0012\u0006\u00109\u001a\u000205\u0012\u0006\u0010?\u001a\u00020:\u0012\u0006\u0010E\u001a\u00020@\u0012\u0006\u0010K\u001a\u00020F\u0012\u0006\u0010Q\u001a\u00020L¢\u0006\u0004\b]\u0010^J2\u0010\u000b\u001a\u00020\n2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002J*\u0010\u000e\u001a\u00020\n2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\"\u0010\u000f\u001a\u00020\n2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0002J*\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00030\u00122\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J$\u0010\u001d\u001a\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001bH\u0002J\u0018\u0010\u001e\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016J\u001a\u0010!\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\"\u0010&\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010'\u001a\u00020\nH\u0016J\b\u0010(\u001a\u00020\nH\u0016J\u000f\u0010)\u001a\u00020\nH\u0000¢\u0006\u0004\b)\u0010*R\u001a\u0010/\u001a\u00020+8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b!\u0010,\u001a\u0004\b-\u0010.R\u001a\u00104\u001a\u0002008\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001e\u00101\u001a\u0004\b2\u00103R\u001a\u00109\u001a\u0002058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b&\u00106\u001a\u0004\b7\u00108R\u001a\u0010?\u001a\u00020:8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010E\u001a\u00020@8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010K\u001a\u00020F8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010Q\u001a\u00020L8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SRn\u0010\u0006\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 T*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 T**\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 T*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0018\u0010\\\u001a\u00020Y*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006`"}, m28432d2 = {"LKj5;", "Lnj5;", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "Ls32;", "scanObservable", "", "Lco/bird/android/model/constant/BirdModel;", "restrictModels", "", "U", "Lco/bird/android/model/constant/PartKind;", "kind", "b0", "g0", "raw", "inputType", "Lio/reactivex/p;", "Lco/bird/android/model/wire/WireBirdPart;", "Lco/bird/android/model/wire/WireBird;", "K", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WirePart;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "", "error", "LHM4;", "response", "S", "b", "Lco/bird/android/model/RepairType;", "repairType", C17296a.f69688o, "", "enablePeripheralScanner", "manualInput", "previousScanIdentifier", "c", "onResume", "onPause", "R", "()V", "Lom3;", "Lom3;", "B", "()Lom3;", "operatorManager", "LSM;", "LSM;", "getBirdPartManager", "()LSM;", "birdPartManager", "LNQ5;", "LNQ5;", "getStickerManager", "()LNQ5;", "stickerManager", "LTq4;", DateTokenConverter.CONVERTER_KEY, "LTq4;", "G", "()LTq4;", "reactiveConfig", "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "I", "()Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LQj5;", "f", "LQj5;", "J", "()LQj5;", "ui", "Le13;", "g", "Le13;", "A", "()Le13;", "navigator", "h", "Lco/bird/android/model/RepairType;", "kotlin.jvm.PlatformType", "i", "Lio/reactivex/Observable;", "H", "()Lio/reactivex/Observable;", "", "z", "(Ljava/lang/Throwable;)I", PaymentMethodOptionsParams.Blik.PARAM_CODE, "<init>", "(Lom3;LSM;LNQ5;LTq4;Lcom/uber/autodispose/ScopeProvider;LQj5;Le13;)V", "j", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScanCodePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanCodePresenter.kt\nco/bird/android/vehiclescanner/servicecenter/scan/ScanCodePresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n180#2:311\n180#2:312\n161#2:313\n161#2:314\n180#2:315\n1#3:316\n*S KotlinDebug\n*F\n+ 1 ScanCodePresenter.kt\nco/bird/android/vehiclescanner/servicecenter/scan/ScanCodePresenterImpl\n*L\n127#1:311\n132#1:312\n168#1:313\n187#1:314\n201#1:315\n*E\n"})
/* renamed from: Kj5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C34039Kj5 implements InterfaceC45852nj5 {

    /* renamed from: j */
    public static final C4557a f20105j = new C4557a(null);

    /* renamed from: a */
    public final InterfaceC46473om3 f20106a;

    /* renamed from: b */
    public final InterfaceC7381SM f20107b;

    /* renamed from: c */
    public final NQ5 f20108c;

    /* renamed from: d */
    public final C36207Tq4 f20109d;

    /* renamed from: e */
    public final ScopeProvider f20110e;

    /* renamed from: f */
    public final InterfaceC35443Qj5 f20111f;

    /* renamed from: g */
    public final InterfaceC40099e13 f20112g;

    /* renamed from: h */
    public RepairType f20113h;

    /* renamed from: i */
    public final Observable<Pair<String, EnumC48419s32>> f20114i;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LKj5$a;", "", "", "SCAN_THROTTLE_MILLIS", "J", "<init>", "()V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Kj5$a */
    /* loaded from: classes4.dex */
    public static final class C4557a {
        public /* synthetic */ C4557a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4557a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/Sticker;", "response", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lco/bird/android/model/Sticker;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kj5$b */
    /* loaded from: classes4.dex */
    public static final class C4558b extends Lambda implements Function1<HM4<Sticker>, Sticker> {

        /* renamed from: g */
        public static final C4558b f20115g = new C4558b();

        public C4558b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Sticker invoke(HM4<Sticker> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Sticker m103944a = response.m103944a();
            Intrinsics.checkNotNull(m103944a);
            return m103944a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Sticker;", "sticker", "Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Sticker;)Lco/bird/android/model/wire/WirePart;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kj5$c */
    /* loaded from: classes4.dex */
    public static final class C4559c extends Lambda implements Function1<Sticker, WirePart> {

        /* renamed from: g */
        public final /* synthetic */ PartKind f20116g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4559c(PartKind partKind) {
            super(1);
            this.f20116g = partKind;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WirePart invoke(Sticker sticker) {
            Intrinsics.checkNotNullParameter(sticker, "sticker");
            return new WirePart(sticker.getId(), this.f20116g, sticker.getCode());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "e", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kj5$d */
    /* loaded from: classes4.dex */
    public static final class C4560d extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends WirePart>> {

        /* renamed from: g */
        public final /* synthetic */ PartKind f20117g;

        /* renamed from: h */
        public final /* synthetic */ String f20118h;

        /* renamed from: i */
        public final /* synthetic */ C34039Kj5 f20119i;

        /* renamed from: j */
        public final /* synthetic */ String f20120j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4560d(PartKind partKind, String str, C34039Kj5 c34039Kj5, String str2) {
            super(1);
            this.f20117g = partKind;
            this.f20118h = str;
            this.f20119i = c34039Kj5;
            this.f20120j = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends WirePart> invoke(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if (this.f20117g != PartKind.STICKER && this.f20118h == null) {
                int m98362z = this.f20119i.m98362z(e);
                boolean z = false;
                if (400 <= m98362z && m98362z < 500) {
                    z = true;
                }
                if (z) {
                    return AbstractC23442F.m33158H(new WirePart(null, this.f20117g, this.f20120j, 1, null));
                }
            }
            return AbstractC23442F.m33100x(e);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/wire/WireBirdPart;", "response", C17296a.f69688o, "(LHM4;)Lco/bird/android/model/wire/WireBirdPart;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kj5$e */
    /* loaded from: classes4.dex */
    public static final class C4561e extends Lambda implements Function1<HM4<WireBirdPart>, WireBirdPart> {

        /* renamed from: g */
        public static final C4561e f20121g = new C4561e();

        public C4561e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireBirdPart invoke(HM4<WireBirdPart> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return response.m103944a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003 \u0006*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/WireBirdPart;", "wireBirdPart", "Lio/reactivex/K;", "Lkotlin/Pair;", "LHM4;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireBirdPart;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kj5$f */
    /* loaded from: classes4.dex */
    public static final class C4562f extends Lambda implements Function1<WireBirdPart, InterfaceC23447K<? extends Pair<? extends WireBirdPart, ? extends HM4<WireBird>>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/wire/WireBird;", "response", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBirdPart;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Kj5$f$a */
        /* loaded from: classes4.dex */
        public static final class C4563a extends Lambda implements Function1<HM4<WireBird>, Pair<? extends WireBirdPart, ? extends HM4<WireBird>>> {

            /* renamed from: g */
            public final /* synthetic */ WireBirdPart f20123g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4563a(WireBirdPart wireBirdPart) {
                super(1);
                this.f20123g = wireBirdPart;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<WireBirdPart, HM4<WireBird>> invoke(HM4<WireBird> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return TuplesKt.m28425to(this.f20123g, response);
            }
        }

        public C4562f() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<WireBirdPart, HM4<WireBird>>> invoke(WireBirdPart wireBirdPart) {
            Intrinsics.checkNotNullParameter(wireBirdPart, "wireBirdPart");
            AbstractC23442F<HM4<WireBird>> mo8116b = C34039Kj5.this.m98419B().mo8116b(wireBirdPart.getBirdId());
            final C4563a c4563a = new C4563a(wireBirdPart);
            return mo8116b.m33157I(new InterfaceC23492o() { // from class: Lj5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C34039Kj5.C4562f.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBirdPart;", "LHM4;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kj5$g */
    /* loaded from: classes4.dex */
    public static final class C4564g extends Lambda implements Function1<Pair<? extends WireBirdPart, ? extends HM4<WireBird>>, Unit> {
        public C4564g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireBirdPart, ? extends HM4<WireBird>> pair) {
            invoke2((Pair<WireBirdPart, HM4<WireBird>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireBirdPart, HM4<WireBird>> pair) {
            HM4<WireBird> component2 = pair.component2();
            if (!component2.m103939f() || component2.m103944a() == null) {
                C34039Kj5.m98401T(C34039Kj5.this, null, component2, 1, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003 \u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003 \u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBirdPart;", "LHM4;", "Lco/bird/android/model/wire/WireBird;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kj5$h */
    /* loaded from: classes4.dex */
    public static final class C4565h extends Lambda implements Function1<Pair<? extends WireBirdPart, ? extends HM4<WireBird>>, InterfaceC24574u<? extends Pair<? extends WireBirdPart, ? extends WireBird>>> {
        public C4565h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Pair<WireBirdPart, WireBird>> invoke(Pair<WireBirdPart, HM4<WireBird>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireBirdPart component1 = pair.component1();
            HM4<WireBird> component2 = pair.component2();
            WireBird m103944a = component2.m103944a();
            if (component2.m103939f() && m103944a != null) {
                return AbstractC24507p.m32068G(TuplesKt.m28425to(component1, m103944a));
            }
            C34039Kj5.m98401T(C34039Kj5.this, null, component2, 1, null);
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Kj5$i */
    /* loaded from: classes4.dex */
    public static final class C4566i extends Lambda implements Function1<Unit, Unit> {
        public C4566i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C34039Kj5.this.m98411J().mo84845B6();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Kj5$j */
    /* loaded from: classes4.dex */
    public static final class C4567j extends Lambda implements Function1<Unit, Unit> {
        public C4567j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C34039Kj5.this.m98411J().mo84833ud();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00000\u0000 \u0007*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Ls32;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lco/bird/android/model/wire/WireBirdPart;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kj5$k */
    /* loaded from: classes4.dex */
    public static final class C4568k extends Lambda implements Function1<Pair<? extends String, ? extends EnumC48419s32>, InterfaceC24574u<? extends Pair<? extends WireBirdPart, ? extends WireBird>>> {
        public C4568k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Pair<WireBirdPart, WireBird>> invoke(Pair<String, ? extends EnumC48419s32> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return C34039Kj5.this.m98410K(pair.component1(), pair.component2());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0005*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0005*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBirdPart;", "Lco/bird/android/model/wire/WireBird;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kj5$l */
    /* loaded from: classes4.dex */
    public static final class C4569l extends Lambda implements Function1<Pair<? extends WireBirdPart, ? extends WireBird>, InterfaceC23447K<? extends Pair<? extends WireBirdPart, ? extends WireBird>>> {

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LHM4;", "", "it", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBirdPart;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Kj5$l$a */
        /* loaded from: classes4.dex */
        public static final class C4570a extends Lambda implements Function1<HM4<Boolean>, Pair<? extends WireBirdPart, ? extends WireBird>> {

            /* renamed from: g */
            public final /* synthetic */ WireBirdPart f20130g;

            /* renamed from: h */
            public final /* synthetic */ WireBird f20131h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4570a(WireBirdPart wireBirdPart, WireBird wireBird) {
                super(1);
                this.f20130g = wireBirdPart;
                this.f20131h = wireBird;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<WireBirdPart, WireBird> invoke(HM4<Boolean> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f20130g, this.f20131h);
            }
        }

        public C4569l() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<WireBirdPart, WireBird>> invoke(Pair<WireBirdPart, WireBird> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireBird component2 = pair.component2();
            AbstractC23442F<HM4<Boolean>> mo8115b1 = C34039Kj5.this.m98419B().mo8115b1(component2.getId());
            final C4570a c4570a = new C4570a(pair.component1(), component2);
            return mo8115b1.m33157I(new InterfaceC23492o() { // from class: Mj5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C34039Kj5.C4569l.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0005*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0005*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBirdPart;", "Lco/bird/android/model/wire/WireBird;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kj5$m */
    /* loaded from: classes4.dex */
    public static final class C4571m extends Lambda implements Function1<Pair<? extends WireBirdPart, ? extends WireBird>, InterfaceC24574u<? extends Pair<? extends WireBirdPart, ? extends WireBird>>> {

        /* renamed from: g */
        public final /* synthetic */ List<BirdModel> f20132g;

        /* renamed from: h */
        public final /* synthetic */ C34039Kj5 f20133h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Kj5$m$a */
        /* loaded from: classes4.dex */
        public static final class C4572a extends Lambda implements Function1<DialogResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C34039Kj5 f20134g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4572a(C34039Kj5 c34039Kj5) {
                super(1);
                this.f20134g = c34039Kj5;
            }

            /* renamed from: a */
            public final void m98347a(DialogResponse dialogResponse) {
                this.f20134g.m98411J().mo84842O3(true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                m98347a(dialogResponse);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/u;", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBirdPart;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Kj5$m$b */
        /* loaded from: classes4.dex */
        public static final class C4573b extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends Pair<? extends WireBirdPart, ? extends WireBird>>> {

            /* renamed from: g */
            public static final C4573b f20135g = new C4573b();

            public C4573b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends Pair<WireBirdPart, WireBird>> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC24507p.m32024u();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4571m(List<? extends BirdModel> list, C34039Kj5 c34039Kj5) {
            super(1);
            this.f20132g = list;
            this.f20133h = c34039Kj5;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final InterfaceC24574u invoke$lambda$1(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends Pair<WireBirdPart, WireBird>> invoke(Pair<WireBirdPart, WireBird> pair) {
            AbstractC5751Ny abstractC5751Ny;
            boolean contains;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireBirdPart component1 = pair.component1();
            WireBird component2 = pair.component2();
            List<BirdModel> list = this.f20132g;
            boolean z = false;
            if (list != null) {
                contains = CollectionsKt___CollectionsKt.contains(list, BirdModel.Companion.fromString(component2.getModel()));
                if (!contains) {
                    z = true;
                }
            }
            if (z) {
                List<BirdModel> list2 = this.f20132g;
                BirdModel.Companion companion = BirdModel.Companion;
                if (Intrinsics.areEqual(list2, companion.getBirdZeroList())) {
                    abstractC5751Ny = C42887ij5.f87791d;
                } else if (Intrinsics.areEqual(list2, companion.getV2BrainList())) {
                    abstractC5751Ny = C50614vl5.f114574d;
                } else if (Intrinsics.areEqual(list2, companion.getBirdOnePcmList())) {
                    abstractC5751Ny = C42294hj5.f85801d;
                } else {
                    abstractC5751Ny = C42887ij5.f87791d;
                }
                AbstractC23442F m33142Y = H31.C3014a.dialog$default(this.f20133h.m98411J(), abstractC5751Ny, false, false, 4, null).m33142Y(C23454a.m33087a());
                final C4572a c4572a = new C4572a(this.f20133h);
                AbstractC23442F m33101w = m33142Y.m33101w(new InterfaceC23484g() { // from class: Nj5
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C34039Kj5.C4571m.invoke$lambda$0(Function1.this, obj);
                    }
                });
                final C4573b c4573b = C4573b.f20135g;
                return m33101w.m33163C(new InterfaceC23492o() { // from class: Oj5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u invoke$lambda$1;
                        invoke$lambda$1 = C34039Kj5.C4571m.invoke$lambda$1(Function1.this, obj);
                        return invoke$lambda$1;
                    }
                });
            }
            return AbstractC24507p.m32068G(TuplesKt.m28425to(component1, component2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Kj5$n */
    /* loaded from: classes4.dex */
    public static final class C4574n extends Lambda implements Function1<Throwable, Unit> {
        public C4574n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C34039Kj5.m98401T(C34039Kj5.this, th, null, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBirdPart;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Kj5$o */
    /* loaded from: classes4.dex */
    public static final class C4575o extends Lambda implements Function1<Pair<? extends WireBirdPart, ? extends WireBird>, Unit> {
        public C4575o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireBirdPart, ? extends WireBird> pair) {
            invoke2((Pair<WireBirdPart, WireBird>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireBirdPart, WireBird> pair) {
            C34039Kj5.this.m98411J().vibrate(250L);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBirdPart;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Kj5$p */
    /* loaded from: classes4.dex */
    public static final class C4576p extends Lambda implements Function1<Pair<? extends WireBirdPart, ? extends WireBird>, Unit> {
        public C4576p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireBirdPart, ? extends WireBird> pair) {
            invoke2((Pair<WireBirdPart, WireBird>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireBirdPart, WireBird> pair) {
            Intent intent = new Intent();
            intent.putExtra("bird", pair.component2());
            intent.putExtra("part", pair.component1().toPart());
            C34039Kj5.this.m98420A().mo37190C1(-1, intent);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Ls32;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kj5$q */
    /* loaded from: classes4.dex */
    public static final class C4577q extends Lambda implements Function1<Pair<? extends String, ? extends EnumC48419s32>, InterfaceC23447K<? extends WirePart>> {

        /* renamed from: h */
        public final /* synthetic */ PartKind f20140h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4577q(PartKind partKind) {
            super(1);
            this.f20140h = partKind;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends WirePart> invoke(Pair<String, ? extends EnumC48419s32> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return C34039Kj5.this.m98418C(this.f20140h, pair.component1());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Kj5$r */
    /* loaded from: classes4.dex */
    public static final class C4578r extends Lambda implements Function1<Throwable, Unit> {
        public C4578r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C34039Kj5.m98401T(C34039Kj5.this, th, null, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WirePart;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kj5$s */
    /* loaded from: classes4.dex */
    public static final class C4579s extends Lambda implements Function1<WirePart, Unit> {
        public C4579s() {
            super(1);
        }

        /* renamed from: a */
        public final void m98344a(WirePart wirePart) {
            C34039Kj5.this.m98411J().vibrate(250L);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WirePart wirePart) {
            m98344a(wirePart);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", "part", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WirePart;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kj5$t */
    /* loaded from: classes4.dex */
    public static final class C4580t extends Lambda implements Function1<WirePart, Unit> {
        public C4580t() {
            super(1);
        }

        /* renamed from: a */
        public final void m98343a(WirePart wirePart) {
            Intent intent = new Intent();
            intent.putExtra("repair_types", C34039Kj5.this.f20113h);
            intent.putExtra("part", wirePart);
            C34039Kj5.this.m98420A().mo37190C1(-1, intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WirePart wirePart) {
            m98343a(wirePart);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "Ls32;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kj5$u */
    /* loaded from: classes4.dex */
    public static final class C4581u extends Lambda implements Function1<Pair<? extends String, ? extends EnumC48419s32>, Unit> {
        public C4581u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends EnumC48419s32> pair) {
            invoke2((Pair<String, ? extends EnumC48419s32>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<String, ? extends EnumC48419s32> pair) {
            C34039Kj5.this.m98411J().vibrate(250L);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "Ls32;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kj5$v */
    /* loaded from: classes4.dex */
    public static final class C4582v extends Lambda implements Function1<Pair<? extends String, ? extends EnumC48419s32>, Unit> {
        public C4582v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends EnumC48419s32> pair) {
            invoke2((Pair<String, ? extends EnumC48419s32>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<String, ? extends EnumC48419s32> pair) {
            Intent intent = new Intent();
            intent.putExtra("raw_scan_result", pair.component1());
            C34039Kj5.this.m98420A().mo37190C1(-1, intent);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "Ls32;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kj5$w */
    /* loaded from: classes4.dex */
    public static final class C4583w extends Lambda implements Function1<Pair<? extends String, ? extends EnumC48419s32>, Unit> {
        public C4583w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends EnumC48419s32> pair) {
            invoke2((Pair<String, ? extends EnumC48419s32>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<String, ? extends EnumC48419s32> pair) {
            C34039Kj5.this.m98411J().mo84835p3();
            C34039Kj5.this.m98411J().mo84842O3(false);
        }
    }

    public C34039Kj5(InterfaceC46473om3 operatorManager, InterfaceC7381SM birdPartManager, NQ5 stickerManager, C36207Tq4 reactiveConfig, ScopeProvider scopeProvider, InterfaceC35443Qj5 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(birdPartManager, "birdPartManager");
        Intrinsics.checkNotNullParameter(stickerManager, "stickerManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f20106a = operatorManager;
        this.f20107b = birdPartManager;
        this.f20108c = stickerManager;
        this.f20109d = reactiveConfig;
        this.f20110e = scopeProvider;
        this.f20111f = ui;
        this.f20112g = navigator;
        Observable<Pair<String, EnumC48419s32>> throttleFirst = ui.mo84837T().throttleFirst(500L, TimeUnit.MILLISECONDS);
        final C4583w c4583w = new C4583w();
        this.f20114i = throttleFirst.doOnNext(new InterfaceC23484g() { // from class: oj5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34039Kj5.m98378j0(Function1.this, obj);
            }
        });
    }

    /* renamed from: D */
    public static final Sticker m98417D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Sticker) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final WirePart m98416E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WirePart) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final InterfaceC23447K m98415F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final WireBirdPart m98409L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireBirdPart) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final InterfaceC23447K m98408M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m98407N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final InterfaceC24574u m98406O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m98405P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m98404Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: T */
    public static /* synthetic */ void m98401T(C34039Kj5 c34039Kj5, Throwable th, HM4 hm4, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onError");
        }
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            hm4 = null;
        }
        c34039Kj5.m98402S(th, hm4);
    }

    /* renamed from: V */
    public static final InterfaceC24574u m98399V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final InterfaceC23447K m98398W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final InterfaceC24574u m98397X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m98396Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m98395Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m98394a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m98392c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m98390d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m98388e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final InterfaceC23447K m98386f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m98382h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m98380i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final void m98378j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final InterfaceC40099e13 m98420A() {
        return this.f20112g;
    }

    /* renamed from: B */
    public final InterfaceC46473om3 m98419B() {
        return this.f20106a;
    }

    /* renamed from: C */
    public final AbstractC23442F<WirePart> m98418C(PartKind partKind, String str) {
        String m99597e;
        AbstractC23442F<HM4<Sticker>> mo92318a;
        C47377qI3.C27566a c27566a = C47377qI3.f105039h;
        if (c27566a.m17661a().contains(partKind)) {
            m99597e = C33894Jt4.f18402a.m99599c(str);
        } else {
            m99597e = C33894Jt4.f18402a.m99597e(str);
        }
        if (c27566a.m17660b().contains(partKind)) {
            if (m99597e != null) {
                mo92318a = this.f20108c.mo92317b(m99597e);
            } else {
                mo92318a = this.f20108c.mo92318a(str);
            }
            final C4558b c4558b = C4558b.f20115g;
            AbstractC23442F<R> m33157I = mo92318a.m33157I(new InterfaceC23492o() { // from class: yj5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Sticker m98417D;
                    m98417D = C34039Kj5.m98417D(Function1.this, obj);
                    return m98417D;
                }
            });
            final C4559c c4559c = new C4559c(partKind);
            AbstractC23442F m33157I2 = m33157I.m33157I(new InterfaceC23492o() { // from class: Aj5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    WirePart m98416E;
                    m98416E = C34039Kj5.m98416E(Function1.this, obj);
                    return m98416E;
                }
            });
            final C4560d c4560d = new C4560d(partKind, m99597e, this, str);
            AbstractC23442F<WirePart> m33150P = m33157I2.m33150P(new InterfaceC23492o() { // from class: Bj5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m98415F;
                    m98415F = C34039Kj5.m98415F(Function1.this, obj);
                    return m98415F;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33150P, "private fun getPart(kind…nd, key = raw))\n    }\n  }");
            return m33150P;
        } else if (c27566a.m17661a().contains(partKind)) {
            String uuid = UUID.randomUUID().toString();
            if (m99597e != null) {
                str = m99597e;
            }
            AbstractC23442F<WirePart> m33158H = AbstractC23442F.m33158H(new WirePart(uuid, partKind, str));
            Intrinsics.checkNotNullExpressionValue(m33158H, "{\n      Single.just(Wire…, key = id ?: raw))\n    }");
            return m33158H;
        } else {
            AbstractC23442F<WirePart> m33158H2 = AbstractC23442F.m33158H(new WirePart(null, partKind, str, 1, null));
            Intrinsics.checkNotNullExpressionValue(m33158H2, "{\n      Single.just(Wire…= kind, key = raw))\n    }");
            return m33158H2;
        }
    }

    /* renamed from: G */
    public final C36207Tq4 m98414G() {
        return this.f20109d;
    }

    /* renamed from: H */
    public final Observable<Pair<String, EnumC48419s32>> m98413H() {
        return this.f20114i;
    }

    /* renamed from: I */
    public final ScopeProvider m98412I() {
        return this.f20110e;
    }

    /* renamed from: J */
    public final InterfaceC35443Qj5 m98411J() {
        return this.f20111f;
    }

    /* renamed from: K */
    public final AbstractC24507p<Pair<WireBirdPart, WireBird>> m98410K(String str, EnumC48419s32 enumC48419s32) {
        PartKind partKind;
        Integer num;
        boolean z;
        String m99597e = C33894Jt4.f18402a.m99597e(str);
        if (m99597e != null) {
            str = null;
        } else {
            m99597e = null;
        }
        EnumC48419s32 enumC48419s322 = EnumC48419s32.MANUAL;
        if (enumC48419s32 == enumC48419s322) {
            IntRange intRange = new IntRange(4, 6);
            if (str != null) {
                num = Integer.valueOf(str.length());
            } else {
                num = null;
            }
            if (num != null && intRange.contains(num.intValue())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                partKind = PartKind.STICKER;
                AbstractC23442F progress$default = C28237sD.progress$default(this.f20107b.mo78565a(m99597e, str, partKind), this.f20111f, 0, 2, (Object) null);
                final C4561e c4561e = C4561e.f20121g;
                AbstractC23442F m33157I = progress$default.m33157I(new InterfaceC23492o() { // from class: zj5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        WireBirdPart m98409L;
                        m98409L = C34039Kj5.m98409L(Function1.this, obj);
                        return m98409L;
                    }
                });
                final C4562f c4562f = new C4562f();
                AbstractC23442F m33165A = m33157I.m33165A(new InterfaceC23492o() { // from class: Cj5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23447K m98408M;
                        m98408M = C34039Kj5.m98408M(Function1.this, obj);
                        return m98408M;
                    }
                });
                final C4564g c4564g = new C4564g();
                AbstractC23442F m33101w = m33165A.m33101w(new InterfaceC23484g() { // from class: Dj5
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C34039Kj5.m98407N(Function1.this, obj);
                    }
                });
                final C4565h c4565h = new C4565h();
                AbstractC24507p<Pair<WireBirdPart, WireBird>> m33163C = m33101w.m33163C(new InterfaceC23492o() { // from class: Ej5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m98406O;
                        m98406O = C34039Kj5.m98406O(Function1.this, obj);
                        return m98406O;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33163C, "private fun identifyBird…y()\n        }\n      }\n  }");
                return m33163C;
            }
        }
        if (enumC48419s32 == enumC48419s322) {
            partKind = PartKind.CHASSIS;
        } else if (m99597e != null) {
            partKind = PartKind.STICKER;
        } else {
            partKind = PartKind.CHASSIS;
        }
        AbstractC23442F progress$default2 = C28237sD.progress$default(this.f20107b.mo78565a(m99597e, str, partKind), this.f20111f, 0, 2, (Object) null);
        final Function1 c4561e2 = C4561e.f20121g;
        AbstractC23442F m33157I2 = progress$default2.m33157I(new InterfaceC23492o() { // from class: zj5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireBirdPart m98409L;
                m98409L = C34039Kj5.m98409L(Function1.this, obj);
                return m98409L;
            }
        });
        final Function1 c4562f2 = new C4562f();
        AbstractC23442F m33165A2 = m33157I2.m33165A(new InterfaceC23492o() { // from class: Cj5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m98408M;
                m98408M = C34039Kj5.m98408M(Function1.this, obj);
                return m98408M;
            }
        });
        final Function1 c4564g2 = new C4564g();
        AbstractC23442F m33101w2 = m33165A2.m33101w(new InterfaceC23484g() { // from class: Dj5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34039Kj5.m98407N(Function1.this, obj);
            }
        });
        final Function1 c4565h2 = new C4565h();
        AbstractC24507p<Pair<WireBirdPart, WireBird>> m33163C2 = m33101w2.m33163C(new InterfaceC23492o() { // from class: Ej5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m98406O;
                m98406O = C34039Kj5.m98406O(Function1.this, obj);
                return m98406O;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33163C2, "private fun identifyBird…y()\n        }\n      }\n  }");
        return m33163C2;
    }

    /* renamed from: R */
    public final void m98403R() {
        this.f20111f.init();
        Observable<Unit> observeOn = this.f20111f.mo84843M9().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.flashlightClicks()\n  …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f20110e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4566i c4566i = new C4566i();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: qj5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34039Kj5.m98405P(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn2 = this.f20111f.mo84832v0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.codeClicks()\n      .o…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f20110e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4567j c4567j = new C4567j();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: rj5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34039Kj5.m98404Q(Function1.this, obj);
            }
        });
        this.f20111f.mo84834tf(this.f20109d.m82623f8().getValue().getOperatorConfig().getEnablePeripheralKeyboardSupport());
    }

    /* renamed from: S */
    public final void m98402S(Throwable th, HM4<?> hm4) {
        if (th != null) {
            C41318g46.m40159e(th);
        }
        Unit unit = null;
        String str = null;
        if (hm4 != null) {
            InterfaceC35443Qj5 interfaceC35443Qj5 = this.f20111f;
            C49375tg1 m94017d = NM4.m94017d(hm4);
            if (m94017d != null) {
                str = m94017d.m11932c();
            }
            interfaceC35443Qj5.error(str);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f20111f.error(C45871nl4.error_generic_body);
        }
        this.f20111f.vibrate(1000L);
        this.f20111f.mo84842O3(true);
    }

    /* renamed from: U */
    public final void m98400U(Observable<Pair<String, EnumC48419s32>> observable, List<? extends BirdModel> list) {
        AbstractC24490k<Pair<String, EnumC48419s32>> flowable = observable.toFlowable(EnumC23460b.DROP);
        final C4568k c4568k = new C4568k();
        AbstractC24490k<R> m32154d0 = flowable.m32154d0(new InterfaceC23492o() { // from class: Fj5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m98399V;
                m98399V = C34039Kj5.m98399V(Function1.this, obj);
                return m98399V;
            }
        });
        final C4569l c4569l = new C4569l();
        AbstractC24490k m32149f0 = m32154d0.m32149f0(new InterfaceC23492o() { // from class: Gj5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m98398W;
                m98398W = C34039Kj5.m98398W(Function1.this, obj);
                return m98398W;
            }
        });
        final C4571m c4571m = new C4571m(list, this);
        AbstractC24490k m32154d02 = m32149f0.m32154d0(new InterfaceC23492o() { // from class: Hj5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m98397X;
                m98397X = C34039Kj5.m98397X(Function1.this, obj);
                return m98397X;
            }
        });
        final C4574n c4574n = new C4574n();
        AbstractC24490k m32192J0 = m32154d02.m32195I(new InterfaceC23484g() { // from class: Ij5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34039Kj5.m98396Y(Function1.this, obj);
            }
        }).m32192J0();
        final C4575o c4575o = new C4575o();
        AbstractC24490k m32108t0 = m32192J0.m32191K(new InterfaceC23484g() { // from class: Jj5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34039Kj5.m98395Z(Function1.this, obj);
            }
        }).m32108t0(C23454a.m33087a(), false, 1);
        Intrinsics.checkNotNullExpressionValue(m32108t0, "private fun scanForBird(…ULT_OK, data)\n      }\n  }");
        Object m32150f = m32108t0.m32150f(AutoDispose.m45239a(this.f20110e));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4576p c4576p = new C4576p();
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: pj5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34039Kj5.m98394a0(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC45852nj5
    /* renamed from: a */
    public void mo23254a(PartKind kind, RepairType repairType) {
        boolean z;
        Intrinsics.checkNotNullParameter(kind, "kind");
        m98403R();
        this.f20113h = repairType;
        InterfaceC35443Qj5 interfaceC35443Qj5 = this.f20111f;
        if (repairType != null) {
            z = true;
        } else {
            z = false;
        }
        interfaceC35443Qj5.mo84839R3(z);
        this.f20111f.mo84836d1(kind);
        Observable<Pair<String, EnumC48419s32>> scanObservable = this.f20114i;
        Intrinsics.checkNotNullExpressionValue(scanObservable, "scanObservable");
        m98393b0(scanObservable, kind);
    }

    @Override // p000.InterfaceC45852nj5
    /* renamed from: b */
    public void mo23253b(List<? extends BirdModel> list) {
        m98403R();
        this.f20111f.mo84836d1(null);
        this.f20111f.mo84839R3(true);
        Observable<Pair<String, EnumC48419s32>> scanObservable = this.f20114i;
        Intrinsics.checkNotNullExpressionValue(scanObservable, "scanObservable");
        m98400U(scanObservable, list);
    }

    /* renamed from: b0 */
    public final void m98393b0(Observable<Pair<String, EnumC48419s32>> observable, PartKind partKind) {
        AbstractC24490k<Pair<String, EnumC48419s32>> flowable = observable.toFlowable(EnumC23460b.DROP);
        final C4577q c4577q = new C4577q(partKind);
        AbstractC24490k m32108t0 = flowable.m32149f0(new InterfaceC23492o() { // from class: uj5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m98386f0;
                m98386f0 = C34039Kj5.m98386f0(Function1.this, obj);
                return m98386f0;
            }
        }).m32108t0(C23454a.m33087a(), false, 1);
        final C4578r c4578r = new C4578r();
        AbstractC24490k m32192J0 = m32108t0.m32195I(new InterfaceC23484g() { // from class: vj5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34039Kj5.m98392c0(Function1.this, obj);
            }
        }).m32192J0();
        final C4579s c4579s = new C4579s();
        AbstractC24490k m32191K = m32192J0.m32191K(new InterfaceC23484g() { // from class: wj5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34039Kj5.m98390d0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32191K, "private fun scanForKey(s…ULT_OK, data)\n      }\n  }");
        Object m32150f = m32191K.m32150f(AutoDispose.m45239a(this.f20110e));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4580t c4580t = new C4580t();
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: xj5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34039Kj5.m98388e0(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC45852nj5
    /* renamed from: c */
    public void mo23252c(boolean z, boolean z2, String str) {
        boolean z3;
        m98403R();
        this.f20111f.mo84836d1(null);
        if (z2) {
            this.f20111f.mo84833ud();
        }
        InterfaceC35443Qj5 interfaceC35443Qj5 = this.f20111f;
        if (z && this.f20109d.m82623f8().getValue().getOperatorConfig().getEnablePeripheralKeyboardSupport()) {
            z3 = true;
        } else {
            z3 = false;
        }
        interfaceC35443Qj5.mo84834tf(z3);
        this.f20111f.mo84839R3(true);
        Observable<Pair<String, EnumC48419s32>> scanObservable = this.f20114i;
        Intrinsics.checkNotNullExpressionValue(scanObservable, "scanObservable");
        m98384g0(scanObservable);
    }

    /* renamed from: g0 */
    public final void m98384g0(Observable<Pair<String, EnumC48419s32>> observable) {
        final C4581u c4581u = new C4581u();
        Observable<Pair<String, EnumC48419s32>> doOnNext = observable.doOnNext(new InterfaceC23484g() { // from class: sj5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34039Kj5.m98382h0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "private fun scanForRawSc…ULT_OK, data)\n      }\n  }");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(this.f20110e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4582v c4582v = new C4582v();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: tj5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34039Kj5.m98380i0(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC45852nj5
    public void onPause() {
        this.f20111f.onPause();
    }

    @Override // p000.InterfaceC45852nj5
    public void onResume() {
        this.f20111f.onResume();
    }

    /* renamed from: z */
    public final int m98362z(Throwable th) {
        if (th instanceof HttpException) {
            return ((HttpException) th).m53921a();
        }
        if (th instanceof retrofit2.HttpException) {
            return ((retrofit2.HttpException) th).m15616a();
        }
        if (th instanceof RetrofitException) {
            return ((RetrofitException) th).m53927c().m103943b();
        }
        return -1;
    }
}
