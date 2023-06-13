package com.stripe.android.paymentsheet.p047ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.p003ui.platform.ComposeView;
import androidx.compose.p003ui.platform.InterfaceC11435k;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.databinding.PrimaryButtonBinding;
import com.stripe.android.paymentsheet.p047ui.PrimaryButton;
import com.stripe.android.uicore.PrimaryButtonStyle;
import com.stripe.android.uicore.StripeThemeDefaults;
import com.stripe.android.uicore.StripeThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002IJB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u00103\u001a\u0004\u0018\u0001042\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0016\u00105\u001a\u0002062\f\u00107\u001a\b\u0012\u0004\u0012\u00020608H\u0002J\b\u00109\u001a\u000206H\u0002J\b\u0010:\u001a\u000206H\u0002J\u0018\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0012J\u0012\u0010?\u001a\u0002062\b\u0010>\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010@\u001a\u0002062\u0006\u0010A\u001a\u00020&H\u0016J\u0012\u0010B\u001a\u0002062\b\u0010C\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010D\u001a\u000206H\u0002J\u0010\u0010E\u001a\u0002062\b\u0010,\u001a\u0004\u0018\u00010-J\u0010\u0010F\u001a\u0002062\b\u0010G\u001a\u0004\u0018\u00010HR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R&\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0010\u0010+\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010.\u001a\u00020/8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u0014\u001a\u0004\b1\u00102¨\u0006K"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton;", "Landroid/widget/FrameLayout;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animator", "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;", "borderStrokeColor", "borderStrokeWidth", "", "confirmedIcon", "Landroid/widget/ImageView;", "cornerRadius", "defaultTintList", "Landroid/content/res/ColorStateList;", "getDefaultTintList$paymentsheet_release$annotations", "()V", "getDefaultTintList$paymentsheet_release", "()Landroid/content/res/ColorStateList;", "setDefaultTintList$paymentsheet_release", "(Landroid/content/res/ColorStateList;)V", "externalLabel", "", "getExternalLabel$paymentsheet_release$annotations", "getExternalLabel$paymentsheet_release", "()Ljava/lang/String;", "setExternalLabel$paymentsheet_release", "(Ljava/lang/String;)V", "finishedBackgroundColor", "getFinishedBackgroundColor$paymentsheet_release", "()I", "setFinishedBackgroundColor$paymentsheet_release", "(I)V", "lockVisible", "", "getLockVisible$paymentsheet_release", "()Z", "setLockVisible$paymentsheet_release", "(Z)V", "originalLabel", TransferTable.COLUMN_STATE, "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "viewBinding", "Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;", "getViewBinding$paymentsheet_release$annotations", "getViewBinding$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;", "getTextAttributeValue", "", "onFinishProcessing", "", "onAnimationEnd", "Lkotlin/Function0;", "onReadyState", "onStartProcessing", "setAppearanceConfiguration", "primaryButtonStyle", "Lcom/stripe/android/uicore/PrimaryButtonStyle;", "tintList", "setBackgroundTintList", "setEnabled", "enabled", "setLabel", Entry.TYPE_TEXT, "updateAlpha", "updateState", "updateUiState", "uiState", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "State", "UIState", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/paymentsheet/ui/PrimaryButton\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 Context.kt\nandroidx/core/content/ContextKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,254:1\n174#2:255\n174#2:256\n174#2:257\n174#2:258\n177#3,2:259\n262#3,2:270\n262#3,2:272\n262#3,2:274\n262#3,2:276\n262#3,2:278\n52#4,9:261\n1855#5,2:280\n*S KotlinDebug\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/paymentsheet/ui/PrimaryButton\n*L\n62#1:255\n65#1:256\n93#1:257\n94#1:258\n111#1:259,2\n149#1:270,2\n150#1:272,2\n154#1:274,2\n155#1:276,2\n180#1:278,2\n120#1:261,9\n216#1:280,2\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.PrimaryButton */
/* loaded from: classes7.dex */
public final class PrimaryButton extends FrameLayout {
    private final PrimaryButtonAnimator animator;
    private int borderStrokeColor;
    private float borderStrokeWidth;
    private final ImageView confirmedIcon;
    private float cornerRadius;
    private ColorStateList defaultTintList;
    private String externalLabel;
    private int finishedBackgroundColor;
    private boolean lockVisible;
    private String originalLabel;
    private State state;
    private final PrimaryButtonBinding viewBinding;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "", "()V", "FinishProcessing", "Ready", "StartProcessing", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.PrimaryButton$State */
    /* loaded from: classes7.dex */
    public static abstract class State {

        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "onComplete", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getOnComplete", "()Lkotlin/jvm/functions/Function0;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.paymentsheet.ui.PrimaryButton$State$FinishProcessing */
        /* loaded from: classes7.dex */
        public static final class FinishProcessing extends State {
            public static final int $stable = 0;
            private final Function0<Unit> onComplete;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FinishProcessing(Function0<Unit> onComplete) {
                super(null);
                Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                this.onComplete = onComplete;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ FinishProcessing copy$default(FinishProcessing finishProcessing, Function0 function0, int i, Object obj) {
                if ((i & 1) != 0) {
                    function0 = finishProcessing.onComplete;
                }
                return finishProcessing.copy(function0);
            }

            public final Function0<Unit> component1() {
                return this.onComplete;
            }

            public final FinishProcessing copy(Function0<Unit> onComplete) {
                Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                return new FinishProcessing(onComplete);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FinishProcessing) && Intrinsics.areEqual(this.onComplete, ((FinishProcessing) obj).onComplete);
            }

