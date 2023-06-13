package co.bird.android.feature.complaintresolution;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.complaintresolution.ComplaintResolutionActivity;
import co.bird.android.feature.complaintresolution.adapter.ComplaintResolutionGridLayoutManager;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.FileUploadReceipt;
import co.bird.android.model.constant.ComplaintResolutionField;
import co.bird.android.model.persistence.nestedstructures.ComplaintIssueOption;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.H31;
@Metadata(m28433d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bW\u0010XJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\"\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016J\f\u0010\u0011\u001a\u00020\u0010*\u00020\u0007H\u0002R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R:\u0010(\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020$ %*\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#0#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R.\u0010,\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020* %*\n\u0012\u0004\u0012\u00020*\u0018\u00010)0)0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'R!\u00103\u001a\b\u0012\u0004\u0012\u00020.0-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R!\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102R!\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u00102R!\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00100-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u00102R!\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00100-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b=\u00100\u001a\u0004\b>\u00102R-\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020$0#0-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b@\u00100\u001a\u0004\bA\u00102R-\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D0#0-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bE\u00100\u001a\u0004\bF\u00102R!\u0010J\u001a\b\u0012\u0004\u0012\u00020*0-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bH\u00100\u001a\u0004\bI\u00102R!\u0010M\u001a\b\u0012\u0004\u0012\u00020*0-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bK\u00100\u001a\u0004\bL\u00102R!\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00050-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bN\u00100\u001a\u0004\bO\u00102R!\u0010S\u001a\b\u0012\u0004\u0012\u00020*0-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bQ\u00100\u001a\u0004\bR\u00102R'\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bT\u00100\u001a\u0004\bU\u00102¨\u0006Y"}, m28432d2 = {"Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LXr0;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Les0;", TransferTable.COLUMN_STATE, "S", "Lco/bird/android/model/constant/ComplaintResolutionField;", "Y", "Lzr0;", "j", "Lzr0;", "R", "()Lzr0;", "setPresenter", "(Lzr0;)V", "presenter", "Lyq0;", "k", "Lyq0;", "adapter", "Lo3;", "l", "Lo3;", "binding", "Lio/reactivex/subjects/d;", "Lkotlin/Pair;", "Lco/bird/android/model/FileUploadReceipt;", "kotlin.jvm.PlatformType", "m", "Lio/reactivex/subjects/d;", "photoUploadSubject", "", "", "n", "vehiclesInvolvedScansSubject", "Lio/reactivex/Observable;", "Lga2;", "o", "Lkotlin/Lazy;", "u8", "()Lio/reactivex/Observable;", "categorySelected", "p", "h9", "submitClicks", "q", "m9", "doneClicks", "r", "Y8", "addPhotoClicks", "s", "z6", "removePhotoClicks", "t", "x3", "photoAdded", "Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;", "", "u", "y0", "selectedIssues", "v", "v4", "actionTakenSelected", "w", "X2", "notesUpdated", "x", "b9", "vehicleScanClicks", "y", "j4", "vehicleRemoveClicks", "z", "Z7", "vehiclesInvolvedScans", "<init>", "()V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComplaintResolutionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionActivity.kt\nco/bird/android/feature/complaintresolution/ComplaintResolutionActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,122:1\n1#2:123\n199#3:124\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionActivity.kt\nco/bird/android/feature/complaintresolution/ComplaintResolutionActivity\n*L\n104#1:124\n*E\n"})
/* loaded from: classes3.dex */
public final class ComplaintResolutionActivity extends BaseActivityLite implements InterfaceC37148Xr0 {

    /* renamed from: j */
    public C53041zr0 f63684j;

    /* renamed from: k */
    public final C52438yq0 f63685k = new C52438yq0();

    /* renamed from: l */
    public C26802o3 f63686l;

    /* renamed from: m */
    public final C24558d<Pair<ComplaintResolutionField, FileUploadReceipt>> f63687m;

