.class public final enum Lcom/stripe/android/stripe3ds2/init/Warning$Severity;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/stripe3ds2/init/Warning;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Severity"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/stripe3ds2/init/Warning$Severity;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/init/Warning$Severity;",
        "",
        "(Ljava/lang/String;I)V",
        "LOW",
        "MEDIUM",
        "HIGH",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/stripe/android/stripe3ds2/init/Warning$Severity;

.field public static final enum HIGH:Lcom/stripe/android/stripe3ds2/init/Warning$Severity;

.field public static final enum LOW:Lcom/stripe/android/stripe3ds2/init/Warning$Severity;

.field public static final enum MEDIUM:Lcom/stripe/android/stripe3ds2/init/Warning$Severity;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/stripe3ds2/init/Warning$Severity;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/stripe/android/stripe3ds2/init/Warning$Severity;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/Warning$Severity;->LOW:Lcom/stripe/android/stripe3ds2/init/Warning$Severity;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/Warning$Severity;->MEDIUM:Lcom/stripe/android/stripe3ds2/init/Warning$Severity;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/Warning$Severity;->HIGH:Lcom/stripe/android/stripe3ds2/init/Warning$Severity;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/Warning$Severity;

    const-string v1, "LOW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/stripe3ds2/init/Warning$Severity;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/Warning$Severity;->LOW:Lcom/stripe/android/stripe3ds2/init/Warning$Severity;

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/Warning$Severity;

    const-string v1, "MEDIUM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/stripe3ds2/init/Warning$Severity;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/Warning$Severity;->MEDIUM:Lcom/stripe/android/stripe3ds2/init/Warning$Severity;

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/Warning$Severity;

    const-string v1, "HIGH"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/stripe3ds2/init/Warning$Severity;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/Warning$Severity;->HIGH:Lcom/stripe/android/stripe3ds2/init/Warning$Severity;

    invoke-static {}, Lcom/stripe/android/stripe3ds2/init/Warning$Severity;->$values()[Lcom/stripe/android/stripe3ds2/init/Warning$Severity;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/Warning$Severity;->$VALUES:[Lcom/stripe/android/stripe3ds2/init/Warning$Severity;

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

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/init/Warning$Severity;
    .locals 1

    const-class v0, Lcom/stripe/android/stripe3ds2/init/Warning$Severity;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/stripe3ds2/init/Warning$Severity;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/stripe3ds2/init/Warning$Severity;
    .locals 1

    sget-object v0, Lcom/stripe/android/stripe3ds2/init/Warning$Severity;->$VALUES:[Lcom/stripe/android/stripe3ds2/init/Warning$Severity;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/stripe3ds2/init/Warning$Severity;

    return-object v0
.end method
