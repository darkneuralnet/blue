.class public final LeB1;
.super Lcom/google/protobuf/r;
.source "SourceFile"

# interfaces
.implements LwT2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LeB1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/r<",
        "LeB1;",
        "LeB1$b;",
        ">;",
        "LwT2;"
    }
.end annotation


# static fields
.field public static final CPU_CLOCK_RATE_KHZ_FIELD_NUMBER:I = 0x2

.field public static final CPU_PROCESSOR_COUNT_FIELD_NUMBER:I = 0x6

.field private static final DEFAULT_INSTANCE:LeB1;

.field public static final DEVICE_RAM_SIZE_KB_FIELD_NUMBER:I = 0x3

.field public static final MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER:I = 0x4

.field public static final MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER:I = 0x5

.field private static volatile PARSER:LVH3; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LVH3<",
            "LeB1;",
            ">;"
        }
    .end annotation
.end field

.field public static final PROCESS_NAME_FIELD_NUMBER:I = 0x1


# instance fields
.field private bitField0_:I

.field private cpuClockRateKhz_:I

.field private cpuProcessorCount_:I

.field private deviceRamSizeKb_:I

.field private maxAppJavaHeapMemoryKb_:I

.field private maxEncouragedAppJavaHeapMemoryKb_:I

.field private processName_:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LeB1;

    invoke-direct {v0}, LeB1;-><init>()V

    sput-object v0, LeB1;->DEFAULT_INSTANCE:LeB1;

    const-class v1, LeB1;

    invoke-static {v1, v0}, Lcom/google/protobuf/r;->Q(Ljava/lang/Class;Lcom/google/protobuf/r;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/r;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LeB1;->processName_:Ljava/lang/String;

    return-void
.end method

.method public static synthetic T()LeB1;
    .locals 1

    sget-object v0, LeB1;->DEFAULT_INSTANCE:LeB1;

    return-object v0
.end method

.method public static synthetic U(LeB1;I)V
    .locals 0

    invoke-virtual {p0, p1}, LeB1;->b0(I)V

    return-void
.end method

.method public static synthetic V(LeB1;I)V
    .locals 0

    invoke-virtual {p0, p1}, LeB1;->c0(I)V

    return-void
.end method

.method public static synthetic W(LeB1;I)V
    .locals 0

    invoke-virtual {p0, p1}, LeB1;->a0(I)V

    return-void
.end method

.method public static X()LeB1;
    .locals 1

    sget-object v0, LeB1;->DEFAULT_INSTANCE:LeB1;

    return-object v0
.end method

.method public static Z()LeB1$b;
    .locals 1

    sget-object v0, LeB1;->DEFAULT_INSTANCE:LeB1;

    invoke-virtual {v0}, Lcom/google/protobuf/r;->u()Lcom/google/protobuf/r$a;

    move-result-object v0

    check-cast v0, LeB1$b;

    return-object v0
.end method


# virtual methods
.method public Y()Z
    .locals 1

    iget v0, p0, LeB1;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final a0(I)V
    .locals 1

    iget v0, p0, LeB1;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, LeB1;->bitField0_:I

    iput p1, p0, LeB1;->deviceRamSizeKb_:I

    return-void
.end method

.method public final b0(I)V
    .locals 1

    iget v0, p0, LeB1;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, LeB1;->bitField0_:I

    iput p1, p0, LeB1;->maxAppJavaHeapMemoryKb_:I

    return-void
.end method

.method public final c0(I)V
    .locals 1

    iget v0, p0, LeB1;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, LeB1;->bitField0_:I

    iput p1, p0, LeB1;->maxEncouragedAppJavaHeapMemoryKb_:I

    return-void
.end method

.method public final x(Lcom/google/protobuf/r$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, LeB1$a;->a:[I

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
    sget-object p1, LeB1;->PARSER:LVH3;

    if-nez p1, :cond_1

    const-class p2, LeB1;

    monitor-enter p2

    :try_start_0
    sget-object p1, LeB1;->PARSER:LVH3;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/r$b;

    sget-object p3, LeB1;->DEFAULT_INSTANCE:LeB1;

    invoke-direct {p1, p3}, Lcom/google/protobuf/r$b;-><init>(Lcom/google/protobuf/r;)V

    sput-object p1, LeB1;->PARSER:LVH3;

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
    sget-object p1, LeB1;->DEFAULT_INSTANCE:LeB1;

    return-object p1

    :pswitch_4
    const/4 p1, 0x7

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "bitField0_"

    aput-object v0, p1, p3

    const-string p3, "processName_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "cpuClockRateKhz_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "deviceRamSizeKb_"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "maxAppJavaHeapMemoryKb_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "maxEncouragedAppJavaHeapMemoryKb_"

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-string p3, "cpuProcessorCount_"

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1004\u0003\u0004\u1004\u0004\u0005\u1004\u0005\u0006\u1004\u0002"

    sget-object p3, LeB1;->DEFAULT_INSTANCE:LeB1;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/r;->N(Lcom/google/protobuf/D;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, LeB1$b;

    invoke-direct {p1, p3}, LeB1$b;-><init>(LeB1$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, LeB1;

    invoke-direct {p1}, LeB1;-><init>()V

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
