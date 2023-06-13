.class public final LIJ8;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# static fields
.field private static final zza:LIJ8;


# instance fields
.field private zzd:I

.field private zze:Lqa8;

.field private zzf:LgK8;

.field private zzg:LZy8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LIJ8;

    invoke-direct {v0}, LIJ8;-><init>()V

    sput-object v0, LIJ8;->zza:LIJ8;

    const-class v1, LIJ8;

    invoke-static {v1, v0}, LV78;->w(Ljava/lang/Class;LV78;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LV78;-><init>()V

    invoke-static {}, LV78;->p()Lqa8;

    move-result-object v0

    iput-object v0, p0, LIJ8;->zze:Lqa8;

    return-void
.end method

.method public static synthetic H()LIJ8;
    .locals 1

    sget-object v0, LIJ8;->zza:LIJ8;

    return-object v0
.end method


# virtual methods
.method public final G(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

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
    sget-object p1, LIJ8;->zza:LIJ8;

    return-object p1

    :cond_1
    new-instance p1, LxJ8;

    invoke-direct {p1, p2}, LxJ8;-><init>(Ley8;)V

    return-object p1

    :cond_2
    new-instance p1, LIJ8;

    invoke-direct {p1}, LIJ8;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v3, "zzd"

    aput-object v3, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    const-class p2, LvM8;

    aput-object p2, p1, v2

    const-string p2, "zzf"

    aput-object p2, p1, v1

    const-string p2, "zzg"

    aput-object p2, p1, v0

    sget-object p2, LIJ8;->zza:LIJ8;

    const-string p3, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000\u0003\u1009\u0001"

    invoke-static {p2, p3, p1}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
