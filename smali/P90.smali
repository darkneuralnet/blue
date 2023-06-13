.class public LP90;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP90$c;,
        LP90$b;,
        LP90$d;,
        LP90$f;,
        LP90$a;,
        LP90$e;
    }
.end annotation


# static fields
.field public static final h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lua0;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lva0;",
            ">;"
        }
    .end annotation
.end field

.field public static final j:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lsa0;",
            ">;"
        }
    .end annotation
.end field

.field public static final k:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lsa0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lr90;

.field public final b:LZf6;

.field public final c:Z

.field public final d:LTe4;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Z

.field public g:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    sget-object v0, Lua0;->e:Lua0;

    sget-object v1, Lua0;->f:Lua0;

    sget-object v2, Lua0;->g:Lua0;

    sget-object v3, Lua0;->h:Lua0;

    invoke-static {v0, v1, v2, v3}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LP90;->h:Ljava/util/Set;

    sget-object v0, Lva0;->e:Lva0;

    sget-object v1, Lva0;->b:Lva0;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LP90;->i:Ljava/util/Set;

    sget-object v0, Lsa0;->f:Lsa0;

    sget-object v1, Lsa0;->e:Lsa0;

    sget-object v2, Lsa0;->b:Lsa0;

    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LP90;->j:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LP90;->k:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lr90;LWa0;LTe4;Ljava/util/concurrent/Executor;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, LP90;->g:I

    iput-object p1, p0, LP90;->a:Lr90;

    sget-object p1, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p2, p1}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, LP90;->f:Z

    iput-object p4, p0, LP90;->e:Ljava/util/concurrent/Executor;

    iput-object p3, p0, LP90;->d:LTe4;

    new-instance p1, LZf6;

    invoke-direct {p1, p3}, LZf6;-><init>(LTe4;)V

    iput-object p1, p0, LP90;->b:LZf6;

    new-instance p1, LM90;

    invoke-direct {p1, p2}, LM90;-><init>(LWa0;)V

    invoke-static {p1}, Loo1;->a(LXa0;)Z

    move-result p1

    iput-boolean p1, p0, LP90;->c:Z

    return-void
.end method