            public final Function0<Unit> getOnComplete() {
                return this.onComplete;
            }

            public int hashCode() {
                return this.onComplete.hashCode();
            }

            public String toString() {
                Function0<Unit> function0 = this.onComplete;
                return "FinishProcessing(onComplete=" + function0 + ")";
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.paymentsheet.ui.PrimaryButton$State$Ready */
        /* loaded from: classes7.dex */
        public static final class Ready extends State {
            public static final int $stable = 0;
            public static final Ready INSTANCE = new Ready();

            private Ready() {
                super(null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.paymentsheet.ui.PrimaryButton$State$StartProcessing */
        /* loaded from: classes7.dex */
        public static final class StartProcessing extends State {
            public static final int $stable = 0;
            public static final StartProcessing INSTANCE = new StartProcessing();

            private StartProcessing() {
                super(null);
            }
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private State() {
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "", "label", "", "onClick", "Lkotlin/Function0;", "", "enabled", "", "lockVisible", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZ)V", "getEnabled", "()Z", "getLabel", "()Ljava/lang/String;", "getLockVisible", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.PrimaryButton$UIState */
    /* loaded from: classes7.dex */
    public static final class UIState {
        private final boolean enabled;
        private final String label;
        private final boolean lockVisible;
        private final Function0<Unit> onClick;

        public UIState(String label, Function0<Unit> onClick, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.label = label;
            this.onClick = onClick;
            this.enabled = z;
            this.lockVisible = z2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UIState copy$default(UIState uIState, String str, Function0 function0, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uIState.label;
            }
            if ((i & 2) != 0) {
                function0 = uIState.onClick;
            }
            if ((i & 4) != 0) {
                z = uIState.enabled;
            }
            if ((i & 8) != 0) {
                z2 = uIState.lockVisible;
            }
            return uIState.copy(str, function0, z, z2);
        }

        public final String component1() {
            return this.label;
        }

        public final Function0<Unit> component2() {
            return this.onClick;
        }

        public final boolean component3() {
            return this.enabled;
        }

        public final boolean component4() {
            return this.lockVisible;
        }

        public final UIState copy(String label, Function0<Unit> onClick, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            return new UIState(label, onClick, z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UIState) {
                UIState uIState = (UIState) obj;
                return Intrinsics.areEqual(this.label, uIState.label) && Intrinsics.areEqual(this.onClick, uIState.onClick) && this.enabled == uIState.enabled && this.lockVisible == uIState.lockVisible;
            }
            return false;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final String getLabel() {
            return this.label;
        }

        public final boolean getLockVisible() {
            return this.lockVisible;
        }

        public final Function0<Unit> getOnClick() {
            return this.onClick;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.label.hashCode() * 31) + this.onClick.hashCode()) * 31;
            boolean z = this.enabled;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            boolean z2 = this.lockVisible;
            return i2 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public String toString() {
            String str = this.label;
            Function0<Unit> function0 = this.onClick;
            boolean z = this.enabled;
            boolean z2 = this.lockVisible;
            return "UIState(label=" + str + ", onClick=" + function0 + ", enabled=" + z + ", lockVisible=" + z2 + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrimaryButton(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getDefaultTintList$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getExternalLabel$paymentsheet_release$annotations() {
    }

    private final CharSequence getTextAttributeValue(AttributeSet attributeSet) {
        List listOf;
        int[] intArray;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        listOf = CollectionsKt__CollectionsJVMKt.listOf(16843087);
        intArray = CollectionsKt___CollectionsKt.toIntArray(listOf);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, intArray, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        CharSequence text = obtainStyledAttributes.getText(0);
        obtainStyledAttributes.recycle();
        return text;
    }

    public static /* synthetic */ void getViewBinding$paymentsheet_release$annotations() {
    }

    private final void onFinishProcessing(Function0<Unit> function0) {
        setClickable(false);
        setBackgroundTintList(ColorStateList.valueOf(this.finishedBackgroundColor));
        PrimaryButtonAnimator primaryButtonAnimator = this.animator;
        ComposeView composeView = this.viewBinding.label;
        Intrinsics.checkNotNullExpressionValue(composeView, "viewBinding.label");
        primaryButtonAnimator.fadeOut$paymentsheet_release(composeView);
        PrimaryButtonAnimator primaryButtonAnimator2 = this.animator;
        CircularProgressIndicator circularProgressIndicator = this.viewBinding.confirmingIcon;
        Intrinsics.checkNotNullExpressionValue(circularProgressIndicator, "viewBinding.confirmingIcon");
        primaryButtonAnimator2.fadeOut$paymentsheet_release(circularProgressIndicator);
        this.animator.fadeIn$paymentsheet_release(this.confirmedIcon, getWidth(), new PrimaryButton$onFinishProcessing$1(function0));
    }

    private final void onReadyState() {
        int i;
        setClickable(true);
        String str = this.originalLabel;
        if (str != null) {
            setLabel(str);
        }
        ColorStateList colorStateList = this.defaultTintList;
        if (colorStateList != null) {
            setBackgroundTintList(colorStateList);
        }
        ImageView imageView = this.viewBinding.lockIcon;
        Intrinsics.checkNotNullExpressionValue(imageView, "viewBinding.lockIcon");
        if (this.lockVisible) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        CircularProgressIndicator circularProgressIndicator = this.viewBinding.confirmingIcon;
        Intrinsics.checkNotNullExpressionValue(circularProgressIndicator, "viewBinding.confirmingIcon");
        circularProgressIndicator.setVisibility(8);
    }

    private final void onStartProcessing() {
        ImageView imageView = this.viewBinding.lockIcon;
        Intrinsics.checkNotNullExpressionValue(imageView, "viewBinding.lockIcon");
        imageView.setVisibility(8);
        CircularProgressIndicator circularProgressIndicator = this.viewBinding.confirmingIcon;
        Intrinsics.checkNotNullExpressionValue(circularProgressIndicator, "viewBinding.confirmingIcon");
        circularProgressIndicator.setVisibility(0);
        setClickable(false);
        setLabel(getResources().getString(C19159R.string.stripe_paymentsheet_primary_button_processing));
    }

    private final void setLabel(String str) {
        this.externalLabel = str;
        if (str != null) {
            if (!(this.state instanceof State.StartProcessing)) {
                this.originalLabel = str;
            }
            this.viewBinding.label.setContent(C43575jt0.m29790c(1242711877, true, new PrimaryButton$setLabel$1$1(str)));
        }
    }

    private final void updateAlpha() {
        List<View> listOf;
        float f;
        ComposeView composeView = this.viewBinding.label;
        Intrinsics.checkNotNullExpressionValue(composeView, "viewBinding.label");
        ImageView imageView = this.viewBinding.lockIcon;
        Intrinsics.checkNotNullExpressionValue(imageView, "viewBinding.lockIcon");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new View[]{composeView, imageView});
        for (View view : listOf) {
            State state = this.state;
            if ((state == null || (state instanceof State.Ready)) && !isEnabled()) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
            view.setAlpha(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUiState$lambda$5(UIState uIState, View view) {
        uIState.getOnClick().invoke();
    }

    public final ColorStateList getDefaultTintList$paymentsheet_release() {
        return this.defaultTintList;
    }

    public final String getExternalLabel$paymentsheet_release() {
        return this.externalLabel;
    }

    public final int getFinishedBackgroundColor$paymentsheet_release() {
        return this.finishedBackgroundColor;
    }

    public final boolean getLockVisible$paymentsheet_release() {
        return this.lockVisible;
    }

    public final PrimaryButtonBinding getViewBinding$paymentsheet_release() {
        return this.viewBinding;
    }

    public final void setAppearanceConfiguration(PrimaryButtonStyle primaryButtonStyle, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(primaryButtonStyle, "primaryButtonStyle");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.cornerRadius = StripeThemeKt.m116708convertDpToPx3ABfNKs(context, C43705k61.m29303g(primaryButtonStyle.getShape().getCornerRadius()));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.borderStrokeWidth = StripeThemeKt.m116708convertDpToPx3ABfNKs(context2, C43705k61.m29303g(primaryButtonStyle.getShape().getBorderStrokeWidth()));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        this.borderStrokeColor = StripeThemeKt.getBorderStrokeColor(primaryButtonStyle, context3);
        ImageView imageView = this.viewBinding.lockIcon;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        imageView.setImageTintList(ColorStateList.valueOf(StripeThemeKt.getOnBackgroundColor(primaryButtonStyle, context4)));
        this.defaultTintList = colorStateList;
        setBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.cornerRadius);
        gradientDrawable.setColor(colorStateList);
        gradientDrawable.setStroke((int) this.borderStrokeWidth, this.borderStrokeColor);
        setBackground(gradientDrawable);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C19159R.dimen.stripe_paymentsheet_primary_button_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public final void setDefaultTintList$paymentsheet_release(ColorStateList colorStateList) {
        this.defaultTintList = colorStateList;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        updateAlpha();
    }

    public final void setExternalLabel$paymentsheet_release(String str) {
        this.externalLabel = str;
    }

    public final void setFinishedBackgroundColor$paymentsheet_release(int i) {
        this.finishedBackgroundColor = i;
    }

    public final void setLockVisible$paymentsheet_release(boolean z) {
        this.lockVisible = z;
    }

    public final void updateState(State state) {
        this.state = state;
        updateAlpha();
        if (state instanceof State.Ready) {
            onReadyState();
        } else if (Intrinsics.areEqual(state, State.StartProcessing.INSTANCE)) {
            onStartProcessing();
        } else if (state instanceof State.FinishProcessing) {
            onFinishProcessing(((State.FinishProcessing) state).getOnComplete());
        }
    }

    public final void updateUiState(final UIState uIState) {
        boolean z;
        int i = 0;
        if (uIState != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        setVisibility(i);
        if (uIState != null) {
            State state = this.state;
            if (!(state instanceof State.StartProcessing) && !(state instanceof State.FinishProcessing)) {
                setLabel(uIState.getLabel());
            }
            setEnabled(uIState.getEnabled());
            this.lockVisible = uIState.getLockVisible();
            setOnClickListener(new View.OnClickListener() { // from class: y24
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PrimaryButton.updateUiState$lambda$5(PrimaryButton.UIState.this, view);
                }
            });
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrimaryButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PrimaryButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrimaryButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.animator = new PrimaryButtonAnimator(context);
        PrimaryButtonBinding inflate = PrimaryButtonBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n        LayoutI…text),\n        this\n    )");
        this.viewBinding = inflate;
        this.lockVisible = true;
        ImageView imageView = inflate.confirmedIcon;
        Intrinsics.checkNotNullExpressionValue(imageView, "viewBinding.confirmedIcon");
        this.confirmedIcon = imageView;
        StripeThemeDefaults stripeThemeDefaults = StripeThemeDefaults.INSTANCE;
        this.cornerRadius = StripeThemeKt.m116708convertDpToPx3ABfNKs(context, C43705k61.m29303g(stripeThemeDefaults.getPrimaryButtonStyle().getShape().getCornerRadius()));
        this.borderStrokeWidth = StripeThemeKt.m116708convertDpToPx3ABfNKs(context, C43705k61.m29303g(stripeThemeDefaults.getPrimaryButtonStyle().getShape().getBorderStrokeWidth()));
        this.borderStrokeColor = StripeThemeKt.getBorderStrokeColor(stripeThemeDefaults.getPrimaryButtonStyle(), context);
        this.finishedBackgroundColor = NA0.m94301c(context, C19159R.color.stripe_paymentsheet_primary_button_success_background);
        inflate.label.setViewCompositionStrategy(InterfaceC11435k.C11441c.f53394b);
        CharSequence textAttributeValue = getTextAttributeValue(attributeSet);
        if (textAttributeValue != null) {
            setLabel(textAttributeValue.toString());
        }
        setClickable(true);
        setEnabled(false);
    }
}
