.class public final enum Lco/bird/android/model/ridertutorial/TutorialKind;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/ridertutorial/TutorialKind$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/ridertutorial/TutorialKind;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0086\u0001\u0018\u0000 \u000e2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lco/bird/android/model/ridertutorial/TutorialKind;",
        "",
        "(Ljava/lang/String;I)V",
        "toString",
        "",
        "CONTEXTUAL_M365",
        "CONTEXTUAL_ES",
        "CONTEXTUAL_BC",
        "CONTEXTUAL_B2",
        "CONTEXTUAL_B3",
        "CLASS_MOPED",
        "CLASS_MOPED_PARKING",
        "CLASS_SCOOTER",
        "CLASS_SCOOTER_PARKING",
        "Companion",
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


# static fields
.field private static final synthetic $VALUES:[Lco/bird/android/model/ridertutorial/TutorialKind;

.field public static final enum CLASS_MOPED:Lco/bird/android/model/ridertutorial/TutorialKind;

.field public static final enum CLASS_MOPED_PARKING:Lco/bird/android/model/ridertutorial/TutorialKind;

.field public static final enum CLASS_SCOOTER:Lco/bird/android/model/ridertutorial/TutorialKind;

.field public static final enum CLASS_SCOOTER_PARKING:Lco/bird/android/model/ridertutorial/TutorialKind;

.field public static final enum CONTEXTUAL_B2:Lco/bird/android/model/ridertutorial/TutorialKind;

.field public static final enum CONTEXTUAL_B3:Lco/bird/android/model/ridertutorial/TutorialKind;

.field public static final enum CONTEXTUAL_BC:Lco/bird/android/model/ridertutorial/TutorialKind;

.field public static final enum CONTEXTUAL_ES:Lco/bird/android/model/ridertutorial/TutorialKind;

.field public static final enum CONTEXTUAL_M365:Lco/bird/android/model/ridertutorial/TutorialKind;

.field public static final Companion:Lco/bird/android/model/ridertutorial/TutorialKind$Companion;

.field private static final all:[Lco/bird/android/model/ridertutorial/TutorialKind;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/ridertutorial/TutorialKind;
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [Lco/bird/android/model/ridertutorial/TutorialKind;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/ridertutorial/TutorialKind;->CONTEXTUAL_M365:Lco/bird/android/model/ridertutorial/TutorialKind;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/ridertutorial/TutorialKind;->CONTEXTUAL_ES:Lco/bird/android/model/ridertutorial/TutorialKind;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/ridertutorial/TutorialKind;->CONTEXTUAL_BC:Lco/bird/android/model/ridertutorial/TutorialKind;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/ridertutorial/TutorialKind;->CONTEXTUAL_B2:Lco/bird/android/model/ridertutorial/TutorialKind;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/ridertutorial/TutorialKind;->CONTEXTUAL_B3:Lco/bird/android/model/ridertutorial/TutorialKind;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/ridertutorial/TutorialKind;->CLASS_MOPED:Lco/bird/android/model/ridertutorial/TutorialKind;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/ridertutorial/TutorialKind;->CLASS_MOPED_PARKING:Lco/bird/android/model/ridertutorial/TutorialKind;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/ridertutorial/TutorialKind;->CLASS_SCOOTER:Lco/bird/android/model/ridertutorial/TutorialKind;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/ridertutorial/TutorialKind;->CLASS_SCOOTER_PARKING:Lco/bird/android/model/ridertutorial/TutorialKind;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/ridertutorial/TutorialKind;

    const-string v1, "CONTEXTUAL_M365"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/ridertutorial/TutorialKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/ridertutorial/TutorialKind;->CONTEXTUAL_M365:Lco/bird/android/model/ridertutorial/TutorialKind;

    new-instance v0, Lco/bird/android/model/ridertutorial/TutorialKind;

    const-string v1, "CONTEXTUAL_ES"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/ridertutorial/TutorialKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/ridertutorial/TutorialKind;->CONTEXTUAL_ES:Lco/bird/android/model/ridertutorial/TutorialKind;

    new-instance v0, Lco/bird/android/model/ridertutorial/TutorialKind;

    const-string v1, "CONTEXTUAL_BC"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/ridertutorial/TutorialKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/ridertutorial/TutorialKind;->CONTEXTUAL_BC:Lco/bird/android/model/ridertutorial/TutorialKind;

    new-instance v0, Lco/bird/android/model/ridertutorial/TutorialKind;

    const-string v1, "CONTEXTUAL_B2"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/ridertutorial/TutorialKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/ridertutorial/TutorialKind;->CONTEXTUAL_B2:Lco/bird/android/model/ridertutorial/TutorialKind;

    new-instance v0, Lco/bird/android/model/ridertutorial/TutorialKind;

    const-string v1, "CONTEXTUAL_B3"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/ridertutorial/TutorialKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/ridertutorial/TutorialKind;->CONTEXTUAL_B3:Lco/bird/android/model/ridertutorial/TutorialKind;

    new-instance v0, Lco/bird/android/model/ridertutorial/TutorialKind;

    const-string v1, "CLASS_MOPED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/ridertutorial/TutorialKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/ridertutorial/TutorialKind;->CLASS_MOPED:Lco/bird/android/model/ridertutorial/TutorialKind;

    new-instance v0, Lco/bird/android/model/ridertutorial/TutorialKind;

    const-string v1, "CLASS_MOPED_PARKING"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/ridertutorial/TutorialKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/ridertutorial/TutorialKind;->CLASS_MOPED_PARKING:Lco/bird/android/model/ridertutorial/TutorialKind;

    new-instance v0, Lco/bird/android/model/ridertutorial/TutorialKind;

    const-string v1, "CLASS_SCOOTER"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/ridertutorial/TutorialKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/ridertutorial/TutorialKind;->CLASS_SCOOTER:Lco/bird/android/model/ridertutorial/TutorialKind;

    new-instance v0, Lco/bird/android/model/ridertutorial/TutorialKind;

    const-string v1, "CLASS_SCOOTER_PARKING"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/ridertutorial/TutorialKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/ridertutorial/TutorialKind;->CLASS_SCOOTER_PARKING:Lco/bird/android/model/ridertutorial/TutorialKind;

    invoke-static {}, Lco/bird/android/model/ridertutorial/TutorialKind;->$values()[Lco/bird/android/model/ridertutorial/TutorialKind;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/ridertutorial/TutorialKind;->$VALUES:[Lco/bird/android/model/ridertutorial/TutorialKind;

    new-instance v0, Lco/bird/android/model/ridertutorial/TutorialKind$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/ridertutorial/TutorialKind$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/ridertutorial/TutorialKind;->Companion:Lco/bird/android/model/ridertutorial/TutorialKind$Companion;

    invoke-static {}, Lco/bird/android/model/ridertutorial/TutorialKind;->values()[Lco/bird/android/model/ridertutorial/TutorialKind;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/ridertutorial/TutorialKind;->all:[Lco/bird/android/model/ridertutorial/TutorialKind;

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

.method public static final synthetic access$getAll$cp()[Lco/bird/android/model/ridertutorial/TutorialKind;
    .locals 1

    sget-object v0, Lco/bird/android/model/ridertutorial/TutorialKind;->all:[Lco/bird/android/model/ridertutorial/TutorialKind;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/ridertutorial/TutorialKind;
    .locals 1

    const-class v0, Lco/bird/android/model/ridertutorial/TutorialKind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/ridertutorial/TutorialKind;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/ridertutorial/TutorialKind;
    .locals 1

    sget-object v0, Lco/bird/android/model/ridertutorial/TutorialKind;->$VALUES:[Lco/bird/android/model/ridertutorial/TutorialKind;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/ridertutorial/TutorialKind;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toLowerCase()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
