.class public final LUH5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LTH5;


# instance fields
.field public final a:LVH5;


# direct methods
.method public constructor <init>(LVH5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUH5;->a:LVH5;

    return-void
.end method

.method public static b(LVH5;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH5;",
            ")",
            "LY94<",
            "LTH5;",
            ">;"
        }
    .end annotation

    new-instance v0, LUH5;

    invoke-direct {v0, p0}, LUH5;-><init>(LVH5;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/physicallock/smartlock/b;Le13;)Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDQ3;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Lco/bird/android/app/feature/physicallock/smartlock/b;",
            "Le13;",
            ")",
            "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;"
        }
    .end annotation

    iget-object v0, p0, LUH5;->a:LVH5;

    invoke-virtual {v0, p1, p2, p3, p4}, LVH5;->b(LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/physicallock/smartlock/b;Le13;)Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    move-result-object p1

    return-object p1
.end method
