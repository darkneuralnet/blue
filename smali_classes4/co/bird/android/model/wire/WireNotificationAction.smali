.class public final Lco/bird/android/model/wire/WireNotificationAction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireNotificationAction;",
        "",
        "actionKind",
        "Lco/bird/android/model/constant/OperatorNotificationActionKind;",
        "deeplinkPath",
        "",
        "title",
        "(Lco/bird/android/model/constant/OperatorNotificationActionKind;Ljava/lang/String;Ljava/lang/String;)V",
        "getActionKind",
        "()Lco/bird/android/model/constant/OperatorNotificationActionKind;",
        "getDeeplinkPath",
        "()Ljava/lang/String;",
        "getTitle",
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
.field private final actionKind:Lco/bird/android/model/constant/OperatorNotificationActionKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "action_kind"
    .end annotation

    .annotation runtime Lft5;
        value = "action_kind"
    .end annotation
.end field

.field private final deeplinkPath:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "deeplink_path"
    .end annotation

    .annotation runtime Lft5;
        value = "deeplink_path"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "title"
    .end annotation

    .annotation runtime Lft5;
        value = "title"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/wire/WireNotificationAction;-><init>(Lco/bird/android/model/constant/OperatorNotificationActionKind;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/constant/OperatorNotificationActionKind;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "actionKind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/WireNotificationAction;->actionKind:Lco/bird/android/model/constant/OperatorNotificationActionKind;

    iput-object p2, p0, Lco/bird/android/model/wire/WireNotificationAction;->deeplinkPath:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/model/wire/WireNotificationAction;->title:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/constant/OperatorNotificationActionKind;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lco/bird/android/model/constant/OperatorNotificationActionKind;->UNKNOWN:Lco/bird/android/model/constant/OperatorNotificationActionKind;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const-string p3, ""

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/wire/WireNotificationAction;-><init>(Lco/bird/android/model/constant/OperatorNotificationActionKind;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getActionKind()Lco/bird/android/model/constant/OperatorNotificationActionKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireNotificationAction;->actionKind:Lco/bird/android/model/constant/OperatorNotificationActionKind;

    return-object v0
.end method

.method public final getDeeplinkPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireNotificationAction;->deeplinkPath:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireNotificationAction;->title:Ljava/lang/String;

    return-object v0
.end method
