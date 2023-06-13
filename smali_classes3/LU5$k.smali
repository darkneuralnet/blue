.class public final LLU5$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLU5;->O(LNU5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LLU5;


# direct methods
.method public constructor <init>(LLU5;)V
    .locals 0

    iput-object p1, p0, LLU5$k;->g:LLU5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LLU5$k;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 9

    iget-object p1, p0, LLU5$k;->g:LLU5;

    invoke-static {p1}, LLU5;->access$getReactiveConfig$p(LLU5;)LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getNestSuggestion()Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->getPhotoRequired()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LLU5$k;->g:LLU5;

    invoke-static {p1}, LLU5;->access$getNavigator$p(LLU5;)Le13;

    move-result-object v0

    sget-object v3, Lco/bird/android/model/Folder;->NEST_PHOTOS:Lco/bird/android/model/Folder;

    iget-object p1, p0, LLU5$k;->g:LLU5;

    invoke-static {p1}, LLU5;->access$getPhotoBannerViewModel$p(LLU5;)Lco/bird/android/model/PhotoBannerViewModel;

    move-result-object v1

    const/4 v2, 0x0

    const/16 p1, 0x275f

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/16 v7, 0x12

    const/4 v8, 0x0

    invoke-static/range {v0 .. v8}, Le13$a;->goToRetakeablePhoto$default(Le13;Lco/bird/android/model/PhotoBannerViewModel;Ljava/lang/String;Lco/bird/android/model/Folder;Ljava/lang/Integer;Ljava/lang/Boolean;ZILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LLU5$k;->g:LLU5;

    invoke-static {p1}, LLU5;->access$getAssetIdRelay$p(LLU5;)Lma4;

    move-result-object p1

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-virtual {p1, v0}, Lma4;->accept(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
