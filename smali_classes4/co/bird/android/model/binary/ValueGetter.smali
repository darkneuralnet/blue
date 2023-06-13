.class public abstract Lco/bird/android/model/binary/ValueGetter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/binary/ValueGetter$NDR;,
        Lco/bird/android/model/binary/ValueGetter$XDR;
    }
.end annotation


# instance fields
.field data:Lco/bird/android/model/binary/ByteGetter;

.field public final endian:B

.field position:I


# direct methods
.method public constructor <init>(Lco/bird/android/model/binary/ByteGetter;B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/binary/ValueGetter;->data:Lco/bird/android/model/binary/ByteGetter;

    iput-byte p2, p0, Lco/bird/android/model/binary/ValueGetter;->endian:B

    return-void
.end method


# virtual methods
.method public getByte()B
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/binary/ValueGetter;->data:Lco/bird/android/model/binary/ByteGetter;

    iget v1, p0, Lco/bird/android/model/binary/ValueGetter;->position:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lco/bird/android/model/binary/ValueGetter;->position:I

    invoke-virtual {v0, v1}, Lco/bird/android/model/binary/ByteGetter;->get(I)I

    move-result v0

    int-to-byte v0, v0

    return v0
.end method

.method public getDouble()D
    .locals 2

    invoke-virtual {p0}, Lco/bird/android/model/binary/ValueGetter;->getLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method

.method public getInt()I
    .locals 2

    iget v0, p0, Lco/bird/android/model/binary/ValueGetter;->position:I

    invoke-virtual {p0, v0}, Lco/bird/android/model/binary/ValueGetter;->getInt(I)I

    move-result v0

    iget v1, p0, Lco/bird/android/model/binary/ValueGetter;->position:I

    add-int/lit8 v1, v1, 0x4

    iput v1, p0, Lco/bird/android/model/binary/ValueGetter;->position:I

    return v0
.end method

.method public abstract getInt(I)I
.end method

.method public getLong()J
    .locals 3

    iget v0, p0, Lco/bird/android/model/binary/ValueGetter;->position:I

    invoke-virtual {p0, v0}, Lco/bird/android/model/binary/ValueGetter;->getLong(I)J

    move-result-wide v0

    iget v2, p0, Lco/bird/android/model/binary/ValueGetter;->position:I

    add-int/lit8 v2, v2, 0x8

    iput v2, p0, Lco/bird/android/model/binary/ValueGetter;->position:I

    return-wide v0
.end method

.method public abstract getLong(I)J
.end method
