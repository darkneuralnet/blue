.class public final Lcom/bumptech/glide/load/data/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/data/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/load/data/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/data/a<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lbt4;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Lto;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lbt4;

    invoke-direct {v0, p1, p2}, Lbt4;-><init>(Ljava/io/InputStream;Lto;)V

    iput-object v0, p0, Lcom/bumptech/glide/load/data/c;->a:Lbt4;

    const/high16 p1, 0x500000

    invoke-virtual {v0, p1}, Lbt4;->mark(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bumptech/glide/load/data/c;->c()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/data/c;->a:Lbt4;

    invoke-virtual {v0}, Lbt4;->b()V

    return-void
.end method

.method public c()Ljava/io/InputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/load/data/c;->a:Lbt4;

    invoke-virtual {v0}, Lbt4;->reset()V

    iget-object v0, p0, Lcom/bumptech/glide/load/data/c;->a:Lbt4;

    return-object v0
.end method

.method public cleanup()V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/data/c;->a:Lbt4;

    invoke-virtual {v0}, Lbt4;->release()V

    return-void
.end method
