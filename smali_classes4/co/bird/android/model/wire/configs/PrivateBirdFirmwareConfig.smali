.class public final Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u001c\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001BW\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003J`\u0010\u001e\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00062\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u0014\u0010\u000fR\u0018\u0010\u0008\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0012\u00a8\u0006%"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;",
        "",
        "dashFirmwareVersion",
        "",
        "dashFirmwareUrl",
        "dashFirmwareUpdateRequired",
        "",
        "pcmFirmwareVersion",
        "pcmFirmwareUrl",
        "pcmFirmwareUpdateRequired",
        "allowStopUpdate",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)V",
        "getAllowStopUpdate",
        "()Z",
        "getDashFirmwareUpdateRequired",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getDashFirmwareUrl",
        "()Ljava/lang/String;",
        "getDashFirmwareVersion",
        "getPcmFirmwareUpdateRequired",
        "getPcmFirmwareUrl",
        "getPcmFirmwareVersion",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "model-wire_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final allowStopUpdate:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "allow_stop_update"
    .end annotation

    .annotation runtime Lft5;
        value = "allow_stop_update"
    .end annotation
.end field

.field private final dashFirmwareUpdateRequired:Ljava/lang/Boolean;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "dash_firmware_update_required"
    .end annotation

    .annotation runtime Lft5;
        value = "dash_firmware_update_required"
    .end annotation
.end field

.field private final dashFirmwareUrl:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "dash_firmware_url"
    .end annotation

    .annotation runtime Lft5;
        value = "dash_firmware_url"
    .end annotation
.end field

.field private final dashFirmwareVersion:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "dash_firmware_version"
    .end annotation

    .annotation runtime Lft5;
        value = "dash_firmware_version"
    .end annotation
.end field

.field private final pcmFirmwareUpdateRequired:Ljava/lang/Boolean;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "pcm_firmware_update_required"
    .end annotation

    .annotation runtime Lft5;
        value = "pcm_firmware_update_required"
    .end annotation
.end field

.field private final pcmFirmwareUrl:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "pcm_firmware_url"
    .end annotation

    .annotation runtime Lft5;
        value = "pcm_firmware_url"
    .end annotation
.end field

.field private final pcmFirmwareVersion:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "pcm_firmware_version"
    .end annotation

    .annotation runtime Lft5;
        value = "pcm_firmware_version"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 10

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x7f

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareVersion:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareUrl:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareUpdateRequired:Ljava/lang/Boolean;

    iput-object p4, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareVersion:Ljava/lang/String;

    iput-object p5, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareUrl:Ljava/lang/String;

    iput-object p6, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareUpdateRequired:Ljava/lang/Boolean;

    iput-boolean p7, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->allowStopUpdate:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 5

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p9, v0

    goto :goto_0

    :cond_0
    move-object p9, p1

    :goto_0
    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_1

    move-object v1, v0

    goto :goto_1

    :cond_1
    move-object v1, p2

    :goto_1
    and-int/lit8 p1, p8, 0x4

    if-eqz p1, :cond_2

    move-object v2, v0

    goto :goto_2

    :cond_2
    move-object v2, p3

    :goto_2
    and-int/lit8 p1, p8, 0x8

    if-eqz p1, :cond_3

    move-object v3, v0

    goto :goto_3

    :cond_3
    move-object v3, p4

    :goto_3
    and-int/lit8 p1, p8, 0x10

    if-eqz p1, :cond_4

    move-object v4, v0

    goto :goto_4

    :cond_4
    move-object v4, p5

    :goto_4
    and-int/lit8 p1, p8, 0x20

    if-eqz p1, :cond_5

    goto :goto_5

    :cond_5
    move-object v0, p6

    :goto_5
    and-int/lit8 p1, p8, 0x40

    if-eqz p1, :cond_6

    const/4 p7, 0x0

    :cond_6
    move p8, p7

    move-object p1, p0

    move-object p2, p9

    move-object p3, v1

    move-object p4, v2

    move-object p5, v3

    move-object p6, v4

    move-object p7, v0

    invoke-direct/range {p1 .. p8}, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZILjava/lang/Object;)Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;
    .locals 5

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareVersion:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareUrl:Ljava/lang/String;

    :cond_1
    move-object p9, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareUpdateRequired:Ljava/lang/Boolean;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareVersion:Ljava/lang/String;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareUrl:Ljava/lang/String;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p8, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareUpdateRequired:Ljava/lang/Boolean;

    :cond_5
    move-object v3, p6

    and-int/lit8 p2, p8, 0x40

    if-eqz p2, :cond_6

    iget-boolean p7, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->allowStopUpdate:Z

    :cond_6
    move v4, p7

    move-object p2, p0

    move-object p3, p1

    move-object p4, p9

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move-object p8, v3

    move p9, v4

    invoke-virtual/range {p2 .. p9}, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareUpdateRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareUpdateRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->allowStopUpdate:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;
    .locals 9

    new-instance v8, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;

    move-object v0, v8

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)V

    return-object v8
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;

    iget-object v1, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareVersion:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareUrl:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareUpdateRequired:Ljava/lang/Boolean;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareUpdateRequired:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareVersion:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareUrl:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareUpdateRequired:Ljava/lang/Boolean;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareUpdateRequired:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->allowStopUpdate:Z

    iget-boolean p1, p1, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->allowStopUpdate:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAllowStopUpdate()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->allowStopUpdate:Z

    return v0
.end method

.method public final getDashFirmwareUpdateRequired()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareUpdateRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getDashFirmwareUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getDashFirmwareVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getPcmFirmwareUpdateRequired()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareUpdateRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getPcmFirmwareUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getPcmFirmwareVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareVersion:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareUrl:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareUpdateRequired:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareVersion:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareUrl:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareUpdateRequired:Ljava/lang/Boolean;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->allowStopUpdate:Z

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    :cond_6
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareVersion:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareUrl:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->dashFirmwareUpdateRequired:Ljava/lang/Boolean;

    iget-object v3, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareVersion:Ljava/lang/String;

    iget-object v4, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareUrl:Ljava/lang/String;

    iget-object v5, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->pcmFirmwareUpdateRequired:Ljava/lang/Boolean;

    iget-boolean v6, p0, Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;->allowStopUpdate:Z

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "PrivateBirdFirmwareConfig(dashFirmwareVersion="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", dashFirmwareUrl="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", dashFirmwareUpdateRequired="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pcmFirmwareVersion="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", pcmFirmwareUrl="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", pcmFirmwareUpdateRequired="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", allowStopUpdate="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
