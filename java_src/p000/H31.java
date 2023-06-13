package p000;

import android.view.View;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H&J*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H&JÐ\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\u0019\b\u0002\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00040\u001d¢\u0006\u0002\b\u001fH&¢\u0006\u0004\b\r\u0010!J2\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150$2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\"2\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0019H&J*\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020&2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H&Jy\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\n2\u0006\u0010\u001a\u001a\u00020\u00152\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00152\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00152\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010,\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u0007H&¢\u0006\u0004\b/\u00100Jf\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001012\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001012\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0015H&Jf\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001012\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001012\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0015H&Jf\u00109\u001a\u0002082\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001012\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001012\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0015H&J\u0089\u0001\u00107\u001a\u00020\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001012\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001012\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000101H&¢\u0006\u0004\b7\u0010:Jÿ\u0001\u0010J\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\n\b\u0003\u0010;\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010<\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010=\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0003\u0010>\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010?\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00192\b\b\u0001\u0010B\u001a\u00020\u000e2\n\b\u0003\u0010C\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001012\u0010\b\u0002\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001012\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001012\u0010\b\u0002\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001012\b\b\u0002\u0010I\u001a\u00020\u0007H&¢\u0006\u0004\bJ\u0010KJý\u0001\u0010J\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u001e2\n\b\u0003\u0010;\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010<\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010=\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0003\u0010>\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010?\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00192\b\b\u0001\u0010B\u001a\u00020\u000e2\n\b\u0003\u0010C\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001012\u0010\b\u0002\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001012\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001012\u0010\b\u0002\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001012\b\b\u0002\u0010I\u001a\u00020\u0007H&¢\u0006\u0004\bJ\u0010MJ)\u0010O\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00062\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\bO\u0010PJ^\u0010Z\u001a\u00020\u00042\u0006\u0010R\u001a\u00020Q2:\b\u0002\u0010X\u001a4\u0012\u0013\u0012\u00110\u0015¢\u0006\f\bT\u0012\b\bU\u0012\u0004\b\b(V\u0012\u0013\u0012\u00110\u0015¢\u0006\f\bT\u0012\b\bU\u0012\u0004\b\b(W\u0012\u0004\u0012\u00020\u0004\u0018\u00010S2\u0010\b\u0002\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000101H&J\b\u0010[\u001a\u00020\u0004H&J3\u0010_\u001a\u00020\u00072\"\u0010^\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060]0\\\"\n\u0012\u0006\b\u0001\u0012\u00020\u00060]H&¢\u0006\u0004\b_\u0010`¨\u0006b"}, m28432d2 = {"LH31;", "", "Lo12;", "alert", "", "showIndeterminateDialog", "LNy;", "", "cancelable", "withHapticFeedback", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "birdDialog", "dialog", "", "customLayout", "positiveButton", "negativeButton", "titleIcon", "titleLabel", "messageLabel", "", "positiveText", "negativeText", "titleIconRes", "", "title", "message", "wrapInScrollView", "Lkotlin/Function1;", "Landroid/view/View;", "Lkotlin/ExtensionFunctionType;", "viewSetup", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZZLkotlin/jvm/functions/Function1;)Lio/reactivex/F;", "", "selections", "Lio/reactivex/p;", "selectorDialog", "Lf9;", "agreementDialog", "content", "hint", "prefill", "inputType", "allowEmptyInput", "singleLine", "LH31$b;", "dialogWithInput", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZZ)Lio/reactivex/F;", "Lkotlin/Function0;", "onOk", "onCancel", "onDismiss", "secondaryMessage", "showBirdDialog", "showDialog", "Lio/reactivex/c;", "showDialogCompletable", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/Integer;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "icon", "iconRes", "transparentBackground", "header", "body", "headerText", "bodyText", "primaryButton", "secondaryButton", "primaryButtonText", "secondaryButtonText", "onPrimary", "onSecondary", "onShow", "dismissOnButtonClick", "showCustomDialog", "(ILjava/lang/Integer;Ljava/lang/Integer;ZZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "customView", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;ZZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "bottomSheetLayoutOverrideRes", "showBottomSheetAlert", "(LNy;Ljava/lang/Integer;)Lio/reactivex/F;", "", "e", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "errorKind", "errorDesc", "fireTrackEvent", "onNonRetrofitException", "showRetrofitExceptionDialog", "dismissDialog", "", "Lkotlin/reflect/KClass;", "dialogClasses", "dismissIfCurrentDialogIsInstanceOf", "([Lkotlin/reflect/KClass;)Z", "b", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: H31 */
/* loaded from: classes2.dex */
public interface H31 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: H31$a */
    /* loaded from: classes2.dex */
    public static final class C3014a {

        @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: H31$a$a */
        /* loaded from: classes2.dex */
        public static final class C3015a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public static final C3015a f12781g = new C3015a();

            public C3015a() {
                super(1);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Intrinsics.checkNotNullParameter(view, "$this$null");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }
        }

        public static /* synthetic */ AbstractC23442F agreementDialog$default(H31 h31, AbstractC20244f9 abstractC20244f9, boolean z, boolean z2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                if ((i & 4) != 0) {
                    z2 = false;
                }
                return h31.agreementDialog(abstractC20244f9, z, z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: agreementDialog");
        }

        public static /* synthetic */ AbstractC23442F birdDialog$default(H31 h31, AbstractC5751Ny abstractC5751Ny, boolean z, boolean z2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                if ((i & 4) != 0) {
                    z2 = false;
                }
                return h31.birdDialog(abstractC5751Ny, z, z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: birdDialog");
        }

        public static /* synthetic */ AbstractC23442F dialog$default(H31 h31, AbstractC5751Ny abstractC5751Ny, boolean z, boolean z2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                if ((i & 4) != 0) {
                    z2 = false;
                }
                return h31.dialog(abstractC5751Ny, z, z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dialog");
        }

        public static /* synthetic */ AbstractC23442F dialogWithInput$default(H31 h31, String str, String str2, String str3, String str4, Integer num, String str5, String str6, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if (obj == null) {
                return h31.dialogWithInput(str, (i & 2) != 0 ? null : str2, str3, str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? true : z3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dialogWithInput");
        }

        public static /* synthetic */ AbstractC24507p selectorDialog$default(H31 h31, List list, boolean z, CharSequence charSequence, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                if ((i & 4) != 0) {
                    charSequence = null;
                }
                return h31.selectorDialog(list, z, charSequence);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectorDialog");
        }

        public static /* synthetic */ void showBirdDialog$default(H31 h31, AbstractC5751Ny abstractC5751Ny, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showBirdDialog");
            }
            h31.showBirdDialog(abstractC5751Ny, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? null : function02, (i & 32) != 0 ? null : function03, (i & 64) == 0 ? str : null);
        }

        public static /* synthetic */ AbstractC23442F showBottomSheetAlert$default(H31 h31, AbstractC5751Ny abstractC5751Ny, Integer num, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    num = null;
                }
                return h31.showBottomSheetAlert(abstractC5751Ny, num);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showBottomSheetAlert");
        }

        public static /* synthetic */ void showCustomDialog$default(H31 h31, int i, Integer num, Integer num2, boolean z, boolean z2, boolean z3, Integer num3, Integer num4, CharSequence charSequence, CharSequence charSequence2, int i2, Integer num5, String str, String str2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, boolean z4, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showCustomDialog");
            }
            h31.showCustomDialog(i, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? null : num2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? true : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? null : num3, (i3 & 128) != 0 ? null : num4, (i3 & 256) != 0 ? null : charSequence, (i3 & 512) != 0 ? null : charSequence2, i2, (i3 & 2048) != 0 ? null : num5, (i3 & 4096) != 0 ? null : str, (i3 & 8192) != 0 ? null : str2, (i3 & 16384) != 0 ? null : function0, (32768 & i3) != 0 ? null : function02, (65536 & i3) != 0 ? null : function03, (131072 & i3) != 0 ? null : function04, (i3 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? true : z4);
        }

        public static /* synthetic */ void showDialog$default(H31 h31, AbstractC5751Ny abstractC5751Ny, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showDialog");
            }
            h31.showDialog(abstractC5751Ny, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? null : function02, (i & 32) != 0 ? null : function03, (i & 64) == 0 ? str : null);
        }

        public static /* synthetic */ AbstractC23461c showDialogCompletable$default(H31 h31, AbstractC5751Ny abstractC5751Ny, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, String str, int i, Object obj) {
            if (obj == null) {
                return h31.showDialogCompletable(abstractC5751Ny, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? null : function02, (i & 32) != 0 ? null : function03, (i & 64) == 0 ? str : null);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showDialogCompletable");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showRetrofitExceptionDialog$default(H31 h31, Throwable th, Function2 function2, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showRetrofitExceptionDialog");
            }
            if ((i & 2) != 0) {
                function2 = null;
            }
            if ((i & 4) != 0) {
                function0 = null;
            }
            h31.showRetrofitExceptionDialog(th, function2, function0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC23442F dialog$default(H31 h31, int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, Integer num6, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, boolean z3, Function1 function1, int i2, Object obj) {
            if (obj == null) {
                return h31.dialog(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : num3, (i2 & 16) != 0 ? null : num4, (i2 & 32) != 0 ? null : num5, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? null : str2, (i2 & 256) != 0 ? null : num6, (i2 & 512) != 0 ? null : charSequence, (i2 & 1024) == 0 ? charSequence2 : null, (i2 & 2048) != 0 ? true : z, (i2 & 4096) != 0 ? false : z2, (i2 & 8192) == 0 ? z3 : false, (i2 & 16384) != 0 ? C3015a.f12781g : function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dialog");
        }

        public static /* synthetic */ void showCustomDialog$default(H31 h31, View view, Integer num, Integer num2, boolean z, boolean z2, boolean z3, Integer num3, Integer num4, CharSequence charSequence, CharSequence charSequence2, int i, Integer num5, String str, String str2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, boolean z4, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showCustomDialog");
            }
            h31.showCustomDialog(view, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? false : z3, (i2 & 64) != 0 ? null : num3, (i2 & 128) != 0 ? null : num4, (i2 & 256) != 0 ? null : charSequence, (i2 & 512) != 0 ? null : charSequence2, i, (i2 & 2048) != 0 ? null : num5, (i2 & 4096) != 0 ? null : str, (i2 & 8192) != 0 ? null : str2, (i2 & 16384) != 0 ? null : function0, (32768 & i2) != 0 ? null : function02, (65536 & i2) != 0 ? null : function03, (131072 & i2) != 0 ? null : function04, (i2 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? true : z4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showDialog$default(H31 h31, CharSequence charSequence, CharSequence charSequence2, Integer num, Integer num2, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showDialog");
            }
            if ((i & 1) != 0) {
                charSequence = null;
            }
            if ((i & 2) != 0) {
                charSequence2 = null;
            }
            if ((i & 4) != 0) {
                num = 17039370;
            }
            if ((i & 8) != 0) {
                num2 = null;
            }
            if ((i & 16) != 0) {
                z = true;
            }
            if ((i & 32) != 0) {
                z2 = false;
            }
            if ((i & 64) != 0) {
                function0 = null;
            }
            if ((i & 128) != 0) {
                function02 = null;
            }
            if ((i & 256) != 0) {
                function03 = null;
            }
            h31.showDialog(charSequence, charSequence2, num, num2, z, z2, function0, function02, function03);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m28432d2 = {"LH31$b;", "", "<init>", "()V", C17296a.f69688o, "b", "c", "LH31$b$a;", "LH31$b$b;", "LH31$b$c;", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: H31$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC3016b {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LH31$b$a;", "LH31$b;", "<init>", "()V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: H31$b$a */
        /* loaded from: classes2.dex */
        public static final class C3017a extends AbstractC3016b {

            /* renamed from: a */
            public static final C3017a f12782a = new C3017a();

            private C3017a() {
                super(null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LH31$b$b;", "LH31$b;", "<init>", "()V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: H31$b$b */
        /* loaded from: classes2.dex */
        public static final class C3018b extends AbstractC3016b {

            /* renamed from: a */
            public static final C3018b f12783a = new C3018b();

            private C3018b() {
                super(null);
            }
        }

        @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"LH31$b$c;", "LH31$b;", "", "input", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: H31$b$c */
        /* loaded from: classes2.dex */
        public static final class C3019c extends AbstractC3016b {

            /* renamed from: a */
            public final String f12784a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3019c(String input) {
                super(null);
                Intrinsics.checkNotNullParameter(input, "input");
                this.f12784a = input;
            }

            public static /* synthetic */ C3019c copy$default(C3019c c3019c, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c3019c.f12784a;
                }
                return c3019c.m104471a(str);
            }

            /* renamed from: a */
            public final C3019c m104471a(String input) {
                Intrinsics.checkNotNullParameter(input, "input");
                return new C3019c(input);
            }

            /* renamed from: b */
            public final String m104470b() {
                return this.f12784a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3019c) && Intrinsics.areEqual(this.f12784a, ((C3019c) obj).f12784a);
            }

            public int hashCode() {
                return this.f12784a.hashCode();
            }

            public String toString() {
                String str = this.f12784a;
                return "Ok(input=" + str + ")";
            }
        }

        public /* synthetic */ AbstractC3016b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC3016b() {
        }
    }

    AbstractC23442F<DialogResponse> agreementDialog(AbstractC20244f9 abstractC20244f9, boolean z, boolean z2);

    AbstractC23442F<DialogResponse> birdDialog(AbstractC5751Ny abstractC5751Ny, boolean z, boolean z2);

    AbstractC23442F<DialogResponse> dialog(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, Integer num6, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, boolean z3, Function1<? super View, Unit> function1);

    AbstractC23442F<DialogResponse> dialog(AbstractC5751Ny abstractC5751Ny, boolean z, boolean z2);

    AbstractC23442F<AbstractC3016b> dialogWithInput(String str, String str2, String str3, String str4, Integer num, String str5, String str6, boolean z, boolean z2, boolean z3);

    void dismissDialog();

    boolean dismissIfCurrentDialogIsInstanceOf(KClass<? extends AbstractC5751Ny>... kClassArr);

    AbstractC24507p<String> selectorDialog(List<String> list, boolean z, CharSequence charSequence);

    void showBirdDialog(AbstractC5751Ny abstractC5751Ny, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, String str);

    AbstractC23442F<DialogResponse> showBottomSheetAlert(AbstractC5751Ny abstractC5751Ny, Integer num);

    void showCustomDialog(int i, Integer num, Integer num2, boolean z, boolean z2, boolean z3, Integer num3, Integer num4, CharSequence charSequence, CharSequence charSequence2, int i2, Integer num5, String str, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, boolean z4);

    void showCustomDialog(View view, Integer num, Integer num2, boolean z, boolean z2, boolean z3, Integer num3, Integer num4, CharSequence charSequence, CharSequence charSequence2, int i, Integer num5, String str, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, boolean z4);

    void showDialog(AbstractC5751Ny abstractC5751Ny, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, String str);

    void showDialog(CharSequence charSequence, CharSequence charSequence2, Integer num, Integer num2, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03);

    AbstractC23461c showDialogCompletable(AbstractC5751Ny abstractC5751Ny, boolean z, boolean z2, Function0<? extends AbstractC23461c> function0, Function0<? extends AbstractC23461c> function02, Function0<? extends AbstractC23461c> function03, String str);

    void showIndeterminateDialog(AbstractC46028o12 abstractC46028o12);

    void showRetrofitExceptionDialog(Throwable th, Function2<? super String, ? super String, Unit> function2, Function0<Unit> function0);
}
