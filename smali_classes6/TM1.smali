.class public final LTM1;
.super Lcom/google/crypto/tink/shaded/protobuf/t;
.source "SourceFile"

# interfaces
.implements LxT2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LTM1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/t<",
        "LTM1;",
        "LTM1$b;",
        ">;",
        "LxT2;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:LTM1;

.field public static final KEY_VALUE_FIELD_NUMBER:I = 0x3

.field public static final PARAMS_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:LWH3; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWH3<",
            "LTM1;",
            ">;"
        }
    .end annotation
.end field

.field public static final VERSION_FIELD_NUMBER:I = 0x1


# instance fields
.field private keyValue_:Lcom/google/crypto/tink/shaded/protobuf/g;

.field private params_:LWM1;

.field private version_:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LTM1;

    invoke-direct {v0}, LTM1;-><init>()V

    sput-object v0, LTM1;->DEFAULT_INSTANCE:LTM1;

    const-class v1, LTM1;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->C(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/t;-><init>()V

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/g;->c:Lcom/google/crypto/tink/shaded/protobuf/g;

    iput-object v0, p0, LTM1;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/g;

    return-void
.end method

.method public static synthetic F()LTM1;
    .locals 1

    sget-object v0, LTM1;->DEFAULT_INSTANCE:LTM1;

    return-object v0
.end method

.method public static synthetic G(LTM1;I)V
    .locals 0

    invoke-virtual {p0, p1}, LTM1;->R(I)V

    return-void
.end method

.method public static synthetic H(LTM1;LWM1;)V
    .locals 0

    invoke-virtual {p0, p1}, LTM1;->Q(LWM1;)V

    return-void
.end method

.method public static synthetic I(LTM1;Lcom/google/crypto/tink/shaded/protobuf/g;)V
    .locals 0

    invoke-virtual {p0, p1}, LTM1;->P(Lcom/google/crypto/tink/shaded/protobuf/g;)V

    return-void
.end method

.method public static J()LTM1;
    .locals 1

    sget-object v0, LTM1;->DEFAULT_INSTANCE:LTM1;

    return-object v0
.end method

.method public static N()LTM1$b;
    .locals 1

    sget-object v0, LTM1;->DEFAULT_INSTANCE:LTM1;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->k()Lcom/google/crypto/tink/shaded/protobuf/t$a;

    move-result-object v0

    check-cast v0, LTM1$b;

    return-object v0
.end method

.method public static O(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)LTM1;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    sget-object v0, LTM1;->DEFAULT_INSTANCE:LTM1;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->x(Lcom/google/crypto/tink/shaded/protobuf/t;Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p0

    check-cast p0, LTM1;

    return-object p0
.end method


# virtual methods
.method public K()Lcom/google/crypto/tink/shaded/protobuf/g;
    .locals 1

    iget-object v0, p0, LTM1;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/g;

    return-object v0
.end method

.method public L()LWM1;
    .locals 1

    iget-object v0, p0, LTM1;->params_:LWM1;

    if-nez v0, :cond_0

    invoke-static {}, LWM1;->I()LWM1;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public M()I
    .locals 1

    iget v0, p0, LTM1;->version_:I

    return v0
.end method

.method public final P(Lcom/google/crypto/tink/shaded/protobuf/g;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LTM1;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/g;

    return-void
.end method

.method public final Q(LWM1;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LTM1;->params_:LWM1;

    return-void
.end method

.method public final R(I)V
    .locals 0

    iput p1, p0, LTM1;->version_:I

    return-void
.end method

.method public final n(Lcom/google/crypto/tink/shaded/protobuf/t$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, LTM1$a;->a:[I

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
    sget-object p1, LTM1;->PARSER:LWH3;

    if-nez p1, :cond_1

    const-class p2, LTM1;

    monitor-enter p2

    :try_start_0
    sget-object p1, LTM1;->PARSER:LWH3;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/t$b;

    sget-object p3, LTM1;->DEFAULT_INSTANCE:LTM1;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/t$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/t;)V

    sput-object p1, LTM1;->PARSER:LWH3;

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
    sget-object p1, LTM1;->DEFAULT_INSTANCE:LTM1;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "version_"

    aput-object v0, p1, p3

    const-string p3, "params_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "keyValue_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n"

    sget-object p3, LTM1;->DEFAULT_INSTANCE:LTM1;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->w(Lcom/google/crypto/tink/shaded/protobuf/F;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, LTM1$b;

    invoke-direct {p1, p3}, LTM1$b;-><init>(LTM1$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, LTM1;

    invoke-direct {p1}, LTM1;-><init>()V

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
