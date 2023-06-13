.class public final LfH4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LeH4;


# instance fields
.field public final a:LgH4;


# direct methods
.method public constructor <init>(LgH4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LfH4;->a:LgH4;

    return-void
.end method

.method public static b(LgH4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgH4;",
            ")",
            "LY94<",
            "LeH4;",
            ">;"
        }
    .end annotation

    new-instance v0, LfH4;

    invoke-direct {v0, p0}, LfH4;-><init>(LgH4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LhH4;LOG4;Le13;Lco/bird/android/model/constant/MapMode;)LdH4;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LhH4;",
            "LOG4;",
            "Le13;",
            "Lco/bird/android/model/constant/MapMode;",
            ")",
            "LdH4;"
        }
    .end annotation

    iget-object v0, p0, LfH4;->a:LgH4;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, LgH4;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LhH4;LOG4;Le13;Lco/bird/android/model/constant/MapMode;)LdH4;

    move-result-object p1

    return-object p1
.end method
