.class public final Lta2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lsa2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lva2;",
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


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lva2;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lta2;->a:LY94;

    iput-object p2, p0, Lta2;->b:LY94;

    iput-object p3, p0, Lta2;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)Lta2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lva2;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;)",
            "Lta2;"
        }
    .end annotation

    new-instance v0, Lta2;

    invoke-direct {v0, p0, p1, p2}, Lta2;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lva2;Le13;Lcom/uber/autodispose/ScopeProvider;)Lsa2;
    .locals 1

    new-instance v0, Lsa2;

    invoke-direct {v0, p0, p1, p2}, Lsa2;-><init>(Lva2;Le13;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v0
.end method


# virtual methods
.method public b()Lsa2;
    .locals 3

    iget-object v0, p0, Lta2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lva2;

    iget-object v1, p0, Lta2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le13;

    iget-object v2, p0, Lta2;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v0, v1, v2}, Lta2;->c(Lva2;Le13;Lcom/uber/autodispose/ScopeProvider;)Lsa2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lta2;->b()Lsa2;

    move-result-object v0

    return-object v0
.end method
