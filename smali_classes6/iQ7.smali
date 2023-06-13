.class public final LiQ7;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# static fields
.field private static final zza:LiQ7;


# instance fields
.field private zzd:I

.field private zze:Lv98;

.field private zzf:Lv98;

.field private zzg:I

.field private zzh:I

.field private zzi:I

.field private zzj:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LiQ7;

    invoke-direct {v0}, LiQ7;-><init>()V

    sput-object v0, LiQ7;->zza:LiQ7;

    const-class v1, LiQ7;

    invoke-static {v1, v0}, LV78;->w(Ljava/lang/Class;LV78;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LV78;-><init>()V

    invoke-static {}, LV78;->m()Lv98;

    move-result-object v0

    iput-object v0, p0, LiQ7;->zze:Lv98;

    invoke-static {}, LV78;->m()Lv98;

    move-result-object v0

    iput-object v0, p0, LiQ7;->zzf:Lv98;

    return-void
.end method

.method public static H()LwC7;
    .locals 1

    sget-object v0, LiQ7;->zza:LiQ7;

    invoke-virtual {v0}, LV78;->f()Lk58;

    move-result-object v0

    check-cast v0, LwC7;

    return-object v0
.end method

.method public static synthetic I()LiQ7;
    .locals 1

    sget-object v0, LiQ7;->zza:LiQ7;

    return-object v0
.end method

.method public static synthetic J(LiQ7;I)V
    .locals 1

    iget v0, p0, LiQ7;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LiQ7;->zzd:I

    iput p1, p0, LiQ7;->zzh:I

    return-void
.end method

.method public static synthetic K(LiQ7;F)V
    .locals 2

    iget-object v0, p0, LiQ7;->zze:Lv98;

    invoke-interface {v0}, Lqa8;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, LV78;->n(Lv98;)Lv98;

    move-result-object v0

    iput-object v0, p0, LiQ7;->zze:Lv98;

    :cond_0
    iget-object p0, p0, LiQ7;->zze:Lv98;

    invoke-interface {p0, p1}, Lv98;->u0(F)V

    return-void
.end method

.method public static synthetic L(LiQ7;F)V
    .locals 2

    iget-object v0, p0, LiQ7;->zzf:Lv98;

    invoke-interface {v0}, Lqa8;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, LV78;->n(Lv98;)Lv98;

    move-result-object v0

    iput-object v0, p0, LiQ7;->zzf:Lv98;

    :cond_0
    iget-object p0, p0, LiQ7;->zzf:Lv98;

    invoke-interface {p0, p1}, Lv98;->u0(F)V

    return-void
.end method

.method public static synthetic M(LiQ7;I)V
    .locals 1

    iget v0, p0, LiQ7;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LiQ7;->zzd:I

    iput p1, p0, LiQ7;->zzg:I

    return-void
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
    sget-object p1, LiQ7;->zza:LiQ7;

    return-object p1

    :cond_1
    new-instance p1, LwC7;

    invoke-direct {p1, p2}, LwC7;-><init>(LZe7;)V

    return-object p1

    :cond_2
    new-instance p1, LiQ7;

    invoke-direct {p1}, LiQ7;-><init>()V

    return-object p1

    :cond_3
    const/4 p1, 0x7

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

    sget-object p2, LiQ7;->zza:LiQ7;

    const-string p3, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003\u100b\u0000\u0004\u100b\u0001\u0005\u100b\u0002\u0006\u100b\u0003"

    invoke-static {p2, p3, p1}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
