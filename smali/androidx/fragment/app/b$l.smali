.class public Landroidx/fragment/app/b$l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "l"
.end annotation


# instance fields
.field public final a:Landroidx/fragment/app/o$e;

.field public final b:Ldd0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/o$e;Ldd0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/b$l;->a:Landroidx/fragment/app/o$e;

    iput-object p2, p0, Landroidx/fragment/app/b$l;->b:Ldd0;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/b$l;->a:Landroidx/fragment/app/o$e;

    iget-object v1, p0, Landroidx/fragment/app/b$l;->b:Ldd0;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/o$e;->d(Ldd0;)V

    return-void
.end method

.method public b()Landroidx/fragment/app/o$e;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/b$l;->a:Landroidx/fragment/app/o$e;

    return-object v0
.end method

.method public c()Ldd0;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/b$l;->b:Ldd0;

    return-object v0
.end method

.method public d()Z
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/b$l;->a:Landroidx/fragment/app/o$e;

    invoke-virtual {v0}, Landroidx/fragment/app/o$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    invoke-static {v0}, Landroidx/fragment/app/o$e$c;->c(Landroid/view/View;)Landroidx/fragment/app/o$e$c;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/b$l;->a:Landroidx/fragment/app/o$e;

    invoke-virtual {v1}, Landroidx/fragment/app/o$e;->e()Landroidx/fragment/app/o$e$c;

    move-result-object v1

    if-eq v0, v1, :cond_1

    sget-object v2, Landroidx/fragment/app/o$e$c;->c:Landroidx/fragment/app/o$e$c;

    if-eq v0, v2, :cond_0

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
