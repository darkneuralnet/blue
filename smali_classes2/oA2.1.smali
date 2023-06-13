.class public final LoA2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LCx4;",
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
            "LCx4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LoA2;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LoA2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LCx4;",
            ">;)",
            "LoA2;"
        }
    .end annotation

    new-instance v0, LoA2;

    invoke-direct {v0, p0}, LoA2;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LCx4;LQA2;Lcom/uber/autodispose/ScopeProvider;LxE;)LlA2;
    .locals 1

    new-instance v0, LlA2;

    invoke-direct {v0, p0, p1, p2, p3}, LlA2;-><init>(LCx4;LQA2;Lcom/uber/autodispose/ScopeProvider;LxE;)V

    return-object v0
.end method


# virtual methods
.method public b(LQA2;Lcom/uber/autodispose/ScopeProvider;LxE;)LlA2;
    .locals 1

    iget-object v0, p0, LoA2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCx4;

    invoke-static {v0, p1, p2, p3}, LoA2;->c(LCx4;LQA2;Lcom/uber/autodispose/ScopeProvider;LxE;)LlA2;

    move-result-object p1

    return-object p1
.end method
