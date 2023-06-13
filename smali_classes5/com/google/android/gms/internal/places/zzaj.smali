.class public abstract Lcom/google/android/gms/internal/places/zzaj;
.super LDq9;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/places/zzaj$a;,
        Lcom/google/android/gms/internal/places/zzaj$zzc;
    }
.end annotation


# static fields
.field public static final b:Ljava/util/logging/Logger;

.field public static final c:Z


# instance fields
.field public a:Lrq7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/places/zzaj;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/places/zzaj;->b:Ljava/util/logging/Logger;

    invoke-static {}, Lt58;->o()Z

    move-result v0

    sput-boolean v0, Lcom/google/android/gms/internal/places/zzaj;->c:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LDq9;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lyp7;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/places/zzaj;-><init>()V

    return-void
.end method

.method public static A0(I)I
    .locals 0

    const/4 p0, 0x4

    return p0
.end method

.method public static B0(I)I
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->w0(I)I

    move-result p0

    return p0
.end method

.method public static C0(I)I
    .locals 1

    shl-int/lit8 v0, p0, 0x1

    shr-int/lit8 p0, p0, 0x1f

    xor-int/2addr p0, v0

    return p0
.end method

.method public static D0(I)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->x0(I)I

    move-result p0

    return p0
.end method

.method public static G(ILzT7;LLY7;)I
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result p0

    shl-int/lit8 p0, p0, 0x1

    check-cast p1, Lcom/google/android/gms/internal/places/k;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/places/k;->b()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-interface {p2, p1}, LLY7;->h(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/places/k;->a(I)V

    :cond_0
    add-int/2addr p0, v0

    return p0
.end method

.method public static H(ILjv9;)I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result p0

    invoke-virtual {p1}, Ljv9;->size()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/places/zzaj;->x0(I)I

    move-result v0

    add-int/2addr v0, p1

    add-int/2addr p0, v0

    return p0
.end method

.method public static I(IZ)I
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static J(LzT7;)I
    .locals 1

    invoke-interface {p0}, LzT7;->g()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->x0(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static K(Z)I
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public static L([B)I
    .locals 1

    array-length p0, p0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->x0(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static R(F)I
    .locals 0

    const/4 p0, 0x4

    return p0
.end method

.method public static S(IJ)I
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result p0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/places/zzaj;->b0(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static T(ILjv9;)I
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result v1

    shl-int/lit8 v0, v1, 0x1

    const/4 v1, 0x2

    invoke-static {v1, p0}, Lcom/google/android/gms/internal/places/zzaj;->g0(II)I

    move-result p0

    add-int/2addr v0, p0

    const/4 p0, 0x3

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/places/zzaj;->H(ILjv9;)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public static U(LzT7;)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-interface {p0}, LzT7;->g()I

    move-result p0

    return p0
.end method

.method public static X(IJ)I
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result p0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/places/zzaj;->b0(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static Y(J)I
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/places/zzaj;->b0(J)I

    move-result p0

    return p0
.end method

.method public static a0(IJ)I
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result p0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/places/zzaj;->o0(J)J

    move-result-wide p1

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/places/zzaj;->b0(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static b0(J)I
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

.method public static synthetic c()Z
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/places/zzaj;->c:Z

    return v0
.end method

.method public static d(ILeM7;)I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result p0

    invoke-virtual {p1}, LeM7;->a()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/places/zzaj;->x0(I)I

    move-result v0

    add-int/2addr v0, p1

    add-int/2addr p0, v0

    return p0
.end method

.method public static d0(II)I
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/android/gms/internal/places/zzaj;->w0(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static e(LeM7;)I
    .locals 1

    invoke-virtual {p0}, LeM7;->a()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->x0(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static e0(IJ)I
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x8

    return p0
.end method

.method public static f(LzT7;LLY7;)I
    .locals 2

    check-cast p0, Lcom/google/android/gms/internal/places/k;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/places/k;->b()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-interface {p1, p0}, LLY7;->h(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/places/k;->a(I)V

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/places/zzaj;->x0(I)I

    move-result p0

    add-int/2addr p0, v0

    return p0
.end method

.method public static f0(J)I
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/places/zzaj;->o0(J)J

    move-result-wide p0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/places/zzaj;->b0(J)I

    move-result p0

    return p0
.end method

.method public static g0(II)I
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/android/gms/internal/places/zzaj;->x0(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static h0(IJ)I
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x8

    return p0
.end method

.method public static i0(J)I
    .locals 0

    const/16 p0, 0x8

    return p0
.end method

.method public static j0(II)I
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/android/gms/internal/places/zzaj;->C0(I)I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/places/zzaj;->x0(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static k0(J)I
    .locals 0

    const/16 p0, 0x8

    return p0
.end method

.method public static m0(II)I
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x4

    return p0
.end method

.method public static n0(Ljava/lang/String;)I
    .locals 1

    :try_start_0
    invoke-static {p0}, LU68;->c(Ljava/lang/CharSequence;)I

    move-result p0
    :try_end_0
    .catch Le88; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, LlF7;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    array-length p0, p0

    :goto_0
    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->x0(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static o0(J)J
    .locals 3

    const/4 v0, 0x1

    shl-long v0, p0, v0

    const/16 v2, 0x3f

    shr-long/2addr p0, v2

    xor-long/2addr p0, v0

    return-wide p0
.end method

.method public static p0(II)I
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x4

    return p0
.end method

.method public static q(D)I
    .locals 0

    const/16 p0, 0x8

    return p0
.end method

.method public static q0(II)I
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/android/gms/internal/places/zzaj;->w0(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static r(ID)I
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x8

    return p0
.end method

.method public static s(IF)I
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x4

    return p0
.end method

.method public static t(ILjava/lang/String;)I
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/android/gms/internal/places/zzaj;->n0(Ljava/lang/String;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static u(ILeM7;)I
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result v1

    shl-int/lit8 v0, v1, 0x1

    const/4 v1, 0x2

    invoke-static {v1, p0}, Lcom/google/android/gms/internal/places/zzaj;->g0(II)I

    move-result p0

    add-int/2addr v0, p0

    const/4 p0, 0x3

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/places/zzaj;->d(ILeM7;)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public static v(ILzT7;)I
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result v1

    shl-int/lit8 v0, v1, 0x1

    const/4 v1, 0x2

    invoke-static {v1, p0}, Lcom/google/android/gms/internal/places/zzaj;->g0(II)I

    move-result p0

    add-int/2addr v0, p0

    const/4 p0, 0x3

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/android/gms/internal/places/zzaj;->J(LzT7;)I

    move-result p1

    add-int/2addr p0, p1

    add-int/2addr v0, p0

    return v0
.end method

.method public static v0(I)I
    .locals 0

    shl-int/lit8 p0, p0, 0x3

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->x0(I)I

    move-result p0

    return p0
.end method

.method public static w(ILzT7;LLY7;)I
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->v0(I)I

    move-result p0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/places/zzaj;->f(LzT7;LLY7;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static w0(I)I
    .locals 0

    if-ltz p0, :cond_0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->x0(I)I

    move-result p0

    return p0

    :cond_0
    const/16 p0, 0xa

    return p0
.end method

.method public static x(Ljv9;)I
    .locals 1

    invoke-virtual {p0}, Ljv9;->size()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->x0(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static x0(I)I
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

.method public static y([B)Lcom/google/android/gms/internal/places/zzaj;
    .locals 3

    array-length v0, p0

    new-instance v1, Lcom/google/android/gms/internal/places/zzaj$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v0}, Lcom/google/android/gms/internal/places/zzaj$a;-><init>([BII)V

    return-object v1
.end method

.method public static y0(I)I
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->C0(I)I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/places/zzaj;->x0(I)I

    move-result p0

    return p0
.end method

.method public static z0(I)I
    .locals 0

    const/4 p0, 0x4

    return p0
.end method


# virtual methods
.method public final A(IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p2, p3}, Lcom/google/android/gms/internal/places/zzaj;->o0(J)J

    move-result-wide p2

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/places/zzaj;->j(IJ)V

    return-void
.end method

.method public abstract B(ILjv9;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract C(IZ)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract D(J)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract E(LzT7;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final F(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    int-to-byte p1, p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/places/zzaj;->M(B)V

    return-void
.end method

.method public abstract M(B)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final N(F)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/places/zzaj;->u0(I)V

    return-void
.end method

.method public abstract O(II)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract P(IJ)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final Q(J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/places/zzaj;->o0(J)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/places/zzaj;->D(J)V

    return-void
.end method

.method public abstract V(II)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract W(J)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final Z(II)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/internal/places/zzaj;->C0(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/places/zzaj;->V(II)V

    return-void
.end method

.method public abstract b()I
.end method

.method public abstract c0(II)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final g(D)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/places/zzaj;->W(J)V

    return-void
.end method

.method public final h(ID)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p2, p3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p2

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/places/zzaj;->P(IJ)V

    return-void
.end method

.method public final i(IF)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/places/zzaj;->c0(II)V

    return-void
.end method

.method public abstract j(IJ)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract k(ILjava/lang/String;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract l(ILzT7;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract l0(Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract m(ILzT7;LLY7;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract n(ILjv9;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final o(Ljava/lang/String;Le88;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/places/zzaj;->b:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v2, "com.google.protobuf.CodedOutputStream"

    const-string v3, "inefficientWriteStringNoTag"

    const-string v4, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p2, LlF7;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    :try_start_0
    array-length p2, p1

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/places/zzaj;->s0(I)V

    array-length p2, p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, LDq9;->a([BII)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/internal/places/zzaj$zzc; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    throw p1

    :catch_1
    move-exception p1

    new-instance p2, Lcom/google/android/gms/internal/places/zzaj$zzc;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/places/zzaj$zzc;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public abstract p(Ljv9;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract r0(I)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract s0(I)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final t0(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/places/zzaj;->C0(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/places/zzaj;->s0(I)V

    return-void
.end method

.method public abstract u0(I)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract z(II)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
