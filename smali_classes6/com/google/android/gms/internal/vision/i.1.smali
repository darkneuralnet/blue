.class public final Lcom/google/android/gms/internal/vision/i;
.super Lcom/google/android/gms/internal/vision/G;
.source "SourceFile"

# interfaces
.implements LHQ8;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/vision/i$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/vision/G<",
        "Lcom/google/android/gms/internal/vision/i;",
        "Lcom/google/android/gms/internal/vision/i$a;",
        ">;",
        "LHQ8;"
    }
.end annotation


# static fields
.field private static final zzg:Lcom/google/android/gms/internal/vision/i;

.field private static volatile zzh:LTS8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LTS8<",
            "Lcom/google/android/gms/internal/vision/i;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zzc:I

.field private zzd:Lcom/google/android/gms/internal/vision/j;

.field private zze:Lcom/google/android/gms/internal/vision/l;

.field private zzf:LRJ8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LRJ8<",
            "Lcom/google/android/gms/internal/vision/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/vision/i;

    invoke-direct {v0}, Lcom/google/android/gms/internal/vision/i;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/vision/i;->zzg:Lcom/google/android/gms/internal/vision/i;

    const-class v1, Lcom/google/android/gms/internal/vision/i;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/vision/G;->p(Ljava/lang/Class;Lcom/google/android/gms/internal/vision/G;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/G;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/vision/G;->t()LRJ8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/vision/i;->zzf:LRJ8;

    return-void
.end method

.method public static synthetic A()Lcom/google/android/gms/internal/vision/i;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/vision/i;->zzg:Lcom/google/android/gms/internal/vision/i;

    return-object v0
.end method

.method public static u()Lcom/google/android/gms/internal/vision/i$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/vision/i;->zzg:Lcom/google/android/gms/internal/vision/i;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/vision/G;->r()Lcom/google/android/gms/internal/vision/G$b;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/vision/i$a;

    return-object v0
.end method

.method public static synthetic v(Lcom/google/android/gms/internal/vision/i;Lcom/google/android/gms/internal/vision/j;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/vision/i;->y(Lcom/google/android/gms/internal/vision/j;)V

    return-void
.end method

.method public static synthetic w(Lcom/google/android/gms/internal/vision/i;Ljava/lang/Iterable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/vision/i;->z(Ljava/lang/Iterable;)V

    return-void
.end method


# virtual methods
.method public final B()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/vision/i;->zzf:LRJ8;

    invoke-interface {v0}, LRJ8;->zza()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/vision/G;->o(LRJ8;)LRJ8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/vision/i;->zzf:LRJ8;

    :cond_0
    return-void
.end method

.method public final l(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcom/google/android/gms/internal/vision/p;->a:[I

    const/4 p3, 0x1

    sub-int/2addr p1, p3

    aget p1, p2, p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p2

    :pswitch_1
    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/vision/i;->zzh:LTS8;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/vision/i;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/vision/i;->zzh:LTS8;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/vision/G$a;

    sget-object p3, Lcom/google/android/gms/internal/vision/i;->zzg:Lcom/google/android/gms/internal/vision/i;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/vision/G$a;-><init>(Lcom/google/android/gms/internal/vision/G;)V

    sput-object p1, Lcom/google/android/gms/internal/vision/i;->zzh:LTS8;

    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-object p1

    :pswitch_3
    sget-object p1, Lcom/google/android/gms/internal/vision/i;->zzg:Lcom/google/android/gms/internal/vision/i;

    return-object p1

    :pswitch_4
    const/4 p1, 0x5

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zzc"

    aput-object v0, p1, p2

    const-string p2, "zzd"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "zze"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "zzf"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-class p3, Lcom/google/android/gms/internal/vision/f;

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u001b"

    sget-object p3, Lcom/google/android/gms/internal/vision/i;->zzg:Lcom/google/android/gms/internal/vision/i;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/vision/G;->n(LlQ8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/vision/i$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/vision/i$a;-><init>(Lcom/google/android/gms/internal/vision/p;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/vision/i;

    invoke-direct {p1}, Lcom/google/android/gms/internal/vision/i;-><init>()V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final y(Lcom/google/android/gms/internal/vision/j;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/vision/i;->zzd:Lcom/google/android/gms/internal/vision/j;

    iget p1, p0, Lcom/google/android/gms/internal/vision/i;->zzc:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/vision/i;->zzc:I

    return-void
.end method

.method public final z(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/android/gms/internal/vision/f;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/i;->B()V

    iget-object v0, p0, Lcom/google/android/gms/internal/vision/i;->zzf:LRJ8;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/vision/C;->c(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method
