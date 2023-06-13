.class public LTF0;
.super LL;
.source "SourceFile"


# static fields
.field public static final b:LTF0;

.field public static final c:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LTF0;

    invoke-direct {v0}, LTF0;-><init>()V

    sput-object v0, LTF0;->b:LTF0;

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, LTF0;->c:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LL;-><init>()V

    return-void
.end method


# virtual methods
.method public o(LQ;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    sget-object v1, LTF0;->c:[B

    invoke-virtual {p1, p2, v0, v1}, LQ;->n(ZI[B)V

    return-void
.end method

.method public s()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public w()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
