.class public final LdT7;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# static fields
.field private static final zza:LdT7;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LdT7;

    invoke-direct {v0}, LdT7;-><init>()V

    sput-object v0, LdT7;->zza:LdT7;

    const-class v1, LdT7;

    invoke-static {v1, v0}, LV78;->w(Ljava/lang/Class;LV78;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LV78;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LdT7;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static synthetic H()LdT7;
    .locals 1

    sget-object v0, LdT7;->zza:LdT7;

    return-object v0
.end method

.method public static I()LdT7;
    .locals 1

    sget-object v0, LdT7;->zza:LdT7;

    return-object v0
.end method


# virtual methods
.method public final G(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x4

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    if-eq p1, v0, :cond_2

    const/4 p2, 0x0

    if-eq p1, p3, :cond_1

    const/4 p3, 0x5

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, LdT7;->zza:LdT7;

    return-object p1

    :cond_1
    new-instance p1, LUR7;

    invoke-direct {p1, p2}, LUR7;-><init>(LrO7;)V

    return-object p1

    :cond_2
    new-instance p1, LdT7;

    invoke-direct {p1}, LdT7;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v2, "zzd"

    aput-object v2, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    sget-object p2, LxS7;->a:Lf98;

    aput-object p2, p1, v1

    const-string p2, "zzf"

    aput-object p2, p1, v0

    sget-object p2, LdT7;->zza:LdT7;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001"

    invoke-static {p2, p3, p1}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final J()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LdT7;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final K()I
    .locals 1

    iget v0, p0, LdT7;->zze:I

    invoke-static {v0}, LOS7;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method
