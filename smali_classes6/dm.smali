.class public final Ldm;
.super Lcom/google/protobuf/r;
.source "SourceFile"

# interfaces
.implements LwT2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldm$b;,
        Ldm$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/r<",
        "Ldm;",
        "Ldm$b;",
        ">;",
        "LwT2;"
    }
.end annotation


# static fields
.field public static final ANDROID_APP_INFO_FIELD_NUMBER:I = 0x3

.field public static final APPLICATION_PROCESS_STATE_FIELD_NUMBER:I = 0x5

.field public static final APP_INSTANCE_ID_FIELD_NUMBER:I = 0x2

.field public static final CUSTOM_ATTRIBUTES_FIELD_NUMBER:I = 0x6

.field private static final DEFAULT_INSTANCE:Ldm;

.field public static final GOOGLE_APP_ID_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:LVH3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LVH3<",
            "Ldm;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private androidAppInfo_:Lmb;

.field private appInstanceId_:Ljava/lang/String;

.field private applicationProcessState_:I

.field private bitField0_:I

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

.field private googleAppId_:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldm;

    invoke-direct {v0}, Ldm;-><init>()V

    sput-object v0, Ldm;->DEFAULT_INSTANCE:Ldm;

    const-class v1, Ldm;

    invoke-static {v1, v0}, Lcom/google/protobuf/r;->Q(Ljava/lang/Class;Lcom/google/protobuf/r;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/r;-><init>()V

    invoke-static {}, Lcom/google/protobuf/A;->g()Lcom/google/protobuf/A;

    move-result-object v0

    iput-object v0, p0, Ldm;->customAttributes_:Lcom/google/protobuf/A;

    const-string v0, ""

    iput-object v0, p0, Ldm;->googleAppId_:Ljava/lang/String;

    iput-object v0, p0, Ldm;->appInstanceId_:Ljava/lang/String;

    return-void
.end method

.method public static synthetic T()Ldm;
    .locals 1

    sget-object v0, Ldm;->DEFAULT_INSTANCE:Ldm;

    return-object v0
.end method

.method public static synthetic U(Ldm;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Ldm;->m0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic V(Ldm;Lim;)V
    .locals 0

    invoke-virtual {p0, p1}, Ldm;->l0(Lim;)V

    return-void
.end method

.method public static synthetic W(Ldm;)Ljava/util/Map;
    .locals 0

    invoke-virtual {p0}, Ldm;->b0()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X(Ldm;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Ldm;->k0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic Y(Ldm;Lmb;)V
    .locals 0

    invoke-virtual {p0, p1}, Ldm;->i0(Lmb;)V

    return-void
.end method

.method public static a0()Ldm;
    .locals 1

    sget-object v0, Ldm;->DEFAULT_INSTANCE:Ldm;

    return-object v0
.end method

.method public static h0()Ldm$b;
    .locals 1

    sget-object v0, Ldm;->DEFAULT_INSTANCE:Ldm;

    invoke-virtual {v0}, Lcom/google/protobuf/r;->u()Lcom/google/protobuf/r$a;

    move-result-object v0

    check-cast v0, Ldm$b;

    return-object v0
.end method


# virtual methods
.method public Z()Lmb;
    .locals 1

    iget-object v0, p0, Ldm;->androidAppInfo_:Lmb;

    if-nez v0, :cond_0

    invoke-static {}, Lmb;->X()Lmb;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final b0()Ljava/util/Map;
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

    invoke-virtual {p0}, Ldm;->g0()Lcom/google/protobuf/A;

    move-result-object v0

    return-object v0
.end method

.method public c0()Z
    .locals 1

    iget v0, p0, Ldm;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d0()Z
    .locals 1

    iget v0, p0, Ldm;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e0()Z
    .locals 1

    iget v0, p0, Ldm;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f0()Z
    .locals 2

    iget v0, p0, Ldm;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final g0()Lcom/google/protobuf/A;
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

    iget-object v0, p0, Ldm;->customAttributes_:Lcom/google/protobuf/A;

    invoke-virtual {v0}, Lcom/google/protobuf/A;->l()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldm;->customAttributes_:Lcom/google/protobuf/A;

    invoke-virtual {v0}, Lcom/google/protobuf/A;->o()Lcom/google/protobuf/A;

    move-result-object v0

    iput-object v0, p0, Ldm;->customAttributes_:Lcom/google/protobuf/A;

    :cond_0
    iget-object v0, p0, Ldm;->customAttributes_:Lcom/google/protobuf/A;

    return-object v0
.end method

.method public final i0(Lmb;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ldm;->androidAppInfo_:Lmb;

    iget p1, p0, Ldm;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Ldm;->bitField0_:I

    return-void
.end method

.method public final k0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Ldm;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Ldm;->bitField0_:I

    iput-object p1, p0, Ldm;->appInstanceId_:Ljava/lang/String;

    return-void
.end method

.method public final l0(Lim;)V
    .locals 0

    invoke-virtual {p1}, Lim;->getNumber()I

    move-result p1

    iput p1, p0, Ldm;->applicationProcessState_:I

    iget p1, p0, Ldm;->bitField0_:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Ldm;->bitField0_:I

    return-void
.end method

.method public final m0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Ldm;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ldm;->bitField0_:I

    iput-object p1, p0, Ldm;->googleAppId_:Ljava/lang/String;

    return-void
.end method

.method public final x(Lcom/google/protobuf/r$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Ldm$a;->a:[I

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
    sget-object p1, Ldm;->PARSER:LVH3;

    if-nez p1, :cond_1

    const-class p2, Ldm;

    monitor-enter p2

    :try_start_0
    sget-object p1, Ldm;->PARSER:LVH3;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/r$b;

    sget-object p3, Ldm;->DEFAULT_INSTANCE:Ldm;

    invoke-direct {p1, p3}, Lcom/google/protobuf/r$b;-><init>(Lcom/google/protobuf/r;)V

    sput-object p1, Ldm;->PARSER:LVH3;

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
    sget-object p1, Ldm;->DEFAULT_INSTANCE:Ldm;

    return-object p1

    :pswitch_4
    const/16 p1, 0x8

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "bitField0_"

    aput-object v0, p1, p3

    const-string p3, "googleAppId_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "appInstanceId_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "androidAppInfo_"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "applicationProcessState_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    invoke-static {}, Lim;->b()Lcom/google/protobuf/t$e;

    move-result-object p3

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-string p3, "customAttributes_"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    sget-object p3, Ldm$c;->a:Lcom/google/protobuf/z;

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0005\u100c\u0003\u00062"

    sget-object p3, Ldm;->DEFAULT_INSTANCE:Ldm;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/r;->N(Lcom/google/protobuf/D;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Ldm$b;

    invoke-direct {p1, p3}, Ldm$b;-><init>(Ldm$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Ldm;

    invoke-direct {p1}, Ldm;-><init>()V

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
