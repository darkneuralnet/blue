.class public final LV85;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU85;


# instance fields
.field public final a:LW85;


# direct methods
.method public constructor <init>(LW85;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV85;->a:LW85;

    return-void
.end method

.method public static b(LW85;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LW85;",
            ")",
            "LY94<",
            "LU85;",
            ">;"
        }
    .end annotation

    new-instance v0, LV85;

    invoke-direct {v0, p0}, LV85;-><init>(LW85;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/model/extra/RiderBirdScanExtra;LZS;)LO85;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Lco/bird/android/model/extra/RiderBirdScanExtra;",
            "LZS;",
            ")",
            "LO85;"
        }
    .end annotation

    iget-object v0, p0, LV85;->a:LW85;

    invoke-virtual {v0, p1, p2, p3}, LW85;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/model/extra/RiderBirdScanExtra;LZS;)LO85;

    move-result-object p1

    return-object p1
.end method
