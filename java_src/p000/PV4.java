package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.C11905h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.feature.ridepass.p018v2.list.adapter.view.RidePassV2DetailsView;
import co.bird.android.model.persistence.RidePassView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.joda.time.DateTime;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0002-.B\t\b\u0007¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0019\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R$\u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010&\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\u000f0\u000f0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010(\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\u000f0\u000f0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\"\u0010*\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\u000f0\u000f0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010%¨\u0006/"}, m28432d2 = {"LPV4;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "", "linkCode", "y", "(Ljava/lang/String;)Ljava/lang/Integer;", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/RidePassView;", "c", "Lkotlin/Lazy;", "v", "()Lio/reactivex/Observable;", "buyClicks", DateTokenConverter.CONVERTER_KEY, "x", "transferClicks", "e", "z0", "cancelClicks", "f", "Ljava/lang/Integer;", "w", "()Ljava/lang/Integer;", "setPositionToExpand", "(Ljava/lang/Integer;)V", "positionToExpand", "Lma4;", "kotlin.jvm.PlatformType", "g", "Lma4;", "mutableBuyClicks", "h", "mutableTransferClicks", "i", "mutableCancelButtonClicks", "<init>", "()V", C17296a.f69688o, "b", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRidePassV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV2Adapter.kt\nco/bird/android/feature/ridepass/v2/list/adapter/RidePassV2Adapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,178:1\n223#2:179\n224#2:185\n18#3:180\n9#4,4:181\n*S KotlinDebug\n*F\n+ 1 RidePassV2Adapter.kt\nco/bird/android/feature/ridepass/v2/list/adapter/RidePassV2Adapter\n*L\n65#1:179\n65#1:185\n65#1:180\n65#1:181,4\n*E\n"})
/* renamed from: PV4 */
/* loaded from: classes3.dex */
public final class PV4 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final Lazy f28585c;

    /* renamed from: d */
    public final Lazy f28586d;

    /* renamed from: e */
    public final Lazy f28587e;

    /* renamed from: f */
    public Integer f28588f;

    /* renamed from: g */
    public final C45168ma4<RidePassView> f28589g;

    /* renamed from: h */
    public final C45168ma4<RidePassView> f28590h;

    /* renamed from: i */
    public final C45168ma4<RidePassView> f28591i;

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"LPV4$a;", "Lw1;", "", "position", "", "bind", "", C17296a.f69688o, "Landroid/view/View;", "b", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lut6;", "c", "Lut6;", "binding", "Lco/bird/android/model/persistence/RidePassView;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/persistence/RidePassView;", "pass", "<init>", "(LPV4;Landroid/view/View;)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePassV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV2Adapter.kt\nco/bird/android/feature/ridepass/v2/list/adapter/RidePassV2Adapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,178:1\n18#2:179\n9#3,4:180\n*S KotlinDebug\n*F\n+ 1 RidePassV2Adapter.kt\nco/bird/android/feature/ridepass/v2/list/adapter/RidePassV2Adapter$HeaderViewHolder\n*L\n80#1:179\n80#1:180,4\n*E\n"})
    /* renamed from: PV4$a */
    /* loaded from: classes3.dex */
    public final class C6385a extends C29735w1 {

        /* renamed from: b */
        public final View f28592b;

        /* renamed from: c */
        public final C50103ut6 f28593c;

        /* renamed from: d */
        public RidePassView f28594d;

        /* renamed from: e */
        public final /* synthetic */ PV4 f28595e;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: PV4$a$a */
        /* loaded from: classes3.dex */
        public static final class C6386a extends Lambda implements Function1<String, CharSequence> {

            /* renamed from: g */
            public static final C6386a f28596g = new C6386a();

            public C6386a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(String it) {
                String capitalize;
                Intrinsics.checkNotNullParameter(it, "it");
                String lowerCase = it.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                capitalize = StringsKt__StringsJVMKt.capitalize(lowerCase);
                return capitalize;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6385a(PV4 pv4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f28595e = pv4;
            this.f28592b = view;
            C50103ut6 m9589a = C50103ut6.m9589a(view);
            Intrinsics.checkNotNullExpressionValue(m9589a, "bind(view)");
            this.f28593c = m9589a;
        }

        /* renamed from: a */
        public final String m90173a(String str) {
            List split$default;
            String joinToString$default;
            split$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null);
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(split$default, " ", null, null, 0, null, C6386a.f28596g, 30, null);
            return joinToString$default;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f28595e.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof BH1)) {
                m105816c = null;
            }
            BH1 bh1 = (BH1) m105816c;
            if (bh1 != null) {
                this.f28594d = bh1.m114144b();
                RidePassView m114144b = bh1.m114144b();
                boolean z = false;
                if (m114144b != null && m114144b.isPurchased()) {
                    z = true;
                }
                if (z) {
                    TextView textView = this.f28593c.f113167c;
                    String string = getContext().getString(C45871nl4.ride_pass_screen_title);
                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.string.ride_pass_screen_title)");
                    textView.setText(m90173a(string));
                    return;
                }
                this.f28593c.f113167c.setText(getContext().getString(C45871nl4.ride_pass_main_body));
            }
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"LPV4$b;", "Lw1;", "", "position", "", "bind", "", "show", "b", "Landroid/view/View;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Ltt6;", "c", "Ltt6;", "binding", "Lco/bird/android/model/persistence/RidePassView;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/persistence/RidePassView;", "pass", "<init>", "(LPV4;Landroid/view/View;)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePassV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV2Adapter.kt\nco/bird/android/feature/ridepass/v2/list/adapter/RidePassV2Adapter$PassViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n18#2:179\n9#3,4:180\n766#4:184\n857#4,2:185\n1#5:187\n*S KotlinDebug\n*F\n+ 1 RidePassV2Adapter.kt\nco/bird/android/feature/ridepass/v2/list/adapter/RidePassV2Adapter$PassViewHolder\n*L\n121#1:179\n121#1:180,4\n154#1:184\n154#1:185,2\n*E\n"})
    /* renamed from: PV4$b */
    /* loaded from: classes3.dex */
    public final class C6387b extends C29735w1 {

        /* renamed from: b */
        public final View f28597b;

        /* renamed from: c */
        public final C49510tt6 f28598c;

        /* renamed from: d */
        public RidePassView f28599d;

        /* renamed from: e */
        public final /* synthetic */ PV4 f28600e;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nRidePassV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV2Adapter.kt\nco/bird/android/feature/ridepass/v2/list/adapter/RidePassV2Adapter$PassViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
        /* renamed from: PV4$b$a */
        /* loaded from: classes3.dex */
        public static final class C6388a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ PV4 f28602h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6388a(PV4 pv4) {
                super(1);
                this.f28602h = pv4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                RidePassView ridePassView = C6387b.this.f28599d;
                if (ridePassView != null) {
                    this.f28602h.f28589g.accept(ridePassView);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nRidePassV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV2Adapter.kt\nco/bird/android/feature/ridepass/v2/list/adapter/RidePassV2Adapter$PassViewHolder$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
        /* renamed from: PV4$b$b */
        /* loaded from: classes3.dex */
        public static final class C6389b extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ PV4 f28604h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6389b(PV4 pv4) {
                super(1);
                this.f28604h = pv4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                RidePassView ridePassView = C6387b.this.f28599d;
                if (ridePassView != null) {
                    this.f28604h.f28590h.accept(ridePassView);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nRidePassV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV2Adapter.kt\nco/bird/android/feature/ridepass/v2/list/adapter/RidePassV2Adapter$PassViewHolder$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
        /* renamed from: PV4$b$c */
        /* loaded from: classes3.dex */
        public static final class C6390c extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ PV4 f28606h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6390c(PV4 pv4) {
                super(1);
                this.f28606h = pv4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                RidePassView ridePassView = C6387b.this.f28599d;
                if (ridePassView != null) {
                    this.f28606h.f28591i.accept(ridePassView);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: PV4$b$d */
        /* loaded from: classes3.dex */
        public static final class C6391d extends Lambda implements Function1<View, Unit> {
            public C6391d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C6387b.this.m90171b(true);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: PV4$b$e */
        /* loaded from: classes3.dex */
        public static final class C6392e extends Lambda implements Function1<View, Unit> {
            public C6392e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C6387b.this.m90171b(false);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: PV4$b$f */
        /* loaded from: classes3.dex */
        public static final class C6393f extends Lambda implements Function1<View, Unit> {
            public C6393f() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C6387b.this.m90171b(true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6387b(PV4 pv4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f28600e = pv4;
            this.f28597b = view;
            C49510tt6 m11258a = C49510tt6.m11258a(view);
            Intrinsics.checkNotNullExpressionValue(m11258a, "bind(view)");
            this.f28598c = m11258a;
            Button button = m11258a.f111336j;
            Intrinsics.checkNotNullExpressionValue(button, "binding.passBuy");
            C34585Ms2.m94661j(button, new C6388a(pv4));
            Button button2 = m11258a.f111341o;
            Intrinsics.checkNotNullExpressionValue(button2, "binding.transferButton");
            C34585Ms2.m94661j(button2, new C6389b(pv4));
            Button button3 = m11258a.f111328b;
            Intrinsics.checkNotNullExpressionValue(button3, "binding.cancelButton");
            C34585Ms2.m94661j(button3, new C6390c(pv4));
            TextView textView = m11258a.f111335i;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.passBody");
            C34585Ms2.m94661j(textView, new C6391d());
            ImageView imageView = m11258a.f111333g;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.hide");
            C34585Ms2.m94661j(imageView, new C6392e());
            ImageView imageView2 = m11258a.f111332f;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.expand");
            C34585Ms2.m94661j(imageView2, new C6393f());
        }

        /* renamed from: b */
        public final void m90171b(boolean z) {
            RidePassV2DetailsView ridePassV2DetailsView = this.f28598c.f111330d;
            Intrinsics.checkNotNullExpressionValue(ridePassV2DetailsView, "binding.details");
            C49520tu6.show$default(ridePassV2DetailsView, z, 0, 2, null);
            ImageView imageView = this.f28598c.f111333g;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.hide");
            C49520tu6.show$default(imageView, z, 0, 2, null);
            ImageView imageView2 = this.f28598c.f111332f;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.expand");
            C49520tu6.show$default(imageView2, !z, 0, 2, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:63:0x01ab, code lost:
            if (r13 != false) goto L43;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
        @Override // p000.C29735w1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void bind(int i) {
            boolean z;
            String str;
            boolean isBlank;
            ColorStateList valueOf;
            boolean isBlank2;
            ArrayList arrayList;
            boolean z2;
            String str2;
            boolean z3;
            boolean isBlank3;
            Object m105816c = this.f28600e.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof RidePassView)) {
                m105816c = null;
            }
            RidePassView ridePassView = (RidePassView) m105816c;
            if (ridePassView == null) {
                return;
            }
            DateTime createdAt = ridePassView.getCreatedAt();
            DateTime expiresAt = ridePassView.getExpiresAt();
            this.f28599d = ridePassView;
            this.f28598c.f111337k.setText(ridePassView.getTitle());
            TextView textView = this.f28598c.f111339m;
            C51916xx1 c51916xx1 = C51916xx1.f118396a;
            long price = ridePassView.getPrice();
            Currency m25591o = C45097mS5.m25591o(ridePassView.getCurrency());
            EnumC36501Ux1 enumC36501Ux1 = EnumC36501Ux1.SHOW_IF_NON_ZERO;
            textView.setText(c51916xx1.m4408d(price, m25591o, enumC36501Ux1));
            this.f28598c.f111335i.setText(ridePassView.getDetailBody());
            Button button = this.f28598c.f111336j;
            Intrinsics.checkNotNullExpressionValue(button, "binding.passBuy");
            C49520tu6.show$default(button, ridePassView.isAvailable(), 0, 2, null);
            Long previousPrice = ridePassView.getPreviousPrice();
            if (previousPrice != null) {
                this.f28598c.f111338l.setText(c51916xx1.m4408d(previousPrice.longValue(), C45097mS5.m25591o(ridePassView.getCurrency()), enumC36501Ux1));
                TextView textView2 = this.f28598c.f111338l;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.previousPrice");
                C49520tu6.m11233r(textView2);
            }
            if (createdAt != null && expiresAt != null) {
                this.f28598c.f111344r.setText(c51916xx1.m4405g(getContext(), createdAt, expiresAt, false));
                TextView textView3 = this.f28598c.f111344r;
                Intrinsics.checkNotNullExpressionValue(textView3, "binding.validityPeriod");
                C49520tu6.m11233r(textView3);
            } else {
                TextView textView4 = this.f28598c.f111344r;
                Intrinsics.checkNotNullExpressionValue(textView4, "binding.validityPeriod");
                C49520tu6.m11239l(textView4);
            }
            TextView textView5 = this.f28598c.f111334h;
            boolean z4 = true;
            if (ridePassView.isActive()) {
                str = getContext().getString(C45871nl4.active_uppercased);
            } else if (ridePassView.isIneligible()) {
                str = getContext().getString(C45871nl4.inactive);
            } else {
                String label = ridePassView.getLabel();
                if (label != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(label);
                    if (!isBlank) {
                        z = true;
                        if (!z) {
                            str = ridePassView.getLabel();
                        } else {
                            str = null;
                        }
                    }
                }
                z = false;
                if (!z) {
                }
            }
            textView5.setText(str);
            TextView textView6 = this.f28598c.f111334h;
            if (ridePassView.isIneligible()) {
                Context context = this.f28597b.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                valueOf = ColorStateList.valueOf(C40788fB0.m41776f(context, C32364Df4.secondaryBG));
            } else {
                Context context2 = this.f28597b.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "view.context");
                valueOf = ColorStateList.valueOf(C40788fB0.m41776f(context2, C32364Df4.tertiaryBG));
            }
            textView6.setBackgroundTintList(valueOf);
            TextView textView7 = this.f28598c.f111334h;
            Intrinsics.checkNotNullExpressionValue(textView7, "binding.label");
            CharSequence text = this.f28598c.f111334h.getText();
            Intrinsics.checkNotNullExpressionValue(text, "binding.label.text");
            isBlank2 = StringsKt__StringsJVMKt.isBlank(text);
            C49520tu6.show$default(textView7, !isBlank2, 0, 2, null);
            List<String> detailBodyList = ridePassView.getDetailBodyList();
            if (detailBodyList != null) {
                arrayList = new ArrayList();
                for (Object obj : detailBodyList) {
                    isBlank3 = StringsKt__StringsJVMKt.isBlank((String) obj);
                    if (!isBlank3) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                this.f28598c.f111330d.setDetails(arrayList);
                Integer m90177w = this.f28600e.m90177w();
                if (m90177w == null || i != m90177w.intValue()) {
                    RidePassView ridePassView2 = this.f28599d;
                    if (ridePassView2 != null && ridePassView2.isActive()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                m90171b(true);
            } else {
                RidePassV2DetailsView ridePassV2DetailsView = this.f28598c.f111330d;
                Intrinsics.checkNotNullExpressionValue(ridePassV2DetailsView, "binding.details");
                C49520tu6.show$default(ridePassV2DetailsView, false, 0, 2, null);
                ImageView imageView = this.f28598c.f111333g;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.hide");
                C49520tu6.show$default(imageView, false, 0, 2, null);
                ImageView imageView2 = this.f28598c.f111332f;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.expand");
                C49520tu6.show$default(imageView2, false, 0, 2, null);
            }
            Group group = this.f28598c.f111343q;
            Intrinsics.checkNotNullExpressionValue(group, "binding.transferGroup");
            C49520tu6.show$default(group, ridePassView.getNeedsDeviceTransfer(), 0, 2, null);
            Button button2 = this.f28598c.f111328b;
            Intrinsics.checkNotNullExpressionValue(button2, "binding.cancelButton");
            if (!ridePassView.isPurchased()) {
                ridePassView = null;
            }
            if (ridePassView != null) {
                str2 = ridePassView.getCancelArticleId();
            } else {
                str2 = null;
            }
            if (str2 == null) {
                z4 = false;
            }
            C49520tu6.show$default(button2, z4, 0, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: PV4$c */
    /* loaded from: classes3.dex */
    public static final class C6394c extends Lambda implements Function0<Observable<RidePassView>> {
        public C6394c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<RidePassView> invoke() {
            return PV4.this.f28589g.hide();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: PV4$d */
    /* loaded from: classes3.dex */
    public static final class C6395d extends Lambda implements Function0<Observable<RidePassView>> {
        public C6395d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<RidePassView> invoke() {
            return PV4.this.f28591i.hide();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\n"}, m28432d2 = {"PV4$e", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePassV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV2Adapter.kt\nco/bird/android/feature/ridepass/v2/list/adapter/RidePassV2Adapter$getDiffCallback$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,178:1\n18#2:179\n9#3,4:180\n*S KotlinDebug\n*F\n+ 1 RidePassV2Adapter.kt\nco/bird/android/feature/ridepass/v2/list/adapter/RidePassV2Adapter$getDiffCallback$1\n*L\n54#1:179\n54#1:180,4\n*E\n"})
    /* renamed from: PV4$e */
    /* loaded from: classes3.dex */
    public static final class C6396e implements InterfaceC2152F6 {
        @Override // p000.InterfaceC2152F6
        /* renamed from: a */
        public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
            return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
        }

        @Override // p000.InterfaceC2152F6
        /* renamed from: b */
        public String mo29b(C2637G6 adapterItem) {
            String linkCode;
            Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
            Object m105816c = adapterItem.m105816c();
            if (!(m105816c instanceof RidePassView)) {
                m105816c = null;
            }
            RidePassView ridePassView = (RidePassView) m105816c;
            if (ridePassView == null || (linkCode = ridePassView.getLinkCode()) == null) {
                return "";
            }
            return linkCode;
        }

        @Override // p000.InterfaceC2152F6
        /* renamed from: c */
        public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return !Intrinsics.areEqual(oldItem.m105816c(), newItem.m105816c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: PV4$f */
    /* loaded from: classes3.dex */
    public static final class C6397f extends Lambda implements Function0<Observable<RidePassView>> {
        public C6397f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<RidePassView> invoke() {
            return PV4.this.f28590h.hide();
        }
    }

    public PV4() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        lazy = LazyKt__LazyJVMKt.lazy(new C6394c());
        this.f28585c = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C6397f());
        this.f28586d = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C6395d());
        this.f28587e = lazy3;
        C45168ma4<RidePassView> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<RidePassView>()");
        this.f28589g = m25409g;
        C45168ma4<RidePassView> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<RidePassView>()");
        this.f28590h = m25409g2;
        C45168ma4<RidePassView> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<RidePassView>()");
        this.f28591i = m25409g3;
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C6396e();
    }

    /* renamed from: v */
    public final Observable<RidePassView> m90178v() {
        Object value = this.f28585c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-buyClicks>(...)");
        return (Observable) value;
    }

    /* renamed from: w */
    public final Integer m90177w() {
        return this.f28588f;
    }

    /* renamed from: x */
    public final Observable<RidePassView> m90176x() {
        Object value = this.f28586d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-transferClicks>(...)");
        return (Observable) value;
    }

    /* renamed from: y */
    public final Integer m90175y(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        for (C2637G6 c2637g6 : m94545o().m109394h()) {
            Object m105816c = c2637g6.m105816c();
            if (!(m105816c instanceof RidePassView)) {
                m105816c = null;
            }
            RidePassView ridePassView = (RidePassView) m105816c;
            if (ridePassView != null) {
                str2 = ridePassView.getLinkCode();
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual(str2, str)) {
                int indexOf = m94545o().m109394h().indexOf(c2637g6);
                this.f28588f = Integer.valueOf(indexOf);
                return Integer.valueOf(indexOf);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: z0 */
    public final Observable<RidePassView> m90174z0() {
        Object value = this.f28587e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-cancelClicks>(...)");
        return (Observable) value;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C33102Gj4.view_ride_pass_v2_card ? new C6387b(this, m41761u) : i == C33102Gj4.view_ride_pass_v2_header ? new C6385a(this, m41761u) : new C29735w1(m41761u);
    }
}
