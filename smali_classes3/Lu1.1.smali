.class public final LLu1;
.super LxE;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\tJ\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000cJ\u001a\u0010\u0011\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000eR\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001c"
    }
    d2 = {
        "LLu1;",
        "LxE;",
        "LDi0;",
        "node",
        "",
        "isRoot",
        "",
        "Rl",
        "Ql",
        "",
        "",
        "Pl",
        "Lio/reactivex/Observable;",
        "Tl",
        "Lkotlin/Function1;",
        "Landroid/content/Context;",
        "titleProvider",
        "Sl",
        "Lco/bird/android/library/flow/FlowActivity;",
        "b",
        "Lco/bird/android/library/flow/FlowActivity;",
        "flowActivity",
        "Landroidx/fragment/app/FragmentManager;",
        "c",
        "Landroidx/fragment/app/FragmentManager;",
        "fragmentManager",
        "<init>",
        "(Lco/bird/android/library/flow/FlowActivity;Landroidx/fragment/app/FragmentManager;)V",
        "flow_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFlowCoordinatingUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowCoordinatingUi.kt\nco/bird/android/library/flow/FlowCoordinatingUi\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/library/flow/FlowActivity;

.field public final c:Landroidx/fragment/app/FragmentManager;


# direct methods
.method public constructor <init>(Lco/bird/android/library/flow/FlowActivity;Landroidx/fragment/app/FragmentManager;)V
    .locals 1

    const-string v0, "flowActivity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p1, p0, LLu1;->b:Lco/bird/android/library/flow/FlowActivity;

    iput-object p2, p0, LLu1;->c:Landroidx/fragment/app/FragmentManager;

    return-void
.end method

.method public static final synthetic access$getFragmentManager$p(LLu1;)Landroidx/fragment/app/FragmentManager;
    .locals 0

    iget-object p0, p0, LLu1;->c:Landroidx/fragment/app/FragmentManager;

    return-object p0
.end method

.method public static synthetic pushNode$default(LLu1;LDi0;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LLu1;->Rl(LDi0;Z)V

    return-void
.end method


# virtual methods
.method public final Pl()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LLu1;->c:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->t0()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    iget-object v3, p0, LLu1;->c:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v3, v2}, Landroidx/fragment/app/FragmentManager;->s0(I)Landroidx/fragment/app/FragmentManager$j;

    move-result-object v3

    invoke-interface {v3}, Landroidx/fragment/app/FragmentManager$j;->getName()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    const-string v3, ""

    :cond_0
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final Ql(LDi0;)Z
    .locals 2

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LLu1;->c:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->U0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LLu1;->c:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p1}, LDi0;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/FragmentManager;->k1(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final Rl(LDi0;Z)V
    .locals 5

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LLu1;->c:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->U0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, LUu1;

    invoke-direct {v0}, LUu1;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p1}, LDi0;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "node_id"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    iget-object v1, p0, LLu1;->c:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->q()Landroidx/fragment/app/m;

    move-result-object v1

    invoke-virtual {p1}, LDi0;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/fragment/app/m;->g(Ljava/lang/String;)Landroidx/fragment/app/m;

    move-result-object v1

    const-string v2, "fragmentManager\n      .b\u2026 .addToBackStack(node.id)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_1

    invoke-virtual {p1}, LDi0;->a()Lkotlin/jvm/functions/Function0;

    move-result-object p2

    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    sget p2, Ldf4;->slide_in_left:I

    sget v2, Ldf4;->slide_out_left:I

    sget v3, Ldf4;->slide_in_right:I

    sget v4, Ldf4;->slide_out_right:I

    invoke-virtual {v1, p2, v2, v3, v4}, Landroidx/fragment/app/m;->x(IIII)Landroidx/fragment/app/m;

    :cond_1
    sget p2, Lti4;->rootContainer:I

    invoke-virtual {p1}, LDi0;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p2, v0, p1}, Landroidx/fragment/app/m;->u(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/m;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/m;->i()I

    return-void
.end method

.method public final Sl(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "titleProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LLu1;->b:Lco/bird/android/library/flow/FlowActivity;

    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, LLu1;->b:Lco/bird/android/library/flow/FlowActivity;

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/ActionBar;->E(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public final Tl()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, LLu1$a;

    invoke-direct {v0, p0}, LLu1$a;-><init>(LLu1;)V

    invoke-static {v0}, Lnh5;->i(Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
