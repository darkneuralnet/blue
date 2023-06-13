.class public final LyJ2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LHZ5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LGZ5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LVH2;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LGZ5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LyJ2;->a:LVH2;

    iput-object p2, p0, LyJ2;->b:LY94;

    return-void
.end method

.method public static a(LVH2;LY94;)LyJ2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LGZ5;",
            ">;)",
            "LyJ2;"
        }
    .end annotation

    new-instance v0, LyJ2;

    invoke-direct {v0, p0, p1}, LyJ2;-><init>(LVH2;LY94;)V

    return-object v0
.end method

.method public static c(LVH2;LGZ5;)LHZ5;
    .locals 0

    invoke-virtual {p0, p1}, LVH2;->E0(LGZ5;)LHZ5;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LHZ5;

    return-object p0
.end method


# virtual methods
.method public b()LHZ5;
    .locals 2

    iget-object v0, p0, LyJ2;->a:LVH2;

    iget-object v1, p0, LyJ2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LGZ5;

    invoke-static {v0, v1}, LyJ2;->c(LVH2;LGZ5;)LHZ5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LyJ2;->b()LHZ5;

    move-result-object v0

    return-object v0
.end method
