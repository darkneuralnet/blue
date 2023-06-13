.class public final Lns;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lms;


# instance fields
.field public final a:Los;


# direct methods
.method public constructor <init>(Los;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lns;->a:Los;

    return-void
.end method

.method public static b(Los;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Los;",
            ")",
            "LY94<",
            "Lms;",
            ">;"
        }
    .end annotation

    new-instance v0, Lns;

    invoke-direct {v0, p0}, Lns;-><init>(Los;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lqs;Le13;Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/Balance;ZLbz1;Lmr;)Lks;
    .locals 11

    move-object v0, p0

    iget-object v1, v0, Lns;->a:Los;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-virtual/range {v1 .. v10}, Los;->b(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lqs;Le13;Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/Balance;ZLbz1;Lmr;)Lks;

    move-result-object v1

    return-object v1
.end method
