.class public final enum Lcom/stripe/android/model/CvcCheck;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/CvcCheck$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/CvcCheck;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0087\u0001\u0018\u0000 \u00102\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/model/CvcCheck;",
        "",
        "code",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getCode",
        "()Ljava/lang/String;",
        "requiresRecollection",
        "",
        "getRequiresRecollection",
        "()Z",
        "Pass",
        "Fail",
        "Unavailable",
        "Unchecked",
        "Unknown",
        "Companion",
        "payments-model_release"
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/model/CvcCheck;

.field public static final Companion:Lcom/stripe/android/model/CvcCheck$Companion;

.field public static final enum Fail:Lcom/stripe/android/model/CvcCheck;

.field public static final enum Pass:Lcom/stripe/android/model/CvcCheck;

.field public static final enum Unavailable:Lcom/stripe/android/model/CvcCheck;

.field public static final enum Unchecked:Lcom/stripe/android/model/CvcCheck;

.field public static final enum Unknown:Lcom/stripe/android/model/CvcCheck;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/model/CvcCheck;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/stripe/android/model/CvcCheck;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/model/CvcCheck;->Pass:Lcom/stripe/android/model/CvcCheck;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/model/CvcCheck;->Fail:Lcom/stripe/android/model/CvcCheck;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/model/CvcCheck;->Unavailable:Lcom/stripe/android/model/CvcCheck;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/stripe/android/model/CvcCheck;->Unchecked:Lcom/stripe/android/model/CvcCheck;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/stripe/android/model/CvcCheck;->Unknown:Lcom/stripe/android/model/CvcCheck;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/model/CvcCheck;

    const/4 v1, 0x0

    const-string v2, "PASS"

    const-string v3, "Pass"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/CvcCheck;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/CvcCheck;->Pass:Lcom/stripe/android/model/CvcCheck;

    new-instance v0, Lcom/stripe/android/model/CvcCheck;

    const/4 v1, 0x1

    const-string v2, "FAIL"

    const-string v3, "Fail"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/CvcCheck;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/CvcCheck;->Fail:Lcom/stripe/android/model/CvcCheck;

    new-instance v0, Lcom/stripe/android/model/CvcCheck;

    const/4 v1, 0x2

    const-string v2, "UNAVAILABLE"

    const-string v3, "Unavailable"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/CvcCheck;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/CvcCheck;->Unavailable:Lcom/stripe/android/model/CvcCheck;

    new-instance v0, Lcom/stripe/android/model/CvcCheck;

    const/4 v1, 0x3

    const-string v2, "UNCHECKED"

    const-string v3, "Unchecked"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/CvcCheck;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/CvcCheck;->Unchecked:Lcom/stripe/android/model/CvcCheck;

    new-instance v0, Lcom/stripe/android/model/CvcCheck;

    const/4 v1, 0x4

    const-string v2, "UNKNOWN"

    const-string v3, "Unknown"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/CvcCheck;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/CvcCheck;->Unknown:Lcom/stripe/android/model/CvcCheck;

    invoke-static {}, Lcom/stripe/android/model/CvcCheck;->$values()[Lcom/stripe/android/model/CvcCheck;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/CvcCheck;->$VALUES:[Lcom/stripe/android/model/CvcCheck;

    new-instance v0, Lcom/stripe/android/model/CvcCheck$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/CvcCheck$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/CvcCheck;->Companion:Lcom/stripe/android/model/CvcCheck$Companion;

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

    iput-object p3, p0, Lcom/stripe/android/model/CvcCheck;->code:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/CvcCheck;
    .locals 1

    const-class v0, Lcom/stripe/android/model/CvcCheck;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/model/CvcCheck;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/CvcCheck;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/CvcCheck;->$VALUES:[Lcom/stripe/android/model/CvcCheck;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/model/CvcCheck;

    return-object v0
.end method


# virtual methods
.method public final getCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CvcCheck;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final getRequiresRecollection()Z
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/stripe/android/model/CvcCheck;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/model/CvcCheck;->Fail:Lcom/stripe/android/model/CvcCheck;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/model/CvcCheck;->Unavailable:Lcom/stripe/android/model/CvcCheck;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/model/CvcCheck;->Unchecked:Lcom/stripe/android/model/CvcCheck;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
