.class public final Lzr0$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzr0;->V(LXr0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/constant/ComplaintResolutionField;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/constant/ComplaintResolutionField;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/constant/ComplaintResolutionField;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lzr0;


# direct methods
.method public constructor <init>(Lzr0;)V
    .locals 0

    iput-object p1, p0, Lzr0$h;->g:Lzr0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/constant/ComplaintResolutionField;)V
    .locals 10

    iget-object v0, p0, Lzr0$h;->g:Lzr0;

    invoke-static {v0}, Lzr0;->access$getNavigator$p(Lzr0;)Le13;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v4, Lco/bird/android/model/Folder;->COMPLAINT_PHOTOS:Lco/bird/android/model/Folder;

    sget-object v0, Lco/bird/android/model/constant/ComplaintResolutionField;->BEFORE_PHOTO:Lco/bird/android/model/constant/ComplaintResolutionField;

    if-ne p1, v0, :cond_0

    const/16 p1, 0x275b

    goto :goto_0

    :cond_0
    const/16 p1, 0x275c

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/16 v8, 0x13

    const/4 v9, 0x0

    invoke-static/range {v1 .. v9}, Le13$a;->goToRetakeablePhoto$default(Le13;Lco/bird/android/model/PhotoBannerViewModel;Ljava/lang/String;Lco/bird/android/model/Folder;Ljava/lang/Integer;Ljava/lang/Boolean;ZILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/constant/ComplaintResolutionField;

    invoke-virtual {p0, p1}, Lzr0$h;->a(Lco/bird/android/model/constant/ComplaintResolutionField;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
