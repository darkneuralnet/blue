.class public LrV0$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LrV0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Lak2;

.field public b:LeM4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LeM4<",
            "TZ;>;"
        }
    .end annotation
.end field

.field public c:Ljx2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljx2<",
            "TZ;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LrV0$d;->a:Lak2;

    iput-object v0, p0, LrV0$d;->b:LeM4;

    iput-object v0, p0, LrV0$d;->c:Ljx2;

    return-void
.end method

.method public b(LrV0$e;Lsy3;)V
    .locals 4

    const-string v0, "DecodeJob.encode"

    invoke-static {v0}, LNC1;->a(Ljava/lang/String;)V

    :try_start_0
    invoke-interface {p1}, LrV0$e;->a()Lz41;

    move-result-object p1

    iget-object v0, p0, LrV0$d;->a:Lak2;

    new-instance v1, LDS0;

    iget-object v2, p0, LrV0$d;->b:LeM4;

    iget-object v3, p0, LrV0$d;->c:Ljx2;

    invoke-direct {v1, v2, v3, p2}, LDS0;-><init>(Lmb1;Ljava/lang/Object;Lsy3;)V

    invoke-interface {p1, v0, v1}, Lz41;->b(Lak2;Lz41$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LrV0$d;->c:Ljx2;

    invoke-virtual {p1}, Ljx2;->h()V

    invoke-static {}, LNC1;->e()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, LrV0$d;->c:Ljx2;

    invoke-virtual {p2}, Ljx2;->h()V

    invoke-static {}, LNC1;->e()V

    throw p1
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, LrV0$d;->c:Ljx2;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d(Lak2;LeM4;Ljx2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Object;",
            ">(",
            "Lak2;",
            "LeM4<",
            "TX;>;",
            "Ljx2<",
            "TX;>;)V"
        }
    .end annotation

    iput-object p1, p0, LrV0$d;->a:Lak2;

    iput-object p2, p0, LrV0$d;->b:LeM4;

    iput-object p3, p0, LrV0$d;->c:Ljx2;

    return-void
.end method
