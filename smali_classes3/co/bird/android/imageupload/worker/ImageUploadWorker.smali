.class public final Lco/bird/android/imageupload/worker/ImageUploadWorker;
.super Landroidx/work/RxWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/imageupload/worker/ImageUploadWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0019"
    }
    d2 = {
        "Lco/bird/android/imageupload/worker/ImageUploadWorker;",
        "Landroidx/work/RxWorker;",
        "Lio/reactivex/F;",
        "Landroidx/work/c$a;",
        "r",
        "",
        "uploadedImageUrl",
        "Landroidx/work/b;",
        "w",
        "Lef6;",
        "h",
        "Lef6;",
        "z",
        "()Lef6;",
        "setUploadManager",
        "(Lef6;)V",
        "uploadManager",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "i",
        "a",
        "image-upload_release"
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
        "SMAP\nImageUploadWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageUploadWorker.kt\nco/bird/android/imageupload/worker/ImageUploadWorker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"
    }
.end annotation


# static fields
.field public static final i:Lco/bird/android/imageupload/worker/ImageUploadWorker$a;


# instance fields
.field public h:Lef6;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/imageupload/worker/ImageUploadWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/imageupload/worker/ImageUploadWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/imageupload/worker/ImageUploadWorker;->i:Lco/bird/android/imageupload/worker/ImageUploadWorker$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/RxWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    sget-object p1, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroidx/work/c;->b()Landroid/content/Context;

    move-result-object p2

    const-string v0, "applicationContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type co.bird.android.imageupload.worker.ImageUploadWorkerComponent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LmY1;

    invoke-interface {p1, p0}, LmY1;->J0(Lco/bird/android/imageupload/worker/ImageUploadWorker;)V

    return-void
.end method

.method public static final synthetic access$createResultData(Lco/bird/android/imageupload/worker/ImageUploadWorker;Ljava/lang/String;)Landroidx/work/b;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/imageupload/worker/ImageUploadWorker;->w(Ljava/lang/String;)Landroidx/work/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Landroidx/work/c$a;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/imageupload/worker/ImageUploadWorker;->y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Landroidx/work/c$a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Landroidx/work/c$a;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/imageupload/worker/ImageUploadWorker;->x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Landroidx/work/c$a;

    move-result-object p0

    return-object p0
.end method

.method public static final x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Landroidx/work/c$a;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/work/c$a;

    return-object p0
.end method

.method public static final y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Landroidx/work/c$a;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/work/c$a;

    return-object p0
.end method


# virtual methods
.method public r()Lio/reactivex/F;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Landroidx/work/c$a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/work/c;->g()Landroidx/work/b;

    move-result-object v0

    const-string v1, "IMAGES_FOLDER"

    invoke-virtual {v0, v1}, Landroidx/work/b;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/work/c;->g()Landroidx/work/b;

    move-result-object v1

    const-string v2, "UPLOAD_TO_FOLDER"

    invoke-virtual {v1, v2}, Landroidx/work/b;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v2, Lco/bird/android/model/Folder;->Companion:Lco/bird/android/model/Folder$Companion;

    invoke-virtual {v2, v1}, Lco/bird/android/model/Folder$Companion;->from(Ljava/lang/String;)Lco/bird/android/model/Folder;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v0, :cond_2

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/imageupload/worker/ImageUploadWorker;->z()Lef6;

    move-result-object v0

    invoke-virtual {v1}, Lco/bird/android/model/Folder;->getContentKind()Lco/bird/android/model/constant/ContentKind;

    move-result-object v3

    invoke-virtual {v1}, Lco/bird/android/model/Folder;->getUploadKind()Lco/bird/android/model/constant/UploadKind;

    move-result-object v4

    invoke-interface {v0, v2, v3, v4, v1}, Lef6;->h(Ljava/io/File;Lco/bird/android/model/constant/ContentKind;Lco/bird/android/model/constant/UploadKind;Lco/bird/android/model/Folder;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/F;->k0()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/imageupload/worker/ImageUploadWorker$b;

    invoke-direct {v1, p0}, Lco/bird/android/imageupload/worker/ImageUploadWorker$b;-><init>(Lco/bird/android/imageupload/worker/ImageUploadWorker;)V

    new-instance v2, LkY1;

    invoke-direct {v2, v1}, LkY1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/imageupload/worker/ImageUploadWorker$c;

    invoke-direct {v1, p0}, Lco/bird/android/imageupload/worker/ImageUploadWorker$c;-><init>(Lco/bird/android/imageupload/worker/ImageUploadWorker;)V

    new-instance v2, LlY1;

    invoke-direct {v2, v1}, LlY1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->onErrorReturn(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->singleOrError()Lio/reactivex/F;

    move-result-object v0

    const-string v1, "override fun createWork(\u2026     .singleOrError()\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_2
    :goto_1
    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "just(Result.failure())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final w(Ljava/lang/String;)Landroidx/work/b;
    .locals 2

    new-instance v0, Landroidx/work/b$a;

    invoke-direct {v0}, Landroidx/work/b$a;-><init>()V

    const-string v1, "UPLOADED_IMAGE_URL"

    invoke-virtual {v0, v1, p1}, Landroidx/work/b$a;->e(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/work/b$a;->a()Landroidx/work/b;

    move-result-object p1

    const-string v0, "Builder()\n      .putStri\u2026dImageUrl)\n      .build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final z()Lef6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/imageupload/worker/ImageUploadWorker;->h:Lef6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "uploadManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
