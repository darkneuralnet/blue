.class public final Lcom/google/android/gms/internal/vision/l;
.super Lcom/google/android/gms/internal/vision/G;
.source "SourceFile"

# interfaces
.implements LHQ8;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/vision/l$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/vision/G<",
        "Lcom/google/android/gms/internal/vision/l;",
        "Lcom/google/android/gms/internal/vision/l$a;",
        ">;",
        "LHQ8;"
    }
.end annotation


# static fields
.field private static final zzf:Lcom/google/android/gms/internal/vision/l;

.field private static volatile zzg:LTS8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LTS8<",
            "Lcom/google/android/gms/internal/vision/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zzc:I

.field private zzd:J

.field private zze:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/vision/l;

    invoke-direct {v0}, Lcom/google/android/gms/internal/vision/l;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/vision/l;->zzf:Lcom/google/android/gms/internal/vision/l;

    const-class v1, Lcom/google/android/gms/internal/vision/l;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/vision/G;->p(Ljava/lang/Class;Lcom/google/android/gms/internal/vision/G;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/G;-><init>()V

    return-void
.end method

.method public static synthetic u()Lcom/google/android/gms/internal/vision/l;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/vision/l;->zzf:Lcom/google/android/gms/internal/vision/l;

    return-object v0
.end method


# virtual methods
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
    sget-object p1, Lcom/google/android/gms/internal/vision/l;->zzg:LTS8;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/vision/l;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/vision/l;->zzg:LTS8;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/vision/G$a;

    sget-object p3, Lcom/google/android/gms/internal/vision/l;->zzf:Lcom/google/android/gms/internal/vision/l;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/vision/G$a;-><init>(Lcom/google/android/gms/internal/vision/G;)V

    sput-object p1, Lcom/google/android/gms/internal/vision/l;->zzg:LTS8;

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
    sget-object p1, Lcom/google/android/gms/internal/vision/l;->zzf:Lcom/google/android/gms/internal/vision/l;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zzc"

    aput-object v0, p1, p2

    const-string p2, "zzd"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "zze"

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001"

    sget-object p3, Lcom/google/android/gms/internal/vision/l;->zzf:Lcom/google/android/gms/internal/vision/l;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/vision/G;->n(LlQ8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/vision/l$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/vision/l$a;-><init>(Lcom/google/android/gms/internal/vision/p;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/vision/l;

    invoke-direct {p1}, Lcom/google/android/gms/internal/vision/l;-><init>()V

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
