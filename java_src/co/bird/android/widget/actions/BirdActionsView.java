package co.bird.android.widget.actions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.transition.C12055c;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.VehicleSpeedMode;
import co.bird.android.widget.SpeedControlView;
import co.bird.android.widget.actions.BirdActionsView;
import co.bird.android.widget.progress.HorizontalRoundedProgressBar;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.card.MaterialCardView;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.Observable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
@Metadata(m28433d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001TB'\b\u0007\u0012\u0006\u0010N\u001a\u00020M\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010O\u0012\b\b\u0002\u0010Q\u001a\u00020\u000f¢\u0006\u0004\bR\u0010SJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010'R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R$\u0010;\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R!\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010<\u001a\u0004\b=\u0010>R+\u0010F\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bA\u0010C\"\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010\rR/\u0010L\u001a\u0004\u0018\u00010\u000f2\b\u0010@\u001a\u0004\u0018\u00010\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010B\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K¨\u0006U"}, m28432d2 = {"Lco/bird/android/widget/actions/BirdActionsView;", "Lcom/google/android/material/card/MaterialCardView;", "", "show", "", "K", "enable", "B", "on", "setLightState", "locked", "setLocked", "H", "I", "J", "", "totalDelay", "L", "Lio/reactivex/Observable;", "Lco/bird/android/model/constant/VehicleSpeedMode;", "M", "Lco/bird/android/widget/actions/SplitButton;", "s", "Lco/bird/android/widget/actions/SplitButton;", "lightsButton", "Lco/bird/android/widget/actions/BirdActionButton;", "t", "Lco/bird/android/widget/actions/BirdActionButton;", "alarmButton", "Lco/bird/android/widget/actions/SlideToLockView;", "u", "Lco/bird/android/widget/actions/SlideToLockView;", "lockView", "Lco/bird/android/widget/SpeedControlView;", "v", "Lco/bird/android/widget/SpeedControlView;", "speedControlView", "Landroid/widget/TextView;", "w", "Landroid/widget/TextView;", "wakeDelayTitle", "x", "wakeDelayBody", "Lco/bird/android/widget/progress/HorizontalRoundedProgressBar;", "y", "Lco/bird/android/widget/progress/HorizontalRoundedProgressBar;", "wakeDelayProgress", "z", "sleepingTitle", "Landroid/widget/Button;", "A", "Landroid/widget/Button;", "wakeButton", "Lco/bird/android/widget/actions/BirdActionsView$d;", "Lco/bird/android/widget/actions/BirdActionsView$d;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "()Lco/bird/android/widget/actions/BirdActionsView$d;", "setListener", "(Lco/bird/android/widget/actions/BirdActionsView$d;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Lazy;", "E", "()Lio/reactivex/Observable;", "wakeClicks", "<set-?>", "D", "Lkotlin/properties/ReadWriteProperty;", "()Z", "setSleeping", "(Z)V", "sleeping", "wakeDelayTotalTime", "F", "()Ljava/lang/Integer;", "G", "(Ljava/lang/Integer;)V", "wakeDelayTimeLeft", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", DateTokenConverter.CONVERTER_KEY, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdActionsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdActionsView.kt\nco/bird/android/widget/actions/BirdActionsView\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,225:1\n33#2,3:226\n33#2,3:229\n262#3,2:232\n262#3,2:234\n262#3,2:236\n262#3,2:238\n262#3,2:240\n262#3,2:242\n*S KotlinDebug\n*F\n+ 1 BirdActionsView.kt\nco/bird/android/widget/actions/BirdActionsView\n*L\n92#1:226,3\n120#1:229,3\n174#1:232,2\n175#1:234,2\n176#1:236,2\n179#1:238,2\n180#1:240,2\n181#1:242,2\n*E\n"})
/* loaded from: classes4.dex */
public final class BirdActionsView extends MaterialCardView {

    /* renamed from: G */
    public static final /* synthetic */ KProperty<Object>[] f67724G = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BirdActionsView.class, "sleeping", "getSleeping()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BirdActionsView.class, "wakeDelayTimeLeft", "getWakeDelayTimeLeft()Ljava/lang/Integer;", 0))};

    /* renamed from: A */
    public final Button f67725A;

    /* renamed from: B */
    public InterfaceC16615d f67726B;

    /* renamed from: C */
    public final Lazy f67727C;

    /* renamed from: D */
    public final ReadWriteProperty f67728D;

    /* renamed from: E */
    public int f67729E;

    /* renamed from: F */
    public final ReadWriteProperty f67730F;

    /* renamed from: s */
    public final SplitButton f67731s;

    /* renamed from: t */
    public final BirdActionButton f67732t;

    /* renamed from: u */
    public final SlideToLockView f67733u;

    /* renamed from: v */
    public final SpeedControlView f67734v;

    /* renamed from: w */
    public final TextView f67735w;

    /* renamed from: x */
    public final TextView f67736x;

    /* renamed from: y */
    public final HorizontalRoundedProgressBar f67737y;

    /* renamed from: z */
    public final TextView f67738z;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.actions.BirdActionsView$a */
    /* loaded from: classes4.dex */
    public static final class C16612a extends Lambda implements Function1<View, Unit> {
        public C16612a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            BirdActionsView.this.f67731s.setLeftButtonSelected(true);
            InterfaceC16615d m54339C = BirdActionsView.this.m54339C();
            if (m54339C != null) {
                m54339C.mo54324c(true);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.actions.BirdActionsView$b */
    /* loaded from: classes4.dex */
    public static final class C16613b extends Lambda implements Function1<View, Unit> {
        public C16613b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            BirdActionsView.this.f67731s.setRightButtonSelected(true);
            InterfaceC16615d m54339C = BirdActionsView.this.m54339C();
            if (m54339C != null) {
                m54339C.mo54324c(false);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LkE5;", TransferTable.COLUMN_STATE, "", C17296a.f69688o, "(LkE5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.actions.BirdActionsView$c */
    /* loaded from: classes4.dex */
    public static final class C16614c extends Lambda implements Function1<EnumC43785kE5, Unit> {
        public C16614c() {
            super(1);
        }

        /* renamed from: a */
        public final void m54327a(EnumC43785kE5 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            InterfaceC16615d m54339C = BirdActionsView.this.m54339C();
            if (m54339C != null) {
                m54339C.mo54325b(state);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EnumC43785kE5 enumC43785kE5) {
            m54327a(enumC43785kE5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, m28432d2 = {"Lco/bird/android/widget/actions/BirdActionsView$d;", "", "", C17296a.f69688o, "", "on", "c", "LkE5;", TransferTable.COLUMN_STATE, "b", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.actions.BirdActionsView$d */
    /* loaded from: classes4.dex */
    public interface InterfaceC16615d {
        /* renamed from: a */
        void mo54326a();

        /* renamed from: b */
        void mo54325b(EnumC43785kE5 enumC43785kE5);

        /* renamed from: c */
        void mo54324c(boolean z);
    }

    @Metadata(m28433d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t¸\u0006\u0000"}, m28432d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 BirdActionsView.kt\nco/bird/android/widget/actions/BirdActionsView\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,70:1\n93#2,4:71\n97#2:77\n98#2:80\n100#2:83\n101#2:86\n102#2:89\n104#2:92\n105#2:95\n107#2:98\n108#2:101\n109#2,4:104\n113#2:110\n114#2:113\n117#2:116\n262#3,2:75\n262#3,2:78\n262#3,2:81\n262#3,2:84\n262#3,2:87\n262#3,2:90\n262#3,2:93\n262#3,2:96\n262#3,2:99\n262#3,2:102\n262#3,2:108\n262#3,2:111\n262#3,2:114\n*S KotlinDebug\n*F\n+ 1 BirdActionsView.kt\nco/bird/android/widget/actions/BirdActionsView\n*L\n96#1:75,2\n97#1:78,2\n98#1:81,2\n100#1:84,2\n101#1:87,2\n102#1:90,2\n104#1:93,2\n105#1:96,2\n107#1:99,2\n108#1:102,2\n112#1:108,2\n113#1:111,2\n114#1:114,2\n*E\n"})
    /* renamed from: co.bird.android.widget.actions.BirdActionsView$e */
    /* loaded from: classes4.dex */
    public static final class C16616e extends ObservableProperty<Boolean> {

        /* renamed from: b */
        public final /* synthetic */ BirdActionsView f67742b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16616e(Object obj, BirdActionsView birdActionsView) {
            super(obj);
            this.f67742b = birdActionsView;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty<?> property, Boolean bool, Boolean bool2) {
            int i;
            Intrinsics.checkNotNullParameter(property, "property");
            boolean booleanValue = bool2.booleanValue();
            if (bool.booleanValue() != booleanValue) {
                if (booleanValue) {
                    this.f67742b.f67731s.setVisibility(8);
                    this.f67742b.f67732t.setVisibility(8);
                    this.f67742b.f67733u.setVisibility(8);
                    this.f67742b.f67735w.setVisibility(8);
                    this.f67742b.f67736x.setVisibility(8);
                    this.f67742b.f67737y.setVisibility(8);
                    this.f67742b.f67738z.setVisibility(0);
                    this.f67742b.f67725A.setVisibility(0);
                    return;
                }
                this.f67742b.f67738z.setVisibility(8);
                this.f67742b.f67725A.setVisibility(8);
                Integer m54336F = this.f67742b.m54336F();
                if (m54336F != null) {
                    i = m54336F.intValue();
                } else {
                    i = 0;
                }
                if (i > 0) {
                    this.f67742b.m54331K(true);
                    return;
                }
                this.f67742b.f67731s.setVisibility(0);
                this.f67742b.f67732t.setVisibility(0);
                this.f67742b.f67733u.setVisibility(0);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t¸\u0006\u0000"}, m28432d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 BirdActionsView.kt\nco/bird/android/widget/actions/BirdActionsView\n*L\n1#1,70:1\n121#2,25:71\n*E\n"})
    /* renamed from: co.bird.android.widget.actions.BirdActionsView$f */
    /* loaded from: classes4.dex */
    public static final class C16617f extends ObservableProperty<Integer> {

        /* renamed from: b */
        public final /* synthetic */ BirdActionsView f67743b;

        /* renamed from: c */
        public final /* synthetic */ Context f67744c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16617f(Object obj, BirdActionsView birdActionsView, Context context) {
            super(obj);
            this.f67743b = birdActionsView;
            this.f67744c = context;
        }

        @Override // kotlin.properties.ObservableProperty
        public void afterChange(KProperty<?> property, Integer num, Integer num2) {
            Intrinsics.checkNotNullParameter(property, "property");
            Integer num3 = num2;
            if (num == null && num3 != null) {
                this.f67743b.m54331K(true);
            }
            if (num3 != null) {
                if (num3.intValue() == 0) {
                    this.f67743b.m54331K(false);
                    this.f67743b.m54335G(null);
                }
                if (num3.intValue() > 0) {
                    this.f67743b.f67737y.setProgress((this.f67743b.f67729E - num3.intValue()) / this.f67743b.f67729E);
                    this.f67743b.f67736x.setText(this.f67744c.getString(C45871nl4.bird_actions_view_wake_delay_body, num3.toString()));
                    BirdActionsView birdActionsView = this.f67743b;
                    birdActionsView.postDelayed(new RunnableC16619h(num3), 1000L);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.actions.BirdActionsView$g */
    /* loaded from: classes4.dex */
    public static final class C16618g extends Lambda implements Function0<Observable<Unit>> {
        public C16618g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            return C44626lf5.clicksThrottle$default(BirdActionsView.this.f67725A, 0L, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.actions.BirdActionsView$h */
    /* loaded from: classes4.dex */
    public static final class RunnableC16619h implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Integer f67747c;

        public RunnableC16619h(Integer num) {
            this.f67747c = num;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BirdActionsView.this.m54335G(Integer.valueOf(this.f67747c.intValue() - 1));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BirdActionsView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: A */
    public static final void m54341A(BirdActionsView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC16615d interfaceC16615d = this$0.f67726B;
        if (interfaceC16615d != null) {
            interfaceC16615d.mo54326a();
        }
    }

    /* renamed from: B */
    public final void m54340B(boolean z) {
        this.f67725A.setEnabled(z);
    }

    /* renamed from: C */
    public final InterfaceC16615d m54339C() {
        return this.f67726B;
    }

    /* renamed from: D */
    public final boolean m54338D() {
        return ((Boolean) this.f67728D.getValue(this, f67724G[0])).booleanValue();
    }

    /* renamed from: E */
    public final Observable<Unit> m54337E() {
        return (Observable) this.f67727C.getValue();
    }

    /* renamed from: F */
    public final Integer m54336F() {
        return (Integer) this.f67730F.getValue(this, f67724G[1]);
    }

    /* renamed from: G */
    public final void m54335G(Integer num) {
        this.f67730F.setValue(this, f67724G[1], num);
    }

    /* renamed from: H */
    public final void m54334H(boolean z) {
        C49520tu6.show$default(this.f67732t, z, 0, 2, null);
    }

    /* renamed from: I */
    public final void m54333I(boolean z) {
        C49520tu6.show$default(this.f67733u, z, 0, 2, null);
    }

    /* renamed from: J */
    public final void m54332J(boolean z) {
        C49520tu6.show$default(this.f67734v, z, 0, 2, null);
    }

    /* renamed from: K */
    public final void m54331K(boolean z) {
        int i;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        C12055c.m65805a(this);
        TextView textView = this.f67735w;
        int i6 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        TextView textView2 = this.f67736x;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView2.setVisibility(i2);
        HorizontalRoundedProgressBar horizontalRoundedProgressBar = this.f67737y;
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        horizontalRoundedProgressBar.setVisibility(i3);
        if (!z && !m54338D()) {
            z2 = true;
        } else {
            z2 = false;
        }
        SplitButton splitButton = this.f67731s;
        if (z2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        splitButton.setVisibility(i4);
        BirdActionButton birdActionButton = this.f67732t;
        if (z2) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        birdActionButton.setVisibility(i5);
        SlideToLockView slideToLockView = this.f67733u;
        if (z2) {
            i6 = 0;
        }
        slideToLockView.setVisibility(i6);
    }

    /* renamed from: L */
    public final void m54330L(int i) {
        this.f67729E = i;
        m54335G(Integer.valueOf(i));
    }

    /* renamed from: M */
    public final Observable<VehicleSpeedMode> m54329M() {
        return this.f67734v.m54378g();
    }

    public final void setLightState(boolean z) {
        this.f67731s.setLeftButtonSelected(z);
        this.f67731s.setRightButtonSelected(!z);
    }

    public final void setListener(InterfaceC16615d interfaceC16615d) {
        this.f67726B = interfaceC16615d;
    }

    public final void setLocked(boolean z) {
        this.f67733u.setState(z ? EnumC43785kE5.LOCKED : EnumC43785kE5.UNLOCKED);
    }

    public final void setSleeping(boolean z) {
        this.f67728D.setValue(this, f67724G[0], Boolean.valueOf(z));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BirdActionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BirdActionsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BirdActionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        setRadius(0.0f);
        setCardElevation(C49520tu6.m11247d(this, 16));
        setBackgroundColor(C49520tu6.m11241j(this, C32364Df4.black));
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View.inflate(context, C45268mk4.view_bird_actions, this);
        View findViewById = findViewById(C52955zi4.lightsButton);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.lightsButton)");
        SplitButton splitButton = (SplitButton) findViewById;
        this.f67731s = splitButton;
        splitButton.setOnLeftButtonClickedListener(new C16612a());
        splitButton.setOnRightButtonClickedListener(new C16613b());
        View findViewById2 = findViewById(C52955zi4.alarmButton);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.alarmButton)");
        BirdActionButton birdActionButton = (BirdActionButton) findViewById2;
        this.f67732t = birdActionButton;
        birdActionButton.setOnClickListener(new View.OnClickListener() { // from class: hI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BirdActionsView.m54341A(BirdActionsView.this, view);
            }
        });
        View findViewById3 = findViewById(C52955zi4.lockView);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.lockView)");
        SlideToLockView slideToLockView = (SlideToLockView) findViewById3;
        this.f67733u = slideToLockView;
        slideToLockView.setListener(new C16614c());
        View findViewById4 = findViewById(C52955zi4.speedControlView);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(R.id.speedControlView)");
        this.f67734v = (SpeedControlView) findViewById4;
        View findViewById5 = findViewById(C52955zi4.wakeDelayTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(R.id.wakeDelayTitle)");
        this.f67735w = (TextView) findViewById5;
        View findViewById6 = findViewById(C52955zi4.wakeDelayBody);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(R.id.wakeDelayBody)");
        this.f67736x = (TextView) findViewById6;
        View findViewById7 = findViewById(C52955zi4.wakeDelayProgress);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(R.id.wakeDelayProgress)");
        this.f67737y = (HorizontalRoundedProgressBar) findViewById7;
        View findViewById8 = findViewById(C52955zi4.sleepingTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(R.id.sleepingTitle)");
        this.f67738z = (TextView) findViewById8;
        View findViewById9 = findViewById(C52955zi4.wakeButton);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(R.id.wakeButton)");
        this.f67725A = (Button) findViewById9;
        lazy = LazyKt__LazyJVMKt.lazy(new C16618g());
        this.f67727C = lazy;
        Delegates delegates = Delegates.INSTANCE;
        this.f67728D = new C16616e(Boolean.FALSE, this);
        this.f67730F = new C16617f(null, this, context);
    }
}
