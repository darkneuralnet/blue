.class public final Lco/bird/android/model/wire/configs/BirdPayConfigKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "checkConfigForTutorial",
        "Lco/bird/android/model/wire/configs/TutorialAvailable;",
        "Lco/bird/android/model/wire/configs/BirdPayConfig;",
        "model-wire_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final checkConfigForTutorial(Lco/bird/android/model/wire/configs/BirdPayConfig;)Lco/bird/android/model/wire/configs/TutorialAvailable;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/BirdPayConfig;->getTutorialConfig()Lco/bird/android/model/wire/configs/BirdPayTutorialConfig;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/BirdPayTutorialConfig;->getEnabled()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    if-eqz v1, :cond_1

    sget-object p0, Lco/bird/android/model/wire/configs/TutorialAvailable;->TUTORIAL_CONFIG:Lco/bird/android/model/wire/configs/TutorialAvailable;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/BirdPayConfig;->getBannerHelpArticleId()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    sget-object p0, Lco/bird/android/model/wire/configs/TutorialAvailable;->ZENDESK_ARTICLE:Lco/bird/android/model/wire/configs/TutorialAvailable;

    goto :goto_0

    :cond_2
    sget-object p0, Lco/bird/android/model/wire/configs/TutorialAvailable;->NONE:Lco/bird/android/model/wire/configs/TutorialAvailable;

    :goto_0
    return-object p0
.end method
