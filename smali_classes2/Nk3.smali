.class public final LNk3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMk3;


# instance fields
.field public final a:LOk3;


# direct methods
.method public constructor <init>(LOk3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNk3;->a:LOk3;

    return-void
.end method

.method public static b(LOk3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOk3;",
            ")",
            "LY94<",
            "LMk3;",
            ">;"
        }
    .end annotation

    new-instance v0, LNk3;

    invoke-direct {v0, p0}, LNk3;-><init>(LOk3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LNm3;Lcom/uber/autodispose/ScopeProvider;LPk3;)LEk3;
    .locals 1

    iget-object v0, p0, LNk3;->a:LOk3;

    invoke-virtual {v0, p1, p3, p2}, LOk3;->b(LNm3;LPk3;Lcom/uber/autodispose/ScopeProvider;)LEk3;

    move-result-object p1

    return-object p1
.end method
