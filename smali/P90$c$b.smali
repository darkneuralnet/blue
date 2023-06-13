.class public LP90$c$b;
.super Lpa0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP90$c;->p(Ljava/util/List;I)Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LO80$a;

.field public final synthetic b:LP90$c;


# direct methods
.method public constructor <init>(LP90$c;LO80$a;)V
    .locals 0

    iput-object p1, p0, LP90$c$b;->b:LP90$c;

    iput-object p2, p0, LP90$c$b;->a:LO80$a;

    invoke-direct {p0}, Lpa0;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-object v0, p0, LP90$c$b;->a:LO80$a;

    new-instance v1, Landroidx/camera/core/ImageCaptureException;

    const/4 v2, 0x3

    const/4 v3, 0x0

    const-string v4, "Capture request is cancelled because camera is closed"

    invoke-direct {v1, v2, v4, v3}, Landroidx/camera/core/ImageCaptureException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, LO80$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public b(Lxa0;)V
    .locals 1

    iget-object p1, p0, LP90$c$b;->a:LO80$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LO80$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(Lra0;)V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Capture request failed with reason "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lra0;->a()Lra0$a;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, LP90$c$b;->a:LO80$a;

    new-instance v1, Landroidx/camera/core/ImageCaptureException;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v1, v2, p1, v3}, Landroidx/camera/core/ImageCaptureException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, LO80$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method
