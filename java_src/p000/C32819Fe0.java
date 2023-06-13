package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.wire.WireCaptureValidation;
import co.bird.android.model.wire.WireThemedColors;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 *2\u00020\u0001:\u0003+,\u0010B\u0007¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0016\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR0\u0010'\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006-"}, m28432d2 = {"LFe0;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "", "LH6;", "sections", "", "u", "LYP3;", "c", "LYP3;", "w", "()LYP3;", "A", "(LYP3;)V", "peekHelper", "Lkotlin/Function0;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function0;", "v", "()Lkotlin/jvm/functions/Function0;", "y", "(Lkotlin/jvm/functions/Function0;)V", "buttonClicks", "Lkotlin/Function1;", "Lco/bird/android/model/wire/WireCaptureValidation;", "e", "Lkotlin/jvm/functions/Function1;", "x", "()Lkotlin/jvm/functions/Function1;", "B", "(Lkotlin/jvm/functions/Function1;)V", "vehicleDotClicks", "<init>", "()V", "f", C17296a.f69688o, "b", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCaptureBulkScannerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerAdapter.kt\nco/bird/android/feature/bulkscanner/scan/capture/adapters/CaptureBulkScannerAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n1#2:115\n*E\n"})
/* renamed from: Fe0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32819Fe0 extends AbstractC52206yS0 {

    /* renamed from: f */
    public static final C2374a f9857f = new C2374a(null);

    /* renamed from: c */
    public YP3 f9858c;

    /* renamed from: d */
    public Function0<Unit> f9859d = C2379d.f9868g;

    /* renamed from: e */
    public Function1<? super WireCaptureValidation, Unit> f9860e = C2380e.f9869g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LFe0$a;", "", "", "VEHICLE_PEEK_KEY", "Ljava/lang/String;", "<init>", "()V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Fe0$a */
    /* loaded from: classes3.dex */
    public static final class C2374a {
        public /* synthetic */ C2374a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2374a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LFe0$b;", "Lw1;", "", "position", "", "bind", "Ltf2;", "b", "Ltf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LFe0;Landroid/view/View;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCaptureBulkScannerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerAdapter.kt\nco/bird/android/feature/bulkscanner/scan/capture/adapters/CaptureBulkScannerAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,114:1\n18#2:115\n9#3,4:116\n*S KotlinDebug\n*F\n+ 1 CaptureBulkScannerAdapter.kt\nco/bird/android/feature/bulkscanner/scan/capture/adapters/CaptureBulkScannerAdapter$HeaderViewHolder\n*L\n66#1:115\n66#1:116,4\n*E\n"})
    /* renamed from: Fe0$b */
    /* loaded from: classes3.dex */
    public final class C2375b extends C29735w1 {

        /* renamed from: b */
        public final C49366tf2 f9861b;

        /* renamed from: c */
        public final /* synthetic */ C32819Fe0 f9862c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Fe0$b$a */
        /* loaded from: classes3.dex */
        public static final class C2376a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C32819Fe0 f9863g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2376a(C32819Fe0 c32819Fe0) {
                super(1);
                this.f9863g = c32819Fe0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Function0<Unit> m106824v = this.f9863g.m106824v();
                if (m106824v != null) {
                    m106824v.invoke();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2375b(C32819Fe0 c32819Fe0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f9862c = c32819Fe0;
            C49366tf2 m11955a = C49366tf2.m11955a(view);
            Intrinsics.checkNotNullExpressionValue(m11955a, "bind(view)");
            this.f9861b = m11955a;
            Button button = m11955a.f110846b;
            Intrinsics.checkNotNullExpressionValue(button, "binding.button");
            C34585Ms2.m94661j(button, new C2376a(c32819Fe0));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            String string;
            boolean z;
            Object m105816c = this.f9862c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Integer)) {
                m105816c = null;
            }
            Integer num = (Integer) m105816c;
            if (num != null) {
                C32819Fe0 c32819Fe0 = this.f9862c;
                int intValue = num.intValue();
                this.f9861b.f110847c.setText(String.valueOf(intValue));
                Button button = this.f9861b.f110846b;
                if (intValue > 0) {
                    string = getContext().getString(C45871nl4.capture_button_title);
                } else {
                    string = getContext().getString(C45871nl4.bulk_scan_awaiting_scan_uppercase);
                }
                button.setText(string);
                Button button2 = this.f9861b.f110846b;
                if (intValue > 0) {
                    z = true;
                } else {
                    z = false;
                }
                button2.setEnabled(z);
                YP3 m106823w = c32819Fe0.m106823w();
                if (m106823w != null) {
                    View itemView = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    m106823w.m75093c("header", itemView);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LFe0$c;", "Lw1;", "", "position", "", "bind", "LSb2;", "b", "LSb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LFe0;Landroid/view/View;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCaptureBulkScannerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerAdapter.kt\nco/bird/android/feature/bulkscanner/scan/capture/adapters/CaptureBulkScannerAdapter$VehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,114:1\n18#2:115\n9#3,4:116\n*S KotlinDebug\n*F\n+ 1 CaptureBulkScannerAdapter.kt\nco/bird/android/feature/bulkscanner/scan/capture/adapters/CaptureBulkScannerAdapter$VehicleViewHolder\n*L\n93#1:115\n93#1:116,4\n*E\n"})
    /* renamed from: Fe0$c */
    /* loaded from: classes3.dex */
    public final class C2377c extends C29735w1 {

        /* renamed from: b */
        public final C35836Sb2 f9864b;

        /* renamed from: c */
        public final /* synthetic */ C32819Fe0 f9865c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nCaptureBulkScannerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerAdapter.kt\nco/bird/android/feature/bulkscanner/scan/capture/adapters/CaptureBulkScannerAdapter$VehicleViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,114:1\n1#2:115\n18#3:116\n9#4,4:117\n*S KotlinDebug\n*F\n+ 1 CaptureBulkScannerAdapter.kt\nco/bird/android/feature/bulkscanner/scan/capture/adapters/CaptureBulkScannerAdapter$VehicleViewHolder$1\n*L\n87#1:116\n87#1:117,4\n*E\n"})
        /* renamed from: Fe0$c$a */
        /* loaded from: classes3.dex */
        public static final class C2378a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C32819Fe0 f9867h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2378a(C32819Fe0 c32819Fe0) {
                super(1);
                this.f9867h = c32819Fe0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C2637G6 m109397e;
                Function1<WireCaptureValidation, Unit> m106822x;
                Integer safePosition = C2377c.this.getSafePosition();
                if (safePosition == null || (m109397e = this.f9867h.m94545o().m109397e(safePosition.intValue())) == null) {
                    return;
                }
                Object m105816c = m109397e.m105816c();
                if (!(m105816c instanceof WireCaptureValidation)) {
                    m105816c = null;
                }
                WireCaptureValidation wireCaptureValidation = (WireCaptureValidation) m105816c;
                if (wireCaptureValidation == null || (m106822x = this.f9867h.m106822x()) == null) {
                    return;
                }
                m106822x.invoke(wireCaptureValidation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2377c(C32819Fe0 c32819Fe0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f9865c = c32819Fe0;
            C35836Sb2 m85209a = C35836Sb2.m85209a(view);
            Intrinsics.checkNotNullExpressionValue(m85209a, "bind(view)");
            this.f9864b = m85209a;
            ImageView imageView = m85209a.f33945e;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.more");
            C34585Ms2.m94661j(imageView, new C2378a(c32819Fe0));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            int i2;
            YP3 m106823w;
            Object m105816c = this.f9865c.m94545o().m109397e(i).m105816c();
            Drawable drawable = null;
            if (!(m105816c instanceof WireCaptureValidation)) {
                m105816c = null;
            }
            WireCaptureValidation wireCaptureValidation = (WireCaptureValidation) m105816c;
            if (wireCaptureValidation != null) {
                C32819Fe0 c32819Fe0 = this.f9865c;
                this.f9864b.f33944d.setText(wireCaptureValidation.getBirdDisplayName());
                Integer battery = wireCaptureValidation.getBattery();
                if (battery != null) {
                    i2 = battery.intValue();
                } else {
                    i2 = 0;
                }
                this.f9864b.f33942b.setBatteryLevel(i2 / 100.0f);
                this.f9864b.f33943c.setText(this.itemView.getContext().getString(C45871nl4.battery_percent, Integer.valueOf(i2)));
                ImageView imageView = this.f9864b.f33946f;
                ClientIcon statusIcon = wireCaptureValidation.getStatusIcon();
                if (statusIcon != null) {
                    Context context = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                    drawable = C33341Hk0.m103484a(statusIcon, context);
                }
                imageView.setImageDrawable(drawable);
                WireThemedColors statusIconBackgroundColor = wireCaptureValidation.getStatusIconBackgroundColor();
                if (statusIconBackgroundColor != null) {
                    this.f9864b.f33946f.setBackgroundTintList(ColorStateList.valueOf(statusIconBackgroundColor.getLightMode()));
                }
                this.f9864b.f33947g.setText(wireCaptureValidation.getStatusDisplayName());
                if (i == 1 && (m106823w = c32819Fe0.m106823w()) != null) {
                    View itemView = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    m106823w.m75093c("vehicle", itemView);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fe0$d */
    /* loaded from: classes3.dex */
    public static final class C2379d extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public static final C2379d f9868g = new C2379d();

        public C2379d() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireCaptureValidation;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireCaptureValidation;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fe0$e */
    /* loaded from: classes3.dex */
    public static final class C2380e extends Lambda implements Function1<WireCaptureValidation, Unit> {

        /* renamed from: g */
        public static final C2380e f9869g = new C2380e();

        public C2380e() {
            super(1);
        }

        /* renamed from: a */
        public final void m106820a(WireCaptureValidation it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireCaptureValidation wireCaptureValidation) {
            m106820a(wireCaptureValidation);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: A */
    public final void m106826A(YP3 yp3) {
        this.f9858c = yp3;
    }

    /* renamed from: B */
    public final void m106825B(Function1<? super WireCaptureValidation, Unit> function1) {
        this.f9860e = function1;
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C33053Ge0();
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
        if (z && (yp3 = this.f9858c) != null) {
            yp3.m75087i("vehicle");
        }
    }

    /* renamed from: v */
    public final Function0<Unit> m106824v() {
        return this.f9859d;
    }

    /* renamed from: w */
    public final YP3 m106823w() {
        return this.f9858c;
    }

    /* renamed from: x */
    public final Function1<WireCaptureValidation, Unit> m106822x() {
        return this.f9860e;
    }

    /* renamed from: y */
    public final void m106821y(Function0<Unit> function0) {
        this.f9859d = function0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C36144Tj4.item_scan_header ? new C2375b(this, m41761u) : i == C45268mk4.item_fleet_status_vehicle ? new C2377c(this, m41761u) : new C29735w1(m41761u);
    }
}
