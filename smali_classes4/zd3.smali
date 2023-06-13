.class public final Lzd3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/e$a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017R\'\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R \u0010\u0015\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "Lzd3;",
        "Landroidx/camera/core/e$a;",
        "Landroidx/camera/core/i;",
        "imageProxy",
        "",
        "d",
        "LZ84;",
        "Lco/bird/android/buava/Optional;",
        "Lp06;",
        "a",
        "Lkotlin/Lazy;",
        "m",
        "()LZ84;",
        "results",
        "Lv26;",
        "b",
        "Lv26;",
        "recognizer",
        "La94;",
        "c",
        "La94;",
        "mutableScanResults",
        "<init>",
        "()V",
        "widget_release"
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
        "SMAP\nOCRAnalyzer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OCRAnalyzer.kt\nco/bird/android/widget/scan/analyzer/OCRAnalyzer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Lv26;

.field public final c:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/buava/Optional<",
            "Lp06;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lzd3$b;

    invoke-direct {v0, p0}, Lzd3$b;-><init>(Lzd3;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lzd3;->a:Lkotlin/Lazy;

    new-instance v0, Lw26$a;

    invoke-direct {v0}, Lw26$a;-><init>()V

    invoke-virtual {v0}, Lw26$a;->a()Lw26;

    move-result-object v0

    invoke-static {v0}, Lu26;->a(Lx26;)Lv26;

    move-result-object v0

    const-string v1, "getClient(TextRecognizerOptions.Builder().build())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lzd3;->b:Lv26;

    sget-object v0, La94;->h:La94$a;

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object v0

    iput-object v0, p0, Lzd3;->c:La94;

    return-void
.end method

.method public static final synthetic access$getMutableScanResults$p(Lzd3;)La94;
    .locals 0

    iget-object p0, p0, Lzd3;->c:La94;

    return-object p0
.end method

.method public static synthetic e(Landroidx/camera/core/i;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1}, Lzd3;->k(Landroidx/camera/core/i;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lzd3;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g(Landroidx/camera/core/i;)V
    .locals 0

    invoke-static {p0}, Lzd3;->l(Landroidx/camera/core/i;)V

    return-void
.end method

.method public static synthetic h(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0}, Lzd3;->j(Ljava/lang/Exception;)V

    return-void
.end method

.method public static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final j(Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "exception"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lg46;->e(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final k(Landroidx/camera/core/i;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    const-string v0, "$imageProxy"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Landroidx/camera/core/i;->close()V

    return-void
.end method

.method public static final l(Landroidx/camera/core/i;)V
    .locals 1

    const-string v0, "$imageProxy"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Landroidx/camera/core/i;->close()V

    return-void
.end method


# virtual methods
.method public d(Landroidx/camera/core/i;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnsafeExperimentalUsageError"
        }
    .end annotation

    const-string v0, "imageProxy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/camera/core/i;->k3()Landroid/media/Image;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {p1}, Landroidx/camera/core/i;->i1()LwX1;

    move-result-object v2

    invoke-interface {v2}, LwX1;->c()I

    move-result v2

    invoke-static {v0, v2}, Lg32;->c(Landroid/media/Image;I)Lg32;

    move-result-object v0

    const-string v2, "computed image from image proxy"

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "try {\n          InputIma\u2026         return\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lzd3;->b:Lv26;

    invoke-interface {v1, v0}, Lv26;->h(Lg32;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lzd3$a;

    invoke-direct {v1, p0}, Lzd3$a;-><init>(Lzd3;)V

    new-instance v2, Lvd3;

    invoke-direct {v2, v1}, Lvd3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lwd3;

    invoke-direct {v1}, Lwd3;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lxd3;

    invoke-direct {v1, p1}, Lxd3;-><init>(Landroidx/camera/core/i;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lyd3;

    invoke-direct {v1, p1}, Lyd3;-><init>(Landroidx/camera/core/i;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCanceledListener(Lcom/google/android/gms/tasks/OnCanceledListener;)Lcom/google/android/gms/tasks/Task;

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "error in ocr analyzer while decoding media image"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Lg46;->f(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {p1}, Landroidx/camera/core/i;->close()V

    :cond_0
    :goto_0
    return-void
.end method

.method public final m()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Lp06;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lzd3;->a:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method
