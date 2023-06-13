.class public final LzG3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LyG3;


# instance fields
.field public final a:LAG3;


# direct methods
.method public constructor <init>(LAG3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzG3;->a:LAG3;

    return-void
.end method

.method public static b(LAG3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAG3;",
            ")",
            "LY94<",
            "LyG3;",
            ">;"
        }
    .end annotation

    new-instance v0, LzG3;

    invoke-direct {v0, p0}, LzG3;-><init>(LAG3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LBG3;Lcom/uber/autodispose/ScopeProvider;Le13;)LxG3;
    .locals 1

    iget-object v0, p0, LzG3;->a:LAG3;

    invoke-virtual {v0, p1, p2, p3}, LAG3;->b(LBG3;Lcom/uber/autodispose/ScopeProvider;Le13;)LxG3;

    move-result-object p1

    return-object p1
.end method
