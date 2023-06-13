.class public final Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements LXr0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0015\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008W\u0010XJ\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\"\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000c\u0010\u0011\u001a\u00020\u0010*\u00020\u0007H\u0002R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R:\u0010(\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020$ %*\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#0#0\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R.\u0010,\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020* %*\n\u0012\u0004\u0012\u00020*\u0018\u00010)0)0\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010\'R!\u00103\u001a\u0008\u0012\u0004\u0012\u00020.0-8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102R!\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00050-8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00084\u00100\u001a\u0004\u00085\u00102R!\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u00050-8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00087\u00100\u001a\u0004\u00088\u00102R!\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00100-8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008:\u00100\u001a\u0004\u0008;\u00102R!\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u00100-8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008=\u00100\u001a\u0004\u0008>\u00102R-\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020$0#0-8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008@\u00100\u001a\u0004\u0008A\u00102R-\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D0#0-8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008E\u00100\u001a\u0004\u0008F\u00102R!\u0010J\u001a\u0008\u0012\u0004\u0012\u00020*0-8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008H\u00100\u001a\u0004\u0008I\u00102R!\u0010M\u001a\u0008\u0012\u0004\u0012\u00020*0-8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008K\u00100\u001a\u0004\u0008L\u00102R!\u0010P\u001a\u0008\u0012\u0004\u0012\u00020\u00050-8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008N\u00100\u001a\u0004\u0008O\u00102R!\u0010S\u001a\u0008\u0012\u0004\u0012\u00020*0-8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008Q\u00100\u001a\u0004\u0008R\u00102R\'\u0010V\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020*0)0-8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008T\u00100\u001a\u0004\u0008U\u00102\u00a8\u0006Y"
    }
    d2 = {
        "Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "LXr0;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "Les0;",
        "state",
        "S",
        "Lco/bird/android/model/constant/ComplaintResolutionField;",
        "Y",
        "Lzr0;",
        "j",
        "Lzr0;",
        "R",
        "()Lzr0;",
        "setPresenter",
        "(Lzr0;)V",
        "presenter",
        "Lyq0;",
        "k",
        "Lyq0;",
        "adapter",
        "Lo3;",
        "l",
        "Lo3;",
        "binding",
        "Lio/reactivex/subjects/d;",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/FileUploadReceipt;",
        "kotlin.jvm.PlatformType",
        "m",
        "Lio/reactivex/subjects/d;",
        "photoUploadSubject",
        "",
        "",
        "n",
        "vehiclesInvolvedScansSubject",
        "Lio/reactivex/Observable;",
        "Lga2;",
        "o",
        "Lkotlin/Lazy;",
        "u8",
        "()Lio/reactivex/Observable;",
        "categorySelected",
        "p",
        "h9",
        "submitClicks",
        "q",
        "m9",
        "doneClicks",
        "r",
        "Y8",
        "addPhotoClicks",
        "s",
        "z6",
        "removePhotoClicks",
        "t",
        "x3",
        "photoAdded",
        "Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;",
        "",
        "u",
        "y0",
        "selectedIssues",
        "v",
        "v4",
        "actionTakenSelected",
        "w",
        "X2",
        "notesUpdated",
        "x",
        "b9",
        "vehicleScanClicks",
        "y",
        "j4",
        "vehicleRemoveClicks",
        "z",
        "Z7",
        "vehiclesInvolvedScans",
        "<init>",
        "()V",
        "co.bird.android.feature.complaintresolution"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nComplaintResolutionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionActivity.kt\nco/bird/android/feature/complaintresolution/ComplaintResolutionActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,122:1\n1#2:123\n199#3:124\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionActivity.kt\nco/bird/android/feature/complaintresolution/ComplaintResolutionActivity\n*L\n104#1:124\n*E\n"
    }
.end annotation


# instance fields
.field public j:Lzr0;

.field public final k:Lyq0;

.field public l:Lo3;

.field public final m:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/constant/ComplaintResolutionField;",
            "Lco/bird/android/model/FileUploadReceipt;",
            ">;>;"
        }
    .end annotation
.end field

.field public final n:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public final o:Lkotlin/Lazy;

.field public final p:Lkotlin/Lazy;

.field public final q:Lkotlin/Lazy;

.field public final r:Lkotlin/Lazy;

.field public final s:Lkotlin/Lazy;

