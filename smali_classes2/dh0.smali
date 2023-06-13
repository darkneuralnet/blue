.class public final Ldh0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LFO2;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEg1;",
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
            "LFO2;",
            ">;",
            "LY94<",
            "LEg1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldh0;->a:LY94;

    iput-object p2, p0, Ldh0;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)Ldh0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LFO2;",
            ">;",
            "LY94<",
            "LEg1;",
            ">;)",
            "Ldh0;"
        }
    .end annotation

    new-instance v0, Ldh0;

    invoke-direct {v0, p0, p1}, Ldh0;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LFO2;LEg1;Leh0;Le13;)Lah0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LFO2;",
            "LEg1;",
            "Leh0;",
            "Le13;",
            ")",
            "Lah0;"
        }
    .end annotation

    new-instance v6, Lah0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lah0;-><init>(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LFO2;LEg1;Leh0;Le13;)V

    return-object v6
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Leh0;Le13;)Lah0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Leh0;",
            "Le13;",
            ")",
            "Lah0;"
        }
    .end annotation

    iget-object v0, p0, Ldh0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFO2;

    iget-object v1, p0, Ldh0;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LEg1;

    invoke-static {p1, v0, v1, p2, p3}, Ldh0;->c(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LFO2;LEg1;Leh0;Le13;)Lah0;

    move-result-object p1

    return-object p1
.end method
