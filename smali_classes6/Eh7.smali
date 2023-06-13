.class public final LEh7;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# static fields
.field private static final zza:LEh7;


# instance fields
.field private zzd:I

.field private zze:D

.field private zzf:D

.field private zzg:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LEh7;

    invoke-direct {v0}, LEh7;-><init>()V

    sput-object v0, LEh7;->zza:LEh7;

    const-class v1, LEh7;

    invoke-static {v1, v0}, LV78;->w(Ljava/lang/Class;LV78;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LV78;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LEh7;->zzg:B

    return-void
.end method

.method public static synthetic J()LEh7;
    .locals 1

    sget-object v0, LEh7;->zza:LEh7;

    return-object v0
.end method

.method public static K()LEh7;
    .locals 1

    sget-object v0, LEh7;->zza:LEh7;

    return-object v0
.end method


# virtual methods
.method public final G(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_4

    if-eq p1, v1, :cond_3

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-eq p1, v1, :cond_2

    const/4 v1, 0x5

    if-eq p1, v1, :cond_1

    if-nez p2, :cond_0

    move p3, v0

    :cond_0
    iput-byte p3, p0, LEh7;->zzg:B

    return-object v2

    :cond_1
    sget-object p1, LEh7;->zza:LEh7;

    return-object p1

    :cond_2
    new-instance p1, LJg7;

    invoke-direct {p1, v2}, LJg7;-><init>(Lqf7;)V

    return-object p1

    :cond_3
    new-instance p1, LEh7;

    invoke-direct {p1}, LEh7;-><init>()V

    return-object p1

    :cond_4
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "zzd"

    aput-object p2, p1, v0

    const-string p2, "zze"

    aput-object p2, p1, p3

    const-string p2, "zzf"

    aput-object p2, p1, v2

    sget-object p2, LEh7;->zza:LEh7;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1500\u0000\u0002\u1500\u0001"

    invoke-static {p2, p3, p1}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LEh7;->zzg:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final H()D
    .locals 2

    iget-wide v0, p0, LEh7;->zze:D

    return-wide v0
.end method

.method public final I()D
    .locals 2

    iget-wide v0, p0, LEh7;->zzf:D

    return-wide v0
.end method
