.class public final Lab9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW99;


# instance fields
.field public final b:LPb9;

.field public final c:I

.field public final d:Lfn9;

.field public final e:Z


# direct methods
.method public constructor <init>(LPb9;ILfn9;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lab9;->b:LPb9;

    const p1, 0xc0b2142

    iput p1, p0, Lab9;->c:I

    iput-object p3, p0, Lab9;->d:Lfn9;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lab9;->e:Z

    return-void
.end method


# virtual methods
.method public final synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lab9;

    iget p1, p1, Lab9;->c:I

    const/4 p1, 0x0

    return p1
.end method

.method public final zza()I
    .locals 1

    const v0, 0xc0b2142

    return v0
.end method

.method public final zzb()Lfn9;
    .locals 1

    iget-object v0, p0, Lab9;->d:Lfn9;

    return-object v0
.end method

.method public final zzc()Lln9;
    .locals 1

    iget-object v0, p0, Lab9;->d:Lfn9;

    invoke-virtual {v0}, Lfn9;->a()Lln9;

    move-result-object v0

    return-object v0
.end method

.method public final zzd()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final zze()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
