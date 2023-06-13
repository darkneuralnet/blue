package p000;

import android.content.Intent;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010 \u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010\"\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0014\u0010$\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010-\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00100\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,R\u001a\u00103\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,R\u001a\u00106\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010,R\"\u0010;\u001a\u0010\u0012\f\u0012\n 8*\u0004\u0018\u00010\u00030\u0003078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006@"}, m28432d2 = {"LJn6;", "LxE;", "LFn6;", "", "emergencyPhoneNumber", "", "Gk", "phoneNumber", "T2", "B4", "J3", "Lio/reactivex/Observable;", "m8", "Lf", "ai", "s1", "p4", "Landroid/view/ViewGroup;", "b", "Landroid/view/ViewGroup;", "initialContainer", "c", "okayContainer", DateTokenConverter.CONVERTER_KEY, "assistanceContainer", "Landroid/widget/Button;", "e", "Landroid/widget/Button;", "needAssistanceButton", "f", "didNotTipButton", "g", "tippedButOkayButton", "h", "confirmOkayButton", "i", "confirmAssistanceNeededButton", "Landroid/widget/TextView;", "j", "Landroid/widget/TextView;", "emergencyPhoneTextView", "k", "Ljava/lang/String;", "X5", "()Ljava/lang/String;", "responseOk", "l", "P7", "responseDidNotTip", "m", "C9", "responseNeedAssistance", "n", "L5", "zendeskDescription", "Lma4;", "kotlin.jvm.PlatformType", "o", "Lma4;", "emergencyPhoneNumberClicks", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicleTipUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleTipUi.kt\nco/bird/android/app/feature/tip/VehicleTipUiImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Spans+.kt\nco/bird/android/widget/span/Spans_Kt\n*L\n1#1,104:1\n1#2:105\n6#3,3:106\n*S KotlinDebug\n*F\n+ 1 VehicleTipUi.kt\nco/bird/android/app/feature/tip/VehicleTipUiImpl\n*L\n67#1:106,3\n*E\n"})
/* renamed from: Jn6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33842Jn6 extends AbstractC30071xE implements InterfaceC32906Fn6 {

    /* renamed from: b */
    public final ViewGroup f18227b;

    /* renamed from: c */
    public final ViewGroup f18228c;

    /* renamed from: d */
    public final ViewGroup f18229d;

    /* renamed from: e */
    public final Button f18230e;

    /* renamed from: f */
    public final Button f18231f;

    /* renamed from: g */
    public final Button f18232g;

    /* renamed from: h */
    public final Button f18233h;

    /* renamed from: i */
    public final Button f18234i;

    /* renamed from: j */
    public final TextView f18235j;

    /* renamed from: k */
    public final String f18236k;

    /* renamed from: l */
    public final String f18237l;

    /* renamed from: m */
    public final String f18238m;

    /* renamed from: n */
    public final String f18239n;

    /* renamed from: o */
    public final C45168ma4<String> f18240o;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jn6$a */
    /* loaded from: classes2.dex */
    public static final class C4236a extends Lambda implements Function1<Unit, String> {
        public C4236a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C33842Jn6.this.mo99703P7();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jn6$b */
    /* loaded from: classes2.dex */
    public static final class C4237b extends Lambda implements Function1<Unit, String> {
        public C4237b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C33842Jn6.this.mo99708C9();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"Jn6$c", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", "onClick", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSpans+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spans+.kt\nco/bird/android/widget/span/Spans_Kt$clickableSpan$1\n+ 2 VehicleTipUi.kt\nco/bird/android/app/feature/tip/VehicleTipUiImpl\n*L\n1#1,9:1\n67#2:10\n*E\n"})
    /* renamed from: Jn6$c */
    /* loaded from: classes2.dex */
    public static final class C4238c extends ClickableSpan {

        /* renamed from: c */
        public final /* synthetic */ String f18244c;

        public C4238c(String str) {
            this.f18244c = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            C33842Jn6.this.f18240o.accept(this.f18244c);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jn6$d */
    /* loaded from: classes2.dex */
    public static final class C4239d extends Lambda implements Function1<Unit, String> {
        public C4239d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C33842Jn6.this.mo99695X5();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33842Jn6(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f18227b = (ViewGroup) C40788fB0.m41779c(activity, C36585Vg4.tipInitialContainer);
        this.f18228c = (ViewGroup) C40788fB0.m41779c(activity, C36585Vg4.tipContainerOkay);
        this.f18229d = (ViewGroup) C40788fB0.m41779c(activity, C36585Vg4.tipContainerAssistance);
        Button button = (Button) C40788fB0.m41779c(activity, C36585Vg4.vehicleTipNeedAssistanceButton);
        button.setPaintFlags(button.getPaintFlags() | 8);
        this.f18230e = button;
        this.f18231f = (Button) C40788fB0.m41779c(activity, C36585Vg4.vehicleTipDidNotTip);
        this.f18232g = (Button) C40788fB0.m41779c(activity, C36585Vg4.vehicleTippedOkay);
        this.f18233h = (Button) C40788fB0.m41779c(activity, C36585Vg4.vehicleTipConfirmOkButton);
        this.f18234i = (Button) C40788fB0.m41779c(activity, C36585Vg4.vehicleTipConfirmAssistanceNeededButton);
        this.f18235j = (TextView) C40788fB0.m41779c(activity, C36585Vg4.vehicleTipConfirmAssistanceNeededMessage);
        String string = activity.getString(C45871nl4.vehicle_tip_tipped_okay);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str….vehicle_tip_tipped_okay)");
        this.f18236k = string;
        String string2 = activity.getString(C45871nl4.vehicle_tip_false_alarm);
        Intrinsics.checkNotNullExpressionValue(string2, "activity.getString(L.str….vehicle_tip_false_alarm)");
        this.f18237l = string2;
        String string3 = activity.getString(C45871nl4.vehicle_tip_assistance_needed);
        Intrinsics.checkNotNullExpressionValue(string3, "activity.getString(L.str…le_tip_assistance_needed)");
        this.f18238m = string3;
        String string4 = activity.getString(C45871nl4.vehicle_tip_zendesk_description);
        Intrinsics.checkNotNullExpressionValue(string4, "activity.getString(L.str…_tip_zendesk_description)");
        this.f18239n = string4;
        C45168ma4<String> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<String>()");
        this.f18240o = m25409g;
    }

    /* renamed from: Sl */
    public static final String m99699Sl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: Tl */
    public static final String m99697Tl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: Ul */
    public static final String m99696Ul(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC32906Fn6
    /* renamed from: B4 */
    public void mo99709B4() {
        C49520tu6.show$default(this.f18227b, false, 0, 2, null);
        C49520tu6.show$default(this.f18228c, true, 0, 2, null);
        C49520tu6.show$default(this.f18229d, false, 0, 2, null);
    }

    @Override // p000.InterfaceC32906Fn6
    /* renamed from: C9 */
    public String mo99708C9() {
        return this.f18238m;
    }

    @Override // p000.InterfaceC32906Fn6
    /* renamed from: Gk */
    public void mo99707Gk(String emergencyPhoneNumber) {
        Intrinsics.checkNotNullParameter(emergencyPhoneNumber, "emergencyPhoneNumber");
        String string = getString(C45871nl4.vehicle_tip_assistance_message, emergencyPhoneNumber);
        TextView textView = this.f18235j;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(C45097mS5.m25592n(string, emergencyPhoneNumber, new C4238c(emergencyPhoneNumber)));
    }

    @Override // p000.InterfaceC32906Fn6
    /* renamed from: J3 */
    public void mo99706J3() {
        C49520tu6.show$default(this.f18227b, false, 0, 2, null);
        C49520tu6.show$default(this.f18228c, false, 0, 2, null);
        C49520tu6.show$default(this.f18229d, true, 0, 2, null);
    }

    @Override // p000.InterfaceC32906Fn6
    /* renamed from: L5 */
    public String mo99705L5() {
        return this.f18239n;
    }

    @Override // p000.InterfaceC32906Fn6
    /* renamed from: Lf */
    public Observable<String> mo99704Lf() {
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(this.f18232g, 0L, 1, null);
        final C4239d c4239d = new C4239d();
        Observable<String> map = clicksThrottle$default.map(new InterfaceC23492o() { // from class: Gn6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m99696Ul;
                m99696Ul = C33842Jn6.m99696Ul(Function1.this, obj);
                return m99696Ul;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun tippedButOk…ttle().map { responseOk }");
        return map;
    }

    @Override // p000.InterfaceC32906Fn6
    /* renamed from: P7 */
    public String mo99703P7() {
        return this.f18237l;
    }

    @Override // p000.InterfaceC32906Fn6
    /* renamed from: T2 */
    public void mo99698T2(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        try {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:" + phoneNumber));
            getActivity().startActivity(intent);
        } catch (Exception e) {
            C41318g46.m40159e(e);
        }
    }

    @Override // p000.InterfaceC32906Fn6
    /* renamed from: X5 */
    public String mo99695X5() {
        return this.f18236k;
    }

    @Override // p000.InterfaceC32906Fn6
    /* renamed from: ai */
    public Observable<String> mo99694ai() {
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(this.f18230e, 0L, 1, null);
        final C4237b c4237b = new C4237b();
        Observable<String> map = clicksThrottle$default.map(new InterfaceC23492o() { // from class: In6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m99697Tl;
                m99697Tl = C33842Jn6.m99697Tl(Function1.this, obj);
                return m99697Tl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun needAssista… responseNeedAssistance }");
        return map;
    }

    @Override // p000.InterfaceC32906Fn6
    /* renamed from: m8 */
    public Observable<String> mo99693m8() {
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(this.f18231f, 0L, 1, null);
        final C4236a c4236a = new C4236a();
        Observable<String> map = clicksThrottle$default.map(new InterfaceC23492o() { // from class: Hn6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m99699Sl;
                m99699Sl = C33842Jn6.m99699Sl(Function1.this, obj);
                return m99699Sl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun didNotTipBu…map { responseDidNotTip }");
        return map;
    }

    @Override // p000.InterfaceC32906Fn6
    /* renamed from: p4 */
    public Observable<String> mo99692p4() {
        Observable<String> hide = this.f18240o.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "emergencyPhoneNumberClicks.hide()");
        return hide;
    }

    @Override // p000.InterfaceC32906Fn6
    /* renamed from: s1 */
    public Observable<Unit> mo99691s1() {
        Observable<Unit> merge = Observable.merge(C44626lf5.clicksThrottle$default(this.f18233h, 0L, 1, null), C44626lf5.clicksThrottle$default(this.f18234i, 0L, 1, null));
        Intrinsics.checkNotNullExpressionValue(merge, "merge(confirmOkayButton.…dButton.clicksThrottle())");
        return merge;
    }
}
