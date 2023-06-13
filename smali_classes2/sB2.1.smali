.class public final LsB2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llh6;",
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
            "Llh6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LsB2;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LsB2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Llh6;",
            ">;)",
            "LsB2;"
        }
    .end annotation

    new-instance v0, LsB2;

    invoke-direct {v0, p0}, LsB2;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Llh6;Lcom/uber/autodispose/ScopeProvider;Lb01;)LpB2;
    .locals 1

    new-instance v0, LpB2;

    invoke-direct {v0, p0, p1, p2}, LpB2;-><init>(Llh6;Lcom/uber/autodispose/ScopeProvider;Lb01;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/ScopeProvider;Lb01;)LpB2;
    .locals 1

    iget-object v0, p0, LsB2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llh6;

    invoke-static {v0, p1, p2}, LsB2;->c(Llh6;Lcom/uber/autodispose/ScopeProvider;Lb01;)LpB2;

    move-result-object p1

    return-object p1
.end method
