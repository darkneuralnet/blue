.class public LOs6$a;
.super LQs6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LOs6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:Z

.field public b:I

.field public final synthetic c:LOs6;


# direct methods
.method public constructor <init>(LOs6;)V
    .locals 0

    iput-object p1, p0, LOs6$a;->c:LOs6;

    invoke-direct {p0}, LQs6;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LOs6$a;->a:Z

    iput p1, p0, LOs6$a;->b:I

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget p1, p0, LOs6$a;->b:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LOs6$a;->b:I

    iget-object v0, p0, LOs6$a;->c:LOs6;

    iget-object v0, v0, LOs6;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne p1, v0, :cond_1

    iget-object p1, p0, LOs6$a;->c:LOs6;

    iget-object p1, p1, LOs6;->d:LPs6;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LPs6;->b(Landroid/view/View;)V

    :cond_0
    invoke-virtual {p0}, LOs6$a;->d()V

    :cond_1
    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    iget-boolean p1, p0, LOs6$a;->a:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, LOs6$a;->a:Z

    iget-object p1, p0, LOs6$a;->c:LOs6;

    iget-object p1, p1, LOs6;->d:LPs6;

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LPs6;->c(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LOs6$a;->b:I

    iput-boolean v0, p0, LOs6$a;->a:Z

    iget-object v0, p0, LOs6$a;->c:LOs6;

    invoke-virtual {v0}, LOs6;->b()V

    return-void
.end method
