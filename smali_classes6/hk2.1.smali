.class public final Lhk2;
.super Lcom/google/crypto/tink/shaded/protobuf/t;
.source "SourceFile"

# interfaces
.implements LxT2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhk2$b;,
        Lhk2$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/t<",
        "Lhk2;",
        "Lhk2$b;",
        ">;",
        "LxT2;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lhk2;

.field public static final KEY_MATERIAL_TYPE_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:LWH3; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWH3<",
            "Lhk2;",
            ">;"
        }
    .end annotation
.end field

.field public static final TYPE_URL_FIELD_NUMBER:I = 0x1

.field public static final VALUE_FIELD_NUMBER:I = 0x2


# instance fields
.field private keyMaterialType_:I

.field private typeUrl_:Ljava/lang/String;

.field private value_:Lcom/google/crypto/tink/shaded/protobuf/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhk2;

    invoke-direct {v0}, Lhk2;-><init>()V

    sput-object v0, Lhk2;->DEFAULT_INSTANCE:Lhk2;

    const-class v1, Lhk2;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->C(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/t;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lhk2;->typeUrl_:Ljava/lang/String;

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/g;->c:Lcom/google/crypto/tink/shaded/protobuf/g;

    iput-object v0, p0, Lhk2;->value_:Lcom/google/crypto/tink/shaded/protobuf/g;

    return-void
.end method

.method public static synthetic F()Lhk2;
    .locals 1

    sget-object v0, Lhk2;->DEFAULT_INSTANCE:Lhk2;

    return-object v0
.end method

.method public static synthetic G(Lhk2;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lhk2;->P(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic H(Lhk2;Lcom/google/crypto/tink/shaded/protobuf/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Lhk2;->Q(Lcom/google/crypto/tink/shaded/protobuf/g;)V

    return-void
.end method

.method public static synthetic I(Lhk2;Lhk2$c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lhk2;->O(Lhk2$c;)V

    return-void
.end method

.method public static J()Lhk2;
    .locals 1

    sget-object v0, Lhk2;->DEFAULT_INSTANCE:Lhk2;

    return-object v0
.end method

.method public static N()Lhk2$b;
    .locals 1

    sget-object v0, Lhk2;->DEFAULT_INSTANCE:Lhk2;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->k()Lcom/google/crypto/tink/shaded/protobuf/t$a;

    move-result-object v0

    check-cast v0, Lhk2$b;

    return-object v0
.end method


# virtual methods
.method public K()Lhk2$c;
    .locals 1

    iget v0, p0, Lhk2;->keyMaterialType_:I

    invoke-static {v0}, Lhk2$c;->a(I)Lhk2$c;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lhk2$c;->h:Lhk2$c;

    :cond_0
    return-object v0
.end method

.method public L()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhk2;->typeUrl_:Ljava/lang/String;

    return-object v0
.end method

.method public M()Lcom/google/crypto/tink/shaded/protobuf/g;
    .locals 1

    iget-object v0, p0, Lhk2;->value_:Lcom/google/crypto/tink/shaded/protobuf/g;

    return-object v0
.end method

.method public final O(Lhk2$c;)V
    .locals 0

    invoke-virtual {p1}, Lhk2$c;->getNumber()I

    move-result p1

    iput p1, p0, Lhk2;->keyMaterialType_:I

    return-void
.end method

.method public final P(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lhk2;->typeUrl_:Ljava/lang/String;

    return-void
.end method

.method public final Q(Lcom/google/crypto/tink/shaded/protobuf/g;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lhk2;->value_:Lcom/google/crypto/tink/shaded/protobuf/g;

    return-void
.end method

.method public final n(Lcom/google/crypto/tink/shaded/protobuf/t$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lhk2$a;->a:[I

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
    sget-object p1, Lhk2;->PARSER:LWH3;

    if-nez p1, :cond_1

    const-class p2, Lhk2;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lhk2;->PARSER:LWH3;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/t$b;

    sget-object p3, Lhk2;->DEFAULT_INSTANCE:Lhk2;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/t$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/t;)V

    sput-object p1, Lhk2;->PARSER:LWH3;

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
    sget-object p1, Lhk2;->DEFAULT_INSTANCE:Lhk2;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "typeUrl_"

    aput-object v0, p1, p3

    const-string p3, "value_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "keyMaterialType_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\u000c"

    sget-object p3, Lhk2;->DEFAULT_INSTANCE:Lhk2;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->w(Lcom/google/crypto/tink/shaded/protobuf/F;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lhk2$b;

    invoke-direct {p1, p3}, Lhk2$b;-><init>(Lhk2$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lhk2;

    invoke-direct {p1}, Lhk2;-><init>()V

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
