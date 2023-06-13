.class public final LyW2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LnH6;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;LQx;IILjava/util/Map;)LET;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LQx;",
            "II",
            "Ljava/util/Map<",
            "Leb1;",
            "*>;)",
            "LET;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/WriterException;
        }
    .end annotation

    sget-object v0, LyW2$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "No encoder available for format "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    new-instance v0, Lcv;

    invoke-direct {v0}, Lcv;-><init>()V

    goto :goto_0

    :pswitch_1
    new-instance v0, LOS0;

    invoke-direct {v0}, LOS0;-><init>()V

    goto :goto_0

    :pswitch_2
    new-instance v0, LJl0;

    invoke-direct {v0}, LJl0;-><init>()V

    goto :goto_0

    :pswitch_3
    new-instance v0, LxD3;

    invoke-direct {v0}, LxD3;-><init>()V

    goto :goto_0

    :pswitch_4
    new-instance v0, LjP1;

    invoke-direct {v0}, LjP1;-><init>()V

    goto :goto_0

    :pswitch_5
    new-instance v0, LLl0;

    invoke-direct {v0}, LLl0;-><init>()V

    goto :goto_0

    :pswitch_6
    new-instance v0, LPl0;

    invoke-direct {v0}, LPl0;-><init>()V

    goto :goto_0

    :pswitch_7
    new-instance v0, LNl0;

    invoke-direct {v0}, LNl0;-><init>()V

    goto :goto_0

    :pswitch_8
    new-instance v0, Lqb4;

    invoke-direct {v0}, Lqb4;-><init>()V

    goto :goto_0

    :pswitch_9
    new-instance v0, Lad6;

    invoke-direct {v0}, Lad6;-><init>()V

    goto :goto_0

    :pswitch_a
    new-instance v0, LF81;

    invoke-direct {v0}, LF81;-><init>()V

    goto :goto_0

    :pswitch_b
    new-instance v0, Lhd6;

    invoke-direct {v0}, Lhd6;-><init>()V

    goto :goto_0

    :pswitch_c
    new-instance v0, LH81;

    invoke-direct {v0}, LH81;-><init>()V

    :goto_0
    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, LnH6;->a(Ljava/lang/String;LQx;IILjava/util/Map;)LET;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
