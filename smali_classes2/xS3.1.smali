.class public final LxS3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LvS3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LxS3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u0005B5\u0008\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u000e\u0008\u0001\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u0015\u0012\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016J\u0008\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0002J\u0008\u0010\u000b\u001a\u00020\u0004H\u0002J\u0008\u0010\u000c\u001a\u00020\u0004H\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u000eR\u001a\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u001a\u00a8\u0006\u001e"
    }
    d2 = {
        "LxS3;",
        "LvS3;",
        "Lco/bird/android/model/LastLockComplianceModel;",
        "model",
        "",
        "a",
        "onBackPressed",
        "g",
        "",
        "formFactor",
        "e",
        "f",
        "d",
        "LEa;",
        "LEa;",
        "analyticsManager",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "LRE;",
        "b",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "scopeProvider",
        "LBS3;",
        "c",
        "LBS3;",
        "ui",
        "Le13;",
        "Le13;",
        "navigator",
        "<init>",
        "(LEa;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LBS3;Le13;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPhysicalLockLastCompliancePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalLockLastCompliancePresenter.kt\nco/bird/android/app/feature/physicallock/PhysicalLockLastCompliancePresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,97:1\n180#2:98\n*S KotlinDebug\n*F\n+ 1 PhysicalLockLastCompliancePresenter.kt\nco/bird/android/app/feature/physicallock/PhysicalLockLastCompliancePresenterImpl\n*L\n58#1:98\n*E\n"
    }
.end annotation


# static fields
.field public static final e:LxS3$a;

.field public static final f:I


# instance fields
.field public final a:LEa;

.field public final b:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LBS3;

.field public final d:Le13;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LxS3$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LxS3$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LxS3;->e:LxS3$a;

    const/16 v0, 0x8

    sput v0, LxS3;->f:I

    return-void
.end method

.method public constructor <init>(LEa;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LBS3;Le13;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEa;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LBS3;",
            "Le13;",
            ")V"
        }
    .end annotation

    const-string v0, "analyticsManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LxS3;->a:LEa;

    iput-object p2, p0, LxS3;->b:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    iput-object p3, p0, LxS3;->c:LBS3;

    iput-object p4, p0, LxS3;->d:Le13;

    return-void
.end method

.method public static final synthetic access$getNavigator$p(LxS3;)Le13;
    .locals 0

    iget-object p0, p0, LxS3;->d:Le13;

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LxS3;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/model/LastLockComplianceModel;)V
    .locals 2

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/LastLockComplianceModel;->getShowCompliant()Z

    move-result v0

    invoke-virtual {p1}, Lco/bird/android/model/LastLockComplianceModel;->getWarnNotCompliant()Z

    move-result v1

    if-eq v0, v1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/LastLockComplianceModel;->getShowCompliant()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/LastLockComplianceModel;->getLockFormFactor()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LxS3;->e(Ljava/lang/String;)V

    iget-object p1, p0, LxS3;->a:LEa;

    new-instance v0, Lco/bird/android/model/analytics/LockComplianceModalViewed;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lco/bird/android/model/analytics/LockComplianceModalViewed;-><init>(Z)V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/LastLockComplianceModel;->getWarnNotCompliant()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LxS3;->g()V

    iget-object p1, p0, LxS3;->a:LEa;

    new-instance v0, Lco/bird/android/model/analytics/LockComplianceModalViewed;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/analytics/LockComplianceModalViewed;-><init>(Z)V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    :cond_1
    :goto_0
    iget-object p1, p0, LxS3;->c:LBS3;

    invoke-interface {p1}, LBS3;->t5()Lio/reactivex/Observable;

    move-result-object p1

    iget-object v0, p0, LxS3;->b:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, LxS3$b;

    invoke-direct {v0, p0}, LxS3$b;-><init>(LxS3;)V

    new-instance v1, LwS3;

    invoke-direct {v1, v0}, LwS3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "model is invalid, either we should show compliant or warn but not both or none"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, LxS3;->c:LBS3;

    sget v1, Lrg4;->ic_lock_compliant_cable:I

    invoke-interface {v0, v1}, LBS3;->Ca(I)V

    iget-object v0, p0, LxS3;->c:LBS3;

    sget v1, Lnl4;->physical_lock_compliant_cable_title:I

    invoke-interface {v0, v1}, LBS3;->setTitle(I)V

    iget-object v0, p0, LxS3;->c:LBS3;

    sget v1, Lnl4;->physical_lock_compliant_cable_subtitle:I

    invoke-interface {v0, v1}, LBS3;->El(I)V

    iget-object v0, p0, LxS3;->c:LBS3;

    sget v1, Lnl4;->physical_lock_compliant_cable_button:I

    invoke-interface {v0, v1}, LBS3;->kd(I)V

    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 1

    const-string v0, "ulock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LxS3;->f()V

    goto :goto_0

    :cond_0
    const-string v0, "cable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LxS3;->d()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LxS3;->d()V

    :goto_0
    return-void
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, LxS3;->c:LBS3;

    sget v1, Lrg4;->ic_lock_compliant_ulock:I

    invoke-interface {v0, v1}, LBS3;->Ca(I)V

    iget-object v0, p0, LxS3;->c:LBS3;

    sget v1, Lnl4;->physical_lock_compliant_ulock_title:I

    invoke-interface {v0, v1}, LBS3;->setTitle(I)V

    iget-object v0, p0, LxS3;->c:LBS3;

    sget v1, Lnl4;->physical_lock_compliant_ulock_subtitle:I

    invoke-interface {v0, v1}, LBS3;->El(I)V

    iget-object v0, p0, LxS3;->c:LBS3;

    sget v1, Lnl4;->physical_lock_compliant_ulock_button:I

    invoke-interface {v0, v1}, LBS3;->kd(I)V

    return-void
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, LxS3;->c:LBS3;

    sget v1, Lrg4;->ic_lock_not_compliant:I

    invoke-interface {v0, v1}, LBS3;->Ca(I)V

    iget-object v0, p0, LxS3;->c:LBS3;

    sget v1, Lnl4;->physical_lock_not_compliant_title:I

    invoke-interface {v0, v1}, LBS3;->setTitle(I)V

    iget-object v0, p0, LxS3;->c:LBS3;

    sget v1, Lnl4;->physical_lock_not_compliant_subtitle:I

    invoke-interface {v0, v1}, LBS3;->El(I)V

    iget-object v0, p0, LxS3;->c:LBS3;

    sget v1, Lnl4;->physical_lock_not_compliant_button:I

    invoke-interface {v0, v1}, LBS3;->kd(I)V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    iget-object v0, p0, LxS3;->d:Le13;

    invoke-interface {v0}, Le13;->e3()V

    return-void
.end method
