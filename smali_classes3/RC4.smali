.class public final LRC4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LQC4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LSC4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LzC4;",
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
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LSC4;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LzC4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRC4;->a:LY94;

    iput-object p2, p0, LRC4;->b:LY94;

    iput-object p3, p0, LRC4;->c:LY94;

    iput-object p4, p0, LRC4;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LRC4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LSC4;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LzC4;",
            ">;)",
            "LRC4;"
        }
    .end annotation

    new-instance v0, LRC4;

    invoke-direct {v0, p0, p1, p2, p3}, LRC4;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lcom/uber/autodispose/ScopeProvider;LSC4;Le13;LzC4;)LQC4;
    .locals 1

    new-instance v0, LQC4;

    invoke-direct {v0, p0, p1, p2, p3}, LQC4;-><init>(Lcom/uber/autodispose/ScopeProvider;LSC4;Le13;LzC4;)V

    return-object v0
.end method


# virtual methods
.method public b()LQC4;
    .locals 4

    iget-object v0, p0, LRC4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/uber/autodispose/ScopeProvider;

    iget-object v1, p0, LRC4;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LSC4;

    iget-object v2, p0, LRC4;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le13;

    iget-object v3, p0, LRC4;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LzC4;

    invoke-static {v0, v1, v2, v3}, LRC4;->c(Lcom/uber/autodispose/ScopeProvider;LSC4;Le13;LzC4;)LQC4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LRC4;->b()LQC4;

    move-result-object v0

    return-object v0
.end method
