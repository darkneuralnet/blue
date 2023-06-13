package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.wire.ReleaseValidationResult;
import co.bird.android.model.wire.WireThemedColors;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 )2\u00020\u0001:\u0004*+\u0018\u001fB\u0007¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0014\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fJ\u001a\u0010\u0014\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u0012J\u001a\u0010\u0016\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\u0012R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#¨\u0006,"}, m28432d2 = {"LVu4;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "", "LH6;", "sections", "", "u", "LF6;", "r", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "x", "Lkotlin/Function1;", "Lco/bird/android/model/wire/ReleaseValidationResult;", "y", "", "w", "LYP3;", "c", "LYP3;", "v", "()LYP3;", "A", "(LYP3;)V", "peekHelper", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function0;", "releaseClick", "e", "Lkotlin/jvm/functions/Function1;", "vehicleDotClicks", "f", "lockToggles", "<init>", "()V", "g", C17296a.f69688o, "b", "release_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReleaseScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanAdapter.kt\nco/bird/android/feature/release/adapters/ReleaseScanAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"})
/* renamed from: Vu4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36711Vu4 extends AbstractC52206yS0 {

    /* renamed from: g */
    public static final C8813a f39961g = new C8813a(null);

    /* renamed from: c */
    public YP3 f39962c;

    /* renamed from: d */
    public Function0<Unit> f39963d = C8821f.f39979g;

    /* renamed from: e */
    public Function1<? super ReleaseValidationResult, Unit> f39964e = C8822g.f39980g;

    /* renamed from: f */
    public Function1<? super Boolean, Unit> f39965f = C8820e.f39978g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LVu4$a;", "", "", "VEHICLE_PEEK_KEY", "Ljava/lang/String;", "<init>", "()V", "release_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Vu4$a */
    /* loaded from: classes3.dex */
    public static final class C8813a {
        public /* synthetic */ C8813a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C8813a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LVu4$b;", "Lw1;", "", "position", "", "bind", "Ltf2;", "b", "Ltf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LVu4;Landroid/view/View;)V", "release_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReleaseScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanAdapter.kt\nco/bird/android/feature/release/adapters/ReleaseScanAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,160:1\n18#2:161\n9#3,4:162\n*S KotlinDebug\n*F\n+ 1 ReleaseScanAdapter.kt\nco/bird/android/feature/release/adapters/ReleaseScanAdapter$HeaderViewHolder\n*L\n85#1:161\n85#1:162,4\n*E\n"})
    /* renamed from: Vu4$b */
    /* loaded from: classes3.dex */
    public final class C8814b extends C29735w1 {

        /* renamed from: b */
        public final C49366tf2 f39966b;

        /* renamed from: c */
        public final /* synthetic */ C36711Vu4 f39967c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Vu4$b$a */
        /* loaded from: classes3.dex */
        public static final class C8815a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C36711Vu4 f39968g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8815a(C36711Vu4 c36711Vu4) {
                super(1);
                this.f39968g = c36711Vu4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f39968g.f39963d.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8814b(C36711Vu4 c36711Vu4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39967c = c36711Vu4;
            C49366tf2 m11955a = C49366tf2.m11955a(view);
            Intrinsics.checkNotNullExpressionValue(m11955a, "bind(view)");
            this.f39966b = m11955a;
            Button button = m11955a.f110846b;
            Intrinsics.checkNotNullExpressionValue(button, "binding.button");
            C34585Ms2.m94661j(button, new C8815a(c36711Vu4));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f39967c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C33435Hu4)) {
                m105816c = null;
            }
            C33435Hu4 c33435Hu4 = (C33435Hu4) m105816c;
            if (c33435Hu4 != null) {
                C36711Vu4 c36711Vu4 = this.f39967c;
                this.f39966b.f110847c.setText(c33435Hu4.m103232b());
                this.f39966b.f110846b.setEnabled(c33435Hu4.m103230d());
                this.f39966b.f110846b.setText(c33435Hu4.m103229e());
                this.f39966b.f110846b.setCompoundDrawablesRelativeWithIntrinsicBounds(c33435Hu4.m103231c(), (Drawable) null, (Drawable) null, (Drawable) null);
                this.f39966b.f110846b.setPaddingRelative((int) C49347td3.m12001b(16), this.f39966b.f110846b.getPaddingTop(), (int) C49347td3.m12001b(16), this.f39966b.f110846b.getPaddingBottom());
                YP3 m79241v = c36711Vu4.m79241v();
                if (m79241v != null) {
                    View itemView = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    m79241v.m75093c("header", itemView);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LVu4$c;", "Lw1;", "", "position", "", "bind", "LWe2;", "b", "LWe2;", "binding", "", "c", "Z", "isBinding", "Landroid/view/View;", "view", "<init>", "(LVu4;Landroid/view/View;)V", "release_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReleaseScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanAdapter.kt\nco/bird/android/feature/release/adapters/ReleaseScanAdapter$LockViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,160:1\n18#2:161\n9#3,4:162\n*S KotlinDebug\n*F\n+ 1 ReleaseScanAdapter.kt\nco/bird/android/feature/release/adapters/ReleaseScanAdapter$LockViewHolder\n*L\n120#1:161\n120#1:162,4\n*E\n"})
    /* renamed from: Vu4$c */
    /* loaded from: classes3.dex */
    public final class C8816c extends C29735w1 {

        /* renamed from: b */
        public final C36799We2 f39969b;

        /* renamed from: c */
        public boolean f39970c;

        /* renamed from: d */
        public final /* synthetic */ C36711Vu4 f39971d;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Vu4$c$a */
        /* loaded from: classes3.dex */
        public static final class C8817a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C36711Vu4 f39973h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8817a(C36711Vu4 c36711Vu4) {
                super(2);
                this.f39973h = c36711Vu4;
            }

            /* renamed from: a */
            public final void m79236a(CompoundButton compoundButton, boolean z) {
                if (C8816c.this.f39970c) {
                    return;
                }
                this.f39973h.f39965f.invoke(Boolean.valueOf(z));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m79236a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8816c(C36711Vu4 c36711Vu4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39971d = c36711Vu4;
            C36799We2 m78056a = C36799We2.m78056a(view);
            Intrinsics.checkNotNullExpressionValue(m78056a, "bind(view)");
            this.f39969b = m78056a;
            SwitchCompat switchCompat = m78056a.f41458b;
            Intrinsics.checkNotNullExpressionValue(switchCompat, "binding.lock");
            C34585Ms2.m94663h(switchCompat, new C8817a(c36711Vu4));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            boolean z2 = true;
            this.f39970c = true;
            SwitchCompat switchCompat = this.f39969b.f41458b;
            Object m105816c = this.f39971d.m94545o().m109397e(i).m105816c();
            if (m105816c != null) {
                z = m105816c instanceof Boolean;
            } else {
                z = true;
            }
            if (!z) {
                m105816c = null;
            }
            Boolean bool = (Boolean) m105816c;
            if (bool != null) {
                z2 = bool.booleanValue();
            }
            switchCompat.setChecked(z2);
            this.f39970c = false;
            YP3 m79241v = this.f39971d.m79241v();
            if (m79241v != null) {
                View itemView = this.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                m79241v.m75093c("lock", itemView);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LVu4$d;", "Lw1;", "", "position", "", "bind", "LSb2;", "b", "LSb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LVu4;Landroid/view/View;)V", "release_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReleaseScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanAdapter.kt\nco/bird/android/feature/release/adapters/ReleaseScanAdapter$VehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,160:1\n18#2:161\n9#3,4:162\n*S KotlinDebug\n*F\n+ 1 ReleaseScanAdapter.kt\nco/bird/android/feature/release/adapters/ReleaseScanAdapter$VehicleViewHolder\n*L\n139#1:161\n139#1:162,4\n*E\n"})
    /* renamed from: Vu4$d */
    /* loaded from: classes3.dex */
    public final class C8818d extends C29735w1 {

        /* renamed from: b */
        public final C35836Sb2 f39974b;

        /* renamed from: c */
        public final /* synthetic */ C36711Vu4 f39975c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nReleaseScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanAdapter.kt\nco/bird/android/feature/release/adapters/ReleaseScanAdapter$VehicleViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n18#2:161\n9#3,4:162\n1#4:166\n*S KotlinDebug\n*F\n+ 1 ReleaseScanAdapter.kt\nco/bird/android/feature/release/adapters/ReleaseScanAdapter$VehicleViewHolder$1\n*L\n133#1:161\n133#1:162,4\n*E\n"})
        /* renamed from: Vu4$d$a */
        /* loaded from: classes3.dex */
        public static final class C8819a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C36711Vu4 f39976g;

            /* renamed from: h */
            public final /* synthetic */ C8818d f39977h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8819a(C36711Vu4 c36711Vu4, C8818d c8818d) {
                super(1);
                this.f39976g = c36711Vu4;
                this.f39977h = c8818d;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C1737E6 m94545o = this.f39976g.m94545o();
                Integer safePosition = this.f39977h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                    if (!(m105816c instanceof ReleaseValidationResult)) {
                        m105816c = null;
                    }
                    ReleaseValidationResult releaseValidationResult = (ReleaseValidationResult) m105816c;
                    if (releaseValidationResult != null) {
                        this.f39976g.f39964e.invoke(releaseValidationResult);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8818d(C36711Vu4 c36711Vu4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f39975c = c36711Vu4;
            C35836Sb2 m85209a = C35836Sb2.m85209a(view);
            Intrinsics.checkNotNullExpressionValue(m85209a, "bind(view)");
            this.f39974b = m85209a;
            ImageView imageView = m85209a.f33945e;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.more");
            C34585Ms2.m94661j(imageView, new C8819a(c36711Vu4, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            int i2;
            YP3 m79241v;
            Object m105816c = this.f39975c.m94545o().m109397e(i).m105816c();
            Drawable drawable = null;
            if (!(m105816c instanceof ReleaseValidationResult)) {
                m105816c = null;
            }
            ReleaseValidationResult releaseValidationResult = (ReleaseValidationResult) m105816c;
            if (releaseValidationResult != null) {
                C36711Vu4 c36711Vu4 = this.f39975c;
                this.f39974b.f33944d.setText(releaseValidationResult.getBirdDisplayName());
                Integer battery = releaseValidationResult.getBattery();
                if (battery != null) {
                    i2 = battery.intValue();
                } else {
                    i2 = 0;
                }
                this.f39974b.f33942b.setBatteryLevel(i2 / 100.0f);
                this.f39974b.f33943c.setText(this.itemView.getContext().getString(C45871nl4.battery_percent, Integer.valueOf(i2)));
                ImageView imageView = this.f39974b.f33946f;
                ClientIcon statusIcon = releaseValidationResult.getStatusIcon();
                if (statusIcon != null) {
                    Context context = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                    drawable = C33341Hk0.m103484a(statusIcon, context);
                }
                imageView.setImageDrawable(drawable);
                WireThemedColors statusIconBackgroundColor = releaseValidationResult.getStatusIconBackgroundColor();
                if (statusIconBackgroundColor != null) {
                    this.f39974b.f33946f.setBackgroundTintList(ColorStateList.valueOf(statusIconBackgroundColor.getLightMode()));
                }
                this.f39974b.f33947g.setText(releaseValidationResult.getStatusDisplayName());
                if ((i == 1 || (i == 2 && c36711Vu4.getItemViewType(1) == C32400Dj4.item_release_lock)) && (m79241v = c36711Vu4.m79241v()) != null) {
                    View itemView = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    m79241v.m75093c("vehicle", itemView);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vu4$e */
    /* loaded from: classes3.dex */
    public static final class C8820e extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: g */
        public static final C8820e f39978g = new C8820e();

        public C8820e() {
            super(1);
        }

        public final void invoke(boolean z) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vu4$f */
    /* loaded from: classes3.dex */
    public static final class C8821f extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public static final C8821f f39979g = new C8821f();

        public C8821f() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/ReleaseValidationResult;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/ReleaseValidationResult;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Vu4$g */
    /* loaded from: classes3.dex */
    public static final class C8822g extends Lambda implements Function1<ReleaseValidationResult, Unit> {

        /* renamed from: g */
        public static final C8822g f39980g = new C8822g();

        public C8822g() {
            super(1);
        }

        /* renamed from: a */
        public final void m79235a(ReleaseValidationResult it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ReleaseValidationResult releaseValidationResult) {
            m79235a(releaseValidationResult);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: A */
    public final void m79242A(YP3 yp3) {
        this.f39962c = yp3;
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C38235au4();
    }

    @Override // p000.AbstractC5440My
    /* renamed from: u */
    public void mo24871u(Collection<C3023H6> sections) {
        YP3 yp3;
        Intrinsics.checkNotNullParameter(sections, "sections");
        boolean z = false;
        int i = 0;
        for (C3023H6 c3023h6 : sections) {
            i += c3023h6.m104408e().size();
        }
        if (i < 2 && getItemCount() >= 2) {
            z = true;
        }
        super.mo24871u(sections);
        if (z && (yp3 = this.f39962c) != null) {
            yp3.m75087i("vehicle");
        }
    }

    /* renamed from: v */
    public final YP3 m79241v() {
        return this.f39962c;
    }

    /* renamed from: w */
    public final void m79240w(Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f39965f = listener;
    }

    /* renamed from: x */
    public final void m79239x(Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f39963d = listener;
    }

    /* renamed from: y */
    public final void m79238y(Function1<? super ReleaseValidationResult, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f39964e = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C36144Tj4.item_scan_header ? new C8814b(this, m41761u) : i == C32400Dj4.item_release_lock ? new C8816c(this, m41761u) : i == C45268mk4.item_fleet_status_vehicle ? new C8818d(this, m41761u) : new C29735w1(m41761u);
    }
}
