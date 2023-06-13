.class public final LYa5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYa5$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001a\u0018\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a8\u0006\u0006"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireRiderTutorial;",
        "Lco/bird/android/model/ridertutorial/TutorialKind;",
        "tutorialKind",
        "",
        "",
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
.method public static final a(Lco/bird/android/model/wire/WireRiderTutorial;Lco/bird/android/model/ridertutorial/TutorialKind;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireRiderTutorial;",
            "Lco/bird/android/model/ridertutorial/TutorialKind;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tutorialKind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYa5$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRiderTutorial;->getClassMopedParking()Ljava/util/List;

    move-result-object p0

    goto :goto_2

    :pswitch_1
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRiderTutorial;->getClassScooterParking()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRiderTutorial;->getParking()Ljava/util/List;

    move-result-object p0

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRiderTutorial;->getClassScooterParking()Ljava/util/List;

    move-result-object p0

    goto :goto_2

    :pswitch_2
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRiderTutorial;->getClassMopedSteps()Ljava/util/List;

    move-result-object p0

    goto :goto_2

    :pswitch_3
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRiderTutorial;->getClassScooterSteps()Ljava/util/List;

    move-result-object p0

    goto :goto_2

    :pswitch_4
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRiderTutorial;->getContextualB3()Ljava/util/List;

    move-result-object p0

    goto :goto_2

    :pswitch_5
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRiderTutorial;->getContextualB2()Ljava/util/List;

    move-result-object p0

    goto :goto_2

    :pswitch_6
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRiderTutorial;->getContextualBC()Ljava/util/List;

    move-result-object p0

    goto :goto_2

    :pswitch_7
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRiderTutorial;->getContextualES()Ljava/util/List;

    move-result-object p0

    goto :goto_2

    :pswitch_8
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRiderTutorial;->getContextualM365()Ljava/util/List;

    move-result-object p0

    :goto_2
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
