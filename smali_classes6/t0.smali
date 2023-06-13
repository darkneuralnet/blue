.class public abstract Lt0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LCT;

.field public final b:LhB1;


# direct methods
.method public constructor <init>(LCT;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt0;->a:LCT;

    new-instance v0, LhB1;

    invoke-direct {v0, p1}, LhB1;-><init>(LCT;)V

    iput-object v0, p0, Lt0;->b:LhB1;

    return-void
.end method

.method public static a(LCT;)Lt0;
    .locals 7

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LCT;->k(I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Ls;

    invoke-direct {v0, p0}, Ls;-><init>(LCT;)V

    return-object v0

    :cond_0
    const/4 v1, 0x2

    invoke-virtual {p0, v1}, LCT;->k(I)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v0, LAg;

    invoke-direct {v0, p0}, LAg;-><init>(LCT;)V

    return-object v0

    :cond_1
    const/4 v1, 0x4

    invoke-static {p0, v0, v1}, LhB1;->g(LCT;II)I

    move-result v2

    if-eq v2, v1, :cond_5

    const/4 v1, 0x5

    if-eq v2, v1, :cond_4

    invoke-static {p0, v0, v1}, LhB1;->g(LCT;II)I

    move-result v1

    const/16 v2, 0xc

    if-eq v1, v2, :cond_3

    const/16 v2, 0xd

    if-eq v1, v2, :cond_2

    const/4 v1, 0x7

    invoke-static {p0, v0, v1}, LhB1;->g(LCT;II)I

    move-result v0

    const-string v1, "17"

    const-string v2, "15"

    const-string v3, "13"

    const-string v4, "11"

    const-string v5, "320"

    const-string v6, "310"

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "unknown decoder: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance v0, Lq;

    invoke-direct {v0, p0, v5, v1}, Lq;-><init>(LCT;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_1
    new-instance v0, Lq;

    invoke-direct {v0, p0, v6, v1}, Lq;-><init>(LCT;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_2
    new-instance v0, Lq;

    invoke-direct {v0, p0, v5, v2}, Lq;-><init>(LCT;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_3
    new-instance v0, Lq;

    invoke-direct {v0, p0, v6, v2}, Lq;-><init>(LCT;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_4
    new-instance v0, Lq;

    invoke-direct {v0, p0, v5, v3}, Lq;-><init>(LCT;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_5
    new-instance v0, Lq;

    invoke-direct {v0, p0, v6, v3}, Lq;-><init>(LCT;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_6
    new-instance v0, Lq;

    invoke-direct {v0, p0, v5, v4}, Lq;-><init>(LCT;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_7
    new-instance v0, Lq;

    invoke-direct {v0, p0, v6, v4}, Lq;-><init>(LCT;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_2
    new-instance v0, Lp;

    invoke-direct {v0, p0}, Lp;-><init>(LCT;)V

    return-object v0

    :cond_3
    new-instance v0, Lo;

    invoke-direct {v0, p0}, Lo;-><init>(LCT;)V

    return-object v0

    :cond_4
    new-instance v0, Ln;

    invoke-direct {v0, p0}, Ln;-><init>(LCT;)V

    return-object v0

    :cond_5
    new-instance v0, Lm;

    invoke-direct {v0, p0}, Lm;-><init>(LCT;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x38
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final b()LhB1;
    .locals 1

    iget-object v0, p0, Lt0;->b:LhB1;

    return-object v0
.end method

.method public final c()LCT;
    .locals 1

    iget-object v0, p0, Lt0;->a:LCT;

    return-object v0
.end method

.method public abstract d()Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;,
            Lcom/google/zxing/FormatException;
        }
    .end annotation
.end method
