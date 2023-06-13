.class public final LXf3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LXf3;
    .locals 1

    new-instance v0, LXf3;

    invoke-direct {v0}, LXf3;-><init>()V

    return-object v0
.end method

.method public static c(LQA2;LYf3;)LUf3;
    .locals 1

    new-instance v0, LUf3;

    invoke-direct {v0, p0, p1}, LUf3;-><init>(LQA2;LYf3;)V

    return-object v0
.end method


# virtual methods
.method public b(LQA2;LYf3;)LUf3;
    .locals 0

    invoke-static {p1, p2}, LXf3;->c(LQA2;LYf3;)LUf3;

    move-result-object p1

    return-object p1
.end method
