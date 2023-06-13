.class public final Lco/bird/android/app/feature/map/renderer/Bird_Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "classTutorialKind",
        "Lco/bird/android/model/ridertutorial/TutorialKind;",
        "Lco/bird/android/model/wire/WireBird;",
        "co.bird.android.feature.map"
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
.method public static final classTutorialKind(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/ridertutorial/TutorialKind;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isCruiserModel(Lco/bird/android/model/wire/WireBird;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lco/bird/android/model/ridertutorial/TutorialKind;->CLASS_MOPED:Lco/bird/android/model/ridertutorial/TutorialKind;

    goto :goto_0

    :cond_0
    sget-object p0, Lco/bird/android/model/ridertutorial/TutorialKind;->CLASS_SCOOTER:Lco/bird/android/model/ridertutorial/TutorialKind;

    :goto_0
    return-object p0
.end method