.field public final t:Lkotlin/Lazy;

.field public final u:Lkotlin/Lazy;

.field public final v:Lkotlin/Lazy;

.field public final w:Lkotlin/Lazy;

.field public final x:Lkotlin/Lazy;

.field public final y:Lkotlin/Lazy;

.field public final z:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    new-instance v0, Lyq0;

    invoke-direct {v0}, Lyq0;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->k:Lyq0;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<Pair<ComplaintRes\u2026ld, FileUploadReceipt>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->m:Lio/reactivex/subjects/d;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<List<String>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->n:Lio/reactivex/subjects/d;

    new-instance v0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$c;

    invoke-direct {v0, p0}, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$c;-><init>(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->o:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$k;

    invoke-direct {v0, p0}, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$k;-><init>(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->p:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$d;

    invoke-direct {v0, p0}, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$d;-><init>(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->q:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$b;

    invoke-direct {v0, p0}, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$b;-><init>(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->r:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$g;

    invoke-direct {v0, p0}, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$g;-><init>(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->s:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$f;

    invoke-direct {v0, p0}, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$f;-><init>(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->t:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$j;

    invoke-direct {v0, p0}, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$j;-><init>(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->u:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$a;

    invoke-direct {v0, p0}, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$a;-><init>(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->v:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$e;

    invoke-direct {v0, p0}, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$e;-><init>(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->w:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$m;

    invoke-direct {v0, p0}, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$m;-><init>(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->x:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$l;

    invoke-direct {v0, p0}, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$l;-><init>(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->y:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$n;

    invoke-direct {v0, p0}, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$n;-><init>(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->z:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic P(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->X(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->U(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final U(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final X(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$getAdapter$p(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)Lyq0;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->k:Lyq0;

    return-object p0
.end method

.method public static final synthetic access$getBinding$p(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)Lo3;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->l:Lo3;

    return-object p0
.end method

.method public static final synthetic access$getPhotoUploadSubject$p(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->m:Lio/reactivex/subjects/d;

    return-object p0
.end method

.method public static final synthetic access$getVehiclesInvolvedScansSubject$p(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->n:Lio/reactivex/subjects/d;

    return-object p0
.end method


# virtual methods
.method public final R()Lzr0;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->j:Lzr0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public S(Les0;)V
    .locals 7

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LGe6;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->k:Lyq0;

    check-cast p1, LGe6;

    invoke-virtual {p1}, LGe6;->b()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LMy;->u(Ljava/util/Collection;)V

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, LtA5;

    const-string v1, "binding.done"

    const-string v2, "binding.submit"

    const/4 v3, 0x2

    const/4 v4, 0x0

    const-string v5, "binding"

    const/4 v6, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->l:Lo3;

    if-nez v0, :cond_1

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v6

    :cond_1
    iget-object v0, v0, Lo3;->f:Landroid/widget/Button;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LtA5;

    invoke-virtual {p1}, LtA5;->b()Z

    move-result v2

    invoke-static {v0, v2, v4, v3, v6}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->l:Lo3;

    if-nez v0, :cond_2

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v6

    :cond_2
    iget-object v0, v0, Lo3;->c:Landroid/widget/Button;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LtA5;->b()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {v0, p1, v4, v3, v6}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_3
    instance-of v0, p1, LeA5;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->l:Lo3;

    if-nez v0, :cond_4

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v6

    :cond_4
    iget-object v0, v0, Lo3;->c:Landroid/widget/Button;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LeA5;

    invoke-virtual {p1}, LeA5;->b()Z

    move-result v1

    invoke-static {v0, v1, v4, v3, v6}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->l:Lo3;

    if-nez v0, :cond_5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v6

    :cond_5
    iget-object v0, v0, Lo3;->f:Landroid/widget/Button;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LeA5;->b()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {v0, p1, v4, v3, v6}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_6
    instance-of v0, p1, Lab1;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->l:Lo3;

    if-nez v0, :cond_7

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_7
    move-object v6, v0

    :goto_0
    iget-object v0, v6, Lo3;->f:Landroid/widget/Button;

    check-cast p1, Lab1;

    invoke-virtual {p1}, Lab1;->b()Z

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_1

    :cond_8
    instance-of v0, p1, LmA5;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->l:Lo3;

    if-nez v0, :cond_9

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v6

    :cond_9
    iget-object v0, v0, Lo3;->d:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    const-string v1, "binding.progressBar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LmA5;

    invoke-virtual {p1}, LmA5;->b()Z

    move-result p1

    invoke-static {v0, p1, v4, v3, v6}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    goto :goto_1

    :cond_a
    instance-of v0, p1, LvA5;

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v1

    sget-object v2, Lfs0;->d:Lfs0;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/SingleSubscribeProxy;

    new-instance v0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$h;

    invoke-direct {v0, p0}, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$h;-><init>(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)V

    new-instance v1, Luq0;

    invoke-direct {v1, v0}, Luq0;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$i;->g:Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$i;

    new-instance v2, Lvq0;

    invoke-direct {v2, v0}, Lvq0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1, v2}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    goto :goto_1

    :cond_b
    instance-of p1, p1, LjB1;

    if-eqz p1, :cond_c

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object p1

    invoke-virtual {p1}, LXC;->errorGeneric()V

    :cond_c
    :goto_1
    return-void
.end method

.method public X2()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->w:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public final Y(I)Lco/bird/android/model/constant/ComplaintResolutionField;
    .locals 1

    const/16 v0, 0x275b

    if-eq p1, v0, :cond_1

    const/16 v0, 0x275c

    if-ne p1, v0, :cond_0

    sget-object p1, Lco/bird/android/model/constant/ComplaintResolutionField;->AFTER_PHOTO:Lco/bird/android/model/constant/ComplaintResolutionField;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lco/bird/android/model/constant/ComplaintResolutionField;->BEFORE_PHOTO:Lco/bird/android/model/constant/ComplaintResolutionField;

    :goto_0
    return-object p1
.end method

.method public Y8()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/constant/ComplaintResolutionField;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->r:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public Z7()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->z:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-vehiclesInvolvedScans>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public b9()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->x:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public h9()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->p:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public j4()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->y:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public m9()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->q:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    invoke-super {p0, p1, p2, p3}, Lco/bird/android/core/base/BaseCoreActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    if-ne p2, v0, :cond_0

    if-eqz p3, :cond_0

    const-string p1, "bird_ids"

    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->n:Lio/reactivex/subjects/d;

    invoke-virtual {p2, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    if-ne p2, v0, :cond_0

    if-eqz p3, :cond_0

    iget-object p2, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->m:Lio/reactivex/subjects/d;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->Y(I)Lco/bird/android/model/constant/ComplaintResolutionField;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/FileUploadReceipt;

    const-string v1, "asset_id"

    invoke-virtual {p3, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v2, "photo_url"

    invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v0, v1, p3}, Lco/bird/android/model/FileUploadReceipt;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x275b
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "complaint_id"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lco/bird/android/feature/complaintresolution/b;->a()Lco/bird/android/feature/complaintresolution/a$a;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->H()LlG2;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lco/bird/android/feature/complaintresolution/a$a;->a(LlG2;Ljava/util/List;)Lco/bird/android/feature/complaintresolution/a;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/complaintresolution/a;->a(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Lo3;->c(Landroid/view/LayoutInflater;)Lo3;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->l:Lo3;

    const/4 v0, 0x0

    const-string v1, "binding"

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    invoke-virtual {p1}, Lo3;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    iget-object p1, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->l:Lo3;

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_2
    iget-object p1, p1, Lo3;->e:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->k:Lyq0;

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    iget-object p1, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->l:Lo3;

    if-nez p1, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_3
    iget-object p1, p1, Lo3;->e:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager;

    iget-object v3, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->k:Lyq0;

    invoke-direct {v2, p0, v3}, Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager;-><init>(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView$h;)V

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    iget-object p1, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->l:Lo3;

    if-nez p1, :cond_4

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v0, p1

    :goto_0
    iget-object p1, v0, Lo3;->e:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/g;

    invoke-direct {v0}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    invoke-virtual {p0}, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->R()Lzr0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lzr0;->V(LXr0;)V

    return-void
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Les0;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->S(Les0;)V

    return-void
.end method

.method public u8()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lga2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->o:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public v4()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->v:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public x3()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/constant/ComplaintResolutionField;",
            "Lco/bird/android/model/FileUploadReceipt;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->t:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-photoAdded>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public y0()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->u:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public z6()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/constant/ComplaintResolutionField;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->s:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method
