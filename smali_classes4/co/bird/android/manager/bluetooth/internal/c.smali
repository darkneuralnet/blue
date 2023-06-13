.class public final enum Lco/bird/android/manager/bluetooth/internal/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/manager/bluetooth/internal/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/manager/bluetooth/internal/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0013\u0008\u0086\u0001\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lco/bird/android/manager/bluetooth/internal/c;",
        "",
        "",
        "b",
        "I",
        "()I",
        "status",
        "<init>",
        "(Ljava/lang/String;II)V",
        "c",
        "a",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
        "m",
        "n",
        "bluetooth_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final c:Lco/bird/android/manager/bluetooth/internal/c$a;

.field public static final d:[Lco/bird/android/manager/bluetooth/internal/c;

.field public static final enum e:Lco/bird/android/manager/bluetooth/internal/c;

.field public static final enum f:Lco/bird/android/manager/bluetooth/internal/c;

.field public static final enum g:Lco/bird/android/manager/bluetooth/internal/c;

.field public static final enum h:Lco/bird/android/manager/bluetooth/internal/c;

.field public static final enum i:Lco/bird/android/manager/bluetooth/internal/c;

.field public static final enum j:Lco/bird/android/manager/bluetooth/internal/c;

.field public static final enum k:Lco/bird/android/manager/bluetooth/internal/c;

.field public static final enum l:Lco/bird/android/manager/bluetooth/internal/c;

.field public static final enum m:Lco/bird/android/manager/bluetooth/internal/c;

.field public static final enum n:Lco/bird/android/manager/bluetooth/internal/c;

.field public static final synthetic o:[Lco/bird/android/manager/bluetooth/internal/c;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/c;

    const-string v1, "GATT_READ_NOT_PERMITTED"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lco/bird/android/manager/bluetooth/internal/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/c;->e:Lco/bird/android/manager/bluetooth/internal/c;

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/c;

    const-string v1, "GATT_WRITE_NOT_PERMITTED"

    const/4 v2, 0x1

    const/4 v4, 0x3

    invoke-direct {v0, v1, v2, v4}, Lco/bird/android/manager/bluetooth/internal/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/c;->f:Lco/bird/android/manager/bluetooth/internal/c;

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/c;

    const-string v1, "GATT_INSUFFICIENT_AUTHENTICATION"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v3, v2}, Lco/bird/android/manager/bluetooth/internal/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/c;->g:Lco/bird/android/manager/bluetooth/internal/c;

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/c;

    const-string v1, "GATT_REQUEST_NOT_SUPPORTED"

    const/4 v3, 0x6

    invoke-direct {v0, v1, v4, v3}, Lco/bird/android/manager/bluetooth/internal/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/c;->h:Lco/bird/android/manager/bluetooth/internal/c;

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/c;

    const/4 v1, 0x4

    const/16 v4, 0xf

    const-string v5, "GATT_INSUFFICIENT_ENCRYPTION"

    invoke-direct {v0, v5, v1, v4}, Lco/bird/android/manager/bluetooth/internal/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/c;->i:Lco/bird/android/manager/bluetooth/internal/c;

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/c;

    const-string v1, "GATT_INVALID_OFFSET"

    const/4 v4, 0x7

    invoke-direct {v0, v1, v2, v4}, Lco/bird/android/manager/bluetooth/internal/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/c;->j:Lco/bird/android/manager/bluetooth/internal/c;

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/c;

    const-string v1, "GATT_INVALID_ATTRIBUTE_LENGTH"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v3, v2}, Lco/bird/android/manager/bluetooth/internal/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/c;->k:Lco/bird/android/manager/bluetooth/internal/c;

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/c;

    const-string v1, "GATT_CONNECTION_CONGESTED"

    const/16 v2, 0x8f

    invoke-direct {v0, v1, v4, v2}, Lco/bird/android/manager/bluetooth/internal/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/c;->l:Lco/bird/android/manager/bluetooth/internal/c;

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/c;

    const/16 v1, 0x8

    const/16 v2, 0x101

    const-string v3, "GATT_FAILURE"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/manager/bluetooth/internal/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/c;->m:Lco/bird/android/manager/bluetooth/internal/c;

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/c;

    const/16 v1, 0x9

    const/4 v2, -0x1

    const-string v3, "GATT_UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/manager/bluetooth/internal/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/c;->n:Lco/bird/android/manager/bluetooth/internal/c;

    invoke-static {}, Lco/bird/android/manager/bluetooth/internal/c;->a()[Lco/bird/android/manager/bluetooth/internal/c;

    move-result-object v0

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/c;->o:[Lco/bird/android/manager/bluetooth/internal/c;

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/manager/bluetooth/internal/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/c;->c:Lco/bird/android/manager/bluetooth/internal/c$a;

    invoke-static {}, Lco/bird/android/manager/bluetooth/internal/c;->values()[Lco/bird/android/manager/bluetooth/internal/c;

    move-result-object v0

    sput-object v0, Lco/bird/android/manager/bluetooth/internal/c;->d:[Lco/bird/android/manager/bluetooth/internal/c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lco/bird/android/manager/bluetooth/internal/c;->b:I

    return-void
.end method

.method public static final synthetic a()[Lco/bird/android/manager/bluetooth/internal/c;
    .locals 3

    const/16 v0, 0xa

    new-array v0, v0, [Lco/bird/android/manager/bluetooth/internal/c;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/c;->e:Lco/bird/android/manager/bluetooth/internal/c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/c;->f:Lco/bird/android/manager/bluetooth/internal/c;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/c;->g:Lco/bird/android/manager/bluetooth/internal/c;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/c;->h:Lco/bird/android/manager/bluetooth/internal/c;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/c;->i:Lco/bird/android/manager/bluetooth/internal/c;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/c;->j:Lco/bird/android/manager/bluetooth/internal/c;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/c;->k:Lco/bird/android/manager/bluetooth/internal/c;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/c;->l:Lco/bird/android/manager/bluetooth/internal/c;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/c;->m:Lco/bird/android/manager/bluetooth/internal/c;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/c;->n:Lco/bird/android/manager/bluetooth/internal/c;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static final synthetic access$getValues$cp()[Lco/bird/android/manager/bluetooth/internal/c;
    .locals 1

    sget-object v0, Lco/bird/android/manager/bluetooth/internal/c;->d:[Lco/bird/android/manager/bluetooth/internal/c;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/manager/bluetooth/internal/c;
    .locals 1

    const-class v0, Lco/bird/android/manager/bluetooth/internal/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/manager/bluetooth/internal/c;

    return-object p0
.end method

.method public static values()[Lco/bird/android/manager/bluetooth/internal/c;
    .locals 1

    sget-object v0, Lco/bird/android/manager/bluetooth/internal/c;->o:[Lco/bird/android/manager/bluetooth/internal/c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/manager/bluetooth/internal/c;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, Lco/bird/android/manager/bluetooth/internal/c;->b:I

    return v0
.end method
