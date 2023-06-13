.class public final LP8;
.super Lcom/google/crypto/tink/shaded/protobuf/t;
.source "SourceFile"

# interfaces
.implements LxT2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/t<",
        "LP8;",
        "LP8$b;",
        ">;",
        "LxT2;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:LP8;

.field public static final IV_SIZE_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:LWH3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWH3<",
            "LP8;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private ivSize_:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LP8;

    invoke-direct {v0}, LP8;-><init>()V

    sput-object v0, LP8;->DEFAULT_INSTANCE:LP8;

    const-class v1, LP8;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->C(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/t;-><init>()V

    return-void
.end method

.method public static synthetic F()LP8;
    .locals 1

    sget-object v0, LP8;->DEFAULT_INSTANCE:LP8;

    return-object v0
.end method

.method public static synthetic G(LP8;I)V
    .locals 0

    invoke-virtual {p0, p1}, LP8;->K(I)V

    return-void
.end method

.method public static H()LP8;
    .locals 1

    sget-object v0, LP8;->DEFAULT_INSTANCE:LP8;

    return-object v0
.end method

.method public static J()LP8$b;
    .locals 1

    sget-object v0, LP8;->DEFAULT_INSTANCE:LP8;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->k()Lcom/google/crypto/tink/shaded/protobuf/t$a;

    move-result-object v0

    check-cast v0, LP8$b;

    return-object v0
.end method


# virtual methods
.method public I()I
    .locals 1

    iget v0, p0, LP8;->ivSize_:I

    return v0
.end method

.method public final K(I)V
    .locals 0

    iput p1, p0, LP8;->ivSize_:I

    return-void
.end method

.method public final n(Lcom/google/crypto/tink/shaded/protobuf/t$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    sget-object p2, LP8$a;->a:[I

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
    sget-object p1, LP8;->PARSER:LWH3;

    if-nez p1, :cond_1

    const-class p2, LP8;

    monitor-enter p2

    :try_start_0
    sget-object p1, LP8;->PARSER:LWH3;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/t$b;

    sget-object p3, LP8;->DEFAULT_INSTANCE:LP8;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/t$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/t;)V

    sput-object p1, LP8;->PARSER:LWH3;

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
    sget-object p1, LP8;->DEFAULT_INSTANCE:LP8;

    return-object p1

    :pswitch_4
    new-array p1, p2, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string p3, "ivSize_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b"

    sget-object p3, LP8;->DEFAULT_INSTANCE:LP8;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->w(Lcom/google/crypto/tink/shaded/protobuf/F;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, LP8$b;

    invoke-direct {p1, p3}, LP8$b;-><init>(LP8$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, LP8;

    invoke-direct {p1}, LP8;-><init>()V

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
