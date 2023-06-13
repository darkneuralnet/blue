.class public final LyE8;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# static fields
.field private static final zza:LyE8;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Lqa8;

.field private zzg:I

.field private zzh:LTC8;

.field private zzi:Ljava/lang/String;

.field private zzj:I

.field private zzk:I

.field private zzl:LK98;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LyE8;

    invoke-direct {v0}, LyE8;-><init>()V

    sput-object v0, LyE8;->zza:LyE8;

    const-class v1, LyE8;

    invoke-static {v1, v0}, LV78;->w(Ljava/lang/Class;LV78;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LV78;-><init>()V

    invoke-static {}, LV78;->p()Lqa8;

    move-result-object v0

    iput-object v0, p0, LyE8;->zzf:Lqa8;

    const/4 v0, -0x1

    iput v0, p0, LyE8;->zzg:I

    const-string v0, ""

    iput-object v0, p0, LyE8;->zzi:Ljava/lang/String;

    invoke-static {}, LV78;->o()LK98;

    move-result-object v0

    iput-object v0, p0, LyE8;->zzl:LK98;

    return-void
.end method

.method public static synthetic H()LyE8;
    .locals 1

    sget-object v0, LyE8;->zza:LyE8;

    return-object v0
.end method


# virtual methods
.method public final G(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x5

    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_3

    if-eq p1, v1, :cond_2

    const/4 p2, 0x0

    if-eq p1, v0, :cond_1

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, LyE8;->zza:LyE8;

    return-object p1

    :cond_1
    new-instance p1, LPD8;

    invoke-direct {p1, p2}, LPD8;-><init>(Ley8;)V

    return-object p1

    :cond_2
    new-instance p1, LyE8;

    invoke-direct {p1}, LyE8;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xd

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zzd"

    aput-object v4, p1, v3

    const-string v3, "zze"

    aput-object v3, p1, p2

    sget-object p2, LDD8;->a:Lf98;

    aput-object p2, p1, v2

    const-string p2, "zzf"

    aput-object p2, p1, v1

    const-class p2, LrD8;

    aput-object p2, p1, v0

    const-string p2, "zzg"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzh"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    sget-object p3, LaE8;->a:Lf98;

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    sget-object p3, LlE8;->a:Lf98;

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzl"

    aput-object p3, p1, p2

    sget-object p2, LyE8;->zza:LyE8;

    const-string p3, "\u0001\u0008\u0000\u0001\u0001\u0008\u0008\u0000\u0002\u0000\u0001\u100c\u0000\u0002\u001b\u0003\u1004\u0001\u0004\u1009\u0002\u0005\u1008\u0003\u0006\u100c\u0004\u0007\u100c\u0005\u0008\'"

    invoke-static {p2, p3, p1}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
