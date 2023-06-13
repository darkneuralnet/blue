.class public final LJ71;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI71;


# instance fields
.field public final a:LK71;


# direct methods
.method public constructor <init>(LK71;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ71;->a:LK71;

    return-void
.end method

.method public static b(LK71;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LK71;",
            ")",
            "LY94<",
            "LI71;",
            ">;"
        }
    .end annotation

    new-instance v0, LJ71;

    invoke-direct {v0, p0}, LJ71;-><init>(LK71;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LM71;Le13;LzN5;)LG71;
    .locals 6

    iget-object v0, p0, LJ71;->a:LK71;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, LK71;->b(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LM71;Le13;LzN5;)LG71;

    move-result-object p1

    return-object p1
.end method
