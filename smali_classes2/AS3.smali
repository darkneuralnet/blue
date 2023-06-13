.class public final LAS3;
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


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAS3;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LAS3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;)",
            "LAS3;"
        }
    .end annotation

    new-instance v0, LAS3;

    invoke-direct {v0, p0}, LAS3;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LEa;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LBS3;Le13;)LxS3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEa;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LBS3;",
            "Le13;",
            ")",
            "LxS3;"
        }
    .end annotation

    new-instance v0, LxS3;

    invoke-direct {v0, p0, p1, p2, p3}, LxS3;-><init>(LEa;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LBS3;Le13;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LBS3;Le13;)LxS3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LBS3;",
            "Le13;",
            ")",
            "LxS3;"
        }
    .end annotation

    iget-object v0, p0, LAS3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    invoke-static {v0, p1, p2, p3}, LAS3;->c(LEa;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LBS3;Le13;)LxS3;

    move-result-object p1

    return-object p1
.end method
