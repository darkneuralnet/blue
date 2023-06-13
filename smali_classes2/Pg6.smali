.class public final LPg6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOg6;


# instance fields
.field public final a:LQg6;


# direct methods
.method public constructor <init>(LQg6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPg6;->a:LQg6;

    return-void
.end method

.method public static b(LQg6;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQg6;",
            ")",
            "LY94<",
            "LOg6;",
            ">;"
        }
    .end annotation

    new-instance v0, LPg6;

    invoke-direct {v0, p0}, LPg6;-><init>(LQg6;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;LRg6;Lg9;Le13;Ljava/lang/Integer;)LKg6;
    .locals 6

    iget-object v0, p0, LPg6;->a:LQg6;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, LQg6;->b(Lcom/uber/autodispose/ScopeProvider;LRg6;Lg9;Le13;Ljava/lang/Integer;)LKg6;

    move-result-object p1

    return-object p1
.end method
