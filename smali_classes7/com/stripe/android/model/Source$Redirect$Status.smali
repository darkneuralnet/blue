.class public final enum Lcom/stripe/android/model/Source$Redirect$Status;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/Source$Redirect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Status"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/Source$Redirect$Status$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/Source$Redirect$Status;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0086\u0001\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/model/Source$Redirect$Status;",
        "",
        "code",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "toString",
        "Pending",
        "Succeeded",
        "NotRequired",
        "Failed",
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/model/Source$Redirect$Status;

.field public static final Companion:Lcom/stripe/android/model/Source$Redirect$Status$Companion;

.field public static final enum Failed:Lcom/stripe/android/model/Source$Redirect$Status;

.field public static final enum NotRequired:Lcom/stripe/android/model/Source$Redirect$Status;

.field public static final enum Pending:Lcom/stripe/android/model/Source$Redirect$Status;

.field public static final enum Succeeded:Lcom/stripe/android/model/Source$Redirect$Status;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/model/Source$Redirect$Status;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/stripe/android/model/Source$Redirect$Status;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/model/Source$Redirect$Status;->Pending:Lcom/stripe/android/model/Source$Redirect$Status;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/model/Source$Redirect$Status;->Succeeded:Lcom/stripe/android/model/Source$Redirect$Status;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/model/Source$Redirect$Status;->NotRequired:Lcom/stripe/android/model/Source$Redirect$Status;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/stripe/android/model/Source$Redirect$Status;->Failed:Lcom/stripe/android/model/Source$Redirect$Status;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/model/Source$Redirect$Status;

    const/4 v1, 0x0

    const-string v2, "pending"

    const-string v3, "Pending"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/Source$Redirect$Status;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/Source$Redirect$Status;->Pending:Lcom/stripe/android/model/Source$Redirect$Status;

    new-instance v0, Lcom/stripe/android/model/Source$Redirect$Status;

    const/4 v1, 0x1

    const-string v2, "succeeded"

    const-string v3, "Succeeded"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/Source$Redirect$Status;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/Source$Redirect$Status;->Succeeded:Lcom/stripe/android/model/Source$Redirect$Status;

    new-instance v0, Lcom/stripe/android/model/Source$Redirect$Status;

    const/4 v1, 0x2

    const-string v2, "not_required"

    const-string v3, "NotRequired"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/Source$Redirect$Status;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/Source$Redirect$Status;->NotRequired:Lcom/stripe/android/model/Source$Redirect$Status;

    new-instance v0, Lcom/stripe/android/model/Source$Redirect$Status;

    const/4 v1, 0x3

    const-string v2, "failed"

    const-string v3, "Failed"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/Source$Redirect$Status;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/Source$Redirect$Status;->Failed:Lcom/stripe/android/model/Source$Redirect$Status;

    invoke-static {}, Lcom/stripe/android/model/Source$Redirect$Status;->$values()[Lcom/stripe/android/model/Source$Redirect$Status;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/Source$Redirect$Status;->$VALUES:[Lcom/stripe/android/model/Source$Redirect$Status;

    new-instance v0, Lcom/stripe/android/model/Source$Redirect$Status$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/Source$Redirect$Status$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/Source$Redirect$Status;->Companion:Lcom/stripe/android/model/Source$Redirect$Status$Companion;

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

    iput-object p3, p0, Lcom/stripe/android/model/Source$Redirect$Status;->code:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getCode$p(Lcom/stripe/android/model/Source$Redirect$Status;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/model/Source$Redirect$Status;->code:Ljava/lang/String;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/Source$Redirect$Status;
    .locals 1

    const-class v0, Lcom/stripe/android/model/Source$Redirect$Status;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/model/Source$Redirect$Status;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/Source$Redirect$Status;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/Source$Redirect$Status;->$VALUES:[Lcom/stripe/android/model/Source$Redirect$Status;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/model/Source$Redirect$Status;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source$Redirect$Status;->code:Ljava/lang/String;

    return-object v0
.end method
