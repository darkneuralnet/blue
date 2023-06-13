.class public Lco/bird/android/model/binary/ValueSetter$XDR;
.super Lco/bird/android/model/binary/ValueSetter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/binary/ValueSetter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "XDR"
.end annotation


# static fields
.field public static final NUMBER:B


# direct methods
.method public constructor <init>(Lco/bird/android/model/binary/ByteSetter;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lco/bird/android/model/binary/ValueSetter;-><init>(Lco/bird/android/model/binary/ByteSetter;B)V

    return-void
.end method


# virtual methods
.method public setInt(II)V
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/binary/ValueSetter;->data:Lco/bird/android/model/binary/ByteSetter;

    ushr-int/lit8 v1, p1, 0x18

    int-to-byte v1, v1

    invoke-virtual {v0, v1, p2}, Lco/bird/android/model/binary/ByteSetter;->set(BI)V

    iget-object v0, p0, Lco/bird/android/model/binary/ValueSetter;->data:Lco/bird/android/model/binary/ByteSetter;

    ushr-int/lit8 v1, p1, 0x10

    int-to-byte v1, v1

    add-int/lit8 v2, p2, 0x1

    invoke-virtual {v0, v1, v2}, Lco/bird/android/model/binary/ByteSetter;->set(BI)V

    iget-object v0, p0, Lco/bird/android/model/binary/ValueSetter;->data:Lco/bird/android/model/binary/ByteSetter;

    ushr-int/lit8 v1, p1, 0x8

    int-to-byte v1, v1

    add-int/lit8 v2, p2, 0x2

    invoke-virtual {v0, v1, v2}, Lco/bird/android/model/binary/ByteSetter;->set(BI)V

    iget-object v0, p0, Lco/bird/android/model/binary/ValueSetter;->data:Lco/bird/android/model/binary/ByteSetter;

    int-to-byte p1, p1

    add-int/lit8 p2, p2, 0x3

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/binary/ByteSetter;->set(BI)V

    return-void
.end method

.method public setLong(JI)V
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/binary/ValueSetter;->data:Lco/bird/android/model/binary/ByteSetter;

    const/16 v1, 0x38

    ushr-long v1, p1, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1, p3}, Lco/bird/android/model/binary/ByteSetter;->set(BI)V

    iget-object v0, p0, Lco/bird/android/model/binary/ValueSetter;->data:Lco/bird/android/model/binary/ByteSetter;

    const/16 v1, 0x30

    ushr-long v1, p1, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    add-int/lit8 v2, p3, 0x1

    invoke-virtual {v0, v1, v2}, Lco/bird/android/model/binary/ByteSetter;->set(BI)V

    iget-object v0, p0, Lco/bird/android/model/binary/ValueSetter;->data:Lco/bird/android/model/binary/ByteSetter;

    const/16 v1, 0x28

    ushr-long v1, p1, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    add-int/lit8 v2, p3, 0x2

    invoke-virtual {v0, v1, v2}, Lco/bird/android/model/binary/ByteSetter;->set(BI)V

    iget-object v0, p0, Lco/bird/android/model/binary/ValueSetter;->data:Lco/bird/android/model/binary/ByteSetter;

    const/16 v1, 0x20

    ushr-long v1, p1, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    add-int/lit8 v2, p3, 0x3

    invoke-virtual {v0, v1, v2}, Lco/bird/android/model/binary/ByteSetter;->set(BI)V

    iget-object v0, p0, Lco/bird/android/model/binary/ValueSetter;->data:Lco/bird/android/model/binary/ByteSetter;

    const/16 v1, 0x18

    ushr-long v1, p1, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    add-int/lit8 v2, p3, 0x4

    invoke-virtual {v0, v1, v2}, Lco/bird/android/model/binary/ByteSetter;->set(BI)V

    iget-object v0, p0, Lco/bird/android/model/binary/ValueSetter;->data:Lco/bird/android/model/binary/ByteSetter;

    const/16 v1, 0x10

    ushr-long v1, p1, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    add-int/lit8 v2, p3, 0x5

    invoke-virtual {v0, v1, v2}, Lco/bird/android/model/binary/ByteSetter;->set(BI)V

    iget-object v0, p0, Lco/bird/android/model/binary/ValueSetter;->data:Lco/bird/android/model/binary/ByteSetter;

    const/16 v1, 0x8

    ushr-long v1, p1, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    add-int/lit8 v2, p3, 0x6

    invoke-virtual {v0, v1, v2}, Lco/bird/android/model/binary/ByteSetter;->set(BI)V

    iget-object v0, p0, Lco/bird/android/model/binary/ValueSetter;->data:Lco/bird/android/model/binary/ByteSetter;

    long-to-int p1, p1

    int-to-byte p1, p1

    add-int/lit8 p3, p3, 0x7

    invoke-virtual {v0, p1, p3}, Lco/bird/android/model/binary/ByteSetter;->set(BI)V

    return-void
.end method
