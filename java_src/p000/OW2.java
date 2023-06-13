package p000;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.VehicleClass;
import co.bird.android.model.ridertutorial.TutorialKind;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u001c"}, m28432d2 = {"LOW2;", "LxE;", "LKW2;", "", "LGk6;", "vehicles", "", "m1", "Lio/reactivex/Observable;", "Lco/bird/android/model/ridertutorial/TutorialKind;", "N4", "Lio/reactivex/subjects/d;", "Lco/bird/android/model/VehicleClass;", "kotlin.jvm.PlatformType", "b", "Lio/reactivex/subjects/d;", "classSubject", "Landroid/view/View;", "c", "Landroid/view/View;", "moped", DateTokenConverter.CONVERTER_KEY, "scooter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "contentView", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultiModalRiderTutorialSelectionUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiModalRiderTutorialSelectionUi.kt\nco/bird/android/app/feature/ridertutorial/ui/MultiModalRiderTutorialSelectionUiImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,67:1\n180#2:68\n180#2:69\n*S KotlinDebug\n*F\n+ 1 MultiModalRiderTutorialSelectionUi.kt\nco/bird/android/app/feature/ridertutorial/ui/MultiModalRiderTutorialSelectionUiImpl\n*L\n36#1:68\n40#1:69\n*E\n"})
/* renamed from: OW2 */
/* loaded from: classes2.dex */
public final class OW2 extends AbstractC30071xE implements KW2 {

    /* renamed from: b */
    public final C24558d<VehicleClass> f26715b;

    /* renamed from: c */
    public View f26716c;

    /* renamed from: d */
    public View f26717d;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: OW2$a */
    /* loaded from: classes2.dex */
    public static final class C6020a extends Lambda implements Function1<Unit, Unit> {
        public C6020a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            OW2.this.f26715b.onNext(VehicleClass.MOPED);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: OW2$b */
    /* loaded from: classes2.dex */
    public static final class C6021b extends Lambda implements Function1<Unit, Unit> {
        public C6021b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            OW2.this.f26715b.onNext(VehicleClass.SCOOTER);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleClass;", "it", "Lco/bird/android/model/ridertutorial/TutorialKind;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/VehicleClass;)Lco/bird/android/model/ridertutorial/TutorialKind;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OW2$c */
    /* loaded from: classes2.dex */
    public static final class C6022c extends Lambda implements Function1<VehicleClass, TutorialKind> {

        /* renamed from: g */
        public static final C6022c f26720g = new C6022c();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: OW2$c$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C6023a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VehicleClass.values().length];
                try {
                    iArr[VehicleClass.MOPED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C6022c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final TutorialKind invoke(VehicleClass it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (C6023a.$EnumSwitchMapping$0[it.ordinal()] == 1) {
                return TutorialKind.CLASS_MOPED;
            }
            return TutorialKind.CLASS_SCOOTER;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ OW2(BaseActivity baseActivity, View view, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseActivity, view);
        if ((i & 2) != 0) {
            view = baseActivity.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(view, "activity.window.decorView");
        }
    }

    /* renamed from: Sl */
    public static final TutorialKind m92118Sl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (TutorialKind) tmp0.invoke(obj);
    }

    public static final void _init_$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void _init_$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.KW2
    /* renamed from: N4 */
    public Observable<TutorialKind> mo92122N4() {
        C24558d<VehicleClass> c24558d = this.f26715b;
        final C6022c c6022c = C6022c.f26720g;
        Observable map = c24558d.map(new InterfaceC23492o() { // from class: NW2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                TutorialKind m92118Sl;
                m92118Sl = OW2.m92118Sl(Function1.this, obj);
                return m92118Sl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "classSubject.map {\n     …ASS_SCOOTER\n      }\n    }");
        return map;
    }

    @Override // p000.KW2
    /* renamed from: m1 */
    public void mo92117m1(List<C33113Gk6> list) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OW2(BaseActivity activity, View contentView) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        C24558d<VehicleClass> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<VehicleClass>()");
        this.f26715b = m31902e;
        this.f26716c = C49520tu6.m11243h(contentView, C36585Vg4.multiModalTutorialSelectionMopedImage);
        this.f26717d = C49520tu6.m11243h(contentView, C36585Vg4.multiModalTutorialSelectionScooterImage);
        Object m33094as = C44626lf5.clicksThrottle$default(this.f26716c, 0L, 1, null).m33094as(AutoDispose.m45239a(activity));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6020a c6020a = new C6020a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: LW2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                OW2._init_$lambda$0(Function1.this, obj);
            }
        });
        Object m33094as2 = C44626lf5.clicksThrottle$default(this.f26717d, 0L, 1, null).m33094as(AutoDispose.m45239a(activity));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6021b c6021b = new C6021b();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: MW2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                OW2._init_$lambda$1(Function1.this, obj);
            }
        });
    }
}
