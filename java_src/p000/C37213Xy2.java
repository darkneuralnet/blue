package p000;

import android.text.Editable;
import android.widget.Button;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.LinkyTextView;
import com.facebook.share.internal.C17296a;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001/B\u000f\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u001a\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b0\u0007H\u0016J\u001a\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b0\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001dR\u0014\u0010*\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010!¨\u00060"}, m28432d2 = {"LXy2;", "LxE;", "LSy2;", "", "email", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lio/reactivex/Observable;", "hj", "wb", "o1", "Lkotlin/Pair;", "LXy2$a;", "Ng", "J5", "R2", "error", "lf", "Ec", "nf", "", "visible", "ta", "Lco/bird/android/widget/LinkyTextView;", "b", "Lco/bird/android/widget/LinkyTextView;", "emailText", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "instructionText", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "resendButton", "Lcom/google/android/material/textfield/TextInputEditText;", "e", "Lcom/google/android/material/textfield/TextInputEditText;", "codeEditor", "f", "troubleTitle", "g", "scanButton", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Xy2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37213Xy2 extends AbstractC30071xE implements InterfaceC36043Sy2 {

    /* renamed from: b */
    public final LinkyTextView f44324b;

    /* renamed from: c */
    public final TextView f44325c;

    /* renamed from: d */
    public final Button f44326d;

    /* renamed from: e */
    public final TextInputEditText f44327e;

    /* renamed from: f */
    public final TextView f44328f;

    /* renamed from: g */
    public final Button f44329g;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"LXy2$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Xy2$a */
    /* loaded from: classes2.dex */
    public enum EnumC9562a {
        PASTED,
        ENTERED
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", C17296a.f69688o, "(Ljava/lang/Integer;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xy2$b */
    /* loaded from: classes2.dex */
    public static final class C9563b extends Lambda implements Function1<Integer, Boolean> {

        /* renamed from: g */
        public static final C9563b f44333g = new C9563b();

        public C9563b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Integer it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.intValue() != 6 && it.intValue() != 5) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lkotlin/Pair;", "", "LXy2$a;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xy2$c */
    /* loaded from: classes2.dex */
    public static final class C9564c extends Lambda implements Function1<Integer, Pair<? extends String, ? extends EnumC9562a>> {
        public C9564c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<String, EnumC9562a> invoke(Integer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Pair<>(String.valueOf(C37213Xy2.this.f44327e.getText()), EnumC9562a.ENTERED);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LX26;", "it", "", C17296a.f69688o, "(LX26;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xy2$d */
    /* loaded from: classes2.dex */
    public static final class C9565d extends Lambda implements Function1<X26, Boolean> {

        /* renamed from: g */
        public static final C9565d f44335g = new C9565d();

        public C9565d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(X26 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            int m77519b = it.m77519b() - it.m77520a();
            boolean z = true;
            if (m77519b <= 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LX26;", "it", "Lkotlin/Pair;", "", "LXy2$a;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LX26;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xy2$e */
    /* loaded from: classes2.dex */
    public static final class C9566e extends Lambda implements Function1<X26, Pair<? extends String, ? extends EnumC9562a>> {

        /* renamed from: g */
        public static final C9566e f44336g = new C9566e();

        public C9566e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<String, EnumC9562a> invoke(X26 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Pair<>(it.m77518c().toString(), EnumC9562a.PASTED);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37213Xy2(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f44324b = (LinkyTextView) C40788fB0.m41779c(activity, C36585Vg4.emailText);
        this.f44325c = (TextView) C40788fB0.m41779c(activity, C36585Vg4.instructionText);
        this.f44326d = (Button) C40788fB0.m41779c(activity, C36585Vg4.resendButton);
        this.f44327e = (TextInputEditText) C40788fB0.m41779c(activity, C36585Vg4.codeEditor);
        this.f44328f = (TextView) C40788fB0.m41779c(activity, C36585Vg4.troubleTitleText);
        this.f44329g = (Button) C40788fB0.m41779c(activity, C36585Vg4.scanButton);
    }

    /* renamed from: Tl */
    public static final boolean m75972Tl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: Ul */
    public static final Pair m75971Ul(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: Vl */
    public static final boolean m75970Vl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: Wl */
    public static final Pair m75969Wl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC36043Sy2
    /* renamed from: C */
    public void mo75981C(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        String string = getActivity().getString(C45871nl4.login_email_line, "<a href=\"" + email + "\">" + email + " </a>");
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…in_email_line, emailLink)");
        this.f44324b.setText(C50976wN1.m6966a(string, 0));
    }

    @Override // p000.InterfaceC36043Sy2
    /* renamed from: Ec */
    public Observable<Unit> mo75980Ec() {
        return C44626lf5.clicksThrottle$default(this.f44328f, 0L, 1, null);
    }

    @Override // p000.InterfaceC36043Sy2
    /* renamed from: J5 */
    public Observable<Pair<String, EnumC9562a>> mo75979J5() {
        Observable m41061b;
        m41061b = C41068ff5.m41061b(this.f44327e, null, 1, null);
        final C9563b c9563b = C9563b.f44333g;
        Observable filter = m41061b.filter(new InterfaceC23494q() { // from class: Ty2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m75972Tl;
                m75972Tl = C37213Xy2.m75972Tl(Function1.this, obj);
                return m75972Tl;
            }
        });
        final C9564c c9564c = new C9564c();
        Observable<Pair<String, EnumC9562a>> map = filter.map(new InterfaceC23492o() { // from class: Uy2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m75971Ul;
                m75971Ul = C37213Xy2.m75971Ul(Function1.this, obj);
                return m75971Ul;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun codeEntered…eEntryType.ENTERED) }\n  }");
        return map;
    }

    @Override // p000.InterfaceC36043Sy2
    /* renamed from: Ng */
    public Observable<Pair<String, EnumC9562a>> mo75978Ng() {
        AbstractC49595u22<X26> m42644c = C40475ef5.m42644c(this.f44327e);
        final C9565d c9565d = C9565d.f44335g;
        Observable<X26> filter = m42644c.filter(new InterfaceC23494q() { // from class: Vy2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m75970Vl;
                m75970Vl = C37213Xy2.m75970Vl(Function1.this, obj);
                return m75970Vl;
            }
        });
        final C9566e c9566e = C9566e.f44336g;
        Observable map = filter.map(new InterfaceC23492o() { // from class: Wy2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m75969Wl;
                m75969Wl = C37213Xy2.m75969Wl(Function1.this, obj);
                return m75969Wl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "codeEditor.textChangeEve…, CodeEntryType.PASTED) }");
        return map;
    }

    @Override // p000.InterfaceC36043Sy2
    /* renamed from: R2 */
    public void mo75975R2() {
        Editable text = this.f44327e.getText();
        if (text != null) {
            text.clear();
        }
    }

    @Override // p000.InterfaceC36043Sy2
    /* renamed from: hj */
    public Observable<Unit> mo75968hj() {
        Observable<Unit> merge = Observable.merge(C44626lf5.clicksThrottle$default(this.f44324b, 0L, 1, null), C44626lf5.clicksThrottle$default(this.f44325c, 0L, 1, null));
        Intrinsics.checkNotNullExpressionValue(merge, "merge(emailText.clicksTh…ionText.clicksThrottle())");
        return merge;
    }

    @Override // p000.InterfaceC36043Sy2
    /* renamed from: lf */
    public void mo75967lf(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        TextInputLayout m87233b = R91.m87233b(this.f44327e);
        if (m87233b != null) {
            m87233b.setError(error);
        }
    }

    @Override // p000.InterfaceC36043Sy2
    /* renamed from: nf */
    public void mo75966nf() {
        this.f44327e.requestFocus();
    }

    @Override // p000.InterfaceC36043Sy2
    /* renamed from: o1 */
    public Observable<Unit> mo75965o1() {
        return C44626lf5.clicksThrottle$default(this.f44329g, 0L, 1, null);
    }

    @Override // p000.InterfaceC36043Sy2
    /* renamed from: ta */
    public void mo75964ta(boolean z) {
        C49520tu6.m11232s(this.f44329g, z, 8);
    }

    @Override // p000.InterfaceC36043Sy2
    /* renamed from: wb */
    public Observable<Unit> mo75963wb() {
        return C44626lf5.clicksThrottle$default(this.f44326d, 0L, 1, null);
    }
}
