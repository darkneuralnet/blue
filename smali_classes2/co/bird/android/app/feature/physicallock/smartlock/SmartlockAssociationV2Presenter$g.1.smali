.class public final Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->y0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/Observable<",
        "[B>;",
        "Lio/reactivex/B<",
        "+",
        "Lkotlin/Pair<",
        "+[B+[B>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u009a\u0001\u0012F\u0008\u0001\u0012B\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002* \u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u0005 \u0002*L\u0012F\u0008\u0001\u0012B\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002* \u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lio/reactivex/Observable;",
        "",
        "kotlin.jvm.PlatformType",
        "notificationObservable",
        "Lio/reactivex/B;",
        "Lkotlin/Pair;",
        "invoke",
        "(Lio/reactivex/Observable;)Lio/reactivex/B;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$g;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$g;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Lio/reactivex/Observable;)Lio/reactivex/B;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "[B>;)",
            "Lio/reactivex/B<",
            "+",
            "Lkotlin/Pair<",
            "[B[B>;>;"
        }
    .end annotation

    const-string v0, "notificationObservable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "notifications set up"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lio/reactivex/rxkotlin/e;->a:Lio/reactivex/rxkotlin/e;

    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$g;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$getTOKEN_REQUEST$cp()[B

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4, v3}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->z1(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B[BILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/F;->k0()Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$g$a;

    iget-object v3, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$g;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-direct {v2, v3}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$g$a;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v3, LHH5;

    invoke-direct {v3, v2}, LHH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->doOnSubscribe(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v1

    const-string v2, "private fun listenForSma\u2026\")\n        }\n      })\n  }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lio/reactivex/rxkotlin/e;->a(Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/Observable;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$g;->invoke(Lio/reactivex/Observable;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
