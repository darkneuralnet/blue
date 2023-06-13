package co.bird.android.feature.transferorder.scanner.outbound.base;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.C11925l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.TransferOrderDemandSource;
import co.bird.android.model.wire.WireSkuScanItem;
import co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.android.material.snackbar.Snackbar;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C33011Fz3;
import p000.H31;
import p000.S74;
@Metadata(m28433d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\b&\u0018\u0000 `*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001aB\u0007¢\u0006\u0004\b^\u0010_J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0014J\b\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J.\u0010\u0019\u001a\u00020\b2$\u0010\u0018\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00150\u00140\u0013H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0016J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001c0\u001aH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u001aH\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u001aH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001aH\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u001aH\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0016J\u001a\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00170\u00140\u001aH\u0016J\b\u0010&\u001a\u00020\bH&R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u0010<\u001a\u0002078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010FR\"\u0010L\u001a\u0010\u0012\f\u0012\n I*\u0004\u0018\u00010\u00170\u00170H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\"\u0010N\u001a\u0010\u0012\f\u0012\n I*\u0004\u0018\u00010\f0\f0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010KR\"\u0010P\u001a\u0010\u0012\f\u0012\n I*\u0004\u0018\u00010\u00040\u00040H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010KR\"\u0010R\u001a\u0010\u0012\f\u0012\n I*\u0004\u0018\u00010\u00160\u00160H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010KR\"\u0010T\u001a\u0010\u0012\f\u0012\n I*\u0004\u0018\u00010\b0\b0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010KR\"\u0010V\u001a\u0010\u0012\f\u0012\n I*\u0004\u0018\u00010\b0\b0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010KR6\u0010\u000f\u001a\"\u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00150\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u001c\u0010]\u001a\u00028\u00008&@&X¦\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\¨\u0006b"}, m28432d2 = {"Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;", "LFz3;", "T", "Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;", "LLz3;", "LKz3;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "outState", "onSaveInstanceState", "onBackPressed", TransferTable.COLUMN_STATE, "q0", "Lkotlin/Function0;", "Lkotlin/Pair;", "", "LPC5;", "", "saveInstance", "y2", "Lio/reactivex/Observable;", "I", "Lco/bird/android/buava/Optional;", "A1", "s0", "a0", "o3", "V", "z1", "W", "Lco/bird/android/model/wire/WireSkuScanItem;", "r4", "o0", "Lbz3;", "l", "Lbz3;", "j0", "()Lbz3;", "setConverter", "(Lbz3;)V", "converter", "Lwi2;", "m", "Lwi2;", "m0", "()Lwi2;", "setJsonDeserializer", "(Lwi2;)V", "jsonDeserializer", "LZy3;", "n", "LZy3;", "i0", "()LZy3;", "adapter", "LmX5;", "o", "Lkotlin/Lazy;", "n0", "()LmX5;", "swipeHelper", "Landroidx/recyclerview/widget/l;", "p", "k0", "()Landroidx/recyclerview/widget/l;", "itemTouchHelper", "Lma4;", "kotlin.jvm.PlatformType", "q", "Lma4;", "skuOrderIdRelay", "r", "serviceCenterScanRelay", "s", "restoreStateRelay", "t", "undoClicksRelay", "u", "backPressRelay", "v", "exitConfirmRelay", "w", "Lkotlin/jvm/functions/Function0;", "getPresenter", "()LFz3;", "setPresenter", "(LFz3;)V", "presenter", "<init>", "()V", "x", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseOutboundScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseOutboundScanActivity.kt\nco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,252:1\n1#2:253\n199#3:254\n218#3:255\n199#3:256\n*S KotlinDebug\n*F\n+ 1 BaseOutboundScanActivity.kt\nco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity\n*L\n168#1:254\n177#1:255\n183#1:256\n*E\n"})
/* loaded from: classes3.dex */
public abstract class BaseOutboundScanActivity<T extends C33011Fz3> extends BaseVehicleScanActivity<C34415Lz3> implements InterfaceC34181Kz3 {

    /* renamed from: x */
    public static final C15824a f65745x = new C15824a(null);

    /* renamed from: l */
    public C38877bz3 f65746l;

    /* renamed from: m */
    public C51174wi2 f65747m;

    /* renamed from: n */
    public final C37682Zy3 f65748n = new C37682Zy3();

    /* renamed from: o */
    public final Lazy f65749o;

    /* renamed from: p */
    public final Lazy f65750p;

    /* renamed from: q */
    public final C45168ma4<String> f65751q;

    /* renamed from: r */
    public final C45168ma4<Boolean> f65752r;

    /* renamed from: s */
    public final C45168ma4<C34415Lz3> f65753s;

    /* renamed from: t */
    public final C45168ma4<PC5> f65754t;

    /* renamed from: u */
    public final C45168ma4<Unit> f65755u;

    /* renamed from: v */
    public final C45168ma4<Unit> f65756v;

    /* renamed from: w */
    public Function0<? extends Pair<? extends List<PC5>, ? extends List<String>>> f65757w;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$a;", "", "", "PEEK_HEIGHT_DP", "I", "", "SKU_SCAN_ITEMS", "Ljava/lang/String;", "SUCCESS_IDS", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15824a {
        public /* synthetic */ C15824a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C15824a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LFz3;", "T", "Lco/bird/android/model/constant/TransferOrderDemandSource;", "demandSource", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/constant/TransferOrderDemandSource;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity$b */
    /* loaded from: classes3.dex */
    public static final class C15825b extends Lambda implements Function1<TransferOrderDemandSource, InterfaceC24574u<? extends Unit>> {

        /* renamed from: g */
        public final /* synthetic */ BaseOutboundScanActivity<T> f65758g;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LFz3;", "T", "Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity$b$a */
        /* loaded from: classes3.dex */
        public static final class C15826a extends Lambda implements Function1<DialogResponse, Boolean> {

            /* renamed from: g */
            public static final C15826a f65759g = new C15826a();

            public C15826a() {
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

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LFz3;", "T", "Lco/bird/android/model/DialogResponse;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity$b$b */
        /* loaded from: classes3.dex */
        public static final class C15827b extends Lambda implements Function1<DialogResponse, Unit> {

            /* renamed from: g */
            public static final C15827b f65760g = new C15827b();

            public C15827b() {
                super(1);
            }

            /* renamed from: a */
            public final void m56450a(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                m56450a(dialogResponse);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15825b(BaseOutboundScanActivity<T> baseOutboundScanActivity) {
            super(1);
            this.f65758g = baseOutboundScanActivity;
        }

        /* renamed from: d */
        public static final Unit m56452d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Unit) tmp0.invoke(obj);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends Unit> invoke(TransferOrderDemandSource demandSource) {
            Intrinsics.checkNotNullParameter(demandSource, "demandSource");
            if (demandSource == TransferOrderDemandSource.FM_PICK_UP) {
                AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(this.f65758g.mo54814w1(), C35299Pt5.f29355d, false, false, 6, null);
                final C15826a c15826a = C15826a.f65759g;
                AbstractC24507p m33098z = birdDialog$default.m33098z(new InterfaceC23494q() { // from class: mC
                    @Override // io.reactivex.functions.InterfaceC23494q
                    public final boolean test(Object obj) {
                        boolean invoke$lambda$0;
                        invoke$lambda$0 = BaseOutboundScanActivity.C15825b.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
                final C15827b c15827b = C15827b.f65760g;
                return m33098z.m32067H(new InterfaceC23492o() { // from class: nC
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Unit m56452d;
                        m56452d = BaseOutboundScanActivity.C15825b.m56452d(Function1.this, obj);
                        return m56452d;
                    }
                });
            }
            return AbstractC24507p.m32068G(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"LFz3;", "T", "", "position", "Lio/reactivex/K;", "Lco/bird/android/buava/Optional;", "LPC5;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Integer;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseOutboundScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseOutboundScanActivity.kt\nco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$itemSwiped$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,252:1\n18#2:253\n9#3,4:254\n*S KotlinDebug\n*F\n+ 1 BaseOutboundScanActivity.kt\nco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$itemSwiped$1\n*L\n206#1:253\n206#1:254,4\n*E\n"})
    /* renamed from: co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity$c */
    /* loaded from: classes3.dex */
    public static final class C15828c extends Lambda implements Function1<Integer, InterfaceC23447K<? extends Optional<PC5>>> {

        /* renamed from: g */
        public final /* synthetic */ BaseOutboundScanActivity<T> f65761g;

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0002 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"LFz3;", "T", "Lco/bird/android/model/DialogResponse;", "response", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "LPC5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nBaseOutboundScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseOutboundScanActivity.kt\nco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$itemSwiped$1$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n18#2:253\n9#3,4:254\n1#4:258\n*S KotlinDebug\n*F\n+ 1 BaseOutboundScanActivity.kt\nco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$itemSwiped$1$1\n*L\n215#1:253\n215#1:254,4\n*E\n"})
        /* renamed from: co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity$c$a */
        /* loaded from: classes3.dex */
        public static final class C15829a extends Lambda implements Function1<DialogResponse, Pair<? extends Optional<PC5>, ? extends DialogResponse>> {

            /* renamed from: g */
            public final /* synthetic */ BaseOutboundScanActivity<T> f65762g;

            /* renamed from: h */
            public final /* synthetic */ Integer f65763h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15829a(BaseOutboundScanActivity<T> baseOutboundScanActivity, Integer num) {
                super(1);
                this.f65762g = baseOutboundScanActivity;
                this.f65763h = num;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Optional<PC5>, DialogResponse> invoke(DialogResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                C37682Zy3 m56467i0 = this.f65762g.m56467i0();
                Integer position = this.f65763h;
                Intrinsics.checkNotNullExpressionValue(position, "position");
                Object m105816c = m56467i0.m94544p(position.intValue()).m105816c();
                PC5 pc5 = null;
                if (!(m105816c instanceof Pair)) {
                    m105816c = null;
                }
                Pair pair = (Pair) m105816c;
                if (pair != null) {
                    pc5 = (PC5) pair.getFirst();
                }
                return TuplesKt.m28425to(Optional.f63040c.m59033b(pc5), response);
            }
        }

        @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u000022\u0010\u0007\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005 \u0006*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"LFz3;", "T", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "LPC5;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nBaseOutboundScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseOutboundScanActivity.kt\nco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$itemSwiped$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"})
        /* renamed from: co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity$c$b */
        /* loaded from: classes3.dex */
        public static final class C15830b extends Lambda implements Function1<Pair<? extends Optional<PC5>, ? extends DialogResponse>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ BaseOutboundScanActivity<T> f65764g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15830b(BaseOutboundScanActivity<T> baseOutboundScanActivity) {
                super(1);
                this.f65764g = baseOutboundScanActivity;
            }

            /* renamed from: b */
            public static final void m56441b(Optional scanItemOptional, BaseOutboundScanActivity this$0, View view) {
                Intrinsics.checkNotNullParameter(scanItemOptional, "$scanItemOptional");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                PC5 pc5 = (PC5) scanItemOptional.m59035e();
                if (pc5 != null) {
                    this$0.f65754t.accept(pc5);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Optional<PC5>, ? extends DialogResponse> pair) {
                invoke2((Pair<Optional<PC5>, ? extends DialogResponse>) pair);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<Optional<PC5>, ? extends DialogResponse> pair) {
                final Optional<PC5> component1 = pair.component1();
                if (pair.component2() == DialogResponse.OK) {
                    Snackbar m48855o0 = Snackbar.m48855o0(this.f65764g.m54820U().getRoot(), this.f65764g.getString(C45871nl4.transfer_order_snack_vehicle_deleted), -1);
                    final BaseOutboundScanActivity<T> baseOutboundScanActivity = this.f65764g;
                    m48855o0.m48933I().setElevation(1000.0f);
                    m48855o0.m48852r0(baseOutboundScanActivity.getString(C45871nl4.transfer_order_snack_vehicle_deleted_undo), new View.OnClickListener() { // from class: rC
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            BaseOutboundScanActivity.C15828c.C15830b.m56441b(Optional.this, baseOutboundScanActivity, view);
                        }
                    });
                    m48855o0.m48851s0(-1);
                    m48855o0.mo48864Y();
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0007*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"LFz3;", "T", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "LPC5;", "Lco/bird/android/model/DialogResponse;", "<name for destructuring parameter 0>", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity$c$c */
        /* loaded from: classes3.dex */
        public static final class C15831c extends Lambda implements Function1<Pair<? extends Optional<PC5>, ? extends DialogResponse>, Optional<PC5>> {

            /* renamed from: g */
            public static final C15831c f65765g = new C15831c();

            public C15831c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<PC5> invoke(Pair<Optional<PC5>, ? extends DialogResponse> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                Optional<PC5> component1 = pair.component1();
                if (pair.component2() != DialogResponse.OK) {
                    return Optional.f63040c.m59034a();
                }
                return component1;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15828c(BaseOutboundScanActivity<T> baseOutboundScanActivity) {
            super(1);
            this.f65761g = baseOutboundScanActivity;
        }

        /* renamed from: e */
        public static final void m56445e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final Optional m56444f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23447K<? extends Optional<PC5>> invoke(Integer position) {
            AbstractC23442F m33158H;
            Intrinsics.checkNotNullParameter(position, "position");
            Object m105816c = this.f65761g.m56467i0().m94544p(0).m105816c();
            TransferOrderDemandSource transferOrderDemandSource = null;
            if (!(m105816c instanceof C39488cz3)) {
                m105816c = null;
            }
            C39488cz3 c39488cz3 = (C39488cz3) m105816c;
            if (c39488cz3 != null) {
                transferOrderDemandSource = c39488cz3.m44772c();
            }
            if (transferOrderDemandSource == TransferOrderDemandSource.FM_PICK_UP) {
                m33158H = H31.C3014a.birdDialog$default(this.f65761g.mo54814w1(), C32257Ct5.f4859d, false, false, 6, null);
            } else {
                m33158H = AbstractC23442F.m33158H(DialogResponse.OK);
            }
            final C15829a c15829a = new C15829a(this.f65761g, position);
            AbstractC23442F m33157I = m33158H.m33157I(new InterfaceC23492o() { // from class: oC
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = BaseOutboundScanActivity.C15828c.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C15830b c15830b = new C15830b(this.f65761g);
            AbstractC23442F m33112q = m33157I.m33112q(new InterfaceC23484g() { // from class: pC
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    BaseOutboundScanActivity.C15828c.m56445e(Function1.this, obj);
                }
            });
            final C15831c c15831c = C15831c.f65765g;
            return m33112q.m33157I(new InterfaceC23492o() { // from class: qC
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m56444f;
                    m56444f = BaseOutboundScanActivity.C15828c.m56444f(Function1.this, obj);
                    return m56444f;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LFz3;", "T", "Landroidx/recyclerview/widget/l;", "b", "()Landroidx/recyclerview/widget/l;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity$d */
    /* loaded from: classes3.dex */
    public static final class C15832d extends Lambda implements Function0<C11925l> {

        /* renamed from: g */
        public final /* synthetic */ BaseOutboundScanActivity<T> f65766g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15832d(BaseOutboundScanActivity<T> baseOutboundScanActivity) {
            super(0);
            this.f65766g = baseOutboundScanActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C11925l invoke() {
            return new C11925l(this.f65766g.m56463n0());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LFz3;", "T", "Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity$e */
    /* loaded from: classes3.dex */
    public static final class C15833e extends Lambda implements Function1<DialogResponse, Boolean> {

        /* renamed from: g */
        public static final C15833e f65767g = new C15833e();

        public C15833e() {
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

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LFz3;", "T", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity$f */
    /* loaded from: classes3.dex */
    public static final class C15834f extends Lambda implements Function1<DialogResponse, Unit> {

        /* renamed from: g */
        public final /* synthetic */ BaseOutboundScanActivity<T> f65768g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15834f(BaseOutboundScanActivity<T> baseOutboundScanActivity) {
            super(1);
            this.f65768g = baseOutboundScanActivity;
        }

        /* renamed from: a */
        public final void m56437a(DialogResponse dialogResponse) {
            this.f65768g.f65756v.accept(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m56437a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LFz3;", "T", "LmX5;", "b", "()LmX5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity$g */
    /* loaded from: classes3.dex */
    public static final class C15835g extends Lambda implements Function0<C45142mX5> {

        /* renamed from: g */
        public final /* synthetic */ BaseOutboundScanActivity<T> f65769g;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LFz3;", "T", "Landroidx/recyclerview/widget/RecyclerView$D;", "viewHolder", "", C17296a.f69688o, "(Landroidx/recyclerview/widget/RecyclerView$D;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity$g$a */
        /* loaded from: classes3.dex */
        public static final class C15836a extends Lambda implements Function1<RecyclerView.AbstractC11834D, Boolean> {

            /* renamed from: g */
            public static final C15836a f65770g = new C15836a();

            public C15836a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(RecyclerView.AbstractC11834D viewHolder) {
                boolean z;
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                if (viewHolder.getBindingAdapterPosition() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15835g(BaseOutboundScanActivity<T> baseOutboundScanActivity) {
            super(0);
            this.f65769g = baseOutboundScanActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C45142mX5 invoke() {
            return new C45142mX5(this.f65769g, 0, C15836a.f65770g, null, 10, null);
        }
    }

    public BaseOutboundScanActivity() {
        Lazy lazy;
        Lazy lazy2;
        lazy = LazyKt__LazyJVMKt.lazy(new C15835g(this));
        this.f65749o = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C15832d(this));
        this.f65750p = lazy2;
        C45168ma4<String> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<String>()");
        this.f65751q = m25409g;
        C45168ma4<Boolean> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Boolean>()");
        this.f65752r = m25409g2;
        C45168ma4<C34415Lz3> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<OutboundScanState>()");
        this.f65753s = m25409g3;
        C45168ma4<PC5> m25409g4 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g4, "create<SkuScanItem>()");
        this.f65754t = m25409g4;
        C45168ma4<Unit> m25409g5 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g5, "create<Unit>()");
        this.f65755u = m25409g5;
        C45168ma4<Unit> m25409g6 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g6, "create<Unit>()");
        this.f65756v = m25409g6;
    }

    /* renamed from: h0 */
    public static final InterfaceC24574u m56468h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final InterfaceC23447K m56461p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final boolean m56459t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: w0 */
    public static final void m56458w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC34181Kz3
    /* renamed from: A1 */
    public Observable<Optional<PC5>> mo56476A1() {
        Observable<Integer> m25451b = m56463n0().m25451b();
        final C15828c c15828c = new C15828c(this);
        Observable flatMapSingle = m25451b.flatMapSingle(new InterfaceC23492o() { // from class: lC
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m56461p0;
                m56461p0 = BaseOutboundScanActivity.m56461p0(Function1.this, obj);
                return m56461p0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "T: OutboundScanPresenter…        }\n        }\n    }");
        return flatMapSingle;
    }

    @Override // p000.InterfaceC34181Kz3
    /* renamed from: I */
    public Observable<Unit> mo56429I() {
        Observable<TransferOrderDemandSource> m72166v = this.f65748n.m72166v();
        final C15825b c15825b = new C15825b(this);
        Observable flatMapMaybe = m72166v.flatMapMaybe(new InterfaceC23492o() { // from class: kC
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m56468h0;
                m56468h0 = BaseOutboundScanActivity.m56468h0(Function1.this, obj);
                return m56468h0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "override fun completeCli….just(Unit)\n      }\n    }");
        return flatMapMaybe;
    }

    @Override // p000.InterfaceC34181Kz3
    /* renamed from: V */
    public Observable<PC5> mo56475V() {
        Observable<PC5> hide = this.f65754t.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "undoClicksRelay.hide()");
        return hide;
    }

    @Override // p000.InterfaceC34181Kz3
    /* renamed from: W */
    public Observable<Unit> mo56474W() {
        Observable<Unit> hide = this.f65756v.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "exitConfirmRelay.hide()");
        return hide;
    }

    @Override // p000.InterfaceC34181Kz3
    /* renamed from: a0 */
    public Observable<Boolean> mo56472a0() {
        Observable<Boolean> hide = this.f65752r.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "serviceCenterScanRelay.hide()");
        return hide;
    }

    public abstract T getPresenter();

    /* renamed from: i0 */
    public final C37682Zy3 m56467i0() {
        return this.f65748n;
    }

    /* renamed from: j0 */
    public final C38877bz3 m56466j0() {
        C38877bz3 c38877bz3 = this.f65746l;
        if (c38877bz3 != null) {
            return c38877bz3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("converter");
        return null;
    }

    /* renamed from: k0 */
    public final C11925l m56465k0() {
        return (C11925l) this.f65750p.getValue();
    }

    /* renamed from: m0 */
    public final C51174wi2 m56464m0() {
        C51174wi2 c51174wi2 = this.f65747m;
        if (c51174wi2 != null) {
            return c51174wi2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("jsonDeserializer");
        return null;
    }

    /* renamed from: n0 */
    public final C45142mX5 m56463n0() {
        return (C45142mX5) this.f65749o.getValue();
    }

    /* renamed from: o0 */
    public abstract void mo56426o0();

    @Override // p000.InterfaceC34181Kz3
    /* renamed from: o3 */
    public Observable<C34415Lz3> mo56462o3() {
        Observable<C34415Lz3> hide = this.f65753s.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "restoreStateRelay.hide()");
        return hide;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f65755u.accept(Unit.INSTANCE);
    }

    @Override // co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity, co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        List emptyList;
        List emptyList2;
        String string;
        String string2;
        super.onCreate(bundle);
        mo56426o0();
        mo54814w1().mo86379gm(true);
        mo54814w1().m86368qm((int) C49347td3.m12001b(150));
        mo54814w1().m86366sm(false);
        m54820U().f79266i.setLayoutManager(new LinearLayoutManager(this));
        m54820U().f79266i.setAdapter(this.f65748n);
        m54820U().f79266i.setItemAnimator(new C11894g());
        m56465k0().m66204g(m54820U().f79266i);
        getPresenter().consume(this);
        if (bundle == null || (string2 = bundle.getString("sku_scan_items")) == null || (emptyList = (List) m56464m0().m6460b(string2, m56464m0().m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(PC5.class)))) == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List list = emptyList;
        if (bundle == null || (string = bundle.getString("success_ids")) == null || (emptyList2 = (List) m56464m0().m6460b(string, m56464m0().m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(String.class)))) == null) {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        this.f65753s.accept(new C34415Lz3(null, list, emptyList2, 0, null, null, null, null, null, null, null, null, 4089, null));
        this.f65752r.accept(Boolean.valueOf(getIntent().getBooleanExtra("service_center_flow", false)));
        String stringExtra = getIntent().getStringExtra("sku_order_id");
        if (stringExtra != null) {
            this.f65751q.accept(stringExtra);
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return onOptionsItemSelected(item);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Pair<? extends List<PC5>, ? extends List<String>> invoke;
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        Function0<? extends Pair<? extends List<PC5>, ? extends List<String>>> function0 = this.f65757w;
        if (function0 != null && (invoke = function0.invoke()) != null) {
            outState.putString("sku_scan_items", m56464m0().m6453i(invoke.component1()));
            outState.putString("success_ids", m56464m0().m6453i(invoke.component2()));
        }
    }

    @Override // co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity, p000.InterfaceC48362rx4
    /* renamed from: q0 */
    public void render(C34415Lz3 state) {
        boolean z;
        Intrinsics.checkNotNullParameter(state, "state");
        super.render(state);
        C35686Rk5 mo54814w1 = mo54814w1();
        boolean z2 = true;
        if (state.m96038o() > 0) {
            z = true;
        } else {
            z = false;
        }
        S74.C7343a.showProgress$default(mo54814w1, z, 0, 2, null);
        if ((!state.m96035r().isEmpty()) && state.m96035r().size() == this.f65748n.getItemCount()) {
            mo54814w1().vibrate(250L);
        }
        S74.C7343a.showProgress$default(mo54814w1(), false, 0, 2, null);
        if (state.m96032u() != null) {
            this.f65748n.mo24871u(m56466j0().m62057a(state.m96032u(), state.m96035r(), state.m96031v()));
        }
        Throwable error = state.getError();
        if (error != null) {
            mo54814w1().vibrate(1000L);
            C38689bg5.m64178c(mo54814w1(), error);
            mo54814w1().m86370p3();
        }
        C38729bk5 m96037p = state.m96037p();
        if (m96037p != null) {
            mo54814w1().vibrate(1000L);
            S74.C7343a.showProgress$default(mo54814w1(), false, 0, 2, null);
            C35686Rk5 mo54814w12 = mo54814w1();
            if (m96037p.m64056b() != TransferOrderDemandSource.FM_PICK_UP) {
                z2 = false;
            }
            Object m33135e = H31.C3014a.birdDialog$default(mo54814w12, new C37793a96(z2, m96037p.m64055c()), false, false, 6, null).m33135e(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((SingleSubscribeProxy) m33135e).subscribe();
            mo54814w1().m86370p3();
        }
        C41970hA5 m96034s = state.m96034s();
        if (m96034s != null) {
            AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(mo54814w1(), new Z86(m96034s.m36765b()), false, false, 6, null);
            final C15833e c15833e = C15833e.f65767g;
            AbstractC24507p m33098z = birdDialog$default.m33098z(new InterfaceC23494q() { // from class: iC
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m56459t0;
                    m56459t0 = BaseOutboundScanActivity.m56459t0(Function1.this, obj);
                    return m56459t0;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33098z, "rendererDelegate.birdDia…se == DialogResponse.OK }");
            Object m32048b = m33098z.m32048b(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C15834f c15834f = new C15834f(this);
            ((MaybeSubscribeProxy) m32048b).subscribe(new InterfaceC23484g() { // from class: jC
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    BaseOutboundScanActivity.m56458w0(Function1.this, obj);
                }
            });
        }
        if (state.m96036q()) {
            Object m33135e2 = H31.C3014a.birdDialog$default(mo54814w1(), C41368g96.f81697d, false, false, 6, null).m33135e(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m33135e2, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((SingleSubscribeProxy) m33135e2).subscribe();
        }
    }

    @Override // p000.InterfaceC34181Kz3
    /* renamed from: r4 */
    public Observable<Pair<WireSkuScanItem, String>> mo56424r4() {
        Observable<Pair<WireSkuScanItem, String>> never = Observable.never();
        Intrinsics.checkNotNullExpressionValue(never, "never()");
        return never;
    }

    @Override // p000.InterfaceC34181Kz3
    /* renamed from: s0 */
    public Observable<String> mo56460s0() {
        Observable<String> hide = this.f65751q.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "skuOrderIdRelay.hide()");
        return hide;
    }

    @Override // p000.InterfaceC34181Kz3
    /* renamed from: y2 */
    public void mo56457y2(Function0<? extends Pair<? extends List<PC5>, ? extends List<String>>> saveInstance) {
        Intrinsics.checkNotNullParameter(saveInstance, "saveInstance");
        this.f65757w = saveInstance;
    }

    @Override // p000.InterfaceC34181Kz3
    /* renamed from: z1 */
    public Observable<Unit> mo56456z1() {
        Observable<Unit> hide = this.f65755u.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "backPressRelay.hide()");
        return hide;
    }
}
