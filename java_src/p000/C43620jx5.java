package p000;

import android.net.Uri;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.User;
import co.bird.android.model.UserKt;
import co.bird.android.model.Warehouse;
import com.facebook.share.internal.C17296a;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010Q\u001a\u00020P\u0012\u0006\u0010K\u001a\u00020\u0015¢\u0006\u0004\bR\u0010SJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\u0012\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0012\u0010$\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0016J\u001a\u0010'\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010&\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0012H\u0016J\b\u0010*\u001a\u00020\u0012H\u0016J\b\u0010+\u001a\u00020\u0007H\u0016J,\u0010-\u001a&\u0012\f\u0012\n ,*\u0004\u0018\u00010\u00070\u0007 ,*\u0012\u0012\f\u0012\n ,*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00160\u0016H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016H\u0016J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016H\u0016J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0016J\u0010\u00103\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0007H\u0016J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0016J\u0010\u00107\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u00108\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0016J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0016J\u0010\u0010<\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0007H\u0016J\u0010\u0010>\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u0007H\u0016J\u0010\u0010?\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010@\u001a\u00020\u0005H\u0016J\u0010\u0010A\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0016J\u0010\u0010C\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0016J\b\u0010E\u001a\u00020\u0005H\u0016J\b\u0010F\u001a\u00020\u0005H\u0016J\b\u0010G\u001a\u00020\u0005H\u0016J\u000e\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0016R\u0014\u0010K\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006T"}, m28432d2 = {"Ljx5;", "LxE;", "Lex5;", "Luf1;", "environment", "", "Ab", "", "version", "f3", "Landroid/net/Uri;", "uri", "Nk", "url", "jk", "Lco/bird/android/model/User;", "user", "Ic", "", "show", "Hl", "c6", "Lio/reactivex/Observable;", "m4", "Wf", "qc", "eb", "x0", "getName", "n0", "error", "Tk", "qk", "bk", "Lco/bird/android/model/Warehouse;", "warehouse", "Ld", "dd", "agreement", "h1", "checked", "Xb", "X0", "E0", "kotlin.jvm.PlatformType", "H3", "W0", "pj", "D3", "Fg", "i3", "k3", PaymentMethodOptionsParams.Blik.PARAM_CODE, "F6", "ab", "db", "C3", "w4", "Gb", "mode", "X9", "label", "bh", "uk", "xc", "s8", "H7", "Hf", "R9", "z9", "T5", "v2", "Dj", "b", "Lc6;", "binding", "LBX1;", "c", "LBX1;", "imageLoader", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lc6;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSettingsUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsUi.kt\nco/bird/android/app/feature/settings/settings/SettingsUiImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,313:1\n1#2:314\n*E\n"})
/* renamed from: jx5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43620jx5 extends AbstractC30071xE implements InterfaceC40655ex5 {

    /* renamed from: b */
    public final C13392c6 f93617b;

    /* renamed from: c */
    public final BX1 f93618c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jx5$a */
    /* loaded from: classes2.dex */
    public static final class C25052a extends Lambda implements Function1<CharSequence, String> {

        /* renamed from: g */
        public static final C25052a f93619g = new C25052a();

        public C25052a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jx5$b */
    /* loaded from: classes2.dex */
    public static final class C25053b extends Lambda implements Function1<CharSequence, String> {

        /* renamed from: g */
        public static final C25053b f93620g = new C25053b();

        public C25053b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jx5$c */
    /* loaded from: classes2.dex */
    public static final class C25054c extends Lambda implements Function1<CharSequence, String> {

        /* renamed from: g */
        public static final C25054c f93621g = new C25054c();

        public C25054c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jx5$d */
    /* loaded from: classes2.dex */
    public static final class C25055d extends Lambda implements Function1<Unit, String> {
        public C25055d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Unit it) {
            CharSequence charSequence;
            Intrinsics.checkNotNullParameter(it, "it");
            Editable text = C43620jx5.this.f93617b.f60095j.getText();
            if (text != null) {
                charSequence = StringsKt__StringsKt.trim(text);
            } else {
                charSequence = null;
            }
            return String.valueOf(charSequence);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43620jx5(BaseActivity activity, C13392c6 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f93617b = binding;
        this.f93618c = H22.f12748a.mo27556P2();
        binding.f60088c.setScaleType(ImageView.ScaleType.CENTER);
        binding.f60103r.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        binding.f60107v.setMovementMethod(LinkMovementMethod.getInstance());
        binding.f60082D.setMovementMethod(LinkMovementMethod.getInstance());
        binding.f60105t.setMovementMethod(LinkMovementMethod.getInstance());
        binding.f60089d.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: Tl */
    public static final String m29637Tl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: Ul */
    public static final String m29636Ul(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: Vl */
    public static final String m29635Vl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: Wl */
    public static final String m29632Wl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: Ab */
    public void mo29659Ab(EnumC49958uf1 environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        Button button = this.f93617b.f60097l;
        Intrinsics.checkNotNullExpressionValue(button, "binding.environment");
        C49520tu6.show$default(button, true, 0, 2, null);
        this.f93617b.f60097l.setText(environment.name());
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: C3 */
    public void mo29658C3(boolean z) {
        TextView textView = this.f93617b.f60081C;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.taxInformationLink");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: D3 */
    public void mo29657D3(boolean z) {
        String str;
        TextInputEditText textInputEditText = this.f93617b.f60099n;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.name");
        TextInputLayout m87233b = R91.m87233b(textInputEditText);
        if (m87233b != null) {
            if (z) {
                str = getActivity().getString(C45871nl4.error_settings_invalid_name_input);
            } else {
                str = null;
            }
            m87233b.setError(str);
        }
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: Dj */
    public Observable<Unit> mo29656Dj() {
        TextView textView = this.f93617b.f60098m;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.idVerificationLink");
        return C44626lf5.clicksThrottle$default(textView, 0L, 1, null);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: E0 */
    public String mo29655E0() {
        return this.f93617b.f60102q.getText().toString();
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: F6 */
    public void mo29654F6(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f93617b.f60079A.setText(getActivity().getString(C45871nl4.settings_share_code, code));
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: Fg */
    public Observable<String> mo29653Fg() {
        TextInputEditText textInputEditText = this.f93617b.f60103r;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.phone");
        AbstractC49595u22<CharSequence> m42643d = C40475ef5.m42643d(textInputEditText);
        final C25054c c25054c = C25054c.f93621g;
        Observable map = m42643d.map(new InterfaceC23492o() { // from class: ix5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m29635Vl;
                m29635Vl = C43620jx5.m29635Vl(Function1.this, obj);
                return m29635Vl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "binding.phone.textChanges().map { it.toString() }");
        return map;
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: Gb */
    public Observable<Unit> mo29652Gb() {
        Button button = this.f93617b.f60093h;
        Intrinsics.checkNotNullExpressionValue(button, "binding.editButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: H3 */
    public Observable<String> mo29651H3() {
        TextInputEditText textInputEditText = this.f93617b.f60095j;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.email");
        AbstractC49595u22<CharSequence> m42643d = C40475ef5.m42643d(textInputEditText);
        final C25052a c25052a = C25052a.f93619g;
        return m42643d.map(new InterfaceC23492o() { // from class: fx5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m29637Tl;
                m29637Tl = C43620jx5.m29637Tl(Function1.this, obj);
                return m29637Tl;
            }
        });
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: H7 */
    public Observable<Unit> mo29650H7() {
        TextView textView = this.f93617b.f60101p;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.operatorSettingsLink");
        return C44626lf5.clicksThrottle$default(textView, 0L, 1, null);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: Hf */
    public void mo29649Hf(boolean z) {
        TextView textView = this.f93617b.f60092g;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.deleteUserButton");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: Hl */
    public void mo29648Hl(boolean z) {
        ImageView imageView = this.f93617b.f60090e;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.checkImage");
        C49520tu6.show$default(imageView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: Ic */
    public void mo29647Ic(User user) {
        boolean contains$default;
        Intrinsics.checkNotNullParameter(user, "user");
        this.f93617b.f60099n.setText(user.getName());
        this.f93617b.f60095j.setText(user.getEmail());
        this.f93617b.f60103r.setText(user.getPhone());
        if (UserKt.isContractor(user)) {
            contains$default = StringsKt__StringsKt.contains$default((CharSequence) "bird", (CharSequence) "circ", false, 2, (Object) null);
            if (!contains$default) {
                TextView textView = this.f93617b.f60089d;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.chargerAgreementLink");
                C49520tu6.show$default(textView, true, 0, 2, null);
            }
        }
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: Ld */
    public void mo29646Ld(Warehouse warehouse) {
        if (warehouse == null) {
            this.f93617b.f60110y.f3015b.setText(getActivity().getString(C45871nl4.service_center));
            this.f93617b.f60110y.f3017d.setText(getActivity().getString(C45871nl4.service_center_add_location_title));
            this.f93617b.f60110y.f3017d.setTextColor(NA0.m94301c(getActivity(), C32364Df4.red));
            return;
        }
        this.f93617b.f60110y.f3015b.setText(warehouse.getName());
        this.f93617b.f60110y.f3017d.setText(warehouse.getAddress());
        this.f93617b.f60110y.f3017d.setTextColor(NA0.m94301c(getActivity(), C32364Df4.gray));
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: Nk */
    public void mo29645Nk(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        BX1 bx1 = this.f93618c;
        ShapeableImageView shapeableImageView = this.f93617b.f60083E;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "binding.userPhoto");
        bx1.mo112175a(uri, shapeableImageView);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: R9 */
    public Observable<Unit> mo29642R9() {
        TextView textView = this.f93617b.f60092g;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.deleteUserButton");
        return C44626lf5.clicksThrottle$default(textView, 0L, 1, null);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: T5 */
    public void mo29639T5() {
        TextView setIdentificationVerificationRequired$lambda$6 = this.f93617b.f60098m;
        setIdentificationVerificationRequired$lambda$6.setText(C45871nl4.id_verification_link);
        setIdentificationVerificationRequired$lambda$6.setClickable(true);
        Intrinsics.checkNotNullExpressionValue(setIdentificationVerificationRequired$lambda$6, "setIdentificationVerificationRequired$lambda$6");
        C49520tu6.m11233r(setIdentificationVerificationRequired$lambda$6);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: Tk */
    public void mo29638Tk(String str) {
        TextInputEditText textInputEditText = this.f93617b.f60095j;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.email");
        TextInputLayout m87233b = R91.m87233b(textInputEditText);
        if (m87233b == null) {
            return;
        }
        m87233b.setError(str);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: W0 */
    public Observable<String> mo29634W0() {
        TextInputEditText textInputEditText = this.f93617b.f60099n;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.name");
        AbstractC49595u22<CharSequence> m42643d = C40475ef5.m42643d(textInputEditText);
        final C25053b c25053b = C25053b.f93620g;
        Observable map = m42643d.map(new InterfaceC23492o() { // from class: gx5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m29636Ul;
                m29636Ul = C43620jx5.m29636Ul(Function1.this, obj);
                return m29636Ul;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "binding.name.textChanges().map { it.toString() }");
        return map;
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: Wf */
    public Observable<String> mo29633Wf() {
        TextView textView = this.f93617b.f60084F;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.verifyEmailButton");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(textView, 0L, 1, null);
        final C25055d c25055d = new C25055d();
        Observable<String> map = clicksThrottle$default.map(new InterfaceC23492o() { // from class: hx5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m29632Wl;
                m29632Wl = C43620jx5.m29632Wl(Function1.this, obj);
                return m29632Wl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun verifyEmail…().toString()\n      }\n  }");
        return map;
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: X0 */
    public boolean mo29631X0() {
        return this.f93617b.f60102q.isChecked();
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: X9 */
    public void mo29630X9(String mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f93617b.f60087b.setText(mode);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: Xb */
    public void mo29629Xb(boolean z) {
        this.f93617b.f60102q.setChecked(z);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: ab */
    public Observable<Unit> mo29628ab() {
        TextView textView = this.f93617b.f60079A;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.shareCode");
        return C44626lf5.clicksThrottle$default(textView, 0L, 1, null);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: bh */
    public void mo29627bh(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f93617b.f60108w.setText(label);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: bk */
    public void mo29626bk(boolean z) {
        TextView textView = this.f93617b.f60094i;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.editServiceCenter");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: c6 */
    public void mo29625c6(boolean z) {
        TextView textView = this.f93617b.f60084F;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.verifyEmailButton");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: db */
    public void mo29624db(boolean z) {
        TextView textView = this.f93617b.f60079A;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.shareCode");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: dd */
    public Observable<Unit> mo29623dd() {
        LinearLayout linearLayout = this.f93617b.f60111z;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.serviceCenterContainer");
        return C44626lf5.clicksThrottle$default(linearLayout, 0L, 1, null);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: eb */
    public String mo29622eb() {
        TextInputEditText textInputEditText = this.f93617b.f60095j;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.email");
        return C44213kx5.m28093a(textInputEditText);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: f3 */
    public void mo29621f3(String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        this.f93617b.f60085G.setText(version);
    }

    @Override // p000.InterfaceC40655ex5
    public String getName() {
        TextInputEditText textInputEditText = this.f93617b.f60099n;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.name");
        return C44213kx5.m28093a(textInputEditText);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: h1 */
    public void mo29620h1(boolean z, String str) {
        Unit unit;
        if (str != null) {
            this.f93617b.f60102q.setText(str);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f93617b.f60102q.setText(getActivity().getString(C45871nl4.communication_opt_in_string_backup));
        }
        CheckBox checkBox = this.f93617b.f60102q;
        Intrinsics.checkNotNullExpressionValue(checkBox, "binding.optIn");
        C49520tu6.show$default(checkBox, z, 0, 2, null);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: i3 */
    public Observable<Boolean> mo29619i3() {
        TextInputEditText textInputEditText = this.f93617b.f60103r;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.phone");
        return C45219mf5.m25213b(textInputEditText);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: jk */
    public void mo29618jk(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        BX1 bx1 = this.f93618c;
        ShapeableImageView shapeableImageView = this.f93617b.f60083E;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "binding.userPhoto");
        bx1.mo112174b(url, shapeableImageView);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: k3 */
    public void mo29617k3(boolean z) {
        String str;
        TextInputEditText textInputEditText = this.f93617b.f60103r;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.phone");
        TextInputLayout m87233b = R91.m87233b(textInputEditText);
        if (m87233b != null) {
            if (z) {
                str = getActivity().getString(C45871nl4.error_settings_invalid_phone_input);
            } else {
                str = null;
            }
            m87233b.setError(str);
        }
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: m4 */
    public Observable<Unit> mo29616m4() {
        ShapeableImageView shapeableImageView = this.f93617b.f60083E;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "binding.userPhoto");
        return C44626lf5.clicksThrottle$default(shapeableImageView, 0L, 1, null);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: n0 */
    public void mo29615n0() {
        hideKeyboard(this.f93617b.f60099n.getWindowToken());
        hideKeyboard(this.f93617b.f60103r.getWindowToken());
        hideKeyboard(this.f93617b.f60095j.getWindowToken());
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: pj */
    public Observable<Boolean> mo29614pj() {
        TextInputEditText textInputEditText = this.f93617b.f60099n;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.name");
        return C45219mf5.m25213b(textInputEditText);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: qc */
    public Observable<Unit> mo29613qc() {
        Button button = this.f93617b.f60080B;
        Intrinsics.checkNotNullExpressionValue(button, "binding.signOutButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: qk */
    public void mo29612qk() {
        LinearLayout linearLayout = this.f93617b.f60111z;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.serviceCenterContainer");
        C49520tu6.m11233r(linearLayout);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: s8 */
    public void mo29611s8(boolean z) {
        TextView textView = this.f93617b.f60101p;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.operatorSettingsLink");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: uk */
    public void mo29610uk(boolean z) {
        ConstraintLayout constraintLayout = this.f93617b.f60109x;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.riderModeContainer");
        C49520tu6.show$default(constraintLayout, z, 0, 2, null);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: v2 */
    public void mo29609v2() {
        TextView setIdentificationVerificationCompleted$lambda$7 = this.f93617b.f60098m;
        setIdentificationVerificationCompleted$lambda$7.setText(C45871nl4.id_verification_completed);
        setIdentificationVerificationCompleted$lambda$7.setClickable(false);
        Intrinsics.checkNotNullExpressionValue(setIdentificationVerificationCompleted$lambda$7, "setIdentificationVerificationCompleted$lambda$7");
        C49520tu6.m11233r(setIdentificationVerificationCompleted$lambda$7);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: w4 */
    public Observable<Unit> mo29608w4() {
        TextView textView = this.f93617b.f60081C;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.taxInformationLink");
        return C44626lf5.clicksThrottle$default(textView, 0L, 1, null);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: x0 */
    public String mo29607x0() {
        TextInputEditText textInputEditText = this.f93617b.f60103r;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.phone");
        return C44213kx5.m28093a(textInputEditText);
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: xc */
    public void mo29606xc() {
        this.f93617b.f60089d.setText(Html.fromHtml(getActivity().getResources().getString(C45278ml4.flyer_agreement_link)));
    }

    @Override // p000.InterfaceC40655ex5
    /* renamed from: z9 */
    public void mo29605z9() {
        TextView textView = this.f93617b.f60098m;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.idVerificationLink");
        C49520tu6.m11239l(textView);
    }
}
