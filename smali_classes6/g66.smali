.class public final Lg66;
.super Lcom/google/protobuf/r;
.source "SourceFile"

# interfaces
.implements LwT2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg66$b;,
        Lg66$d;,
        Lg66$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/r<",
        "Lg66;",
        "Lg66$b;",
        ">;",
        "LwT2;"
    }
.end annotation


# static fields
.field public static final CLIENT_START_TIME_US_FIELD_NUMBER:I = 0x4

.field public static final COUNTERS_FIELD_NUMBER:I = 0x6

.field public static final CUSTOM_ATTRIBUTES_FIELD_NUMBER:I = 0x8

.field private static final DEFAULT_INSTANCE:Lg66;

.field public static final DURATION_US_FIELD_NUMBER:I = 0x5

.field public static final IS_AUTO_FIELD_NUMBER:I = 0x2

.field public static final NAME_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:LVH3; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LVH3<",
            "Lg66;",
            ">;"
        }
    .end annotation
.end field

.field public static final PERF_SESSIONS_FIELD_NUMBER:I = 0x9

.field public static final SUBTRACES_FIELD_NUMBER:I = 0x7


# instance fields
.field private bitField0_:I

.field private clientStartTimeUs_:J

.field private counters_:Lcom/google/protobuf/A;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/A<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private customAttributes_:Lcom/google/protobuf/A;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/A<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private durationUs_:J

.field private isAuto_:Z

.field private name_:Ljava/lang/String;

.field private perfSessions_:Lcom/google/protobuf/t$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/t$i<",
            "LnQ3;",
            ">;"
        }
    .end annotation
.end field

