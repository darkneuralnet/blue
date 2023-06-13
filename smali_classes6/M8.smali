.class public final LM8;
.super Lcom/google/crypto/tink/shaded/protobuf/t;
.source "SourceFile"

# interfaces
.implements LxT2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM8$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/t<",
        "LM8;",
        "LM8$b;",
        ">;",
        "LxT2;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:LM8;

.field public static final KEY_VALUE_FIELD_NUMBER:I = 0x3

.field public static final PARAMS_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:LWH3; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWH3<",
            "LM8;",
            ">;"
        }
    .end annotation
.end field

.field public static final VERSION_FIELD_NUMBER:I = 0x1


# instance fields
.field private keyValue_:Lcom/google/crypto/tink/shaded/protobuf/g;

.field private params_:LP8;

.field private version_:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LM8;

    invoke-direct {v0}, LM8;-><init>()V

    sput-object v0, LM8;->DEFAULT_INSTANCE:LM8;

    const-class v1, LM8;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->C(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/t;-><init>()V

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/g;->c:Lcom/google/crypto/tink/shaded/protobuf/g;

    iput-object v0, p0, LM8;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/g;

    return-void
.end method

.method public static synthetic F()LM8;
    .locals 1

    sget-object v0, LM8;->DEFAULT_INSTANCE:LM8;

    return-object v0
.end method

.method public static synthetic G(LM8;I)V
    .locals 0

    invoke-virtual {p0, p1}, LM8;->Q(I)V

    return-void
.end method

.method public static synthetic H(LM8;LP8;)V
    .locals 0

    invoke-virtual {p0, p1}, LM8;->P(LP8;)V

    return-void
.end method

.method public static synthetic I(LM8;Lcom/google/crypto/tink/shaded/protobuf/g;)V
    .locals 0

    invoke-virtual {p0, p1}, LM8;->O(Lcom/google/crypto/tink/shaded/protobuf/g;)V

    return-void
.end method

.method public static M()LM8$b;
    .locals 1

    sget-object v0, LM8;->DEFAULT_INSTANCE:LM8;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->k()Lcom/google/crypto/tink/shaded/protobuf/t$a;

    move-result-object v0

    check-cast v0, LM8$b;

    return-object v0
.end method

.method public static N(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)LM8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    sget-object v0, LM8;->DEFAULT_INSTANCE:LM8;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->x(Lcom/google/crypto/tink/shaded/protobuf/t;Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p0

    check-cast p0, LM8;

    return-object p0
.end method


# virtual methods
.method public J()Lcom/google/crypto/tink/shaded/protobuf/g;
    .locals 1

    iget-object v0, p0, LM8;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/g;

    return-object v0
.end method

.method public K()LP8;
    .locals 1

    iget-object v0, p0, LM8;->params_:LP8;

    if-nez v0, :cond_0

    invoke-static {}, LP8;->H()LP8;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public L()I
    .locals 1

    iget v0, p0, LM8;->version_:I

    return v0
.end method

.method public final O(Lcom/google/crypto/tink/shaded/protobuf/g;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LM8;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/g;

    return-void
.end method

.method public final P(LP8;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LM8;->params_:LP8;

    return-void
.end method

.method public final Q(I)V
    .locals 0

    iput p1, p0, LM8;->version_:I

    return-void
.end method

.method public final n(Lcom/google/crypto/tink/shaded/protobuf/t$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, LM8$a;->a:[I

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
    sget-object p1, LM8;->PARSER:LWH3;

    if-nez p1, :cond_1

    const-class p2, LM8;

    monitor-enter p2

    :try_start_0
    sget-object p1, LM8;->PARSER:LWH3;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/t$b;

    sget-object p3, LM8;->DEFAULT_INSTANCE:LM8;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/t$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/t;)V

    sput-object p1, LM8;->PARSER:LWH3;

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
    sget-object p1, LM8;->DEFAULT_INSTANCE:LM8;

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

    sget-object p3, LM8;->DEFAULT_INSTANCE:LM8;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->w(Lcom/google/crypto/tink/shaded/protobuf/F;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, LM8$b;

    invoke-direct {p1, p3}, LM8$b;-><init>(LM8$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, LM8;

    invoke-direct {p1}, LM8;-><init>()V

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
