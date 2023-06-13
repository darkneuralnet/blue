.class public final LLY;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a8\u0006\u0007"
    }
    d2 = {
        "LKY;",
        "",
        "success",
        "",
        "exceptionType",
        "LJY;",
        "a",
        "model-analytics_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(LKY;ZLjava/lang/String;)LJY;
    .locals 16

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LKY;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, LKY;->h()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, LKY;->d()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, LKY;->f()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, LKY;->g()Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, LKY;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, LKY;->e()Ljava/lang/Integer;

    move-result-object v13

    new-instance v0, LJY;

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v14, 0x19

    const/4 v15, 0x0

    move-object v1, v0

    move/from16 v11, p1

    move-object/from16 v12, p2

    invoke-direct/range {v1 .. v15}, LJY;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static synthetic toBluetoothWakeEndedEvent$default(LKY;ZLjava/lang/String;ILjava/lang/Object;)LJY;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, LLY;->a(LKY;ZLjava/lang/String;)LJY;

    move-result-object p0

    return-object p0
.end method
