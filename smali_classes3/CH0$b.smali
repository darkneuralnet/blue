.class public final LCH0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbe0$a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCH0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LDH0;)V
    .locals 0

    invoke-direct {p0}, LCH0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lbe0;Landroid/content/DialogInterface;Lio/reactivex/subjects/h;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;)Lbe0$a;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lbe0;",
            "Landroid/content/DialogInterface;",
            "Lio/reactivex/subjects/h<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/IssueStatus;",
            "Lco/bird/android/model/constant/IssueStatusReason;",
            ">;>;",
            "Landroid/widget/TextView;",
            "Landroidx/recyclerview/widget/RecyclerView;",
            ")",
            "Lbe0$a;"
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

    new-instance v10, LCH0$a;

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

    invoke-direct/range {v0 .. v9}, LCH0$a;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lbe0;Landroid/content/DialogInterface;Lio/reactivex/subjects/h;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;LBH0;)V

    return-object v10
.end method
