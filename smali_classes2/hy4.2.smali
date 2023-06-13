.class public final Lhy4;
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

    iput-object p1, p0, Lhy4;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Lhy4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;)",
            "Lhy4;"
        }
    .end annotation

    new-instance v0, Lhy4;

    invoke-direct {v0, p0}, Lhy4;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LEa;LQA2;Lcom/uber/autodispose/ScopeProvider;Liy4;)Ley4;
    .locals 1

    new-instance v0, Ley4;

    invoke-direct {v0, p0, p1, p2, p3}, Ley4;-><init>(LEa;LQA2;Lcom/uber/autodispose/ScopeProvider;Liy4;)V

    return-object v0
.end method


# virtual methods
.method public b(LQA2;Lcom/uber/autodispose/ScopeProvider;Liy4;)Ley4;
    .locals 1

    iget-object v0, p0, Lhy4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    invoke-static {v0, p1, p2, p3}, Lhy4;->c(LEa;LQA2;Lcom/uber/autodispose/ScopeProvider;Liy4;)Ley4;

    move-result-object p1

    return-object p1
.end method
