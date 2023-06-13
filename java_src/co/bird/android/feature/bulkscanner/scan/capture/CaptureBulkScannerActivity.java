package co.bird.android.feature.bulkscanner.scan.capture;

import android.app.Application;
import android.os.Bundle;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.C11925l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.feature.bulkscanner.scan.capture.CaptureBulkScannerActivity;
import co.bird.android.feature.bulkscanner.scan.capture.InterfaceC14635a;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.wire.WireCaptureValidation;
import co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.MaybeSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C49495ts1;
import p000.H31;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b6\u00107J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0016R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010-R\"\u00103\u001a\u0010\u0012\f\u0012\n 0*\u0004\u0018\u00010\u00060\u00060/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u00105\u001a\u0010\u0012\f\u0012\n 0*\u0004\u0018\u00010\u00060\u00060/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102¨\u00068"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;", "Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;", "LYe0;", "LXe0;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lio/reactivex/Observable;", "U2", "M8", "Lco/bird/android/model/wire/WireCaptureValidation;", "H1", TransferTable.COLUMN_STATE, "k0", "LWe0;", "l", "LWe0;", "i0", "()LWe0;", "setPresenter", "(LWe0;)V", "presenter", "LHe0;", "m", "LHe0;", "converter", "LFe0;", "n", "LFe0;", "adapter", "LmX5;", "o", "Lkotlin/Lazy;", "j0", "()LmX5;", "swipeHelper", "Landroidx/recyclerview/widget/l;", "p", "f0", "()Landroidx/recyclerview/widget/l;", "itemTouchHelper", "LYP3;", "q", "h0", "()LYP3;", "peekHelper", "Lma4;", "kotlin.jvm.PlatformType", "r", "Lma4;", "captureClicks", "s", "captureConfirms", "<init>", "()V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCaptureBulkScannerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerActivity.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,124:1\n1#2:125\n218#3:126\n237#3:127\n*S KotlinDebug\n*F\n+ 1 CaptureBulkScannerActivity.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity\n*L\n98#1:126\n106#1:127\n*E\n"})
/* loaded from: classes3.dex */
public final class CaptureBulkScannerActivity extends BaseVehicleScanActivity<C37265Ye0> implements InterfaceC37031Xe0 {

    /* renamed from: l */
    public C36797We0 f63466l;

    /* renamed from: m */
    public final C33287He0 f63467m = new C33287He0();

    /* renamed from: n */
    public final C32819Fe0 f63468n = new C32819Fe0();

    /* renamed from: o */
    public final Lazy f63469o;

    /* renamed from: p */
    public final Lazy f63470p;

    /* renamed from: q */
    public final Lazy f63471q;

    /* renamed from: r */
    public final C45168ma4<Unit> f63472r;

