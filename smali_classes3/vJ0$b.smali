.class public final LvJ0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBr1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LvJ0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Landroidx/fragment/app/FragmentManager;

.field public final c:Landroidx/lifecycle/f;

.field public final d:LvJ0$b;


# direct methods
.method public constructor <init>(LlG2;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LvJ0$b;->d:LvJ0$b;

    iput-object p1, p0, LvJ0$b;->a:LlG2;

    iput-object p2, p0, LvJ0$b;->b:Landroidx/fragment/app/FragmentManager;

    iput-object p3, p0, LvJ0$b;->c:Landroidx/lifecycle/f;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;LwJ0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LvJ0$b;-><init>(LlG2;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;)V

    return-void
.end method


# virtual methods
.method public a(Lzr1;)V
    .locals 0

    invoke-virtual {p0, p1}, LvJ0$b;->d(Lzr1;)Lzr1;

    return-void
.end method

.method public final b()LAr1;
    .locals 3

    new-instance v0, LAr1;

    iget-object v1, p0, LvJ0$b;->b:Landroidx/fragment/app/FragmentManager;

    iget-object v2, p0, LvJ0$b;->c:Landroidx/lifecycle/f;

    invoke-direct {v0, v1, v2}, LAr1;-><init>(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;)V

    return-object v0
.end method

.method public final c()LGr1;
    .locals 2

    new-instance v0, LGr1;

    iget-object v1, p0, LvJ0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->J1()Lsp1;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsp1;

    invoke-direct {v0, v1}, LGr1;-><init>(Lsp1;)V

    return-object v0
.end method

.method public final d(Lzr1;)Lzr1;
    .locals 1

    invoke-virtual {p0}, LvJ0$b;->c()LGr1;

    move-result-object v0

    invoke-static {p1, v0}, LCr1;->c(Lzr1;LGr1;)V

    invoke-virtual {p0}, LvJ0$b;->b()LAr1;

    move-result-object v0

    invoke-static {p1, v0}, LCr1;->a(Lzr1;LAr1;)V

    return-object p1
.end method
