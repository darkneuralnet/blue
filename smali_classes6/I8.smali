.class public final LI8;
.super Lcom/google/crypto/tink/shaded/protobuf/t;
.source "SourceFile"

# interfaces
.implements LxT2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI8$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/t<",
        "LI8;",
        "LI8$b;",
        ">;",
        "LxT2;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:LI8;

.field public static final KEY_SIZE_FIELD_NUMBER:I = 0x2

.field public static final PARAMS_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:LWH3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWH3<",
            "LI8;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private keySize_:I

.field private params_:LK8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LI8;

    invoke-direct {v0}, LI8;-><init>()V

    sput-object v0, LI8;->DEFAULT_INSTANCE:LI8;

    const-class v1, LI8;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->C(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/t;-><init>()V

    return-void
.end method

.method public static synthetic F()LI8;
    .locals 1

    sget-object v0, LI8;->DEFAULT_INSTANCE:LI8;

    return-object v0
.end method

.method public static synthetic G(LI8;LK8;)V
    .locals 0

    invoke-virtual {p0, p1}, LI8;->O(LK8;)V

    return-void
.end method

.method public static synthetic H(LI8;I)V
    .locals 0

    invoke-virtual {p0, p1}, LI8;->N(I)V

    return-void
.end method

.method public static I()LI8;
    .locals 1

    sget-object v0, LI8;->DEFAULT_INSTANCE:LI8;

    return-object v0
.end method

.method public static L()LI8$b;
    .locals 1

    sget-object v0, LI8;->DEFAULT_INSTANCE:LI8;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->k()Lcom/google/crypto/tink/shaded/protobuf/t$a;

    move-result-object v0

    check-cast v0, LI8$b;

    return-object v0
.end method

.method public static M(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)LI8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    sget-object v0, LI8;->DEFAULT_INSTANCE:LI8;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->x(Lcom/google/crypto/tink/shaded/protobuf/t;Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p0

    check-cast p0, LI8;

    return-object p0
.end method


# virtual methods
.method public J()I
    .locals 1

    iget v0, p0, LI8;->keySize_:I

    return v0
.end method

.method public K()LK8;
    .locals 1

    iget-object v0, p0, LI8;->params_:LK8;

    if-nez v0, :cond_0

    invoke-static {}, LK8;->H()LK8;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final N(I)V
    .locals 0

    iput p1, p0, LI8;->keySize_:I

    return-void
.end method

.method public final O(LK8;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LI8;->params_:LK8;

    return-void
.end method

.method public final n(Lcom/google/crypto/tink/shaded/protobuf/t$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, LI8$a;->a:[I

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
    sget-object p1, LI8;->PARSER:LWH3;

    if-nez p1, :cond_1

    const-class p2, LI8;

    monitor-enter p2

    :try_start_0
    sget-object p1, LI8;->PARSER:LWH3;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/t$b;

    sget-object p3, LI8;->DEFAULT_INSTANCE:LI8;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/t$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/t;)V

    sput-object p1, LI8;->PARSER:LWH3;

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
    sget-object p1, LI8;->DEFAULT_INSTANCE:LI8;

    return-object p1

    :pswitch_4
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "params_"

    aput-object v0, p1, p3

    const-string p3, "keySize_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b"

    sget-object p3, LI8;->DEFAULT_INSTANCE:LI8;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->w(Lcom/google/crypto/tink/shaded/protobuf/F;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, LI8$b;

    invoke-direct {p1, p3}, LI8$b;-><init>(LI8$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, LI8;

    invoke-direct {p1}, LI8;-><init>()V

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