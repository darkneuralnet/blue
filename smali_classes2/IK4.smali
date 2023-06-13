.class public final LIK4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHK4;


# instance fields
.field public final a:LJK4;


# direct methods
.method public constructor <init>(LJK4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIK4;->a:LJK4;

    return-void
.end method

.method public static b(LJK4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJK4;",
            ")",
            "LY94<",
            "LHK4;",
            ">;"
        }
    .end annotation

    new-instance v0, LIK4;

    invoke-direct {v0, p0}, LIK4;-><init>(LJK4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LKK4;Le13;)LGK4;
    .locals 1

    iget-object v0, p0, LIK4;->a:LJK4;

    invoke-virtual {v0, p1, p2, p3, p4}, LJK4;->b(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LKK4;Le13;)LGK4;

    move-result-object p1

    return-object p1
.end method
