.class public Lco/bird/android/model/binary/ByteGetter$StringByteGetter;
.super Lco/bird/android/model/binary/ByteGetter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/binary/ByteGetter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StringByteGetter"
.end annotation


# instance fields
.field private rep:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/model/binary/ByteGetter;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/binary/ByteGetter$StringByteGetter;->rep:Ljava/lang/String;

    return-void
.end method

.method public static unhex(C)B
    .locals 3

    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v1, 0x39

    if-gt p0, v1, :cond_0

    sub-int/2addr p0, v0

    :goto_0
    int-to-byte p0, p0

    return p0

    :cond_0
    const/16 v0, 0x41

    if-lt p0, v0, :cond_1

    const/16 v1, 0x46

    if-gt p0, v1, :cond_1

    :goto_1
    sub-int/2addr p0, v0

    add-int/lit8 p0, p0, 0xa

    goto :goto_0

    :cond_1
    const/16 v0, 0x61

    if-lt p0, v0, :cond_2

    const/16 v1, 0x66

    if-gt p0, v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No valid Hex char "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public get(I)I
    .locals 2

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Lco/bird/android/model/binary/ByteGetter$StringByteGetter;->rep:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lco/bird/android/model/binary/ByteGetter$StringByteGetter;->unhex(C)B

    move-result v0

    iget-object v1, p0, Lco/bird/android/model/binary/ByteGetter$StringByteGetter;->rep:Ljava/lang/String;

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v1, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-static {p1}, Lco/bird/android/model/binary/ByteGetter$StringByteGetter;->unhex(C)B

    move-result p1

    shl-int/lit8 v0, v0, 0x4

    add-int/2addr v0, p1

    return v0
.end method
