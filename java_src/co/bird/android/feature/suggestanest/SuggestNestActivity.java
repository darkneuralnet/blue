package co.bird.android.feature.suggestanest;

import android.app.Application;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import co.bird.android.buava.Optional;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.suggestanest.SuggestNestActivity;
import co.bird.android.feature.suggestanest.bottomsheet.SuggestNestBottomSheet;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.LinearRing;
import co.bird.android.model.PhotoBannerViewModel;
import co.bird.android.model.Point;
import co.bird.android.model.Polygon;
import co.bird.android.model.wire.WireArea;
import co.bird.android.model.wire.WireNestArea;
import co.bird.android.model.wire.WireNestSuggestionMessage;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import p000.C38500bM2;
import p000.C39011cD1;
import p000.C41318g46;
import p000.H31;
import p000.IL2;
import p000.InterfaceC42150hU5;
@Metadata(m28433d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u008a\u00012\u00020\u00012\u00020\u0002:\u0002\u008b\u0001B\t¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\"\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0017H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0016J\u0014\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u0017H\u0016J\u0014\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u0017H\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0017H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0016J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\rH\u0014J\b\u0010&\u001a\u00020\u0003H\u0014J\b\u0010'\u001a\u00020\u0003H\u0014J\b\u0010(\u001a\u00020\u0003H\u0014J\b\u0010)\u001a\u00020\u0003H\u0014J\b\u0010*\u001a\u00020\u0003H\u0014J\b\u0010+\u001a\u00020\u0003H\u0016R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001b\u0010S\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001c\u0010_\u001a\n \\*\u0004\u0018\u00010[0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010i\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010fR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\"\u0010r\u001a\u0010\u0012\f\u0012\n \\*\u0004\u0018\u00010o0o0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR.\u0010v\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020t \\*\n\u0012\u0004\u0012\u00020t\u0018\u00010s0s0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010qR.\u0010x\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020w \\*\n\u0012\u0004\u0012\u00020w\u0018\u00010s0s0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010qR\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n \\*\u0004\u0018\u00010\u00030\u00030n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010qR\"\u0010{\u001a\u0010\u0012\f\u0012\n \\*\u0004\u0018\u00010\u00190\u00190n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010qR.\u0010}\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001e \\*\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u001d0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010qR.\u0010\u007f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001e \\*\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u001d0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010qR$\u0010\u0081\u0001\u001a\u0010\u0012\f\u0012\n \\*\u0004\u0018\u00010\u00100\u00100n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010qR$\u0010\u0083\u0001\u001a\u0010\u0012\f\u0012\n \\*\u0004\u0018\u00010\u001e0\u001e0n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010qR\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u008c\u0001"}, m28432d2 = {"Lco/bird/android/feature/suggestanest/SuggestNestActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LNU5;", "", "y1", "l1", "LcD1;", "googleMap", "X0", "t1", "LOU5;", TransferTable.COLUMN_STATE, "F0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "M1", "Lio/reactivex/Observable;", "myLocationClicks", "Lcom/google/android/gms/maps/model/LatLng;", "C2", "F8", "f", "Lco/bird/android/buava/Optional;", "", "W0", "z", "h4", "W4", "b7", "outState", "onSaveInstanceState", "onStart", "onResume", "onPause", "onStop", "onDestroy", "onLowMemory", "LLU5;", "j", "LLU5;", "V0", "()LLU5;", "setPresenter", "(LLU5;)V", "presenter", "LiU5;", "k", "LiU5;", "R0", "()LiU5;", "setConverter", "(LiU5;)V", "converter", "LIL2;", "l", "LIL2;", "U0", "()LIL2;", "setMapStyler", "(LIL2;)V", "mapStyler", "Ll6;", "m", "Ll6;", "binding", "n", "LcD1;", "Landroid/os/HandlerThread;", "o", "Landroid/os/HandlerThread;", "asyncHandlerThread", "Landroid/os/Handler;", "p", "Lkotlin/Lazy;", "Q0", "()Landroid/os/Handler;", "asyncHandler", "q", "Landroid/os/Handler;", "mainHandler", "Ljava/util/concurrent/locks/ReentrantLock;", "r", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "s", "Ljava/util/concurrent/locks/Condition;", "condition", "LfM2;", "t", "LfM2;", "locationMarker", "Lxj0;", "u", "Lxj0;", "accuracyCircle", "v", "maxDistanceCircle", "LRU5;", "w", "LRU5;", "pinMarker", "Lma4;", "Landroid/location/Location;", "x", "Lma4;", "moveToRelay", "", "Lco/bird/android/model/wire/WireArea;", "y", "areaRelay", "Lco/bird/android/model/wire/WireNestArea;", "nestRelay", "A", "B", "pinLocationUpdates", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "nameChanges", "D", "noteChanges", "E", "capacityChanges", "F", "assetIdChanges", "Lg46$b;", "S0", "()Lg46$b;", "logger", "<init>", "()V", "G", C17296a.f69688o, "suggest-a-nest_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSuggestNestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestActivity.kt\nco/bird/android/feature/suggestanest/SuggestNestActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,474:1\n1#2:475\n199#3:476\n180#3:477\n180#3:478\n180#3:479\n368#4:480\n*S KotlinDebug\n*F\n+ 1 SuggestNestActivity.kt\nco/bird/android/feature/suggestanest/SuggestNestActivity\n*L\n247#1:476\n381#1:477\n400#1:478\n407#1:479\n348#1:480\n*E\n"})
/* loaded from: classes3.dex */
public final class SuggestNestActivity extends BaseActivityLite implements NU5 {

    /* renamed from: G */
    public static final C15764a f65632G = new C15764a(null);

    /* renamed from: A */
    public final C45168ma4<Unit> f65633A;

    /* renamed from: B */
    public final C45168ma4<LatLng> f65634B;

    /* renamed from: C */
    public final C45168ma4<Optional<String>> f65635C;

    /* renamed from: D */
    public final C45168ma4<Optional<String>> f65636D;

    /* renamed from: E */
    public final C45168ma4<Integer> f65637E;

    /* renamed from: F */
    public final C45168ma4<String> f65638F;

    /* renamed from: j */
    public LU5 f65639j;

    /* renamed from: k */
    public C42743iU5 f65640k;

    /* renamed from: l */
    public IL2 f65641l;

    /* renamed from: m */
    public C25598l6 f65642m;

    /* renamed from: n */
    public C39011cD1 f65643n;

    /* renamed from: o */
    public final HandlerThread f65644o;

    /* renamed from: p */
    public final Lazy f65645p;

    /* renamed from: q */
    public final Handler f65646q;

    /* renamed from: r */
    public final ReentrantLock f65647r;

    /* renamed from: s */
    public final Condition f65648s;

    /* renamed from: t */
    public C40889fM2 f65649t;

    /* renamed from: u */
    public C51775xj0 f65650u;

    /* renamed from: v */
    public C51775xj0 f65651v;

    /* renamed from: w */
    public RU5 f65652w;

    /* renamed from: x */
    public final C45168ma4<Location> f65653x;

    /* renamed from: y */
    public final C45168ma4<List<WireArea>> f65654y;

    /* renamed from: z */
    public final C45168ma4<List<WireNestArea>> f65655z;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/feature/suggestanest/SuggestNestActivity$a;", "", "", "AREA_BORDER_STROKE_THICKNESS_DP", "I", "", "DEFAULT_ZOOM_LEVEL", "F", "MEASURED_RELATIVE_PIN_BOTTOM", "<init>", "()V", "suggest-a-nest_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15764a {
        public /* synthetic */ C15764a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C15764a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15765b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC31934Bj6.values().length];
            try {
                iArr[EnumC31934Bj6.VALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC31934Bj6.INVALID_NOT_PERMITTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC31934Bj6.INVALID_OUTSIDE_CIRCLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$c */
    /* loaded from: classes3.dex */
    public static final class C15766c extends Lambda implements Function0<Handler> {
        public C15766c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(SuggestNestActivity.this.f65644o.getLooper());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", TransferTable.COLUMN_STATE, "", C17296a.f69688o, "(Ljava/lang/Integer;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$d */
    /* loaded from: classes3.dex */
    public static final class C15767d extends Lambda implements Function1<Integer, Boolean> {

        /* renamed from: g */
        public static final C15767d f65657g = new C15767d();

        public C15767d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Integer state) {
            boolean z;
            Intrinsics.checkNotNullParameter(state, "state");
            if (state.intValue() == 5) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$e */
    /* loaded from: classes3.dex */
    public static final class C15768e extends Lambda implements Function1<Integer, Unit> {

        /* renamed from: g */
        public static final C15768e f65658g = new C15768e();

        public C15768e() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireArea;", "areas", "Lcom/google/android/gms/maps/model/PolygonOptions;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSuggestNestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestActivity.kt\nco/bird/android/feature/suggestanest/SuggestNestActivity$initAreaRenderingPipeline$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,474:1\n1549#2:475\n1620#2,2:476\n1549#2:482\n1620#2,3:483\n1855#2:486\n1856#2:491\n1622#2:492\n11335#3:478\n11670#3,3:479\n11335#3:487\n11670#3,3:488\n*S KotlinDebug\n*F\n+ 1 SuggestNestActivity.kt\nco/bird/android/feature/suggestanest/SuggestNestActivity$initAreaRenderingPipeline$1\n*L\n364#1:475\n364#1:476,2\n373#1:482\n373#1:483,3\n374#1:486\n374#1:491\n364#1:492\n367#1:478\n367#1:479,3\n374#1:487\n374#1:488,3\n*E\n"})
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$f */
    /* loaded from: classes3.dex */
    public static final class C15769f extends Lambda implements Function1<List<? extends WireArea>, List<? extends PolygonOptions>> {
        public C15769f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<PolygonOptions> invoke(List<WireArea> areas) {
            int collectionSizeOrDefault;
            IntRange until;
            int collectionSizeOrDefault2;
            LatLng m61282b;
            LatLng m61282b2;
            Intrinsics.checkNotNullParameter(areas, "areas");
            List<WireArea> list = areas;
            SuggestNestActivity suggestNestActivity = SuggestNestActivity.this;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireArea wireArea : list) {
                PolygonOptions polygonOptions = new PolygonOptions();
                Point[] points = wireArea.getRegion().getRing(0).getPoints();
                Intrinsics.checkNotNullExpressionValue(points, "area.region.getRing(0).points");
                ArrayList arrayList2 = new ArrayList(points.length);
                for (Point point : points) {
                    Intrinsics.checkNotNullExpressionValue(point, "point");
                    m61282b2 = C39168cU5.m61282b(point);
                    arrayList2.add(m61282b2);
                }
                PolygonOptions m50631W0 = polygonOptions.m50626s(arrayList2).m50639E(NA0.m94301c(suggestNestActivity, C32364Df4.birdRed10)).m50634N0(NA0.m94301c(suggestNestActivity, C32364Df4.birdRed)).m50631W0(C49347td3.m12001b(1));
                until = RangesKt___RangesKt.until(1, wireArea.getRegion().numRings());
                Polygon region = wireArea.getRegion();
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
                ArrayList<LinearRing> arrayList3 = new ArrayList(collectionSizeOrDefault2);
                Iterator<Integer> it = until.iterator();
                while (it.hasNext()) {
                    arrayList3.add(region.getRing(((IntIterator) it).nextInt()));
                }
                for (LinearRing linearRing : arrayList3) {
                    Point[] points2 = linearRing.getPoints();
                    Intrinsics.checkNotNullExpressionValue(points2, "ring.points");
                    ArrayList arrayList4 = new ArrayList(points2.length);
                    for (Point point2 : points2) {
                        Intrinsics.checkNotNullExpressionValue(point2, "point");
                        m61282b = C39168cU5.m61282b(point2);
                        arrayList4.add(m61282b);
                    }
                    m50631W0.m50625u(arrayList4);
                }
                arrayList.add(m50631W0);
            }
            return arrayList;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15770g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C15770g f65660b = new C15770g();

        public C15770g() {
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

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "options", "", "Lcom/google/android/gms/maps/model/PolygonOptions;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSuggestNestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestActivity.kt\nco/bird/android/feature/suggestanest/SuggestNestActivity$initAreaRenderingPipeline$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,474:1\n1855#2,2:475\n*S KotlinDebug\n*F\n+ 1 SuggestNestActivity.kt\nco/bird/android/feature/suggestanest/SuggestNestActivity$initAreaRenderingPipeline$3\n*L\n382#1:475,2\n*E\n"})
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$h */
    /* loaded from: classes3.dex */
    public static final class C15771h extends Lambda implements Function1<List<? extends PolygonOptions>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C39011cD1 f65661g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15771h(C39011cD1 c39011cD1) {
            super(1);
            this.f65661g = c39011cD1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends PolygonOptions> list) {
            invoke2((List<PolygonOptions>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<PolygonOptions> options) {
            Intrinsics.checkNotNullExpressionValue(options, "options");
            C39011cD1 c39011cD1 = this.f65661g;
            for (PolygonOptions polygonOptions : options) {
                c39011cD1.m61684d(polygonOptions);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$i */
    /* loaded from: classes3.dex */
    public static final class C15772i extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C15772i f65662g = new C15772i();

        public C15772i() {
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

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireNestArea;", "nests", "Lcom/google/android/gms/maps/model/CircleOptions;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSuggestNestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestActivity.kt\nco/bird/android/feature/suggestanest/SuggestNestActivity$initAreaRenderingPipeline$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,474:1\n1549#2:475\n1620#2,3:476\n*S KotlinDebug\n*F\n+ 1 SuggestNestActivity.kt\nco/bird/android/feature/suggestanest/SuggestNestActivity$initAreaRenderingPipeline$5\n*L\n387#1:475\n387#1:476,3\n*E\n"})
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$j */
    /* loaded from: classes3.dex */
    public static final class C15773j extends Lambda implements Function1<List<? extends WireNestArea>, List<? extends CircleOptions>> {
        public C15773j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<CircleOptions> invoke(List<WireNestArea> nests) {
            int collectionSizeOrDefault;
            LatLng m61281c;
            Intrinsics.checkNotNullParameter(nests, "nests");
            List<WireNestArea> list = nests;
            SuggestNestActivity suggestNestActivity = SuggestNestActivity.this;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireNestArea wireNestArea : list) {
                CircleOptions circleOptions = new CircleOptions();
                m61281c = C39168cU5.m61281c(wireNestArea.getLocation());
                arrayList.add(circleOptions.m50693s(m61281c).m50695m0(wireNestArea.getRadius()).m50692u(NA0.m94301c(suggestNestActivity, C32364Df4.birdRed10)).m50694p0(NA0.m94301c(suggestNestActivity, C32364Df4.birdRed)).m50704D0(C49347td3.m12001b(1)));
            }
            return arrayList;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$k */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15774k extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C15774k f65664b = new C15774k();

        public C15774k() {
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

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "options", "", "Lcom/google/android/gms/maps/model/CircleOptions;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSuggestNestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestActivity.kt\nco/bird/android/feature/suggestanest/SuggestNestActivity$initAreaRenderingPipeline$7\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,474:1\n1855#2,2:475\n*S KotlinDebug\n*F\n+ 1 SuggestNestActivity.kt\nco/bird/android/feature/suggestanest/SuggestNestActivity$initAreaRenderingPipeline$7\n*L\n401#1:475,2\n*E\n"})
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$l */
    /* loaded from: classes3.dex */
    public static final class C15775l extends Lambda implements Function1<List<? extends CircleOptions>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C39011cD1 f65665g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15775l(C39011cD1 c39011cD1) {
            super(1);
            this.f65665g = c39011cD1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends CircleOptions> list) {
            invoke2((List<CircleOptions>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<CircleOptions> options) {
            Intrinsics.checkNotNullExpressionValue(options, "options");
            C39011cD1 c39011cD1 = this.f65665g;
            for (CircleOptions circleOptions : options) {
                c39011cD1.m61687a(circleOptions);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$m */
    /* loaded from: classes3.dex */
    public static final class C15776m extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C15776m f65666g = new C15776m();

        public C15776m() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "name", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$n */
    /* loaded from: classes3.dex */
    public static final class C15777n extends Lambda implements Function1<String, Unit> {
        public C15777n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            SuggestNestActivity.this.f65635C.accept(Optional.f63040c.m59033b(str));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "note", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$o */
    /* loaded from: classes3.dex */
    public static final class C15778o extends Lambda implements Function1<String, Unit> {
        public C15778o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            SuggestNestActivity.this.f65636D.accept(Optional.f63040c.m59033b(str));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$p */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15779p extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public C15779p(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m56573a(int i) {
            ((C45168ma4) this.receiver).accept(Integer.valueOf(i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            m56573a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/location/Location;", "location", "Lqc0;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/location/Location;)Lqc0;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$q */
    /* loaded from: classes3.dex */
    public static final class C15780q extends Lambda implements Function1<Location, C47556qc0> {

        /* renamed from: g */
        public static final C15780q f65669g = new C15780q();

        public C15780q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C47556qc0 invoke(Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            return C48149rc0.m15705e(C39339cm2.m60885d(location), 17.5f);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lqc0;", "kotlin.jvm.PlatformType", "cameraUpdate", "", C17296a.f69688o, "(Lqc0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$r */
    /* loaded from: classes3.dex */
    public static final class C15781r extends Lambda implements Function1<C47556qc0, Unit> {
        public C15781r() {
            super(1);
        }

        /* renamed from: a */
        public final void m56571a(C47556qc0 c47556qc0) {
            LatLng latLng;
            CameraPosition m61679i;
            C39011cD1 c39011cD1 = SuggestNestActivity.this.f65643n;
            if (c39011cD1 != null && (m61679i = c39011cD1.m61679i()) != null) {
                latLng = m61679i.f71394b;
            } else {
                latLng = null;
            }
            if (Intrinsics.areEqual(latLng, new LatLng(0.0d, 0.0d))) {
                C39011cD1 c39011cD12 = SuggestNestActivity.this.f65643n;
                if (c39011cD12 != null) {
                    c39011cD12.m61675m(c47556qc0);
                    return;
                }
                return;
            }
            C39011cD1 c39011cD13 = SuggestNestActivity.this.f65643n;
            if (c39011cD13 != null) {
                c39011cD13.m61682f(c47556qc0);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C47556qc0 c47556qc0) {
            m56571a(c47556qc0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$s */
    /* loaded from: classes3.dex */
    public static final class C15782s extends Lambda implements Function1<View, Unit> {
        public C15782s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            SuggestNestActivity.this.f65633A.accept(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$t */
    /* loaded from: classes3.dex */
    public static final class C15783t extends Lambda implements Function1<DialogResponse, Unit> {
        public C15783t() {
            super(1);
        }

        /* renamed from: a */
        public final void m56570a(DialogResponse dialogResponse) {
            SuggestNestActivity.this.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m56570a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.suggestanest.SuggestNestActivity$u */
    /* loaded from: classes3.dex */
    public static final class C15784u extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C15784u f65673g = new C15784u();

        public C15784u() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    public SuggestNestActivity() {
        Lazy lazy;
        HandlerThread handlerThread = new HandlerThread("async");
        this.f65644o = handlerThread;
        handlerThread.start();
        lazy = LazyKt__LazyJVMKt.lazy(new C15766c());
        this.f65645p = lazy;
        this.f65646q = new Handler(Looper.getMainLooper());
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f65647r = reentrantLock;
        this.f65648s = reentrantLock.newCondition();
        C45168ma4<Location> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Location>()");
        this.f65653x = m25409g;
        C45168ma4<List<WireArea>> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<List<WireArea>>()");
        this.f65654y = m25409g2;
        C45168ma4<List<WireNestArea>> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<List<WireNestArea>>()");
        this.f65655z = m25409g3;
        C45168ma4<Unit> m25409g4 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g4, "create<Unit>()");
        this.f65633A = m25409g4;
        C45168ma4<LatLng> m25409g5 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g5, "create<LatLng>()");
        this.f65634B = m25409g5;
        C45168ma4<Optional<String>> m25409g6 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g6, "create<Optional<String>>()");
        this.f65635C = m25409g6;
        C45168ma4<Optional<String>> m25409g7 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g7, "create<Optional<String>>()");
        this.f65636D = m25409g7;
        C45168ma4<Integer> m25409g8 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g8, "create<Int>()");
        this.f65637E = m25409g8;
        C45168ma4<String> m25409g9 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g9, "create<String>()");
        this.f65638F = m25409g9;
    }

    /* renamed from: B1 */
    public static final void m56647B1(final SuggestNestActivity this$0, final C39011cD1 googleMap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(googleMap, "googleMap");
        this$0.f65643n = googleMap;
        IL2.C3513a.onMapReady$default(this$0.m56620U0(), googleMap, null, 2, null);
        this$0.m56615X0(googleMap);
        this$0.f65652w = new RU5(googleMap.m61685c(new MarkerOptions().m50643u1(googleMap.m61679i().f71394b).m50657N0(C40788fB0.icon$default(this$0, C44042kg4.ic_suggestion_pin_valid, null, null, 6, null)).m50644u(0.5f, 0.87f).m50655R1(false).m50651Y1(101.0f)));
        googleMap.m61667u(new C39011cD1.InterfaceC13463e() { // from class: FT5
            @Override // p000.C39011cD1.InterfaceC13463e
            /* renamed from: a */
            public final void mo61659a() {
                SuggestNestActivity.m56645C1(SuggestNestActivity.this, googleMap);
            }
        });
        googleMap.m61666v(new C39011cD1.InterfaceC13464f() { // from class: GT5
            @Override // p000.C39011cD1.InterfaceC13464f
            /* renamed from: a */
            public final void mo61658a(int i) {
                SuggestNestActivity.m56643D1(SuggestNestActivity.this, i);
            }
        });
        googleMap.m61669s(new C39011cD1.InterfaceC13461c() { // from class: HT5
            @Override // p000.C39011cD1.InterfaceC13461c
            /* renamed from: a */
            public final void mo61661a() {
                SuggestNestActivity.m56640F1(SuggestNestActivity.this, googleMap);
            }
        });
        ReentrantLock reentrantLock = this$0.f65647r;
        reentrantLock.lock();
        try {
            this$0.f65648s.signalAll();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            Looper looper = this$0.f65644o.getLooper();
            if (looper != null) {
                looper.quitSafely();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: C1 */
    public static final void m56645C1(SuggestNestActivity this$0, C39011cD1 googleMap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(googleMap, "$googleMap");
        if (this$0.m56619V0().m42277k().m92176o() != null) {
            return;
        }
        this$0.f65634B.accept(googleMap.m61679i().f71394b);
        C25598l6 c25598l6 = this$0.f65642m;
        if (c25598l6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        }
        ImageView imageView = c25598l6.f95485l;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.suggestionPin");
        C49520tu6.show$default(imageView, true, 0, 2, null);
        RU5 ru5 = this$0.f65652w;
        if (ru5 != null) {
            ru5.m86695c(Boolean.FALSE);
        }
    }

    /* renamed from: D1 */
    public static final void m56643D1(SuggestNestActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.m56619V0().m42277k().m92176o() != null) {
            return;
        }
        C25598l6 c25598l6 = this$0.f65642m;
        if (c25598l6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        }
        ImageView imageView = c25598l6.f95485l;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.suggestionPin");
        C49520tu6.show$default(imageView, true, 0, 2, null);
        RU5 ru5 = this$0.f65652w;
        if (ru5 != null) {
            ru5.m86695c(Boolean.FALSE);
        }
    }

    /* renamed from: F1 */
    public static final void m56640F1(final SuggestNestActivity this$0, C39011cD1 googleMap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(googleMap, "$googleMap");
        if (this$0.m56619V0().m42277k().m92176o() != null) {
            return;
        }
        this$0.f65634B.accept(googleMap.m61679i().f71394b);
        RU5 ru5 = this$0.f65652w;
        if (ru5 != null) {
            ru5.m86696b(googleMap.m61679i().f71394b);
        }
        RU5 ru52 = this$0.f65652w;
        if (ru52 != null) {
            ru52.m86695c(Boolean.TRUE);
        }
        this$0.f65646q.postDelayed(new Runnable() { // from class: KT5
            @Override // java.lang.Runnable
            public final void run() {
                SuggestNestActivity.m56638I1(SuggestNestActivity.this);
            }
        }, 50L);
    }

    /* renamed from: I1 */
    public static final void m56638I1(SuggestNestActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C25598l6 c25598l6 = this$0.f65642m;
        if (c25598l6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        }
        ImageView imageView = c25598l6.f95485l;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.suggestionPin");
        C49520tu6.show$default(imageView, false, 0, 2, null);
    }

    /* renamed from: J1 */
    public static final void m56637J1(SuggestNestActivity this$0, C38500bM2.EnumC12375a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        C41318g46.AbstractC20723b m56622S0 = this$0.m56622S0();
        String name = it.name();
        m56622S0.mo7228a("initialized maps with renderer: " + name, new Object[0]);
    }

    /* renamed from: K0 */
    public static final void m56636K0(final SuggestNestActivity this$0, final OU5 state) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(state, "$state");
        ReentrantLock reentrantLock = this$0.f65647r;
        reentrantLock.lock();
        while (this$0.f65643n == null) {
            try {
                this$0.f65648s.await();
            } finally {
                reentrantLock.unlock();
            }
        }
        this$0.f65646q.post(new Runnable() { // from class: JT5
            @Override // java.lang.Runnable
            public final void run() {
                SuggestNestActivity.m56635L0(SuggestNestActivity.this, state);
            }
        });
        Unit unit = Unit.INSTANCE;
    }

    /* renamed from: L0 */
    public static final void m56635L0(SuggestNestActivity this$0, OU5 state) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(state, "$state");
        this$0.render(state);
    }

    /* renamed from: L1 */
    public static final void m56634L1(SuggestNestActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C25598l6 c25598l6 = this$0.f65642m;
        C25598l6 c25598l62 = null;
        if (c25598l6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        }
        ImageView imageView = c25598l6.f95485l;
        C25598l6 c25598l63 = this$0.f65642m;
        if (c25598l63 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c25598l62 = c25598l63;
        }
        imageView.setTranslationY(c25598l62.f95485l.getMeasuredHeight() * (-0.37f));
    }

    /* renamed from: M0 */
    public static final boolean m56633M0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: N0 */
    public static final Unit m56631N0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: N1 */
    public static final void m56630N1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O1 */
    public static final void m56629O1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y0 */
    public static final List m56613Y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: Z0 */
    public static final void m56611Z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a1 */
    public static final void m56610a1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f1 */
    public static final void m56604f1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h1 */
    public static final List m56602h1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: i1 */
    public static final void m56599i1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j1 */
    public static final void m56597j1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k1 */
    public static final void m56595k1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n1 */
    public static final void m56591n1(SuggestNestActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C25598l6 c25598l6 = this$0.f65642m;
        C25598l6 c25598l62 = null;
        if (c25598l6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        }
        BottomSheetBehavior m50133G = BottomSheetBehavior.m50133G(c25598l6.f95476c);
        Intrinsics.checkNotNullExpressionValue(m50133G, "from(binding.bottomSheet)");
        m50133G.m50082p0(5);
        C25598l6 c25598l63 = this$0.f65642m;
        if (c25598l63 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c25598l62 = c25598l63;
        }
        c25598l62.f95476c.setPeekHeight(0);
    }

    /* renamed from: o1 */
    public static final void m56589o1(SuggestNestActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C25598l6 c25598l6 = this$0.f65642m;
        C25598l6 c25598l62 = null;
        if (c25598l6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        }
        BottomSheetBehavior<View> m59057u = c25598l6.f95476c.m59057u();
        if (m59057u != null) {
            C25598l6 c25598l63 = this$0.f65642m;
            if (c25598l63 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c25598l63 = null;
            }
            int height = c25598l63.getRoot().getHeight();
            C25598l6 c25598l64 = this$0.f65642m;
            if (c25598l64 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c25598l64 = null;
            }
            int measuredHeight = height - c25598l64.f95476c.getMeasuredHeight();
            C25598l6 c25598l65 = this$0.f65642m;
            if (c25598l65 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c25598l62 = c25598l65;
            }
            m59057u.m50106d0(measuredHeight - c25598l62.f95477d.getMeasuredHeight());
        }
    }

    /* renamed from: r1 */
    public static final void m56586r1(final SuggestNestActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C25598l6 c25598l6 = this$0.f65642m;
        if (c25598l6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        }
        c25598l6.f95477d.post(new Runnable() { // from class: IT5
            @Override // java.lang.Runnable
            public final void run() {
                SuggestNestActivity.m56585s1(SuggestNestActivity.this);
            }
        });
    }

    /* renamed from: s1 */
    public static final void m56585s1(SuggestNestActivity this$0) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C25598l6 c25598l6 = this$0.f65642m;
        C25598l6 c25598l62 = null;
        if (c25598l6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        }
        int measuredHeight = c25598l6.f95477d.getMeasuredHeight();
        C25598l6 c25598l63 = this$0.f65642m;
        if (c25598l63 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l63 = null;
        }
        SuggestNestBottomSheet suggestNestBottomSheet = c25598l63.f95476c;
        Intrinsics.checkNotNullExpressionValue(suggestNestBottomSheet, "binding.bottomSheet");
        ViewGroup.LayoutParams layoutParams = suggestNestBottomSheet.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i = marginLayoutParams.bottomMargin;
        } else {
            i = 0;
        }
        if (i == measuredHeight) {
            return;
        }
        C25598l6 c25598l64 = this$0.f65642m;
        if (c25598l64 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l64 = null;
        }
        ViewGroup.LayoutParams layoutParams2 = c25598l64.f95476c.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.C11529e c11529e = (CoordinatorLayout.C11529e) layoutParams2;
        ((ViewGroup.MarginLayoutParams) c11529e).bottomMargin = measuredHeight;
        C25598l6 c25598l65 = this$0.f65642m;
        if (c25598l65 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c25598l62 = c25598l65;
        }
        c25598l62.f95476c.setLayoutParams(c11529e);
    }

    /* renamed from: u1 */
    public static final C47556qc0 m56582u1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C47556qc0) tmp0.invoke(obj);
    }

    /* renamed from: x1 */
    public static final void m56579x1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.NU5
    /* renamed from: C2 */
    public Observable<LatLng> mo56644C2() {
        Observable<LatLng> hide = this.f65634B.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "pinLocationUpdates.hide()");
        return hide;
    }

    /* renamed from: F0 */
    public final void m56641F0(final OU5 ou5) {
        m56626Q0().post(new Runnable() { // from class: bU5
            @Override // java.lang.Runnable
            public final void run() {
                SuggestNestActivity.m56636K0(SuggestNestActivity.this, ou5);
            }
        });
    }

    @Override // p000.NU5
    /* renamed from: F8 */
    public Observable<Unit> mo56639F8() {
        C25598l6 c25598l6 = this.f65642m;
        if (c25598l6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        }
        Button button = c25598l6.f95484k;
        Intrinsics.checkNotNullExpressionValue(button, "binding.suggestNest");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: M1 */
    public void render(OU5 state) {
        boolean z;
        boolean m61283a;
        boolean m61283a2;
        int i;
        String str;
        boolean z2;
        int i2;
        boolean z3;
        C25598l6 c25598l6;
        C25598l6 c25598l62;
        boolean m61283a3;
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f65643n == null) {
            m56641F0(state);
        }
        C25598l6 c25598l63 = this.f65642m;
        if (c25598l63 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l63 = null;
        }
        LinearProgressIndicator linearProgressIndicator = c25598l63.f95482i;
        Intrinsics.checkNotNullExpressionValue(linearProgressIndicator, "binding.progressBar");
        int i3 = 1;
        if (state.m92178m() > 0) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(linearProgressIndicator, z, 0, 2, null);
        this.f65654y.accept(state.m92187d());
        this.f65655z.accept(state.m92180k());
        Location m92182i = state.m92182i();
        if (m92182i != null) {
            this.f65653x.accept(m92182i);
        }
        Location m92174q = state.m92174q();
        if (m92174q != null) {
            LatLng m60885d = C39339cm2.m60885d(m92174q);
            C40889fM2 c40889fM2 = this.f65649t;
            if (c40889fM2 == null) {
                C39011cD1 c39011cD1 = this.f65643n;
                if (c39011cD1 != null) {
                    c40889fM2 = c39011cD1.m61685c(new MarkerOptions().m50643u1(m60885d).m50657N0(C40788fB0.icon$default(this, C48193rg4.ic_user_location_v2, null, null, 6, null)).m50644u(0.5f, 0.5f).m50651Y1(100.0f).m50664E(true));
                } else {
                    c40889fM2 = null;
                }
                this.f65649t = c40889fM2;
            }
            if (c40889fM2 != null) {
                c40889fM2.m41521m(m60885d);
            }
            C51775xj0 c51775xj0 = this.f65650u;
            if (c51775xj0 == null) {
                C39011cD1 c39011cD12 = this.f65643n;
                if (c39011cD12 != null) {
                    c51775xj0 = c39011cD12.m61687a(new CircleOptions().m50693s(m60885d).m50695m0(m92174q.getAccuracy()).m50692u(NA0.m94301c(this, C32364Df4.birdESBlue10)).m50704D0(0.0f).m50702E0(100.0f));
                } else {
                    c51775xj0 = null;
                }
                this.f65650u = c51775xj0;
            }
            if (c51775xj0 != null) {
                c51775xj0.m4797a(m60885d);
            }
            if (c51775xj0 != null) {
                c51775xj0.m4796b(m92174q.getAccuracy());
            }
        }
        Float m92175p = state.m92175p();
        if (m92175p != null) {
            float floatValue = m92175p.floatValue();
            C40889fM2 c40889fM22 = this.f65649t;
            if (c40889fM22 != null) {
                c40889fM22.m41520n(floatValue);
            }
        }
        if (state.m92184g() > 0.0d && state.m92174q() != null) {
            C51775xj0 c51775xj02 = this.f65651v;
            if (c51775xj02 == null) {
                C39011cD1 c39011cD13 = this.f65643n;
                if (c39011cD13 != null) {
                    c51775xj02 = c39011cD13.m61687a(new CircleOptions().m50693s(C39339cm2.m60885d(state.m92174q())).m50695m0(state.m92184g()).m50692u(NA0.m94301c(this, C32364Df4.birdESBlue10)).m50694p0(NA0.m94301c(this, C32364Df4.birdESBlue)).m50704D0(C49347td3.m12001b(1)));
                } else {
                    c51775xj02 = null;
                }
                this.f65651v = c51775xj02;
            }
            if (c51775xj02 != null) {
                c51775xj02.m4797a(C39339cm2.m60885d(state.m92174q()));
            }
            if (c51775xj02 != null) {
                c51775xj02.m4796b(state.m92184g());
            }
        }
        RU5 ru5 = this.f65652w;
        if (ru5 != null) {
            m61283a3 = C39168cU5.m61283a(state.m92186e());
            ru5.m86697a(m61283a3, this);
        }
        C25598l6 c25598l64 = this.f65642m;
        if (c25598l64 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l64 = null;
        }
        ImageView imageView = c25598l64.f95485l;
        m61283a = C39168cU5.m61283a(state.m92186e());
        imageView.setEnabled(m61283a);
        C25598l6 c25598l65 = this.f65642m;
        if (c25598l65 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l65 = null;
        }
        Button button = c25598l65.f95484k;
        m61283a2 = C39168cU5.m61283a(state.m92186e());
        button.setEnabled(m61283a2);
        C25598l6 c25598l66 = this.f65642m;
        if (c25598l66 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l66 = null;
        }
        TextView textView = c25598l66.f95486m;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.validityMessage");
        EnumC31934Bj6 m92186e = state.m92186e();
        if (m92186e == null) {
            i = -1;
        } else {
            i = C15765b.$EnumSwitchMapping$0[m92186e.ordinal()];
        }
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str = getString(C45871nl4.suggest_nest_location_invalid_not_in_circle);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    str = getString(C45871nl4.suggest_nest_location_invalid_not_permitted);
                }
            } else {
                str = getString(C45871nl4.suggest_nest_location_valid);
            }
        } else {
            str = null;
        }
        C49520tu6.setTextAndVisibility$default(textView, str, 0, 2, null);
        C25598l6 c25598l67 = this.f65642m;
        if (c25598l67 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l67 = null;
        }
        Button button2 = c25598l67.f95484k;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.suggestNest");
        if (state.m92176o() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C49520tu6.show$default(button2, z2, 0, 2, null);
        C25598l6 c25598l68 = this.f65642m;
        if (c25598l68 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l68 = null;
        }
        Group group = c25598l68.f95483j;
        Intrinsics.checkNotNullExpressionValue(group, "binding.secondaryButtons");
        if (state.m92176o() != null) {
            z3 = true;
            i2 = 0;
        } else {
            i2 = 0;
            z3 = false;
        }
        C49520tu6.show$default(group, z3, i2, 2, null);
        if (state.m92189b() != null) {
            C42743iU5 m56624R0 = m56624R0();
            String m92189b = state.m92189b();
            String m92181j = state.m92181j();
            String m92179l = state.m92179l();
            Integer m92177n = state.m92177n();
            if (m92177n != null) {
                i3 = m92177n.intValue();
            }
            List<C3023H6> m33861a = m56624R0.m33861a(m92189b, m92181j, m92179l, i3, state.m92185f());
            C25598l6 c25598l69 = this.f65642m;
            if (c25598l69 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c25598l69 = null;
            }
            c25598l69.f95476c.m59056v().m6670c(m33861a);
            C25598l6 c25598l610 = this.f65642m;
            if (c25598l610 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c25598l610 = null;
            }
            if (c25598l610.f95476c.m59098C()) {
                C25598l6 c25598l611 = this.f65642m;
                if (c25598l611 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c25598l62 = null;
                } else {
                    c25598l62 = c25598l611;
                }
                c25598l62.f95476c.m59079W();
            }
        } else {
            C25598l6 c25598l612 = this.f65642m;
            if (c25598l612 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c25598l6 = null;
            } else {
                c25598l6 = c25598l612;
            }
            c25598l6.f95476c.m59081U();
        }
        WireNestSuggestionMessage m92183h = state.m92183h();
        if (m92183h != null) {
            AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(m58990F(), new C45533nB1(m92183h.getTitle(), m92183h.getBody(), FY3.CONFIRM), false, false, 6, null);
            if (birdDialog$default != null) {
                Object m33135e = birdDialog$default.m33135e(AutoDispose.m45239a(this));
                Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
                SingleSubscribeProxy singleSubscribeProxy = (SingleSubscribeProxy) m33135e;
                if (singleSubscribeProxy != null) {
                    final C15783t c15783t = new C15783t();
                    InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: BT5
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            SuggestNestActivity.m56630N1(Function1.this, obj);
                        }
                    };
                    final C15784u c15784u = C15784u.f65673g;
                    singleSubscribeProxy.subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: MT5
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            SuggestNestActivity.m56629O1(Function1.this, obj);
                        }
                    });
                }
            }
        }
        Throwable m92188c = state.m92188c();
        if (m92188c != null) {
            C38689bg5.m64178c(m58990F(), m92188c);
        }
    }

    /* renamed from: Q0 */
    public final Handler m56626Q0() {
        return (Handler) this.f65645p.getValue();
    }

    /* renamed from: R0 */
    public final C42743iU5 m56624R0() {
        C42743iU5 c42743iU5 = this.f65640k;
        if (c42743iU5 != null) {
            return c42743iU5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("converter");
        return null;
    }

    /* renamed from: S0 */
    public final C41318g46.AbstractC20723b m56622S0() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("Suggest Nest");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"Suggest Nest\")");
        return m40153k;
    }

    /* renamed from: U0 */
    public final IL2 m56620U0() {
        IL2 il2 = this.f65641l;
        if (il2 != null) {
            return il2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mapStyler");
        return null;
    }

    /* renamed from: V0 */
    public final LU5 m56619V0() {
        LU5 lu5 = this.f65639j;
        if (lu5 != null) {
            return lu5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.NU5
    /* renamed from: W0 */
    public Observable<Optional<String>> mo56618W0() {
        Observable<Optional<String>> hide = this.f65635C.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "nameChanges.hide()");
        return hide;
    }

    @Override // p000.NU5
    /* renamed from: W4 */
    public Observable<String> mo56617W4() {
        Observable<String> hide = this.f65638F.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "assetIdChanges.hide()");
        return hide;
    }

    /* renamed from: X0 */
    public final void m56615X0(C39011cD1 c39011cD1) {
        Observable<List<WireArea>> observeOn = this.f65654y.distinctUntilChanged().observeOn(C24542a.m31934a());
        final C15769f c15769f = new C15769f();
        Observable<R> map = observeOn.map(new InterfaceC23492o() { // from class: LT5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m56613Y0;
                m56613Y0 = SuggestNestActivity.m56613Y0(Function1.this, obj);
                return m56613Y0;
            }
        });
        final C15770g c15770g = C15770g.f65660b;
        Observable observeOn2 = map.doOnError(new InterfaceC23484g() { // from class: NT5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SuggestNestActivity.m56611Z0(Function1.this, obj);
            }
        }).retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "private fun initAreaRend… { e -> Timber.e(e) }\n  }");
        Object m33094as = observeOn2.m33094as(AutoDispose.m45239a(this));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15771h c15771h = new C15771h(c39011cD1);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: OT5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SuggestNestActivity.m56610a1(Function1.this, obj);
            }
        };
        final C15772i c15772i = C15772i.f65662g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: PT5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SuggestNestActivity.m56604f1(Function1.this, obj);
            }
        });
        Observable<List<WireNestArea>> observeOn3 = this.f65655z.distinctUntilChanged().observeOn(C24542a.m31934a());
        final C15773j c15773j = new C15773j();
        Observable<R> map2 = observeOn3.map(new InterfaceC23492o() { // from class: QT5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m56602h1;
                m56602h1 = SuggestNestActivity.m56602h1(Function1.this, obj);
                return m56602h1;
            }
        });
        final C15774k c15774k = C15774k.f65664b;
        Observable observeOn4 = map2.doOnError(new InterfaceC23484g() { // from class: RT5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SuggestNestActivity.m56599i1(Function1.this, obj);
            }
        }).retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "private fun initAreaRend… { e -> Timber.e(e) }\n  }");
        Object m33094as2 = observeOn4.m33094as(AutoDispose.m45239a(this));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15775l c15775l = new C15775l(c39011cD1);
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: ST5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SuggestNestActivity.m56597j1(Function1.this, obj);
            }
        };
        final C15776m c15776m = C15776m.f65666g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: TT5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SuggestNestActivity.m56595k1(Function1.this, obj);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r1 != null) goto L19;
     */
    @Override // p000.NU5
    /* renamed from: b7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Observable<Unit> mo56608b7() {
        Observable empty;
        Observable<Integer> m13408g;
        Observable<Integer> startWith;
        Observable<Integer> distinctUntilChanged;
        C25598l6 c25598l6 = this.f65642m;
        C25598l6 c25598l62 = null;
        if (c25598l6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        }
        Button button = c25598l6.f95475b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.back");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        C25598l6 c25598l63 = this.f65642m;
        if (c25598l63 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c25598l62 = c25598l63;
        }
        BottomSheetBehavior<View> m59057u = c25598l62.f95476c.m59057u();
        if (m59057u != null && (m13408g = C48927su6.m13408g(m59057u)) != null && (startWith = m13408g.startWith((Observable<Integer>) 5)) != null && (distinctUntilChanged = startWith.distinctUntilChanged()) != null) {
            final C15767d c15767d = C15767d.f65657g;
            Observable<Integer> filter = distinctUntilChanged.filter(new InterfaceC23494q() { // from class: WT5
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m56633M0;
                    m56633M0 = SuggestNestActivity.m56633M0(Function1.this, obj);
                    return m56633M0;
                }
            });
            if (filter != null) {
                final C15768e c15768e = C15768e.f65658g;
                empty = filter.map(new InterfaceC23492o() { // from class: XT5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Unit m56631N0;
                        m56631N0 = SuggestNestActivity.m56631N0(Function1.this, obj);
                        return m56631N0;
                    }
                });
            }
        }
        empty = Observable.empty();
        Observable<Unit> merge = Observable.merge(clicksThrottle$default, empty);
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n    binding.back.…?: Observable.empty()\n  )");
        return merge;
    }

    @Override // p000.NU5
    /* renamed from: f */
    public Observable<Unit> mo56606f() {
        C25598l6 c25598l6 = this.f65642m;
        if (c25598l6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        }
        Button button = c25598l6.f95478e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.confirm");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.NU5
    /* renamed from: h4 */
    public Observable<Integer> mo56601h4() {
        Observable<Integer> hide = this.f65637E.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "capacityChanges.hide()");
        return hide;
    }

    /* renamed from: l1 */
    public final void m56594l1() {
        C25598l6 c25598l6 = this.f65642m;
        C25598l6 c25598l62 = null;
        if (c25598l6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        }
        c25598l6.f95476c.post(new Runnable() { // from class: CT5
            @Override // java.lang.Runnable
            public final void run() {
                SuggestNestActivity.m56591n1(SuggestNestActivity.this);
            }
        });
        C25598l6 c25598l63 = this.f65642m;
        if (c25598l63 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l63 = null;
        }
        c25598l63.f95476c.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: DT5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                SuggestNestActivity.m56589o1(SuggestNestActivity.this);
            }
        });
        C25598l6 c25598l64 = this.f65642m;
        if (c25598l64 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l64 = null;
        }
        c25598l64.f95477d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ET5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                SuggestNestActivity.m56586r1(SuggestNestActivity.this);
            }
        });
        C25598l6 c25598l65 = this.f65642m;
        if (c25598l65 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l65 = null;
        }
        c25598l65.f95476c.setOnNameUpdated(new C15777n());
        C25598l6 c25598l66 = this.f65642m;
        if (c25598l66 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l66 = null;
        }
        c25598l66.f95476c.setOnNoteUpdated(new C15778o());
        C25598l6 c25598l67 = this.f65642m;
        if (c25598l67 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c25598l62 = c25598l67;
        }
        c25598l62.f95476c.setOnCapacityUpdated(new C15779p(this.f65637E));
    }

    @Override // p000.NU5
    public Observable<Unit> myLocationClicks() {
        Observable<Unit> hide = this.f65633A.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "myLocationClicks.hide()");
        return hide;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 10079 && i2 == -1 && intent != null && (stringExtra = intent.getStringExtra("asset_id")) != null) {
            this.f65638F.accept(stringExtra);
        }
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        C25598l6 c25598l6;
        super.onCreate(bundle);
        C25598l6 m27871c = C25598l6.m27871c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m27871c, "inflate(layoutInflater)");
        this.f65642m = m27871c;
        if (m27871c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m27871c = null;
        }
        setContentView(m27871c.getRoot());
        InterfaceC42150hU5.InterfaceC22666a m86768a = RQ0.m86768a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m86768a.mo36356a(c46172oG2.m21419a(application), new PhotoBannerViewModel(null, null, null, null, Integer.valueOf(C45871nl4.suggest_nest_photo_title), Integer.valueOf(C45871nl4.suggest_nest_photo_body), null, null, null, 463, null)).mo36357a(this);
        C38500bM2.m64631b(this, C38500bM2.EnumC12375a.LATEST, new InterfaceC36584Vg3() { // from class: UT5
            @Override // p000.InterfaceC36584Vg3
            /* renamed from: a */
            public final void mo11201a(C38500bM2.EnumC12375a enumC12375a) {
                SuggestNestActivity.m56637J1(SuggestNestActivity.this, enumC12375a);
            }
        });
        C25598l6 c25598l62 = this.f65642m;
        if (c25598l62 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l62 = null;
        }
        c25598l62.f95479f.m50725b(bundle);
        m56578y1();
        m56594l1();
        m56583t1();
        C25598l6 c25598l63 = this.f65642m;
        if (c25598l63 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l63 = null;
        }
        ImageView imageView = c25598l63.f95481h;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.myLocation");
        C34585Ms2.m94661j(imageView, new C15782s());
        C25598l6 c25598l64 = this.f65642m;
        if (c25598l64 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        } else {
            c25598l6 = c25598l64;
        }
        c25598l6.f95485l.post(new Runnable() { // from class: VT5
            @Override // java.lang.Runnable
            public final void run() {
                SuggestNestActivity.m56634L1(SuggestNestActivity.this);
            }
        });
        m56619V0().consume(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        C25598l6 c25598l6 = this.f65642m;
        if (c25598l6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        }
        c25598l6.f95479f.m50724c();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        C25598l6 c25598l6 = this.f65642m;
        if (c25598l6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        }
        c25598l6.f95479f.m50723d();
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        C25598l6 c25598l6 = this.f65642m;
        if (c25598l6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        }
        c25598l6.f95479f.m50722e();
        super.onPause();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        C25598l6 c25598l6 = this.f65642m;
        if (c25598l6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        }
        c25598l6.f95479f.m50721f();
        super.onResume();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        C25598l6 c25598l6 = this.f65642m;
        if (c25598l6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        }
        c25598l6.f95479f.m50720g(outState);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        C25598l6 c25598l6 = this.f65642m;
        if (c25598l6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        }
        c25598l6.f95479f.m50719h();
        super.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        C25598l6 c25598l6 = this.f65642m;
        if (c25598l6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        }
        c25598l6.f95479f.m50718i();
        super.onStop();
    }

    /* renamed from: t1 */
    public final void m56583t1() {
        C45168ma4<Location> c45168ma4 = this.f65653x;
        final C15780q c15780q = C15780q.f65669g;
        Observable<R> map = c45168ma4.map(new InterfaceC23492o() { // from class: ZT5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C47556qc0 m56582u1;
                m56582u1 = SuggestNestActivity.m56582u1(Function1.this, obj);
                return m56582u1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "moveToRelay\n      .map {…(), DEFAULT_ZOOM_LEVEL) }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(this));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15781r c15781r = new C15781r();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: aU5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SuggestNestActivity.m56579x1(Function1.this, obj);
            }
        });
    }

    /* renamed from: y1 */
    public final void m56578y1() {
        C25598l6 c25598l6 = this.f65642m;
        if (c25598l6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25598l6 = null;
        }
        c25598l6.f95479f.m50726a(new InterfaceC36350Ug3() { // from class: YT5
            @Override // p000.InterfaceC36350Ug3
            public final void onMapReady(C39011cD1 c39011cD1) {
                SuggestNestActivity.m56647B1(SuggestNestActivity.this, c39011cD1);
            }
        });
    }

    @Override // p000.NU5
    /* renamed from: z */
    public Observable<Optional<String>> mo56577z() {
        Observable<Optional<String>> hide = this.f65636D.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "noteChanges.hide()");
        return hide;
    }
}
