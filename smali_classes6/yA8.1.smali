.class public final LyA8;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# static fields
.field private static final zza:LyA8;


# instance fields
.field private zzd:I

.field private zze:Ljava/lang/String;

.field private zzf:LgZ7;

.field private zzg:I

.field private zzh:F

.field private zzi:F

.field private zzj:LHe8;

.field private zzk:Lv98;

.field private zzl:I

.field private zzm:LCy8;

.field private zzn:I

.field private zzo:I

.field private zzp:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LyA8;

    invoke-direct {v0}, LyA8;-><init>()V

    sput-object v0, LyA8;->zza:LyA8;

    const-class v1, LyA8;

    invoke-static {v1, v0}, LV78;->w(Ljava/lang/Class;LV78;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LV78;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LyA8;->zze:Ljava/lang/String;

    sget-object v0, LgZ7;->c:LgZ7;

    iput-object v0, p0, LyA8;->zzf:LgZ7;

    const/16 v0, 0xa

    iput v0, p0, LyA8;->zzg:I

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, LyA8;->zzh:F

    const v0, 0x3d4ccccd    # 0.05f

    iput v0, p0, LyA8;->zzi:F

    invoke-static {}, LV78;->m()Lv98;

    move-result-object v0

    iput-object v0, p0, LyA8;->zzk:Lv98;

    const/4 v0, 0x1

    iput v0, p0, LyA8;->zzl:I

    const/16 v0, 0x140

    iput v0, p0, LyA8;->zzn:I

    const/4 v0, 0x4

    iput v0, p0, LyA8;->zzo:I

    const/4 v0, 0x2

    iput v0, p0, LyA8;->zzp:I

    return-void
.end method

.method public static H()Lvt8;
    .locals 1

    sget-object v0, LyA8;->zza:LyA8;

    invoke-virtual {v0}, LV78;->f()Lk58;

    move-result-object v0

    check-cast v0, Lvt8;

    return-object v0
.end method

.method public static synthetic I()LyA8;
    .locals 1

    sget-object v0, LyA8;->zza:LyA8;

    return-object v0
.end method

.method public static synthetic J(LyA8;LHe8;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LyA8;->zzj:LHe8;

    iget p1, p0, LyA8;->zzd:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, LyA8;->zzd:I

    return-void
.end method

.method public static synthetic K(LyA8;LgZ7;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, LyA8;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LyA8;->zzd:I

    iput-object p1, p0, LyA8;->zzf:LgZ7;

    return-void
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
    sget-object p1, LyA8;->zza:LyA8;

    return-object p1

    :cond_1
    new-instance p1, Lvt8;

    invoke-direct {p1, p2}, Lvt8;-><init>(Lum8;)V

    return-object p1

    :cond_2
    new-instance p1, LyA8;

    invoke-direct {p1}, LyA8;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xd

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zzd"

    aput-object v4, p1, v3

    const-string v3, "zze"

    aput-object v3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    const-string p2, "zzi"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzp"

    aput-object p3, p1, p2

    sget-object p2, LyA8;->zza:LyA8;

    const-string p3, "\u0001\u000c\u0000\u0001\u0001\u000c\u000c\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u100a\u0001\u0003\u100b\u0002\u0004\u1001\u0003\u0005\u1001\u0004\u0006\u1009\u0005\u0007\u0013\u0008\u1004\u0006\t\u1009\u0007\n\u1004\u0008\u000b\u1004\t\u000c\u1004\n"

    invoke-static {p2, p3, p1}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
