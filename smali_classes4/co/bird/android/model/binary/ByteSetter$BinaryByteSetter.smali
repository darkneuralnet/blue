.class public Lco/bird/android/model/binary/ByteSetter$BinaryByteSetter;
.super Lco/bird/android/model/binary/ByteSetter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/binary/ByteSetter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BinaryByteSetter"
.end annotation


# instance fields
.field private array:[B


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/model/binary/ByteSetter;-><init>()V

    new-array p1, p1, [B

    iput-object p1, p0, Lco/bird/android/model/binary/ByteSetter$BinaryByteSetter;->array:[B

    return-void
.end method


# virtual methods
.method public result()[B
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/binary/ByteSetter$BinaryByteSetter;->array:[B

    return-object v0
.end method

.method public set(BI)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/binary/ByteSetter$BinaryByteSetter;->array:[B

    aput-byte p1, v0, p2

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lco/bird/android/model/binary/ByteSetter$BinaryByteSetter;->array:[B

    array-length v0, v0

    new-array v0, v0, [C

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lco/bird/android/model/binary/ByteSetter$BinaryByteSetter;->array:[B

    array-length v3, v2

    if-ge v1, v3, :cond_0

    aget-byte v2, v2, v1

    and-int/lit16 v2, v2, 0xff

    int-to-char v2, v2

    aput-char v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    return-object v1
.end method
