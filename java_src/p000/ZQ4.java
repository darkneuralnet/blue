package p000;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.main.MainActivity;
import co.bird.android.imageupload.worker.UpdateRidePhotoWorker;
import co.bird.android.model.Folder;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.NonComplianceWarning;
import co.bird.android.model.NonComplianceWarningKind;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.ParkingNestData;
import co.bird.android.model.ParkingPhotoType;
import co.bird.android.model.RideState;
import co.bird.android.model.constant.PhysicalLockPurpose;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRideDetail;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import java.io.File;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
import p000.VR4;
import p000.ZQ4;
@Metadata(m28433d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001 B\u0085\u0001\b\u0007\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010F\u001a\u00020C\u0012\u0006\u0010J\u001a\u00020G\u0012\u000e\b\u0001\u0010O\u001a\b\u0012\u0004\u0012\u00020L0K\u0012\b\b\u0001\u0010S\u001a\u00020P\u0012\b\b\u0001\u0010W\u001a\u00020T¢\u0006\u0004\bv\u0010wJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\f\u0010\u0015\u001a\u00020\u0002*\u00020\u0014H\u0002J\f\u0010\u0017\u001a\u00020\u0011*\u00020\u0016H\u0002J\f\u0010\u0018\u001a\u00020\u0011*\u00020\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020L0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Z\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010^\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010b\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010aR\u0016\u0010f\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010aR\u0016\u0010i\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010j\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010aR\u0016\u0010k\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010aR\u0016\u0010l\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010aR\u0014\u0010o\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\"\u0010s\u001a\u0010\u0012\f\u0012\n q*\u0004\u0018\u00010\n0\n0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010rR\u0014\u0010u\u001a\u00020_8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010t¨\u0006x"}, m28432d2 = {"LZQ4;", "LEQ4;", "", "R", "Landroid/graphics/Bitmap;", "bitmap", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireRide;", "b0", "T", "LZQ4$a;", "X", "", "photoUri", "Q", "v", "u", "", "w", "U", "Ljava/net/URI;", "a0", "Lco/bird/android/model/wire/WireBird;", "y", "z", "Landroid/content/Intent;", "intent", "A", "onResume", "onPause", "onBackPressed", "Ldd3;", C17296a.f69688o, "Ldd3;", "notificationSender", "Lgl;", "b", "Lgl;", "preference", "LTq4;", "c", "LTq4;", "reactiveConfig", "LYR4;", DateTokenConverter.CONVERTER_KEY, "LYR4;", "rideManager", "Lys0;", "e", "Lys0;", "complianceManager", "Landroid/content/Context;", "f", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LEa;", "g", "LEa;", "analyticsManager", "Lbn;", "h", "Lbn;", "areaManager", "LoI5;", "i", "LoI5;", "smartlockManager", "LZC6;", "j", "LZC6;", "workManager", "LXc1;", "k", "LXc1;", "endRideManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "l", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "Le13;", "m", "Le13;", "navigator", "LWR4;", "n", "LWR4;", "ui", "o", "Lco/bird/android/model/wire/WireRide;", "ride", "Lco/bird/android/model/wire/WireRideDetail;", "p", "Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", "", "q", "Z", "physicalLockPresent", "r", "photoRequired", "s", "flashOnBeforePhotoTaken", "t", "I", "fineAmount", "photoUploaded", "showParkingWarning", "hasUnlockedHelmet", "x", "Ljava/lang/String;", "imageSavePath", "LAG;", "kotlin.jvm.PlatformType", "LAG;", "photoSaveResultRelay", "()Z", "smartLockV2Enabled", "<init>", "(Ldd3;Lgl;LTq4;LYR4;Lys0;Landroid/content/Context;LEa;Lbn;LoI5;LZC6;LXc1;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;LWR4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideEndPhotoPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideEndPhotoPresenter.kt\nco/bird/android/app/feature/ride/presenter/RideEndPhotoPresenterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,469:1\n288#2,2:470\n237#3:472\n180#3:473\n180#3:474\n161#3:475\n180#3:476\n199#3:477\n*S KotlinDebug\n*F\n+ 1 RideEndPhotoPresenter.kt\nco/bird/android/app/feature/ride/presenter/RideEndPhotoPresenterImpl\n*L\n117#1:470,2\n217#1:472\n221#1:473\n227#1:474\n255#1:475\n271#1:476\n332#1:477\n*E\n"})
/* renamed from: ZQ4 */
/* loaded from: classes2.dex */
public final class ZQ4 implements EQ4 {

    /* renamed from: a */
    public InterfaceC39861dd3 f48521a;

    /* renamed from: b */
    public final C22454gl f48522b;

    /* renamed from: c */
    public final C36207Tq4 f48523c;

    /* renamed from: d */
    public final YR4 f48524d;

    /* renamed from: e */
    public final InterfaceC52458ys0 f48525e;

    /* renamed from: f */
    public final Context f48526f;

    /* renamed from: g */
    public final InterfaceC1880Ea f48527g;

    /* renamed from: h */
    public final InterfaceC12495bn f48528h;

    /* renamed from: i */
    public final InterfaceC46193oI5 f48529i;

    /* renamed from: j */
    public final ZC6 f48530j;

    /* renamed from: k */
    public final InterfaceC37014Xc1 f48531k;

    /* renamed from: l */
    public final LifecycleScopeProvider<EnumC7097RE> f48532l;

    /* renamed from: m */
    public final InterfaceC40099e13 f48533m;

    /* renamed from: n */
    public final WR4 f48534n;

    /* renamed from: o */
    public WireRide f48535o;

    /* renamed from: p */
    public WireRideDetail f48536p;

    /* renamed from: q */
    public boolean f48537q;

    /* renamed from: r */
    public boolean f48538r;

    /* renamed from: s */
    public boolean f48539s;

    /* renamed from: t */
    public int f48540t;

    /* renamed from: u */
    public boolean f48541u;

    /* renamed from: v */
    public boolean f48542v;

    /* renamed from: w */
    public boolean f48543w;

    /* renamed from: x */
    public final String f48544x;

    /* renamed from: y */
    public final C0058AG<C10250a> f48545y;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LZQ4$a;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/graphics/Bitmap;", C17296a.f69688o, "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "bitmap", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "photoUri", "<init>", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ZQ4$a */
    /* loaded from: classes2.dex */
    public static final class C10250a {

        /* renamed from: a */
        public final Bitmap f48546a;

        /* renamed from: b */
        public final String f48547b;

        public C10250a(Bitmap bitmap, String photoUri) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Intrinsics.checkNotNullParameter(photoUri, "photoUri");
            this.f48546a = bitmap;
            this.f48547b = photoUri;
        }

        /* renamed from: a */
        public final Bitmap m73142a() {
            return this.f48546a;
        }

        /* renamed from: b */
        public final String m73141b() {
            return this.f48547b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C10250a) {
                C10250a c10250a = (C10250a) obj;
                return Intrinsics.areEqual(this.f48546a, c10250a.f48546a) && Intrinsics.areEqual(this.f48547b, c10250a.f48547b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f48546a.hashCode() * 31) + this.f48547b.hashCode();
        }

        public String toString() {
            Bitmap bitmap = this.f48546a;
            String str = this.f48547b;
            return "PhotoSaveResult(bitmap=" + bitmap + ", photoUri=" + str + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZQ4$a;", "kotlin.jvm.PlatformType", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "(LZQ4$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZQ4$b */
    /* loaded from: classes2.dex */
    public static final class C10251b extends Lambda implements Function1<C10250a, Unit> {
        public C10251b() {
            super(1);
        }

        /* renamed from: a */
        public final void m73140a(C10250a c10250a) {
            ZQ4.this.m73180Q(c10250a.m73141b());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C10250a c10250a) {
            m73140a(c10250a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", C17296a.f69688o, "(Ljava/lang/Integer;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZQ4$c */
    /* loaded from: classes2.dex */
    public static final class C10252c extends Lambda implements Function1<Integer, Boolean> {
        public C10252c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Integer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!ZQ4.this.f48542v);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "fee", "Lio/reactivex/B;", "LHM4;", "Lco/bird/android/model/NonComplianceWarning;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZQ4$d */
    /* loaded from: classes2.dex */
    public static final class C10253d extends Lambda implements Function1<Integer, InterfaceC23434B<? extends HM4<NonComplianceWarning>>> {
        public C10253d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends HM4<NonComplianceWarning>> invoke(Integer fee) {
            Intrinsics.checkNotNullParameter(fee, "fee");
            InterfaceC52458ys0 interfaceC52458ys0 = ZQ4.this.f48525e;
            NonComplianceWarningKind nonComplianceWarningKind = NonComplianceWarningKind.BIRD_NOT_PHYSICALLY_LOCKED;
            WireRide wireRide = ZQ4.this.f48535o;
            if (wireRide == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ride");
                wireRide = null;
            }
            return interfaceC52458ys0.mo211c(nonComplianceWarningKind, wireRide.getId(), ZQ4.this.f48523c.m82623f8().getValue().getRideConfig().getCurrency(), fee).m33123k0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "fee", "LHM4;", "Lco/bird/android/model/NonComplianceWarning;", "<anonymous parameter 1>", C17296a.f69688o, "(Ljava/lang/Integer;LHM4;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZQ4$e */
    /* loaded from: classes2.dex */
    public static final class C10254e extends Lambda implements Function2<Integer, HM4<NonComplianceWarning>, Integer> {

        /* renamed from: g */
        public static final C10254e f48551g = new C10254e();

        public C10254e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Integer invoke(Integer fee, HM4<NonComplianceWarning> hm4) {
            Intrinsics.checkNotNullParameter(fee, "fee");
            Intrinsics.checkNotNullParameter(hm4, "<anonymous parameter 1>");
            return fee;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "fee", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZQ4$f */
    /* loaded from: classes2.dex */
    public static final class C10255f extends Lambda implements Function1<Integer, Unit> {
        public C10255f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer fee) {
            ZQ4 zq4 = ZQ4.this;
            Intrinsics.checkNotNullExpressionValue(fee, "fee");
            zq4.f48540t = fee.intValue();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZQ4$g */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C10256g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C10256g f48553b = new C10256g();

        public C10256g() {
            super(1, C41318g46.class, "w", "w(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40150n(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LZQ4$a;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZQ4$h */
    /* loaded from: classes2.dex */
    public static final class C10257h extends Lambda implements Function1<Unit, InterfaceC23447K<? extends C10250a>> {
        public C10257h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends C10250a> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.m40163a("takePhotoButtonClicks pressed", new Object[0]);
            return C28237sD.progress$default(ZQ4.this.m73173X(), ZQ4.this.f48534n, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZQ4$a;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LZQ4$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZQ4$i */
    /* loaded from: classes2.dex */
    public static final class C10258i extends Lambda implements Function1<C10250a, Unit> {
        public C10258i() {
            super(1);
        }

        /* renamed from: a */
        public final void m73136a(C10250a c10250a) {
            ParkingPhotoType parkingPhotoType;
            String str;
            WirePhysicalLock physicalLock;
            PhysicalLockPurpose purpose;
            ParkingNest parkingNest;
            if (ZQ4.this.f48537q) {
                parkingPhotoType = ParkingPhotoType.LOCK;
            } else {
                parkingPhotoType = ParkingPhotoType.REVIEWED;
            }
            InterfaceC1880Ea interfaceC1880Ea = ZQ4.this.f48527g;
            WireRide wireRide = ZQ4.this.f48535o;
            String str2 = null;
            if (wireRide == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ride");
                wireRide = null;
            }
            WireBird bird = wireRide.getBird();
            String str3 = (bird == null || (r3 = bird.getId()) == null) ? "" : "";
            WireRide wireRide2 = ZQ4.this.f48535o;
            if (wireRide2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ride");
                wireRide2 = null;
            }
            String id = wireRide2.getId();
            String parkingPhotoType2 = parkingPhotoType.toString();
            ParkingNestData m59035e = ZQ4.this.f48528h.mo64003c0().getValue().m59035e();
            if (m59035e != null && (parkingNest = m59035e.getParkingNest()) != null) {
                str = parkingNest.getId();
            } else {
                str = null;
            }
            WireRide wireRide3 = ZQ4.this.f48535o;
            if (wireRide3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ride");
                wireRide3 = null;
            }
            WireBird bird2 = wireRide3.getBird();
            if (bird2 != null && (physicalLock = bird2.getPhysicalLock()) != null && (purpose = physicalLock.getPurpose()) != null) {
                str2 = purpose.toString();
            }
            interfaceC1880Ea.mo55905y(new FG3(null, null, null, str3, id, str, parkingPhotoType2, str2, ZQ4.this.f48531k.mo55540n(), 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C10250a c10250a) {
            m73136a(c10250a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZQ4$a;", "kotlin.jvm.PlatformType", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "(LZQ4$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZQ4$j */
    /* loaded from: classes2.dex */
    public static final class C10259j extends Lambda implements Function1<C10250a, Unit> {
        public C10259j() {
            super(1);
        }

        /* renamed from: a */
        public final void m73135a(C10250a c10250a) {
            String string;
            String string2;
            int i;
            ZQ4.this.f48545y.accept(c10250a);
            if (ZQ4.this.f48537q) {
                if (ZQ4.this.f48543w) {
                    string = ZQ4.this.f48534n.getString(C45871nl4.ride_lock_photo_info_post_helmet_photo_capture_body, new Object[0]);
                } else if (ZQ4.this.f48540t > 0) {
                    string = ZQ4.this.f48526f.getString(C45871nl4.lock_to_take_photo_confirmation_fine_body, C51916xx1.f118396a.m4408d(ZQ4.this.f48540t, C45097mS5.m25591o(ZQ4.this.f48523c.m82623f8().getValue().getRideConfig().getCurrency()), EnumC36501Ux1.SHOW_IF_NON_ZERO));
                    Intrinsics.checkNotNullExpressionValue(string, "{\n            val fineSt…, fineString)\n          }");
                } else {
                    string = ZQ4.this.f48526f.getString(C45871nl4.lock_to_take_photo_confirmation_body);
                    Intrinsics.checkNotNullExpressionValue(string, "{\n            context.ge…rmation_body)\n          }");
                }
                String str = string;
                if (ZQ4.this.f48540t > 0) {
                    string2 = ZQ4.this.f48526f.getString(C45871nl4.lock_to_take_photo_confirmation_fine_title);
                } else {
                    string2 = ZQ4.this.f48526f.getString(C45871nl4.lock_to_take_photo_confirmation_title);
                }
                String str2 = string2;
                Intrinsics.checkNotNullExpressionValue(str2, "if (fineAmount > 0) {\n  …mation_title)\n          }");
                if (ZQ4.this.f48540t > 0) {
                    i = C52342yg4.ic_lock_black;
                } else {
                    i = C48193rg4.ic_lock_esb_circle_bg;
                }
                ZQ4.this.f48534n.m78453Rl(str2, str, c10250a.m73142a(), ZQ4.this.f48540t, C45097mS5.m25591o(ZQ4.this.f48523c.m82623f8().getValue().getRideConfig().getCurrency()), ZQ4.this.f48542v, i);
            }
            if (ZQ4.this.f48539s) {
                ZQ4.this.f48534n.m78448i();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C10250a c10250a) {
            m73135a(c10250a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZQ4$a;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(LZQ4$a;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZQ4$k */
    /* loaded from: classes2.dex */
    public static final class C10260k extends Lambda implements Function1<C10250a, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRide;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ZQ4$k$a */
        /* loaded from: classes2.dex */
        public static final class C10261a extends Lambda implements Function1<WireRide, Unit> {

            /* renamed from: g */
            public final /* synthetic */ ZQ4 f48558g;

            /* renamed from: h */
            public final /* synthetic */ C10250a f48559h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10261a(ZQ4 zq4, C10250a c10250a) {
                super(1);
                this.f48558g = zq4;
                this.f48559h = c10250a;
            }

            /* renamed from: a */
            public final void m73132a(WireRide wireRide) {
                this.f48558g.m73180Q(this.f48559h.m73141b());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WireRide wireRide) {
                m73132a(wireRide);
                return Unit.INSTANCE;
            }
        }

        public C10260k() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(C10250a result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (!ZQ4.this.f48537q) {
                if (!ZQ4.this.f48523c.m82623f8().m73665a().getParkingConfig().getEnableAndroidBackgroundRidePhotoUpload()) {
                    AbstractC23442F progress$default = C28237sD.progress$default(ZQ4.this.m73167b0(result.m73142a()), ZQ4.this.f48534n, 0, 2, (Object) null);
                    final C10261a c10261a = new C10261a(ZQ4.this, result);
                    return progress$default.m33101w(new InterfaceC23484g() { // from class: aR4
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            ZQ4.C10260k.invoke$lambda$0(Function1.this, obj);
                        }
                    }).m33159G();
                }
                ZQ4.this.m73169a0(new URI(result.m73141b()));
                ZQ4.this.m73180Q(result.m73141b());
                return AbstractC23461c.m33039p();
            }
            return AbstractC23461c.m33039p();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZQ4$l */
    /* loaded from: classes2.dex */
    public static final class C10262l extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C10262l f48560g = new C10262l();

        public C10262l() {
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

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZQ4$m */
    /* loaded from: classes2.dex */
    public static final class C10263m extends Lambda implements Function1<Unit, Unit> {
        public C10263m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C41318g46.m40163a("flash button pressed", new Object[0]);
            ZQ4.this.f48534n.m78448i();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZQ4$n */
    /* loaded from: classes2.dex */
    public static final class C10264n extends Lambda implements Function1<Unit, Unit> {
        public C10264n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C41318g46.m40163a("no button pressed", new Object[0]);
            ZQ4.this.m73177T();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "LZQ4$a;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZQ4$o */
    /* loaded from: classes2.dex */
    public static final class C10265o extends Lambda implements Function1<Pair<? extends Unit, ? extends C10250a>, InterfaceC23447K<? extends C10250a>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRide;", "it", "LZQ4$a;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRide;)LZQ4$a;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ZQ4$o$a */
        /* loaded from: classes2.dex */
        public static final class C10266a extends Lambda implements Function1<WireRide, C10250a> {

            /* renamed from: g */
            public final /* synthetic */ C10250a f48564g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10266a(C10250a c10250a) {
                super(1);
                this.f48564g = c10250a;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C10250a invoke(WireRide it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f48564g;
            }
        }

        public C10265o() {
            super(1);
        }

        /* renamed from: c */
        public static final C10250a m73129c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (C10250a) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends C10250a> invoke(Pair<Unit, C10250a> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            C10250a component2 = pair.component2();
            C41318g46.m40163a("yes button pressed", new Object[0]);
            if (ZQ4.this.f48523c.m82623f8().m73665a().getParkingConfig().getEnableAndroidBackgroundRidePhotoUpload()) {
                ZQ4.this.m73169a0(new URI(component2.m73141b()));
                AbstractC23442F m33158H = AbstractC23442F.m33158H(component2);
                Intrinsics.checkNotNullExpressionValue(m33158H, "{\n          URI(result.p…le.just(result)\n        }");
                return m33158H;
            }
            AbstractC23442F m73167b0 = ZQ4.this.m73167b0(component2.m73142a());
            final C10266a c10266a = new C10266a(component2);
            AbstractC23442F m33157I = m73167b0.m33157I(new InterfaceC23492o() { // from class: bR4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    ZQ4.C10250a m73129c;
                    m73129c = ZQ4.C10265o.m73129c(Function1.this, obj);
                    return m73129c;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33157I, "result) ->\n        Timbe…     result\n            }");
            return C28237sD.progress$default(m33157I, ZQ4.this.f48534n, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZQ4$p */
    /* loaded from: classes2.dex */
    public static final class C10267p extends Lambda implements Function1<Throwable, Unit> {
        public C10267p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            ZQ4.this.f48534n.error(th.getMessage());
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "LDG3;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZQ4$q */
    /* loaded from: classes2.dex */
    public static final class C10268q extends Lambda implements Function1<HM4<DG3>, Unit> {
        public C10268q() {
            super(1);
        }

        /* renamed from: a */
        public final void m73127a(HM4<DG3> hm4) {
            DG3 m103944a;
            int i;
            if (hm4.m103939f() && (m103944a = hm4.m103944a()) != null) {
                ZQ4 zq4 = ZQ4.this;
                WR4 wr4 = zq4.f48534n;
                String m110631b = m103944a.m110631b();
                int i2 = C52342yg4.ic_parking_white;
                boolean z = !zq4.f48523c.m82623f8().m73665a().getRideConfig().getDisableEndRidePhotoMiddleIcon();
                WireRide wireRide = zq4.f48535o;
                if (wireRide == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ride");
                    wireRide = null;
                }
                WireBird bird = wireRide.getBird();
                if (bird != null) {
                    i = zq4.m73144y(bird);
                } else {
                    i = C48193rg4.ic_silhouette_scooter;
                }
                VR4.C8651a.renderPrePhotoCapture$default(wr4, null, m110631b, i2, z, i, 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<DG3> hm4) {
            m73127a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZQ4$r */
    /* loaded from: classes2.dex */
    public static final class C10269r extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C10269r f48567g = new C10269r();

        public C10269r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Could not save ride end photo to disk.", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/graphics/Bitmap;", "bitmap", "Lio/reactivex/K;", "LZQ4$a;", "kotlin.jvm.PlatformType", "b", "(Landroid/graphics/Bitmap;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZQ4$s */
    /* loaded from: classes2.dex */
    public static final class C10270s extends Lambda implements Function1<Bitmap, InterfaceC23447K<? extends C10250a>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "photoUri", "LZQ4$a;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)LZQ4$a;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ZQ4$s$a */
        /* loaded from: classes2.dex */
        public static final class C10271a extends Lambda implements Function1<String, C10250a> {

            /* renamed from: g */
            public final /* synthetic */ Bitmap f48569g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10271a(Bitmap bitmap) {
                super(1);
                this.f48569g = bitmap;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final C10250a invoke(String photoUri) {
                Intrinsics.checkNotNullParameter(photoUri, "photoUri");
                Bitmap bitmap = this.f48569g;
                Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
                return new C10250a(bitmap, photoUri);
            }
        }

        public C10270s() {
            super(1);
        }

        /* renamed from: c */
        public static final C10250a m73124c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (C10250a) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends C10250a> invoke(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            AbstractC23442F m73176U = ZQ4.this.m73176U(bitmap);
            final C10271a c10271a = new C10271a(bitmap);
            return m73176U.m33157I(new InterfaceC23492o() { // from class: cR4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    ZQ4.C10250a m73124c;
                    m73124c = ZQ4.C10270s.m73124c(Function1.this, obj);
                    return m73124c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZQ4$t */
    /* loaded from: classes2.dex */
    public static final class C10272t extends Lambda implements Function1<Throwable, Unit> {
        public C10272t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            InterfaceC1880Ea interfaceC1880Ea = ZQ4.this.f48527g;
            String localizedMessage = th.getLocalizedMessage();
            interfaceC1880Ea.mo55905y(new C44502lS3(null, null, null, "ride_end_take_photo", localizedMessage == null ? th.toString() : localizedMessage, 7, null));
        }
    }

    public ZQ4(InterfaceC39861dd3 notificationSender, C22454gl preference, C36207Tq4 reactiveConfig, YR4 rideManager, InterfaceC52458ys0 complianceManager, Context context, InterfaceC1880Ea analyticsManager, InterfaceC12495bn areaManager, InterfaceC46193oI5 smartlockManager, ZC6 workManager, InterfaceC37014Xc1 endRideManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC40099e13 navigator, WR4 ui) {
        Intrinsics.checkNotNullParameter(notificationSender, "notificationSender");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(complianceManager, "complianceManager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(smartlockManager, "smartlockManager");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        Intrinsics.checkNotNullParameter(endRideManager, "endRideManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f48521a = notificationSender;
        this.f48522b = preference;
        this.f48523c = reactiveConfig;
        this.f48524d = rideManager;
        this.f48525e = complianceManager;
        this.f48526f = context;
        this.f48527g = analyticsManager;
        this.f48528h = areaManager;
        this.f48529i = smartlockManager;
        this.f48530j = workManager;
        this.f48531k = endRideManager;
        this.f48532l = scopeProvider;
        this.f48533m = navigator;
        this.f48534n = ui;
        String absolutePath = context.getCacheDir().getAbsolutePath();
        this.f48544x = absolutePath + "/parking-photos";
        C0058AG<C10250a> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<PhotoSaveResult>()");
        this.f48545y = m115951g;
    }

    /* renamed from: B */
    public static final InterfaceC23447K m73195B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m73194C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final boolean m73193D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: E */
    public static final InterfaceC23434B m73192E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final Integer m73191F(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Integer) tmp0.invoke(obj, obj2);
    }

    /* renamed from: G */
    public static final void m73190G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m73189H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m73188I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m73187J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final InterfaceC23496h m73186K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m73185L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m73184M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m73183N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final InterfaceC23447K m73182O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m73181P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m73178S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final String m73175V(ZQ4 this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        File file = new File(this$0.f48544x);
        if (!file.exists()) {
            file.mkdirs();
        }
        UUID randomUUID = UUID.randomUUID();
        return C27606qU.writeToFile$default(bitmap, new File(file, randomUUID + ".png"), false, 2, null).toURI().toString();
    }

    /* renamed from: W */
    public static final void m73174W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final InterfaceC23447K m73172Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m73171Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public void m73196A(Intent intent) {
        WirePhysicalLock m76371b;
        boolean z;
        boolean z2;
        WireRide wireRide;
        boolean z3;
        WireRide ride;
        WireBird bird;
        List<WirePhysicalLock> physicalLocks;
        Object obj;
        Intrinsics.checkNotNullParameter(intent, "intent");
        WireRideDetail wireRideDetail = (WireRideDetail) intent.getParcelableExtra("ride_detail");
        this.f48536p = wireRideDetail;
        PhysicalLockPurpose physicalLockPurpose = null;
        if (m73145x()) {
            RideState m59035e = this.f48524d.mo75034m0().m73665a().m59035e();
            if (m59035e != null && (ride = m59035e.getRide()) != null && (bird = ride.getBird()) != null && (physicalLocks = bird.getPhysicalLocks()) != null) {
                Iterator<T> it = physicalLocks.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (!((WirePhysicalLock) obj).isBrainLock()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                m76371b = (WirePhysicalLock) obj;
            }
            m76371b = null;
        } else {
            C37099Xl5 m59035e2 = this.f48529i.mo21402e().m73665a().m59035e();
            if (m59035e2 != null) {
                m76371b = m59035e2.m76371b();
            }
            m76371b = null;
        }
        if (m76371b != null) {
            physicalLockPurpose = m76371b.getPurpose();
        }
        if (physicalLockPurpose == PhysicalLockPurpose.HELMET) {
            z = true;
        } else {
            z = false;
        }
        int mo21395l = this.f48529i.mo21395l();
        if (z && mo21395l > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f48543w = z2;
        if (wireRideDetail == null || (wireRide = wireRideDetail.getRide()) == null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("ride");
            Intrinsics.checkNotNull(parcelableExtra);
            wireRide = (WireRide) parcelableExtra;
        }
        this.f48535o = wireRide;
        if (!intent.getBooleanExtra("has_physical_lock", false) && !this.f48543w) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f48537q = z3;
        this.f48538r = intent.getBooleanExtra("ride_end_photo_required", false);
        this.f48542v = intent.getBooleanExtra("ride_lock_photo_parking_warning", false);
        m73179R();
        Observable<Unit> m78459C1 = this.f48534n.m78459C1();
        EnumC23460b enumC23460b = EnumC23460b.DROP;
        AbstractC24490k<Unit> m32108t0 = m78459C1.toFlowable(enumC23460b).m32108t0(C23454a.m33087a(), false, 1);
        final C10257h c10257h = new C10257h();
        AbstractC24490k<R> m32149f0 = m32108t0.m32149f0(new InterfaceC23492o() { // from class: UQ4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj2) {
                InterfaceC23447K m73195B;
                m73195B = ZQ4.m73195B(Function1.this, obj2);
                return m73195B;
            }
        });
        final C10258i c10258i = new C10258i();
        AbstractC24490k m32111s0 = m32149f0.m32191K(new InterfaceC23484g() { // from class: HQ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                ZQ4.m73188I(Function1.this, obj2);
            }
        }).m32111s0(C23454a.m33087a());
        final C10259j c10259j = new C10259j();
        AbstractC24490k m32191K = m32111s0.m32191K(new InterfaceC23484g() { // from class: IQ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                ZQ4.m73187J(Function1.this, obj2);
            }
        });
        final C10260k c10260k = new C10260k();
        AbstractC23461c m32151e1 = m32191K.m32151e1(new InterfaceC23492o() { // from class: JQ4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj2) {
                InterfaceC23496h m73186K;
                m73186K = ZQ4.m73186K(Function1.this, obj2);
                return m73186K;
            }
        });
        final C10262l c10262l = C10262l.f48560g;
        AbstractC23461c m33066T = m32151e1.m33084B(new InterfaceC23484g() { // from class: KQ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                ZQ4.m73185L(Function1.this, obj2);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "override fun onCreate(in…e\n      }, Timber::w)\n  }");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(this.f48532l));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Object m33094as = this.f48534n.m78449h0().m33094as(AutoDispose.m45239a(this.f48532l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10263m c10263m = new C10263m();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: LQ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                ZQ4.m73184M(Function1.this, obj2);
            }
        });
        Object m33094as2 = this.f48534n.m78455Ql().m33094as(AutoDispose.m45239a(this.f48532l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10264n c10264n = new C10264n();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: MQ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                ZQ4.m73183N(Function1.this, obj2);
            }
        });
        AbstractC24490k m32108t02 = C24527f.m31950a(this.f48534n.m78450Ul(), this.f48545y).toFlowable(enumC23460b).m32108t0(C24542a.m31932c(), false, 1);
        final C10265o c10265o = new C10265o();
        AbstractC24490k m32111s02 = m32108t02.m32149f0(new InterfaceC23492o() { // from class: NQ4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj2) {
                InterfaceC23447K m73182O;
                m73182O = ZQ4.m73182O(Function1.this, obj2);
                return m73182O;
            }
        }).m32111s0(C23454a.m33087a());
        final C10267p c10267p = new C10267p();
        AbstractC24490k m32192J0 = m32111s02.m32195I(new InterfaceC23484g() { // from class: OQ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                ZQ4.m73181P(Function1.this, obj2);
            }
        }).m32192J0();
        Intrinsics.checkNotNullExpressionValue(m32192J0, "override fun onCreate(in…e\n      }, Timber::w)\n  }");
        Object m32150f = m32192J0.m32150f(AutoDispose.m45239a(this.f48532l));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10251b c10251b = new C10251b();
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: PQ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                ZQ4.m73194C(Function1.this, obj2);
            }
        });
        Observable<Integer> m82501q9 = this.f48523c.m82501q9();
        final C10252c c10252c = new C10252c();
        Observable<Integer> take = m82501q9.filter(new InterfaceC23494q() { // from class: VQ4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj2) {
                boolean m73193D;
                m73193D = ZQ4.m73193D(Function1.this, obj2);
                return m73193D;
            }
        }).take(1L);
        final C10253d c10253d = new C10253d();
        InterfaceC23492o<? super Integer, ? extends InterfaceC23434B<? extends U>> interfaceC23492o = new InterfaceC23492o() { // from class: WQ4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj2) {
                InterfaceC23434B m73192E;
                m73192E = ZQ4.m73192E(Function1.this, obj2);
                return m73192E;
            }
        };
        final C10254e c10254e = C10254e.f48551g;
        Observable<R> flatMap = take.flatMap(interfaceC23492o, new InterfaceC23480c() { // from class: XQ4
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj2, Object obj3) {
                Integer m73191F;
                m73191F = ZQ4.m73191F(Function2.this, obj2, obj3);
                return m73191F;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "override fun onCreate(in…e\n      }, Timber::w)\n  }");
        Object m33094as3 = flatMap.m33094as(AutoDispose.m45239a(this.f48532l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10255f c10255f = new C10255f();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: YQ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                ZQ4.m73190G(Function1.this, obj2);
            }
        };
        final C10256g c10256g = C10256g.f48553b;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: GQ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                ZQ4.m73189H(Function1.this, obj2);
            }
        });
    }

    /* renamed from: Q */
    public final void m73180Q(String str) {
        C41318g46.m40163a("onPhotoUploaded called with " + str, new Object[0]);
        this.f48541u = true;
        WireRideDetail wireRideDetail = this.f48536p;
        if (wireRideDetail != null) {
            this.f48533m.mo36944t(wireRideDetail, this.f48542v, this.f48537q, str);
        }
        this.f48533m.mo37029e4(-1, new Intent());
    }

    /* renamed from: R */
    public final void m73179R() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = null;
        WireRide wireRide = null;
        WireRide wireRide2 = null;
        WireRide wireRide3 = null;
        if (this.f48543w) {
            this.f48534n.setTitle(C45871nl4.rider_bar_ride_helmet_lock_photo_required_title);
            WR4 wr4 = this.f48534n;
            String string = this.f48526f.getString(C45871nl4.rider_bar_ride_helmet_lock_photo_required_body);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…lock_photo_required_body)");
            int i5 = C52342yg4.ic_lock_black;
            WireRide wireRide4 = this.f48535o;
            if (wireRide4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ride");
            } else {
                wireRide = wireRide4;
            }
            WireBird bird = wireRide.getBird();
            if (bird != null) {
                i4 = m73144y(bird);
            } else {
                i4 = C48193rg4.ic_silhouette_scooter;
            }
            VR4.C8651a.renderPrePhotoCapture$default(wr4, null, string, i5, false, i4, 1, null);
            return;
        }
        if (this.f48537q) {
            WireRide wireRide5 = this.f48535o;
            if (wireRide5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ride");
                wireRide5 = null;
            }
            WireBird bird2 = wireRide5.getBird();
            boolean z = false;
            if (bird2 != null && !WireBirdKt.isCruiserModel(bird2)) {
                z = true;
            }
            if (z) {
                WR4 wr42 = this.f48534n;
                String string2 = this.f48526f.getString(C45871nl4.lock_to_take_photo_title);
                String string3 = this.f48526f.getString(C45871nl4.lock_to_take_photo_body);
                Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.stri….lock_to_take_photo_body)");
                WireRide wireRide6 = this.f48535o;
                if (wireRide6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ride");
                    wireRide6 = null;
                }
                WireBird bird3 = wireRide6.getBird();
                if (bird3 != null) {
                    i2 = m73143z(bird3);
                } else {
                    i2 = C48193rg4.ic_framed_scooter;
                }
                int i6 = i2;
                boolean z2 = !this.f48523c.m82623f8().m73665a().getRideConfig().getDisableEndRidePhotoMiddleIcon();
                WireRide wireRide7 = this.f48535o;
                if (wireRide7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ride");
                } else {
                    wireRide2 = wireRide7;
                }
                WireBird bird4 = wireRide2.getBird();
                if (bird4 != null) {
                    i3 = m73144y(bird4);
                } else {
                    i3 = C48193rg4.ic_silhouette_scooter;
                }
                wr42.mo78458Ik(string2, string3, i6, z2, i3);
                return;
            }
        }
        if (this.f48538r) {
            this.f48534n.setTitle(C45871nl4.parking_photo_required_title);
            WR4 wr43 = this.f48534n;
            String string4 = this.f48526f.getString(C45871nl4.ride_lock_photo_info_pre_photo_capture_body);
            Intrinsics.checkNotNullExpressionValue(string4, "context.getString(L.stri…o_pre_photo_capture_body)");
            int i7 = C52342yg4.ic_lock_black;
            WireRide wireRide8 = this.f48535o;
            if (wireRide8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ride");
            } else {
                wireRide3 = wireRide8;
            }
            WireBird bird5 = wireRide3.getBird();
            if (bird5 != null) {
                i = m73144y(bird5);
            } else {
                i = C48193rg4.ic_silhouette_scooter;
            }
            VR4.C8651a.renderPrePhotoCapture$default(wr43, null, string4, i7, false, i, 1, null);
            return;
        }
        YR4 yr4 = this.f48524d;
        WireRide wireRide9 = this.f48535o;
        if (wireRide9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ride");
            wireRide9 = null;
        }
        String birdId = wireRide9.getBirdId();
        if (birdId == null) {
            WireRide wireRide10 = this.f48535o;
            if (wireRide10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ride");
                wireRide10 = null;
            }
            WireBird bird6 = wireRide10.getBird();
            if (bird6 != null) {
                str = bird6.getId();
            }
        } else {
            str = birdId;
        }
        Object m33135e = yr4.mo75047f(str).m33135e(AutoDispose.m45239a(this.f48532l));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10268q c10268q = new C10268q();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: TQ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZQ4.m73178S(Function1.this, obj);
            }
        });
    }

    /* renamed from: T */
    public final void m73177T() {
        if (this.f48539s) {
            this.f48534n.m78448i();
        }
        m73179R();
    }

    /* renamed from: U */
    public final AbstractC23442F<String> m73176U(final Bitmap bitmap) {
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: RQ4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String m73175V;
                m73175V = ZQ4.m73175V(ZQ4.this, bitmap);
                return m73175V;
            }
        });
        final C10269r c10269r = C10269r.f48567g;
        AbstractC23442F<String> m33142Y = m33161E.m33106t(new InterfaceC23484g() { // from class: SQ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZQ4.m73174W(Function1.this, obj);
            }
        }).m33148R("").m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      val…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    /* renamed from: X */
    public final AbstractC23442F<C10250a> m73173X() {
        this.f48539s = this.f48534n.m78456Pl();
        AbstractC23442F<Bitmap> m33152N = this.f48534n.m78451Tl().m33152N(C24542a.m31932c());
        final C10270s c10270s = new C10270s();
        AbstractC23442F m33152N2 = m33152N.m33165A(new InterfaceC23492o() { // from class: FQ4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m73172Y;
                m73172Y = ZQ4.m73172Y(Function1.this, obj);
                return m73172Y;
            }
        }).m33152N(C23454a.m33087a());
        final C10272t c10272t = new C10272t();
        AbstractC23442F<C10250a> m33106t = m33152N2.m33106t(new InterfaceC23484g() { // from class: QQ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZQ4.m73171Z(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33106t, "private fun takeAndSaveP…  )\n        )\n      }\n  }");
        return m33106t;
    }

    /* renamed from: a0 */
    public final void m73169a0(URI uri) {
        File[] fileArr = {new File(uri)};
        ZC6 zc6 = this.f48530j;
        UpdateRidePhotoWorker.C16005a c16005a = UpdateRidePhotoWorker.f66047i;
        WireRide wireRide = this.f48535o;
        if (wireRide == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ride");
            wireRide = null;
        }
        C52389yl1.m2660a(fileArr, zc6, UpdateRidePhotoWorker.class, c16005a.m56110a(wireRide.getId()), Folder.RIDE_PHOTOS);
    }

    /* renamed from: b0 */
    public final AbstractC23442F<WireRide> m73167b0(Bitmap bitmap) {
        YR4 yr4 = this.f48524d;
        WireRide wireRide = this.f48535o;
        if (wireRide == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ride");
            wireRide = null;
        }
        AbstractC23442F<WireRide> m33152N = yr4.mo75027u0(wireRide, C27606qU.toByteArray$default(bitmap, 0, 1, null)).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "rideManager.uploadRidePh…dSchedulers.mainThread())");
        return m33152N;
    }

    @Override // p000.EQ4
    public void onBackPressed() {
        C41318g46.m40163a("onBackPressed in ride end photo screen", new Object[0]);
        WireRideDetail wireRideDetail = this.f48536p;
        if (wireRideDetail != null) {
            InterfaceC40099e13.C19924a.goToRideSummary$default(this.f48533m, wireRideDetail, this.f48542v, this.f48537q, null, 8, null);
        }
    }

    @Override // p000.EQ4
    public void onPause() {
        this.f48534n.m78457M1();
        if (!this.f48541u && this.f48523c.m82623f8().getValue().getRequireRideEndPhotoToEndRide()) {
            m73147v();
        }
    }

    @Override // p000.EQ4
    public void onResume() {
        this.f48534n.m78454Rh();
        m73148u();
    }

    /* renamed from: u */
    public final void m73148u() {
        this.f48521a.mo42699b(m73146w());
    }

    /* renamed from: v */
    public final void m73147v() {
        this.f48522b.m37724H2(true);
        int m73146w = m73146w();
        Notification m71057c = this.f48521a.mo42697d(m73146w, new Intent(this.f48534n.getActivity(), MainActivity.class)).m71047m(this.f48534n.getActivity().getString(C45871nl4.notification_bird_ride_with_lock_not_ended_title)).m71048l(this.f48534n.getActivity().getString(C45871nl4.notification_bird_ride_with_lock_not_ended_body)).m71060I(System.currentTimeMillis()).m71057c();
        Intrinsics.checkNotNullExpressionValue(m71057c, "notificationSender.getNo…eMillis())\n      .build()");
        this.f48521a.mo42696e(m71057c, m73146w);
    }

    /* renamed from: w */
    public final int m73146w() {
        return C30906z6.m1823a(Reflection.getOrCreateKotlinClass(this.f48534n.getActivity().getClass()));
    }

    /* renamed from: x */
    public final boolean m73145x() {
        return Intrinsics.areEqual(this.f48523c.m82623f8().m73665a().getRideConfig().getSmartlockConfig().getEnableV2(), Boolean.TRUE);
    }

    /* renamed from: y */
    public final int m73144y(WireBird wireBird) {
        if (WireBirdKt.isBikeType(wireBird)) {
            return C48193rg4.ic_silhouette_bike;
        }
        return C48193rg4.ic_silhouette_scooter;
    }

    /* renamed from: z */
    public final int m73143z(WireBird wireBird) {
        if (WireBirdKt.isBikeType(wireBird)) {
            return C48193rg4.ic_framed_bike;
        }
        return C48193rg4.ic_framed_scooter;
    }
}