.field private subtraces_:Lcom/google/protobuf/t$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/t$i<",
            "Lg66;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg66;

    invoke-direct {v0}, Lg66;-><init>()V

    sput-object v0, Lg66;->DEFAULT_INSTANCE:Lg66;

    const-class v1, Lg66;

    invoke-static {v1, v0}, Lcom/google/protobuf/r;->Q(Ljava/lang/Class;Lcom/google/protobuf/r;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/r;-><init>()V

    invoke-static {}, Lcom/google/protobuf/A;->g()Lcom/google/protobuf/A;

    move-result-object v0

    iput-object v0, p0, Lg66;->counters_:Lcom/google/protobuf/A;

    invoke-static {}, Lcom/google/protobuf/A;->g()Lcom/google/protobuf/A;

    move-result-object v0

    iput-object v0, p0, Lg66;->customAttributes_:Lcom/google/protobuf/A;

    const-string v0, ""

    iput-object v0, p0, Lg66;->name_:Ljava/lang/String;

    invoke-static {}, Lcom/google/protobuf/r;->z()Lcom/google/protobuf/t$i;

    move-result-object v0

    iput-object v0, p0, Lg66;->subtraces_:Lcom/google/protobuf/t$i;

    invoke-static {}, Lcom/google/protobuf/r;->z()Lcom/google/protobuf/t$i;

    move-result-object v0

    iput-object v0, p0, Lg66;->perfSessions_:Lcom/google/protobuf/t$i;

    return-void
.end method

.method public static A0()Lg66$b;
    .locals 1

    sget-object v0, Lg66;->DEFAULT_INSTANCE:Lg66;

    invoke-virtual {v0}, Lcom/google/protobuf/r;->u()Lcom/google/protobuf/r$a;

    move-result-object v0

    check-cast v0, Lg66$b;

    return-object v0
.end method

.method public static synthetic T()Lg66;
    .locals 1

    sget-object v0, Lg66;->DEFAULT_INSTANCE:Lg66;

    return-object v0
.end method

.method public static synthetic U(Lg66;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lg66;->D0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic V(Lg66;)Ljava/util/Map;
    .locals 0

    invoke-virtual {p0}, Lg66;->q0()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic W(Lg66;Lg66;)V
    .locals 0

    invoke-virtual {p0, p1}, Lg66;->g0(Lg66;)V

    return-void
.end method

.method public static synthetic X(Lg66;Ljava/lang/Iterable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lg66;->e0(Ljava/lang/Iterable;)V

    return-void
.end method

.method public static synthetic Y(Lg66;)Ljava/util/Map;
    .locals 0

    invoke-virtual {p0}, Lg66;->r0()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Z(Lg66;LnQ3;)V
    .locals 0

    invoke-virtual {p0, p1}, Lg66;->f0(LnQ3;)V

    return-void
.end method

.method public static synthetic a0(Lg66;Ljava/lang/Iterable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lg66;->d0(Ljava/lang/Iterable;)V

    return-void
.end method

.method public static synthetic b0(Lg66;J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lg66;->B0(J)V

    return-void
.end method

.method public static synthetic c0(Lg66;J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lg66;->C0(J)V

    return-void
.end method

.method public static o0()Lg66;
    .locals 1

    sget-object v0, Lg66;->DEFAULT_INSTANCE:Lg66;

    return-object v0
.end method


# virtual methods
.method public final B0(J)V
    .locals 1

    iget v0, p0, Lg66;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lg66;->bitField0_:I

    iput-wide p1, p0, Lg66;->clientStartTimeUs_:J

    return-void
.end method

.method public final C0(J)V
    .locals 1

    iget v0, p0, Lg66;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lg66;->bitField0_:I

    iput-wide p1, p0, Lg66;->durationUs_:J

    return-void
.end method

.method public final D0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lg66;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lg66;->bitField0_:I

    iput-object p1, p0, Lg66;->name_:Ljava/lang/String;

    return-void
.end method

.method public final d0(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "LnQ3;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lg66;->i0()V

    iget-object v0, p0, Lg66;->perfSessions_:Lcom/google/protobuf/t$i;

    invoke-static {p1, v0}, Lcom/google/protobuf/a;->a(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public final e0(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lg66;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lg66;->k0()V

    iget-object v0, p0, Lg66;->subtraces_:Lcom/google/protobuf/t$i;

    invoke-static {p1, v0}, Lcom/google/protobuf/a;->a(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public final f0(LnQ3;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lg66;->i0()V

    iget-object v0, p0, Lg66;->perfSessions_:Lcom/google/protobuf/t$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final g0(Lg66;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lg66;->k0()V

    iget-object v0, p0, Lg66;->subtraces_:Lcom/google/protobuf/t$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public h0(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lg66;->x0()Lcom/google/protobuf/A;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final i0()V
    .locals 2

    iget-object v0, p0, Lg66;->perfSessions_:Lcom/google/protobuf/t$i;

    invoke-interface {v0}, Lcom/google/protobuf/t$i;->t()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/r;->L(Lcom/google/protobuf/t$i;)Lcom/google/protobuf/t$i;

    move-result-object v0

    iput-object v0, p0, Lg66;->perfSessions_:Lcom/google/protobuf/t$i;

    :cond_0
    return-void
.end method

.method public final k0()V
    .locals 2

    iget-object v0, p0, Lg66;->subtraces_:Lcom/google/protobuf/t$i;

    invoke-interface {v0}, Lcom/google/protobuf/t$i;->t()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/r;->L(Lcom/google/protobuf/t$i;)Lcom/google/protobuf/t$i;

    move-result-object v0

    iput-object v0, p0, Lg66;->subtraces_:Lcom/google/protobuf/t$i;

    :cond_0
    return-void
.end method

.method public l0()I
    .locals 1

    invoke-virtual {p0}, Lg66;->w0()Lcom/google/protobuf/A;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractMap;->size()I

    move-result v0

    return v0
.end method

.method public m0()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lg66;->w0()Lcom/google/protobuf/A;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public n0()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lg66;->x0()Lcom/google/protobuf/A;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public p0()J
    .locals 2

    iget-wide v0, p0, Lg66;->durationUs_:J

    return-wide v0
.end method

.method public final q0()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lg66;->y0()Lcom/google/protobuf/A;

    move-result-object v0

    return-object v0
.end method

.method public final r0()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lg66;->z0()Lcom/google/protobuf/A;

    move-result-object v0

    return-object v0
.end method

.method public s0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg66;->name_:Ljava/lang/String;

    return-object v0
.end method

.method public t0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LnQ3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg66;->perfSessions_:Lcom/google/protobuf/t$i;

    return-object v0
.end method

.method public u0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lg66;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg66;->subtraces_:Lcom/google/protobuf/t$i;

    return-object v0
.end method

.method public v0()Z
    .locals 1

    iget v0, p0, Lg66;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final w0()Lcom/google/protobuf/A;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/A<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg66;->counters_:Lcom/google/protobuf/A;

    return-object v0
.end method

.method public final x(Lcom/google/protobuf/r$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lg66$a;->a:[I

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
    sget-object p1, Lg66;->PARSER:LVH3;

    if-nez p1, :cond_1

    const-class p2, Lg66;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lg66;->PARSER:LVH3;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/r$b;

    sget-object p3, Lg66;->DEFAULT_INSTANCE:Lg66;

    invoke-direct {p1, p3}, Lcom/google/protobuf/r$b;-><init>(Lcom/google/protobuf/r;)V

    sput-object p1, Lg66;->PARSER:LVH3;

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
    sget-object p1, Lg66;->DEFAULT_INSTANCE:Lg66;

    return-object p1

    :pswitch_4
    const/16 p1, 0xd

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "bitField0_"

    aput-object v0, p1, p3

    const-string p3, "name_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "isAuto_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "clientStartTimeUs_"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "durationUs_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "counters_"

    aput-object p3, p1, p2

    const/4 p2, 0x6

    sget-object p3, Lg66$c;->a:Lcom/google/protobuf/z;

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "subtraces_"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-class p3, Lg66;

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "customAttributes_"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    sget-object p3, Lg66$d;->a:Lcom/google/protobuf/z;

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "perfSessions_"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-class p3, LnQ3;

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0008\u0000\u0001\u0001\t\u0008\u0002\u0002\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0004\u1002\u0002\u0005\u1002\u0003\u00062\u0007\u001b\u00082\t\u001b"

    sget-object p3, Lg66;->DEFAULT_INSTANCE:Lg66;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/r;->N(Lcom/google/protobuf/D;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lg66$b;

    invoke-direct {p1, p3}, Lg66$b;-><init>(Lg66$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lg66;

    invoke-direct {p1}, Lg66;-><init>()V

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

.method public final x0()Lcom/google/protobuf/A;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/A<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg66;->customAttributes_:Lcom/google/protobuf/A;

    return-object v0
.end method

.method public final y0()Lcom/google/protobuf/A;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/A<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg66;->counters_:Lcom/google/protobuf/A;

    invoke-virtual {v0}, Lcom/google/protobuf/A;->l()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lg66;->counters_:Lcom/google/protobuf/A;

    invoke-virtual {v0}, Lcom/google/protobuf/A;->o()Lcom/google/protobuf/A;

    move-result-object v0

    iput-object v0, p0, Lg66;->counters_:Lcom/google/protobuf/A;

    :cond_0
    iget-object v0, p0, Lg66;->counters_:Lcom/google/protobuf/A;

    return-object v0
.end method

.method public final z0()Lcom/google/protobuf/A;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/A<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg66;->customAttributes_:Lcom/google/protobuf/A;

    invoke-virtual {v0}, Lcom/google/protobuf/A;->l()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lg66;->customAttributes_:Lcom/google/protobuf/A;

    invoke-virtual {v0}, Lcom/google/protobuf/A;->o()Lcom/google/protobuf/A;

    move-result-object v0

    iput-object v0, p0, Lg66;->customAttributes_:Lcom/google/protobuf/A;

    :cond_0
    iget-object v0, p0, Lg66;->customAttributes_:Lcom/google/protobuf/A;

    return-object v0
.end method
