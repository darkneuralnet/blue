.class public final LGj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lco/bird/android/persistence/bountyflightsheet/impl/BountyDatabase;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhj;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhj;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGj;->a:Lhj;

    iput-object p2, p0, LGj;->b:LY94;

    return-void
.end method

.method public static a(Lhj;LY94;)LGj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "LGj;"
        }
    .end annotation

    new-instance v0, LGj;

    invoke-direct {v0, p0, p1}, LGj;-><init>(Lhj;LY94;)V

    return-object v0
.end method

.method public static c(Lhj;Landroid/content/Context;)Lco/bird/android/persistence/bountyflightsheet/impl/BountyDatabase;
    .locals 0

    invoke-virtual {p0, p1}, Lhj;->y(Landroid/content/Context;)Lco/bird/android/persistence/bountyflightsheet/impl/BountyDatabase;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/persistence/bountyflightsheet/impl/BountyDatabase;

    return-object p0
.end method


# virtual methods
.method public b()Lco/bird/android/persistence/bountyflightsheet/impl/BountyDatabase;
    .locals 2

    iget-object v0, p0, LGj;->a:Lhj;

    iget-object v1, p0, LGj;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v0, v1}, LGj;->c(Lhj;Landroid/content/Context;)Lco/bird/android/persistence/bountyflightsheet/impl/BountyDatabase;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LGj;->b()Lco/bird/android/persistence/bountyflightsheet/impl/BountyDatabase;

    move-result-object v0

    return-object v0
.end method
