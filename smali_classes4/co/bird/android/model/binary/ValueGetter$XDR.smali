.class public Lco/bird/android/model/binary/ValueGetter$XDR;
.super Lco/bird/android/model/binary/ValueGetter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/binary/ValueGetter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "XDR"
.end annotation


# static fields
.field public static final NUMBER:B


# direct methods
.method public constructor <init>(Lco/bird/android/model/binary/ByteGetter;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lco/bird/android/model/binary/ValueGetter;-><init>(Lco/bird/android/model/binary/ByteGetter;B)V

    return-void
.end method


# virtual methods
.method public getInt(I)I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/binary/ValueGetter;->data:Lco/bird/android/model/binary/ByteGetter;

    invoke-virtual {v0, p1}, Lco/bird/android/model/binary/ByteGetter;->get(I)I

    move-result v0

    shl-int/lit8 v0, v0, 0x18

    iget-object v1, p0, Lco/bird/android/model/binary/ValueGetter;->data:Lco/bird/android/model/binary/ByteGetter;

    add-int/lit8 v2, p1, 0x1

    invoke-virtual {v1, v2}, Lco/bird/android/model/binary/ByteGetter;->get(I)I

    move-result v1

    shl-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    iget-object v1, p0, Lco/bird/android/model/binary/ValueGetter;->data:Lco/bird/android/model/binary/ByteGetter;

    add-int/lit8 v2, p1, 0x2

    invoke-virtual {v1, v2}, Lco/bird/android/model/binary/ByteGetter;->get(I)I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    iget-object v1, p0, Lco/bird/android/model/binary/ValueGetter;->data:Lco/bird/android/model/binary/ByteGetter;

    add-int/lit8 p1, p1, 0x3

    invoke-virtual {v1, p1}, Lco/bird/android/model/binary/ByteGetter;->get(I)I

    move-result p1

    add-int/2addr v0, p1

    return v0
.end method

.method public getLong(I)J
    .locals 5

    iget-object v0, p0, Lco/bird/android/model/binary/ValueGetter;->data:Lco/bird/android/model/binary/ByteGetter;

    invoke-virtual {v0, p1}, Lco/bird/android/model/binary/ByteGetter;->get(I)I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x38

    shl-long/2addr v0, v2

    iget-object v2, p0, Lco/bird/android/model/binary/ValueGetter;->data:Lco/bird/android/model/binary/ByteGetter;

    add-int/lit8 v3, p1, 0x1

    invoke-virtual {v2, v3}, Lco/bird/android/model/binary/ByteGetter;->get(I)I

    move-result v2

    int-to-long v2, v2

    const/16 v4, 0x30

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    iget-object v2, p0, Lco/bird/android/model/binary/ValueGetter;->data:Lco/bird/android/model/binary/ByteGetter;

    add-int/lit8 v3, p1, 0x2

    invoke-virtual {v2, v3}, Lco/bird/android/model/binary/ByteGetter;->get(I)I

    move-result v2

    int-to-long v2, v2

    const/16 v4, 0x28

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    iget-object v2, p0, Lco/bird/android/model/binary/ValueGetter;->data:Lco/bird/android/model/binary/ByteGetter;

    add-int/lit8 v3, p1, 0x3

    invoke-virtual {v2, v3}, Lco/bird/android/model/binary/ByteGetter;->get(I)I

    move-result v2

    int-to-long v2, v2

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    iget-object v2, p0, Lco/bird/android/model/binary/ValueGetter;->data:Lco/bird/android/model/binary/ByteGetter;

    add-int/lit8 v3, p1, 0x4

    invoke-virtual {v2, v3}, Lco/bird/android/model/binary/ByteGetter;->get(I)I

    move-result v2

    int-to-long v2, v2

    const/16 v4, 0x18

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    iget-object v2, p0, Lco/bird/android/model/binary/ValueGetter;->data:Lco/bird/android/model/binary/ByteGetter;

    add-int/lit8 v3, p1, 0x5

    invoke-virtual {v2, v3}, Lco/bird/android/model/binary/ByteGetter;->get(I)I

    move-result v2

    int-to-long v2, v2

    const/16 v4, 0x10

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    iget-object v2, p0, Lco/bird/android/model/binary/ValueGetter;->data:Lco/bird/android/model/binary/ByteGetter;

    add-int/lit8 v3, p1, 0x6

    invoke-virtual {v2, v3}, Lco/bird/android/model/binary/ByteGetter;->get(I)I

    move-result v2

    int-to-long v2, v2

    const/16 v4, 0x8

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    iget-object v2, p0, Lco/bird/android/model/binary/ValueGetter;->data:Lco/bird/android/model/binary/ByteGetter;

    add-int/lit8 p1, p1, 0x7

    invoke-virtual {v2, p1}, Lco/bird/android/model/binary/ByteGetter;->get(I)I

    move-result p1

    int-to-long v2, p1

    const/4 p1, 0x0

    shl-long/2addr v2, p1

    add-long/2addr v0, v2

    return-wide v0
.end method
