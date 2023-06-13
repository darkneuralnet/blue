.class public final Lkl2;
.super Lcom/google/crypto/tink/shaded/protobuf/t;
.source "SourceFile"

# interfaces
.implements LxT2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkl2$b;,
        Lkl2$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/t<",
        "Lkl2;",
        "Lkl2$b;",
        ">;",
        "LxT2;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lkl2;

.field public static final KEY_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:LWH3; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWH3<",
            "Lkl2;",
            ">;"
        }
    .end annotation
.end field

.field public static final PRIMARY_KEY_ID_FIELD_NUMBER:I = 0x1


# instance fields
.field private key_:Lcom/google/crypto/tink/shaded/protobuf/v$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/v$i<",
            "Lkl2$c;",
            ">;"
        }
    .end annotation
.end field

.field private primaryKeyId_:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkl2;

    invoke-direct {v0}, Lkl2;-><init>()V

    sput-object v0, Lkl2;->DEFAULT_INSTANCE:Lkl2;

    const-class v1, Lkl2;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->C(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/t;-><init>()V

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->o()Lcom/google/crypto/tink/shaded/protobuf/v$i;

    move-result-object v0

    iput-object v0, p0, Lkl2;->key_:Lcom/google/crypto/tink/shaded/protobuf/v$i;

    return-void
.end method

.method public static synthetic F()Lkl2;
    .locals 1

    sget-object v0, Lkl2;->DEFAULT_INSTANCE:Lkl2;

    return-object v0
.end method

.method public static synthetic G(Lkl2;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lkl2;->Q(I)V

    return-void
.end method

.method public static synthetic H(Lkl2;Lkl2$c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lkl2;->I(Lkl2$c;)V

    return-void
.end method

.method public static O()Lkl2$b;
    .locals 1

    sget-object v0, Lkl2;->DEFAULT_INSTANCE:Lkl2;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->k()Lcom/google/crypto/tink/shaded/protobuf/t$a;

    move-result-object v0

    check-cast v0, Lkl2$b;

    return-object v0
.end method

.method public static P([BLcom/google/crypto/tink/shaded/protobuf/m;)Lkl2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    sget-object v0, Lkl2;->DEFAULT_INSTANCE:Lkl2;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->y(Lcom/google/crypto/tink/shaded/protobuf/t;[BLcom/google/crypto/tink/shaded/protobuf/m;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p0

    check-cast p0, Lkl2;

    return-object p0
.end method


# virtual methods
.method public final I(Lkl2$c;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lkl2;->J()V

    iget-object v0, p0, Lkl2;->key_:Lcom/google/crypto/tink/shaded/protobuf/v$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final J()V
    .locals 2

    iget-object v0, p0, Lkl2;->key_:Lcom/google/crypto/tink/shaded/protobuf/v$i;

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/v$i;->t()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->u(Lcom/google/crypto/tink/shaded/protobuf/v$i;)Lcom/google/crypto/tink/shaded/protobuf/v$i;

    move-result-object v0

    iput-object v0, p0, Lkl2;->key_:Lcom/google/crypto/tink/shaded/protobuf/v$i;

    :cond_0
    return-void
.end method

.method public K(I)Lkl2$c;
    .locals 1

    iget-object v0, p0, Lkl2;->key_:Lcom/google/crypto/tink/shaded/protobuf/v$i;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkl2$c;

    return-object p1
.end method

.method public L()I
    .locals 1

    iget-object v0, p0, Lkl2;->key_:Lcom/google/crypto/tink/shaded/protobuf/v$i;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public M()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkl2$c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkl2;->key_:Lcom/google/crypto/tink/shaded/protobuf/v$i;

    return-object v0
.end method

.method public N()I
    .locals 1

    iget v0, p0, Lkl2;->primaryKeyId_:I

    return v0
.end method

.method public final Q(I)V
    .locals 0

    iput p1, p0, Lkl2;->primaryKeyId_:I

    return-void
.end method

.method public final n(Lcom/google/crypto/tink/shaded/protobuf/t$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lkl2$a;->a:[I

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
    sget-object p1, Lkl2;->PARSER:LWH3;

    if-nez p1, :cond_1

    const-class p2, Lkl2;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lkl2;->PARSER:LWH3;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/t$b;

    sget-object p3, Lkl2;->DEFAULT_INSTANCE:Lkl2;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/t$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/t;)V

    sput-object p1, Lkl2;->PARSER:LWH3;

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
    sget-object p1, Lkl2;->DEFAULT_INSTANCE:Lkl2;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "primaryKeyId_"

    aput-object v0, p1, p3

    const-string p3, "key_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-class p3, Lkl2$c;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b"

    sget-object p3, Lkl2;->DEFAULT_INSTANCE:Lkl2;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->w(Lcom/google/crypto/tink/shaded/protobuf/F;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lkl2$b;

    invoke-direct {p1, p3}, Lkl2$b;-><init>(Lkl2$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lkl2;

    invoke-direct {p1}, Lkl2;-><init>()V

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
