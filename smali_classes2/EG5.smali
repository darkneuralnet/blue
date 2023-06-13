.class public final LEG5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDG5;


# instance fields
.field public final a:LFG5;


# direct methods
.method public constructor <init>(LFG5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEG5;->a:LFG5;

    return-void
.end method

.method public static b(LFG5;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LFG5;",
            ")",
            "LY94<",
            "LDG5;",
            ">;"
        }
    .end annotation

    new-instance v0, LEG5;

    invoke-direct {v0, p0}, LEG5;-><init>(LFG5;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LFF5;Le13;)Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDQ3;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LFF5;",
            "Le13;",
            ")",
            "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;"
        }
    .end annotation

    iget-object v0, p0, LEG5;->a:LFG5;

    invoke-virtual {v0, p1, p2, p3, p4}, LFG5;->b(LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LFF5;Le13;)Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    move-result-object p1

    return-object p1
.end method
