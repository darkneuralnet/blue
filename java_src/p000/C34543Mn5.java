package p000;

import android.content.DialogInterface;
import android.widget.Button;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B5\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m28432d2 = {"LMn5;", "LxE;", "LJn5;", "Lco/bird/android/model/wire/WireBird;", "bird", "", "R5", "Lio/reactivex/Observable;", "Lco/bird/android/model/DialogResponse;", "f", DateTokenConverter.CONVERTER_KEY, "dismiss", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "message", "Landroid/widget/Button;", "c", "Landroid/widget/Button;", "confirm", "cancel", "Landroid/content/DialogInterface;", "e", "Landroid/content/DialogInterface;", "dialog", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/content/DialogInterface;)V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Mn5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34543Mn5 extends AbstractC30071xE implements InterfaceC33841Jn5 {

    /* renamed from: b */
    public final TextView f23572b;

    /* renamed from: c */
    public final Button f23573c;

    /* renamed from: d */
    public final Button f23574d;

    /* renamed from: e */
    public final DialogInterface f23575e;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/DialogResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Mn5$a */
    /* loaded from: classes3.dex */
    public static final class C5375a extends Lambda implements Function1<Unit, DialogResponse> {

        /* renamed from: g */
        public static final C5375a f23576g = new C5375a();

        public C5375a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DialogResponse invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return DialogResponse.CANCEL;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/DialogResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Mn5$b */
    /* loaded from: classes3.dex */
    public static final class C5376b extends Lambda implements Function1<Unit, DialogResponse> {

        /* renamed from: g */
        public static final C5376b f23577g = new C5376b();

        public C5376b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DialogResponse invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return DialogResponse.OK;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34543Mn5(BaseActivity activity, TextView message, Button confirm, Button cancel, DialogInterface dialog) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(confirm, "confirm");
        Intrinsics.checkNotNullParameter(cancel, "cancel");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f23572b = message;
        this.f23573c = confirm;
        this.f23574d = cancel;
        this.f23575e = dialog;
    }

    /* renamed from: Rl */
    public static final DialogResponse m94836Rl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DialogResponse) tmp0.invoke(obj);
    }

    /* renamed from: Sl */
    public static final DialogResponse m94835Sl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DialogResponse) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC33841Jn5
    /* renamed from: R5 */
    public void mo94837R5(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        TextView textView = this.f23572b;
        String string = getActivity().getString(C45871nl4.scrap_landing_inspection_confirmation_message, bird.getCode());
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…ation_message, bird.code)");
        textView.setText(C45097mS5.span$default(string, bird.getCode(), null, 2, null));
    }

    @Override // p000.InterfaceC33841Jn5
    /* renamed from: d */
    public Observable<DialogResponse> mo94834d() {
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(this.f23574d, 0L, 1, null);
        final C5375a c5375a = C5375a.f23576g;
        Observable<DialogResponse> map = clicksThrottle$default.map(new InterfaceC23492o() { // from class: Ln5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                DialogResponse m94836Rl;
                m94836Rl = C34543Mn5.m94836Rl(Function1.this, obj);
                return m94836Rl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "cancel.clicksThrottle().…{ DialogResponse.CANCEL }");
        return map;
    }

    @Override // p000.InterfaceC33841Jn5
    public void dismiss() {
        this.f23575e.dismiss();
    }

    @Override // p000.InterfaceC33841Jn5
    /* renamed from: f */
    public Observable<DialogResponse> mo94833f() {
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(this.f23573c, 0L, 1, null);
        final C5376b c5376b = C5376b.f23577g;
        Observable<DialogResponse> map = clicksThrottle$default.map(new InterfaceC23492o() { // from class: Kn5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                DialogResponse m94835Sl;
                m94835Sl = C34543Mn5.m94835Sl(Function1.this, obj);
                return m94835Sl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "confirm.clicksThrottle().map { DialogResponse.OK }");
        return map;
    }
}
