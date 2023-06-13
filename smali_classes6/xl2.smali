.class public final Lxl2;
.super Lcom/google/crypto/tink/shaded/protobuf/t;
.source "SourceFile"

# interfaces
.implements LxT2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxl2$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/t<",
        "Lxl2;",
        "Lxl2$b;",
        ">;",
        "LxT2;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lxl2;

.field public static final DEK_TEMPLATE_FIELD_NUMBER:I = 0x2

.field public static final KEK_URI_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:LWH3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWH3<",
            "Lxl2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private dekTemplate_:LKk2;

.field private kekUri_:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxl2;

    invoke-direct {v0}, Lxl2;-><init>()V

    sput-object v0, Lxl2;->DEFAULT_INSTANCE:Lxl2;

    const-class v1, Lxl2;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->C(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/t;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lxl2;->kekUri_:Ljava/lang/String;

    return-void
.end method

.method public static synthetic F()Lxl2;
    .locals 1

    sget-object v0, Lxl2;->DEFAULT_INSTANCE:Lxl2;

    return-object v0
.end method

.method public static G()Lxl2;
    .locals 1

    sget-object v0, Lxl2;->DEFAULT_INSTANCE:Lxl2;

    return-object v0
.end method

.method public static K(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)Lxl2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    sget-object v0, Lxl2;->DEFAULT_INSTANCE:Lxl2;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->x(Lcom/google/crypto/tink/shaded/protobuf/t;Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p0

    check-cast p0, Lxl2;

    return-object p0
.end method


# virtual methods
.method public H()LKk2;
    .locals 1

    iget-object v0, p0, Lxl2;->dekTemplate_:LKk2;

    if-nez v0, :cond_0

    invoke-static {}, LKk2;->J()LKk2;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxl2;->kekUri_:Ljava/lang/String;

    return-object v0
.end method

.method public J()Z
    .locals 1

    iget-object v0, p0, Lxl2;->dekTemplate_:LKk2;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final n(Lcom/google/crypto/tink/shaded/protobuf/t$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lxl2$a;->a:[I

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
    sget-object p1, Lxl2;->PARSER:LWH3;

    if-nez p1, :cond_1

    const-class p2, Lxl2;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lxl2;->PARSER:LWH3;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/t$b;

    sget-object p3, Lxl2;->DEFAULT_INSTANCE:Lxl2;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/t$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/t;)V

    sput-object p1, Lxl2;->PARSER:LWH3;

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
    sget-object p1, Lxl2;->DEFAULT_INSTANCE:Lxl2;

    return-object p1

    :pswitch_4
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "kekUri_"

    aput-object v0, p1, p3

    const-string p3, "dekTemplate_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t"

    sget-object p3, Lxl2;->DEFAULT_INSTANCE:Lxl2;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->w(Lcom/google/crypto/tink/shaded/protobuf/F;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lxl2$b;

    invoke-direct {p1, p3}, Lxl2$b;-><init>(Lxl2$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lxl2;

    invoke-direct {p1}, Lxl2;-><init>()V

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
