.class public Lka0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LcJ4;


# instance fields
.field public final a:Lrf0;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzv5;",
            ">;"
        }
    .end annotation
.end field

.field public volatile c:Z

.field public volatile d:Landroidx/camera/core/impl/q;


# direct methods
.method public constructor <init>(Lrf0;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrf0;",
            "Ljava/util/List<",
            "Lzv5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lka0;->c:Z

    iget-object v1, p1, Lrf0;->l:Lrf0$e;

    sget-object v2, Lrf0$e;->f:Lrf0$e;

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CaptureSession state must be OPENED. Current state:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p1, Lrf0;->l:Lrf0$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LHZ3;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Lka0;->a:Lrf0;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lka0;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lka0;->c:Z

    return-void
.end method

.method public b(Landroidx/camera/core/impl/q;)V
    .locals 0

    iput-object p1, p0, Lka0;->d:Landroidx/camera/core/impl/q;

    return-void
.end method
