.class public final Ly94;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LaM;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LaM;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly94;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Ly94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LaM;",
            ">;)",
            "Ly94;"
        }
    .end annotation

    new-instance v0, Ly94;

    invoke-direct {v0, p0}, Ly94;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LaM;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lz94;Le13;)Lu94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LaM;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Lz94;",
            "Le13;",
            ")",
            "Lu94;"
        }
    .end annotation

    new-instance v0, Lu94;

    invoke-direct {v0, p0, p1, p2, p3}, Lu94;-><init>(LaM;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lz94;Le13;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lz94;Le13;)Lu94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Lz94;",
            "Le13;",
            ")",
            "Lu94;"
        }
    .end annotation

    iget-object v0, p0, Ly94;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LaM;

    invoke-static {v0, p1, p2, p3}, Ly94;->c(LaM;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lz94;Le13;)Lu94;

    move-result-object p1

    return-object p1
.end method
