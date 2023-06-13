.class public final LHp3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LGp3;",
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

    iput-object p1, p0, LHp3;->a:LY94;

    iput-object p2, p0, LHp3;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LHp3;
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
            "LHp3;"
        }
    .end annotation

    new-instance v0, LHp3;

    invoke-direct {v0, p0, p1}, LHp3;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Landroidx/fragment/app/FragmentManager;I)LGp3;
    .locals 1

    new-instance v0, LGp3;

    invoke-direct {v0, p0, p1}, LGp3;-><init>(Landroidx/fragment/app/FragmentManager;I)V

    return-object v0
.end method


# virtual methods
.method public b()LGp3;
    .locals 2

    iget-object v0, p0, LHp3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    iget-object v1, p0, LHp3;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, LHp3;->c(Landroidx/fragment/app/FragmentManager;I)LGp3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LHp3;->b()LGp3;

    move-result-object v0

    return-object v0
.end method
