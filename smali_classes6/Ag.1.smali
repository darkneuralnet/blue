.class public final LAg;
.super Lt0;
.source "SourceFile"


# direct methods
.method public constructor <init>(LCT;)V
    .locals 0

    invoke-direct {p0, p1}, Lt0;-><init>(LCT;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;,
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lt0;->b()LhB1;

    move-result-object v1

    const/4 v2, 0x5

    invoke-virtual {v1, v0, v2}, LhB1;->a(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
