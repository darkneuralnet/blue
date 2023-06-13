.class public final enum Lcom/appboy/enums/Gender;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LaP1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appboy/enums/Gender$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appboy/enums/Gender;",
        ">;",
        "LaP1<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000f\u0008\u0087\u0001\u0018\u0000 \u000b2\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u000bB\u0011\u0008\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0008\u0010\u0004\u001a\u00020\u0003H\u0016R\u0017\u0010\u0005\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/appboy/enums/Gender;",
        "",
        "LaP1;",
        "",
        "forJsonPut",
        "value",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Companion",
        "MALE",
        "FEMALE",
        "OTHER",
        "UNKNOWN",
        "NOT_APPLICABLE",
        "PREFER_NOT_TO_SAY",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/appboy/enums/Gender;

.field public static final Companion:Lcom/appboy/enums/Gender$Companion;

.field public static final enum FEMALE:Lcom/appboy/enums/Gender;

.field public static final enum MALE:Lcom/appboy/enums/Gender;

.field public static final enum NOT_APPLICABLE:Lcom/appboy/enums/Gender;

.field public static final enum OTHER:Lcom/appboy/enums/Gender;

.field public static final enum PREFER_NOT_TO_SAY:Lcom/appboy/enums/Gender;

.field public static final enum UNKNOWN:Lcom/appboy/enums/Gender;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/appboy/enums/Gender;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/appboy/enums/Gender;

    sget-object v1, Lcom/appboy/enums/Gender;->MALE:Lcom/appboy/enums/Gender;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/appboy/enums/Gender;->FEMALE:Lcom/appboy/enums/Gender;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/appboy/enums/Gender;->OTHER:Lcom/appboy/enums/Gender;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/appboy/enums/Gender;->UNKNOWN:Lcom/appboy/enums/Gender;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/appboy/enums/Gender;->NOT_APPLICABLE:Lcom/appboy/enums/Gender;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/appboy/enums/Gender;->PREFER_NOT_TO_SAY:Lcom/appboy/enums/Gender;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/appboy/enums/Gender;

    const/4 v1, 0x0

    const-string v2, "m"

    const-string v3, "MALE"

    invoke-direct {v0, v3, v1, v2}, Lcom/appboy/enums/Gender;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appboy/enums/Gender;->MALE:Lcom/appboy/enums/Gender;

    new-instance v0, Lcom/appboy/enums/Gender;

    const/4 v1, 0x1

    const-string v2, "f"

    const-string v3, "FEMALE"

    invoke-direct {v0, v3, v1, v2}, Lcom/appboy/enums/Gender;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appboy/enums/Gender;->FEMALE:Lcom/appboy/enums/Gender;

    new-instance v0, Lcom/appboy/enums/Gender;

    const/4 v1, 0x2

    const-string v2, "o"

    const-string v3, "OTHER"

    invoke-direct {v0, v3, v1, v2}, Lcom/appboy/enums/Gender;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appboy/enums/Gender;->OTHER:Lcom/appboy/enums/Gender;

    new-instance v0, Lcom/appboy/enums/Gender;

    const/4 v1, 0x3

    const-string v2, "u"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lcom/appboy/enums/Gender;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appboy/enums/Gender;->UNKNOWN:Lcom/appboy/enums/Gender;

    new-instance v0, Lcom/appboy/enums/Gender;

    const/4 v1, 0x4

    const-string v2, "n"

    const-string v3, "NOT_APPLICABLE"

    invoke-direct {v0, v3, v1, v2}, Lcom/appboy/enums/Gender;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appboy/enums/Gender;->NOT_APPLICABLE:Lcom/appboy/enums/Gender;

    new-instance v0, Lcom/appboy/enums/Gender;

    const/4 v1, 0x5

    const-string v2, "p"

    const-string v3, "PREFER_NOT_TO_SAY"

    invoke-direct {v0, v3, v1, v2}, Lcom/appboy/enums/Gender;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appboy/enums/Gender;->PREFER_NOT_TO_SAY:Lcom/appboy/enums/Gender;

    invoke-static {}, Lcom/appboy/enums/Gender;->$values()[Lcom/appboy/enums/Gender;

    move-result-object v0

    sput-object v0, Lcom/appboy/enums/Gender;->$VALUES:[Lcom/appboy/enums/Gender;

    new-instance v0, Lcom/appboy/enums/Gender$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/appboy/enums/Gender$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/appboy/enums/Gender;->Companion:Lcom/appboy/enums/Gender$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/appboy/enums/Gender;->value:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appboy/enums/Gender;
    .locals 1

    const-class v0, Lcom/appboy/enums/Gender;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/appboy/enums/Gender;

    return-object p0
.end method

.method public static values()[Lcom/appboy/enums/Gender;
    .locals 1

    sget-object v0, Lcom/appboy/enums/Gender;->$VALUES:[Lcom/appboy/enums/Gender;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/appboy/enums/Gender;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic forJsonPut()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/appboy/enums/Gender;->forJsonPut()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public forJsonPut()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appboy/enums/Gender;->value:Ljava/lang/String;

    return-object v0
.end method
