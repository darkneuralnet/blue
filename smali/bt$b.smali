.class public Lbt$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic b:Lbt;


# direct methods
.method public constructor <init>(Lbt;)V
    .locals 0

    iput-object p1, p0, Lbt$b;->b:Lbt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lbt$b;->b:Lbt;

    iget-boolean v1, v0, Lbt;->p:Z

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-boolean v1, v0, Lbt;->n:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iput-boolean v2, v0, Lbt;->n:Z

    iget-object v0, v0, Lbt;->b:Lbt$a;

    invoke-virtual {v0}, Lbt$a;->m()V

    :cond_1
    iget-object v0, p0, Lbt$b;->b:Lbt;

    iget-object v0, v0, Lbt;->b:Lbt$a;

    invoke-virtual {v0}, Lbt$a;->h()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lbt$b;->b:Lbt;

    invoke-virtual {v1}, Lbt;->u()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lbt$b;->b:Lbt;

    iget-boolean v3, v1, Lbt;->o:Z

    if-eqz v3, :cond_3

    iput-boolean v2, v1, Lbt;->o:Z

    invoke-virtual {v1}, Lbt;->c()V

    :cond_3
    invoke-virtual {v0}, Lbt$a;->a()V

    invoke-virtual {v0}, Lbt$a;->b()I

    move-result v1

    invoke-virtual {v0}, Lbt$a;->c()I

    move-result v0

    iget-object v2, p0, Lbt$b;->b:Lbt;

    invoke-virtual {v2, v1, v0}, Lbt;->j(II)V

    iget-object v0, p0, Lbt$b;->b:Lbt;

    iget-object v0, v0, Lbt;->d:Landroid/view/View;

    invoke-static {v0, p0}, Lbq6;->n0(Landroid/view/View;Ljava/lang/Runnable;)V

    return-void

    :cond_4
    :goto_0
    iget-object v0, p0, Lbt$b;->b:Lbt;

    iput-boolean v2, v0, Lbt;->p:Z

    return-void
.end method