.method public static a(Landroid/hardware/camera2/TotalCaptureResult;Z)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    new-instance v1, LV80;

    invoke-direct {v1, p0}, LV80;-><init>(Landroid/hardware/camera2/CaptureResult;)V

    invoke-virtual {v1}, LV80;->h()Lta0;

    move-result-object v2

    sget-object v3, Lta0;->c:Lta0;

    const/4 v4, 0x1

    if-eq v2, v3, :cond_2

    invoke-virtual {v1}, LV80;->h()Lta0;

    move-result-object v2

    sget-object v3, Lta0;->b:Lta0;

    if-eq v2, v3, :cond_2

    sget-object v2, LP90;->h:Ljava/util/Set;

    invoke-virtual {v1}, LV80;->c()Lua0;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move v2, v0

    goto :goto_1

    :cond_2
    :goto_0
    move v2, v4

    :goto_1
    sget-object v3, Landroid/hardware/camera2/CaptureResult;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p0, v3}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-nez v3, :cond_3

    move v3, v4

    goto :goto_2

    :cond_3
    move v3, v0

    :goto_2
    if-eqz p1, :cond_6

    if-nez v3, :cond_5

    sget-object p1, LP90;->k:Ljava/util/Set;

    invoke-virtual {v1}, LV80;->e()Lsa0;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_3

    :cond_4
    move p1, v0

    goto :goto_4

    :cond_5
    :goto_3
    move p1, v4

    goto :goto_4

    :cond_6
    if-nez v3, :cond_5

    sget-object p1, LP90;->j:Ljava/util/Set;

    invoke-virtual {v1}, LV80;->e()Lsa0;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_3

    :goto_4
    sget-object v3, Landroid/hardware/camera2/CaptureResult;->CONTROL_AWB_MODE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p0, v3}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-nez p0, :cond_7

    move p0, v4

    goto :goto_5

    :cond_7
    move p0, v0

    :goto_5
    if-nez p0, :cond_9

    sget-object p0, LP90;->i:Ljava/util/Set;

    invoke-virtual {v1}, LV80;->d()Lva0;

    move-result-object v3

    invoke-interface {p0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_8

    goto :goto_6

    :cond_8
    move p0, v0

    goto :goto_7

    :cond_9
    :goto_6
    move p0, v4

    :goto_7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "checkCaptureResult, AE="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, LV80;->e()Lsa0;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " AF ="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, LV80;->c()Lua0;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " AWB="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, LV80;->d()Lva0;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "Camera2CapturePipeline"

    invoke-static {v3, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v2, :cond_a

    if-eqz p1, :cond_a

    if-eqz p0, :cond_a

    move v0, v4

    :cond_a
    return v0
.end method

.method public static b(ILandroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p0, :cond_2

    if-eq p0, v1, :cond_1

    const/4 p1, 0x2

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(I)V

    throw p1

    :cond_1
    return v1

    :cond_2
    if-eqz p1, :cond_3

    sget-object p0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AE_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p1, p0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_4

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/4 p1, 0x4

    if-ne p0, p1, :cond_4

    move v0, v1

    :cond_4
    return v0
.end method

.method public static f(JLr90;LP90$e$a;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lr90;",
            "LP90$e$a;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            ">;"
        }
    .end annotation

    new-instance v0, LP90$e;

    invoke-direct {v0, p0, p1, p3}, LP90$e;-><init>(JLP90$e$a;)V

    invoke-virtual {p2, v0}, Lr90;->v(Lr90$c;)V

    invoke-virtual {v0}, LP90$e;->c()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(I)Z
    .locals 3

    iget-object v0, p0, LP90;->b:LZf6;

    invoke-virtual {v0}, LZf6;->a()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget v0, p0, LP90;->g:I

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method public d(I)V
    .locals 0

    iput p1, p0, LP90;->g:I

    return-void
.end method

.method public e(Ljava/util/List;III)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d;",
            ">;III)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    new-instance v6, LzA3;

    iget-object v0, p0, LP90;->d:LTe4;

    invoke-direct {v6, v0}, LzA3;-><init>(LTe4;)V

    new-instance v7, LP90$c;

    iget v1, p0, LP90;->g:I

    iget-object v2, p0, LP90;->e:Ljava/util/concurrent/Executor;

    iget-object v3, p0, LP90;->a:Lr90;

    iget-boolean v4, p0, LP90;->f:Z

    move-object v0, v7

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, LP90$c;-><init>(ILjava/util/concurrent/Executor;Lr90;ZLzA3;)V

    if-nez p2, :cond_0

    new-instance p2, LP90$b;

    iget-object v0, p0, LP90;->a:Lr90;

    invoke-direct {p2, v0}, LP90$b;-><init>(Lr90;)V

    invoke-virtual {v7, p2}, LP90$c;->f(LP90$d;)V

    :cond_0
    iget-boolean p2, p0, LP90;->c:Z

    if-eqz p2, :cond_2

    invoke-virtual {p0, p4}, LP90;->c(I)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p2, LP90$f;

    iget-object p4, p0, LP90;->a:Lr90;

    iget-object v0, p0, LP90;->e:Ljava/util/concurrent/Executor;

    invoke-direct {p2, p4, p3, v0}, LP90$f;-><init>(Lr90;ILjava/util/concurrent/Executor;)V

    invoke-virtual {v7, p2}, LP90$c;->f(LP90$d;)V

    goto :goto_0

    :cond_1
    new-instance p2, LP90$a;

    iget-object p4, p0, LP90;->a:Lr90;

    invoke-direct {p2, p4, p3, v6}, LP90$a;-><init>(Lr90;ILzA3;)V

    invoke-virtual {v7, p2}, LP90$c;->f(LP90$d;)V

    :cond_2
    :goto_0
    invoke-virtual {v7, p1, p3}, LP90$c;->i(Ljava/util/List;I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    invoke-static {p1}, LIA1;->j(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
