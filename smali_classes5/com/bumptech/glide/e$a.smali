.class public Lcom/bumptech/glide/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMC1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bumptech/glide/e;->d(Lcom/bumptech/glide/a;Ljava/util/List;Lbj;)LMC1$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LMC1$b<",
        "Lcom/bumptech/glide/Registry;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Z

.field public final synthetic b:Lcom/bumptech/glide/a;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lbj;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/a;Ljava/util/List;Lbj;)V
    .locals 0

    iput-object p1, p0, Lcom/bumptech/glide/e$a;->b:Lcom/bumptech/glide/a;

    iput-object p2, p0, Lcom/bumptech/glide/e$a;->c:Ljava/util/List;

    iput-object p3, p0, Lcom/bumptech/glide/e$a;->d:Lbj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/bumptech/glide/Registry;
    .locals 3

    iget-boolean v0, p0, Lcom/bumptech/glide/e$a;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/e$a;->a:Z

    const-string v0, "Glide registry"

    invoke-static {v0}, La66;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/e$a;->b:Lcom/bumptech/glide/a;

    iget-object v1, p0, Lcom/bumptech/glide/e$a;->c:Ljava/util/List;

    iget-object v2, p0, Lcom/bumptech/glide/e$a;->d:Lbj;

    invoke-static {v0, v1, v2}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/a;Ljava/util/List;Lbj;)Lcom/bumptech/glide/Registry;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, La66;->b()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-static {}, La66;->b()V

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you\'re using the provided Registry rather calling glide.getRegistry()!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/bumptech/glide/e$a;->a()Lcom/bumptech/glide/Registry;

    move-result-object v0

    return-object v0
.end method
