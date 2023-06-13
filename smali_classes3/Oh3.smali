.class public final LOh3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LNh3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LjG2;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LAz6;",
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
            "LjG2;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LAz6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOh3;->a:LY94;

    iput-object p2, p0, LOh3;->b:LY94;

    iput-object p3, p0, LOh3;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LOh3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LjG2;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LAz6;",
            ">;)",
            "LOh3;"
        }
    .end annotation

    new-instance v0, LOh3;

    invoke-direct {v0, p0, p1, p2}, LOh3;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LjG2;Le13;LAz6;)LNh3;
    .locals 1

    new-instance v0, LNh3;

    invoke-direct {v0, p0, p1, p2}, LNh3;-><init>(LjG2;Le13;LAz6;)V

    return-object v0
.end method


# virtual methods
.method public b()LNh3;
    .locals 3

    iget-object v0, p0, LOh3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LjG2;

    iget-object v1, p0, LOh3;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le13;

    iget-object v2, p0, LOh3;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LAz6;

    invoke-static {v0, v1, v2}, LOh3;->c(LjG2;Le13;LAz6;)LNh3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LOh3;->b()LNh3;

    move-result-object v0

    return-object v0
.end method
