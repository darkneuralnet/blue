.class public final enum Lco/bird/android/model/analytics/DropTargetReleaseError;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/analytics/DropTargetReleaseError;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/model/analytics/DropTargetReleaseError;",
        "",
        "(Ljava/lang/String;I)V",
        "key",
        "",
        "NON_TASK_BIRD",
        "BIRD_NOT_DAMAGED",
        "NEST_NOT_DAMAGED",
        "INVALID_USER_LOCATION",
        "INVALID_USER_PROXIMITY",
        "PHOTO_UPLOAD_ERROR",
        "model-analytics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lco/bird/android/model/analytics/DropTargetReleaseError;

.field public static final enum BIRD_NOT_DAMAGED:Lco/bird/android/model/analytics/DropTargetReleaseError;

.field public static final enum INVALID_USER_LOCATION:Lco/bird/android/model/analytics/DropTargetReleaseError;

.field public static final enum INVALID_USER_PROXIMITY:Lco/bird/android/model/analytics/DropTargetReleaseError;

.field public static final enum NEST_NOT_DAMAGED:Lco/bird/android/model/analytics/DropTargetReleaseError;

.field public static final enum NON_TASK_BIRD:Lco/bird/android/model/analytics/DropTargetReleaseError;

.field public static final enum PHOTO_UPLOAD_ERROR:Lco/bird/android/model/analytics/DropTargetReleaseError;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/analytics/DropTargetReleaseError;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lco/bird/android/model/analytics/DropTargetReleaseError;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/analytics/DropTargetReleaseError;->NON_TASK_BIRD:Lco/bird/android/model/analytics/DropTargetReleaseError;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/analytics/DropTargetReleaseError;->BIRD_NOT_DAMAGED:Lco/bird/android/model/analytics/DropTargetReleaseError;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/analytics/DropTargetReleaseError;->NEST_NOT_DAMAGED:Lco/bird/android/model/analytics/DropTargetReleaseError;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/analytics/DropTargetReleaseError;->INVALID_USER_LOCATION:Lco/bird/android/model/analytics/DropTargetReleaseError;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/analytics/DropTargetReleaseError;->INVALID_USER_PROXIMITY:Lco/bird/android/model/analytics/DropTargetReleaseError;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/analytics/DropTargetReleaseError;->PHOTO_UPLOAD_ERROR:Lco/bird/android/model/analytics/DropTargetReleaseError;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/analytics/DropTargetReleaseError;

    const-string v1, "NON_TASK_BIRD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/analytics/DropTargetReleaseError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/analytics/DropTargetReleaseError;->NON_TASK_BIRD:Lco/bird/android/model/analytics/DropTargetReleaseError;

    new-instance v0, Lco/bird/android/model/analytics/DropTargetReleaseError;

    const-string v1, "BIRD_NOT_DAMAGED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/analytics/DropTargetReleaseError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/analytics/DropTargetReleaseError;->BIRD_NOT_DAMAGED:Lco/bird/android/model/analytics/DropTargetReleaseError;

    new-instance v0, Lco/bird/android/model/analytics/DropTargetReleaseError;

    const-string v1, "NEST_NOT_DAMAGED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/analytics/DropTargetReleaseError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/analytics/DropTargetReleaseError;->NEST_NOT_DAMAGED:Lco/bird/android/model/analytics/DropTargetReleaseError;

    new-instance v0, Lco/bird/android/model/analytics/DropTargetReleaseError;

    const-string v1, "INVALID_USER_LOCATION"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/analytics/DropTargetReleaseError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/analytics/DropTargetReleaseError;->INVALID_USER_LOCATION:Lco/bird/android/model/analytics/DropTargetReleaseError;

    new-instance v0, Lco/bird/android/model/analytics/DropTargetReleaseError;

    const-string v1, "INVALID_USER_PROXIMITY"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/analytics/DropTargetReleaseError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/analytics/DropTargetReleaseError;->INVALID_USER_PROXIMITY:Lco/bird/android/model/analytics/DropTargetReleaseError;

    new-instance v0, Lco/bird/android/model/analytics/DropTargetReleaseError;

    const-string v1, "PHOTO_UPLOAD_ERROR"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/analytics/DropTargetReleaseError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/analytics/DropTargetReleaseError;->PHOTO_UPLOAD_ERROR:Lco/bird/android/model/analytics/DropTargetReleaseError;

    invoke-static {}, Lco/bird/android/model/analytics/DropTargetReleaseError;->$values()[Lco/bird/android/model/analytics/DropTargetReleaseError;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/analytics/DropTargetReleaseError;->$VALUES:[Lco/bird/android/model/analytics/DropTargetReleaseError;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/analytics/DropTargetReleaseError;
    .locals 1

    const-class v0, Lco/bird/android/model/analytics/DropTargetReleaseError;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/analytics/DropTargetReleaseError;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/analytics/DropTargetReleaseError;
    .locals 1

    sget-object v0, Lco/bird/android/model/analytics/DropTargetReleaseError;->$VALUES:[Lco/bird/android/model/analytics/DropTargetReleaseError;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/analytics/DropTargetReleaseError;

    return-object v0
.end method


# virtual methods
.method public final key()Ljava/lang/String;
    .locals 10

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v0, "this as java.lang.String).toLowerCase()"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "_"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    const-string v2, " "

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v7, Lco/bird/android/model/analytics/DropTargetReleaseError$key$1;->INSTANCE:Lco/bird/android/model/analytics/DropTargetReleaseError$key$1;

    const/16 v8, 0x1e

    const/4 v9, 0x0

    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
