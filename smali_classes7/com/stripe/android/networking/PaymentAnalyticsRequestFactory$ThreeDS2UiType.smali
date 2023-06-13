.class public final enum Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ThreeDS2UiType"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0080\u0001\u0018\u0000 \r2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0019\u0008\u0002\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\u0006\u001a\u00020\u0003H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;",
        "",
        "code",
        "",
        "typeName",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "toString",
        "None",
        "Text",
        "SingleSelect",
        "MultiSelect",
        "Oob",
        "Html",
        "Companion",
        "payments-core_release"
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

.field public static final Companion:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType$Companion;

.field public static final enum Html:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

.field public static final enum MultiSelect:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

.field public static final enum None:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

.field public static final enum Oob:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

.field public static final enum SingleSelect:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

.field public static final enum Text:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;


# instance fields
.field private final code:Ljava/lang/String;

.field private final typeName:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->None:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->Text:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->SingleSelect:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->MultiSelect:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->Oob:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->Html:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    const-string v1, "none"

    const-string v2, "None"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->None:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    const-string v1, "01"

    const-string v2, "text"

    const-string v3, "Text"

    const/4 v5, 0x1

    invoke-direct {v0, v3, v5, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->Text:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    const-string v1, "02"

    const-string v2, "single_select"

    const-string v3, "SingleSelect"

    const/4 v5, 0x2

    invoke-direct {v0, v3, v5, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->SingleSelect:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    const-string v1, "03"

    const-string v2, "multi_select"

    const-string v3, "MultiSelect"

    const/4 v5, 0x3

    invoke-direct {v0, v3, v5, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->MultiSelect:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    const-string v1, "04"

    const-string v2, "oob"

    const-string v3, "Oob"

    const/4 v5, 0x4

    invoke-direct {v0, v3, v5, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->Oob:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    const-string v1, "05"

    const-string v2, "html"

    const-string v3, "Html"

    const/4 v5, 0x5

    invoke-direct {v0, v3, v5, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->Html:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    invoke-static {}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->$values()[Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->$VALUES:[Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType$Companion;

    invoke-direct {v0, v4}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->Companion:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->code:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->typeName:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getCode$p(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->code:Ljava/lang/String;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;
    .locals 1

    const-class v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;
    .locals 1

    sget-object v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->$VALUES:[Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;->typeName:Ljava/lang/String;

    return-object v0
.end method
