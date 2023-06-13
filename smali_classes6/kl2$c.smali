.class public final Lkl2$c;
.super Lcom/google/crypto/tink/shaded/protobuf/t;
.source "SourceFile"

# interfaces
.implements LxT2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkl2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkl2$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/t<",
        "Lkl2$c;",
        "Lkl2$c$a;",
        ">;",
        "LxT2;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lkl2$c;

.field public static final KEY_DATA_FIELD_NUMBER:I = 0x1

.field public static final KEY_ID_FIELD_NUMBER:I = 0x3

.field public static final OUTPUT_PREFIX_TYPE_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:LWH3; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWH3<",
            "Lkl2$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final STATUS_FIELD_NUMBER:I = 0x2


# instance fields
.field private keyData_:Lhk2;

.field private keyId_:I

.field private outputPrefixType_:I

.field private status_:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkl2$c;

    invoke-direct {v0}, Lkl2$c;-><init>()V

    sput-object v0, Lkl2$c;->DEFAULT_INSTANCE:Lkl2$c;

    const-class v1, Lkl2$c;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->C(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/t;-><init>()V

    return-void
.end method

.method public static synthetic F()Lkl2$c;
    .locals 1

    sget-object v0, Lkl2$c;->DEFAULT_INSTANCE:Lkl2$c;

    return-object v0
.end method

.method public static synthetic G(Lkl2$c;Lhk2;)V
    .locals 0

    invoke-virtual {p0, p1}, Lkl2$c;->Q(Lhk2;)V

    return-void
.end method

.method public static synthetic H(Lkl2$c;LeA3;)V
    .locals 0

    invoke-virtual {p0, p1}, Lkl2$c;->S(LeA3;)V

    return-void
.end method

.method public static synthetic I(Lkl2$c;LIk2;)V
    .locals 0

    invoke-virtual {p0, p1}, Lkl2$c;->T(LIk2;)V

    return-void
.end method

.method public static synthetic J(Lkl2$c;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lkl2$c;->R(I)V

    return-void
.end method

.method public static P()Lkl2$c$a;
    .locals 1

    sget-object v0, Lkl2$c;->DEFAULT_INSTANCE:Lkl2$c;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t;->k()Lcom/google/crypto/tink/shaded/protobuf/t$a;

    move-result-object v0

    check-cast v0, Lkl2$c$a;

    return-object v0
.end method


# virtual methods
.method public K()Lhk2;
    .locals 1

    iget-object v0, p0, Lkl2$c;->keyData_:Lhk2;

    if-nez v0, :cond_0

    invoke-static {}, Lhk2;->J()Lhk2;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public L()I
    .locals 1

    iget v0, p0, Lkl2$c;->keyId_:I

    return v0
.end method

.method public M()LeA3;
    .locals 1

    iget v0, p0, Lkl2$c;->outputPrefixType_:I

    invoke-static {v0}, LeA3;->a(I)LeA3;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, LeA3;->h:LeA3;

    :cond_0
    return-object v0
.end method

.method public N()LIk2;
    .locals 1

    iget v0, p0, Lkl2$c;->status_:I

    invoke-static {v0}, LIk2;->a(I)LIk2;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, LIk2;->g:LIk2;

    :cond_0
    return-object v0
.end method

.method public O()Z
    .locals 1

    iget-object v0, p0, Lkl2$c;->keyData_:Lhk2;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final Q(Lhk2;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lkl2$c;->keyData_:Lhk2;

    return-void
.end method

.method public final R(I)V
    .locals 0

    iput p1, p0, Lkl2$c;->keyId_:I

    return-void
.end method

.method public final S(LeA3;)V
    .locals 0

    invoke-virtual {p1}, LeA3;->getNumber()I

    move-result p1

    iput p1, p0, Lkl2$c;->outputPrefixType_:I

    return-void
.end method

.method public final T(LIk2;)V
    .locals 0

    invoke-virtual {p1}, LIk2;->getNumber()I

    move-result p1

    iput p1, p0, Lkl2$c;->status_:I

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
    sget-object p1, Lkl2$c;->PARSER:LWH3;

    if-nez p1, :cond_1

    const-class p2, Lkl2$c;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lkl2$c;->PARSER:LWH3;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/t$b;

    sget-object p3, Lkl2$c;->DEFAULT_INSTANCE:Lkl2$c;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/t$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/t;)V

    sput-object p1, Lkl2$c;->PARSER:LWH3;

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
    sget-object p1, Lkl2$c;->DEFAULT_INSTANCE:Lkl2$c;

    return-object p1

    :pswitch_4
    const/4 p1, 0x4

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "keyData_"

    aput-object v0, p1, p3

    const-string p3, "status_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "keyId_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "outputPrefixType_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\u000c\u0003\u000b\u0004\u000c"

    sget-object p3, Lkl2$c;->DEFAULT_INSTANCE:Lkl2$c;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/t;->w(Lcom/google/crypto/tink/shaded/protobuf/F;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lkl2$c$a;

    invoke-direct {p1, p3}, Lkl2$c$a;-><init>(Lkl2$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lkl2$c;

    invoke-direct {p1}, Lkl2$c;-><init>()V

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
