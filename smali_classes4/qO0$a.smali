.class public final LqO0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRa4$b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LqO0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LpO0;)V
    .locals 0

    invoke-direct {p0}, LqO0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LRa4;LE31;Landroid/content/DialogInterface;Lio/reactivex/subjects/h;)LRa4$b;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "LRa4;",
            "LE31;",
            "Landroid/content/DialogInterface;",
            "Lio/reactivex/subjects/h<",
            "Ljava/util/List<",
            "Lco/bird/android/model/QCAutoCheck;",
            ">;>;)",
            "LRa4$b;"
        }
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p5}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p6 .. p6}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p7 .. p7}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v9, LqO0$b;

    const/4 v8, 0x0

    move-object v0, v9

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v8}, LqO0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LRa4;LE31;Landroid/content/DialogInterface;Lio/reactivex/subjects/h;LrO0;)V

    return-object v9
.end method
