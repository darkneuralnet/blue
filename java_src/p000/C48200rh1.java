package p000;

import android.content.res.ColorStateList;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C53094zw3;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00040\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00060\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u001e"}, m28432d2 = {"Lrh1;", "LxE;", "Lqh1;", "Lio/reactivex/Observable;", "", "sg", "", "c", "", "enabled", "x", "Fd", "Landroid/widget/EditText;", "b", "Landroid/widget/EditText;", "quantity", "Landroid/widget/Button;", "Landroid/widget/Button;", "submit", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "quantitySubject", "e", "doneSubject", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/EditText;Landroid/widget/Button;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rh1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48200rh1 extends AbstractC30071xE implements InterfaceC47607qh1 {

    /* renamed from: b */
    public final EditText f107489b;

    /* renamed from: c */
    public final Button f107490c;

    /* renamed from: d */
    public final C24558d<Integer> f107491d;

    /* renamed from: e */
    public final C24558d<Unit> f107492e;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LHJ6;", "", C17296a.f69688o, "(LHJ6;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rh1$a */
    /* loaded from: classes3.dex */
    public static final class C27977a extends Lambda implements Function1<HJ6, Unit> {

        /* renamed from: h */
        public final /* synthetic */ BaseActivity f107494h;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "charSequence", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "", C17296a.f69688o, "(Ljava/lang/CharSequence;III)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nExcessInventoryUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExcessInventoryUi.kt\nco/bird/android/feature/servicecenter/inventorycount/excessinventory/ExcessInventoryUiImpl$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
        /* renamed from: rh1$a$a */
        /* loaded from: classes3.dex */
        public static final class C27978a extends Lambda implements Function4<CharSequence, Integer, Integer, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C48200rh1 f107495g;

            /* renamed from: h */
            public final /* synthetic */ BaseActivity f107496h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27978a(C48200rh1 c48200rh1, BaseActivity baseActivity) {
                super(4);
                this.f107495g = c48200rh1;
                this.f107496h = baseActivity;
            }

            /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
                r2 = kotlin.text.StringsKt__StringNumberConversionsKt.toIntOrNull(r2);
             */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m15569a(CharSequence charSequence, int i, int i2, int i3) {
                Unit unit;
                int i4;
                Integer intOrNull;
                if (charSequence != null && (r2 = charSequence.toString()) != null && intOrNull != null) {
                    this.f107495g.f107491d.onNext(intOrNull);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                boolean z = false;
                if (unit == null) {
                    this.f107495g.f107491d.onNext(0);
                }
                if ((charSequence == null || charSequence.length() == 0) ? true : true) {
                    i4 = C32364Df4.passiveText;
                } else {
                    i4 = C32364Df4.primaryText;
                }
                this.f107495g.f107489b.setBackgroundTintList(ColorStateList.valueOf(NA0.m94301c(this.f107496h, i4)));
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                m15569a(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27977a(BaseActivity baseActivity) {
            super(1);
            this.f107494h = baseActivity;
        }

        /* renamed from: a */
        public final void m15570a(HJ6 textChangedListener) {
            Intrinsics.checkNotNullParameter(textChangedListener, "$this$textChangedListener");
            textChangedListener.m104030b(new C27978a(C48200rh1.this, this.f107494h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HJ6 hj6) {
            m15570a(hj6);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/widget/TextView;", "<anonymous parameter 0>", "", "actionId", "Landroid/view/KeyEvent;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rh1$b */
    /* loaded from: classes3.dex */
    public static final class C27979b extends Lambda implements Function3<TextView, Integer, KeyEvent, Boolean> {
        public C27979b() {
            super(3);
        }

        /* renamed from: a */
        public final Boolean m15568a(TextView textView, int i, KeyEvent keyEvent) {
            boolean z;
            if (i == 6) {
                C48200rh1.this.f107492e.onNext(Unit.INSTANCE);
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Boolean invoke(TextView textView, Integer num, KeyEvent keyEvent) {
            return m15568a(textView, num.intValue(), keyEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48200rh1(BaseActivity activity, EditText quantity, Button submit) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(submit, "submit");
        this.f107489b = quantity;
        this.f107490c = submit;
        C24558d<Integer> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Int>()");
        this.f107491d = m31902e;
        C24558d<Unit> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Unit>()");
        this.f107492e = m31902e2;
        C34585Ms2.m94647x(quantity, new C27977a(activity));
        C34585Ms2.m94658m(quantity, new C27979b());
        quantity.requestFocus();
        showKeyboard(quantity.getWindowToken());
    }

    @Override // p000.InterfaceC47607qh1
    /* renamed from: Fd */
    public void mo15574Fd() {
        C53094zw3.C31593a c31593a = C53094zw3.f122502a;
        BaseActivity activity = getActivity();
        String string = getActivity().getString(C45871nl4.inventory_excess_missing_sku);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…ntory_excess_missing_sku)");
        C53094zw3.C31593a.makeText$default(c31593a, activity, string, 0, 48, null, 16, null).show();
    }

    @Override // p000.InterfaceC47607qh1
    /* renamed from: c */
    public Observable<Unit> mo15573c() {
        Observable<Unit> merge = Observable.merge(C44626lf5.clicksThrottle$default(this.f107490c, 0L, 1, null), this.f107492e);
        Intrinsics.checkNotNullExpressionValue(merge, "merge(submit.clicksThrottle(), doneSubject)");
        return merge;
    }

    @Override // p000.InterfaceC47607qh1
    /* renamed from: sg */
    public Observable<Integer> mo15572sg() {
        Observable<Integer> hide = this.f107491d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "quantitySubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC47607qh1
    /* renamed from: x */
    public void mo15571x(boolean z) {
        this.f107490c.setEnabled(z);
    }
}
