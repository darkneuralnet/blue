.class public LYV5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCA1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYV5;->d(LMV5;Ljava/util/Map$Entry;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LCA1<",
        "LPV5;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:LYV5;


# direct methods
.method public constructor <init>(LYV5;)V
    .locals 0

    iput-object p1, p0, LYV5$a;->a:LYV5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LPV5;)V
    .locals 2

    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, LYV5$a;->a:LYV5;

    iget-object v0, v0, LYV5;->a:LUV5;

    invoke-interface {v0, p1}, LTV5;->a(LPV5;)V
    :try_end_0
    .catch Landroidx/camera/core/ProcessingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "SurfaceProcessorNode"

    const-string v1, "Failed to send SurfaceOutput to SurfaceProcessor."

    invoke-static {v0, v1, p1}, LJx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "SurfaceProcessorNode"

    const-string v1, "Downstream node failed to provide Surface."

    invoke-static {v0, v1, p1}, LJx2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LPV5;

    invoke-virtual {p0, p1}, LYV5$a;->a(LPV5;)V

    return-void
.end method
