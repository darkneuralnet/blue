package p000;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.wire.WireBird;
import co.bird.android.widget.BottomModalSheetLayout;
import co.bird.android.widget.BottomModalSheetModel;
import co.bird.android.widget.BottomSheetOptionLayout;
import co.bird.android.widget.C16597a;
import co.bird.android.widget.C16634c;
import co.bird.android.widget.C16664e;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C49495ts1;
@Metadata(m28433d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J\b\u0010!\u001a\u00020 H\u0016J\u0018\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0016J\u0010\u0010'\u001a\u00020\u00062\u0006\u0010#\u001a\u00020&H\u0016J\u0010\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0016J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0016J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020&H\u0016J\"\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00112\b\b\u0001\u0010.\u001a\u00020(2\b\b\u0001\u0010/\u001a\u00020(H\u0016R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0017\u00108\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u0006="}, m28432d2 = {"Lz23;", "Ly23;", "LxE;", "", "LH6;", "adapterSections", "", "b", "q0", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBird;", "oe", "l", "Lco/bird/android/model/constant/MapMode;", "mode", "", "expectingResult", "Lio/reactivex/p;", "Lt13;", "E9", "show", "Qi", "qh", "D1", "qj", "u7", "Oc", "Landroid/view/Menu;", "menu", "Z0", "visible", "r9", "LR13;", "d3", "", "title", "subTitle", "ll", "", "Hc", "", "visibility", "gd", "l0", "birdId", "S4", "primaryButtonResId", "messageResId", "Lco/bird/android/widget/c$b;", "Se", "Landroid/view/Menu;", "Lw13;", "c", "Lw13;", "getAdapter", "()Lw13;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNearbyBirdsUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NearbyBirdsUi.kt\nco/bird/android/app/feature/nearbybirds/NearbyBirdsUiImpl\n+ 2 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$show$1\n*L\n1#1,241:1\n38#2,9:242\n47#2,4:255\n819#3:251\n847#3:252\n848#3:254\n40#4:253\n*S KotlinDebug\n*F\n+ 1 NearbyBirdsUi.kt\nco/bird/android/app/feature/nearbybirds/NearbyBirdsUiImpl\n*L\n157#1:242,9\n157#1:255,4\n157#1:251\n157#1:252\n157#1:254\n157#1:253\n*E\n"})
/* renamed from: z23  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52560z23 extends AbstractC30071xE implements InterfaceC51967y23 {

    /* renamed from: b */
    public Menu f120665b;

    /* renamed from: c */
    public final C50771w13 f120666c;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z23$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C30883a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapMode.values().length];
            try {
                iArr[MapMode.OPERATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00018\u00008\u0000\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"", "Lco/bird/android/widget/d;", "K", "", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Ljava/lang/Enum;", "co/bird/android/widget/a$l"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$show$2$1\n*L\n1#1,108:1\n*E\n"})
    /* renamed from: z23$b */
    /* loaded from: classes2.dex */
    public static final class C30884b extends Lambda implements Function1<Integer, EnumC48993t13> {

        /* renamed from: g */
        public final /* synthetic */ List f120667g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30884b(List list) {
            super(1);
            this.f120667g = list;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Enum, t13] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final EnumC48993t13 invoke(Integer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (Enum) this.f120667g.get(it.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52560z23(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        C50771w13 c50771w13 = new C50771w13();
        this.f120666c = c50771w13;
        RecyclerView recyclerView = (RecyclerView) C40788fB0.m41779c(activity, C36585Vg4.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setAdapter(c50771w13);
    }

    @Override // p000.InterfaceC51967y23
    /* renamed from: D1 */
    public void mo1932D1(boolean z) {
        this.f120666c.m7563D(z);
    }

    @Override // p000.InterfaceC51967y23
    /* renamed from: E9 */
    public AbstractC24507p<EnumC48993t13> mo1931E9(MapMode mode, boolean z) {
        List mutableListOf;
        Intrinsics.checkNotNullParameter(mode, "mode");
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(EnumC48993t13.f109701i);
        if (C30883a.$EnumSwitchMapping$0[mode.ordinal()] == 1) {
            mutableListOf.add(0, EnumC48993t13.f109700h);
            mutableListOf.add(0, EnumC48993t13.f109699g);
            mutableListOf.add(EnumC48993t13.f109704l);
            if (z) {
                mutableListOf.add(EnumC48993t13.f109703k);
            }
        }
        BaseActivity activity = getActivity();
        BottomSheetOptionLayout.EnumC16469a enumC16469a = BottomSheetOptionLayout.EnumC16469a.NORMAL;
        ArrayList arrayList = new ArrayList();
        for (Object obj : mutableListOf) {
            Enum r3 = (Enum) obj;
            arrayList.add(obj);
        }
        C16664e c16664e = new C16664e();
        c16664e.setArguments(C16597a.m54345a(enumC16469a, null, null, 8388611, arrayList));
        c16664e.show(activity.getSupportFragmentManager(), "BottomSheetOptionFragment");
        AbstractC24507p m32067H = c16664e.m54040D9().m32067H(new C16597a.C16603f(new C30884b(arrayList)));
        Intrinsics.checkNotNullExpressionValue(m32067H, "with(BottomSheetOptionFr…).map { options[it] }\n  }");
        return m32067H;
    }

    @Override // p000.InterfaceC51967y23
    /* renamed from: Hc */
    public void mo1930Hc(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        ((Button) C40788fB0.m41779c(getActivity(), C36585Vg4.emptyState_cta)).setText(title);
    }

    @Override // p000.InterfaceC51967y23
    /* renamed from: Oc */
    public void mo1929Oc(boolean z) {
        this.f120666c.m7564C(z);
    }

    @Override // p000.InterfaceC51967y23
    /* renamed from: Qi */
    public void mo1928Qi(boolean z) {
        C49520tu6.m11232s(C40788fB0.m41779c(getActivity(), C36585Vg4.emptyState), z, 4);
    }

    @Override // p000.InterfaceC51967y23
    /* renamed from: S4 */
    public void mo1927S4(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        C49495ts1.C28846a.newInstance$default(C49495ts1.f111173f, birdId, false, 2, null).show(getActivity().getSupportFragmentManager(), "FlightSheetBottomSheetFragment");
    }

    @Override // p000.InterfaceC51967y23
    /* renamed from: Se */
    public AbstractC24507p<C16634c.EnumC16636b> mo1926Se(int i, int i2) {
        C16634c c16634c = new C16634c();
        Bundle bundle = new Bundle();
        bundle.putParcelable("bottom_modal_sheet_model", new BottomModalSheetModel(null, Integer.valueOf(C45871nl4.nearby_birds_capture_modal_title), getActivity().getString(i2), BottomModalSheetLayout.EnumC16464a.DOUBLE, Integer.valueOf(i), Integer.valueOf(C45871nl4.nearby_birds_capture_modal_secondary_button), null, null, null, null, null, null, Boolean.FALSE, 4033, null));
        c16634c.setArguments(bundle);
        c16634c.show(getActivity().getSupportFragmentManager(), "BottomModalSheetFragment");
        return c16634c.m54230B9();
    }

    @Override // p000.InterfaceC51967y23
    /* renamed from: Z0 */
    public void mo1925Z0(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.f120665b = menu;
    }

    @Override // p000.InterfaceC51967y23
    /* renamed from: b */
    public void mo1924b(List<C3023H6> adapterSections) {
        Intrinsics.checkNotNullParameter(adapterSections, "adapterSections");
        this.f120666c.m7554x(adapterSections);
    }

    @Override // p000.InterfaceC51967y23
    /* renamed from: d3 */
    public R13 mo1923d3() {
        B13 b13 = new B13();
        b13.show(getActivity().getSupportFragmentManager(), "NearbyBirdsFilterDialog");
        return b13;
    }

    @Override // p000.InterfaceC51967y23
    /* renamed from: gd */
    public void mo1922gd(int i) {
        ((Button) C40788fB0.m41779c(getActivity(), C36585Vg4.emptyState_cta)).setVisibility(i);
    }

    @Override // p000.InterfaceC51967y23
    /* renamed from: l */
    public Observable<WireBird> mo1921l() {
        return this.f120666c.m7562o();
    }

    @Override // p000.InterfaceC51967y23
    /* renamed from: l0 */
    public Observable<Unit> mo1920l0() {
        return C44626lf5.clicksThrottle$default(C40788fB0.m41779c(getActivity(), C36585Vg4.emptyState_cta), 0L, 1, null);
    }

    @Override // p000.InterfaceC51967y23
    /* renamed from: ll */
    public void mo1919ll(CharSequence title, CharSequence subTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        ((TextView) C40788fB0.m41779c(getActivity(), C36585Vg4.emptyState_title)).setText(title);
        ((TextView) C40788fB0.m41779c(getActivity(), C36585Vg4.emptyState_subtitle)).setText(subTitle);
    }

    @Override // p000.InterfaceC51967y23
    /* renamed from: oe */
    public Observable<WireBird> mo1918oe() {
        return this.f120666c.m7555w();
    }

    @Override // p000.InterfaceC51967y23
    /* renamed from: q0 */
    public List<C3023H6> mo1917q0() {
        return this.f120666c.m7561p();
    }

    @Override // p000.InterfaceC51967y23
    /* renamed from: qh */
    public void mo1916qh(boolean z) {
        this.f120666c.m7565B(z);
    }

    @Override // p000.InterfaceC51967y23
    /* renamed from: qj */
    public void mo1915qj(boolean z) {
        this.f120666c.m7566A(z);
    }

    @Override // p000.InterfaceC51967y23
    /* renamed from: r9 */
    public void mo1914r9(boolean z) {
        Menu menu = this.f120665b;
        MenuItem findItem = menu != null ? menu.findItem(C36585Vg4.filter) : null;
        if (findItem == null) {
            return;
        }
        findItem.setVisible(z);
    }

    @Override // p000.InterfaceC51967y23
    /* renamed from: u7 */
    public void mo1913u7(boolean z) {
        this.f120666c.m7553y(z);
    }
}
