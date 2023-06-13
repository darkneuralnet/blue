package p000;

import android.widget.Button;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.H31;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J7\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%"}, m28432d2 = {"Ltx6;", "LxE;", "Lqx6;", "Lio/reactivex/Observable;", "", "Bh", "fh", "R8", "Vd", "Ch", "bl", "", "enabled", "ye", "Pk", "pi", "Li", "Pa", "Hg", "w8", "", "title", "hint", "prefill", "allowEmptyInput", "Lio/reactivex/p;", "", "s9", "(IILjava/lang/Integer;Z)Lio/reactivex/p;", "Lv6;", "b", "Lv6;", "binding", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lv6;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWakeSleepBirdsUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WakeSleepBirdsUi.kt\nco/bird/android/app/feature/wakebirds/WakeSleepBirdsUiImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
/* renamed from: tx6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49550tx6 extends AbstractC30071xE implements InterfaceC47772qx6 {

    /* renamed from: b */
    public final C29416v6 f111407b;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LH31$b;", "it", "", C17296a.f69688o, "(LH31$b;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tx6$a */
    /* loaded from: classes2.dex */
    public static final class C28968a extends Lambda implements Function1<H31.AbstractC3016b, Boolean> {

        /* renamed from: g */
        public static final C28968a f111408g = new C28968a();

        public C28968a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(H31.AbstractC3016b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof H31.AbstractC3016b.C3019c);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LH31$b;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LH31$b;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tx6$b */
    /* loaded from: classes2.dex */
    public static final class C28969b extends Lambda implements Function1<H31.AbstractC3016b, String> {

        /* renamed from: g */
        public static final C28969b f111409g = new C28969b();

        public C28969b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(H31.AbstractC3016b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return ((H31.AbstractC3016b.C3019c) it).m104470b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49550tx6(BaseActivity activity, C29416v6 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f111407b = binding;
    }

    /* renamed from: Rl */
    public static final boolean m11154Rl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: Sl */
    public static final String m11153Sl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC47772qx6
    /* renamed from: Bh */
    public Observable<Unit> mo11163Bh() {
        Button button = this.f111407b.f113524f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.wakeAVehicle");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC47772qx6
    /* renamed from: Ch */
    public Observable<Unit> mo11162Ch() {
        Button button = this.f111407b.f113520b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.bulkScanToWake");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC47772qx6
    /* renamed from: Hg */
    public void mo11161Hg(boolean z) {
        Button button = this.f111407b.f113521c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.hibernation");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    @Override // p000.InterfaceC47772qx6
    /* renamed from: Li */
    public void mo11160Li(boolean z) {
        Button button = this.f111407b.f113522d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.sleepABird");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    @Override // p000.InterfaceC47772qx6
    /* renamed from: Pa */
    public void mo11159Pa(boolean z) {
        Button button = this.f111407b.f113520b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.bulkScanToWake");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    @Override // p000.InterfaceC47772qx6
    /* renamed from: Pk */
    public void mo11158Pk(boolean z) {
        Button button = this.f111407b.f113525g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.wakeBatch");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    @Override // p000.InterfaceC47772qx6
    /* renamed from: R8 */
    public Observable<Unit> mo11155R8() {
        Button button = this.f111407b.f113523e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.sweepToWake");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC47772qx6
    /* renamed from: Vd */
    public Observable<Unit> mo11152Vd() {
        Button button = this.f111407b.f113522d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.sleepABird");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC47772qx6
    /* renamed from: bl */
    public Observable<Unit> mo11151bl() {
        Button button = this.f111407b.f113521c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.hibernation");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC47772qx6
    /* renamed from: fh */
    public Observable<Unit> mo11150fh() {
        Button button = this.f111407b.f113525g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.wakeBatch");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC47772qx6
    /* renamed from: pi */
    public void mo11149pi(boolean z) {
        Button button = this.f111407b.f113523e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.sweepToWake");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0038, code lost:
        if (r0 == null) goto L8;
     */
    @Override // p000.InterfaceC47772qx6
    /* renamed from: s9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC24507p<String> mo11148s9(int i, int i2, Integer num, boolean z) {
        String str;
        String string = getActivity().getResources().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "activity.resources.getString(title)");
        String string2 = getActivity().getResources().getString(i2);
        Intrinsics.checkNotNullExpressionValue(string2, "activity.resources.getString(hint)");
        if (num != null) {
            str = getActivity().getResources().getString(num.intValue());
        }
        str = "";
        AbstractC24507p m33125j0 = H31.C3014a.dialogWithInput$default(this, string, null, string2, str, null, null, null, z, false, false, 882, null).m33125j0();
        final C28968a c28968a = C28968a.f111408g;
        AbstractC24507p m32022w = m33125j0.m32022w(new InterfaceC23494q() { // from class: rx6
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m11154Rl;
                m11154Rl = C49550tx6.m11154Rl(Function1.this, obj);
                return m11154Rl;
            }
        });
        final C28969b c28969b = C28969b.f111409g;
        AbstractC24507p<String> m32067H = m32022w.m32067H(new InterfaceC23492o() { // from class: sx6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m11153Sl;
                m11153Sl = C49550tx6.m11153Sl(Function1.this, obj);
                return m11153Sl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32067H, "dialogWithInput(\n      t…InputResponse.Ok).input }");
        return m32067H;
    }

    @Override // p000.InterfaceC47772qx6
    /* renamed from: w8 */
    public void mo11147w8() {
        new C40295eM1().show(getActivity().getSupportFragmentManager(), "HibernationScanBottomSheet");
    }

    @Override // p000.InterfaceC47772qx6
    /* renamed from: ye */
    public void mo11146ye(boolean z) {
        Button button = this.f111407b.f113524f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.wakeAVehicle");
        C49520tu6.show$default(button, z, 0, 2, null);
    }
}
