.class public final Landroidx/compose/ui/focus/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u000cB\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J#\u0010\u0008\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\tR&\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0080\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\r\u0012\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0015"
    }
    d2 = {
        "Landroidx/compose/ui/focus/h;",
        "",
        "",
        "e",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/focus/FocusTargetModifierNode;",
        "",
        "onFound",
        "c",
        "(Lkotlin/jvm/functions/Function1;)Z",
        "LLX2;",
        "LUv1;",
        "a",
        "LLX2;",
        "d",
        "()LLX2;",
        "getFocusRequesterNodes$ui_release$annotations",
        "()V",
        "focusRequesterNodes",
        "<init>",
        "b",
        "ui_release"
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
        "SMAP\nFocusRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,201:1\n1182#2:202\n1161#2,2:203\n1182#2:217\n1161#2,2:218\n1#3:205\n460#4,7:206\n48#4:227\n467#4,4:243\n460#4,11:247\n460#4,11:258\n87#5:213\n340#6:214\n206#6,2:215\n208#6,7:220\n215#6,15:228\n*S KotlinDebug\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n*L\n53#1:202\n53#1:203,2\n85#1:217\n85#1:218,2\n84#1:206,7\n85#1:227\n84#1:243,4\n113#1:247,11\n138#1:258,11\n85#1:213\n85#1:214\n85#1:215,2\n85#1:220,7\n85#1:228,15\n*E\n"
    }
.end annotation


# static fields
.field public static final b:Landroidx/compose/ui/focus/h$a;

.field public static final c:I

.field public static final d:Landroidx/compose/ui/focus/h;

.field public static final e:Landroidx/compose/ui/focus/h;


# instance fields
.field public final a:LLX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LLX2<",
            "LUv1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/focus/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/focus/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/ui/focus/h;->b:Landroidx/compose/ui/focus/h$a;

    new-instance v0, Landroidx/compose/ui/focus/h;

    invoke-direct {v0}, Landroidx/compose/ui/focus/h;-><init>()V

    sput-object v0, Landroidx/compose/ui/focus/h;->d:Landroidx/compose/ui/focus/h;

    new-instance v0, Landroidx/compose/ui/focus/h;

    invoke-direct {v0}, Landroidx/compose/ui/focus/h;-><init>()V

    sput-object v0, Landroidx/compose/ui/focus/h;->e:Landroidx/compose/ui/focus/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LLX2;

    const/16 v1, 0x10

    new-array v1, v1, [LUv1;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LLX2;-><init>([Ljava/lang/Object;I)V

    iput-object v0, p0, Landroidx/compose/ui/focus/h;->a:LLX2;

    return-void
.end method

.method public static final synthetic a()Landroidx/compose/ui/focus/h;
    .locals 1

    sget-object v0, Landroidx/compose/ui/focus/h;->e:Landroidx/compose/ui/focus/h;

    return-object v0
.end method

.method public static final synthetic b()Landroidx/compose/ui/focus/h;
    .locals 1

    sget-object v0, Landroidx/compose/ui/focus/h;->d:Landroidx/compose/ui/focus/h;

    return-object v0
.end method


# virtual methods
.method public final c(Lkotlin/jvm/functions/Function1;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/focus/FocusTargetModifierNode;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "onFound"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/compose/ui/focus/h;->d:Landroidx/compose/ui/focus/h;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"

    if-eqz v0, :cond_a

    sget-object v0, Landroidx/compose/ui/focus/h;->e:Landroidx/compose/ui/focus/h;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_9

    iget-object v0, p0, Landroidx/compose/ui/focus/h;->a:LLX2;

    invoke-virtual {v0}, LLX2;->x()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Landroidx/compose/ui/focus/h;->a:LLX2;

    invoke-virtual {v0}, LLX2;->u()I

    move-result v2

    const/4 v3, 0x0

    if-lez v2, :cond_7

    invoke-virtual {v0}, LLX2;->s()[Ljava/lang/Object;

    move-result-object v0

    move v4, v3

    move v5, v4

    :cond_0
    aget-object v6, v0, v4

    check-cast v6, LUv1;

    const/16 v7, 0x400

    invoke-static {v7}, LK83;->a(I)I

    move-result v7

    invoke-interface {v6}, LvZ0;->r()LgV2$c;

    move-result-object v8

    invoke-virtual {v8}, LgV2$c;->Q()Z

    move-result v8

    if-eqz v8, :cond_6

    new-instance v8, LLX2;

    const/16 v9, 0x10

    new-array v9, v9, [LgV2$c;

    invoke-direct {v8, v9, v3}, LLX2;-><init>([Ljava/lang/Object;I)V

    invoke-interface {v6}, LvZ0;->r()LgV2$c;

    move-result-object v9

    invoke-virtual {v9}, LgV2$c;->I()LgV2$c;

    move-result-object v9

    if-nez v9, :cond_1

    invoke-interface {v6}, LvZ0;->r()LgV2$c;

    move-result-object v6

    invoke-static {v8, v6}, LwZ0;->a(LLX2;LgV2$c;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v8, v9}, LLX2;->b(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    invoke-virtual {v8}, LLX2;->x()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v8}, LLX2;->u()I

    move-result v6

    sub-int/2addr v6, v1

    invoke-virtual {v8, v6}, LLX2;->C(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LgV2$c;

    invoke-virtual {v6}, LgV2$c;->G()I

    move-result v9

    and-int/2addr v9, v7

    if-nez v9, :cond_3

    invoke-static {v8, v6}, LwZ0;->a(LLX2;LgV2$c;)V

    goto :goto_0

    :cond_3
    :goto_1
    if-eqz v6, :cond_2

    invoke-virtual {v6}, LgV2$c;->M()I

    move-result v9

    and-int/2addr v9, v7

    if-eqz v9, :cond_4

    instance-of v9, v6, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    if-eqz v9, :cond_2

    check-cast v6, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-interface {p1, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_2

    move v5, v1

    goto :goto_2

    :cond_4
    invoke-virtual {v6}, LgV2$c;->I()LgV2$c;

    move-result-object v6

    goto :goto_1

    :cond_5
    :goto_2
    add-int/lit8 v4, v4, 0x1

    if-lt v4, v2, :cond_0

    move v3, v5

    goto :goto_3

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_3
    return v3

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d()LLX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LLX2<",
            "LUv1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/focus/h;->a:LLX2;

    return-object v0
.end method

.method public final e()V
    .locals 1

    sget-object v0, Landroidx/compose/ui/focus/h$b;->g:Landroidx/compose/ui/focus/h$b;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/h;->c(Lkotlin/jvm/functions/Function1;)Z

    return-void
.end method
