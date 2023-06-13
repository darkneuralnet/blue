.class public final LIR4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHR4;


# instance fields
.field public final a:LJR4;


# direct methods
.method public constructor <init>(LJR4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIR4;->a:LJR4;

    return-void
.end method

.method public static b(LJR4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJR4;",
            ")",
            "LY94<",
            "LHR4;",
            ">;"
        }
    .end annotation

    new-instance v0, LIR4;

    invoke-direct {v0, p0}, LIR4;-><init>(LJR4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/model/wire/WireBird;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LRR4;Le13;)LGR4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireBird;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LRR4;",
            "Le13;",
            ")",
            "LGR4;"
        }
    .end annotation

    iget-object v0, p0, LIR4;->a:LJR4;

    invoke-virtual {v0, p1, p2, p3, p4}, LJR4;->b(Lco/bird/android/model/wire/WireBird;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LRR4;Le13;)LGR4;

    move-result-object p1

    return-object p1
.end method
