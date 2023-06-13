package p000;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.transferorder.operator.InterfaceC15803b;
import co.bird.android.feature.transferorder.operator.OperatorOrderActivity;
import co.bird.android.imageupload.ImageUploadBar;
import co.bird.android.model.constant.OperatorOrderViewType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.subjects.C24567g;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001<B\u0007¢\u0006\u0004\b9\u0010:J&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\"\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0019H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u0019H\u0016J\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u0019H\u0016J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R.\u00100\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001d .*\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u001c0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010/R\"\u00104\u001a\u0010\u0012\f\u0012\n .*\u0004\u0018\u00010\f0\f018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0004\u0018\u0001058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006="}, m28432d2 = {"La7;", "Lhc5;", "Lk7;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Lio/reactivex/h;", "T0", "Ll7;", TransferTable.COLUMN_STATE, "t8", "Lio/reactivex/Observable;", "g", "F4", "", "", "D8", "Lio/reactivex/F;", "W3", "Lj7;", "e", "Lj7;", "N6", "()Lj7;", "setPresenter", "(Lj7;)V", "presenter", "LxZ;", "f", "LxZ;", "binding", "LAG;", "kotlin.jvm.PlatformType", "LAG;", "photoUrlsRelay", "Lio/reactivex/subjects/g;", "h", "Lio/reactivex/subjects/g;", "bolAddedSubject", "Lsx4;", "a5", "()Lsx4;", "delegate", "<init>", "()V", "i", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddBillOfLadingBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddBillOfLadingBottomSheet.kt\nco/bird/android/feature/transferorder/operator/billoflading/AddBillOfLadingBottomSheet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Bundle+.kt\nco/bird/android/library/extension/Bundle_Kt\n+ 4 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 7 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,140:1\n1#2:141\n1#2:143\n6#3:142\n13#4,2:144\n15#4,2:148\n1109#5,2:146\n37#6,2:150\n64#7:152\n1855#8,2:153\n*S KotlinDebug\n*F\n+ 1 AddBillOfLadingBottomSheet.kt\nco/bird/android/feature/transferorder/operator/billoflading/AddBillOfLadingBottomSheet\n*L\n75#1:143\n75#1:142\n75#1:144,2\n75#1:148,2\n75#1:146,2\n90#1:150,2\n99#1:152\n105#1:153,2\n*E\n"})
/* renamed from: a7 */
/* loaded from: classes3.dex */
public final class C10571a7 extends AbstractC42224hc5 implements InterfaceC25106k7 {

    /* renamed from: i */
    public static final C10572a f49837i = new C10572a(null);

    /* renamed from: e */
    public C24711j7 f49838e;

    /* renamed from: f */
    public C30234xZ f49839f;

    /* renamed from: g */
    public final C0058AG<List<String>> f49840g;

    /* renamed from: h */
    public final C24567g<Unit> f49841h;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, m28432d2 = {"La7$a;", "", "", "orderId", "Lco/bird/android/model/constant/OperatorOrderViewType;", "type", "La7;", C17296a.f69688o, "ORDER_ID", "Ljava/lang/String;", "ORDER_TYPE", "TAG", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: a7$a */
    /* loaded from: classes3.dex */
    public static final class C10572a {
        public /* synthetic */ C10572a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C10571a7 m71884a(String orderId, OperatorOrderViewType type) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(type, "type");
            C10571a7 c10571a7 = new C10571a7();
            Bundle bundle = new Bundle();
            bundle.putString("orderId", orderId);
            C40749f70.m42020a(bundle, "orderType", type);
            c10571a7.setArguments(bundle);
            return c10571a7;
        }

        private C10572a() {
        }
    }

    public C10571a7() {
        C0058AG<List<String>> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<List<String>>()");
        this.f49840g = m115951g;
        C24567g<Unit> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<Unit>()");
        this.f49841h = m31882w0;
    }

    @Override // p000.InterfaceC25106k7
    /* renamed from: D8 */
    public Observable<List<String>> mo29281D8() {
        Observable<List<String>> hide = this.f49840g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "photoUrlsRelay.hide()");
        return hide;
    }

    @Override // p000.InterfaceC25106k7
    /* renamed from: F4 */
    public Observable<Unit> mo29280F4() {
        C30234xZ c30234xZ = this.f49839f;
        if (c30234xZ == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c30234xZ = null;
        }
        Button button = c30234xZ.f117811j;
        Intrinsics.checkNotNullExpressionValue(button, "binding.submit");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: N6 */
    public final C24711j7 m71888N6() {
        C24711j7 c24711j7 = this.f49838e;
        if (c24711j7 != null) {
            return c24711j7;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // com.uber.autodispose.ScopeProvider
    /* renamed from: T0 */
    public InterfaceC23496h mo231T0() {
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        InterfaceC23496h mo231T0 = m45195i.mo231T0();
        Intrinsics.checkNotNullExpressionValue(mo231T0, "scope(FragmentLifecycleResolver).requestScope()");
        return mo231T0;
    }

    /* renamed from: W3 */
    public final AbstractC23442F<Unit> m71887W3() {
        AbstractC23442F<Unit> m33160F = this.f49841h.m33160F();
        Intrinsics.checkNotNullExpressionValue(m33160F, "bolAddedSubject.hide()");
        return m33160F;
    }

    /* renamed from: a5 */
    public final C48955sx4 m71886a5() {
        FragmentActivity activity = getActivity();
        BaseActivityLite baseActivityLite = activity instanceof BaseActivityLite ? (BaseActivityLite) activity : null;
        if (baseActivityLite != null) {
            return baseActivityLite.m58990F();
        }
        return null;
    }

    @Override // p000.InterfaceC25106k7
    /* renamed from: g */
    public Observable<Unit> mo29279g() {
        C30234xZ c30234xZ = this.f49839f;
        if (c30234xZ == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c30234xZ = null;
        }
        ImageUploadBar imageUploadBar = c30234xZ.f117809h;
        Intrinsics.checkNotNullExpressionValue(imageUploadBar, "binding.imageUploadBar");
        return C44626lf5.clicksThrottle$default(imageUploadBar, 0L, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        List<String> listOfNotNull;
        super.onActivityResult(i, i2, intent);
        if (i == 10026 && i2 == -1 && intent != null && (stringExtra = intent.getStringExtra("photo_url")) != null) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            List<String> value = this.f49840g.getValue();
            if (value == null) {
                value = CollectionsKt__CollectionsKt.emptyList();
            } else {
                Intrinsics.checkNotNullExpressionValue(value, "photoUrlsRelay.value ?: emptyList()");
            }
            spreadBuilder.addSpread(value.toArray(new String[0]));
            spreadBuilder.add(stringExtra);
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(spreadBuilder.toArray(new String[spreadBuilder.size()]));
            if (listOfNotNull != null) {
                this.f49840g.accept(listOfNotNull);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C30234xZ binding = C30234xZ.m5011c(inflater);
        Intrinsics.checkNotNullExpressionValue(binding, "binding");
        this.f49839f = binding;
        return binding.getRoot();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum] */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        OperatorOrderActivity operatorOrderActivity;
        String str;
        boolean equals;
        InterfaceC15803b m56543P;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        OperatorOrderViewType operatorOrderViewType = null;
        if (activity instanceof OperatorOrderActivity) {
            operatorOrderActivity = (OperatorOrderActivity) activity;
        } else {
            operatorOrderActivity = null;
        }
        if (operatorOrderActivity != null && (m56543P = operatorOrderActivity.m56543P()) != null) {
            m56543P.mo56525c(this);
        }
        m71888N6().consume(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("orderId");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            String string = arguments2.getString("orderType");
            if (string != null) {
                try {
                    Object[] enumConstants = OperatorOrderViewType.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants);
                    for (Object obj : enumConstants) {
                        equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), string, true);
                        if (equals) {
                            Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                            operatorOrderViewType = (Enum) obj;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (Exception unused) {
                    Object[] enumConstants2 = OperatorOrderViewType.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants2);
                    for (Object obj2 : enumConstants2) {
                        ?? r4 = (Enum) obj2;
                        if (Intrinsics.areEqual(r4.name(), "UNKNOWN")) {
                            Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                            operatorOrderViewType = r4;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
            operatorOrderViewType = operatorOrderViewType;
        }
        if (str != null) {
            if (operatorOrderViewType != null) {
                m71888N6().m42280h(new JO5(str, operatorOrderViewType));
                return;
            }
            throw new IllegalArgumentException("Cannot retrieve BoL for order without a supplied OperatorOrderViewType".toString());
        }
        throw new IllegalArgumentException("Cannot view BoL for a null order id".toString());
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: t8 */
    public void render(AbstractC25599l7 state) {
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C36803We6) {
            C36803We6 c36803We6 = (C36803We6) state;
            List<String> m78048c = c36803We6.m78048c();
            C30234xZ c30234xZ = this.f49839f;
            String str = null;
            if (c30234xZ == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c30234xZ = null;
            }
            ImageUploadBar imageUploadBar = c30234xZ.f117809h;
            Intrinsics.checkNotNullExpressionValue(imageUploadBar, "binding.imageUploadBar");
            for (String str2 : m78048c) {
                imageUploadBar.m56145s(str2);
            }
            C30234xZ c30234xZ2 = this.f49839f;
            if (c30234xZ2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c30234xZ2 = null;
            }
            c30234xZ2.f117811j.setEnabled(c36803We6.m78049b());
            C30234xZ c30234xZ3 = this.f49839f;
            if (c30234xZ3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c30234xZ3 = null;
            }
            ImageView imageView = c30234xZ3.f117804c;
            FragmentActivity activity = getActivity();
            if (activity == null) {
                return;
            }
            if (c36803We6.m78049b()) {
                i = C48193rg4.ic_check;
            } else {
                i = C48193rg4.ic_x;
            }
            imageView.setImageDrawable(NA0.m94299e(activity, i));
            C30234xZ c30234xZ4 = this.f49839f;
            if (c30234xZ4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c30234xZ4 = null;
            }
            ImageView imageView2 = c30234xZ4.f117804c;
            FragmentActivity activity2 = getActivity();
            if (activity2 == null) {
                return;
            }
            if (c36803We6.m78049b()) {
                i2 = C32364Df4.birdGreen;
            } else {
                i2 = C32364Df4.birdRed;
            }
            imageView2.setImageTintList(ColorStateList.valueOf(NA0.m94301c(activity2, i2)));
            C30234xZ c30234xZ5 = this.f49839f;
            if (c30234xZ5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c30234xZ5 = null;
            }
            TextView textView = c30234xZ5.f117803b;
            FragmentActivity activity3 = getActivity();
            if (activity3 != null) {
                if (c36803We6.m78049b()) {
                    i3 = C45871nl4.yes;
                } else {
                    i3 = C45871nl4.f122703no;
                }
                str = activity3.getString(i3);
            }
            textView.setText(str);
        } else if (state instanceof C37041Xf1) {
            C48955sx4 m71886a5 = m71886a5();
            if (m71886a5 != null) {
                C38689bg5.m64178c(m71886a5, ((C37041Xf1) state).m76725b());
            }
        } else if (state instanceof C46530os0) {
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
            this.f49841h.onSuccess(Unit.INSTANCE);
        }
    }
}
