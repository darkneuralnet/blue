.class public final LH39;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lt19;IIJIIII)V
    .locals 0

    invoke-static/range {p1 .. p8}, LH39;->b(IIJIIII)Ly39;

    move-result-object p1

    sget-object p2, LGF8;->W1:LGF8;

    invoke-virtual {p0, p1, p2}, Lt19;->c(Ly39;LGF8;)V

    return-void
.end method

.method public static b(IIJIIII)Ly39;
    .locals 11

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long v8, v0, p2

    new-instance v0, Ly39;

    move-object v2, v0

    move v3, p0

    move v4, p1

    move/from16 v5, p6

    move v6, p4

    move/from16 v7, p5

    move/from16 v10, p7

    invoke-direct/range {v2 .. v10}, Ly39;-><init>(IIIIIJI)V

    return-object v0
.end method
