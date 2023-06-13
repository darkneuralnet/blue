.class public final LDd9;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# static fields
.field private static final zza:LDd9;


# instance fields
.field private zzd:I

.field private zze:LK98;

.field private zzf:Lv98;

.field private zzg:Z

.field private zzh:Ljava/lang/String;

.field private zzi:Ljava/lang/String;

.field private zzj:LvO8;

.field private zzk:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LDd9;

    invoke-direct {v0}, LDd9;-><init>()V

    sput-object v0, LDd9;->zza:LDd9;

    const-class v1, LDd9;

    invoke-static {v1, v0}, LV78;->w(Ljava/lang/Class;LV78;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LV78;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LDd9;->zzk:B

    invoke-static {}, LV78;->o()LK98;

    move-result-object v0

    iput-object v0, p0, LDd9;->zze:LK98;

    invoke-static {}, LV78;->m()Lv98;

    move-result-object v0

    iput-object v0, p0, LDd9;->zzf:Lv98;

    const/4 v0, 0x1

    iput-boolean v0, p0, LDd9;->zzg:Z

    const-string v0, ""

    iput-object v0, p0, LDd9;->zzh:Ljava/lang/String;

    iput-object v0, p0, LDd9;->zzi:Ljava/lang/String;

    return-void
.end method

.method public static synthetic H()LDd9;
    .locals 1

    sget-object v0, LDd9;->zza:LDd9;

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
    iput-byte p3, p0, LDd9;->zzk:B

    return-object v3

    :cond_1
    sget-object p1, LDd9;->zza:LDd9;

    return-object p1

    :cond_2
    new-instance p1, LE99;

    invoke-direct {p1, v3}, LE99;-><init>(LF49;)V

    return-object p1

    :cond_3
    new-instance p1, LDd9;

    invoke-direct {p1}, LDd9;-><init>()V

    return-object p1

    :cond_4
    const/4 p1, 0x7

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zzd"

    aput-object p2, p1, v0

    const-string p2, "zze"

    aput-object p2, p1, p3

    const-string p2, "zzf"

    aput-object p2, p1, v4

    const-string p2, "zzg"

    aput-object p2, p1, v3

    const-string p2, "zzh"

    aput-object p2, p1, v2

    const-string p2, "zzi"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zzj"

    aput-object p3, p1, p2

    sget-object p2, LDd9;->zza:LDd9;

    const-string p3, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003\u1007\u0000\u0004\u1008\u0001\u0005\u1008\u0002\u000f\u1409\u0003"

    invoke-static {p2, p3, p1}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LDd9;->zzk:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
