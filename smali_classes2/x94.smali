.class public final Lx94;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw94;


# instance fields
.field public final a:Ly94;


# direct methods
.method public constructor <init>(Ly94;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx94;->a:Ly94;

    return-void
.end method

.method public static b(Ly94;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly94;",
            ")",
            "LY94<",
            "Lw94;",
            ">;"
        }
    .end annotation

    new-instance v0, Lx94;

    invoke-direct {v0, p0}, Lx94;-><init>(Ly94;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lz94;Le13;)Lu94;
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

    iget-object v0, p0, Lx94;->a:Ly94;

    invoke-virtual {v0, p1, p2, p3}, Ly94;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lz94;Le13;)Lu94;

    move-result-object p1

    return-object p1
.end method
