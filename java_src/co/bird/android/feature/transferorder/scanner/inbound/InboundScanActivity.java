package co.bird.android.feature.transferorder.scanner.inbound;

import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.feature.transferorder.scanner.inbound.InboundScanActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.TransferOrderDemandSource;
import co.bird.android.model.wire.WireFleet;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSkuScanItem;
import co.bird.android.model.wire.WireSkuVehicle;
import co.bird.android.model.wire.WireTransferOrder;
import co.bird.android.model.wire.WireTransferOrderLineItem;
import co.bird.android.model.wire.WireWarehouse;
import co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C38292b02;
import p000.H31;
import p000.InterfaceC36379Uj5;
import p000.S74;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00017B\u0007¢\u0006\u0004\b4\u00105J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0016J\u001a\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\u000f0\nH\u0016J\u001a\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f0\nH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010-\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\u000b0\u000b0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010/\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\r0\r0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R:\u00101\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r **\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f0\u000f0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010,R:\u00103\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012 **\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f0\u000f0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010,¨\u00068"}, m28432d2 = {"Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;", "Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;", "Lg12;", "Lf12;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", TransferTable.COLUMN_STATE, "k0", "Lio/reactivex/Observable;", "", "s0", "", "a0", "Lkotlin/Pair;", "j6", "Lco/bird/android/model/wire/WireSkuScanItem;", "Lco/bird/android/model/wire/WireSkuOrder;", "N2", "k6", "La12;", "l", "La12;", "j0", "()La12;", "setPresenter", "(La12;)V", "presenter", "Lw02;", "m", "Lw02;", "i0", "()Lw02;", "setConverter", "(Lw02;)V", "converter", "Lu02;", "n", "Lu02;", "adapter", "Lma4;", "kotlin.jvm.PlatformType", "o", "Lma4;", "skuOrderIdSubject", "p", "serviceCenterScanSubject", "q", "vehicleAcceptanceSubject", "r", "forceScanSubject", "<init>", "()V", "s", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInboundScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanActivity.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,185:1\n1#2:186\n1747#3,3:187\n218#4:190\n218#4:191\n199#4:192\n199#4:193\n199#4:194\n*S KotlinDebug\n*F\n+ 1 InboundScanActivity.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity\n*L\n87#1:187,3\n123#1:190\n137#1:191\n143#1:192\n158#1:193\n172#1:194\n*E\n"})
/* loaded from: classes3.dex */
public final class InboundScanActivity extends BaseVehicleScanActivity<C41284g12> implements InterfaceC40691f12 {

    /* renamed from: s */
    public static final C15815a f65726s = new C15815a(null);

    /* renamed from: l */
    public C37709a12 f65727l;

    /* renamed from: m */
    public C50760w02 f65728m;

    /* renamed from: n */
    public final C49575u02 f65729n = new C49575u02();

    /* renamed from: o */
    public final C45168ma4<String> f65730o;

    /* renamed from: p */
    public final C45168ma4<Boolean> f65731p;

    /* renamed from: q */
    public final C45168ma4<Pair<String, Boolean>> f65732q;

    /* renamed from: r */
    public final C45168ma4<Pair<WireSkuScanItem, WireSkuOrder>> f65733r;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$a;", "", "", "PEEK_HEIGHT_DP", "I", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.scanner.inbound.InboundScanActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15815a {
        public /* synthetic */ C15815a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C15815a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/u;", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.scanner.inbound.InboundScanActivity$b */
    /* loaded from: classes3.dex */
    public static final class C15816b extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends Pair<? extends String, ? extends Boolean>>> {

        /* renamed from: g */
        public final /* synthetic */ C38156am5 f65734g;

        /* renamed from: h */
        public final /* synthetic */ C41284g12 f65735h;

        /* renamed from: i */
        public final /* synthetic */ InboundScanActivity f65736i;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response2", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.transferorder.scanner.inbound.InboundScanActivity$b$a */
        /* loaded from: classes3.dex */
        public static final class C15817a extends Lambda implements Function1<DialogResponse, Boolean> {

            /* renamed from: g */
            public static final C15817a f65737g = new C15817a();

