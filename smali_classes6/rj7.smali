.class public final Lrj7;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# static fields
.field private static final zza:Lrj7;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:I

.field private zzg:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrj7;

    invoke-direct {v0}, Lrj7;-><init>()V

    sput-object v0, Lrj7;->zza:Lrj7;

    const-class v1, Lrj7;

    invoke-static {v1, v0}, LV78;->w(Ljava/lang/Class;LV78;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LV78;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lrj7;->zzg:B

    return-void
.end method

.method public static J()Lzi7;
    .locals 1

    sget-object v0, Lrj7;->zza:Lrj7;

    invoke-virtual {v0}, LV78;->f()Lk58;

    move-result-object v0

    check-cast v0, Lzi7;

    return-object v0
.end method

.method public static synthetic K()Lrj7;
    .locals 1

    sget-object v0, Lrj7;->zza:Lrj7;

    return-object v0
.end method

.method public static synthetic L(Lrj7;I)V
    .locals 1

    iget v0, p0, Lrj7;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lrj7;->zzd:I

    iput p1, p0, Lrj7;->zze:I

    return-void
.end method

.method public static synthetic M(Lrj7;I)V
    .locals 1

    iget v0, p0, Lrj7;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lrj7;->zzd:I

    iput p1, p0, Lrj7;->zzf:I

    return-void
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
    iput-byte p3, p0, Lrj7;->zzg:B

    return-object v2

    :cond_1
    sget-object p1, Lrj7;->zza:Lrj7;

    return-object p1

    :cond_2
    new-instance p1, Lzi7;

    invoke-direct {p1, v2}, Lzi7;-><init>(Lqf7;)V

    return-object p1

    :cond_3
    new-instance p1, Lrj7;

    invoke-direct {p1}, Lrj7;-><init>()V

    return-object p1

    :cond_4
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "zzd"

    aput-object p2, p1, v0

    const-string p2, "zze"

    aput-object p2, p1, p3

    const-string p2, "zzf"

    aput-object p2, p1, v2

    sget-object p2, Lrj7;->zza:Lrj7;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1504\u0000\u0002\u1504\u0001"

    invoke-static {p2, p3, p1}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, Lrj7;->zzg:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final H()I
    .locals 1

    iget v0, p0, Lrj7;->zze:I

    return v0
.end method

.method public final I()I
    .locals 1

    iget v0, p0, Lrj7;->zzf:I

    return v0
.end method
