.class public final Lwh3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
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
            "LEa;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh3;->a:LY94;

    iput-object p2, p0, Lwh3;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)Lwh3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;)",
            "Lwh3;"
        }
    .end annotation

    new-instance v0, Lwh3;

    invoke-direct {v0, p0, p1}, Lwh3;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(LEa;Lgl;Lxh3;LsJ4;Lcom/uber/autodispose/ScopeProvider;Lth3$a;)Lth3;
    .locals 8

    new-instance v7, Lth3;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lth3;-><init>(LEa;Lgl;Lxh3;LsJ4;Lcom/uber/autodispose/ScopeProvider;Lth3$a;)V

    return-object v7
.end method


# virtual methods
.method public b(Lxh3;LsJ4;Lcom/uber/autodispose/ScopeProvider;Lth3$a;)Lth3;
    .locals 7

    iget-object v0, p0, Lwh3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LEa;

    iget-object v0, p0, Lwh3;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lgl;

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-static/range {v1 .. v6}, Lwh3;->c(LEa;Lgl;Lxh3;LsJ4;Lcom/uber/autodispose/ScopeProvider;Lth3$a;)Lth3;

    move-result-object p1

    return-object p1
.end method
