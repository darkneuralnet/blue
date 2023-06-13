.class public final LHy4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LCy4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LGy4;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LaG6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LGy4;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGy4;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LaG6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHy4;->a:LGy4;

    iput-object p2, p0, LHy4;->b:LY94;

    iput-object p3, p0, LHy4;->c:LY94;

    return-void
.end method

.method public static a(LGy4;LY94;LY94;)LHy4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGy4;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LaG6;",
            ">;)",
            "LHy4;"
        }
    .end annotation

    new-instance v0, LHy4;

    invoke-direct {v0, p0, p1, p2}, LHy4;-><init>(LGy4;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LGy4;LEa;LaG6;)LCy4;
    .locals 0

    invoke-virtual {p0, p1, p2}, LGy4;->a(LEa;LaG6;)LCy4;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LCy4;

    return-object p0
.end method


# virtual methods
.method public b()LCy4;
    .locals 3

    iget-object v0, p0, LHy4;->a:LGy4;

    iget-object v1, p0, LHy4;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LEa;

    iget-object v2, p0, LHy4;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LaG6;

    invoke-static {v0, v1, v2}, LHy4;->c(LGy4;LEa;LaG6;)LCy4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LHy4;->b()LCy4;

    move-result-object v0

    return-object v0
.end method
