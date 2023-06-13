.class public final LWf3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVf3;


# instance fields
.field public final a:LXf3;


# direct methods
.method public constructor <init>(LXf3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWf3;->a:LXf3;

    return-void
.end method

.method public static b(LXf3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXf3;",
            ")",
            "LY94<",
            "LVf3;",
            ">;"
        }
    .end annotation

    new-instance v0, LWf3;

    invoke-direct {v0, p0}, LWf3;-><init>(LXf3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LQA2;LYf3;)LUf3;
    .locals 1

    iget-object v0, p0, LWf3;->a:LXf3;

    invoke-virtual {v0, p1, p2}, LXf3;->b(LQA2;LYf3;)LUf3;

    move-result-object p1

    return-object p1
.end method
