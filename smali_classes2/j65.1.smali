.class public final Lj65;
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


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LYR4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj65;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Lj65;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LYR4;",
            ">;)",
            "Lj65;"
        }
    .end annotation

    new-instance v0, Lj65;

    invoke-direct {v0, p0}, Lj65;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LYR4;Lcom/uber/autodispose/ScopeProvider;LZr1;LP75;)Lg65;
    .locals 1

    new-instance v0, Lg65;

    invoke-direct {v0, p0, p1, p2, p3}, Lg65;-><init>(LYR4;Lcom/uber/autodispose/ScopeProvider;LZr1;LP75;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/ScopeProvider;LZr1;LP75;)Lg65;
    .locals 1

    iget-object v0, p0, Lj65;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYR4;

    invoke-static {v0, p1, p2, p3}, Lj65;->c(LYR4;Lcom/uber/autodispose/ScopeProvider;LZr1;LP75;)Lg65;

    move-result-object p1

    return-object p1
.end method
