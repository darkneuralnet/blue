.class public abstract Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;
.super LJ70;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream$b;,
        Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream$OutOfSpaceException;
    }
.end annotation


# static fields
.field public static final c:Ljava/util/logging/Logger;

.field public static final d:Z


# instance fields
.field public a:Lcom/google/crypto/tink/shaded/protobuf/j;

.field public b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->c:Ljava/util/logging/Logger;

    invoke-static {}, Lze6;->E()Z

    move-result v0

    sput-boolean v0, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->d:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LJ70;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;-><init>()V

    return-void
.end method

.method public static A(ILcom/google/crypto/tink/shaded/protobuf/x;)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->B(Lcom/google/crypto/tink/shaded/protobuf/x;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static B(Lcom/google/crypto/tink/shaded/protobuf/x;)I
    .locals 0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/x;->b()I

    move-result p0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->C(I)I

    move-result p0

    return p0
.end method

.method public static C(I)I
    .locals 1

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->W(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static D(ILcom/google/crypto/tink/shaded/protobuf/F;)I
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result v0

    const/4 v1, 0x2

    mul-int/2addr v0, v1

    invoke-static {v1, p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->V(II)I

    move-result p0

    add-int/2addr v0, p0

    const/4 p0, 0x3

    invoke-static {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->E(ILcom/google/crypto/tink/shaded/protobuf/F;)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public static E(ILcom/google/crypto/tink/shaded/protobuf/F;)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->G(Lcom/google/crypto/tink/shaded/protobuf/F;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static F(ILcom/google/crypto/tink/shaded/protobuf/F;Lcom/google/crypto/tink/shaded/protobuf/M;)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result p0

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->H(Lcom/google/crypto/tink/shaded/protobuf/F;Lcom/google/crypto/tink/shaded/protobuf/M;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static G(Lcom/google/crypto/tink/shaded/protobuf/F;)I
    .locals 0

    invoke-interface {p0}, Lcom/google/crypto/tink/shaded/protobuf/F;->getSerializedSize()I

    move-result p0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->C(I)I

    move-result p0

    return p0
.end method

.method public static H(Lcom/google/crypto/tink/shaded/protobuf/F;Lcom/google/crypto/tink/shaded/protobuf/M;)I
    .locals 0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/a;

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b(Lcom/google/crypto/tink/shaded/protobuf/M;)I

    move-result p0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->C(I)I

    move-result p0

    return p0
.end method

.method public static I(ILcom/google/crypto/tink/shaded/protobuf/g;)I
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result v0

    const/4 v1, 0x2

    mul-int/2addr v0, v1

    invoke-static {v1, p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->V(II)I

    move-result p0

    add-int/2addr v0, p0

    const/4 p0, 0x3

    invoke-static {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->g(ILcom/google/crypto/tink/shaded/protobuf/g;)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public static J(I)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->W(I)I

    move-result p0

    return p0
.end method

.method public static K(II)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->L(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static L(I)I
    .locals 0

    const/4 p0, 0x4

    return p0
.end method

.method public static M(IJ)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result p0

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->N(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static N(J)I
    .locals 0

    const/16 p0, 0x8

    return p0
.end method

.method public static O(II)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->P(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static P(I)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->Z(I)I

    move-result p0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->W(I)I

    move-result p0

    return p0
.end method

.method public static Q(IJ)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result p0

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->R(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static R(J)I
    .locals 0

    invoke-static {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->a0(J)J

    move-result-wide p0

    invoke-static {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->Y(J)I

    move-result p0

    return p0
.end method

.method public static S(ILjava/lang/String;)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->T(Ljava/lang/String;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static T(Ljava/lang/String;)I
    .locals 1

    :try_start_0
    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/T;->g(Ljava/lang/CharSequence;)I

    move-result p0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/T$d; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/v;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    array-length p0, p0

    :goto_0
    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->C(I)I

    move-result p0

    return p0
.end method

.method public static U(I)I
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/U;->c(II)I

    move-result p0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->W(I)I

    move-result p0

    return p0
.end method

.method public static V(II)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->W(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static W(I)I
    .locals 1

    and-int/lit8 v0, p0, -0x80

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    and-int/lit16 v0, p0, -0x4000

    if-nez v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const/high16 v0, -0x200000

    and-int/2addr v0, p0

    if-nez v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    const/high16 v0, -0x10000000

    and-int/2addr p0, v0

    if-nez p0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const/4 p0, 0x5

    return p0
.end method

.method public static X(IJ)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result p0

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->Y(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static Y(J)I
    .locals 6

    const-wide/16 v0, -0x80

    and-long/2addr v0, p0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    cmp-long v0, p0, v2

    if-gez v0, :cond_1

    const/16 p0, 0xa

    return p0

    :cond_1
    const-wide v0, -0x800000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    const/16 v0, 0x1c

    ushr-long/2addr p0, v0

    const/4 v0, 0x6

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    :goto_0
    const-wide/32 v4, -0x200000

    and-long/2addr v4, p0

    cmp-long v1, v4, v2

    if-eqz v1, :cond_3

    add-int/lit8 v0, v0, 0x2

    const/16 v1, 0xe

    ushr-long/2addr p0, v1

    :cond_3
    const-wide/16 v4, -0x4000

    and-long/2addr p0, v4

    cmp-long p0, p0, v2

    if-eqz p0, :cond_4

    add-int/lit8 v0, v0, 0x1

    :cond_4
    return v0
.end method

.method public static Z(I)I
    .locals 1

    shl-int/lit8 v0, p0, 0x1

    shr-int/lit8 p0, p0, 0x1f

    xor-int/2addr p0, v0

    return p0
.end method

.method public static a0(J)J
    .locals 3

    const/4 v0, 0x1

    shl-long v0, p0, v0

    const/16 v2, 0x3f

    shr-long/2addr p0, v2

    xor-long/2addr p0, v0

    return-wide p0
.end method

.method public static synthetic b()Z
    .locals 1

    sget-boolean v0, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->d:Z

    return v0
.end method

.method public static d(IZ)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->e(Z)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static d0([B)Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;
    .locals 2

    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->e0([BII)Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;

    move-result-object p0

    return-object p0
.end method

.method public static e(Z)I
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public static e0([BII)Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream$b;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream$b;-><init>([BII)V

    return-object v0
.end method

.method public static f([B)I
    .locals 0

    array-length p0, p0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->C(I)I

    move-result p0

    return p0
.end method

.method public static g(ILcom/google/crypto/tink/shaded/protobuf/g;)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->h(Lcom/google/crypto/tink/shaded/protobuf/g;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static h(Lcom/google/crypto/tink/shaded/protobuf/g;)I
    .locals 0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/g;->size()I

    move-result p0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->C(I)I

    move-result p0

    return p0
.end method

.method public static i(ID)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result p0

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->j(D)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static j(D)I
    .locals 0

    const/16 p0, 0x8

    return p0
.end method

.method public static k(II)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->l(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static l(I)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->w(I)I

    move-result p0

    return p0
.end method

.method public static m(II)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->n(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static n(I)I
    .locals 0

    const/4 p0, 0x4

    return p0
.end method

.method public static o(IJ)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result p0

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->p(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static p(J)I
    .locals 0

    const/16 p0, 0x8

    return p0
.end method

.method public static q(IF)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->r(F)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static r(F)I
    .locals 0

    const/4 p0, 0x4

    return p0
.end method

.method public static s(ILcom/google/crypto/tink/shaded/protobuf/F;Lcom/google/crypto/tink/shaded/protobuf/M;)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result p0

    mul-int/lit8 p0, p0, 0x2

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->u(Lcom/google/crypto/tink/shaded/protobuf/F;Lcom/google/crypto/tink/shaded/protobuf/M;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static t(Lcom/google/crypto/tink/shaded/protobuf/F;)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-interface {p0}, Lcom/google/crypto/tink/shaded/protobuf/F;->getSerializedSize()I

    move-result p0

    return p0
.end method

.method public static u(Lcom/google/crypto/tink/shaded/protobuf/F;Lcom/google/crypto/tink/shaded/protobuf/M;)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/a;

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b(Lcom/google/crypto/tink/shaded/protobuf/M;)I

    move-result p0

    return p0
.end method

.method public static v(II)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->w(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static w(I)I
    .locals 0

    if-ltz p0, :cond_0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->W(I)I

    move-result p0

    return p0

    :cond_0
    const/16 p0, 0xa

    return p0
.end method

.method public static x(IJ)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result p0

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->y(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static y(J)I
    .locals 0

    invoke-static {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->Y(J)I

    move-result p0

    return p0
.end method

.method public static z(ILcom/google/crypto/tink/shaded/protobuf/x;)I
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->U(I)I

    move-result v0

    const/4 v1, 0x2

    mul-int/2addr v0, v1

    invoke-static {v1, p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->V(II)I

    move-result p0

    add-int/2addr v0, p0

    const/4 p0, 0x3

    invoke-static {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->A(ILcom/google/crypto/tink/shaded/protobuf/x;)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method


# virtual methods
.method public abstract A0(ILcom/google/crypto/tink/shaded/protobuf/F;Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract B0(ILcom/google/crypto/tink/shaded/protobuf/F;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract C0(ILcom/google/crypto/tink/shaded/protobuf/g;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final D0(II)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->o0(II)V

    return-void
.end method

.method public final E0(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->p0(I)V

    return-void
.end method

.method public final F0(IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->q0(IJ)V

    return-void
.end method

.method public final G0(J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->r0(J)V

    return-void
.end method

.method public final H0(II)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->Z(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->N0(II)V

    return-void
.end method

.method public final I0(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->Z(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->O0(I)V

    return-void
.end method

.method public final J0(IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->a0(J)J

    move-result-wide p2

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->P0(IJ)V

    return-void
.end method

.method public final K0(J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->a0(J)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->Q0(J)V

    return-void
.end method

.method public abstract L0(ILjava/lang/String;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract M0(II)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract N0(II)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract O0(I)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract P0(IJ)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract Q0(J)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract a([BII)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final b0(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/T$d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->c:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v2, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"

    invoke-virtual {v0, v1, v2, p2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p2, Lcom/google/crypto/tink/shaded/protobuf/v;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    :try_start_0
    array-length p2, p1

    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->O0(I)V

    array-length p2, p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->a([BII)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream$OutOfSpaceException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    throw p1

    :catch_1
    move-exception p1

    new-instance p2, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream$OutOfSpaceException;

    invoke-direct {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream$OutOfSpaceException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final c()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->f0()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->b:Z

    return v0
.end method

.method public abstract f0()I
.end method

.method public abstract g0(B)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract h0(IZ)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final i0(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    int-to-byte p1, p1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->g0(B)V

    return-void
.end method

.method public abstract j0(ILcom/google/crypto/tink/shaded/protobuf/g;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final k0(ID)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p2, p3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p2

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->q0(IJ)V

    return-void
.end method

.method public final l0(D)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->r0(J)V

    return-void
.end method

.method public final m0(II)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->w0(II)V

    return-void
.end method

.method public final n0(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->x0(I)V

    return-void
.end method

.method public abstract o0(II)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract p0(I)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract q0(IJ)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract r0(J)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final s0(IF)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->o0(II)V

    return-void
.end method

.method public final t0(F)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->p0(I)V

    return-void
.end method

.method public final u0(ILcom/google/crypto/tink/shaded/protobuf/F;Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x3

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->M0(II)V

    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->v0(Lcom/google/crypto/tink/shaded/protobuf/F;Lcom/google/crypto/tink/shaded/protobuf/M;)V

    const/4 p2, 0x4

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->M0(II)V

    return-void
.end method

.method public final v0(Lcom/google/crypto/tink/shaded/protobuf/F;Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->a:Lcom/google/crypto/tink/shaded/protobuf/j;

    invoke-interface {p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/M;->j(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/V;)V

    return-void
.end method

.method public abstract w0(II)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract x0(I)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final y0(IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->P0(IJ)V

    return-void
.end method

.method public final z0(J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/CodedOutputStream;->Q0(J)V

    return-void
.end method
