.class public LOb1$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCA1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOb1$f;->u(Lib1;Lsb1;Ljava/util/concurrent/Executor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LCA1<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lib1;

.field public final synthetic b:LOb1$f;


# direct methods
.method public constructor <init>(LOb1$f;Lib1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LOb1$f$a;->b:LOb1$f;

    iput-object p2, p0, LOb1$f$a;->a:Lib1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, LOb1$f$a;->b:LOb1$f;

    iget-object p1, p1, LOb1$f;->j:LOb1;

    iget-object p1, p1, LOb1;->n:Ljava/util/Set;

    iget-object v0, p0, LOb1$f$a;->a:Lib1;

    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, LOb1$f$a;->b:LOb1$f;

    iget-object v0, v0, LOb1$f;->j:LOb1;

    iget-object v0, v0, LOb1;->n:Ljava/util/Set;

    iget-object v1, p0, LOb1$f$a;->a:Lib1;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    instance-of v0, p1, Landroid/media/MediaCodec$CodecException;

    if-eqz v0, :cond_0

    iget-object v0, p0, LOb1$f$a;->b:LOb1$f;

    iget-object v0, v0, LOb1$f;->j:LOb1;

    check-cast p1, Landroid/media/MediaCodec$CodecException;

    invoke-virtual {v0, p1}, LOb1;->C(Landroid/media/MediaCodec$CodecException;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LOb1$f$a;->b:LOb1$f;

    iget-object v0, v0, LOb1$f;->j:LOb1;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1, p1}, LOb1;->B(ILjava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, LOb1$f$a;->a(Ljava/lang/Void;)V

    return-void
.end method
