.class public final LCy8;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# static fields
.field private static final zza:LCy8;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:LvM8;

.field private zzg:LlJ8;

.field private zzh:LIJ8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LCy8;

    invoke-direct {v0}, LCy8;-><init>()V

    sput-object v0, LCy8;->zza:LCy8;

    const-class v1, LCy8;

    invoke-static {v1, v0}, LV78;->w(Ljava/lang/Class;LV78;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LV78;-><init>()V

    return-void
.end method

.method public static synthetic H()LCy8;
    .locals 1

    sget-object v0, LCy8;->zza:LCy8;

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
    sget-object p1, LCy8;->zza:LCy8;

    return-object p1

    :cond_1
    new-instance p1, Lqy8;

    invoke-direct {p1, p2}, Lqy8;-><init>(Ley8;)V

    return-object p1

    :cond_2
    new-instance p1, LCy8;

    invoke-direct {p1}, LCy8;-><init>()V

    return-object p1

    :cond_3
    const/4 p1, 0x6

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zzd"

    aput-object v4, p1, v3

    const-string v3, "zze"

    aput-object v3, p1, p2

    sget-object p2, LJE8;->a:Lf98;

    aput-object p2, p1, v2

    const-string p2, "zzf"

    aput-object p2, p1, v1

    const-string p2, "zzg"

    aput-object p2, p1, v0

    const-string p2, "zzh"

    aput-object p2, p1, p3

    sget-object p2, LCy8;->zza:LCy8;

    const-string p3, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0005\u1009\u0003"

    invoke-static {p2, p3, p1}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
