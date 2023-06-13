.class public final Lz9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly9;


# instance fields
.field public final a:LA9;


# direct methods
.method public constructor <init>(LA9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz9;->a:LA9;

    return-void
.end method

.method public static b(LA9;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LA9;",
            ")",
            "LY94<",
            "Ly9;",
            ">;"
        }
    .end annotation

    new-instance v0, Lz9;

    invoke-direct {v0, p0}, Lz9;-><init>(LA9;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LB9;)Lx9;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LB9;",
            ")",
            "Lx9;"
        }
    .end annotation

    iget-object v0, p0, Lz9;->a:LA9;

    invoke-virtual {v0, p1, p2}, LA9;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LB9;)Lx9;

    move-result-object p1

    return-object p1
.end method
