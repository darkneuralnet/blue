.class public final LXJ4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWJ4;


# instance fields
.field public final a:LYJ4;


# direct methods
.method public constructor <init>(LYJ4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXJ4;->a:LYJ4;

    return-void
.end method

.method public static b(LYJ4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYJ4;",
            ")",
            "LY94<",
            "LWJ4;",
            ">;"
        }
    .end annotation

    new-instance v0, LXJ4;

    invoke-direct {v0, p0}, LXJ4;-><init>(LYJ4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LDQ3;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LAB1;Le13;)LTJ4;
    .locals 6

    iget-object v0, p0, LXJ4;->a:LYJ4;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, LYJ4;->b(LDQ3;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LAB1;Le13;)LTJ4;

    move-result-object p1

    return-object p1
.end method
