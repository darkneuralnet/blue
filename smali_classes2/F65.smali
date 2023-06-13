.class public final LF65;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireBird;",
        "Lco/bird/android/model/ridertutorial/TutorialKind;",
        "a",
        "app_birdRelease"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/ridertutorial/TutorialKind;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0xc10

    if-eq v1, v2, :cond_8

    const/16 v2, 0xc11

    if-eq v1, v2, :cond_6

    const/16 v2, 0xc41

    if-eq v1, v2, :cond_4

    const/16 v2, 0xcae

    if-eq v1, v2, :cond_2

    const v2, 0x3252a5

    if-eq v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, "m365"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object p0, Lco/bird/android/model/ridertutorial/TutorialKind;->CONTEXTUAL_M365:Lco/bird/android/model/ridertutorial/TutorialKind;

    goto :goto_0

    :cond_2
    const-string v1, "es"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    sget-object p0, Lco/bird/android/model/ridertutorial/TutorialKind;->CONTEXTUAL_ES:Lco/bird/android/model/ridertutorial/TutorialKind;

    goto :goto_0

    :cond_4
    const-string v1, "bc"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    sget-object p0, Lco/bird/android/model/ridertutorial/TutorialKind;->CONTEXTUAL_BC:Lco/bird/android/model/ridertutorial/TutorialKind;

    goto :goto_0

    :cond_6
    const-string v1, "b3"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_1

    :cond_7
    sget-object p0, Lco/bird/android/model/ridertutorial/TutorialKind;->CONTEXTUAL_B3:Lco/bird/android/model/ridertutorial/TutorialKind;

    goto :goto_0

    :cond_8
    const-string v1, "b2"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_1

    :cond_9
    sget-object p0, Lco/bird/android/model/ridertutorial/TutorialKind;->CONTEXTUAL_B2:Lco/bird/android/model/ridertutorial/TutorialKind;

    :goto_0
    return-object p0

    :cond_a
    :goto_1
    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isCruiserModel(Lco/bird/android/model/wire/WireBird;)Z

    move-result p0

    if-eqz p0, :cond_b

    sget-object p0, Lco/bird/android/model/ridertutorial/TutorialKind;->CLASS_MOPED:Lco/bird/android/model/ridertutorial/TutorialKind;

    goto :goto_2

    :cond_b
    sget-object p0, Lco/bird/android/model/ridertutorial/TutorialKind;->CLASS_SCOOTER:Lco/bird/android/model/ridertutorial/TutorialKind;

    :goto_2
    return-object p0
.end method
