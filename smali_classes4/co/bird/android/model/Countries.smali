.class public final enum Lco/bird/android/model/Countries;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/Countries;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\u0008\u0002\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lco/bird/android/model/Countries;",
        "",
        "countries",
        "",
        "",
        "(Ljava/lang/String;ILjava/util/Set;)V",
        "getCountries",
        "()Ljava/util/Set;",
        "ALL",
        "EUROPE",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/Countries;

.field public static final enum ALL:Lco/bird/android/model/Countries;

.field public static final enum EUROPE:Lco/bird/android/model/Countries;


# instance fields
.field private final countries:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/Countries;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lco/bird/android/model/Countries;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/Countries;->ALL:Lco/bird/android/model/Countries;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/Countries;->EUROPE:Lco/bird/android/model/Countries;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 34

    new-instance v0, Lco/bird/android/model/Countries;

    invoke-static {}, Ljava/util/Locale;->getISOCountries()[Ljava/lang/String;

    move-result-object v1

    const-string v2, "getISOCountries()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lkotlin/collections/ArraysKt;->toSet([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    const-string v2, "ALL"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Countries;-><init>(Ljava/lang/String;ILjava/util/Set;)V

    sput-object v0, Lco/bird/android/model/Countries;->ALL:Lco/bird/android/model/Countries;

    new-instance v0, Lco/bird/android/model/Countries;

    const-string v1, "AT"

    const-string v2, "BE"

    const-string v3, "BR"

    const-string v4, "BG"

    const-string v5, "HR"

    const-string v6, "CY"

    const-string v7, "CZ"

    const-string v8, "DK"

    const-string v9, "EE"

    const-string v10, "FI"

    const-string v11, "FR"

    const-string v12, "DE"

    const-string v13, "GR"

    const-string v14, "HU"

    const-string v15, "IS"

    const-string v16, "IE"

    const-string v17, "IT"

    const-string v18, "LV"

    const-string v19, "LI"

    const-string v20, "LT"

    const-string v21, "LU"

    const-string v22, "MT"

    const-string v23, "NL"

    const-string v24, "NO"

    const-string v25, "PL"

    const-string v26, "PT"

    const-string v27, "RO"

    const-string v28, "SK"

    const-string v29, "SI"

    const-string v30, "ES"

    const-string v31, "SE"

    const-string v32, "CH"

    const-string v33, "GB"

    filled-new-array/range {v1 .. v33}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    const-string v2, "EUROPE"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/Countries;-><init>(Ljava/lang/String;ILjava/util/Set;)V

    sput-object v0, Lco/bird/android/model/Countries;->EUROPE:Lco/bird/android/model/Countries;

    invoke-static {}, Lco/bird/android/model/Countries;->$values()[Lco/bird/android/model/Countries;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/Countries;->$VALUES:[Lco/bird/android/model/Countries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lco/bird/android/model/Countries;->countries:Ljava/util/Set;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/Countries;
    .locals 1

    const-class v0, Lco/bird/android/model/Countries;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/Countries;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/Countries;
    .locals 1

    sget-object v0, Lco/bird/android/model/Countries;->$VALUES:[Lco/bird/android/model/Countries;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/Countries;

    return-object v0
.end method


# virtual methods
.method public final getCountries()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/Countries;->countries:Ljava/util/Set;

    return-object v0
.end method
