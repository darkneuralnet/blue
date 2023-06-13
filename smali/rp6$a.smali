.class public Lrp6$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCA1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrp6;->i(Landroidx/camera/core/o;Lr46;LFP2;Lyp6;)Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LCA1<",
        "Llb1;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lrp6;


# direct methods
.method public constructor <init>(Lrp6;)V
    .locals 0

    iput-object p1, p0, Lrp6$a;->a:Lrp6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Llb1;)V
    .locals 0

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "VideoEncoderSession"

    const-string v1, "VideoEncoder configuration failed."

    invoke-static {v0, v1, p1}, LJx2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lrp6$a;->a:Lrp6;

    invoke-virtual {p1}, Lrp6;->x()V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Llb1;

    invoke-virtual {p0, p1}, Lrp6$a;->a(Llb1;)V

    return-void
.end method
