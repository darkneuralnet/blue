.class public final Llp1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lkp1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;",
            "LY94<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llp1;->a:LY94;

    iput-object p2, p0, Llp1;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)Llp1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;",
            "LY94<",
            "Ljava/lang/Integer;",
            ">;)",
            "Llp1;"
        }
    .end annotation

    new-instance v0, Llp1;

    invoke-direct {v0, p0, p1}, Llp1;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Landroidx/fragment/app/FragmentManager;I)Lkp1;
    .locals 1

    new-instance v0, Lkp1;

    invoke-direct {v0, p0, p1}, Lkp1;-><init>(Landroidx/fragment/app/FragmentManager;I)V

    return-object v0
.end method


# virtual methods
.method public b()Lkp1;
    .locals 2

    iget-object v0, p0, Llp1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    iget-object v1, p0, Llp1;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Llp1;->c(Landroidx/fragment/app/FragmentManager;I)Lkp1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Llp1;->b()Lkp1;

    move-result-object v0

    return-object v0
.end method
