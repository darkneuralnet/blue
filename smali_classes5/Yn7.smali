.class public final LYn7;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# static fields
.field public static final zza:Lq78;

.field private static final zzd:Laa8;

.field private static final zze:LYn7;


# instance fields
.field private zzf:I

.field private zzg:Ljava/lang/String;

.field private zzh:Ljava/lang/String;

.field private zzi:LK98;

.field private zzj:Ljava/lang/String;

.field private zzk:Ljava/lang/String;

.field private zzl:Lkx9;

.field private zzm:LvO8;

.field private zzn:B


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, Lql7;

    invoke-direct {v0}, Lql7;-><init>()V

    sput-object v0, LYn7;->zzd:Laa8;

    new-instance v3, LYn7;

    invoke-direct {v3}, LYn7;-><init>()V

    sput-object v3, LYn7;->zze:LYn7;

    const-class v0, LYn7;

    invoke-static {v0, v3}, LV78;->w(Ljava/lang/Class;LV78;)V

    invoke-static {}, LvO8;->J()LvO8;

    move-result-object v1

    const/4 v4, 0x0

    const v5, 0x12660614

    sget-object v6, Lvx8;->m:Lvx8;

    const-class v7, LYn7;

    move-object v2, v3

    invoke-static/range {v1 .. v7}, LV78;->h(Ldj8;Ljava/lang/Object;Ldj8;LQ88;ILvx8;Ljava/lang/Class;)Lq78;

    move-result-object v0

    sput-object v0, LYn7;->zza:Lq78;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, LV78;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LYn7;->zzn:B

    const-string v0, ""

    iput-object v0, p0, LYn7;->zzg:Ljava/lang/String;

    iput-object v0, p0, LYn7;->zzh:Ljava/lang/String;

    invoke-static {}, LV78;->o()LK98;

    move-result-object v1

    iput-object v1, p0, LYn7;->zzi:LK98;

    iput-object v0, p0, LYn7;->zzj:Ljava/lang/String;

    iput-object v0, p0, LYn7;->zzk:Ljava/lang/String;

    return-void
.end method

.method public static synthetic H()LYn7;
    .locals 1

    sget-object v0, LYn7;->zze:LYn7;

    return-object v0
.end method


# virtual methods
.method public final G(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x5

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eq p1, v4, :cond_4

    if-eq p1, v3, :cond_3

    const/4 v3, 0x0

    if-eq p1, v2, :cond_2

    if-eq p1, v1, :cond_1

    if-nez p2, :cond_0

    move p3, v0

    :cond_0
    iput-byte p3, p0, LYn7;->zzn:B

    return-object v3

    :cond_1
    sget-object p1, LYn7;->zze:LYn7;

    return-object p1

    :cond_2
    new-instance p1, Lnm7;

    invoke-direct {p1, v3}, Lnm7;-><init>(Lvk7;)V

    return-object p1

    :cond_3
    new-instance p1, LYn7;

    invoke-direct {p1}, LYn7;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0x9

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zzf"

    aput-object p2, p1, v0

    const-string p2, "zzg"

    aput-object p2, p1, p3

    const-string p2, "zzh"

    aput-object p2, p1, v4

    const-string p2, "zzi"

    aput-object p2, p1, v3

    sget-object p2, Lhn7;->a:Lf98;

    aput-object p2, p1, v2

    const-string p2, "zzj"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzl"

    aput-object p3, p1, p2

    sget-object p2, LYn7;->zze:LYn7;

    const-string p3, "\u0001\u0007\u0000\u0001\u0001\u01f4\u0007\u0000\u0001\u0002\u0001\u1508\u0000\u0002\u1008\u0001\u0003\u001e\u0005\u1008\u0002\u0006\u1008\u0003\u000f\u1409\u0005\u01f4\u1009\u0004"

    invoke-static {p2, p3, p1}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LYn7;->zzn:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
