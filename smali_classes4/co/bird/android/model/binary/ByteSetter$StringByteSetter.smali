.class public Lco/bird/android/model/binary/ByteSetter$StringByteSetter;
.super Lco/bird/android/model/binary/ByteSetter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/binary/ByteSetter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StringByteSetter"
.end annotation


# static fields
.field protected static final hextypes:[C


# instance fields
.field private rep:[C


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "0123456789ABCDEF"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lco/bird/android/model/binary/ByteSetter$StringByteSetter;->hextypes:[C

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/model/binary/ByteSetter;-><init>()V

    mul-int/lit8 p1, p1, 0x2

    new-array p1, p1, [C

    iput-object p1, p0, Lco/bird/android/model/binary/ByteSetter$StringByteSetter;->rep:[C

    return-void
.end method


# virtual methods
.method public result()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/binary/ByteSetter$StringByteSetter;->rep:[C

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public resultAsArray()[C
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/binary/ByteSetter$StringByteSetter;->rep:[C

    return-object v0
.end method

.method public set(BI)V
    .locals 3

    mul-int/lit8 p2, p2, 0x2

    iget-object v0, p0, Lco/bird/android/model/binary/ByteSetter$StringByteSetter;->rep:[C

    sget-object v1, Lco/bird/android/model/binary/ByteSetter$StringByteSetter;->hextypes:[C

    ushr-int/lit8 v2, p1, 0x4

    and-int/lit8 v2, v2, 0xf

    aget-char v2, v1, v2

    aput-char v2, v0, p2

    add-int/lit8 p2, p2, 0x1

    and-int/lit8 p1, p1, 0xf

    aget-char p1, v1, p1

    aput-char p1, v0, p2

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/binary/ByteSetter$StringByteSetter;->rep:[C

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method
