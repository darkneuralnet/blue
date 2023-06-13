.class public final Lcom/google/android/gms/internal/vision/b;
.super Lcom/google/android/gms/internal/vision/G;
.source "SourceFile"

# interfaces
.implements LHQ8;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/vision/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/vision/G<",
        "Lcom/google/android/gms/internal/vision/b;",
        "Lcom/google/android/gms/internal/vision/b$a;",
        ">;",
        "LHQ8;"
    }
.end annotation


# static fields
.field private static final zzd:LiJ8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LiJ8<",
            "Ljava/lang/Integer;",
            "LPs8;",
            ">;"
        }
    .end annotation
.end field

.field private static final zze:Lcom/google/android/gms/internal/vision/b;

.field private static volatile zzf:LTS8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LTS8<",
            "Lcom/google/android/gms/internal/vision/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zzc:LuJ8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lji8;

    invoke-direct {v0}, Lji8;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/vision/b;->zzd:LiJ8;

    new-instance v0, Lcom/google/android/gms/internal/vision/b;

    invoke-direct {v0}, Lcom/google/android/gms/internal/vision/b;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/vision/b;->zze:Lcom/google/android/gms/internal/vision/b;

    const-class v1, Lcom/google/android/gms/internal/vision/b;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/vision/G;->p(Ljava/lang/Class;Lcom/google/android/gms/internal/vision/G;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/G;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/vision/G;->s()LuJ8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/vision/b;->zzc:LuJ8;

    return-void
.end method

.method public static synthetic u()Lcom/google/android/gms/internal/vision/b;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/vision/b;->zze:Lcom/google/android/gms/internal/vision/b;

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
    sget-object p1, Lcom/google/android/gms/internal/vision/b;->zzf:LTS8;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/vision/b;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/vision/b;->zzf:LTS8;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/vision/G$a;

    sget-object p3, Lcom/google/android/gms/internal/vision/b;->zze:Lcom/google/android/gms/internal/vision/b;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/vision/G$a;-><init>(Lcom/google/android/gms/internal/vision/G;)V

    sput-object p1, Lcom/google/android/gms/internal/vision/b;->zzf:LTS8;

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
    sget-object p1, Lcom/google/android/gms/internal/vision/b;->zze:Lcom/google/android/gms/internal/vision/b;

    return-object p1

    :pswitch_4
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zzc"

    aput-object v0, p1, p2

    invoke-static {}, LPs8;->b()LKI8;

    move-result-object p2

    aput-object p2, p1, p3

    const-string p2, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e"

    sget-object p3, Lcom/google/android/gms/internal/vision/b;->zze:Lcom/google/android/gms/internal/vision/b;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/vision/G;->n(LlQ8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/vision/b$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/vision/b$a;-><init>(Lcom/google/android/gms/internal/vision/p;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/vision/b;

    invoke-direct {p1}, Lcom/google/android/gms/internal/vision/b;-><init>()V

    return-object p1

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
