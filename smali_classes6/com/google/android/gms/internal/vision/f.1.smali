.class public final Lcom/google/android/gms/internal/vision/f;
.super Lcom/google/android/gms/internal/vision/G;
.source "SourceFile"

# interfaces
.implements LHQ8;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/vision/f$b;,
        Lcom/google/android/gms/internal/vision/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/vision/G<",
        "Lcom/google/android/gms/internal/vision/f;",
        "Lcom/google/android/gms/internal/vision/f$b;",
        ">;",
        "LHQ8;"
    }
.end annotation


# static fields
.field private static final zzl:Lcom/google/android/gms/internal/vision/f;

.field private static volatile zzm:LTS8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LTS8<",
            "Lcom/google/android/gms/internal/vision/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zzc:I

.field private zzd:Ljava/lang/String;

.field private zze:Ljava/lang/String;

.field private zzf:LRJ8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LRJ8<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private zzg:I

.field private zzh:Ljava/lang/String;

.field private zzi:J

.field private zzj:J

.field private zzk:LRJ8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LRJ8<",
            "Lcom/google/android/gms/internal/vision/n;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/vision/f;

    invoke-direct {v0}, Lcom/google/android/gms/internal/vision/f;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/vision/f;->zzl:Lcom/google/android/gms/internal/vision/f;

    const-class v1, Lcom/google/android/gms/internal/vision/f;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/vision/G;->p(Ljava/lang/Class;Lcom/google/android/gms/internal/vision/G;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/G;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/vision/f;->zzd:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/vision/f;->zze:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/vision/G;->t()LRJ8;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/vision/f;->zzf:LRJ8;

    iput-object v0, p0, Lcom/google/android/gms/internal/vision/f;->zzh:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/vision/G;->t()LRJ8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/vision/f;->zzk:LRJ8;

    return-void
.end method

.method public static synthetic C()Lcom/google/android/gms/internal/vision/f;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/vision/f;->zzl:Lcom/google/android/gms/internal/vision/f;

    return-object v0
.end method

.method public static synthetic E(Lcom/google/android/gms/internal/vision/f;J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/vision/f;->D(J)V

    return-void
.end method

.method public static u()Lcom/google/android/gms/internal/vision/f$b;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/vision/f;->zzl:Lcom/google/android/gms/internal/vision/f;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/vision/G;->r()Lcom/google/android/gms/internal/vision/G$b;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/vision/f$b;

    return-object v0
.end method

.method public static synthetic w(Lcom/google/android/gms/internal/vision/f;J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/vision/f;->v(J)V

    return-void
.end method

.method public static synthetic y(Lcom/google/android/gms/internal/vision/f;Ljava/lang/Iterable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/vision/f;->A(Ljava/lang/Iterable;)V

    return-void
.end method

.method public static synthetic z(Lcom/google/android/gms/internal/vision/f;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/vision/f;->B(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/Iterable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/android/gms/internal/vision/n;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/vision/f;->zzk:LRJ8;

    invoke-interface {v0}, LRJ8;->zza()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/vision/G;->o(LRJ8;)LRJ8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/vision/f;->zzk:LRJ8;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/f;->zzk:LRJ8;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/vision/C;->c(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public final B(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/vision/f;->zzc:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/vision/f;->zzc:I

    iput-object p1, p0, Lcom/google/android/gms/internal/vision/f;->zzd:Ljava/lang/String;

    return-void
.end method

.method public final D(J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/vision/f;->zzc:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/google/android/gms/internal/vision/f;->zzc:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/vision/f;->zzj:J

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
    sget-object p1, Lcom/google/android/gms/internal/vision/f;->zzm:LTS8;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/vision/f;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/vision/f;->zzm:LTS8;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/vision/G$a;

    sget-object p3, Lcom/google/android/gms/internal/vision/f;->zzl:Lcom/google/android/gms/internal/vision/f;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/vision/G$a;-><init>(Lcom/google/android/gms/internal/vision/G;)V

    sput-object p1, Lcom/google/android/gms/internal/vision/f;->zzm:LTS8;

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
    sget-object p1, Lcom/google/android/gms/internal/vision/f;->zzl:Lcom/google/android/gms/internal/vision/f;

    return-object p1

    :pswitch_4
    const/16 p1, 0xb

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

    const-string p3, "zzg"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    invoke-static {}, Lcom/google/android/gms/internal/vision/f$a;->b()LKI8;

    move-result-object p3

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-string p3, "zzh"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-class p3, Lcom/google/android/gms/internal/vision/n;

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0008\u0000\u0001\u0001\u0008\u0008\u0000\u0002\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u001a\u0004\u100c\u0002\u0005\u1008\u0003\u0006\u1002\u0004\u0007\u1002\u0005\u0008\u001b"

    sget-object p3, Lcom/google/android/gms/internal/vision/f;->zzl:Lcom/google/android/gms/internal/vision/f;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/vision/G;->n(LlQ8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/vision/f$b;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/vision/f$b;-><init>(Lcom/google/android/gms/internal/vision/p;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/vision/f;

    invoke-direct {p1}, Lcom/google/android/gms/internal/vision/f;-><init>()V

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

.method public final v(J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/vision/f;->zzc:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/google/android/gms/internal/vision/f;->zzc:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/vision/f;->zzi:J

    return-void
.end method
