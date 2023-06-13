.class public final LgB1;
.super Lcom/google/protobuf/r;
.source "SourceFile"

# interfaces
.implements LwT2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LgB1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/r<",
        "LgB1;",
        "LgB1$b;",
        ">;",
        "LwT2;"
    }
.end annotation


# static fields
.field public static final ANDROID_MEMORY_READINGS_FIELD_NUMBER:I = 0x4

.field public static final CPU_METRIC_READINGS_FIELD_NUMBER:I = 0x2

.field private static final DEFAULT_INSTANCE:LgB1;

.field public static final GAUGE_METADATA_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:LVH3; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LVH3<",
            "LgB1;",
            ">;"
        }
    .end annotation
.end field

.field public static final SESSION_ID_FIELD_NUMBER:I = 0x1


# instance fields
.field private androidMemoryReadings_:Lcom/google/protobuf/t$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/t$i<",
            "Lcd;",
            ">;"
        }
    .end annotation
.end field

.field private bitField0_:I

.field private cpuMetricReadings_:Lcom/google/protobuf/t$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/t$i<",
            "LQD0;",
            ">;"
        }
    .end annotation
.end field

.field private gaugeMetadata_:LeB1;

.field private sessionId_:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LgB1;

    invoke-direct {v0}, LgB1;-><init>()V

    sput-object v0, LgB1;->DEFAULT_INSTANCE:LgB1;

    const-class v1, LgB1;

    invoke-static {v1, v0}, Lcom/google/protobuf/r;->Q(Ljava/lang/Class;Lcom/google/protobuf/r;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/r;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LgB1;->sessionId_:Ljava/lang/String;

    invoke-static {}, Lcom/google/protobuf/r;->z()Lcom/google/protobuf/t$i;

    move-result-object v0

    iput-object v0, p0, LgB1;->cpuMetricReadings_:Lcom/google/protobuf/t$i;

    invoke-static {}, Lcom/google/protobuf/r;->z()Lcom/google/protobuf/t$i;

    move-result-object v0

    iput-object v0, p0, LgB1;->androidMemoryReadings_:Lcom/google/protobuf/t$i;

    return-void
.end method

.method public static synthetic T()LgB1;
    .locals 1

    sget-object v0, LgB1;->DEFAULT_INSTANCE:LgB1;

    return-object v0
.end method

.method public static synthetic U(LgB1;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, LgB1;->l0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic V(LgB1;Lcd;)V
    .locals 0

    invoke-virtual {p0, p1}, LgB1;->Y(Lcd;)V

    return-void
.end method

.method public static synthetic W(LgB1;LeB1;)V
    .locals 0

    invoke-virtual {p0, p1}, LgB1;->k0(LeB1;)V

    return-void
.end method

.method public static synthetic X(LgB1;LQD0;)V
    .locals 0

    invoke-virtual {p0, p1}, LgB1;->Z(LQD0;)V

    return-void
.end method

.method public static e0()LgB1;
    .locals 1

    sget-object v0, LgB1;->DEFAULT_INSTANCE:LgB1;

    return-object v0
.end method

.method public static i0()LgB1$b;
    .locals 1

    sget-object v0, LgB1;->DEFAULT_INSTANCE:LgB1;

    invoke-virtual {v0}, Lcom/google/protobuf/r;->u()Lcom/google/protobuf/r$a;

    move-result-object v0

    check-cast v0, LgB1$b;

    return-object v0
.end method


# virtual methods
.method public final Y(Lcd;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, LgB1;->a0()V

    iget-object v0, p0, LgB1;->androidMemoryReadings_:Lcom/google/protobuf/t$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final Z(LQD0;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, LgB1;->b0()V

    iget-object v0, p0, LgB1;->cpuMetricReadings_:Lcom/google/protobuf/t$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a0()V
    .locals 2

    iget-object v0, p0, LgB1;->androidMemoryReadings_:Lcom/google/protobuf/t$i;

    invoke-interface {v0}, Lcom/google/protobuf/t$i;->t()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/r;->L(Lcom/google/protobuf/t$i;)Lcom/google/protobuf/t$i;

    move-result-object v0

    iput-object v0, p0, LgB1;->androidMemoryReadings_:Lcom/google/protobuf/t$i;

    :cond_0
    return-void
.end method

.method public final b0()V
    .locals 2

    iget-object v0, p0, LgB1;->cpuMetricReadings_:Lcom/google/protobuf/t$i;

    invoke-interface {v0}, Lcom/google/protobuf/t$i;->t()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/r;->L(Lcom/google/protobuf/t$i;)Lcom/google/protobuf/t$i;

    move-result-object v0

    iput-object v0, p0, LgB1;->cpuMetricReadings_:Lcom/google/protobuf/t$i;

    :cond_0
    return-void
.end method

.method public c0()I
    .locals 1

    iget-object v0, p0, LgB1;->androidMemoryReadings_:Lcom/google/protobuf/t$i;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public d0()I
    .locals 1

    iget-object v0, p0, LgB1;->cpuMetricReadings_:Lcom/google/protobuf/t$i;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public f0()LeB1;
    .locals 1

    iget-object v0, p0, LgB1;->gaugeMetadata_:LeB1;

    if-nez v0, :cond_0

    invoke-static {}, LeB1;->X()LeB1;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public g0()Z
    .locals 1

    iget v0, p0, LgB1;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public h0()Z
    .locals 2

    iget v0, p0, LgB1;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final k0(LeB1;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LgB1;->gaugeMetadata_:LeB1;

    iget p1, p0, LgB1;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, LgB1;->bitField0_:I

    return-void
.end method

.method public final l0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, LgB1;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LgB1;->bitField0_:I

    iput-object p1, p0, LgB1;->sessionId_:Ljava/lang/String;

    return-void
.end method

.method public final x(Lcom/google/protobuf/r$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, LgB1$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p3

    :pswitch_1
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, LgB1;->PARSER:LVH3;

    if-nez p1, :cond_1

    const-class p2, LgB1;

    monitor-enter p2

    :try_start_0
    sget-object p1, LgB1;->PARSER:LVH3;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/r$b;

    sget-object p3, LgB1;->DEFAULT_INSTANCE:LgB1;

    invoke-direct {p1, p3}, Lcom/google/protobuf/r$b;-><init>(Lcom/google/protobuf/r;)V

    sput-object p1, LgB1;->PARSER:LVH3;

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
    sget-object p1, LgB1;->DEFAULT_INSTANCE:LgB1;

    return-object p1

    :pswitch_4
    const/4 p1, 0x7

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "bitField0_"

    aput-object v0, p1, p3

    const-string p3, "sessionId_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "cpuMetricReadings_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-class p3, LQD0;

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "gaugeMetadata_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "androidMemoryReadings_"

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-class p3, Lcd;

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u1009\u0001\u0004\u001b"

    sget-object p3, LgB1;->DEFAULT_INSTANCE:LgB1;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/r;->N(Lcom/google/protobuf/D;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, LgB1$b;

    invoke-direct {p1, p3}, LgB1$b;-><init>(LgB1$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, LgB1;

    invoke-direct {p1}, LgB1;-><init>()V

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
