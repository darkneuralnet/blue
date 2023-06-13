.class public final LEn6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYR4;",
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


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEn6;->a:LY94;

    iput-object p2, p0, LEn6;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LEn6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)",
            "LEn6;"
        }
    .end annotation

    new-instance v0, LEn6;

    invoke-direct {v0, p0, p1}, LEn6;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(LYR4;Le13;Lcom/uber/autodispose/ScopeProvider;LFn6;)Lzn6;
    .locals 1

    new-instance v0, Lzn6;

    invoke-direct {v0, p0, p1, p2, p3}, Lzn6;-><init>(LYR4;Le13;Lcom/uber/autodispose/ScopeProvider;LFn6;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/ScopeProvider;LFn6;)Lzn6;
    .locals 2

    iget-object v0, p0, LEn6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYR4;

    iget-object v1, p0, LEn6;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le13;

    invoke-static {v0, v1, p1, p2}, LEn6;->c(LYR4;Le13;Lcom/uber/autodispose/ScopeProvider;LFn6;)Lzn6;

    move-result-object p1

    return-object p1
.end method
