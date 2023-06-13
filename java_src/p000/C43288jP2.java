package p000;

import android.content.Intent;
import android.graphics.Bitmap;
import android.location.Location;
import android.os.Handler;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdInspection;
import co.bird.android.model.BirdInspectionPoint;
import co.bird.android.model.BirdRepair;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.MechanicPhotoMode;
import co.bird.android.model.constant.BirdInspectionResult;
import co.bird.android.model.constant.Resolution;
import co.bird.android.model.wire.WireBird;
import co.bird.api.request.InspectionJobSubmission;
import co.bird.api.request.RepairJobSubmission;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.C24576w;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C43288jP2;
import p000.H31;
import p000.S74;
@Metadata(m28433d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0X\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)¢\u0006\u0004\b[\u0010\\J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\u000f\u0010\n\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001c\u0010\u000bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00120@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00120@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010BR\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00120@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010BR\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00120H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020M0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020Q0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010OR\u0016\u0010W\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006]"}, m28432d2 = {"LjP2;", "LxC;", "LPO2;", "Landroid/content/Intent;", "intent", "", "b", "onResume", "onPause", "onBackPressed", "a0", "()V", "Landroid/graphics/Bitmap;", "bitmap", "o0", "(Landroid/graphics/Bitmap;)V", "", "jpeg", "Lco/bird/android/model/BirdInspectionPoint;", "inspectionPoint", "i0", "([BLco/bird/android/model/BirdInspectionPoint;)V", "l0", "", "isInspection", "c0", "(Z)V", "Q", "W", "LlP2;", "c", "LlP2;", "ui", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "LFO2;", "e", "LFO2;", "mechanicManager", "Landroid/os/Handler;", "f", "Landroid/os/Handler;", "handler", "g", "Z", "capturing", "Lco/bird/android/model/MechanicPhotoMode;", "h", "Lco/bird/android/model/MechanicPhotoMode;", "mode", "", "i", "Ljava/lang/String;", "id", "Lco/bird/android/model/wire/WireBird;", "j", "Lco/bird/android/model/wire/WireBird;", "bird", "Landroid/location/Location;", "k", "Landroid/location/Location;", "location", "Ljava/util/ArrayList;", "l", "Ljava/util/ArrayList;", "inspectionPointList", "m", "checkedPointList", "n", "uncheckedPointList", "Ljava/util/Queue;", "o", "Ljava/util/Queue;", "queue", "", "Lco/bird/api/request/InspectionJobSubmission;", "p", "Ljava/util/List;", "inspectionJobSubmissionList", "Lco/bird/api/request/RepairJobSubmission;", "q", "repairJobSubmissionList", "", "r", "I", "photoCount", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "scopeProvider", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LlP2;Le13;LFO2;Landroid/os/Handler;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMechanicPhotoPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MechanicPhotoPresenter.kt\nco/bird/android/app/feature/legacyrepair/photo/MechanicPhotoPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,246:1\n180#2:247\n180#2:248\n180#2:249\n180#2:250\n199#2:251\n199#2:252\n199#2:253\n180#2:254\n180#2:255\n180#2:256\n180#2:257\n*S KotlinDebug\n*F\n+ 1 MechanicPhotoPresenter.kt\nco/bird/android/app/feature/legacyrepair/photo/MechanicPhotoPresenterImpl\n*L\n77#1:247\n89#1:248\n94#1:249\n99#1:250\n114#1:251\n126#1:252\n138#1:253\n158#1:254\n177#1:255\n215#1:256\n232#1:257\n*E\n"})
/* renamed from: jP2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43288jP2 extends C30060xC implements PO2 {

    /* renamed from: c */
    public final InterfaceC44474lP2 f92651c;

    /* renamed from: d */
    public final InterfaceC40099e13 f92652d;

    /* renamed from: e */
    public final FO2 f92653e;

    /* renamed from: f */
    public final Handler f92654f;

    /* renamed from: g */
    public boolean f92655g;

    /* renamed from: h */
    public MechanicPhotoMode f92656h;

    /* renamed from: i */
    public String f92657i;

    /* renamed from: j */
    public WireBird f92658j;

    /* renamed from: k */
    public Location f92659k;

    /* renamed from: l */
    public ArrayList<BirdInspectionPoint> f92660l;

    /* renamed from: m */
    public ArrayList<BirdInspectionPoint> f92661m;

    /* renamed from: n */
    public ArrayList<BirdInspectionPoint> f92662n;

    /* renamed from: o */
    public Queue<BirdInspectionPoint> f92663o;

    /* renamed from: p */
    public final List<InspectionJobSubmission> f92664p;

    /* renamed from: q */
    public final List<RepairJobSubmission> f92665q;

    /* renamed from: r */
    public int f92666r;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/BirdInspection;", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/BirdInspection;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jP2$a */
    /* loaded from: classes2.dex */
    public static final class C24815a extends Lambda implements Function1<BirdInspection, InterfaceC23434B<? extends BirdInspection>> {
        public C24815a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends BirdInspection> invoke(BirdInspection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            FO2 fo2 = C43288jP2.this.f92653e;
            String str = C43288jP2.this.f92657i;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("id");
                str = null;
            }
            return fo2.mo93947x(str, Resolution.COMPLETED);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/BirdInspection;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/BirdRepair;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/BirdInspection;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jP2$b */
    /* loaded from: classes2.dex */
    public static final class C24816b extends Lambda implements Function1<BirdInspection, InterfaceC23434B<? extends BirdRepair>> {
        public C24816b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends BirdRepair> invoke(BirdInspection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            FO2 fo2 = C43288jP2.this.f92653e;
            WireBird wireBird = C43288jP2.this.f92658j;
            if (wireBird == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird = null;
            }
            return fo2.mo93949v(wireBird.getId());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/w;", "Lco/bird/android/model/BirdRepair;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/w;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jP2$c */
    /* loaded from: classes2.dex */
    public static final class C24817c extends Lambda implements Function1<C24576w<BirdRepair>, Unit> {
        public C24817c() {
            super(1);
        }

        /* renamed from: a */
        public final void m30668a(C24576w<BirdRepair> c24576w) {
            S74.C7343a.showProgress$default(C43288jP2.this.f92651c, false, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C24576w<BirdRepair> c24576w) {
            m30668a(c24576w);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/BirdRepair;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/BirdRepair;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jP2$d */
    /* loaded from: classes2.dex */
    public static final class C24818d extends Lambda implements Function1<BirdRepair, Unit> {
        public C24818d() {
            super(1);
        }

        /* renamed from: a */
        public final void m30667a(BirdRepair birdRepair) {
            InterfaceC40099e13 interfaceC40099e13 = C43288jP2.this.f92652d;
            WireBird wireBird = C43288jP2.this.f92658j;
            ArrayList<BirdInspectionPoint> arrayList = null;
            if (wireBird == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird = null;
            }
            Location location = C43288jP2.this.f92659k;
            if (location == null) {
                Intrinsics.throwUninitializedPropertyAccessException("location");
                location = null;
            }
            String id = birdRepair.getId();
            ArrayList<BirdInspectionPoint> arrayList2 = C43288jP2.this.f92660l;
            if (arrayList2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inspectionPointList");
            } else {
                arrayList = arrayList2;
            }
            interfaceC40099e13.mo36987l4(wireBird, location, id, arrayList);
            C43288jP2.this.f92652d.close();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdRepair birdRepair) {
            m30667a(birdRepair);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jP2$e */
    /* loaded from: classes2.dex */
    public static final class C24819e extends Lambda implements Function1<Throwable, Unit> {
        public C24819e() {
            super(1);
        }

        /* renamed from: b */
        public static final void m30665b(C43288jP2 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f92652d.mo37030e3();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C43288jP2.this.f92651c.error(C45871nl4.add_inspection_jobs_error_message);
            Handler handler = C43288jP2.this.f92654f;
            final C43288jP2 c43288jP2 = C43288jP2.this;
            handler.postDelayed(new Runnable() { // from class: kP2
                @Override // java.lang.Runnable
                public final void run() {
                    C43288jP2.C24819e.m30665b(C43288jP2.this);
                }
            }, 2000L);
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/w;", "Lco/bird/android/model/BirdRepair;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/w;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jP2$f */
    /* loaded from: classes2.dex */
    public static final class C24820f extends Lambda implements Function1<C24576w<BirdRepair>, Unit> {
        public C24820f() {
            super(1);
        }

        /* renamed from: a */
        public final void m30664a(C24576w<BirdRepair> c24576w) {
            S74.C7343a.showProgress$default(C43288jP2.this.f92651c, false, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C24576w<BirdRepair> c24576w) {
            m30664a(c24576w);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/BirdRepair;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/BirdRepair;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jP2$g */
    /* loaded from: classes2.dex */
    public static final class C24821g extends Lambda implements Function1<BirdRepair, Unit> {
        public C24821g() {
            super(1);
        }

        /* renamed from: a */
        public final void m30663a(BirdRepair birdRepair) {
            ArrayList arrayList = C43288jP2.this.f92662n;
            String str = null;
            if (arrayList == null) {
                Intrinsics.throwUninitializedPropertyAccessException("uncheckedPointList");
                arrayList = null;
            }
            if (arrayList.size() == 0) {
                InterfaceC40099e13 interfaceC40099e13 = C43288jP2.this.f92652d;
                WireBird wireBird = C43288jP2.this.f92658j;
                if (wireBird == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bird");
                    wireBird = null;
                }
                String str2 = C43288jP2.this.f92657i;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("id");
                } else {
                    str = str2;
                }
                interfaceC40099e13.mo36904z3(wireBird, str, false);
            } else {
                InterfaceC40099e13 interfaceC40099e132 = C43288jP2.this.f92652d;
                WireBird wireBird2 = C43288jP2.this.f92658j;
                if (wireBird2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bird");
                    wireBird2 = null;
                }
                String str3 = C43288jP2.this.f92657i;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("id");
                } else {
                    str = str3;
                }
                interfaceC40099e132.mo36904z3(wireBird2, str, true);
            }
            C43288jP2.this.f92652d.close();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdRepair birdRepair) {
            m30663a(birdRepair);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jP2$h */
    /* loaded from: classes2.dex */
    public static final class C24822h extends Lambda implements Function1<Throwable, Unit> {
        public C24822h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C43288jP2.this.f92651c.error(C45871nl4.add_repair_jobs_error_message);
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jP2$i */
    /* loaded from: classes2.dex */
    public static final class C24823i extends Lambda implements Function1<Bitmap, Unit> {
        public C24823i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
            invoke2(bitmap);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Bitmap bitmap) {
            S74.C7343a.showProgress$default(C43288jP2.this.f92651c, false, 0, 2, null);
            InterfaceC44474lP2 interfaceC44474lP2 = C43288jP2.this.f92651c;
            Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
            interfaceC44474lP2.mo23837cg(bitmap);
            C43288jP2.this.f92655g = false;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jP2$j */
    /* loaded from: classes2.dex */
    public static final class C24824j extends Lambda implements Function1<DialogResponse, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: jP2$j$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C24825a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DialogResponse.values().length];
                try {
                    iArr[DialogResponse.OK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C24824j() {
            super(1);
        }

        /* renamed from: a */
        public final void m30662a(DialogResponse dialogResponse) {
            int i;
            if (dialogResponse == null) {
                i = -1;
            } else {
                i = C24825a.$EnumSwitchMapping$0[dialogResponse.ordinal()];
            }
            if (i == 1) {
                C43288jP2.this.f92652d.close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m30662a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jP2$k */
    /* loaded from: classes2.dex */
    public static final class C24826k extends Lambda implements Function1<Unit, Unit> {
        public C24826k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C43288jP2.this.f92651c.mo23845E6();
            S74.C7343a.showProgress$default(C43288jP2.this.f92651c, true, 0, 2, null);
            if (C43288jP2.this.f92655g) {
                return;
            }
            C43288jP2.this.f92655g = true;
            C43288jP2.this.m30690a0();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jP2$l */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C24827l extends FunctionReferenceImpl implements Function1<Bitmap, Unit> {
        public C24827l(Object obj) {
            super(1, obj, C43288jP2.class, "usePhoto", "usePhoto$app_birdRelease(Landroid/graphics/Bitmap;)V", 0);
        }

        /* renamed from: a */
        public final void m30661a(Bitmap p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C43288jP2) this.receiver).m30675o0(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
            m30661a(bitmap);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jP2$m */
    /* loaded from: classes2.dex */
    public static final class C24828m extends Lambda implements Function1<Unit, Unit> {
        public C24828m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C43288jP2.this.f92651c.mo23833pc();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jP2$n */
    /* loaded from: classes2.dex */
    public static final class C24829n extends Lambda implements Function1<Unit, Unit> {
        public C24829n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C43288jP2.this.f92651c.mo23835i();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/request/InspectionJobSubmission;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/api/request/InspectionJobSubmission;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jP2$o */
    /* loaded from: classes2.dex */
    public static final class C24830o extends Lambda implements Function1<InspectionJobSubmission, Unit> {
        public C24830o() {
            super(1);
        }

        /* renamed from: a */
        public final void m30660a(InspectionJobSubmission it) {
            List list = C43288jP2.this.f92664p;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            list.add(it);
            C43288jP2.this.m30687c0(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InspectionJobSubmission inspectionJobSubmission) {
            m30660a(inspectionJobSubmission);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jP2$p */
    /* loaded from: classes2.dex */
    public static final class C24831p extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ BirdInspectionPoint f92682h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24831p(BirdInspectionPoint birdInspectionPoint) {
            super(1);
            this.f92682h = birdInspectionPoint;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            List list = C43288jP2.this.f92664p;
            String str = C43288jP2.this.f92657i;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("id");
                str = null;
            }
            list.add(new InspectionJobSubmission(str, this.f92682h.getId(), null, BirdInspectionResult.FAIL));
            C43288jP2.this.m30687c0(true);
            C43288jP2.this.f92651c.warn(C45871nl4.inspection_photo_uploading_error_message);
            S74.C7343a.showProgress$default(C43288jP2.this.f92651c, false, 0, 2, null);
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/request/RepairJobSubmission;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/api/request/RepairJobSubmission;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jP2$q */
    /* loaded from: classes2.dex */
    public static final class C24832q extends Lambda implements Function1<RepairJobSubmission, Unit> {
        public C24832q() {
            super(1);
        }

        /* renamed from: a */
        public final void m30659a(RepairJobSubmission it) {
            List list = C43288jP2.this.f92665q;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            list.add(it);
            C43288jP2.this.m30687c0(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RepairJobSubmission repairJobSubmission) {
            m30659a(repairJobSubmission);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jP2$r */
    /* loaded from: classes2.dex */
    public static final class C24833r extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ BirdInspectionPoint f92685h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24833r(BirdInspectionPoint birdInspectionPoint) {
            super(1);
            this.f92685h = birdInspectionPoint;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            List list = C43288jP2.this.f92665q;
            String str = C43288jP2.this.f92657i;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("id");
                str = null;
            }
            list.add(new RepairJobSubmission(str, this.f92685h.getId(), null));
            C43288jP2.this.m30687c0(false);
            C43288jP2.this.f92651c.warn(C45871nl4.repair_photo_uploading_error_message);
            S74.C7343a.showProgress$default(C43288jP2.this.f92651c, false, 0, 2, null);
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", Entry.TYPE_IMAGE, "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jP2$s */
    /* loaded from: classes2.dex */
    public static final class C24834s extends Lambda implements Function1<Bitmap, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: jP2$s$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C24835a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MechanicPhotoMode.values().length];
                try {
                    iArr[MechanicPhotoMode.INSPECTION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MechanicPhotoMode.REPAIR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C24834s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
            invoke2(bitmap);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Bitmap bitmap) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
            byte[] array = byteArrayOutputStream.toByteArray();
            Queue queue = C43288jP2.this.f92663o;
            Queue queue2 = null;
            if (queue == null) {
                Intrinsics.throwUninitializedPropertyAccessException("queue");
                queue = null;
            }
            if (!queue.isEmpty()) {
                MechanicPhotoMode mechanicPhotoMode = C43288jP2.this.f92656h;
                if (mechanicPhotoMode == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mode");
                    mechanicPhotoMode = null;
                }
                int i = C24835a.$EnumSwitchMapping$0[mechanicPhotoMode.ordinal()];
                if (i == 1) {
                    C43288jP2 c43288jP2 = C43288jP2.this;
                    Intrinsics.checkNotNullExpressionValue(array, "array");
                    Queue queue3 = C43288jP2.this.f92663o;
                    if (queue3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("queue");
                    } else {
                        queue2 = queue3;
                    }
                    Object poll = queue2.poll();
                    Intrinsics.checkNotNullExpressionValue(poll, "queue.poll()");
                    c43288jP2.m30681i0(array, (BirdInspectionPoint) poll);
                } else if (i == 2) {
                    C43288jP2 c43288jP22 = C43288jP2.this;
                    Intrinsics.checkNotNullExpressionValue(array, "array");
                    Queue queue4 = C43288jP2.this.f92663o;
                    if (queue4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("queue");
                    } else {
                        queue2 = queue4;
                    }
                    Object poll2 = queue2.poll();
                    Intrinsics.checkNotNullExpressionValue(poll2, "queue.poll()");
                    c43288jP22.m30678l0(array, (BirdInspectionPoint) poll2);
                }
            }
            bitmap.recycle();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43288jP2(LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC44474lP2 ui, InterfaceC40099e13 navigator, FO2 mechanicManager, Handler handler) {
        super(scopeProvider);
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(mechanicManager, "mechanicManager");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f92651c = ui;
        this.f92652d = navigator;
        this.f92653e = mechanicManager;
        this.f92654f = handler;
        this.f92664p = new ArrayList();
        this.f92665q = new ArrayList();
        this.f92666r = 1;
    }

    /* renamed from: R */
    public static final InterfaceC23434B m30699R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final InterfaceC23434B m30698S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m30697T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m30696U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m30695V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m30693X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m30692Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m30691Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m30688b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m30686d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m30685e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m30684f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m30683g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m30682h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final void m30680j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final void m30679k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final void m30677m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m30676n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final void m30674p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public final void m30700Q() {
        FO2 fo2 = this.f92653e;
        String str = this.f92657i;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("id");
            str = null;
        }
        Observable<BirdInspection> mo93953h = fo2.mo93953h(str, this.f92664p);
        final C24815a c24815a = new C24815a();
        Observable<R> flatMap = mo93953h.flatMap(new InterfaceC23492o() { // from class: SO2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m30699R;
                m30699R = C43288jP2.m30699R(Function1.this, obj);
                return m30699R;
            }
        });
        final C24816b c24816b = new C24816b();
        Observable flatMap2 = flatMap.flatMap(new InterfaceC23492o() { // from class: TO2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m30698S;
                m30698S = C43288jP2.m30698S(Function1.this, obj);
                return m30698S;
            }
        });
        final C24817c c24817c = new C24817c();
        Observable doOnEach = flatMap2.doOnEach(new InterfaceC23484g() { // from class: UO2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43288jP2.m30697T(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnEach, "internal fun addInspecti…Timber.e(it)\n      })\n  }");
        Object m33094as = doOnEach.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24818d c24818d = new C24818d();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: VO2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43288jP2.m30696U(Function1.this, obj);
            }
        };
        final C24819e c24819e = new C24819e();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: WO2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43288jP2.m30695V(Function1.this, obj);
            }
        });
    }

    /* renamed from: W */
    public final void m30694W() {
        FO2 fo2 = this.f92653e;
        String str = this.f92657i;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("id");
            str = null;
        }
        Observable<BirdRepair> mo93948w = fo2.mo93948w(str, this.f92665q);
        final C24820f c24820f = new C24820f();
        Observable<BirdRepair> doOnEach = mo93948w.doOnEach(new InterfaceC23484g() { // from class: XO2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43288jP2.m30693X(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnEach, "internal fun addRepairJo…Timber.e(it)\n      })\n  }");
        Object m33094as = doOnEach.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24821g c24821g = new C24821g();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: YO2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43288jP2.m30692Y(Function1.this, obj);
            }
        };
        final C24822h c24822h = new C24822h();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: ZO2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43288jP2.m30691Z(Function1.this, obj);
            }
        });
    }

    /* renamed from: a0 */
    public final void m30690a0() {
        AbstractC23442F<Bitmap> m33152N = this.f92651c.mo23839Z().m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "ui.photoCaptures()\n     …dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24823i c24823i = new C24823i();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: eP2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43288jP2.m30688b0(Function1.this, obj);
            }
        });
    }

    @Override // p000.PO2
    /* renamed from: b */
    public void mo30689b(Intent intent) {
        MechanicPhotoMode mechanicPhotoMode;
        WireBird wireBird;
        Location location;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Parcelable parcelableExtra = intent.getParcelableExtra("bird");
        Intrinsics.checkNotNull(parcelableExtra);
        this.f92658j = (WireBird) parcelableExtra;
        Serializable serializableExtra = intent.getSerializableExtra("photo_mode");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type co.bird.android.model.MechanicPhotoMode");
        this.f92656h = (MechanicPhotoMode) serializableExtra;
        String stringExtra = intent.getStringExtra("inspection_or_repair_id");
        Intrinsics.checkNotNull(stringExtra);
        this.f92657i = stringExtra;
        Parcelable parcelableExtra2 = intent.getParcelableExtra("location");
        Intrinsics.checkNotNull(parcelableExtra2);
        this.f92659k = (Location) parcelableExtra2;
        MechanicPhotoMode mechanicPhotoMode2 = this.f92656h;
        if (mechanicPhotoMode2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mode");
            mechanicPhotoMode2 = null;
        }
        if (mechanicPhotoMode2 == MechanicPhotoMode.REPAIR) {
            ArrayList<BirdInspectionPoint> parcelableArrayListExtra = intent.getParcelableArrayListExtra("selected_repaired_list");
            Intrinsics.checkNotNull(parcelableArrayListExtra);
            this.f92661m = parcelableArrayListExtra;
            ArrayList<BirdInspectionPoint> parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("unselected_repaired_list");
            Intrinsics.checkNotNull(parcelableArrayListExtra2);
            this.f92662n = parcelableArrayListExtra2;
            ArrayList<BirdInspectionPoint> arrayList = this.f92661m;
            if (arrayList == null) {
                Intrinsics.throwUninitializedPropertyAccessException("checkedPointList");
                arrayList = null;
            }
            this.f92663o = new LinkedList(arrayList);
        } else {
            ArrayList<BirdInspectionPoint> parcelableArrayListExtra3 = intent.getParcelableArrayListExtra("inspection_point_list");
            Intrinsics.checkNotNull(parcelableArrayListExtra3);
            this.f92660l = parcelableArrayListExtra3;
            ArrayList<BirdInspectionPoint> arrayList2 = this.f92660l;
            if (arrayList2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inspectionPointList");
                arrayList2 = null;
            }
            this.f92663o = new LinkedList(arrayList2);
        }
        InterfaceC44474lP2 interfaceC44474lP2 = this.f92651c;
        MechanicPhotoMode mechanicPhotoMode3 = this.f92656h;
        if (mechanicPhotoMode3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mode");
            mechanicPhotoMode = null;
        } else {
            mechanicPhotoMode = mechanicPhotoMode3;
        }
        Queue<BirdInspectionPoint> queue = this.f92663o;
        if (queue == null) {
            Intrinsics.throwUninitializedPropertyAccessException("queue");
            queue = null;
        }
        BirdInspectionPoint peek = queue.peek();
        Intrinsics.checkNotNullExpressionValue(peek, "queue.peek()");
        BirdInspectionPoint birdInspectionPoint = peek;
        int i = this.f92666r;
        WireBird wireBird2 = this.f92658j;
        if (wireBird2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        } else {
            wireBird = wireBird2;
        }
        Location location2 = this.f92659k;
        if (location2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("location");
            location = null;
        } else {
            location = location2;
        }
        interfaceC44474lP2.mo23838a3(mechanicPhotoMode, birdInspectionPoint, i, wireBird, location);
        Observable<Unit> observeOn = this.f92651c.mo23846Cd().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.takePhotoClicks()\n   …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24826k c24826k = new C24826k();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: QO2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43288jP2.m30685e0(Function1.this, obj);
            }
        });
        Observable<Bitmap> observeOn2 = this.f92651c.mo23840Vk().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.usePhotoClicks()\n    …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24827l c24827l = new C24827l(this);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: aP2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43288jP2.m30684f0(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn3 = this.f92651c.mo23834i7().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.retakePhoto()\n      .…dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24828m c24828m = new C24828m();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: bP2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43288jP2.m30683g0(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn4 = this.f92651c.mo23836h0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "ui.flashClicks()\n      .…dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24829n c24829n = new C24829n();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: cP2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43288jP2.m30682h0(Function1.this, obj);
            }
        });
    }

    /* renamed from: c0 */
    public final void m30687c0(boolean z) {
        MechanicPhotoMode mechanicPhotoMode;
        WireBird wireBird;
        Location location;
        Queue<BirdInspectionPoint> queue = this.f92663o;
        if (queue == null) {
            Intrinsics.throwUninitializedPropertyAccessException("queue");
            queue = null;
        }
        if (queue.isEmpty()) {
            if (z) {
                m30700Q();
                return;
            } else {
                m30694W();
                return;
            }
        }
        this.f92666r++;
        this.f92655g = false;
        this.f92651c.mo23833pc();
        this.f92651c.mo23832q4();
        S74.C7343a.showProgress$default(this.f92651c, false, 0, 2, null);
        InterfaceC44474lP2 interfaceC44474lP2 = this.f92651c;
        MechanicPhotoMode mechanicPhotoMode2 = this.f92656h;
        if (mechanicPhotoMode2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mode");
            mechanicPhotoMode = null;
        } else {
            mechanicPhotoMode = mechanicPhotoMode2;
        }
        Queue<BirdInspectionPoint> queue2 = this.f92663o;
        if (queue2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("queue");
            queue2 = null;
        }
        BirdInspectionPoint peek = queue2.peek();
        Intrinsics.checkNotNullExpressionValue(peek, "queue.peek()");
        BirdInspectionPoint birdInspectionPoint = peek;
        int i = this.f92666r;
        WireBird wireBird2 = this.f92658j;
        if (wireBird2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        } else {
            wireBird = wireBird2;
        }
        Location location2 = this.f92659k;
        if (location2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("location");
            location = null;
        } else {
            location = location2;
        }
        interfaceC44474lP2.mo23838a3(mechanicPhotoMode, birdInspectionPoint, i, wireBird, location);
    }

    /* renamed from: i0 */
    public final void m30681i0(byte[] jpeg, BirdInspectionPoint inspectionPoint) {
        Intrinsics.checkNotNullParameter(jpeg, "jpeg");
        Intrinsics.checkNotNullParameter(inspectionPoint, "inspectionPoint");
        FO2 fo2 = this.f92653e;
        String str = this.f92657i;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("id");
            str = null;
        }
        Object m33094as = fo2.mo93946y(str, inspectionPoint.getId(), jpeg).m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24830o c24830o = new C24830o();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: iP2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43288jP2.m30680j0(Function1.this, obj);
            }
        };
        final C24831p c24831p = new C24831p(inspectionPoint);
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: RO2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43288jP2.m30679k0(Function1.this, obj);
            }
        });
    }

    /* renamed from: l0 */
    public final void m30678l0(byte[] jpeg, BirdInspectionPoint inspectionPoint) {
        Intrinsics.checkNotNullParameter(jpeg, "jpeg");
        Intrinsics.checkNotNullParameter(inspectionPoint, "inspectionPoint");
        FO2 fo2 = this.f92653e;
        String str = this.f92657i;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("id");
            str = null;
        }
        Object m33094as = fo2.mo93972I(str, inspectionPoint.getId(), jpeg).m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24832q c24832q = new C24832q();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: gP2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43288jP2.m30676n0(Function1.this, obj);
            }
        };
        final C24833r c24833r = new C24833r(inspectionPoint);
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: hP2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43288jP2.m30677m0(Function1.this, obj);
            }
        });
    }

    /* renamed from: o0 */
    public final void m30675o0(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        S74.C7343a.showProgress$default(this.f92651c, true, 0, 2, null);
        AbstractC23442F m33152N = AbstractC23442F.m33158H(bitmap).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "just(bitmap)\n      .obse…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24834s c24834s = new C24834s();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: fP2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43288jP2.m30674p0(Function1.this, obj);
            }
        });
    }

    @Override // p000.PO2
    public void onBackPressed() {
        AbstractC23442F m33152N = H31.C3014a.dialog$default(this.f92651c, OO2.f26459d, false, false, 6, null).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "ui.dialog(MechanicPhotoE…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24824j c24824j = new C24824j();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: dP2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43288jP2.m30686d0(Function1.this, obj);
            }
        });
    }

    @Override // p000.PO2
    public void onPause() {
        this.f92651c.mo23844M1();
    }

    @Override // p000.PO2
    public void onResume() {
        this.f92651c.mo23841Rh();
    }
}
