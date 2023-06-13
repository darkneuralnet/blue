.class public final LBz2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAz2;


# instance fields
.field public final a:LCz2;


# direct methods
.method public constructor <init>(LCz2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBz2;->a:LCz2;

    return-void
.end method

.method public static b(LCz2;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LCz2;",
            ")",
            "LY94<",
            "LAz2;",
            ">;"
        }
    .end annotation

    new-instance v0, LBz2;

    invoke-direct {v0, p0}, LBz2;-><init>(LCz2;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LQA2;Lcom/uber/autodispose/ScopeProvider;LDz2;)Lzz2;
    .locals 1

    iget-object v0, p0, LBz2;->a:LCz2;

    invoke-virtual {v0, p1, p2, p3}, LCz2;->b(LQA2;Lcom/uber/autodispose/ScopeProvider;LDz2;)Lzz2;

    move-result-object p1

    return-object p1
.end method
