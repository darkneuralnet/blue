.class public final Lin0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Len0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhn0;

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
            "LGt5;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LOh;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhn0;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn0;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LGt5;",
            ">;",
            "LY94<",
            "LOh;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lin0;->a:Lhn0;

    iput-object p2, p0, Lin0;->b:LY94;

    iput-object p3, p0, Lin0;->c:LY94;

    iput-object p4, p0, Lin0;->d:LY94;

    return-void
.end method

.method public static a(Lhn0;LEa;LGt5;LOh;)Len0;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lhn0;->a(LEa;LGt5;LOh;)Len0;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Len0;

    return-object p0
.end method

.method public static b(Lhn0;LY94;LY94;LY94;)Lin0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn0;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LGt5;",
            ">;",
            "LY94<",
            "LOh;",
            ">;)",
            "Lin0;"
        }
    .end annotation

    new-instance v0, Lin0;

    invoke-direct {v0, p0, p1, p2, p3}, Lin0;-><init>(Lhn0;LY94;LY94;LY94;)V

    return-object v0
.end method


# virtual methods
.method public c()Len0;
    .locals 4

    iget-object v0, p0, Lin0;->a:Lhn0;

    iget-object v1, p0, Lin0;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LEa;

    iget-object v2, p0, Lin0;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LGt5;

    iget-object v3, p0, Lin0;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LOh;

    invoke-static {v0, v1, v2, v3}, Lin0;->a(Lhn0;LEa;LGt5;LOh;)Len0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lin0;->c()Len0;

    move-result-object v0

    return-object v0
.end method
