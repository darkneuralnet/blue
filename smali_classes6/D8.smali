.class public final LD8;
.super Lcom/google/crypto/tink/shaded/protobuf/t;
.source "SourceFile"

# interfaces
.implements LxT2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD8$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/t<",
        "LD8;",
        "LD8$b;",
        ">;",
        "LxT2;"
    }
.end annotation


# static fields
.field public static final AES_CTR_KEY_FIELD_NUMBER:I = 0x2

.field private static final DEFAULT_INSTANCE:LD8;

.field public static final HMAC_KEY_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:LWH3; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWH3<",
            "LD8;",
            ">;"
        }
    .end annotation
.end field

.field public static final VERSION_FIELD_NUMBER:I = 0x1


# instance fields
.field private aesCtrKey_:LH8;

.field private hmacKey_:LTM1;

.field private version_:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LD8;

    invoke-direct {v0}, LD8;-><init>()V

    sput-object v0, LD8;->DEFAULT_INSTANCE:LD8;

    const-class v1, LD8;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->C(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/t;-><init>()V

    return-void
.end method

.method public static synthetic F()LD8;
    .locals 1

    sget-object v0, LD8;->DEFAULT_INSTANCE:LD8;

    return-object v0
.end method

.method public static synthetic G(LD8;I)V
    .locals 0

    invoke-virtual {p0, p1}, LD8;->Q(I)V

    return-void
.end method

.method public static synthetic H(LD8;LH8;)V
    .locals 0

    invoke-virtual {p0, p1}, LD8;->O(LH8;)V

    return-void
.end method

.method public static synthetic I(LD8;LTM1;)V
    .locals 0

    invoke-virtual {p0, p1}, LD8;->P(LTM1;)V

    return-void
.end method

.method public static M()LD8$b;
    .locals 1

    sget-object v0, LD8;->DEFAULT_INSTANCE:LD8;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->k()Lcom/google/crypto/tink/shaded/protobuf/t$a;

    move-result-object v0

    check-cast v0, LD8$b;

    return-object v0
.end method

.method public static N(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)LD8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    sget-object v0, LD8;->DEFAULT_INSTANCE:LD8;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->x(Lcom/google/crypto/tink/shaded/protobuf/t;Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p0

    check-cast p0, LD8;

    return-object p0
.end method


# virtual methods
.method public J()LH8;
    .locals 1

    iget-object v0, p0, LD8;->aesCtrKey_:LH8;

    if-nez v0, :cond_0

    invoke-static {}, LH8;->J()LH8;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public K()LTM1;
    .locals 1

    iget-object v0, p0, LD8;->hmacKey_:LTM1;

    if-nez v0, :cond_0

    invoke-static {}, LTM1;->J()LTM1;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public L()I
    .locals 1

    iget v0, p0, LD8;->version_:I

    return v0
.end method

.method public final O(LH8;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LD8;->aesCtrKey_:LH8;

    return-void
.end method

.method public final P(LTM1;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LD8;->hmacKey_:LTM1;

    return-void
.end method

.method public final Q(I)V
    .locals 0

    iput p1, p0, LD8;->version_:I

    return-void
.end method

.method public final n(Lcom/google/crypto/tink/shaded/protobuf/t$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, LD8$a;->a:[I

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
    sget-object p1, LD8;->PARSER:LWH3;

    if-nez p1, :cond_1

    const-class p2, LD8;

    monitor-enter p2

    :try_start_0
    sget-object p1, LD8;->PARSER:LWH3;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/t$b;

    sget-object p3, LD8;->DEFAULT_INSTANCE:LD8;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/t$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/t;)V

    sput-object p1, LD8;->PARSER:LWH3;

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
    sget-object p1, LD8;->DEFAULT_INSTANCE:LD8;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "version_"

    aput-object v0, p1, p3

    const-string p3, "aesCtrKey_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "hmacKey_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t"

    sget-object p3, LD8;->DEFAULT_INSTANCE:LD8;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->w(Lcom/google/crypto/tink/shaded/protobuf/F;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, LD8$b;

    invoke-direct {p1, p3}, LD8$b;-><init>(LD8$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, LD8;

    invoke-direct {p1}, LD8;-><init>()V

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
