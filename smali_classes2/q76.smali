.class public final Lq76;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp76;


# instance fields
.field public final a:Ls76;


# direct methods
.method public constructor <init>(Ls76;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq76;->a:Ls76;

    return-void
.end method

.method public static b(Ls76;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls76;",
            ")",
            "LY94<",
            "Lp76;",
            ">;"
        }
    .end annotation

    new-instance v0, Lq76;

    invoke-direct {v0, p0}, Lq76;-><init>(Ls76;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;Lu76;Le13;)Lo76;
    .locals 1

    iget-object v0, p0, Lq76;->a:Ls76;

    invoke-virtual {v0, p1, p2, p3}, Ls76;->b(Lcom/uber/autodispose/ScopeProvider;Lu76;Le13;)Lo76;

    move-result-object p1

    return-object p1
.end method
