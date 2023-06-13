.class public final Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$Q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->M0(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lke5;",
        "Lio/reactivex/B<",
        "+",
        "Lio/reactivex/Observable<",
        "[B>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0004\u0010\u0008\u001ab\u0012*\u0008\u0001\u0012&\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003 \u0005*0\u0012*\u0008\u0001\u0012&\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lke5;",
        "it",
        "Lio/reactivex/B;",
        "Lio/reactivex/Observable;",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lke5;)Lio/reactivex/B;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$Q;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$Q;

    invoke-direct {v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$Q;-><init>()V

    sput-object v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$Q;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$Q;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lke5;)Lio/reactivex/B;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lke5;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lio/reactivex/Observable<",
            "[B>;>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "setting up notification..."

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->d:Lco/bird/android/app/manager/SmartlockManagerImpl$i;

    invoke-virtual {v0}, Lco/bird/android/app/manager/SmartlockManagerImpl$i;->b()Ljava/util/UUID;

    move-result-object v0

    sget-object v1, Lfd3;->b:Lfd3;

    invoke-interface {p1, v0, v1}, Lke5;->b(Ljava/util/UUID;Lfd3;)Lio/reactivex/Observable;

    move-result-object p1

    const-wide/16 v0, 0x1f4

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lio/reactivex/Observable;->delaySubscription(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lke5;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$Q;->invoke(Lke5;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
