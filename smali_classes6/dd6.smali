.class public final Ldd6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:[I


# instance fields
.field public final a:Lbd6;

.field public final b:Lcd6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Ldd6;->c:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x1
        0x1
        0x2
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lbd6;

    invoke-direct {v0}, Lbd6;-><init>()V

    iput-object v0, p0, Ldd6;->a:Lbd6;

    new-instance v0, Lcd6;

    invoke-direct {v0}, Lcd6;-><init>()V

    iput-object v0, p0, Ldd6;->b:Lcd6;

    return-void
.end method


# virtual methods
.method public a(ILCT;I)LbN4;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    const/4 v0, 0x0

    sget-object v1, Ldd6;->c:[I

    invoke-static {p2, p3, v0, v1}, Led6;->m(LCT;IZ[I)[I

    move-result-object p3

    :try_start_0
    iget-object v0, p0, Ldd6;->b:Lcd6;

    invoke-virtual {v0, p1, p2, p3}, Lcd6;->b(ILCT;[I)LbN4;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/zxing/ReaderException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    iget-object v0, p0, Ldd6;->a:Lbd6;

    invoke-virtual {v0, p1, p2, p3}, Lbd6;->b(ILCT;[I)LbN4;

    move-result-object p1

    return-object p1
.end method
