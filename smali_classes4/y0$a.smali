.class public Ly0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0;->runPendingAnimations()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Ly0;


# direct methods
.method public constructor <init>(Ly0;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ly0$a;->c:Ly0;

    iput-object p2, p0, Ly0$a;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Ly0$a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly0$k;

    iget-object v2, p0, Ly0$a;->c:Ly0;

    iget-object v3, v1, Ly0$k;->a:Landroidx/recyclerview/widget/RecyclerView$D;

    iget v4, v1, Ly0$k;->b:I

    iget v5, v1, Ly0$k;->c:I

    iget v6, v1, Ly0$k;->d:I

    iget v7, v1, Ly0$k;->e:I

    invoke-virtual/range {v2 .. v7}, Ly0;->i(Landroidx/recyclerview/widget/RecyclerView$D;IIII)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ly0$a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Ly0$a;->c:Ly0;

    iget-object v0, v0, Ly0;->f:Ljava/util/ArrayList;

    iget-object v1, p0, Ly0$a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
