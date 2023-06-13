package co.bird.android.app.feature.legacyrepair.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.legacyrepair.widget.BirdOptionSheetView;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.C24558d;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001*B'\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004J'\u0010\u000e\u001a\u00020\u0007*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR>\u0010!\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\f \u001f*\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u001e0\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 ¨\u0006+"}, m28432d2 = {"Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView;", "Landroid/widget/LinearLayout;", "Lco/bird/android/model/wire/WireBird;", "bird", "", "releaseToNest", "canFixQr", "", "setOptionSheet", "Landroid/view/View;", "Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView$a;", "option", "Lco/bird/android/model/constant/BirdAction;", "onAction", "b", "(Landroid/view/View;Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView$a;Lco/bird/android/model/constant/BirdAction;)V", "e", "(Lco/bird/android/model/wire/WireBird;)V", "Landroid/widget/Button;", "action", DateTokenConverter.CONVERTER_KEY, "(Landroid/widget/Button;Lco/bird/android/model/wire/WireBird;)V", "LMp6;", "LMp6;", "binding", "c", "Z", "mechReleaseToNest", "canFixQrCode", "Lio/reactivex/subjects/d;", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/d;", "optionsClicks", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdOptionSheetView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdOptionSheetView.kt\nco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n288#2,2:106\n*S KotlinDebug\n*F\n+ 1 BirdOptionSheetView.kt\nco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView\n*L\n78#1:106,2\n*E\n"})
/* loaded from: classes2.dex */
public final class BirdOptionSheetView extends LinearLayout {

    /* renamed from: b */
    public final C34562Mp6 f61515b;

    /* renamed from: c */
    public boolean f61516c;

    /* renamed from: d */
    public boolean f61517d;

    /* renamed from: e */
    public final C24558d<Pair<EnumC13764a, BirdAction>> f61518e;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m28432d2 = {"Lco/bird/android/app/feature/legacyrepair/widget/BirdOptionSheetView$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "i", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.legacyrepair.widget.BirdOptionSheetView$a */
    /* loaded from: classes2.dex */
    public enum EnumC13764a {
        ACTION,
        UNLOCK,
        NAVIGATE,
        MORE_OPTIONS,
        CANCEL,
        START_REPAIR,
        DETAILS,
        REPLACE_QR
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.legacyrepair.widget.BirdOptionSheetView$b */
    /* loaded from: classes2.dex */
    public static final class C13765b extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ EnumC13764a f61529h;

        /* renamed from: i */
        public final /* synthetic */ BirdAction f61530i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13765b(EnumC13764a enumC13764a, BirdAction birdAction) {
            super(1);
            this.f61529h = enumC13764a;
            this.f61530i = birdAction;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            BirdOptionSheetView.this.f61518e.onNext(new Pair(this.f61529h, this.f61530i));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BirdOptionSheetView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: c */
    public static final void m60601c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ void clicks$app_birdRelease$default(BirdOptionSheetView birdOptionSheetView, View view, EnumC13764a enumC13764a, BirdAction birdAction, int i, Object obj) {
        if ((i & 2) != 0) {
            birdAction = null;
        }
        birdOptionSheetView.m60602b(view, enumC13764a, birdAction);
    }

    public static /* synthetic */ void setOptionSheet$default(BirdOptionSheetView birdOptionSheetView, WireBird wireBird, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        birdOptionSheetView.setOptionSheet(wireBird, z, z2);
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: b */
    public final void m60602b(View view, EnumC13764a option, BirdAction birdAction) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(option, "option");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(view, 0L, 1, null);
        final C13765b c13765b = new C13765b(option, birdAction);
        clicksThrottle$default.subscribe(new InterfaceC23484g() { // from class: QM
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BirdOptionSheetView.m60601c(Function1.this, obj);
            }
        });
    }

    /* renamed from: d */
    public final void m60600d(Button action, WireBird bird) {
        Object obj;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(bird, "bird");
        Iterator<T> it = bird.getActions().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((BirdAction) obj).isMechanic()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        BirdAction birdAction = (BirdAction) obj;
        if (birdAction == null) {
            C49520tu6.show$default(action, false, 0, 2, null);
            return;
        }
        C49520tu6.show$default(action, true, 0, 2, null);
        if (this.f61516c && birdAction == BirdAction.COMPLETE_CHARGE) {
            EnumC13764a enumC13764a = EnumC13764a.ACTION;
            BirdAction birdAction2 = BirdAction.CANCEL_TASK;
            m60602b(action, enumC13764a, birdAction2);
            action.setText(C19999eH.m43059b(birdAction2));
            return;
        }
        if (birdAction == BirdAction.COMPLETE_CHARGE) {
            action.setText(C19999eH.m43059b(BirdAction.RELEASE));
        } else {
            action.setText(C19999eH.m43059b(birdAction));
        }
        m60602b(action, EnumC13764a.ACTION, birdAction);
    }

    /* renamed from: e */
    public final void m60599e(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Button button = this.f61515b.f23665e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.navigateMechanic");
        clicks$app_birdRelease$default(this, button, EnumC13764a.NAVIGATE, null, 2, null);
        Button button2 = this.f61515b.f23664d;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.details");
        clicks$app_birdRelease$default(this, button2, EnumC13764a.DETAILS, null, 2, null);
        Button button3 = this.f61515b.f23666f;
        Intrinsics.checkNotNullExpressionValue(button3, "binding.replaceQr");
        C49520tu6.show$default(button3, this.f61517d, 0, 2, null);
        Button button4 = this.f61515b.f23666f;
        Intrinsics.checkNotNullExpressionValue(button4, "binding.replaceQr");
        clicks$app_birdRelease$default(this, button4, EnumC13764a.REPLACE_QR, null, 2, null);
        Button button5 = this.f61515b.f23662b;
        Intrinsics.checkNotNullExpressionValue(button5, "binding.cancelMechanic");
        clicks$app_birdRelease$default(this, button5, EnumC13764a.CANCEL, null, 2, null);
        Button button6 = this.f61515b.f23663c;
        Intrinsics.checkNotNullExpressionValue(button6, "binding.claim");
        m60600d(button6, bird);
        if (bird.getTaskId() != null || bird.getCaptive()) {
            Button button7 = this.f61515b.f23665e;
            Intrinsics.checkNotNullExpressionValue(button7, "binding.navigateMechanic");
            C49520tu6.show$default(button7, false, 0, 2, null);
        }
    }

    public final void setOptionSheet(WireBird bird, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f61516c = z;
        this.f61517d = z2;
        m60599e(bird);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BirdOptionSheetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BirdOptionSheetView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BirdOptionSheetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C34562Mp6 m94691b = C34562Mp6.m94691b(C40788fB0.m41772j(context), this);
        Intrinsics.checkNotNullExpressionValue(m94691b, "inflate(context.layoutInflater, this)");
        this.f61515b = m94691b;
        C24558d<Pair<EnumC13764a, BirdAction>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<Option, BirdAction?>>()");
        this.f61518e = m31902e;
        setOrientation(1);
    }
}
