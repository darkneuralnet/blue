.class public final LAq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzq;


# instance fields
.field public final a:LBq;


# direct methods
.method public constructor <init>(LBq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAq;->a:LBq;

    return-void
.end method

.method public static b(LBq;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBq;",
            ")",
            "LY94<",
            "Lzq;",
            ">;"
        }
    .end annotation

    new-instance v0, LAq;

    invoke-direct {v0, p0}, LAq;-><init>(LBq;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;LCq;)Lyq;
    .locals 1

    iget-object v0, p0, LAq;->a:LBq;

    invoke-virtual {v0, p1, p2}, LBq;->b(Lcom/uber/autodispose/ScopeProvider;LCq;)Lyq;

    move-result-object p1

    return-object p1
.end method
