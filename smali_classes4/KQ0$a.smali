.class public final LKQ0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LnQ5$c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKQ0;
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

.method public synthetic constructor <init>(LJQ0;)V
    .locals 0

    invoke-direct {p0}, LKQ0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;Lco/bird/android/core/mvp/BaseActivity;LnQ5;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/widget/adapter/ViewHolderSupplier;Landroid/content/DialogInterface;LG31;Lio/reactivex/subjects/h;)LnQ5$c;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "LnQ5;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lco/bird/android/widget/adapter/ViewHolderSupplier<",
            "LeT0;",
            ">;",
            "Landroid/content/DialogInterface;",
            "LG31;",
            "Lio/reactivex/subjects/h<",
            "LnQ5$b;",
            ">;)",
            "LnQ5$c;"
        }
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p5 .. p5}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p6 .. p6}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p7 .. p7}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p8 .. p8}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, LKQ0$b;

    const/4 v9, 0x0

    move-object v0, v10

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v9}, LKQ0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;LnQ5;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/widget/adapter/ViewHolderSupplier;Landroid/content/DialogInterface;LG31;Lio/reactivex/subjects/h;LLQ0;)V

    return-object v10
.end method
