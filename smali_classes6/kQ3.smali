.class public final LkQ3;
.super Lcom/google/protobuf/r;
.source "SourceFile"

# interfaces
.implements LlQ3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LkQ3$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/r<",
        "LkQ3;",
        "LkQ3$b;",
        ">;",
        "LlQ3;"
    }
.end annotation


# static fields
.field public static final APPLICATION_INFO_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:LkQ3;

.field public static final GAUGE_METRIC_FIELD_NUMBER:I = 0x4

.field public static final NETWORK_REQUEST_METRIC_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:LVH3; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LVH3<",
            "LkQ3;",
            ">;"
        }
    .end annotation
.end field

.field public static final TRACE_METRIC_FIELD_NUMBER:I = 0x2

.field public static final TRANSPORT_INFO_FIELD_NUMBER:I = 0x5


# instance fields
.field private applicationInfo_:Ldm;

.field private bitField0_:I

.field private gaugeMetric_:LgB1;

.field private networkRequestMetric_:LL73;

.field private traceMetric_:Lg66;

.field private transportInfo_:LY96;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LkQ3;

    invoke-direct {v0}, LkQ3;-><init>()V

    sput-object v0, LkQ3;->DEFAULT_INSTANCE:LkQ3;

    const-class v1, LkQ3;

    invoke-static {v1, v0}, Lcom/google/protobuf/r;->Q(Ljava/lang/Class;Lcom/google/protobuf/r;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/protobuf/r;-><init>()V

    return-void
.end method

.method public static synthetic T()LkQ3;
    .locals 1

    sget-object v0, LkQ3;->DEFAULT_INSTANCE:LkQ3;

    return-object v0
.end method

.method public static synthetic U(LkQ3;Ldm;)V
    .locals 0

    invoke-virtual {p0, p1}, LkQ3;->b0(Ldm;)V

    return-void
.end method

.method public static synthetic V(LkQ3;LgB1;)V
    .locals 0

    invoke-virtual {p0, p1}, LkQ3;->c0(LgB1;)V

    return-void
.end method

.method public static synthetic W(LkQ3;Lg66;)V
    .locals 0

    invoke-virtual {p0, p1}, LkQ3;->e0(Lg66;)V

    return-void
.end method

.method public static synthetic X(LkQ3;LL73;)V
    .locals 0

    invoke-virtual {p0, p1}, LkQ3;->d0(LL73;)V

    return-void
.end method

.method public static a0()LkQ3$b;
    .locals 1

    sget-object v0, LkQ3;->DEFAULT_INSTANCE:LkQ3;

    invoke-virtual {v0}, Lcom/google/protobuf/r;->u()Lcom/google/protobuf/r$a;

    move-result-object v0

    check-cast v0, LkQ3$b;

    return-object v0
.end method


# virtual methods
.method public Y()Ldm;
    .locals 1

    iget-object v0, p0, LkQ3;->applicationInfo_:Ldm;

    if-nez v0, :cond_0

    invoke-static {}, Ldm;->a0()Ldm;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public Z()Z
    .locals 2

    iget v0, p0, LkQ3;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final b0(Ldm;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LkQ3;->applicationInfo_:Ldm;

    iget p1, p0, LkQ3;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, LkQ3;->bitField0_:I

    return-void
.end method

.method public final c0(LgB1;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LkQ3;->gaugeMetric_:LgB1;

    iget p1, p0, LkQ3;->bitField0_:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, LkQ3;->bitField0_:I

    return-void
.end method

.method public final d0(LL73;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LkQ3;->networkRequestMetric_:LL73;

    iget p1, p0, LkQ3;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, LkQ3;->bitField0_:I

    return-void
.end method

.method public e()LL73;
    .locals 1

    iget-object v0, p0, LkQ3;->networkRequestMetric_:LL73;

    if-nez v0, :cond_0

    invoke-static {}, LL73;->m0()LL73;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final e0(Lg66;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LkQ3;->traceMetric_:Lg66;

    iget p1, p0, LkQ3;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, LkQ3;->bitField0_:I

    return-void
.end method

.method public g()LgB1;
    .locals 1

    iget-object v0, p0, LkQ3;->gaugeMetric_:LgB1;

    if-nez v0, :cond_0

    invoke-static {}, LgB1;->e0()LgB1;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public h()Z
    .locals 1

    iget v0, p0, LkQ3;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j()Z
    .locals 1

    iget v0, p0, LkQ3;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k()Z
    .locals 1

    iget v0, p0, LkQ3;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l()Lg66;
    .locals 1

    iget-object v0, p0, LkQ3;->traceMetric_:Lg66;

    if-nez v0, :cond_0

    invoke-static {}, Lg66;->o0()Lg66;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final x(Lcom/google/protobuf/r$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, LkQ3$a;->a:[I

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
    sget-object p1, LkQ3;->PARSER:LVH3;

    if-nez p1, :cond_1

    const-class p2, LkQ3;

    monitor-enter p2

    :try_start_0
    sget-object p1, LkQ3;->PARSER:LVH3;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/r$b;

    sget-object p3, LkQ3;->DEFAULT_INSTANCE:LkQ3;

    invoke-direct {p1, p3}, Lcom/google/protobuf/r$b;-><init>(Lcom/google/protobuf/r;)V

    sput-object p1, LkQ3;->PARSER:LVH3;

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
    sget-object p1, LkQ3;->DEFAULT_INSTANCE:LkQ3;

    return-object p1

    :pswitch_4
    const/4 p1, 0x6

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "bitField0_"

    aput-object v0, p1, p3

    const-string p3, "applicationInfo_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "traceMetric_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "networkRequestMetric_"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "gaugeMetric_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "transportInfo_"

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1009\u0004"

    sget-object p3, LkQ3;->DEFAULT_INSTANCE:LkQ3;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/r;->N(Lcom/google/protobuf/D;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, LkQ3$b;

    invoke-direct {p1, p3}, LkQ3$b;-><init>(LkQ3$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, LkQ3;

    invoke-direct {p1}, LkQ3;-><init>()V

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
