.class public final enum Lco/bird/android/model/wire/TaskBirdStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/wire/TaskBirdStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lco/bird/android/model/wire/TaskBirdStatus;",
        "",
        "color",
        "",
        "(Ljava/lang/String;II)V",
        "getColor",
        "()I",
        "OVERDUE",
        "DUE_FUTURE",
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


# static fields
.field private static final synthetic $VALUES:[Lco/bird/android/model/wire/TaskBirdStatus;

.field public static final enum DUE_FUTURE:Lco/bird/android/model/wire/TaskBirdStatus;

.field public static final enum OVERDUE:Lco/bird/android/model/wire/TaskBirdStatus;


# instance fields
.field private final color:I


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/wire/TaskBirdStatus;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lco/bird/android/model/wire/TaskBirdStatus;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/wire/TaskBirdStatus;->OVERDUE:Lco/bird/android/model/wire/TaskBirdStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/wire/TaskBirdStatus;->DUE_FUTURE:Lco/bird/android/model/wire/TaskBirdStatus;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lco/bird/android/model/wire/TaskBirdStatus;

    const/4 v1, 0x0

    sget v2, LDf4;->redish:I

    const-string v3, "OVERDUE"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/wire/TaskBirdStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/wire/TaskBirdStatus;->OVERDUE:Lco/bird/android/model/wire/TaskBirdStatus;

    new-instance v0, Lco/bird/android/model/wire/TaskBirdStatus;

    const/4 v1, 0x1

    sget v2, LDf4;->greenish:I

    const-string v3, "DUE_FUTURE"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/wire/TaskBirdStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/wire/TaskBirdStatus;->DUE_FUTURE:Lco/bird/android/model/wire/TaskBirdStatus;

    invoke-static {}, Lco/bird/android/model/wire/TaskBirdStatus;->$values()[Lco/bird/android/model/wire/TaskBirdStatus;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/wire/TaskBirdStatus;->$VALUES:[Lco/bird/android/model/wire/TaskBirdStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lco/bird/android/model/wire/TaskBirdStatus;->color:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/wire/TaskBirdStatus;
    .locals 1

    const-class v0, Lco/bird/android/model/wire/TaskBirdStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/wire/TaskBirdStatus;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/wire/TaskBirdStatus;
    .locals 1

    sget-object v0, Lco/bird/android/model/wire/TaskBirdStatus;->$VALUES:[Lco/bird/android/model/wire/TaskBirdStatus;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/wire/TaskBirdStatus;

    return-object v0
.end method


# virtual methods
.method public final getColor()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/TaskBirdStatus;->color:I

    return v0
.end method
