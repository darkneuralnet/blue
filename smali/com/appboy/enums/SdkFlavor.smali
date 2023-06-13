.class public final enum Lcom/appboy/enums/SdkFlavor;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LaP1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appboy/enums/SdkFlavor;",
        ">;",
        "LaP1<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0008\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/appboy/enums/SdkFlavor;",
        "",
        "LaP1;",
        "",
        "forJsonPut",
        "jsonKey",
        "Ljava/lang/String;",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "UNITY",
        "REACT",
        "CORDOVA",
        "XAMARIN",
        "FLUTTER",
        "SEGMENT",
        "TEALIUM",
        "MPARTICLE",
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
.field private static final synthetic $VALUES:[Lcom/appboy/enums/SdkFlavor;

.field public static final enum CORDOVA:Lcom/appboy/enums/SdkFlavor;

.field public static final enum FLUTTER:Lcom/appboy/enums/SdkFlavor;

.field public static final enum MPARTICLE:Lcom/appboy/enums/SdkFlavor;

.field public static final enum REACT:Lcom/appboy/enums/SdkFlavor;

.field public static final enum SEGMENT:Lcom/appboy/enums/SdkFlavor;

.field public static final enum TEALIUM:Lcom/appboy/enums/SdkFlavor;

.field public static final enum UNITY:Lcom/appboy/enums/SdkFlavor;

.field public static final enum XAMARIN:Lcom/appboy/enums/SdkFlavor;


# instance fields
.field private final jsonKey:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/appboy/enums/SdkFlavor;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Lcom/appboy/enums/SdkFlavor;

    sget-object v1, Lcom/appboy/enums/SdkFlavor;->UNITY:Lcom/appboy/enums/SdkFlavor;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/appboy/enums/SdkFlavor;->REACT:Lcom/appboy/enums/SdkFlavor;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/appboy/enums/SdkFlavor;->CORDOVA:Lcom/appboy/enums/SdkFlavor;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/appboy/enums/SdkFlavor;->XAMARIN:Lcom/appboy/enums/SdkFlavor;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/appboy/enums/SdkFlavor;->FLUTTER:Lcom/appboy/enums/SdkFlavor;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/appboy/enums/SdkFlavor;->SEGMENT:Lcom/appboy/enums/SdkFlavor;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/appboy/enums/SdkFlavor;->TEALIUM:Lcom/appboy/enums/SdkFlavor;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/appboy/enums/SdkFlavor;->MPARTICLE:Lcom/appboy/enums/SdkFlavor;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/appboy/enums/SdkFlavor;

    const/4 v1, 0x0

    const-string v2, "unity"

    const-string v3, "UNITY"

    invoke-direct {v0, v3, v1, v2}, Lcom/appboy/enums/SdkFlavor;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appboy/enums/SdkFlavor;->UNITY:Lcom/appboy/enums/SdkFlavor;

    new-instance v0, Lcom/appboy/enums/SdkFlavor;

    const/4 v1, 0x1

    const-string v2, "react"

    const-string v3, "REACT"

    invoke-direct {v0, v3, v1, v2}, Lcom/appboy/enums/SdkFlavor;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appboy/enums/SdkFlavor;->REACT:Lcom/appboy/enums/SdkFlavor;

    new-instance v0, Lcom/appboy/enums/SdkFlavor;

    const/4 v1, 0x2

    const-string v2, "cordova"

    const-string v3, "CORDOVA"

    invoke-direct {v0, v3, v1, v2}, Lcom/appboy/enums/SdkFlavor;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appboy/enums/SdkFlavor;->CORDOVA:Lcom/appboy/enums/SdkFlavor;

    new-instance v0, Lcom/appboy/enums/SdkFlavor;

    const/4 v1, 0x3

    const-string v2, "xamarin"

    const-string v3, "XAMARIN"

    invoke-direct {v0, v3, v1, v2}, Lcom/appboy/enums/SdkFlavor;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appboy/enums/SdkFlavor;->XAMARIN:Lcom/appboy/enums/SdkFlavor;

    new-instance v0, Lcom/appboy/enums/SdkFlavor;

    const/4 v1, 0x4

    const-string v2, "flutter"

    const-string v3, "FLUTTER"

    invoke-direct {v0, v3, v1, v2}, Lcom/appboy/enums/SdkFlavor;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appboy/enums/SdkFlavor;->FLUTTER:Lcom/appboy/enums/SdkFlavor;

    new-instance v0, Lcom/appboy/enums/SdkFlavor;

    const/4 v1, 0x5

    const-string v2, "segment"

    const-string v3, "SEGMENT"

    invoke-direct {v0, v3, v1, v2}, Lcom/appboy/enums/SdkFlavor;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appboy/enums/SdkFlavor;->SEGMENT:Lcom/appboy/enums/SdkFlavor;

    new-instance v0, Lcom/appboy/enums/SdkFlavor;

    const/4 v1, 0x6

    const-string v2, "tealium"

    const-string v3, "TEALIUM"

    invoke-direct {v0, v3, v1, v2}, Lcom/appboy/enums/SdkFlavor;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appboy/enums/SdkFlavor;->TEALIUM:Lcom/appboy/enums/SdkFlavor;

    new-instance v0, Lcom/appboy/enums/SdkFlavor;

    const/4 v1, 0x7

    const-string v2, "mparticle"

    const-string v3, "MPARTICLE"

    invoke-direct {v0, v3, v1, v2}, Lcom/appboy/enums/SdkFlavor;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appboy/enums/SdkFlavor;->MPARTICLE:Lcom/appboy/enums/SdkFlavor;

    invoke-static {}, Lcom/appboy/enums/SdkFlavor;->$values()[Lcom/appboy/enums/SdkFlavor;

    move-result-object v0

    sput-object v0, Lcom/appboy/enums/SdkFlavor;->$VALUES:[Lcom/appboy/enums/SdkFlavor;

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

    iput-object p3, p0, Lcom/appboy/enums/SdkFlavor;->jsonKey:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appboy/enums/SdkFlavor;
    .locals 1

    const-class v0, Lcom/appboy/enums/SdkFlavor;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/appboy/enums/SdkFlavor;

    return-object p0
.end method

.method public static values()[Lcom/appboy/enums/SdkFlavor;
    .locals 1

    sget-object v0, Lcom/appboy/enums/SdkFlavor;->$VALUES:[Lcom/appboy/enums/SdkFlavor;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/appboy/enums/SdkFlavor;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic forJsonPut()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/appboy/enums/SdkFlavor;->forJsonPut()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public forJsonPut()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appboy/enums/SdkFlavor;->jsonKey:Ljava/lang/String;

    return-object v0
.end method
