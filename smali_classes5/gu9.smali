.class public final Lgu9;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# static fields
.field public static final zza:Lq78;

.field private static final zzd:Lgu9;


# instance fields
.field private zze:I

.field private zzf:J

.field private zzg:J

.field private zzh:LvO8;

.field private zzi:B


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v2, Lgu9;

    invoke-direct {v2}, Lgu9;-><init>()V

    sput-object v2, Lgu9;->zzd:Lgu9;

    const-class v0, Lgu9;

    invoke-static {v0, v2}, LV78;->w(Ljava/lang/Class;LV78;)V

    invoke-static {}, LvO8;->J()LvO8;

    move-result-object v0

    const/4 v3, 0x0

    const v4, 0xca4e15

    sget-object v5, Lvx8;->m:Lvx8;

    const-class v6, Lgu9;

    move-object v1, v2

    invoke-static/range {v0 .. v6}, LV78;->h(Ldj8;Ljava/lang/Object;Ldj8;LQ88;ILvx8;Ljava/lang/Class;)Lq78;

    move-result-object v0

    sput-object v0, Lgu9;->zza:Lq78;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LV78;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lgu9;->zzi:B

    return-void
.end method

.method public static synthetic H()Lgu9;
    .locals 1

    sget-object v0, Lgu9;->zzd:Lgu9;

    return-object v0
.end method


# virtual methods
.method public final G(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    if-eq p1, v3, :cond_4

    if-eq p1, v2, :cond_3

    const/4 v2, 0x0

    if-eq p1, v1, :cond_2

    const/4 v1, 0x5

    if-eq p1, v1, :cond_1

    if-nez p2, :cond_0

    move p3, v0

    :cond_0
    iput-byte p3, p0, Lgu9;->zzi:B

    return-object v2

    :cond_1
    sget-object p1, Lgu9;->zzd:Lgu9;

    return-object p1

    :cond_2
    new-instance p1, Lzs9;

    invoke-direct {p1, v2}, Lzs9;-><init>(LYq9;)V

    return-object p1

    :cond_3
    new-instance p1, Lgu9;

    invoke-direct {p1}, Lgu9;-><init>()V

    return-object p1

    :cond_4
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "zze"

    aput-object p2, p1, v0

    const-string p2, "zzf"

    aput-object p2, p1, p3

    const-string p2, "zzg"

    aput-object p2, p1, v3

    const-string p2, "zzh"

    aput-object p2, p1, v2

    sget-object p2, Lgu9;->zzd:Lgu9;

    const-string p3, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1505\u0000\u0002\u1505\u0001\u0003\u1409\u0002"

    invoke-static {p2, p3, p1}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, Lgu9;->zzi:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
