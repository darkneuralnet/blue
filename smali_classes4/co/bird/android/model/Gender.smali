.class public final enum Lco/bird/android/model/Gender;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/Gender$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/Gender;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u0000 \u00052\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lco/bird/android/model/Gender;",
        "",
        "(Ljava/lang/String;I)V",
        "MALE",
        "FEMALE",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/Gender;

.field public static final Companion:Lco/bird/android/model/Gender$Companion;

.field public static final enum FEMALE:Lco/bird/android/model/Gender;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "female"
    .end annotation

    .annotation runtime Lft5;
        value = "female"
    .end annotation
.end field

.field public static final enum MALE:Lco/bird/android/model/Gender;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "male"
    .end annotation

    .annotation runtime Lft5;
        value = "male"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/Gender;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lco/bird/android/model/Gender;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/Gender;->MALE:Lco/bird/android/model/Gender;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/Gender;->FEMALE:Lco/bird/android/model/Gender;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/Gender;

    const-string v1, "MALE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/Gender;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/Gender;->MALE:Lco/bird/android/model/Gender;

    new-instance v0, Lco/bird/android/model/Gender;

    const-string v1, "FEMALE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/Gender;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/Gender;->FEMALE:Lco/bird/android/model/Gender;

    invoke-static {}, Lco/bird/android/model/Gender;->$values()[Lco/bird/android/model/Gender;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/Gender;->$VALUES:[Lco/bird/android/model/Gender;

    new-instance v0, Lco/bird/android/model/Gender$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/Gender$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/Gender;->Companion:Lco/bird/android/model/Gender$Companion;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/Gender;
    .locals 1

    const-class v0, Lco/bird/android/model/Gender;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/Gender;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/Gender;
    .locals 1

    sget-object v0, Lco/bird/android/model/Gender;->$VALUES:[Lco/bird/android/model/Gender;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/Gender;

    return-object v0
.end method
