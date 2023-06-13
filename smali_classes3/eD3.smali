.class public final LeD3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LdD3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LWX2;",
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
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LfD3;",
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
            "LWX2;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LfD3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LeD3;->a:LY94;

    iput-object p2, p0, LeD3;->b:LY94;

    iput-object p3, p0, LeD3;->c:LY94;

    iput-object p4, p0, LeD3;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LeD3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LWX2;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LfD3;",
            ">;)",
            "LeD3;"
        }
    .end annotation

    new-instance v0, LeD3;

    invoke-direct {v0, p0, p1, p2, p3}, LeD3;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LWX2;Le13;Lcom/uber/autodispose/ScopeProvider;LfD3;)LdD3;
    .locals 1

    new-instance v0, LdD3;

    invoke-direct {v0, p0, p1, p2, p3}, LdD3;-><init>(LWX2;Le13;Lcom/uber/autodispose/ScopeProvider;LfD3;)V

    return-object v0
.end method


# virtual methods
.method public b()LdD3;
    .locals 4

    iget-object v0, p0, LeD3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LWX2;

    iget-object v1, p0, LeD3;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le13;

    iget-object v2, p0, LeD3;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/uber/autodispose/ScopeProvider;

    iget-object v3, p0, LeD3;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LfD3;

    invoke-static {v0, v1, v2, v3}, LeD3;->c(LWX2;Le13;Lcom/uber/autodispose/ScopeProvider;LfD3;)LdD3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LeD3;->b()LdD3;

    move-result-object v0

    return-object v0
.end method
