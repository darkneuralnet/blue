.class public abstract Lco/bird/android/model/binary/ValueSetter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/binary/ValueSetter$NDR;,
        Lco/bird/android/model/binary/ValueSetter$XDR;
    }
.end annotation


# instance fields
.field data:Lco/bird/android/model/binary/ByteSetter;

.field public final endian:B

.field position:I


# direct methods
.method public constructor <init>(Lco/bird/android/model/binary/ByteSetter;B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lco/bird/android/model/binary/ValueSetter;->position:I

    iput-object p1, p0, Lco/bird/android/model/binary/ValueSetter;->data:Lco/bird/android/model/binary/ByteSetter;

    iput-byte p2, p0, Lco/bird/android/model/binary/ValueSetter;->endian:B

    return-void
.end method


# virtual methods
.method public setByte(B)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/binary/ValueSetter;->data:Lco/bird/android/model/binary/ByteSetter;

    iget v1, p0, Lco/bird/android/model/binary/ValueSetter;->position:I

    invoke-virtual {v0, p1, v1}, Lco/bird/android/model/binary/ByteSetter;->set(BI)V

    iget p1, p0, Lco/bird/android/model/binary/ValueSetter;->position:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lco/bird/android/model/binary/ValueSetter;->position:I

    return-void
.end method

.method public setDouble(D)V
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lco/bird/android/model/binary/ValueSetter;->setLong(J)V

    return-void
.end method

.method public setInt(I)V
    .locals 1

    iget v0, p0, Lco/bird/android/model/binary/ValueSetter;->position:I

    invoke-virtual {p0, p1, v0}, Lco/bird/android/model/binary/ValueSetter;->setInt(II)V

    iget p1, p0, Lco/bird/android/model/binary/ValueSetter;->position:I

    add-int/lit8 p1, p1, 0x4

    iput p1, p0, Lco/bird/android/model/binary/ValueSetter;->position:I

    return-void
.end method

.method public abstract setInt(II)V
.end method

.method public setLong(J)V
    .locals 1

    iget v0, p0, Lco/bird/android/model/binary/ValueSetter;->position:I

    invoke-virtual {p0, p1, p2, v0}, Lco/bird/android/model/binary/ValueSetter;->setLong(JI)V

    iget p1, p0, Lco/bird/android/model/binary/ValueSetter;->position:I

    add-int/lit8 p1, p1, 0x8

    iput p1, p0, Lco/bird/android/model/binary/ValueSetter;->position:I

    return-void
.end method

.method public abstract setLong(JI)V
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/model/binary/ValueSetter;->data:Lco/bird/android/model/binary/ByteSetter;

    if-nez v1, :cond_0

    const-string v1, "NULL"

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\')"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "(\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
