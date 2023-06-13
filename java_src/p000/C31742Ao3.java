package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC11663c;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.OperatorOrderViewType;
import com.facebook.share.internal.C17296a;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b \u0010!J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0017J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006$"}, m28432d2 = {"LAo3;", "Landroidx/fragment/app/c;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "onStart", "", "getTheme", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "LB31;", "b", "LB31;", "binding", "Lkotlin/Function0;", "c", "Lkotlin/jvm/functions/Function0;", "", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Lazy;", "N6", "()[I", "confettiColors", "<init>", "()V", "e", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorOrderCompletedDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderCompletedDialog.kt\nco/bird/android/feature/transferorder/operator/details/dialogs/OperatorOrderCompletedDialog\n+ 2 Bundle+.kt\nco/bird/android/library/extension/Bundle_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,107:1\n6#2:108\n1#3:109\n13#4,2:110\n15#4,2:114\n1109#5,2:112\n*S KotlinDebug\n*F\n+ 1 OperatorOrderCompletedDialog.kt\nco/bird/android/feature/transferorder/operator/details/dialogs/OperatorOrderCompletedDialog\n*L\n65#1:108\n65#1:109\n65#1:110,2\n65#1:114,2\n65#1:112,2\n*E\n"})
/* renamed from: Ao3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31742Ao3 extends DialogInterface$OnCancelListenerC11663c {

    /* renamed from: e */
    public static final C0222a f1119e = new C0222a(null);

    /* renamed from: b */
    public B31 f1120b;

    /* renamed from: c */
    public Function0<Unit> f1121c = C0225d.f1124g;

    /* renamed from: d */
    public final Lazy f1122d;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LAo3$a;", "", "Lco/bird/android/model/constant/OperatorOrderViewType;", "type", "LAo3;", C17296a.f69688o, "", "CONFETTI_DURATION_MS", "J", "", "HORIZONTAL_MARGIN_DP", "I", "", "TAG", "Ljava/lang/String;", "TYPE", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ao3$a */
    /* loaded from: classes3.dex */
    public static final class C0222a {
        public /* synthetic */ C0222a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C31742Ao3 m115200a(OperatorOrderViewType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            C31742Ao3 c31742Ao3 = new C31742Ao3();
            Bundle bundle = new Bundle();
            C40749f70.m42020a(bundle, "type", type);
            c31742Ao3.setArguments(bundle);
            return c31742Ao3;
        }

        private C0222a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ao3$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0223b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OperatorOrderViewType.values().length];
            try {
                iArr[OperatorOrderViewType.DROP_OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OperatorOrderViewType.LONGTAIL_RETURN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OperatorOrderViewType.PICK_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OperatorOrderViewType.LONGTAIL_DELIVERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0015\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "b", "()[I"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ao3$c */
    /* loaded from: classes3.dex */
    public static final class C0224c extends Lambda implements Function0<int[]> {
        public C0224c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final int[] invoke() {
            FragmentActivity activity = C31742Ao3.this.getActivity();
            return activity == null ? new int[0] : new int[]{C40788fB0.m41776f(activity, C32364Df4.birdBlue), C40788fB0.m41776f(activity, C32364Df4.birdGold), C40788fB0.m41776f(activity, C32364Df4.birdMint), C40788fB0.m41776f(activity, C32364Df4.birdRed), C40788fB0.m41776f(activity, C32364Df4.birdTeal), C40788fB0.m41776f(activity, C32364Df4.birdViolet)};
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ao3$d */
    /* loaded from: classes3.dex */
    public static final class C0225d extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public static final C0225d f1124g = new C0225d();

        public C0225d() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ao3$e */
    /* loaded from: classes3.dex */
    public static final class C0226e extends Lambda implements Function1<View, Unit> {
        public C0226e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            Dialog dialog = C31742Ao3.this.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public C31742Ao3() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C0224c());
        this.f1122d = lazy;
    }

    /* renamed from: t8 */
    public static final void m115201t8(C31742Ao3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        B31 b31 = this$0.f1120b;
        if (b31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            b31 = null;
        }
        C48279rp0.m15321e(b31.f1570d, this$0.m115203N6()).m15320f(5000L);
    }

    /* renamed from: N6 */
    public final int[] m115203N6() {
        return (int[]) this.f1122d.getValue();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public int getTheme() {
        return C32184Cl4.RoundedDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return B31.m114769c(getLayoutInflater(), viewGroup, false).getRoot();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        this.f1121c.invoke();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        int i;
        Resources resources;
        DisplayMetrics displayMetrics;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            FragmentActivity activity = getActivity();
            if (activity != null && (resources = activity.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                i = displayMetrics.widthPixels - ((int) C49347td3.m12001b(32));
            } else {
                i = -2;
            }
            window.setLayout(i, -2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        OperatorOrderViewType operatorOrderViewType;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        Enum r8;
        boolean equals;
        Intrinsics.checkNotNullParameter(view, "view");
        B31 m114771a = B31.m114771a(view);
        Intrinsics.checkNotNullExpressionValue(m114771a, "bind(view)");
        this.f1120b = m114771a;
        B31 b31 = null;
        if (m114771a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m114771a = null;
        }
        Button button = m114771a.f1569c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.complete");
        C34585Ms2.m94661j(button, new C0226e());
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("type");
            if (string != null) {
                try {
                    Object[] enumConstants = OperatorOrderViewType.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants);
                    for (Object obj : enumConstants) {
                        equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), string, true);
                        if (equals) {
                            Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                            r8 = (Enum) obj;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (Exception unused) {
                    Object[] enumConstants2 = OperatorOrderViewType.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants2);
                    for (Object obj2 : enumConstants2) {
                        r8 = (Enum) obj2;
                        if (Intrinsics.areEqual(r8.name(), "UNKNOWN")) {
                            Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
            r8 = null;
            operatorOrderViewType = (OperatorOrderViewType) r8;
        } else {
            operatorOrderViewType = null;
        }
        if (operatorOrderViewType == null) {
            i = -1;
        } else {
            i = C0223b.$EnumSwitchMapping$0[operatorOrderViewType.ordinal()];
        }
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                B31 b312 = this.f1120b;
                if (b312 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    b312 = null;
                }
                TextView textView = b312.f1572f;
                Context context = getContext();
                if (context != null) {
                    str3 = context.getString(C45871nl4.transfer_orders_pickup_complete_title);
                } else {
                    str3 = null;
                }
                textView.setText(str3);
                B31 b313 = this.f1120b;
                if (b313 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    b313 = null;
                }
                TextView textView2 = b313.f1568b;
                Context context2 = getContext();
                if (context2 != null) {
                    str4 = context2.getString(C45871nl4.transfer_orders_pickup_complete_body);
                } else {
                    str4 = null;
                }
                textView2.setText(str4);
            }
        } else {
            B31 b314 = this.f1120b;
            if (b314 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                b314 = null;
            }
            TextView textView3 = b314.f1572f;
            Context context3 = getContext();
            if (context3 != null) {
                str = context3.getString(C45871nl4.transfer_orders_return_complete_title);
            } else {
                str = null;
            }
            textView3.setText(str);
            B31 b315 = this.f1120b;
            if (b315 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                b315 = null;
            }
            TextView textView4 = b315.f1568b;
            Context context4 = getContext();
            if (context4 != null) {
                str2 = context4.getString(C45871nl4.transfer_orders_return_complete_body);
            } else {
                str2 = null;
            }
            textView4.setText(str2);
        }
        B31 b316 = this.f1120b;
        if (b316 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            b31 = b316;
        }
        b31.f1570d.post(new Runnable() { // from class: zo3
            @Override // java.lang.Runnable
            public final void run() {
                C31742Ao3.m115201t8(C31742Ao3.this);
            }
        });
    }
}
