package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.ride.activity.RideModeActivity;
import co.bird.api.response.BeginnerModeRiderMapAction;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24522d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"LDU4;", "LxE;", "LBU4;", "Lio/reactivex/Observable;", "", "H9", "label", "", "Cl", "Lco/bird/api/response/BeginnerModeRiderMapAction;", "action", "", "selected", "rk", "LK5;", "b", "LK5;", "binding", "LUI4;", "c", "LUI4;", "glide", "", "Landroid/view/View;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Map;", "optionViewToAcceleration", "Lco/bird/android/app/feature/ride/activity/RideModeActivity;", "activity", "<init>", "(Lco/bird/android/app/feature/ride/activity/RideModeActivity;LK5;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideModeUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideModeUi.kt\nco/bird/android/app/feature/settings/settings/RideModeUiImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,68:1\n125#2:69\n152#2,3:70\n*S KotlinDebug\n*F\n+ 1 RideModeUi.kt\nco/bird/android/app/feature/settings/settings/RideModeUiImpl\n*L\n37#1:69\n37#1:70,3\n*E\n"})
/* renamed from: DU4 */
/* loaded from: classes2.dex */
public final class DU4 extends AbstractC30071xE implements BU4 {

    /* renamed from: b */
    public final C4330K5 f5773b;

    /* renamed from: c */
    public final UI4 f5774c;

    /* renamed from: d */
    public final Map<View, String> f5775d;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: DU4$a */
    /* loaded from: classes2.dex */
    public static final class C1497a extends Lambda implements Function1<Unit, String> {

        /* renamed from: g */
        public final /* synthetic */ String f5776g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1497a(String str) {
            super(1);
            this.f5776g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f5776g;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DU4(RideModeActivity activity, C4330K5 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f5773b = binding;
        UI4 m53136v = ComponentCallbacks2C17096a.m53136v(activity);
        Intrinsics.checkNotNullExpressionValue(m53136v, "with(activity)");
        this.f5774c = m53136v;
        this.f5775d = new LinkedHashMap();
    }

    /* renamed from: Ql */
    public static final String m110358Ql(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    @Override // p000.BU4
    /* renamed from: Cl */
    public void mo110361Cl(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(label);
        }
    }

    @Override // p000.BU4
    /* renamed from: H9 */
    public Observable<String> mo110360H9() {
        Map<View, String> map = this.f5775d;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<View, String> entry : map.entrySet()) {
            Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(entry.getKey(), 0L, 1, null);
            final C1497a c1497a = new C1497a(entry.getValue());
            arrayList.add(clicksThrottle$default.map(new InterfaceC23492o() { // from class: CU4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    String m110358Ql;
                    m110358Ql = DU4.m110358Ql(Function1.this, obj);
                    return m110358Ql;
                }
            }));
        }
        return C24522d.m31958a(arrayList);
    }

    @Override // p000.BU4
    /* renamed from: rk */
    public void mo110357rk(BeginnerModeRiderMapAction action, boolean z) {
        Intrinsics.checkNotNullParameter(action, "action");
        View view = LayoutInflater.from(getActivity()).inflate(C45268mk4.ride_mode_selection_item, (ViewGroup) null);
        TextView textView = (TextView) view.findViewById(C52955zi4.text);
        TextView textView2 = (TextView) view.findViewById(C52955zi4.secondaryText);
        ImageView endIcon = (ImageView) view.findViewById(C52955zi4.endIcon);
        int dimension = (int) getActivity().getResources().getDimension(C37044Xf4.beginner_mode_option_padding);
        view.setPadding(dimension, dimension, dimension, dimension);
        this.f5774c.m81653k(action.getAsset().getMedia().getMediaUrl()).m16096R0((ImageView) view.findViewById(C52955zi4.icon));
        if (z) {
            endIcon.setImageResource(C48193rg4.ic_check_black);
            Intrinsics.checkNotNullExpressionValue(endIcon, "endIcon");
            C49520tu6.m11233r(endIcon);
        } else {
            Intrinsics.checkNotNullExpressionValue(endIcon, "endIcon");
            C49520tu6.m11239l(endIcon);
        }
        textView.setText(action.getContentTitle());
        textView2.setText(action.getContentSubtitle());
        this.f5773b.f19038c.addView(view);
        Map<View, String> map = this.f5775d;
        Intrinsics.checkNotNullExpressionValue(view, "view");
        map.put(view, action.getAccelerationLevel());
    }
}
