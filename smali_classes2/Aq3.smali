.class public final LAq3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzq3;


# instance fields
.field public final a:LBq3;


# direct methods
.method public constructor <init>(LBq3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAq3;->a:LBq3;

    return-void
.end method

.method public static b(LBq3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBq3;",
            ")",
            "LY94<",
            "Lzq3;",
            ">;"
        }
    .end annotation

    new-instance v0, LAq3;

    invoke-direct {v0, p0}, LAq3;-><init>(LBq3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LNm3;Lcom/uber/autodispose/ScopeProvider;LCw3;)Lyq3;
    .locals 1

    iget-object v0, p0, LAq3;->a:LBq3;

    invoke-virtual {v0, p1, p2, p3}, LBq3;->b(LNm3;Lcom/uber/autodispose/ScopeProvider;LCw3;)Lyq3;

    move-result-object p1

    return-object p1
.end method
