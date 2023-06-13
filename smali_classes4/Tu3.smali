.class public final LTu3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireOperatorTaskBanner;",
        "Lco/bird/android/model/persistence/OperatorTaskBanner;",
        "a",
        "co.bird.android.repository.fleet-status"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireOperatorTaskBanner;)Lco/bird/android/model/persistence/OperatorTaskBanner;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/OperatorTaskBanner;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorTaskBanner;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorTaskBanner;->getTitleColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object v2

    invoke-static {v2}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorTaskBanner;->getBackgroundColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object p0

    invoke-static {p0}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lco/bird/android/model/persistence/OperatorTaskBanner;-><init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V

    return-object v0
.end method
