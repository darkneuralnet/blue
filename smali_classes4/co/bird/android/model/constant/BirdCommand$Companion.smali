.class public final Lco/bird/android/model/constant/BirdCommand$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/constant/BirdCommand;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lco/bird/android/model/constant/BirdCommand$Companion;",
        "",
        "()V",
        "from",
        "Lco/bird/android/model/constant/BirdCommand;",
        "text",
        "",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/model/constant/BirdCommand$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Ljava/lang/String;)Lco/bird/android/model/constant/BirdCommand;
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "captured"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lco/bird/android/model/constant/BirdCommand;->CAPTURED:Lco/bird/android/model/constant/BirdCommand;

    goto :goto_1

    :sswitch_1
    const-string v0, "woken up"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lco/bird/android/model/constant/BirdCommand;->WOKEN_UP:Lco/bird/android/model/constant/BirdCommand;

    goto :goto_1

    :sswitch_2
    const-string v0, "unlocked"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Lco/bird/android/model/constant/BirdCommand;->UNLOCKED:Lco/bird/android/model/constant/BirdCommand;

    goto :goto_1

    :sswitch_3
    const-string v0, "put to sleep"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    sget-object p1, Lco/bird/android/model/constant/BirdCommand;->PUT_TO_SLEEP:Lco/bird/android/model/constant/BirdCommand;

    goto :goto_1

    :sswitch_4
    const-string v0, "released"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    sget-object p1, Lco/bird/android/model/constant/BirdCommand;->RELEASED:Lco/bird/android/model/constant/BirdCommand;

    goto :goto_1

    :sswitch_5
    const-string v0, "locked"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    sget-object p1, Lco/bird/android/model/constant/BirdCommand;->LOCKED:Lco/bird/android/model/constant/BirdCommand;

    goto :goto_1

    :goto_0
    sget-object p1, Lco/bird/android/model/constant/BirdCommand;->NOOP:Lco/bird/android/model/constant/BirdCommand;

    :goto_1
    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x4169ccf6 -> :sswitch_5
        -0x20dc26c3 -> :sswitch_4
        -0x1cee891d -> :sswitch_3
        -0xc92d51d -> :sswitch_2
        -0xa281b41 -> :sswitch_1
        -0x2f6de22 -> :sswitch_0
    .end sparse-switch
.end method
