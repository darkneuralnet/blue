.class public final LBq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lhq;",
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
            "Lhq;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBq;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LBq;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lhq;",
            ">;)",
            "LBq;"
        }
    .end annotation

    new-instance v0, LBq;

    invoke-direct {v0, p0}, LBq;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Lhq;Lcom/uber/autodispose/ScopeProvider;LCq;)Lyq;
    .locals 1

    new-instance v0, Lyq;

    invoke-direct {v0, p0, p1, p2}, Lyq;-><init>(Lhq;Lcom/uber/autodispose/ScopeProvider;LCq;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/ScopeProvider;LCq;)Lyq;
    .locals 1

    iget-object v0, p0, LBq;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhq;

    invoke-static {v0, p1, p2}, LBq;->c(Lhq;Lcom/uber/autodispose/ScopeProvider;LCq;)Lyq;

    move-result-object p1

    return-object p1
.end method
