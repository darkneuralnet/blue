.class public final Lds0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcs0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LXp0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LOq0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LMq0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LXp0;",
            ">;",
            "LY94<",
            "LOq0;",
            ">;",
            "LY94<",
            "LMq0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lds0;->a:LY94;

    iput-object p2, p0, Lds0;->b:LY94;

    iput-object p3, p0, Lds0;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)Lds0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LXp0;",
            ">;",
            "LY94<",
            "LOq0;",
            ">;",
            "LY94<",
            "LMq0;",
            ">;)",
            "Lds0;"
        }
    .end annotation

    new-instance v0, Lds0;

    invoke-direct {v0, p0, p1, p2}, Lds0;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LXp0;LOq0;LMq0;)Lcs0;
    .locals 1

    new-instance v0, Lcs0;

    invoke-direct {v0, p0, p1, p2}, Lcs0;-><init>(LXp0;LOq0;LMq0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcs0;
    .locals 3

    iget-object v0, p0, Lds0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXp0;

    iget-object v1, p0, Lds0;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LOq0;

    iget-object v2, p0, Lds0;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LMq0;

    invoke-static {v0, v1, v2}, Lds0;->c(LXp0;LOq0;LMq0;)Lcs0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lds0;->b()Lcs0;

    move-result-object v0

    return-object v0
.end method
