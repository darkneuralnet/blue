.class public final LZN1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZN1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u001c\u0018\u0000 \u00162\u00020\u0001:\u0001\tB\t\u0008\u0014\u00a2\u0006\u0004\u0008!\u0010\"J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R.\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006@DX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR*\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00028\u0006@DX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\t\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R*\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00028\u0006@DX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u0011\u001a\u0004\u0008\u0010\u0010\u0012\"\u0004\u0008\u0016\u0010\u0014R*\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00028\u0006@DX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0011\u001a\u0004\u0008\u0018\u0010\u0012\"\u0004\u0008\u0019\u0010\u0014R*\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00028\u0006@DX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u0011\u001a\u0004\u0008\u001c\u0010\u0012\"\u0004\u0008\u001d\u0010\u0014R.\u0010 \u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006@DX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\n\u001a\u0004\u0008\u001f\u0010\u000c\"\u0004\u0008\u001b\u0010\u000e\u00a8\u0006#"
    }
    d2 = {
        "LZN1;",
        "",
        "",
        "hashCode",
        "that",
        "",
        "equals",
        "",
        "<set-?>",
        "a",
        "Ljava/lang/String;",
        "c",
        "()Ljava/lang/String;",
        "h",
        "(Ljava/lang/String;)V",
        "proximityUuid",
        "b",
        "I",
        "()I",
        "f",
        "(I)V",
        "major",
        "g",
        "minor",
        "d",
        "i",
        "rssi",
        "e",
        "getTxPower",
        "j",
        "txPower",
        "getBluetoothAddress",
        "bluetoothAddress",
        "<init>",
        "()V",
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
.field public static final g:LZN1$a;

.field public static final h:I

.field public static final i:I

.field public static final j:I

.field public static final k:I

.field public static final l:[C


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LZN1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LZN1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LZN1;->g:LZN1$a;

    const/4 v0, 0x1

    sput v0, LZN1;->h:I

    const/4 v0, 0x2

    sput v0, LZN1;->i:I

    const/4 v0, 0x3

    sput v0, LZN1;->j:I

    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, LZN1;->l:[C

    return-void

    nop

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getHexArray$cp()[C
    .locals 1

    sget-object v0, LZN1;->l:[C

    return-object v0
.end method

.method public static final synthetic access$getPROXIMITY_FAR$cp()I
    .locals 1

    sget v0, LZN1;->j:I

    return v0
.end method

.method public static final synthetic access$getPROXIMITY_IMMEDIATE$cp()I
    .locals 1

    sget v0, LZN1;->h:I

    return v0
.end method

.method public static final synthetic access$getPROXIMITY_NEAR$cp()I
    .locals 1

    sget v0, LZN1;->i:I

    return v0
.end method

.method public static final synthetic access$getPROXIMITY_UNKNOWN$cp()I
    .locals 1

    sget v0, LZN1;->k:I

    return v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, LZN1;->b:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, LZN1;->c:I

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LZN1;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, LZN1;->d:I

    return v0
.end method

.method public final e(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LZN1;->f:Ljava/lang/String;

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LZN1;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LZN1;

    iget v0, p1, LZN1;->b:I

    iget v2, p0, LZN1;->b:I

    if-ne v0, v2, :cond_1

    iget v0, p1, LZN1;->c:I

    iget v2, p0, LZN1;->c:I

    if-ne v0, v2, :cond_1

    iget-object p1, p1, LZN1;->a:Ljava/lang/String;

    iget-object v0, p0, LZN1;->a:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final f(I)V
    .locals 0

    iput p1, p0, LZN1;->b:I

    return-void
.end method

.method public final g(I)V
    .locals 0

    iput p1, p0, LZN1;->c:I

    return-void
.end method

.method public final h(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LZN1;->a:Ljava/lang/String;

    return-void
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LZN1;->c:I

    return v0
.end method

.method public final i(I)V
    .locals 0

    iput p1, p0, LZN1;->d:I

    return-void
.end method

.method public final j(I)V
    .locals 0

    iput p1, p0, LZN1;->e:I

    return-void
.end method
