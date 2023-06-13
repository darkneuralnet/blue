.class public LUo6$b;
.super Lpa0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUo6;->I0(Landroidx/camera/core/impl/q$b;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic b:LO80$a;

.field public final synthetic c:Landroidx/camera/core/impl/q$b;

.field public final synthetic d:LUo6;


# direct methods
.method public constructor <init>(LUo6;Ljava/util/concurrent/atomic/AtomicBoolean;LO80$a;Landroidx/camera/core/impl/q$b;)V
    .locals 0

    iput-object p1, p0, LUo6$b;->d:LUo6;

    iput-object p2, p0, LUo6$b;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, LUo6$b;->b:LO80$a;

    iput-object p4, p0, LUo6$b;->c:Landroidx/camera/core/impl/q$b;

    invoke-direct {p0}, Lpa0;-><init>()V

    return-void
.end method

.method public static synthetic d(LUo6$b;Landroidx/camera/core/impl/q$b;)V
    .locals 0

    invoke-direct {p0, p1}, LUo6$b;->e(Landroidx/camera/core/impl/q$b;)V

    return-void
.end method

.method private synthetic e(Landroidx/camera/core/impl/q$b;)V
    .locals 0

    invoke-virtual {p1, p0}, Landroidx/camera/core/impl/q$b;->q(Lpa0;)Z

    return-void
.end method


# virtual methods
.method public b(Lxa0;)V
    .locals 2

    invoke-super {p0, p1}, Lpa0;->b(Lxa0;)V

    iget-object v0, p0, LUo6$b;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lxa0;->b()LxY5;

    move-result-object p1

    const-string v0, "androidx.camera.video.VideoCapture.streamUpdate"

    invoke-virtual {p1, v0}, LxY5;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, LUo6$b;->b:LO80$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LUo6$b;->b:LO80$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LO80$a;->c(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LUo6$b;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    iget-object v0, p0, LUo6$b;->c:Landroidx/camera/core/impl/q$b;

    new-instance v1, LVo6;

    invoke-direct {v1, p0, v0}, LVo6;-><init>(LUo6$b;Landroidx/camera/core/impl/q$b;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
