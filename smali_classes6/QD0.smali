.class public final LQD0;
.super Lcom/google/protobuf/r;
.source "SourceFile"

# interfaces
.implements LwT2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQD0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/r<",
        "LQD0;",
        "LQD0$b;",
        ">;",
        "LwT2;"
    }
.end annotation


# static fields
.field public static final CLIENT_TIME_US_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:LQD0;

.field private static volatile PARSER:LVH3; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LVH3<",
            "LQD0;",
            ">;"
        }
    .end annotation
.end field

.field public static final SYSTEM_TIME_US_FIELD_NUMBER:I = 0x3

.field public static final USER_TIME_US_FIELD_NUMBER:I = 0x2


# instance fields
.field private bitField0_:I

.field private clientTimeUs_:J

.field private systemTimeUs_:J

.field private userTimeUs_:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LQD0;

    invoke-direct {v0}, LQD0;-><init>()V

    sput-object v0, LQD0;->DEFAULT_INSTANCE:LQD0;

    const-class v1, LQD0;

    invoke-static {v1, v0}, Lcom/google/protobuf/r;->Q(Ljava/lang/Class;Lcom/google/protobuf/r;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/protobuf/r;-><init>()V

    return-void
.end method

.method public static synthetic T()LQD0;
    .locals 1

    sget-object v0, LQD0;->DEFAULT_INSTANCE:LQD0;

    return-object v0
.end method

.method public static synthetic U(LQD0;J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LQD0;->Y(J)V

    return-void
.end method

.method public static synthetic V(LQD0;J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LQD0;->a0(J)V

    return-void
.end method

.method public static synthetic W(LQD0;J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LQD0;->Z(J)V

    return-void
.end method

.method public static X()LQD0$b;
    .locals 1

    sget-object v0, LQD0;->DEFAULT_INSTANCE:LQD0;

    invoke-virtual {v0}, Lcom/google/protobuf/r;->u()Lcom/google/protobuf/r$a;

    move-result-object v0

    check-cast v0, LQD0$b;

    return-object v0
.end method


# virtual methods
.method public final Y(J)V
    .locals 1

    iget v0, p0, LQD0;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LQD0;->bitField0_:I

    iput-wide p1, p0, LQD0;->clientTimeUs_:J

    return-void
.end method

.method public final Z(J)V
    .locals 1

    iget v0, p0, LQD0;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, LQD0;->bitField0_:I

    iput-wide p1, p0, LQD0;->systemTimeUs_:J

    return-void
.end method

.method public final a0(J)V
    .locals 1

    iget v0, p0, LQD0;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LQD0;->bitField0_:I

    iput-wide p1, p0, LQD0;->userTimeUs_:J

    return-void
.end method

.method public final x(Lcom/google/protobuf/r$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, LQD0$a;->a:[I

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
    sget-object p1, LQD0;->PARSER:LVH3;

    if-nez p1, :cond_1

    const-class p2, LQD0;

    monitor-enter p2

    :try_start_0
    sget-object p1, LQD0;->PARSER:LVH3;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/r$b;

    sget-object p3, LQD0;->DEFAULT_INSTANCE:LQD0;

    invoke-direct {p1, p3}, Lcom/google/protobuf/r$b;-><init>(Lcom/google/protobuf/r;)V

    sput-object p1, LQD0;->PARSER:LVH3;

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
    sget-object p1, LQD0;->DEFAULT_INSTANCE:LQD0;

    return-object p1

    :pswitch_4
    const/4 p1, 0x4

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "bitField0_"

    aput-object v0, p1, p3

    const-string p3, "clientTimeUs_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "userTimeUs_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "systemTimeUs_"

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002"

    sget-object p3, LQD0;->DEFAULT_INSTANCE:LQD0;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/r;->N(Lcom/google/protobuf/D;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, LQD0$b;

    invoke-direct {p1, p3}, LQD0$b;-><init>(LQD0$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, LQD0;

    invoke-direct {p1}, LQD0;-><init>()V

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
