.class public final LYN2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJy\u0010\u0011\u001a\u00028\u0000\"\u000e\u0008\u0000\u0010\u0003*\u0008\u0012\u0004\u0012\u00028\u00010\u0002\"\u0008\u0008\u0001\u0010\u0005*\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\u00062\u000e\u0010\u0008\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0014\u0008\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012JW\u0010\u0017\u001a\u00020\u0016\"\u000e\u0008\u0000\u0010\u0003*\u0008\u0012\u0004\u0012\u00028\u00010\u0002\"\u0008\u0008\u0001\u0010\u0005*\u00020\u0004*\u00028\u00002\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0014\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\u00062\u000e\u0010\u0015\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J:\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019\"\u000e\u0008\u0000\u0010\u0003*\u0008\u0012\u0004\u0012\u00028\u00010\u0002\"\u0008\u0008\u0001\u0010\u0005*\u00020\u0004*\u00020\u00162\u0006\u0010\n\u001a\u00020\tH\u0002\u00a8\u0006\u001d"
    }
    d2 = {
        "LYN2;",
        "",
        "LRN2;",
        "VM",
        "LAN2;",
        "S",
        "Ljava/lang/Class;",
        "viewModelClass",
        "stateClass",
        "LPr6;",
        "viewModelContext",
        "",
        "key",
        "",
        "forExistingViewModel",
        "LBN2;",
        "initialStateFactory",
        "b",
        "(Ljava/lang/Class;Ljava/lang/Class;LPr6;Ljava/lang/String;ZLBN2;)LRN2;",
        "initialArgs",
        "originalDeclarationViewModelClass",
        "originalDeclarationStateClass",
        "Landroid/os/Bundle;",
        "e",
        "(LRN2;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Landroid/os/Bundle;",
        "LIP5;",
        "f",
        "<init>",
        "()V",
        "mvrx_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final a:LYN2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LYN2;

    invoke-direct {v0}, LYN2;-><init>()V

    sput-object v0, LYN2;->a:LYN2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LaO2;LPr6;LIP5;Ljava/lang/Class;Ljava/lang/Class;)Landroid/os/Bundle;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LYN2;->d(LaO2;LPr6;LIP5;Ljava/lang/Class;Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LYN2;Ljava/lang/Class;Ljava/lang/Class;LPr6;Ljava/lang/String;ZLBN2;ILjava/lang/Object;)LRN2;
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p4

    const-string p8, "viewModelClass.name"

    invoke-static {p4, p8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p7, 0x10

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move v5, p5

    and-int/lit8 p4, p7, 0x20

    if-eqz p4, :cond_2

    new-instance p6, Lcs4;

    invoke-direct {p6}, Lcs4;-><init>()V

    :cond_2
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v6}, LYN2;->b(Ljava/lang/Class;Ljava/lang/Class;LPr6;Ljava/lang/String;ZLBN2;)LRN2;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LaO2;LPr6;LIP5;Ljava/lang/Class;Ljava/lang/Class;)Landroid/os/Bundle;
    .locals 2

    const-string v0, "$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$restoredContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$viewModelClass"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$stateClass"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYN2;->a:LYN2;

    invoke-virtual {p0}, LaO2;->e()LRN2;

    move-result-object p0

    invoke-virtual {p1}, LPr6;->e()Ljava/lang/Object;

    move-result-object p1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, LIP5;->c()Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p3, v1

    :cond_1
    :goto_0
    if-eqz p2, :cond_3

    invoke-virtual {p2}, LIP5;->a()Ljava/lang/Class;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    move-object p4, p2

    :cond_3
    :goto_1
    invoke-virtual {v0, p0, p1, p3, p4}, LYN2;->e(LRN2;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/Class;Ljava/lang/Class;LPr6;Ljava/lang/String;ZLBN2;)LRN2;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VM:",
            "LRN2<",
            "TS;>;S::",
            "LAN2;",
            ">(",
            "Ljava/lang/Class<",
            "+TVM;>;",
            "Ljava/lang/Class<",
            "+TS;>;",
            "LPr6;",
            "Ljava/lang/String;",
            "Z",
            "LBN2<",
            "TVM;TS;>;)TVM;"
        }
    .end annotation

    move-object/from16 v0, p3

    move-object/from16 v9, p4

    const-string v1, "viewModelClass"

    move-object/from16 v10, p1

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "stateClass"

    move-object/from16 v11, p2

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "viewModelContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "key"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "initialStateFactory"

    move-object/from16 v8, p6

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p3 .. p3}, LPr6;->g()Landroidx/savedstate/a;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/savedstate/a;->d()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1, v9}, Landroidx/savedstate/a;->b(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    move-object/from16 v12, p0

    if-eqz v1, :cond_0

    invoke-virtual {v12, v1, v0}, LYN2;->f(Landroid/os/Bundle;LPr6;)LIP5;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move-object v13, v1

    if-eqz v13, :cond_2

    invoke-virtual {v13}, LIP5;->d()LPr6;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    move-object v14, v1

    goto :goto_2

    :cond_2
    :goto_1
    move-object v14, v0

    :goto_2
    new-instance v15, Landroidx/lifecycle/u;

    invoke-virtual/range {p3 .. p3}, LPr6;->f()LXr6;

    move-result-object v7

    new-instance v6, LuN2;

    move-object v1, v6

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object v4, v14

    move-object/from16 v5, p4

    move-object v0, v6

    move-object v6, v13

    move-object v10, v7

    move/from16 v7, p5

    move-object/from16 v8, p6

    invoke-direct/range {v1 .. v8}, LuN2;-><init>(Ljava/lang/Class;Ljava/lang/Class;LPr6;Ljava/lang/String;LIP5;ZLBN2;)V

    invoke-direct {v15, v10, v0}, Landroidx/lifecycle/u;-><init>(LXr6;Landroidx/lifecycle/u$b;)V

    const-class v0, LaO2;

    invoke-virtual {v15, v9, v0}, Landroidx/lifecycle/u;->b(Ljava/lang/String;Ljava/lang/Class;)LOr6;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.airbnb.mvrx.MavericksViewModelWrapper<VM of com.airbnb.mvrx.MavericksViewModelProvider.get, S of com.airbnb.mvrx.MavericksViewModelProvider.get>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LaO2;

    :try_start_0
    invoke-virtual/range {p3 .. p3}, LPr6;->g()Landroidx/savedstate/a;

    move-result-object v1

    new-instance v8, LXN2;

    move-object v2, v8

    move-object v3, v0

    move-object v4, v14

    move-object v5, v13

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    invoke-direct/range {v2 .. v7}, LXN2;-><init>(LaO2;LPr6;LIP5;Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-virtual {v1, v9, v8}, Landroidx/savedstate/a;->i(Ljava/lang/String;Landroidx/savedstate/a$c;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, LaO2;->e()LRN2;

    move-result-object v0

    return-object v0

    :cond_3
    move-object/from16 v12, p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You can only access a view model after super.onCreate of your activity/fragment has been called."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(LRN2;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Landroid/os/Bundle;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VM:",
            "LRN2<",
            "TS;>;S::",
            "LAN2;",
            ">(TVM;",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "+TVM;>;",
            "Ljava/lang/Class<",
            "+TS;>;)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    new-instance v0, LYN2$a;

    invoke-direct {v0, p3, p4, p2}, LYN2$a;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V

    invoke-static {p1, v0}, LVr6;->a(LRN2;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    return-object p1
.end method

.method public final f(Landroid/os/Bundle;LPr6;)LIP5;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VM:",
            "LRN2<",
            "TS;>;S::",
            "LAN2;",
            ">(",
            "Landroid/os/Bundle;",
            "LPr6;",
            ")",
            "LIP5<",
            "TVM;TS;>;"
        }
    .end annotation

    const-string v0, "mvrx:saved_args"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    const-string v0, "mvrx:saved_instance_state"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "mvrx:saved_viewmodel_class"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Class;

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/Class;

    move-object v9, v1

    goto :goto_0

    :cond_0
    move-object v9, v4

    :goto_0
    const-string v1, "mvrx:saved_state_class"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    instance-of v1, p1, Ljava/lang/Class;

    if-eqz v1, :cond_1

    move-object v4, p1

    check-cast v4, Ljava/lang/Class;

    :cond_1
    move-object p1, v4

    if-eqz v0, :cond_6

    if-eqz v9, :cond_5

    if-eqz p1, :cond_4

    instance-of v1, p2, Lr6;

    if-eqz v1, :cond_2

    move-object v1, p2

    check-cast v1, Lr6;

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xd

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lr6;->i(Lr6;Landroidx/activity/ComponentActivity;Ljava/lang/Object;LXr6;Landroidx/savedstate/a;ILjava/lang/Object;)Lr6;

    move-result-object p2

    goto :goto_1

    :cond_2
    instance-of v1, p2, LFy1;

    if-eqz v1, :cond_3

    move-object v1, p2

    check-cast v1, LFy1;

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x1d

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, LFy1;->i(LFy1;Landroidx/activity/ComponentActivity;Ljava/lang/Object;Landroidx/fragment/app/Fragment;LXr6;Landroidx/savedstate/a;ILjava/lang/Object;)LFy1;

    move-result-object p2

    :goto_1
    new-instance v1, LIP5;

    new-instance v2, LYN2$b;

    invoke-direct {v2, v0}, LYN2$b;-><init>(Landroid/os/Bundle;)V

    invoke-direct {v1, p2, v9, p1, v2}, LIP5;-><init>(LPr6;Ljava/lang/Class;Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V

    return-object v1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "State class was not properly saved prior to restoring!"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "ViewModel class was not properly saved prior to restoring!"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "State was not saved prior to restoring!"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