    /* renamed from: n */
    public final C24558d<List<String>> f63688n;

    /* renamed from: o */
    public final Lazy f63689o;

    /* renamed from: p */
    public final Lazy f63690p;

    /* renamed from: q */
    public final Lazy f63691q;

    /* renamed from: r */
    public final Lazy f63692r;

    /* renamed from: s */
    public final Lazy f63693s;

    /* renamed from: t */
    public final Lazy f63694t;

    /* renamed from: u */
    public final Lazy f63695u;

    /* renamed from: v */
    public final Lazy f63696v;

    /* renamed from: w */
    public final Lazy f63697w;

    /* renamed from: x */
    public final Lazy f63698x;

    /* renamed from: y */
    public final Lazy f63699y;

    /* renamed from: z */
    public final Lazy f63700z;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.complaintresolution.ComplaintResolutionActivity$a */
    /* loaded from: classes3.dex */
    public static final class C14722a extends Lambda implements Function0<Observable<String>> {
        public C14722a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<String> invoke() {
            return ComplaintResolutionActivity.this.f63685k.m2483v();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/model/constant/ComplaintResolutionField;", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.complaintresolution.ComplaintResolutionActivity$b */
    /* loaded from: classes3.dex */
    public static final class C14723b extends Lambda implements Function0<Observable<ComplaintResolutionField>> {
        public C14723b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<ComplaintResolutionField> invoke() {
            return ComplaintResolutionActivity.this.f63685k.m2484g();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "Lga2;", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.complaintresolution.ComplaintResolutionActivity$c */
    /* loaded from: classes3.dex */
    public static final class C14724c extends Lambda implements Function0<Observable<EnumC41608ga2>> {
        public C14724c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<EnumC41608ga2> invoke() {
            return ComplaintResolutionActivity.this.f63685k.m2482w();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.complaintresolution.ComplaintResolutionActivity$d */
    /* loaded from: classes3.dex */
    public static final class C14725d extends Lambda implements Function0<Observable<Unit>> {
        public C14725d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            C26802o3 c26802o3 = ComplaintResolutionActivity.this.f63686l;
            if (c26802o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c26802o3 = null;
            }
            Button button = c26802o3.f101257c;
            Intrinsics.checkNotNullExpressionValue(button, "binding.done");
            return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.complaintresolution.ComplaintResolutionActivity$e */
    /* loaded from: classes3.dex */
    public static final class C14726e extends Lambda implements Function0<Observable<String>> {
        public C14726e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<String> invoke() {
            return ComplaintResolutionActivity.this.f63685k.m2480y();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001 \u0004**\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/constant/ComplaintResolutionField;", "Lco/bird/android/model/FileUploadReceipt;", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.complaintresolution.ComplaintResolutionActivity$f */
    /* loaded from: classes3.dex */
    public static final class C14727f extends Lambda implements Function0<Observable<Pair<? extends ComplaintResolutionField, ? extends FileUploadReceipt>>> {
        public C14727f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Pair<ComplaintResolutionField, FileUploadReceipt>> invoke() {
            return ComplaintResolutionActivity.this.f63687m.hide();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/model/constant/ComplaintResolutionField;", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.complaintresolution.ComplaintResolutionActivity$g */
    /* loaded from: classes3.dex */
    public static final class C14728g extends Lambda implements Function0<Observable<ComplaintResolutionField>> {
        public C14728g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<ComplaintResolutionField> invoke() {
            return ComplaintResolutionActivity.this.f63685k.m2487A();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.complaintresolution.ComplaintResolutionActivity$h */
    /* loaded from: classes3.dex */
    public static final class C14729h extends Lambda implements Function1<DialogResponse, Unit> {
        public C14729h() {
            super(1);
        }

        /* renamed from: a */
        public final void m58427a(DialogResponse dialogResponse) {
            ComplaintResolutionActivity.this.mo58957w().close();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m58427a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.complaintresolution.ComplaintResolutionActivity$i */
    /* loaded from: classes3.dex */
    public static final class C14730i extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C14730i f63709g = new C14730i();

        public C14730i() {
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

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.complaintresolution.ComplaintResolutionActivity$j */
    /* loaded from: classes3.dex */
    public static final class C14731j extends Lambda implements Function0<Observable<Pair<? extends ComplaintIssueOption, ? extends Boolean>>> {
        public C14731j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Pair<ComplaintIssueOption, Boolean>> invoke() {
            return ComplaintResolutionActivity.this.f63685k.m2481x();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.complaintresolution.ComplaintResolutionActivity$k */
    /* loaded from: classes3.dex */
    public static final class C14732k extends Lambda implements Function0<Observable<Unit>> {
        public C14732k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            C26802o3 c26802o3 = ComplaintResolutionActivity.this.f63686l;
            if (c26802o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c26802o3 = null;
            }
            Button button = c26802o3.f101260f;
            Intrinsics.checkNotNullExpressionValue(button, "binding.submit");
            return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.complaintresolution.ComplaintResolutionActivity$l */
    /* loaded from: classes3.dex */
    public static final class C14733l extends Lambda implements Function0<Observable<String>> {
        public C14733l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<String> invoke() {
            return ComplaintResolutionActivity.this.f63685k.m2485C();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.complaintresolution.ComplaintResolutionActivity$m */
    /* loaded from: classes3.dex */
    public static final class C14734m extends Lambda implements Function0<Observable<Unit>> {
        public C14734m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            return ComplaintResolutionActivity.this.f63685k.m2486B();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001 \u0003*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/Observable;", "", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.complaintresolution.ComplaintResolutionActivity$n */
    /* loaded from: classes3.dex */
    public static final class C14735n extends Lambda implements Function0<Observable<List<? extends String>>> {
        public C14735n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<List<String>> invoke() {
            return ComplaintResolutionActivity.this.f63688n.hide();
        }
    }

    public ComplaintResolutionActivity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Lazy lazy6;
        Lazy lazy7;
        Lazy lazy8;
        Lazy lazy9;
        Lazy lazy10;
        Lazy lazy11;
        Lazy lazy12;
        C24558d<Pair<ComplaintResolutionField, FileUploadReceipt>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<ComplaintRes…ld, FileUploadReceipt>>()");
        this.f63687m = m31902e;
        C24558d<List<String>> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<List<String>>()");
        this.f63688n = m31902e2;
        lazy = LazyKt__LazyJVMKt.lazy(new C14724c());
        this.f63689o = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C14732k());
        this.f63690p = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C14725d());
        this.f63691q = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new C14723b());
        this.f63692r = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new C14728g());
        this.f63693s = lazy5;
        lazy6 = LazyKt__LazyJVMKt.lazy(new C14727f());
        this.f63694t = lazy6;
        lazy7 = LazyKt__LazyJVMKt.lazy(new C14731j());
        this.f63695u = lazy7;
        lazy8 = LazyKt__LazyJVMKt.lazy(new C14722a());
        this.f63696v = lazy8;
        lazy9 = LazyKt__LazyJVMKt.lazy(new C14726e());
        this.f63697w = lazy9;
        lazy10 = LazyKt__LazyJVMKt.lazy(new C14734m());
        this.f63698x = lazy10;
        lazy11 = LazyKt__LazyJVMKt.lazy(new C14733l());
        this.f63699y = lazy11;
        lazy12 = LazyKt__LazyJVMKt.lazy(new C14735n());
        this.f63700z = lazy12;
    }

    /* renamed from: U */
    public static final void m58449U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m58448X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public final C53041zr0 m58451R() {
        C53041zr0 c53041zr0 = this.f63684j;
        if (c53041zr0 != null) {
            return c53041zr0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: S */
    public void render(InterfaceC40600es0 state) {
        C40191eA5 c40191eA5;
        C49085tA5 c49085tA5;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C33059Ge6) {
            this.f63685k.mo24871u(((C33059Ge6) state).m104933b());
            return;
        }
        C26802o3 c26802o3 = null;
        if (state instanceof C49085tA5) {
            C26802o3 c26802o32 = this.f63686l;
            if (c26802o32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c26802o32 = null;
            }
            Button button = c26802o32.f101260f;
            Intrinsics.checkNotNullExpressionValue(button, "binding.submit");
            C49520tu6.show$default(button, ((C49085tA5) state).m12936b(), 0, 2, null);
            C26802o3 c26802o33 = this.f63686l;
            if (c26802o33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c26802o33 = null;
            }
            Button button2 = c26802o33.f101257c;
            Intrinsics.checkNotNullExpressionValue(button2, "binding.done");
            C49520tu6.show$default(button2, !c49085tA5.m12936b(), 0, 2, null);
        } else if (state instanceof C40191eA5) {
            C26802o3 c26802o34 = this.f63686l;
            if (c26802o34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c26802o34 = null;
            }
            Button button3 = c26802o34.f101257c;
            Intrinsics.checkNotNullExpressionValue(button3, "binding.done");
            C49520tu6.show$default(button3, ((C40191eA5) state).m43157b(), 0, 2, null);
            C26802o3 c26802o35 = this.f63686l;
            if (c26802o35 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c26802o35 = null;
            }
            Button button4 = c26802o35.f101260f;
            Intrinsics.checkNotNullExpressionValue(button4, "binding.submit");
            C49520tu6.show$default(button4, !c40191eA5.m43157b(), 0, 2, null);
        } else if (state instanceof C38042ab1) {
            C26802o3 c26802o36 = this.f63686l;
            if (c26802o36 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c26802o3 = c26802o36;
            }
            c26802o3.f101260f.setEnabled(((C38042ab1) state).m71175b());
        } else if (state instanceof C44935mA5) {
            C26802o3 c26802o37 = this.f63686l;
            if (c26802o37 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c26802o37 = null;
            }
            LinearProgressIndicator linearProgressIndicator = c26802o37.f101258d;
            Intrinsics.checkNotNullExpressionValue(linearProgressIndicator, "binding.progressBar");
            C49520tu6.show$default(linearProgressIndicator, ((C44935mA5) state).m26195b(), 0, 2, null);
        } else if (state instanceof C50270vA5) {
            Object m33135e = H31.C3014a.birdDialog$default(m58990F(), C41193fs0.f80865d, false, false, 6, null).m33135e(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C14729h c14729h = new C14729h();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: uq0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    ComplaintResolutionActivity.m58449U(Function1.this, obj);
                }
            };
            final C14730i c14730i = C14730i.f63709g;
            ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: vq0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    ComplaintResolutionActivity.m58448X(Function1.this, obj);
                }
            });
        } else if (state instanceof C43161jB1) {
            m58990F().errorGeneric();
        }
    }

    @Override // p000.InterfaceC37148Xr0
    /* renamed from: X2 */
    public Observable<String> mo58447X2() {
        return (Observable) this.f63697w.getValue();
    }

    /* renamed from: Y */
    public final ComplaintResolutionField m58446Y(int i) {
        if (i != 10075) {
            if (i == 10076) {
                return ComplaintResolutionField.AFTER_PHOTO;
            }
            throw new IllegalStateException();
        }
        return ComplaintResolutionField.BEFORE_PHOTO;
    }

    @Override // p000.InterfaceC37148Xr0
    /* renamed from: Y8 */
    public Observable<ComplaintResolutionField> mo58445Y8() {
        return (Observable) this.f63692r.getValue();
    }

    @Override // p000.InterfaceC37148Xr0
    /* renamed from: Z7 */
    public Observable<List<String>> mo58444Z7() {
        Object value = this.f63700z.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-vehiclesInvolvedScans>(...)");
        return (Observable) value;
    }

    @Override // p000.InterfaceC37148Xr0
    /* renamed from: b9 */
    public Observable<Unit> mo58443b9() {
        return (Observable) this.f63698x.getValue();
    }

    @Override // p000.InterfaceC37148Xr0
    /* renamed from: h9 */
    public Observable<Unit> mo58442h9() {
        return (Observable) this.f63690p.getValue();
    }

    @Override // p000.InterfaceC37148Xr0
    /* renamed from: j4 */
    public Observable<String> mo58441j4() {
        return (Observable) this.f63699y.getValue();
    }

    @Override // p000.InterfaceC37148Xr0
    /* renamed from: m9 */
    public Observable<Unit> mo58440m9() {
        return (Observable) this.f63691q.getValue();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<String> stringArrayListExtra;
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 10075:
            case 10076:
                if (i2 == -1 && intent != null) {
                    C24558d<Pair<ComplaintResolutionField, FileUploadReceipt>> c24558d = this.f63687m;
                    ComplaintResolutionField m58446Y = m58446Y(i);
                    String stringExtra = intent.getStringExtra("asset_id");
                    Intrinsics.checkNotNull(stringExtra);
                    String stringExtra2 = intent.getStringExtra("photo_url");
                    Intrinsics.checkNotNull(stringExtra2);
                    c24558d.onNext(TuplesKt.m28425to(m58446Y, new FileUploadReceipt(stringExtra, stringExtra2)));
                    return;
                }
                return;
            case 10077:
                if (i2 == -1 && intent != null && (stringArrayListExtra = intent.getStringArrayListExtra("bird_ids")) != null) {
                    this.f63688n.onNext(stringArrayListExtra);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("complaint_id");
        if (stringArrayListExtra == null) {
            return;
        }
        C14740b.m58421a().mo58416a(m58989H(), stringArrayListExtra).mo58420a(this);
        C26802o3 m21951c = C26802o3.m21951c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m21951c, "inflate(layoutInflater)");
        this.f63686l = m21951c;
        C26802o3 c26802o3 = null;
        if (m21951c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m21951c = null;
        }
        setContentView(m21951c.getRoot());
        C26802o3 c26802o32 = this.f63686l;
        if (c26802o32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c26802o32 = null;
        }
        c26802o32.f101259e.setAdapter(this.f63685k);
        C26802o3 c26802o33 = this.f63686l;
        if (c26802o33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c26802o33 = null;
        }
        c26802o33.f101259e.setLayoutManager(new ComplaintResolutionGridLayoutManager(this, this.f63685k));
        C26802o3 c26802o34 = this.f63686l;
        if (c26802o34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c26802o3 = c26802o34;
        }
        c26802o3.f101259e.setItemAnimator(new C11894g());
        m58451R().consume(this);
    }

    @Override // p000.InterfaceC37148Xr0
    /* renamed from: u8 */
    public Observable<EnumC41608ga2> mo58439u8() {
        return (Observable) this.f63689o.getValue();
    }

    @Override // p000.InterfaceC37148Xr0
    /* renamed from: v4 */
    public Observable<String> mo58438v4() {
        return (Observable) this.f63696v.getValue();
    }

    @Override // p000.InterfaceC37148Xr0
    /* renamed from: x3 */
    public Observable<Pair<ComplaintResolutionField, FileUploadReceipt>> mo58437x3() {
        Object value = this.f63694t.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-photoAdded>(...)");
        return (Observable) value;
    }

    @Override // p000.InterfaceC37148Xr0
    /* renamed from: y0 */
    public Observable<Pair<ComplaintIssueOption, Boolean>> mo58436y0() {
        return (Observable) this.f63695u.getValue();
    }

    @Override // p000.InterfaceC37148Xr0
    /* renamed from: z6 */
    public Observable<ComplaintResolutionField> mo58435z6() {
        return (Observable) this.f63693s.getValue();
    }
}
