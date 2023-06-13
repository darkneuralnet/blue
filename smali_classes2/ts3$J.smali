.class public final Lts3$J;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lts3;->I1(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/persistence/BirdMapMarker;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOperatorPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorPresenterImpl$onCreate$23\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,891:1\n1#2:892\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lts3;


# direct methods
.method public constructor <init>(Lts3;)V
    .locals 0

    iput-object p1, p0, Lts3$J;->g:Lts3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/BirdMapMarker;)V
    .locals 1

    iget-object p1, p0, Lts3$J;->g:Lts3;

    invoke-static {p1}, Lts3;->access$getSelectedMarker$p(Lts3;)Lco/bird/android/model/persistence/BirdMapMarker;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lts3$J;->g:Lts3;

    invoke-static {v0}, Lts3;->access$getFlightSheetBirdMarkerSubject$p(Lts3;)Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {p0, p1}, Lts3$J;->a(Lco/bird/android/model/persistence/BirdMapMarker;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
