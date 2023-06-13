.class public final LWM1;
.super Lcom/google/crypto/tink/shaded/protobuf/t;
.source "SourceFile"

# interfaces
.implements LxT2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LWM1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/t<",
        "LWM1;",
        "LWM1$b;",
        ">;",
        "LxT2;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:LWM1;

.field public static final HASH_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:LWH3; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWH3<",
            "LWM1;",
            ">;"
        }
    .end annotation
.end field

.field public static final TAG_SIZE_FIELD_NUMBER:I = 0x2


# instance fields
.field private hash_:I

.field private tagSize_:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LWM1;

    invoke-direct {v0}, LWM1;-><init>()V

    sput-object v0, LWM1;->DEFAULT_INSTANCE:LWM1;

    const-class v1, LWM1;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->C(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/t;-><init>()V

    return-void
.end method

.method public static synthetic F()LWM1;
    .locals 1

    sget-object v0, LWM1;->DEFAULT_INSTANCE:LWM1;

    return-object v0
.end method

.method public static synthetic G(LWM1;LuH1;)V
    .locals 0

    invoke-virtual {p0, p1}, LWM1;->M(LuH1;)V

    return-void
.end method

.method public static synthetic H(LWM1;I)V
    .locals 0

    invoke-virtual {p0, p1}, LWM1;->N(I)V

    return-void
.end method

.method public static I()LWM1;
    .locals 1

    sget-object v0, LWM1;->DEFAULT_INSTANCE:LWM1;

    return-object v0
.end method

.method public static L()LWM1$b;
    .locals 1

    sget-object v0, LWM1;->DEFAULT_INSTANCE:LWM1;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->k()Lcom/google/crypto/tink/shaded/protobuf/t$a;

    move-result-object v0

    check-cast v0, LWM1$b;

    return-object v0
.end method


# virtual methods
.method public J()LuH1;
    .locals 1

    iget v0, p0, LWM1;->hash_:I

    invoke-static {v0}, LuH1;->a(I)LuH1;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, LuH1;->i:LuH1;

    :cond_0
    return-object v0
.end method

.method public K()I
    .locals 1

    iget v0, p0, LWM1;->tagSize_:I

    return v0
.end method

.method public final M(LuH1;)V
    .locals 0

    invoke-virtual {p1}, LuH1;->getNumber()I

    move-result p1

    iput p1, p0, LWM1;->hash_:I

    return-void
.end method

.method public final N(I)V
    .locals 0

    iput p1, p0, LWM1;->tagSize_:I

    return-void
.end method

.method public final n(Lcom/google/crypto/tink/shaded/protobuf/t$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, LWM1$a;->a:[I

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
    sget-object p1, LWM1;->PARSER:LWH3;

    if-nez p1, :cond_1

    const-class p2, LWM1;

    monitor-enter p2

    :try_start_0
    sget-object p1, LWM1;->PARSER:LWH3;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/t$b;

    sget-object p3, LWM1;->DEFAULT_INSTANCE:LWM1;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/t$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/t;)V

    sput-object p1, LWM1;->PARSER:LWH3;

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
    sget-object p1, LWM1;->DEFAULT_INSTANCE:LWM1;

    return-object p1

    :pswitch_4
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "hash_"

    aput-object v0, p1, p3

    const-string p3, "tagSize_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000c\u0002\u000b"

    sget-object p3, LWM1;->DEFAULT_INSTANCE:LWM1;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->w(Lcom/google/crypto/tink/shaded/protobuf/F;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, LWM1$b;

    invoke-direct {p1, p3}, LWM1$b;-><init>(LWM1$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, LWM1;

    invoke-direct {p1}, LWM1;-><init>()V

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
