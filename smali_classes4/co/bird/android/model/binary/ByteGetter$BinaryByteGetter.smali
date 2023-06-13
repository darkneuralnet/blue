.class public Lco/bird/android/model/binary/ByteGetter$BinaryByteGetter;
.super Lco/bird/android/model/binary/ByteGetter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/binary/ByteGetter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BinaryByteGetter"
.end annotation


# instance fields
.field private array:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/model/binary/ByteGetter;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/binary/ByteGetter$BinaryByteGetter;->array:[B

    return-void
.end method


# virtual methods
.method public get(I)I
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/binary/ByteGetter$BinaryByteGetter;->array:[B

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    return p1
.end method
