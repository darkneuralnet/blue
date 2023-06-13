.class final Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$progress$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->d0(Lio/reactivex/F;Ljava/lang/Boolean;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/disposables/c;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "T",
        "Lio/reactivex/disposables/c;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lio/reactivex/disposables/c;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;

.field public final synthetic h:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$progress$1;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;

    iput-object p2, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$progress$1;->h:Ljava/lang/Boolean;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lio/reactivex/disposables/c;)V
    .locals 2

    iget-object p1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$progress$1;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;

    new-instance v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$progress$1$1;

    iget-object v1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$progress$1;->h:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$progress$1$1;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {p1, v0}, Lf1;->i(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/disposables/c;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$progress$1;->a(Lio/reactivex/disposables/c;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
