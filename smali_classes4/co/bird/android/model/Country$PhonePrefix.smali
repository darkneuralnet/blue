.class public final enum Lco/bird/android/model/Country$PhonePrefix;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/Country;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PhonePrefix"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/Country$PhonePrefix;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/model/Country$PhonePrefix;",
        "",
        "resourceId",
        "",
        "(Ljava/lang/String;II)V",
        "getResourceId",
        "()I",
        "FRANCE",
        "ISRAEL",
        "US",
        "MEXICO",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/Country$PhonePrefix;

.field public static final enum FRANCE:Lco/bird/android/model/Country$PhonePrefix;

.field public static final enum ISRAEL:Lco/bird/android/model/Country$PhonePrefix;

.field public static final enum MEXICO:Lco/bird/android/model/Country$PhonePrefix;

.field public static final enum US:Lco/bird/android/model/Country$PhonePrefix;


# instance fields
.field private final resourceId:I


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/Country$PhonePrefix;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lco/bird/android/model/Country$PhonePrefix;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/Country$PhonePrefix;->FRANCE:Lco/bird/android/model/Country$PhonePrefix;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/Country$PhonePrefix;->ISRAEL:Lco/bird/android/model/Country$PhonePrefix;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/Country$PhonePrefix;->US:Lco/bird/android/model/Country$PhonePrefix;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/Country$PhonePrefix;->MEXICO:Lco/bird/android/model/Country$PhonePrefix;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lco/bird/android/model/Country$PhonePrefix;

    const/4 v1, 0x0

    sget v2, Lco/bird/android/model/R$string;->france_phone_prefix:I

    const-string v3, "FRANCE"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/Country$PhonePrefix;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/Country$PhonePrefix;->FRANCE:Lco/bird/android/model/Country$PhonePrefix;

    new-instance v0, Lco/bird/android/model/Country$PhonePrefix;

    const/4 v1, 0x1

    sget v2, Lco/bird/android/model/R$string;->israel_phone_prefix:I

    const-string v3, "ISRAEL"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/Country$PhonePrefix;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/Country$PhonePrefix;->ISRAEL:Lco/bird/android/model/Country$PhonePrefix;

    new-instance v0, Lco/bird/android/model/Country$PhonePrefix;

    const/4 v1, 0x2

    sget v2, Lco/bird/android/model/R$string;->us_phone_prefix:I

    const-string v3, "US"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/Country$PhonePrefix;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/Country$PhonePrefix;->US:Lco/bird/android/model/Country$PhonePrefix;

    new-instance v0, Lco/bird/android/model/Country$PhonePrefix;

    const/4 v1, 0x3

    sget v2, Lco/bird/android/model/R$string;->mexico_phone_prefix:I

    const-string v3, "MEXICO"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/model/Country$PhonePrefix;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/model/Country$PhonePrefix;->MEXICO:Lco/bird/android/model/Country$PhonePrefix;

    invoke-static {}, Lco/bird/android/model/Country$PhonePrefix;->$values()[Lco/bird/android/model/Country$PhonePrefix;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/Country$PhonePrefix;->$VALUES:[Lco/bird/android/model/Country$PhonePrefix;

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

    iput p3, p0, Lco/bird/android/model/Country$PhonePrefix;->resourceId:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/Country$PhonePrefix;
    .locals 1

    const-class v0, Lco/bird/android/model/Country$PhonePrefix;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/Country$PhonePrefix;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/Country$PhonePrefix;
    .locals 1

    sget-object v0, Lco/bird/android/model/Country$PhonePrefix;->$VALUES:[Lco/bird/android/model/Country$PhonePrefix;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/Country$PhonePrefix;

    return-object v0
.end method


# virtual methods
.method public final getResourceId()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/Country$PhonePrefix;->resourceId:I

    return v0
.end method