    /* renamed from: s */
    public final C45168ma4<Unit> f63473s;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/recyclerview/widget/l;", "b", "()Landroidx/recyclerview/widget/l;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.bulkscanner.scan.capture.CaptureBulkScannerActivity$a */
    /* loaded from: classes3.dex */
    public static final class C14624a extends Lambda implements Function0<C11925l> {
        public C14624a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C11925l invoke() {
            return new C11925l(CaptureBulkScannerActivity.this.m58603j0());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "peekHeight", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.bulkscanner.scan.capture.CaptureBulkScannerActivity$b */
    /* loaded from: classes3.dex */
    public static final class C14625b extends Lambda implements Function1<Integer, Unit> {
        public C14625b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            CaptureBulkScannerActivity.this.mo54814w1().m86368qm(i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.bulkscanner.scan.capture.CaptureBulkScannerActivity$c */
    /* loaded from: classes3.dex */
    public static final class C14626c extends Lambda implements Function0<Unit> {
        public C14626c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CaptureBulkScannerActivity.this.f63472r.accept(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireCaptureValidation;", "item", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireCaptureValidation;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCaptureBulkScannerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerActivity.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$onCreate$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
    /* renamed from: co.bird.android.feature.bulkscanner.scan.capture.CaptureBulkScannerActivity$d */
    /* loaded from: classes3.dex */
    public static final class C14627d extends Lambda implements Function1<WireCaptureValidation, Unit> {
        public C14627d() {
            super(1);
        }

        /* renamed from: a */
        public final void m58597a(WireCaptureValidation item) {
            Intrinsics.checkNotNullParameter(item, "item");
            String birdId = item.getBirdId();
            C49495ts1 c49495ts1 = null;
            if (birdId != null) {
                c49495ts1 = C49495ts1.C28846a.newInstance$default(C49495ts1.f111173f, birdId, false, 2, null);
            }
            if (c49495ts1 != null) {
                c49495ts1.show(CaptureBulkScannerActivity.this.getSupportFragmentManager(), "FlightSheetBottomSheetFragment");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireCaptureValidation wireCaptureValidation) {
            m58597a(wireCaptureValidation);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LYP3;", "b", "()LYP3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.bulkscanner.scan.capture.CaptureBulkScannerActivity$e */
    /* loaded from: classes3.dex */
    public static final class C14628e extends Lambda implements Function0<YP3> {
        public C14628e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final YP3 invoke() {
            RecyclerView recyclerView = CaptureBulkScannerActivity.this.m54820U().f79266i;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerView");
            return new YP3(recyclerView);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.bulkscanner.scan.capture.CaptureBulkScannerActivity$f */
    /* loaded from: classes3.dex */
    public static final class C14629f extends Lambda implements Function1<DialogResponse, Boolean> {

        /* renamed from: g */
        public static final C14629f f63479g = new C14629f();

        public C14629f() {
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.bulkscanner.scan.capture.CaptureBulkScannerActivity$g */
    /* loaded from: classes3.dex */
    public static final class C14630g extends Lambda implements Function1<DialogResponse, Unit> {
        public C14630g() {
            super(1);
        }

        /* renamed from: a */
        public final void m58594a(DialogResponse dialogResponse) {
            CaptureBulkScannerActivity.this.f63473s.accept(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m58594a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LmX5;", "b", "()LmX5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.bulkscanner.scan.capture.CaptureBulkScannerActivity$h */
    /* loaded from: classes3.dex */
    public static final class C14631h extends Lambda implements Function0<C45142mX5> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroidx/recyclerview/widget/RecyclerView$D;", "viewHolder", "", C17296a.f69688o, "(Landroidx/recyclerview/widget/RecyclerView$D;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.bulkscanner.scan.capture.CaptureBulkScannerActivity$h$a */
        /* loaded from: classes3.dex */
        public static final class C14632a extends Lambda implements Function1<RecyclerView.AbstractC11834D, Boolean> {

            /* renamed from: g */
            public static final C14632a f63482g = new C14632a();

            public C14632a() {
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

        public C14631h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C45142mX5 invoke() {
            return new C45142mX5(CaptureBulkScannerActivity.this, 0, C14632a.f63482g, null, 10, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.bulkscanner.scan.capture.CaptureBulkScannerActivity$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C14633i extends FunctionReferenceImpl implements Function1<Integer, C2637G6> {
        public C14633i(Object obj) {
            super(1, obj, C32819Fe0.class, "getAdapterItem", "getAdapterItem(I)Lco/bird/android/widget/adapter/AdapterItem;", 0);
        }

        /* renamed from: a */
        public final C2637G6 m58591a(int i) {
            return ((C32819Fe0) this.receiver).m94544p(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C2637G6 invoke(Integer num) {
            return m58591a(num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LG6;", "kotlin.jvm.PlatformType", "item", "Lco/bird/android/model/wire/WireCaptureValidation;", C17296a.f69688o, "(LG6;)Lco/bird/android/model/wire/WireCaptureValidation;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCaptureBulkScannerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerActivity.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$swipeToRemove$2\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,124:1\n18#2:125\n9#3,4:126\n*S KotlinDebug\n*F\n+ 1 CaptureBulkScannerActivity.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$swipeToRemove$2\n*L\n83#1:125\n83#1:126,4\n*E\n"})
    /* renamed from: co.bird.android.feature.bulkscanner.scan.capture.CaptureBulkScannerActivity$j */
    /* loaded from: classes3.dex */
    public static final class C14634j extends Lambda implements Function1<C2637G6, WireCaptureValidation> {

        /* renamed from: g */
        public static final C14634j f63483g = new C14634j();

        public C14634j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireCaptureValidation invoke(C2637G6 c2637g6) {
            Object m105816c = c2637g6.m105816c();
            if (!(m105816c instanceof WireCaptureValidation)) {
                m105816c = null;
            }
            return (WireCaptureValidation) m105816c;
        }
    }

    public CaptureBulkScannerActivity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        lazy = LazyKt__LazyJVMKt.lazy(new C14631h());
        this.f63469o = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C14624a());
        this.f63470p = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C14628e());
        this.f63471q = lazy3;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f63472r = m25409g;
        C45168ma4<Unit> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Unit>()");
        this.f63473s = m25409g2;
    }

    /* renamed from: m0 */
    public static final boolean m58601m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: n0 */
    public static final void m58600n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final C2637G6 m58599o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C2637G6) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC37031Xe0
    /* renamed from: H1 */
    public Observable<WireCaptureValidation> mo58612H1() {
        Observable<Integer> m25451b = m58603j0().m25451b();
        final C14633i c14633i = new C14633i(this.f63468n);
        Observable<R> map = m25451b.map(new InterfaceC23492o() { // from class: De0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C2637G6 m58599o0;
                m58599o0 = CaptureBulkScannerActivity.m58599o0(Function1.this, obj);
                return m58599o0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "swipeHelper.itemSwiped()…(adapter::getAdapterItem)");
        return C37279Yf5.m74575T(map, C14634j.f63483g);
    }

    @Override // p000.InterfaceC37031Xe0
    /* renamed from: M8 */
    public Observable<Unit> mo58611M8() {
        Observable<Unit> hide = this.f63473s.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "captureConfirms.hide()");
        return hide;
    }

    @Override // p000.InterfaceC37031Xe0
    /* renamed from: U2 */
    public Observable<Unit> mo58610U2() {
        Observable<Unit> hide = this.f63472r.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "captureClicks.hide()");
        return hide;
    }

    /* renamed from: f0 */
    public final C11925l m58606f0() {
        return (C11925l) this.f63470p.getValue();
    }

    /* renamed from: h0 */
    public final YP3 m58605h0() {
        return (YP3) this.f63471q.getValue();
    }

    /* renamed from: i0 */
    public final C36797We0 m58604i0() {
        C36797We0 c36797We0 = this.f63466l;
        if (c36797We0 != null) {
            return c36797We0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: j0 */
    public final C45142mX5 m58603j0() {
        return (C45142mX5) this.f63469o.getValue();
    }

    @Override // co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity, p000.InterfaceC48362rx4
    /* renamed from: k0 */
    public void render(C37265Ye0 state) {
        boolean z;
        AbstractC23461c m33159G;
        Intrinsics.checkNotNullParameter(state, "state");
        super.render(state);
        LinearProgressIndicator linearProgressIndicator = m54820U().f79263f;
        Intrinsics.checkNotNullExpressionValue(linearProgressIndicator, "binding.progressBar");
        if (state.m74660q() > 0) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(linearProgressIndicator, z, 0, 2, null);
        this.f63468n.mo24871u(this.f63467m.m103620a(state.m74659r()));
        if (state.m74662o()) {
            AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(mo54814w1(), new C41063ff0(m58604i0().m42277k().m74659r().size()), false, false, 6, null);
            final C14629f c14629f = C14629f.f63479g;
            AbstractC24507p m33098z = birdDialog$default.m33098z(new InterfaceC23494q() { // from class: Be0
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m58601m0;
                    m58601m0 = CaptureBulkScannerActivity.m58601m0(Function1.this, obj);
                    return m58601m0;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33098z, "rendererDelegate.birdDia…se == DialogResponse.OK }");
            Object m32048b = m33098z.m32048b(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C14630g c14630g = new C14630g();
            ((MaybeSubscribeProxy) m32048b).subscribe(new InterfaceC23484g() { // from class: Ce0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    CaptureBulkScannerActivity.m58600n0(Function1.this, obj);
                }
            });
        }
        String m74661p = state.m74661p();
        if (m74661p != null) {
            AbstractC23442F birdDialog$default2 = H31.C3014a.birdDialog$default(mo54814w1(), new C51207wl5(m74661p), false, false, 6, null);
            if (birdDialog$default2 != null && (m33159G = birdDialog$default2.m33159G()) != null) {
                Object m33041n = m33159G.m33041n(AutoDispose.m45239a(this));
                Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                CompletableSubscribeProxy completableSubscribeProxy = (CompletableSubscribeProxy) m33041n;
                if (completableSubscribeProxy != null) {
                    completableSubscribeProxy.subscribe();
                }
            }
        }
        Throwable error = state.getError();
        if (error != null) {
            C38689bg5.m64178c(mo54814w1(), error);
        }
    }

    @Override // co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity, co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC14635a.InterfaceC14636a m58589a = C14637b.m58589a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m58589a.mo58585a(c46172oG2.m21419a(application)).mo58588a(this);
        mo54814w1().mo86379gm(true);
        mo54814w1().m86366sm(true);
        m54820U().f79266i.setAdapter(this.f63468n);
        m54820U().f79266i.setLayoutManager(new LinearLayoutManager(this));
        m54820U().f79266i.setItemAnimator(new C11894g());
        m58606f0().m66204g(m54820U().f79266i);
        m58605h0().m75089g(new C14625b());
        this.f63468n.m106826A(m58605h0());
        this.f63468n.m106821y(new C14626c());
        this.f63468n.m106825B(new C14627d());
        m58604i0().consume(this);
    }
}
