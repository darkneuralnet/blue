.class public final Laa5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ95;


# instance fields
.field public final a:Lba5;


# direct methods
.method public constructor <init>(Lba5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laa5;->a:Lba5;

    return-void
.end method

.method public static b(Lba5;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lba5;",
            ")",
            "LY94<",
            "LZ95;",
            ">;"
        }
    .end annotation

    new-instance v0, Laa5;

    invoke-direct {v0, p0}, Laa5;-><init>(Lba5;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/core/mvp/BaseActivity;Ljava/util/Set;)LY95;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Ljava/util/Set<",
            "+",
            "Lco/bird/android/model/RideState$Status;",
            ">;)",
            "LY95;"
        }
    .end annotation

    iget-object v0, p0, Laa5;->a:Lba5;

    invoke-virtual {v0, p1, p2, p3}, Lba5;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/core/mvp/BaseActivity;Ljava/util/Set;)LY95;

    move-result-object p1

    return-object p1
.end method
