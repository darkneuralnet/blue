.class public final Lcom/stripe/android/stripe3ds2/security/TransactionEncrypter$Crypto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/stripe3ds2/security/TransactionEncrypter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Crypto"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0002\u0008\u0006\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\tH\u0002J\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/security/TransactionEncrypter$Crypto;",
        "",
        "()V",
        "BITS_IN_BYTE",
        "",
        "getGcmId",
        "",
        "length",
        "pad",
        "",
        "counter",
        "getGcmIvAtoS",
        "sdkCounterAtoS",
        "getGcmIvStoA",
        "sdkCounterStoA",
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
.field private static final BITS_IN_BYTE:I = 0x8

.field public static final INSTANCE:Lcom/stripe/android/stripe3ds2/security/TransactionEncrypter$Crypto;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/stripe3ds2/security/TransactionEncrypter$Crypto;

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/security/TransactionEncrypter$Crypto;-><init>()V

    sput-object v0, Lcom/stripe/android/stripe3ds2/security/TransactionEncrypter$Crypto;->INSTANCE:Lcom/stripe/android/stripe3ds2/security/TransactionEncrypter$Crypto;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final getGcmId(IBB)[B
    .locals 1

    div-int/lit8 p1, p1, 0x8

    new-array v0, p1, [B

    invoke-static {v0, p2}, Ljava/util/Arrays;->fill([BB)V

    add-int/lit8 p1, p1, -0x1

    aput-byte p3, v0, p1

    return-object v0
.end method

.method private final getGcmIvAtoS(IB)[B
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0, p1, v0, p2}, Lcom/stripe/android/stripe3ds2/security/TransactionEncrypter$Crypto;->getGcmId(IBB)[B

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final getGcmIvStoA(IB)[B
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/stripe/android/stripe3ds2/security/TransactionEncrypter$Crypto;->getGcmId(IBB)[B

    move-result-object p1

    return-object p1
.end method
