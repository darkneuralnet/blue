.class public final Lcom/google/android/gms/internal/places/j;
.super Lcom/google/android/gms/internal/places/c;
.source "SourceFile"

# interfaces
.implements LZT7;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/places/j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/places/c<",
        "Lcom/google/android/gms/internal/places/j;",
        "Lcom/google/android/gms/internal/places/j$a;",
        ">;",
        "LZT7;"
    }
.end annotation


# static fields
.field private static final zzdr:Lcom/google/android/gms/internal/places/j;

.field private static volatile zzds:LQV7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LQV7<",
            "Lcom/google/android/gms/internal/places/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zzdo:LBI7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LBI7<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private zzdp:LsJ7;

.field private zzdq:LBI7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LBI7<",
            "Ljv9;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/places/j;

    invoke-direct {v0}, Lcom/google/android/gms/internal/places/j;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/places/j;->zzdr:Lcom/google/android/gms/internal/places/j;

    const-class v1, Lcom/google/android/gms/internal/places/j;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/places/c;->n(Ljava/lang/Class;Lcom/google/android/gms/internal/places/c;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/places/c;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/places/c;->q()LBI7;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/places/j;->zzdo:LBI7;

    invoke-static {}, Lcom/google/android/gms/internal/places/c;->p()LsJ7;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/places/j;->zzdp:LsJ7;

    invoke-static {}, Lcom/google/android/gms/internal/places/c;->q()LBI7;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/places/j;->zzdq:LBI7;

    return-void
.end method

.method public static synthetic A()Lcom/google/android/gms/internal/places/j;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/places/j;->zzdr:Lcom/google/android/gms/internal/places/j;

    return-object v0
.end method

.method public static s([B)Lcom/google/android/gms/internal/places/j;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/places/zzbk;
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/places/j;->zzdr:Lcom/google/android/gms/internal/places/j;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/places/c;->i(Lcom/google/android/gms/internal/places/c;[B)Lcom/google/android/gms/internal/places/c;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/places/j;

    return-object p0
.end method


# virtual methods
.method public final k(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcom/google/android/gms/internal/places/i;->a:[I

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
    sget-object p1, Lcom/google/android/gms/internal/places/j;->zzds:LQV7;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/places/j;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/places/j;->zzds:LQV7;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/places/c$c;

    sget-object p3, Lcom/google/android/gms/internal/places/j;->zzdr:Lcom/google/android/gms/internal/places/j;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/places/c$c;-><init>(Lcom/google/android/gms/internal/places/c;)V

    sput-object p1, Lcom/google/android/gms/internal/places/j;->zzds:LQV7;

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
    sget-object p1, Lcom/google/android/gms/internal/places/j;->zzdr:Lcom/google/android/gms/internal/places/j;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zzdo"

    aput-object v0, p1, p2

    const-string p2, "zzdp"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "zzdq"

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001a\u0002\u0016\u0003\u001c"

    sget-object p3, Lcom/google/android/gms/internal/places/j;->zzdr:Lcom/google/android/gms/internal/places/j;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/places/c;->m(LzT7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/places/j$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/places/j$a;-><init>(Lcom/google/android/gms/internal/places/i;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/places/j;

    invoke-direct {p1}, Lcom/google/android/gms/internal/places/j;-><init>()V

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

.method public final t()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/places/j;->zzdo:LBI7;

    return-object v0
.end method

.method public final u()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/places/j;->zzdo:LBI7;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final w()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/places/j;->zzdp:LsJ7;

    return-object v0
.end method

.method public final x()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/places/j;->zzdp:LsJ7;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final y()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljv9;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/places/j;->zzdq:LBI7;

    return-object v0
.end method

.method public final z()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/places/j;->zzdq:LBI7;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
