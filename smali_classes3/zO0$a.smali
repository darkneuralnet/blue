.class public final LzO0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd4$b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LzO0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LyO0;)V
    .locals 0

    invoke-direct {p0}, LzO0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;Lco/bird/android/core/base/BaseCoreActivity;Lcom/uber/autodispose/ScopeProvider;Lc00;LZg3;)Lrd4$b;
    .locals 8

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p5}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, LzO0$b;

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, LzO0$b;-><init>(LlG2;Lco/bird/android/core/base/BaseCoreActivity;Lcom/uber/autodispose/ScopeProvider;Lc00;LZg3;LAO0;)V

    return-object v7
.end method