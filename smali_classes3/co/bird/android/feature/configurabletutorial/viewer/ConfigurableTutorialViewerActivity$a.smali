.class public final Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lio/reactivex/Observable<",
        "Ljava/util/List<",
        "+",
        "Ljava/lang/String;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lio/reactivex/Observable;",
        "",
        "",
        "b",
        "()Lio/reactivex/Observable;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity$a;->g:Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity$a;->g:Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;

    invoke-static {v0}, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;->access$getAdapter$p(Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity;)LMw0;

    move-result-object v0

    invoke-virtual {v0}, LMw0;->v()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/configurabletutorial/viewer/ConfigurableTutorialViewerActivity$a;->b()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
