package co.bird.android.feature.release;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.C11925l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.buava.Optional;
import co.bird.android.feature.release.InterfaceC15164b;
import co.bird.android.feature.release.ReleaseScanActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.PhotoBannerViewModel;
import co.bird.android.model.PhotoSavedModel;
import co.bird.android.model.wire.ReleaseValidationResult;
import co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.io.File;
import java.util.concurrent.TimeUnit;
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
@Metadata(m28433d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\bQ\u0010RJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0014J\"\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0016J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00120\u0011H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011H\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0016R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00104\u001a\u0004\b?\u0010@R.\u0010F\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 C*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00120B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER.\u0010H\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 C*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00120B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010ER.\u0010J\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0016 C*\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00120\u00120B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010ER\"\u0010L\u001a\u0010\u0012\f\u0012\n C*\u0004\u0018\u00010\u00060\u00060B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010ER\"\u0010N\u001a\u0010\u0012\f\u0012\n C*\u0004\u0018\u00010\u001b0\u001b0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010ER\"\u0010P\u001a\u0010\u0012\f\u0012\n C*\u0004\u0018\u00010\u00060\u00060B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010E¨\u0006S"}, m28432d2 = {"Lco/bird/android/feature/release/ReleaseScanActivity;", "Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;", "LKv4;", "LJv4;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onStart", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", TransferTable.COLUMN_STATE, "A0", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "", "N", "z2", "", "t4", "V2", "Lco/bird/android/model/wire/ReleaseValidationResult;", "H1", "Ljava/io/File;", "e3", "n2", "LAv4;", "l", "LAv4;", "q0", "()LAv4;", "setPresenter", "(LAv4;)V", "presenter", "LWu4;", "m", "LWu4;", "n0", "()LWu4;", "setConverter", "(LWu4;)V", "converter", "LVu4;", "n", "LVu4;", "adapter", "LmX5;", "o", "Lkotlin/Lazy;", "t0", "()LmX5;", "swipeHelper", "Landroidx/recyclerview/widget/l;", "p", "o0", "()Landroidx/recyclerview/widget/l;", "itemTouchHelper", "LYP3;", "q", "p0", "()LYP3;", "peekHelper", "Lma4;", "kotlin.jvm.PlatformType", "r", "Lma4;", "nestIdRelay", "s", "warehouseIdRelay", "t", "lockTogglesRelay", "u", "releaseClicksRelay", "v", "photoSavedRelay", "w", "checkLocationSettingsRelay", "<init>", "()V", "release_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReleaseScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanActivity.kt\nco/bird/android/feature/release/ReleaseScanActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,277:1\n1#2:278\n199#3:279\n199#3:280\n237#3:281\n218#3:282\n199#3:283\n199#3:284\n*S KotlinDebug\n*F\n+ 1 ReleaseScanActivity.kt\nco/bird/android/feature/release/ReleaseScanActivity\n*L\n167#1:279\n192#1:280\n200#1:281\n216#1:282\n225#1:283\n242#1:284\n*E\n"})
/* loaded from: classes3.dex */
public final class ReleaseScanActivity extends BaseVehicleScanActivity<C34146Kv4> implements InterfaceC33912Jv4 {

    /* renamed from: l */
    public C31806Av4 f64526l;

    /* renamed from: m */
    public C36945Wu4 f64527m;

    /* renamed from: n */
    public final C36711Vu4 f64528n = new C36711Vu4();

    /* renamed from: o */
    public final Lazy f64529o;

    /* renamed from: p */
    public final Lazy f64530p;

    /* renamed from: q */
    public final Lazy f64531q;

    /* renamed from: r */
    public final C45168ma4<Optional<String>> f64532r;

    /* renamed from: s */
    public final C45168ma4<Optional<String>> f64533s;

    /* renamed from: t */
    public final C45168ma4<Optional<Boolean>> f64534t;

    /* renamed from: u */
    public final C45168ma4<Unit> f64535u;

    /* renamed from: v */
    public final C45168ma4<File> f64536v;

    /* renamed from: w */
    public final C45168ma4<Unit> f64537w;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/recyclerview/widget/l;", "b", "()Landroidx/recyclerview/widget/l;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.release.ReleaseScanActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15141a extends Lambda implements Function0<C11925l> {
        public C15141a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C11925l invoke() {
            return new C11925l(ReleaseScanActivity.this.m57640t0());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.release.ReleaseScanActivity$b */
    /* loaded from: classes3.dex */
    public static final class C15142b extends Lambda implements Function1<Long, Unit> {
        public C15142b() {
            super(1);
        }

        /* renamed from: a */
        public final void m57634a(Long l) {
            ReleaseScanActivity.this.f64537w.accept(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m57634a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.release.ReleaseScanActivity$c */
    /* loaded from: classes3.dex */
    public static final class C15143c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C15143c f64540g = new C15143c();

        public C15143c() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "peekHeight", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.release.ReleaseScanActivity$d */
    /* loaded from: classes3.dex */
    public static final class C15144d extends Lambda implements Function1<Integer, Unit> {
        public C15144d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            ReleaseScanActivity.this.mo54814w1().m86368qm(i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nReleaseScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanActivity.kt\nco/bird/android/feature/release/ReleaseScanActivity$onCreate$2\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,277:1\n218#2:278\n*S KotlinDebug\n*F\n+ 1 ReleaseScanActivity.kt\nco/bird/android/feature/release/ReleaseScanActivity$onCreate$2\n*L\n117#1:278\n*E\n"})
    /* renamed from: co.bird.android.feature.release.ReleaseScanActivity$e */
    /* loaded from: classes3.dex */
    public static final class C15145e extends Lambda implements Function0<Unit> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.release.ReleaseScanActivity$e$a */
        /* loaded from: classes3.dex */
        public static final class C15146a extends Lambda implements Function1<DialogResponse, Boolean> {

            /* renamed from: g */
            public static final C15146a f64543g = new C15146a();

            public C15146a() {
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
        /* renamed from: co.bird.android.feature.release.ReleaseScanActivity$e$b */
        /* loaded from: classes3.dex */
        public static final class C15147b extends Lambda implements Function1<DialogResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ ReleaseScanActivity f64544g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15147b(ReleaseScanActivity releaseScanActivity) {
                super(1);
                this.f64544g = releaseScanActivity;
            }

            /* renamed from: a */
            public final void m57629a(DialogResponse dialogResponse) {
                this.f64544g.f64535u.accept(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                m57629a(dialogResponse);
                return Unit.INSTANCE;
            }
        }

        public C15145e() {
            super(0);
        }

        /* renamed from: c */
        public static final void m57631c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C34146Kv4 m42277k = ReleaseScanActivity.this.m57641q0().m42277k();
            AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(ReleaseScanActivity.this.mo54814w1(), new C33201Gu4(m42277k.m98137s() != null, m42277k.m98132x().size()), false, false, 6, null);
            final C15146a c15146a = C15146a.f64543g;
            AbstractC24507p m33098z = birdDialog$default.m33098z(new InterfaceC23494q() { // from class: Su4
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = ReleaseScanActivity.C15145e.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33098z, "rendererDelegate.birdDia…se == DialogResponse.OK }");
            Object m32048b = m33098z.m32048b(AutoDispose.m45239a(ReleaseScanActivity.this));
            Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C15147b c15147b = new C15147b(ReleaseScanActivity.this);
            ((MaybeSubscribeProxy) m32048b).subscribe(new InterfaceC23484g() { // from class: Tu4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    ReleaseScanActivity.C15145e.m57631c(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/ReleaseValidationResult;", "item", "", C17296a.f69688o, "(Lco/bird/android/model/wire/ReleaseValidationResult;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.release.ReleaseScanActivity$f */
    /* loaded from: classes3.dex */
    public static final class C15148f extends Lambda implements Function1<ReleaseValidationResult, Unit> {
        public C15148f() {
            super(1);
        }

        /* renamed from: a */
        public final void m57628a(ReleaseValidationResult item) {
            Intrinsics.checkNotNullParameter(item, "item");
            C49495ts1.C28846a c28846a = C49495ts1.f111173f;
            String birdId = item.getBirdId();
            if (birdId == null) {
                return;
            }
            C49495ts1.C28846a.newInstance$default(c28846a, birdId, false, 2, null).show(ReleaseScanActivity.this.getSupportFragmentManager(), "FlightSheetBottomSheetFragment");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ReleaseValidationResult releaseValidationResult) {
            m57628a(releaseValidationResult);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "lock", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.release.ReleaseScanActivity$g */
    /* loaded from: classes3.dex */
    public static final class C15149g extends Lambda implements Function1<Boolean, Unit> {
        public C15149g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ReleaseScanActivity.this.f64534t.accept(Optional.f63040c.m59032c(Boolean.valueOf(z)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LYP3;", "b", "()LYP3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.release.ReleaseScanActivity$h */
    /* loaded from: classes3.dex */
    public static final class C15150h extends Lambda implements Function0<YP3> {
        public C15150h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final YP3 invoke() {
            RecyclerView recyclerView = ReleaseScanActivity.this.m54820U().f79266i;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerView");
            return new YP3(recyclerView);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/u;", "LFQ3;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.release.ReleaseScanActivity$i */
    /* loaded from: classes3.dex */
    public static final class C15151i extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends FQ3>> {
        public C15151i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends FQ3> invoke(DialogResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (response == DialogResponse.OK) {
                return ReleaseScanActivity.this.mo58956x().m110486k().m33125j0();
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.release.ReleaseScanActivity$j */
    /* loaded from: classes3.dex */
    public static final class C15152j extends Lambda implements Function1<FQ3, Unit> {
        public C15152j() {
            super(1);
        }

        /* renamed from: a */
        public final void m57625a(FQ3 fq3) {
            ReleaseScanActivity.this.f64537w.accept(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m57625a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.release.ReleaseScanActivity$k */
    /* loaded from: classes3.dex */
    public static final class C15153k extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C15153k f64550g = new C15153k();

        public C15153k() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.release.ReleaseScanActivity$l */
    /* loaded from: classes3.dex */
    public static final class C15154l extends Lambda implements Function1<DialogResponse, Unit> {
        public C15154l() {
            super(1);
        }

        /* renamed from: a */
        public final void m57624a(DialogResponse dialogResponse) {
            ReleaseScanActivity.this.f64537w.accept(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m57624a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.release.ReleaseScanActivity$m */
    /* loaded from: classes3.dex */
    public static final class C15155m extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C15155m f64552g = new C15155m();

        public C15155m() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.release.ReleaseScanActivity$n */
    /* loaded from: classes3.dex */
    public static final class C15156n extends Lambda implements Function1<DialogResponse, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C34146Kv4 f64553g;

        /* renamed from: h */
        public final /* synthetic */ ReleaseScanActivity f64554h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15156n(C34146Kv4 c34146Kv4, ReleaseScanActivity releaseScanActivity) {
            super(1);
            this.f64553g = c34146Kv4;
            this.f64554h = releaseScanActivity;
        }

        /* renamed from: a */
        public final void m57623a(DialogResponse dialogResponse) {
            ResolvableApiException resolvableApiException;
            if (dialogResponse == DialogResponse.OK) {
                Throwable error = this.f64553g.getError();
                if (error instanceof ResolvableApiException) {
                    resolvableApiException = (ResolvableApiException) error;
                } else {
                    resolvableApiException = null;
                }
                if (resolvableApiException != null) {
                    resolvableApiException.startResolutionForResult(this.f64554h, 10090);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m57623a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LmX5;", "b", "()LmX5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.release.ReleaseScanActivity$o */
    /* loaded from: classes3.dex */
    public static final class C15157o extends Lambda implements Function0<C45142mX5> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroidx/recyclerview/widget/RecyclerView$D;", "viewHolder", "", C17296a.f69688o, "(Landroidx/recyclerview/widget/RecyclerView$D;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.release.ReleaseScanActivity$o$a */
        /* loaded from: classes3.dex */
        public static final class C15158a extends Lambda implements Function1<RecyclerView.AbstractC11834D, Boolean> {

            /* renamed from: g */
            public static final C15158a f64556g = new C15158a();

            public C15158a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(RecyclerView.AbstractC11834D viewHolder) {
                boolean z;
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                if (viewHolder.getItemViewType() == C45268mk4.item_fleet_status_vehicle) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        public C15157o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C45142mX5 invoke() {
            return new C45142mX5(ReleaseScanActivity.this, 0, C15158a.f64556g, null, 10, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.release.ReleaseScanActivity$p */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15159p extends FunctionReferenceImpl implements Function1<Integer, C2637G6> {
        public C15159p(Object obj) {
            super(1, obj, C36711Vu4.class, "getAdapterItem", "getAdapterItem(I)Lco/bird/android/widget/adapter/AdapterItem;", 0);
        }

        /* renamed from: a */
        public final C2637G6 m57620a(int i) {
            return ((C36711Vu4) this.receiver).m94544p(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C2637G6 invoke(Integer num) {
            return m57620a(num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LG6;", "kotlin.jvm.PlatformType", "item", "Lco/bird/android/model/wire/ReleaseValidationResult;", C17296a.f69688o, "(LG6;)Lco/bird/android/model/wire/ReleaseValidationResult;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReleaseScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanActivity.kt\nco/bird/android/feature/release/ReleaseScanActivity$swipeToRemove$2\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,277:1\n18#2:278\n9#3,4:279\n*S KotlinDebug\n*F\n+ 1 ReleaseScanActivity.kt\nco/bird/android/feature/release/ReleaseScanActivity$swipeToRemove$2\n*L\n257#1:278\n257#1:279,4\n*E\n"})
    /* renamed from: co.bird.android.feature.release.ReleaseScanActivity$q */
    /* loaded from: classes3.dex */
    public static final class C15160q extends Lambda implements Function1<C2637G6, ReleaseValidationResult> {

        /* renamed from: g */
        public static final C15160q f64557g = new C15160q();

        public C15160q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ReleaseValidationResult invoke(C2637G6 c2637g6) {
            boolean z;
            Object m105816c = c2637g6.m105816c();
            if (m105816c != null) {
                z = m105816c instanceof ReleaseValidationResult;
            } else {
                z = true;
            }
            if (!z) {
                m105816c = null;
            }
            return (ReleaseValidationResult) m105816c;
        }
    }

    public ReleaseScanActivity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        lazy = LazyKt__LazyJVMKt.lazy(new C15157o());
        this.f64529o = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C15141a());
        this.f64530p = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C15150h());
        this.f64531q = lazy3;
        C45168ma4<Optional<String>> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Optional<String>>()");
        this.f64532r = m25409g;
        C45168ma4<Optional<String>> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Optional<String>>()");
        this.f64533s = m25409g2;
        C45168ma4<Optional<Boolean>> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<Optional<Boolean>>()");
        this.f64534t = m25409g3;
        C45168ma4<Unit> m25409g4 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g4, "create<Unit>()");
        this.f64535u = m25409g4;
        C45168ma4<File> m25409g5 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g5, "create<File>()");
        this.f64536v = m25409g5;
        C45168ma4<Unit> m25409g6 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g6, "create<Unit>()");
        this.f64537w = m25409g6;
    }

    /* renamed from: B0 */
    public static final void m57665B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C0 */
    public static final void m57664C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E0 */
    public static final void m57663E0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F0 */
    public static final InterfaceC24574u m57662F0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: K0 */
    public static final void m57660K0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L0 */
    public static final void m57659L0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M0 */
    public static final C2637G6 m57658M0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C2637G6) tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final void m57638w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x0 */
    public static final void m57637x0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity, p000.InterfaceC48362rx4
    /* renamed from: A0 */
    public void render(C34146Kv4 state) {
        boolean z;
        Throwable error;
        AbstractC23461c m33159G;
        Intrinsics.checkNotNullParameter(state, "state");
        super.render(state);
        LinearProgressIndicator linearProgressIndicator = m54820U().f79263f;
        Intrinsics.checkNotNullExpressionValue(linearProgressIndicator, "binding.progressBar");
        if (state.m98139q() > 0) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(linearProgressIndicator, z, 0, 2, null);
        this.f64528n.mo24871u(m57645n0().m77715a(state.m98137s(), state.m98133w(), state.m98132x(), state.m98135u(), state.m98138r()));
        if (state.m98136t()) {
            Object m33135e = H31.C3014a.birdDialog$default(mo54814w1(), C46652p43.f103089d, false, false, 6, null).m33135e(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((SingleSubscribeProxy) m33135e).subscribe();
        }
        String m98134v = state.m98134v();
        if (m98134v != null) {
            AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(mo54814w1(), new C51207wl5(m98134v), false, false, 6, null);
            if (birdDialog$default != null && (m33159G = birdDialog$default.m33159G()) != null) {
                Object m33041n = m33159G.m33041n(AutoDispose.m45239a(this));
                Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                CompletableSubscribeProxy completableSubscribeProxy = (CompletableSubscribeProxy) m33041n;
                if (completableSubscribeProxy != null) {
                    completableSubscribeProxy.subscribe();
                }
            }
        }
        if (state.m98140p()) {
            AbstractC23442F birdDialog$default2 = H31.C3014a.birdDialog$default(m58990F(), C39822dZ3.f76802d, false, false, 4, null);
            final C15151i c15151i = new C15151i();
            AbstractC24507p m33163C = birdDialog$default2.m33163C(new InterfaceC23492o() { // from class: Lu4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m57662F0;
                    m57662F0 = ReleaseScanActivity.m57662F0(Function1.this, obj);
                    return m57662F0;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33163C, "override fun render(stat…::displayError)\n    }\n  }");
            Object m32048b = m33163C.m32048b(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C15152j c15152j = new C15152j();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Mu4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    ReleaseScanActivity.m57660K0(Function1.this, obj);
                }
            };
            final C15153k c15153k = C15153k.f64550g;
            ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Nu4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    ReleaseScanActivity.m57659L0(Function1.this, obj);
                }
            });
        }
        if (state.m98141o()) {
            Object m33135e2 = H31.C3014a.birdDialog$default(m58990F(), C37186Xv2.f44234d, false, false, 4, null).m33135e(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m33135e2, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C15154l c15154l = new C15154l();
            InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: Ou4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    ReleaseScanActivity.m57665B0(Function1.this, obj);
                }
            };
            final C15155m c15155m = C15155m.f64552g;
            ((SingleSubscribeProxy) m33135e2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: Pu4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    ReleaseScanActivity.m57664C0(Function1.this, obj);
                }
            });
        }
        if (state.getError() instanceof ApiException) {
            AbstractC23442F birdDialog$default3 = H31.C3014a.birdDialog$default(m58990F(), C33919Jw2.f18805d, false, false, 4, null);
            final C15156n c15156n = new C15156n(state, this);
            AbstractC23442F m33101w = birdDialog$default3.m33101w(new InterfaceC23484g() { // from class: Qu4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    ReleaseScanActivity.m57663E0(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33101w, "override fun render(stat…::displayError)\n    }\n  }");
            Object m33135e3 = m33101w.m33135e(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m33135e3, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((SingleSubscribeProxy) m33135e3).subscribe();
        } else if (state.getError() != null && (error = state.getError()) != null) {
            C38689bg5.m64178c(mo54814w1(), error);
        }
    }

    @Override // p000.InterfaceC33912Jv4
    /* renamed from: H1 */
    public Observable<ReleaseValidationResult> mo57661H1() {
        Observable<Integer> m25451b = m57640t0().m25451b();
        final C15159p c15159p = new C15159p(this.f64528n);
        Observable<R> map = m25451b.map(new InterfaceC23492o() { // from class: Ru4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C2637G6 m57658M0;
                m57658M0 = ReleaseScanActivity.m57658M0(Function1.this, obj);
                return m57658M0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "swipeHelper.itemSwiped()…(adapter::getAdapterItem)");
        return C37279Yf5.m74575T(map, C15160q.f64557g);
    }

    @Override // p000.InterfaceC33912Jv4
    /* renamed from: N */
    public Observable<Optional<String>> mo57657N() {
        Observable<Optional<String>> hide = this.f64532r.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "nestIdRelay.hide()");
        return hide;
    }

    @Override // p000.InterfaceC33912Jv4
    /* renamed from: V2 */
    public Observable<Unit> mo57656V2() {
        Observable<Unit> hide = this.f64535u.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "releaseClicksRelay.hide()");
        return hide;
    }

    @Override // p000.InterfaceC33912Jv4
    /* renamed from: e3 */
    public Observable<File> mo57652e3() {
        Observable<File> hide = this.f64536v.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "photoSavedRelay.hide()");
        return hide;
    }

    /* renamed from: n0 */
    public final C36945Wu4 m57645n0() {
        C36945Wu4 c36945Wu4 = this.f64527m;
        if (c36945Wu4 != null) {
            return c36945Wu4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("converter");
        return null;
    }

    @Override // p000.InterfaceC33912Jv4
    /* renamed from: n2 */
    public Observable<Unit> mo57644n2() {
        Observable<Unit> hide = this.f64537w.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "checkLocationSettingsRelay.hide()");
        return hide;
    }

    /* renamed from: o0 */
    public final C11925l m57643o0() {
        return (C11925l) this.f64530p.getValue();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        PhotoSavedModel photoSavedModel;
        String photoPath;
        super.onActivityResult(i, i2, intent);
        if (i != 10026) {
            if (i == 10090) {
                AbstractC23442F<Long> m33133f0 = AbstractC23442F.m33133f0(500L, TimeUnit.MILLISECONDS);
                Intrinsics.checkNotNullExpressionValue(m33133f0, "timer(500L, TimeUnit.MILLISECONDS)");
                Object m33135e = m33133f0.m33135e(AutoDispose.m45239a(this));
                Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
                final C15142b c15142b = new C15142b();
                InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Ju4
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        ReleaseScanActivity.m57638w0(Function1.this, obj);
                    }
                };
                final C15143c c15143c = C15143c.f64540g;
                ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Ku4
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        ReleaseScanActivity.m57637x0(Function1.this, obj);
                    }
                });
            }
        } else if (i2 == -1 && intent != null && (photoSavedModel = (PhotoSavedModel) intent.getParcelableExtra("photo_saved_model")) != null && (photoPath = photoSavedModel.getPhotoPath()) != null) {
            this.f64536v.accept(new File(photoPath));
        }
    }

    @Override // co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity, co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Boolean bool;
        super.onCreate(bundle);
        InterfaceC15164b.InterfaceC15165a m57618a = C15161a.m57618a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        int i = C48193rg4.ic_capture_scooter;
        int i2 = C45871nl4.lock_to_take_photo_title;
        int i3 = C45871nl4.release_photo_overlay_message;
        m57618a.mo57613a(m21419a, new PhotoBannerViewModel(null, null, Integer.valueOf(i), Integer.valueOf(C32364Df4.birdNewRoad), Integer.valueOf(i2), Integer.valueOf(i3), null, null, Integer.valueOf(C45871nl4.release_photo_confirmation_message), 195, null), this, mo58956x()).mo57614a(this);
        mo54814w1().mo86379gm(true);
        mo54814w1().m86366sm(true);
        m54820U().f79266i.setAdapter(this.f64528n);
        m54820U().f79266i.setLayoutManager(new LinearLayoutManager(this));
        m54820U().f79266i.setItemAnimator(new C11894g());
        m57643o0().m66204g(m54820U().f79266i);
        m57642p0().m75089g(new C15144d());
        this.f64528n.m79242A(m57642p0());
        this.f64528n.m79239x(new C15145e());
        this.f64528n.m79238y(new C15148f());
        this.f64528n.m79240w(new C15149g());
        m57641q0().consume(this);
        this.f64532r.accept(new Optional<>(getIntent().getStringExtra("nest_id")));
        String stringExtra = getIntent().getStringExtra("warehouse_id");
        C45168ma4<Optional<String>> c45168ma4 = this.f64533s;
        Optional.C14443a c14443a = Optional.f63040c;
        c45168ma4.accept(c14443a.m59033b(stringExtra));
        C45168ma4<Optional<Boolean>> c45168ma42 = this.f64534t;
        if (stringExtra != null) {
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        c45168ma42.accept(c14443a.m59033b(bool));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f64537w.accept(Unit.INSTANCE);
    }

    /* renamed from: p0 */
    public final YP3 m57642p0() {
        return (YP3) this.f64531q.getValue();
    }

    /* renamed from: q0 */
    public final C31806Av4 m57641q0() {
        C31806Av4 c31806Av4 = this.f64526l;
        if (c31806Av4 != null) {
            return c31806Av4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: t0 */
    public final C45142mX5 m57640t0() {
        return (C45142mX5) this.f64529o.getValue();
    }

    @Override // p000.InterfaceC33912Jv4
    /* renamed from: t4 */
    public Observable<Optional<Boolean>> mo57639t4() {
        Observable<Optional<Boolean>> hide = this.f64534t.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "lockTogglesRelay.hide()");
        return hide;
    }

    @Override // p000.InterfaceC33912Jv4
    /* renamed from: z2 */
    public Observable<Optional<String>> mo57636z2() {
        Observable<Optional<String>> hide = this.f64533s.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "warehouseIdRelay.hide()");
        return hide;
    }
}
