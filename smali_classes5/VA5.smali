.class public abstract LVA5;
.super LtE;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "LtE<",
        "TZ;>;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/high16 v0, -0x80000000

    invoke-direct {p0, v0, v0}, LVA5;-><init>(II)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, LtE;-><init>()V

    iput p1, p0, LVA5;->c:I

    iput p2, p0, LVA5;->d:I

    return-void
.end method


# virtual methods
.method public final getSize(LFB5;)V
    .locals 2

    iget v0, p0, LVA5;->c:I

    iget v1, p0, LVA5;->d:I

    invoke-static {v0, v1}, Lpi6;->t(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LVA5;->c:I

    iget v1, p0, LVA5;->d:I

    invoke-interface {p1, v0, v1}, LFB5;->d(II)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LVA5;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " and height: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LVA5;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", either provide dimensions in the constructor or call override()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public removeCallback(LFB5;)V
    .locals 0

    return-void
.end method
