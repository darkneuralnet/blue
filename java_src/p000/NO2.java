package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdInspection;
import co.bird.android.model.BirdInspectionJob;
import co.bird.android.model.BirdRepair;
import co.bird.android.model.FileUploadReceipt;
import co.bird.android.model.Folder;
import co.bird.android.model.MechanicRepairStep;
import co.bird.android.model.constant.BirdInspectionResult;
import co.bird.android.model.constant.ContentKind;
import co.bird.android.model.constant.Resolution;
import co.bird.android.model.constant.UploadKind;
import co.bird.android.model.wire.WireBird;
import co.bird.api.request.BirdAssignStickerHourlyBody;
import co.bird.api.request.CloseInspectionBody;
import co.bird.api.request.CloseRepairBody;
import co.bird.api.request.InspectBody;
import co.bird.api.request.InspectionJobSubmission;
import co.bird.api.request.RepairBody;
import co.bird.api.request.RepairJobSubmission;
import co.bird.api.request.SubmitInspectionJobsBody;
import co.bird.api.request.SubmitRepairJobsBody;
import co.bird.api.request.TaskIdBody;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p053io.CloseableKt;
import p000.InterfaceC38798br4;
import p000.InterfaceC8601VK;
@Metadata(m28433d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001GB9\b\u0007\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00105\u001a\u000202\u0012\u0006\u00109\u001a\u000206\u0012\u0006\u0010=\u001a\u00020:\u0012\u0006\u0010A\u001a\u00020>\u0012\u0006\u0010D\u001a\u00020B¢\u0006\u0004\bE\u0010FJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\r\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\u0012\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eH\u0016J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u001eH\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0(2\u0006\u0010'\u001a\u00020\u0005H\u0016J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0(2\u0006\u0010*\u001a\u00020\u0005H\u0016J\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001c0(2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0005H\u0016R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010C¨\u0006H"}, m28432d2 = {"LNO2;", "LFO2;", "Lbr4;", "", "jpeg", "", "fileName", "Lio/reactivex/Observable;", "Ljava/io/File;", "e0", "birdId", "Lco/bird/android/model/BirdInspection;", "r", "inspectionId", "", "Lco/bird/api/request/InspectionJobSubmission;", "inspectionJobSubmissionList", "h", "repairId", "Lco/bird/api/request/RepairJobSubmission;", "repairJobSubmissionList", "Lco/bird/android/model/BirdRepair;", "w", "pointId", "y", "G", "I", "taskId", "Lco/bird/android/model/wire/WireBird;", "F", "Lco/bird/android/model/constant/Resolution;", "closeReason", "x", "D", "v", "resolution", "i", "Lco/bird/android/model/MechanicRepairStep;", "z", "birdCode", "Lio/reactivex/F;", "g", "birdSerial", "m", "stickerId", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Landroid/content/Context;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LVK;", "c", "LVK;", "birdClient", "LjZ5;", DateTokenConverter.CONVERTER_KEY, "LjZ5;", "taskClient", "LI32;", "e", "LI32;", "inspectClient", "LJy4;", "f", "LJy4;", "repairClient", "Lef6;", "Lef6;", "uploadManager", "<init>", "(Landroid/content/Context;LVK;LjZ5;LI32;LJy4;Lef6;)V", C17296a.f69688o, "contractor_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMechanicManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MechanicManagerImpl.kt\nco/bird/android/manager/contractor/MechanicManagerImpl\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n*L\n1#1,188:1\n124#2,2:189\n*S KotlinDebug\n*F\n+ 1 MechanicManagerImpl.kt\nco/bird/android/manager/contractor/MechanicManagerImpl\n*L\n135#1:189,2\n*E\n"})
/* renamed from: NO2 */
/* loaded from: classes4.dex */
public final class NO2 implements FO2, InterfaceC38798br4 {

    /* renamed from: h */
    public static final C5567a f24520h = new C5567a(null);

    /* renamed from: b */
    public final Context f24521b;

    /* renamed from: c */
    public final InterfaceC8601VK f24522c;

    /* renamed from: d */
    public final InterfaceC43381jZ5 f24523d;

    /* renamed from: e */
    public final I32 f24524e;

    /* renamed from: f */
    public final InterfaceC33939Jy4 f24525f;

    /* renamed from: g */
    public final InterfaceC40476ef6 f24526g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LNO2$a;", "", "", "INSPECTION_PHOTO_NAME", "Ljava/lang/String;", "REPAIR_PHOTO_NAME", "<init>", "()V", "contractor_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NO2$a */
    /* loaded from: classes4.dex */
    public static final class C5567a {
        public /* synthetic */ C5567a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5567a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$zip$1\n+ 2 MechanicManagerImpl.kt\nco/bird/android/manager/contractor/MechanicManagerImpl\n*L\n1#1,304:1\n139#2:305\n*E\n"})
    /* renamed from: NO2$b */
    /* loaded from: classes4.dex */
    public static final class C5568b<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(T1 t1, T2 t2) {
            return (R) new Pair((BirdInspection) t1, (BirdRepair) t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/BirdInspection;", "Lco/bird/android/model/BirdRepair;", "it", "Lco/bird/android/model/MechanicRepairStep;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/MechanicRepairStep;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: NO2$c */
    /* loaded from: classes4.dex */
    public static final class C5569c extends Lambda implements Function1<Pair<? extends BirdInspection, ? extends BirdRepair>, MechanicRepairStep> {

        /* renamed from: g */
        public static final C5569c f24527g = new C5569c();

        public C5569c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final MechanicRepairStep invoke(Pair<BirdInspection, BirdRepair> it) {
            MechanicRepairStep mechanicRepairStep;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getSecond().getCloseReason() == Resolution.COMPLETED) {
                return MechanicRepairStep.INSPECTION;
            }
            List<BirdInspectionJob> inspectionJobs = it.getFirst().getInspectionJobs();
            if (inspectionJobs != null) {
                if (!inspectionJobs.isEmpty()) {
                    mechanicRepairStep = MechanicRepairStep.REPAIR;
                } else {
                    mechanicRepairStep = MechanicRepairStep.INSPECTION;
                }
                if (mechanicRepairStep != null) {
                    return mechanicRepairStep;
                }
            }
            return MechanicRepairStep.INSPECTION;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/MechanicRepairStep;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Lco/bird/android/model/MechanicRepairStep;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: NO2$d */
    /* loaded from: classes4.dex */
    public static final class C5570d extends Lambda implements Function1<Throwable, MechanicRepairStep> {

        /* renamed from: g */
        public static final C5570d f24528g = new C5570d();

        public C5570d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final MechanicRepairStep invoke(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return MechanicRepairStep.INSPECTION;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Ljava/io/File;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/FileUploadReceipt;", "kotlin.jvm.PlatformType", "b", "(Ljava/io/File;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: NO2$e */
    /* loaded from: classes4.dex */
    public static final class C5571e extends Lambda implements Function1<File, InterfaceC23434B<? extends FileUploadReceipt>> {
        public C5571e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends FileUploadReceipt> invoke(File it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return NO2.this.f24526g.mo28674h(it, ContentKind.PNG, UploadKind.INSPECTION_PHOTOS, Folder.INSPECTION_PHOTOS).m33123k0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/FileUploadReceipt;", "<name for destructuring parameter 0>", "Lco/bird/api/request/InspectionJobSubmission;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/FileUploadReceipt;)Lco/bird/api/request/InspectionJobSubmission;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: NO2$f */
    /* loaded from: classes4.dex */
    public static final class C5572f extends Lambda implements Function1<FileUploadReceipt, InspectionJobSubmission> {

        /* renamed from: g */
        public final /* synthetic */ String f24530g;

        /* renamed from: h */
        public final /* synthetic */ String f24531h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5572f(String str, String str2) {
            super(1);
            this.f24530g = str;
            this.f24531h = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InspectionJobSubmission invoke(FileUploadReceipt fileUploadReceipt) {
            Intrinsics.checkNotNullParameter(fileUploadReceipt, "<name for destructuring parameter 0>");
            return new InspectionJobSubmission(this.f24530g, this.f24531h, fileUploadReceipt.component2(), BirdInspectionResult.FAIL);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Ljava/io/File;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/FileUploadReceipt;", "kotlin.jvm.PlatformType", "b", "(Ljava/io/File;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: NO2$g */
    /* loaded from: classes4.dex */
    public static final class C5573g extends Lambda implements Function1<File, InterfaceC23434B<? extends FileUploadReceipt>> {
        public C5573g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends FileUploadReceipt> invoke(File it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return NO2.this.f24526g.mo28674h(it, ContentKind.PNG, UploadKind.REPAIR_PHOTOS, Folder.REPAIR_PHOTOS).m33123k0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/FileUploadReceipt;", "<name for destructuring parameter 0>", "Lco/bird/api/request/RepairJobSubmission;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/FileUploadReceipt;)Lco/bird/api/request/RepairJobSubmission;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: NO2$h */
    /* loaded from: classes4.dex */
    public static final class C5574h extends Lambda implements Function1<FileUploadReceipt, RepairJobSubmission> {

        /* renamed from: g */
        public final /* synthetic */ String f24533g;

        /* renamed from: h */
        public final /* synthetic */ String f24534h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5574h(String str, String str2) {
            super(1);
            this.f24533g = str;
            this.f24534h = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final RepairJobSubmission invoke(FileUploadReceipt fileUploadReceipt) {
            Intrinsics.checkNotNullParameter(fileUploadReceipt, "<name for destructuring parameter 0>");
            return new RepairJobSubmission(this.f24533g, this.f24534h, fileUploadReceipt.component2());
        }
    }

    public NO2(Context context, InterfaceC8601VK birdClient, InterfaceC43381jZ5 taskClient, I32 inspectClient, InterfaceC33939Jy4 repairClient, InterfaceC40476ef6 uploadManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(birdClient, "birdClient");
        Intrinsics.checkNotNullParameter(taskClient, "taskClient");
        Intrinsics.checkNotNullParameter(inspectClient, "inspectClient");
        Intrinsics.checkNotNullParameter(repairClient, "repairClient");
        Intrinsics.checkNotNullParameter(uploadManager, "uploadManager");
        this.f24521b = context;
        this.f24522c = birdClient;
        this.f24523d = taskClient;
        this.f24524e = inspectClient;
        this.f24525f = repairClient;
        this.f24526g = uploadManager;
    }

    /* renamed from: P */
    public static final MechanicRepairStep m93968P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (MechanicRepairStep) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final MechanicRepairStep m93967Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (MechanicRepairStep) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final InterfaceC23434B m93964V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final InspectionJobSubmission m93963Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InspectionJobSubmission) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final InterfaceC23434B m93962a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final RepairJobSubmission m93960c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (RepairJobSubmission) tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final File m93955f0(byte[] jpeg, NO2 this$0, String fileName) {
        Intrinsics.checkNotNullParameter(jpeg, "$jpeg");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fileName, "$fileName");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(jpeg, 0, jpeg.length, options);
        File file = new File(this$0.f24521b.getCacheDir().getAbsolutePath(), fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
            fileOutputStream.flush();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
            return file;
        } finally {
        }
    }

    @Override // p000.FO2
    /* renamed from: C */
    public AbstractC23442F<WireBird> mo93976C(String birdId, String stickerId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(stickerId, "stickerId");
        AbstractC23442F<WireBird> m93965T = m93965T(this.f24522c.m79965r(new BirdAssignStickerHourlyBody(stickerId, birdId)));
        Intrinsics.checkNotNullExpressionValue(m93965T, "birdClient.assignSticker…irdId)\n    ).schedulers()");
        return m93965T;
    }

    @Override // p000.FO2
    /* renamed from: D */
    public Observable<WireBird> mo93975D(String taskId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Observable<WireBird> m93966R = m93966R(this.f24523d.m30320d(new TaskIdBody(taskId, null, 2, null)));
        Intrinsics.checkNotNullExpressionValue(m93966R, "taskClient.escalate(Task…ody(taskId)).schedulers()");
        return m93966R;
    }

    @Override // p000.FO2
    /* renamed from: F */
    public Observable<WireBird> mo93974F(String taskId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Observable<WireBird> m93966R = m93966R(this.f24523d.m30323a(new TaskIdBody(taskId, null, 2, null)));
        Intrinsics.checkNotNullExpressionValue(m93966R, "taskClient.markTaskRepai…ody(taskId)).schedulers()");
        return m93966R;
    }

    @Override // p000.FO2
    /* renamed from: G */
    public Observable<BirdInspection> mo93973G(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Observable<BirdInspection> onErrorResumeNext = this.f24524e.m103034a(birdId).onErrorResumeNext(Observable.empty());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "inspectClient.lastForBir…eNext(Observable.empty())");
        Observable<BirdInspection> m93966R = m93966R(onErrorResumeNext);
        Intrinsics.checkNotNullExpressionValue(m93966R, "inspectClient.lastForBir…ty())\n      .schedulers()");
        return m93966R;
    }

    @Override // p000.FO2
    /* renamed from: I */
    public Observable<RepairJobSubmission> mo93972I(String repairId, String pointId, byte[] jpeg) {
        Intrinsics.checkNotNullParameter(repairId, "repairId");
        Intrinsics.checkNotNullParameter(pointId, "pointId");
        Intrinsics.checkNotNullParameter(jpeg, "jpeg");
        Observable<File> m93957e0 = m93957e0(jpeg, "repair_photo.png");
        final C5573g c5573g = new C5573g();
        Observable<R> flatMap = m93957e0.flatMap(new InterfaceC23492o() { // from class: IO2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m93962a0;
                m93962a0 = NO2.m93962a0(Function1.this, obj);
                return m93962a0;
            }
        });
        final C5574h c5574h = new C5574h(repairId, pointId);
        Observable map = flatMap.map(new InterfaceC23492o() { // from class: JO2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                RepairJobSubmission m93960c0;
                m93960c0 = NO2.m93960c0(Function1.this, obj);
                return m93960c0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun uploadRepai…}\n      .schedulers()\n  }");
        Observable<RepairJobSubmission> m93966R = m93966R(map);
        Intrinsics.checkNotNullExpressionValue(m93966R, "override fun uploadRepai…}\n      .schedulers()\n  }");
        return m93966R;
    }

    /* renamed from: R */
    public <T> Observable<T> m93966R(Observable<T> observable) {
        return InterfaceC38798br4.C13315a.m62280o(this, observable);
    }

    /* renamed from: T */
    public <T> AbstractC23442F<T> m93965T(AbstractC23442F<T> abstractC23442F) {
        return InterfaceC38798br4.C13315a.m62279p(this, abstractC23442F);
    }

    /* renamed from: e0 */
    public final Observable<File> m93957e0(final byte[] bArr, final String str) {
        Observable<File> fromCallable = Observable.fromCallable(new Callable() { // from class: MO2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                File m93955f0;
                m93955f0 = NO2.m93955f0(bArr, this, str);
                return m93955f0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(fromCallable, "fromCallable {\n        v…   }\n        file\n      }");
        return fromCallable;
    }

    @Override // p000.FO2
    /* renamed from: g */
    public AbstractC23442F<WireBird> mo93954g(String birdCode) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        AbstractC23442F<WireBird> m93965T = m93965T(InterfaceC8601VK.C8602a.validate$default(this.f24522c, null, birdCode, 1, null));
        Intrinsics.checkNotNullExpressionValue(m93965T, "birdClient.validate(bird… = birdCode).schedulers()");
        return m93965T;
    }

    @Override // p000.FO2
    /* renamed from: h */
    public Observable<BirdInspection> mo93953h(String inspectionId, List<InspectionJobSubmission> inspectionJobSubmissionList) {
        Intrinsics.checkNotNullParameter(inspectionId, "inspectionId");
        Intrinsics.checkNotNullParameter(inspectionJobSubmissionList, "inspectionJobSubmissionList");
        Observable<BirdInspection> m93966R = m93966R(this.f24524e.m103031d(new SubmitInspectionJobsBody(inspectionId, inspectionJobSubmissionList)));
        Intrinsics.checkNotNullExpressionValue(m93966R, "inspectClient.addInspect…issionList)).schedulers()");
        return m93966R;
    }

    @Override // p000.FO2
    /* renamed from: i */
    public Observable<BirdRepair> mo93952i(String repairId, Resolution resolution) {
        Intrinsics.checkNotNullParameter(repairId, "repairId");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        Observable<BirdRepair> m93966R = m93966R(this.f24525f.m99484d(new CloseRepairBody(repairId, resolution)));
        Intrinsics.checkNotNullExpressionValue(m93966R, "repairClient.closeRepair…resolution)).schedulers()");
        return m93966R;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: m */
    public <T> InterfaceC24575v<T, T> mo209m() {
        return InterfaceC38798br4.C13315a.m62288g(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: o */
    public <T> InterfaceC23435C<T, T> mo208o() {
        return InterfaceC38798br4.C13315a.m62286i(this);
    }

    @Override // p000.FO2
    /* renamed from: r */
    public Observable<BirdInspection> mo93950r(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Observable<BirdInspection> m93966R = m93966R(this.f24524e.m103032c(new InspectBody(birdId)));
        Intrinsics.checkNotNullExpressionValue(m93966R, "inspectClient.inspect(In…ody(birdId)).schedulers()");
        return m93966R;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: s */
    public <T> InterfaceC23448L<T, T> mo207s() {
        return InterfaceC38798br4.C13315a.m62284k(this);
    }

    @Override // p000.FO2
    /* renamed from: v */
    public Observable<BirdRepair> mo93949v(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Observable<BirdRepair> m93966R = m93966R(this.f24525f.m99481g(new RepairBody(birdId)));
        Intrinsics.checkNotNullExpressionValue(m93966R, "repairClient.repair(Repa…ody(birdId)).schedulers()");
        return m93966R;
    }

    @Override // p000.FO2
    /* renamed from: w */
    public Observable<BirdRepair> mo93948w(String repairId, List<RepairJobSubmission> repairJobSubmissionList) {
        Intrinsics.checkNotNullParameter(repairId, "repairId");
        Intrinsics.checkNotNullParameter(repairJobSubmissionList, "repairJobSubmissionList");
        Observable<BirdRepair> m93966R = m93966R(this.f24525f.m99483e(new SubmitRepairJobsBody(repairId, repairJobSubmissionList)));
        Intrinsics.checkNotNullExpressionValue(m93966R, "repairClient.addRepairJo…issionList)).schedulers()");
        return m93966R;
    }

    @Override // p000.FO2
    /* renamed from: x */
    public Observable<BirdInspection> mo93947x(String inspectionId, Resolution closeReason) {
        Intrinsics.checkNotNullParameter(inspectionId, "inspectionId");
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        Observable<BirdInspection> m93966R = m93966R(this.f24524e.m103033b(new CloseInspectionBody(inspectionId, closeReason)));
        Intrinsics.checkNotNullExpressionValue(m93966R, "inspectClient.closeInspe…loseReason)).schedulers()");
        return m93966R;
    }

    @Override // p000.FO2
    /* renamed from: y */
    public Observable<InspectionJobSubmission> mo93946y(String inspectionId, String pointId, byte[] jpeg) {
        Intrinsics.checkNotNullParameter(inspectionId, "inspectionId");
        Intrinsics.checkNotNullParameter(pointId, "pointId");
        Intrinsics.checkNotNullParameter(jpeg, "jpeg");
        Observable<File> m93957e0 = m93957e0(jpeg, "inspection_photo.png");
        final C5571e c5571e = new C5571e();
        Observable<R> flatMap = m93957e0.flatMap(new InterfaceC23492o() { // from class: KO2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m93964V;
                m93964V = NO2.m93964V(Function1.this, obj);
                return m93964V;
            }
        });
        final C5572f c5572f = new C5572f(inspectionId, pointId);
        Observable map = flatMap.map(new InterfaceC23492o() { // from class: LO2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InspectionJobSubmission m93963Z;
                m93963Z = NO2.m93963Z(Function1.this, obj);
                return m93963Z;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun uploadInspe…}\n      .schedulers()\n  }");
        Observable<InspectionJobSubmission> m93966R = m93966R(map);
        Intrinsics.checkNotNullExpressionValue(m93966R, "override fun uploadInspe…}\n      .schedulers()\n  }");
        return m93966R;
    }

    @Override // p000.FO2
    /* renamed from: z */
    public Observable<MechanicRepairStep> mo93945z(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        C24523e c24523e = C24523e.f91168a;
        Observable zip = Observable.zip(this.f24524e.m103034a(birdId), this.f24525f.m99487a(birdId), new C5568b());
        Intrinsics.checkExpressionValueIsNotNull(zip, "Observable.zip(source1, …ombineFunction(t1, t2) })");
        final C5569c c5569c = C5569c.f24527g;
        Observable map = zip.map(new InterfaceC23492o() { // from class: GO2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                MechanicRepairStep m93968P;
                m93968P = NO2.m93968P(Function1.this, obj);
                return m93968P;
            }
        });
        final C5570d c5570d = C5570d.f24528g;
        Observable onErrorReturn = map.onErrorReturn(new InterfaceC23492o() { // from class: HO2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                MechanicRepairStep m93967Q;
                m93967Q = NO2.m93967Q(Function1.this, obj);
                return m93967Q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(onErrorReturn, "Observables.zip(\n      i…irStep.INSPECTION\n      }");
        Observable<MechanicRepairStep> m93966R = m93966R(onErrorReturn);
        Intrinsics.checkNotNullExpressionValue(m93966R, "Observables.zip(\n      i…TION\n      }.schedulers()");
        return m93966R;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: c */
    public InterfaceC23497i mo212c() {
        return InterfaceC38798br4.C13315a.m62290e(this);
    }

    @Override // p000.FO2
    /* renamed from: m */
    public AbstractC23442F<WireBird> mo93951m(String birdSerial) {
        Intrinsics.checkNotNullParameter(birdSerial, "birdSerial");
        AbstractC23442F<WireBird> m93965T = m93965T(InterfaceC8601VK.C8602a.validate$default(this.f24522c, birdSerial, null, 2, null));
        Intrinsics.checkNotNullExpressionValue(m93965T, "birdClient.validate(seri… birdSerial).schedulers()");
        return m93965T;
    }
}
