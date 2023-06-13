package p000;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.widget.Button;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.Warehouse;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B5\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"Lsz6;", "LxE;", "Lpz6;", "Lco/bird/android/model/Warehouse;", "currentWarehouse", "suggestedWarehouse", "", "ya", "Lio/reactivex/Observable;", "Lco/bird/android/model/DialogResponse;", "f", "I7", "dismiss", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "message", "Landroid/widget/Button;", "c", "Landroid/widget/Button;", "confirm", DateTokenConverter.CONVERTER_KEY, "selectAnother", "Landroid/content/DialogInterface;", "e", "Landroid/content/DialogInterface;", "dialog", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/content/DialogInterface;)V", "warehouse-checker_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sz6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48977sz6 extends AbstractC30071xE implements InterfaceC47199pz6 {

    /* renamed from: b */
    public final TextView f109638b;

    /* renamed from: c */
    public final Button f109639c;

    /* renamed from: d */
    public final Button f109640d;

    /* renamed from: e */
    public final DialogInterface f109641e;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/DialogResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sz6$a */
    /* loaded from: classes4.dex */
    public static final class C28491a extends Lambda implements Function1<Unit, DialogResponse> {

        /* renamed from: g */
        public static final C28491a f109642g = new C28491a();

        public C28491a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DialogResponse invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return DialogResponse.OK;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/DialogResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sz6$b */
    /* loaded from: classes4.dex */
    public static final class C28492b extends Lambda implements Function1<Unit, DialogResponse> {

        /* renamed from: g */
        public static final C28492b f109643g = new C28492b();

        public C28492b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DialogResponse invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return DialogResponse.OTHER;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48977sz6(BaseActivity activity, TextView message, Button confirm, Button selectAnother, DialogInterface dialog) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(confirm, "confirm");
        Intrinsics.checkNotNullParameter(selectAnother, "selectAnother");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f109638b = message;
        this.f109639c = confirm;
        this.f109640d = selectAnother;
        this.f109641e = dialog;
    }

    /* renamed from: Rl */
    public static final DialogResponse m13289Rl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DialogResponse) tmp0.invoke(obj);
    }

    /* renamed from: Sl */
    public static final DialogResponse m13288Sl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DialogResponse) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC47199pz6
    /* renamed from: I7 */
    public Observable<DialogResponse> mo13292I7() {
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(this.f109640d, 0L, 1, null);
        final C28492b c28492b = C28492b.f109643g;
        Observable<DialogResponse> map = clicksThrottle$default.map(new InterfaceC23492o() { // from class: rz6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                DialogResponse m13288Sl;
                m13288Sl = C48977sz6.m13288Sl(Function1.this, obj);
                return m13288Sl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "selectAnother.clicksThro… { DialogResponse.OTHER }");
        return map;
    }

    @Override // p000.InterfaceC47199pz6
    public void dismiss() {
        this.f109641e.dismiss();
    }

    @Override // p000.InterfaceC47199pz6
    /* renamed from: f */
    public Observable<DialogResponse> mo13287f() {
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(this.f109639c, 0L, 1, null);
        final C28491a c28491a = C28491a.f109642g;
        Observable<DialogResponse> map = clicksThrottle$default.map(new InterfaceC23492o() { // from class: qz6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                DialogResponse m13289Rl;
                m13289Rl = C48977sz6.m13289Rl(Function1.this, obj);
                return m13289Rl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "confirm.clicksThrottle().map { DialogResponse.OK }");
        return map;
    }

    @Override // p000.InterfaceC47199pz6
    /* renamed from: ya */
    public void mo13286ya(Warehouse currentWarehouse, Warehouse warehouse) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(currentWarehouse, "currentWarehouse");
        TextView textView = this.f109638b;
        BaseActivity activity = getActivity();
        int i = C45871nl4.warehouse_verification_message_format;
        Object[] objArr = new Object[2];
        objArr[0] = currentWarehouse.getName();
        if (warehouse != null) {
            str = warehouse.getName();
        } else {
            str = null;
        }
        objArr[1] = str;
        String string = activity.getString(i, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…suggestedWarehouse?.name)");
        SpannableString span$default = C45097mS5.span$default(string, currentWarehouse.getName(), null, 2, null);
        if (warehouse != null) {
            str2 = warehouse.getName();
        } else {
            str2 = null;
        }
        textView.setText(C45097mS5.span$default(span$default, str2, null, 2, null));
    }
}