            public C15817a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(DialogResponse response2) {
                boolean z;
                Intrinsics.checkNotNullParameter(response2, "response2");
                if (response2 == DialogResponse.OK) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.transferorder.scanner.inbound.InboundScanActivity$b$b */
        /* loaded from: classes3.dex */
        public static final class C15818b extends Lambda implements Function1<DialogResponse, Pair<? extends String, ? extends Boolean>> {

            /* renamed from: g */
            public final /* synthetic */ String f65738g;

            /* renamed from: h */
            public final /* synthetic */ C38156am5 f65739h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15818b(String str, C38156am5 c38156am5) {
                super(1);
                this.f65738g = str;
                this.f65739h = c38156am5;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<String, Boolean> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f65738g, Boolean.valueOf(this.f65739h.m70765b()));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/u;", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.transferorder.scanner.inbound.InboundScanActivity$b$c */
        /* loaded from: classes3.dex */
        public static final class C15819c extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends Pair<? extends String, ? extends Boolean>>> {

            /* renamed from: g */
            public static final C15819c f65740g = new C15819c();

            public C15819c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends Pair<String, Boolean>> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC24507p.m32024u();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15816b(C38156am5 c38156am5, C41284g12 c41284g12, InboundScanActivity inboundScanActivity) {
            super(1);
            this.f65734g = c38156am5;
            this.f65735h = c41284g12;
            this.f65736i = inboundScanActivity;
        }

        /* renamed from: e */
        public static final Pair m56483e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final InterfaceC24574u m56482f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC24574u<? extends Pair<String, Boolean>> invoke(DialogResponse response) {
            TransferOrderDemandSource transferOrderDemandSource;
            WireFleet destinationFleet;
            String name;
            WireTransferOrder transferOrder;
            WireWarehouse destinationWarehouse;
            WireTransferOrder transferOrder2;
            Intrinsics.checkNotNullParameter(response, "response");
            String scanIdentifier = this.f65734g.m70764c().getScanIdentifier();
            String str = "";
            if (scanIdentifier == null) {
                scanIdentifier = "";
            }
            WireTransferOrderLineItem transferOrderLineItem = this.f65735h.m40304v().getTransferOrderLineItem();
            if (transferOrderLineItem != null && (transferOrder2 = transferOrderLineItem.getTransferOrder()) != null) {
                transferOrderDemandSource = transferOrder2.getDemandSource();
            } else {
                transferOrderDemandSource = null;
            }
            if (transferOrderDemandSource == TransferOrderDemandSource.FM_DROP_OFF && response == DialogResponse.OK) {
                C35686Rk5 mo54814w1 = this.f65736i.mo54814w1();
                WireTransferOrderLineItem transferOrderLineItem2 = this.f65735h.m40304v().getTransferOrderLineItem();
                String str2 = (transferOrderLineItem2 == null || (transferOrder = transferOrderLineItem2.getTransferOrder()) == null || (destinationWarehouse = transferOrder.getDestinationWarehouse()) == null || (str2 = destinationWarehouse.getName()) == null) ? "" : "";
                WireTransferOrderLineItem transferOrderLineItem3 = this.f65735h.m40304v().getTransferOrderLineItem();
                if (transferOrderLineItem3 != null && (destinationFleet = transferOrderLineItem3.getDestinationFleet()) != null && (name = destinationFleet.getName()) != null) {
                    str = name;
                }
                AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(mo54814w1, new C32725Et5(str2, str), false, false, 6, null);
                final C15817a c15817a = C15817a.f65737g;
                AbstractC24507p m33098z = birdDialog$default.m33098z(new InterfaceC23494q() { // from class: q02
                    @Override // io.reactivex.functions.InterfaceC23494q
                    public final boolean test(Object obj) {
                        boolean invoke$lambda$0;
                        invoke$lambda$0 = InboundScanActivity.C15816b.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
                final C15818b c15818b = new C15818b(scanIdentifier, this.f65734g);
                return m33098z.m32067H(new InterfaceC23492o() { // from class: r02
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair m56483e;
                        m56483e = InboundScanActivity.C15816b.m56483e(Function1.this, obj);
                        return m56483e;
                    }
                });
            } else if (transferOrderDemandSource == TransferOrderDemandSource.FM_PICK_UP && response == DialogResponse.CANCEL) {
                C35686Rk5 mo54814w12 = this.f65736i.mo54814w1();
                String itemDisplayName = this.f65734g.m70764c().getItemDisplayName();
                if (itemDisplayName != null) {
                    str = itemDisplayName;
                }
                AbstractC23442F birdDialog$default2 = H31.C3014a.birdDialog$default(mo54814w12, new C40020dt3(str), false, false, 6, null);
                final C15819c c15819c = C15819c.f65740g;
                return birdDialog$default2.m33163C(new InterfaceC23492o() { // from class: s02
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m56482f;
                        m56482f = InboundScanActivity.C15816b.m56482f(Function1.this, obj);
                        return m56482f;
                    }
                });
            } else if (response == DialogResponse.OK) {
                return AbstractC24507p.m32068G(TuplesKt.m28425to(scanIdentifier, Boolean.valueOf(this.f65734g.m70765b())));
            } else {
                return AbstractC24507p.m32024u();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.transferorder.scanner.inbound.InboundScanActivity$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15820c extends FunctionReferenceImpl implements Function1<Pair<? extends String, ? extends Boolean>, Unit> {
        public C15820c(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends Boolean> pair) {
            invoke2((Pair<String, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<String, Boolean> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.scanner.inbound.InboundScanActivity$d */
    /* loaded from: classes3.dex */
    public static final class C15821d extends Lambda implements Function1<DialogResponse, Boolean> {

        /* renamed from: g */
        public static final C15821d f65741g = new C15821d();

        public C15821d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(DialogResponse response) {
            boolean z;
            Intrinsics.checkNotNullParameter(response, "response");
            if (response == DialogResponse.OK) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuScanItem;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.scanner.inbound.InboundScanActivity$e */
    /* loaded from: classes3.dex */
    public static final class C15822e extends Lambda implements Function1<DialogResponse, Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>> {

        /* renamed from: g */
        public final /* synthetic */ C36024Sw1 f65742g;

        /* renamed from: h */
        public final /* synthetic */ C41284g12 f65743h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15822e(C36024Sw1 c36024Sw1, C41284g12 c41284g12) {
            super(1);
            this.f65742g = c36024Sw1;
            this.f65743h = c41284g12;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<WireSkuScanItem, WireSkuOrder> invoke(DialogResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return TuplesKt.m28425to(this.f65742g.m84593b(), this.f65743h.m40304v());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.transferorder.scanner.inbound.InboundScanActivity$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15823f extends FunctionReferenceImpl implements Function1<Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>, Unit> {
        public C15823f(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireSkuScanItem, ? extends WireSkuOrder> pair) {
            invoke2((Pair<WireSkuScanItem, WireSkuOrder>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireSkuScanItem, WireSkuOrder> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }
    }

    public InboundScanActivity() {
        C45168ma4<String> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<String>()");
        this.f65730o = m25409g;
        C45168ma4<Boolean> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Boolean>()");
        this.f65731p = m25409g2;
        C45168ma4<Pair<String, Boolean>> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<Pair<String, Boolean>>()");
        this.f65732q = m25409g3;
        C45168ma4<Pair<WireSkuScanItem, WireSkuOrder>> m25409g4 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g4, "create<Pair<WireSkuScanItem, WireSkuOrder>>()");
        this.f65733r = m25409g4;
    }

    /* renamed from: m0 */
    public static final boolean m56492m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: n0 */
    public static final Pair m56491n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final void m56490o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final InterfaceC24574u m56489p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: q0 */
    public static final void m56488q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC40691f12
    /* renamed from: N2 */
    public Observable<Pair<WireSkuScanItem, WireSkuOrder>> mo42272N2() {
        Observable<Pair<WireSkuScanItem, WireSkuOrder>> hide = this.f65733r.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "forceScanSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC40691f12
    /* renamed from: a0 */
    public Observable<Boolean> mo42271a0() {
        Observable<Boolean> hide = this.f65731p.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "serviceCenterScanSubject.hide()");
        return hide;
    }

    /* renamed from: i0 */
    public final C50760w02 m56495i0() {
        C50760w02 c50760w02 = this.f65728m;
        if (c50760w02 != null) {
            return c50760w02;
        }
        Intrinsics.throwUninitializedPropertyAccessException("converter");
        return null;
    }

    /* renamed from: j0 */
    public final C37709a12 m56494j0() {
        C37709a12 c37709a12 = this.f65727l;
        if (c37709a12 != null) {
            return c37709a12;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC40691f12
    /* renamed from: j6 */
    public Observable<Pair<String, Boolean>> mo42270j6() {
        Observable<Pair<String, Boolean>> hide = this.f65732q.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "vehicleAcceptanceSubject.hide()");
        return hide;
    }

    @Override // co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity, p000.InterfaceC48362rx4
    /* renamed from: k0 */
    public void render(C41284g12 state) {
        boolean z;
        WireTransferOrder transferOrder;
        WireWarehouse destinationWarehouse;
        boolean z2;
        TransferOrderDemandSource transferOrderDemandSource;
        WireTransferOrder transferOrder2;
        Intrinsics.checkNotNullParameter(state, "state");
        super.render(state);
        C35686Rk5 mo54814w1 = mo54814w1();
        boolean z3 = true;
        if (state.m40309q() > 0) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        S74.C7343a.showProgress$default(mo54814w1, z, 0, 2, null);
        if (state.m40304v() != null) {
            this.f65729n.mo24871u(m56495i0().m7573a(state.m40304v(), state.m40305u()));
        }
        C38156am5 m40306t = state.m40306t();
        if (m40306t != null && state.m40304v() != null) {
            mo54814w1().vibrate(250L);
            List<Fragment> m67283z0 = getSupportFragmentManager().m67283z0();
            Intrinsics.checkNotNullExpressionValue(m67283z0, "supportFragmentManager.fragments");
            List<Fragment> list = m67283z0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Fragment fragment : list) {
                    if (fragment instanceof C38292b02) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (!z2 && mo54814w1().getCurrentBirdDialog() == null) {
                C38292b02.C12264a c12264a = C38292b02.f56774g;
                WireSkuVehicle bird = m40306t.m70764c().getBird();
                if (bird != null) {
                    str = bird.getId();
                }
                String str2 = str;
                String id = state.m40304v().getId();
                WireTransferOrderLineItem transferOrderLineItem = state.m40304v().getTransferOrderLineItem();
                if (transferOrderLineItem == null || (transferOrder2 = transferOrderLineItem.getTransferOrder()) == null || (transferOrderDemandSource = transferOrder2.getDemandSource()) == null) {
                    transferOrderDemandSource = TransferOrderDemandSource.UNKNOWN;
                }
                TransferOrderDemandSource transferOrderDemandSource2 = transferOrderDemandSource;
                String acceptTitle = m40306t.m70763d().getAcceptTitle();
                if (acceptTitle == null) {
                    acceptTitle = getString(C45871nl4.generic_accept_question);
                    Intrinsics.checkNotNullExpressionValue(acceptTitle, "getString(L.string.generic_accept_question)");
                }
                String str3 = acceptTitle;
                String acceptButtonTitle = m40306t.m70763d().getAcceptButtonTitle();
                if (acceptButtonTitle == null) {
                    acceptButtonTitle = getString(C45871nl4.generic_accept_uppercase);
                    Intrinsics.checkNotNullExpressionValue(acceptButtonTitle, "getString(L.string.generic_accept_uppercase)");
                }
                C38292b02 m65130a = c12264a.m65130a(str2, id, transferOrderDemandSource2, str3, acceptButtonTitle, m40306t.m70763d().getActions());
                m65130a.show(getSupportFragmentManager(), "ReceiveAcceptanceBottomSheet");
                AbstractC23442F<DialogResponse> m65132a5 = m65130a.m65132a5();
                final C15816b c15816b = new C15816b(m40306t, state, this);
                AbstractC24507p<R> m33163C = m65132a5.m33163C(new InterfaceC23492o() { // from class: l02
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m56489p0;
                        m56489p0 = InboundScanActivity.m56489p0(Function1.this, obj);
                        return m56489p0;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33163C, "override fun render(stat…CameraPreview()\n    }\n  }");
                Object m32048b = m33163C.m32048b(AutoDispose.m45239a(this));
                Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
                final C15820c c15820c = new C15820c(this.f65732q);
                ((MaybeSubscribeProxy) m32048b).subscribe(new InterfaceC23484g() { // from class: m02
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        InboundScanActivity.m56488q0(Function1.this, obj);
                    }
                });
            } else {
                return;
            }
        }
        C36024Sw1 m40310p = state.m40310p();
        if (m40310p != null && state.m40304v() != null) {
            if (mo54814w1().getCurrentBirdDialog() != null) {
                return;
            }
            WireTransferOrderLineItem transferOrderLineItem2 = state.m40304v().getTransferOrderLineItem();
            AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(mo54814w1(), new C32491Dt5((transferOrderLineItem2 == null || (transferOrder = transferOrderLineItem2.getTransferOrder()) == null || (destinationWarehouse = transferOrder.getDestinationWarehouse()) == null || (r4 = destinationWarehouse.getName()) == null) ? "" : ""), false, false, 6, null);
            final C15821d c15821d = C15821d.f65741g;
            AbstractC24507p m33098z = birdDialog$default.m33098z(new InterfaceC23494q() { // from class: n02
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m56492m0;
                    m56492m0 = InboundScanActivity.m56492m0(Function1.this, obj);
                    return m56492m0;
                }
            });
            final C15822e c15822e = new C15822e(m40310p, state);
            AbstractC24507p m32067H = m33098z.m32067H(new InterfaceC23492o() { // from class: o02
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair m56491n0;
                    m56491n0 = InboundScanActivity.m56491n0(Function1.this, obj);
                    return m56491n0;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32067H, "state: InboundScanState)…nItem to state.skuOrder }");
            Object m32048b2 = m32067H.m32048b(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m32048b2, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C15823f c15823f = new C15823f(this.f65733r);
            ((MaybeSubscribeProxy) m32048b2).subscribe(new InterfaceC23484g() { // from class: p02
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    InboundScanActivity.m56490o0(Function1.this, obj);
                }
            });
        }
        if (state.m40308r()) {
            Object m33135e = H31.C3014a.birdDialog$default(mo54814w1(), C41368g96.f81697d, false, false, 6, null).m33135e(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((SingleSubscribeProxy) m33135e).subscribe();
        }
        Throwable error = state.getError();
        if (error != null) {
            mo54814w1().vibrate(1000L);
            C38689bg5.m64178c(mo54814w1(), error);
            mo54814w1().m86370p3();
        }
        String m40311o = state.m40311o();
        if (m40311o != null) {
            mo54814w1().vibrate(1000L);
            Object m33135e2 = H31.C3014a.birdDialog$default(mo54814w1(), new C42544i86(m40311o), false, false, 6, null).m33135e(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m33135e2, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((SingleSubscribeProxy) m33135e2).subscribe();
            mo54814w1().m86370p3();
        }
        C39322ck5 m40307s = state.m40307s();
        if (m40307s != null) {
            mo54814w1().vibrate(1000L);
            C35686Rk5 mo54814w12 = mo54814w1();
            if (m40307s.m60975b() != TransferOrderDemandSource.FM_DROP_OFF) {
                z3 = false;
            }
            Object m33135e3 = H31.C3014a.birdDialog$default(mo54814w12, new C37793a96(z3, m40307s.m60974c()), false, false, 6, null).m33135e(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m33135e3, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((SingleSubscribeProxy) m33135e3).subscribe();
            mo54814w1().m86370p3();
        }
    }

    @Override // p000.InterfaceC40691f12
    /* renamed from: k6 */
    public Observable<Unit> mo42269k6() {
        return this.f65729n.m11107v();
    }

    @Override // co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity, co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC36379Uj5.InterfaceC8430a m85511a = SP0.m85511a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m85511a.mo80956a(c46172oG2.m21419a(application)).mo80960a(this);
        mo54814w1().mo86379gm(true);
        mo54814w1().m86368qm((int) C49347td3.m12001b(128));
        mo54814w1().m86366sm(false);
        m54820U().f79266i.setLayoutManager(new LinearLayoutManager(this));
        m54820U().f79266i.setAdapter(this.f65729n);
        m54820U().f79266i.setItemAnimator(new C11894g());
        m56494j0().consume(this);
        this.f65731p.accept(Boolean.valueOf(getIntent().getBooleanExtra("service_center_flow", false)));
        String stringExtra = getIntent().getStringExtra("sku_order_id");
        if (stringExtra != null) {
            this.f65730o.accept(stringExtra);
        }
    }

    @Override // p000.InterfaceC40691f12
    /* renamed from: s0 */
    public Observable<String> mo42268s0() {
        Observable<String> hide = this.f65730o.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "skuOrderIdSubject.hide()");
        return hide;
    }
}
