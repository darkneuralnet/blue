.class public final Lie8;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# static fields
.field public static final zza:Lq78;

.field private static final zzd:Lie8;


# instance fields
.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:Lqa8;

.field private zzh:Lqa8;

.field private zzi:Lqa8;

.field private zzj:LvO8;

.field private zzk:Lie8;

.field private zzl:Lkx9;

.field private zzm:B


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v2, Lie8;

    invoke-direct {v2}, Lie8;-><init>()V

    sput-object v2, Lie8;->zzd:Lie8;

    const-class v0, Lie8;

    invoke-static {v0, v2}, LV78;->w(Ljava/lang/Class;LV78;)V

    invoke-static {}, LvO8;->J()LvO8;

    move-result-object v0

    const/4 v3, 0x0

    const v4, 0xba4a86

    sget-object v5, Lvx8;->m:Lvx8;

    const-class v6, Lie8;

    move-object v1, v2

    invoke-static/range {v0 .. v6}, LV78;->h(Ldj8;Ljava/lang/Object;Ldj8;LQ88;ILvx8;Ljava/lang/Class;)Lq78;

    move-result-object v0

    sput-object v0, Lie8;->zza:Lq78;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LV78;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lie8;->zzm:B

    const-string v0, ""

    iput-object v0, p0, Lie8;->zzf:Ljava/lang/String;

    invoke-static {}, LV78;->p()Lqa8;

    move-result-object v0

    iput-object v0, p0, Lie8;->zzg:Lqa8;

    invoke-static {}, LV78;->p()Lqa8;

    move-result-object v0

    iput-object v0, p0, Lie8;->zzh:Lqa8;

    invoke-static {}, LV78;->p()Lqa8;

    move-result-object v0

    iput-object v0, p0, Lie8;->zzi:Lqa8;

    return-void
.end method

.method public static synthetic H()Lie8;
    .locals 1

    sget-object v0, Lie8;->zzd:Lie8;

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
    iput-byte p3, p0, Lie8;->zzm:B

    return-object v3

    :cond_1
    sget-object p1, Lie8;->zzd:Lie8;

    return-object p1

    :cond_2
    new-instance p1, La68;

    invoke-direct {p1, v3}, La68;-><init>(LMX7;)V

    return-object p1

    :cond_3
    new-instance p1, Lie8;

    invoke-direct {p1}, Lie8;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0xb

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zze"

    aput-object p2, p1, v0

    const-string p2, "zzg"

    aput-object p2, p1, p3

    const-class p2, LqH8;

    aput-object p2, p1, v4

    const-string p3, "zzi"

    aput-object p3, p1, v3

    aput-object p2, p1, v2

    const-string p2, "zzh"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-class p3, LdZ8;

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzf"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzl"

    aput-object p3, p1, p2

    sget-object p2, Lie8;->zzd:Lie8;

    const-string p3, "\u0001\u0007\u0000\u0001\u0002\u01f4\u0007\u0000\u0003\u0004\u0002\u041b\u0005\u041b\u0006\u001b\u0008\u1409\u0001\n\u1008\u0000\u000b\u1409\u0002\u01f4\u1009\u0003"

    invoke-static {p2, p3, p1}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, Lie8;->zzm:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
