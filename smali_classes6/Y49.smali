.class public final LY49;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# static fields
.field private static final zza:LY49;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:I

.field private zzg:I

.field private zzh:I

.field private zzi:I

.field private zzj:I

.field private zzk:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LY49;

    invoke-direct {v0}, LY49;-><init>()V

    sput-object v0, LY49;->zza:LY49;

    const-class v1, LY49;

    invoke-static {v1, v0}, LV78;->w(Ljava/lang/Class;LV78;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LV78;-><init>()V

    return-void
.end method

.method public static synthetic N()LY49;
    .locals 1

    sget-object v0, LY49;->zza:LY49;

    return-object v0
.end method

.method public static O()LY49;
    .locals 1

    sget-object v0, LY49;->zza:LY49;

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
    sget-object p1, LY49;->zza:LY49;

    return-object p1

    :cond_1
    new-instance p1, LBZ8;

    invoke-direct {p1, p2}, LBZ8;-><init>(Lqf7;)V

    return-object p1

    :cond_2
    new-instance p1, LY49;

    invoke-direct {p1}, LY49;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x8

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

    sget-object p2, LY49;->zza:LY49;

    const-string p3, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u1007\u0006"

    invoke-static {p2, p3, p1}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final H()I
    .locals 1

    iget v0, p0, LY49;->zzg:I

    return v0
.end method

.method public final I()I
    .locals 1

    iget v0, p0, LY49;->zzh:I

    return v0
.end method

.method public final J()I
    .locals 1

    iget v0, p0, LY49;->zzi:I

    return v0
.end method

.method public final K()I
    .locals 1

    iget v0, p0, LY49;->zzf:I

    return v0
.end method

.method public final L()I
    .locals 1

    iget v0, p0, LY49;->zzj:I

    return v0
.end method

.method public final M()I
    .locals 1

    iget v0, p0, LY49;->zze:I

    return v0
.end method

.method public final P()Z
    .locals 1

    iget-boolean v0, p0, LY49;->zzk:Z

    return v0
.end method
