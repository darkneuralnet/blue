.class public final LBy;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LV78<",
        "LBy;",
        "LFN8;",
        ">;",
        "Lrj8;"
    }
.end annotation


# static fields
.field private static final zza:LBy;


# instance fields
.field private zzd:I

.field private zze:LyA8;

.field private zzf:LU49;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LBy;

    invoke-direct {v0}, LBy;-><init>()V

    sput-object v0, LBy;->zza:LBy;

    const-class v1, LBy;

    invoke-static {v1, v0}, LV78;->w(Ljava/lang/Class;LV78;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LV78;-><init>()V

    return-void
.end method

.method public static H()LFN8;
    .locals 1

    sget-object v0, LBy;->zza:LBy;

    invoke-virtual {v0}, LV78;->f()Lk58;

    move-result-object v0

    check-cast v0, LFN8;

    return-object v0
.end method

.method public static synthetic I()LBy;
    .locals 1

    sget-object v0, LBy;->zza:LBy;

    return-object v0
.end method

.method public static synthetic J(LBy;LyA8;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LBy;->zze:LyA8;

    iget p1, p0, LBy;->zzd:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, LBy;->zzd:I

    return-void
.end method

.method public static synthetic K(LBy;LU49;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LBy;->zzf:LU49;

    iget p1, p0, LBy;->zzd:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, LBy;->zzd:I

    return-void
.end method


# virtual methods
.method public final G(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    if-eq p1, p3, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, LBy;->zza:LBy;

    return-object p1

    :cond_1
    new-instance p1, LFN8;

    invoke-direct {p1, p3}, LFN8;-><init>(LdH8;)V

    return-object p1

    :cond_2
    new-instance p1, LBy;

    invoke-direct {p1}, LBy;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v1, "zzd"

    aput-object v1, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v0

    sget-object p2, LBy;->zza:LBy;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001"

    invoke-static {p2, p3, p1}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
