.class public final Lzr0$H$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzr0$H;->c(Lco/bird/android/model/persistence/ComplaintResolution;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/ComplaintResolutionForm;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/persistence/ComplaintResolutionForm;",
        "kotlin.jvm.PlatformType",
        "form",
        "",
        "a",
        "(Lco/bird/android/model/persistence/ComplaintResolutionForm;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/persistence/ComplaintResolution;

.field public final synthetic h:Lzr0;


# direct methods
.method public constructor <init>(Lco/bird/android/model/persistence/ComplaintResolution;Lzr0;)V
    .locals 0

    iput-object p1, p0, Lzr0$H$a;->g:Lco/bird/android/model/persistence/ComplaintResolution;

    iput-object p2, p0, Lzr0$H$a;->h:Lzr0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/ComplaintResolutionForm;)V
    .locals 3

    iget-object v0, p0, Lzr0$H$a;->g:Lco/bird/android/model/persistence/ComplaintResolution;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/ComplaintResolution;->getSituation()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lga2;->d:Lga2;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "repoData"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzr0$H$a;->h:Lzr0;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/ComplaintResolutionForm;->getActionTakenRequiredFields()Ljava/util/List;

    move-result-object p1

    iget-object v2, p0, Lzr0$H$a;->g:Lco/bird/android/model/persistence/ComplaintResolution;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1, v2}, Lzr0;->access$updateRequiredMap(Lzr0;Ljava/util/List;Lco/bird/android/model/persistence/ComplaintResolution;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lzr0$H$a;->h:Lzr0;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/ComplaintResolutionForm;->getNoActionTakenRequiredFields()Ljava/util/List;

    move-result-object p1

    iget-object v2, p0, Lzr0$H$a;->g:Lco/bird/android/model/persistence/ComplaintResolution;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1, v2}, Lzr0;->access$updateRequiredMap(Lzr0;Ljava/util/List;Lco/bird/android/model/persistence/ComplaintResolution;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/ComplaintResolutionForm;

    invoke-virtual {p0, p1}, Lzr0$H$a;->a(Lco/bird/android/model/persistence/ComplaintResolutionForm;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
