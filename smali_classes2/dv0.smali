.class public final Ldv0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lpv0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lwi2;",
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
.method public constructor <init>(LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lpv0;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Lwi2;",
            ">;",
            "LY94<",
            "LOh;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldv0;->a:LY94;

    iput-object p2, p0, Ldv0;->b:LY94;

    iput-object p3, p0, Ldv0;->c:LY94;

    iput-object p4, p0, Ldv0;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)Ldv0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lpv0;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Lwi2;",
            ">;",
            "LY94<",
            "LOh;",
            ">;)",
            "Ldv0;"
        }
    .end annotation

    new-instance v0, Ldv0;

    invoke-direct {v0, p0, p1, p2, p3}, Ldv0;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lpv0;LTq4;Lwi2;LOh;Lcom/uber/autodispose/ScopeProvider;Lev0;)Lav0;
    .locals 8

    new-instance v7, Lav0;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lav0;-><init>(Lpv0;LTq4;Lwi2;LOh;Lcom/uber/autodispose/ScopeProvider;Lev0;)V

    return-object v7
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/ScopeProvider;Lev0;)Lav0;
    .locals 7

    iget-object v0, p0, Ldv0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lpv0;

    iget-object v0, p0, Ldv0;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LTq4;

    iget-object v0, p0, Ldv0;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lwi2;

    iget-object v0, p0, Ldv0;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LOh;

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v1 .. v6}, Ldv0;->c(Lpv0;LTq4;Lwi2;LOh;Lcom/uber/autodispose/ScopeProvider;Lev0;)Lav0;

    move-result-object p1

    return-object p1
.end method
