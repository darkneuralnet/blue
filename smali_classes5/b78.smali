.class public final Lb78;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO38;


# instance fields
.field public final b:I

.field public final c:Lvx8;


# direct methods
.method public constructor <init>(LQ88;ILvx8;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lb78;->b:I

    iput-object p3, p0, Lb78;->c:Lvx8;

    return-void
.end method


# virtual methods
.method public final B0(LQi8;Ldj8;)LQi8;
    .locals 1

    check-cast p2, LV78;

    move-object v0, p1

    check-cast v0, Lk58;

    invoke-virtual {v0, p2}, Lk58;->h(LV78;)Lk58;

    return-object p1
.end method

.method public final I1(Lrk8;Lrk8;)Lrk8;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lb78;

    iget v0, p0, Lb78;->b:I

    iget p1, p1, Lb78;->b:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final x()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lb78;->b:I

    return v0
.end method

.method public final zzd()Lvx8;
    .locals 1

    iget-object v0, p0, Lb78;->c:Lvx8;

    return-object v0
.end method

.method public final zze()LHx8;
    .locals 1

    iget-object v0, p0, Lb78;->c:Lvx8;

    invoke-virtual {v0}, Lvx8;->a()LHx8;

    move-result-object v0

    return-object v0
.end method

.method public final zzg()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
