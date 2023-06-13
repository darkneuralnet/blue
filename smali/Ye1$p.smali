.class public final LYe1$p;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYe1;->D(LgV2;LF96;LsP5;LsP5;Ljava/lang/String;)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LgV2;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "LgV2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LgV2;",
        "a",
        "(LgV2;LEt0;I)LgV2;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$slideInOut$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1180:1\n36#2:1181\n25#2:1188\n36#2:1195\n1057#3,6:1182\n1057#3,6:1189\n1057#3,6:1196\n76#4:1202\n102#4,2:1203\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$slideInOut$1\n*L\n955#1:1181\n967#1:1188\n969#1:1195\n955#1:1182,6\n967#1:1189,6\n969#1:1196,6\n955#1:1202\n955#1:1203,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LF96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LF96<",
            "LXe1;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "LdE5;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "LdE5;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public constructor <init>(LF96;LsP5;LsP5;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF96<",
            "LXe1;",
            ">;",
            "LsP5<",
            "LdE5;",
            ">;",
            "LsP5<",
            "LdE5;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LYe1$p;->g:LF96;

    iput-object p2, p0, LYe1$p;->h:LsP5;

    iput-object p3, p0, LYe1$p;->i:LsP5;

    iput-object p4, p0, LYe1$p;->j:Ljava/lang/String;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static final invoke$lambda$1(LEX2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final invoke$lambda$2(LEX2;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(LgV2;LEt0;I)LgV2;
    .locals 8

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x970add0

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.animation.slideInOut.<anonymous> (EnterExitTransition.kt:951)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    iget-object p3, p0, LYe1$p;->g:LF96;

    const v0, 0x44faf204

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-interface {p2, p3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    if-nez p3, :cond_1

    sget-object p3, LEt0;->a:LEt0$a;

    invoke-virtual {p3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v1, p3, :cond_2

    :cond_1
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p3, v2, v1, v2}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v1

    invoke-interface {p2, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v1, LEX2;

    iget-object p3, p0, LYe1$p;->g:LF96;

    invoke-virtual {p3}, LF96;->g()Ljava/lang/Object;

    move-result-object p3

    iget-object v2, p0, LYe1$p;->g:LF96;

    invoke-virtual {v2}, LF96;->m()Ljava/lang/Object;

    move-result-object v2

    if-ne p3, v2, :cond_3

    iget-object p3, p0, LYe1$p;->g:LF96;

    invoke-virtual {p3}, LF96;->q()Z

    move-result p3

    if-nez p3, :cond_3

    const/4 p3, 0x0

    invoke-static {v1, p3}, LYe1$p;->invoke$lambda$2(LEX2;Z)V

    goto :goto_0

    :cond_3
    iget-object p3, p0, LYe1$p;->h:LsP5;

    invoke-interface {p3}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p3

    if-nez p3, :cond_4

    iget-object p3, p0, LYe1$p;->i:LsP5;

    invoke-interface {p3}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_5

    :cond_4
    const/4 p3, 0x1

    invoke-static {v1, p3}, LYe1$p;->invoke$lambda$2(LEX2;Z)V

    :cond_5
    :goto_0
    invoke-static {v1}, LYe1$p;->invoke$lambda$1(LEX2;)Z

    move-result p3

    if-eqz p3, :cond_9

    iget-object v1, p0, LYe1$p;->g:LF96;

    sget-object p3, LA52;->b:LA52$a;

    invoke-static {p3}, LXj6;->d(LA52$a;)Lwb6;

    move-result-object v2

    iget-object p3, p0, LYe1$p;->j:Ljava/lang/String;

    const v3, -0x1d58f75c

    invoke-interface {p2, v3}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    sget-object v7, LEt0;->a:LEt0$a;

    invoke-virtual {v7}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_6

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " slide"

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_6
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v3, Ljava/lang/String;

    const/16 v5, 0x1c0

    const/4 v6, 0x0

    move-object v4, p2

    invoke-static/range {v1 .. v6}, LJ96;->b(LF96;Lwb6;Ljava/lang/String;LEt0;II)LF96$a;

    move-result-object p3

    iget-object v1, p0, LYe1$p;->g:LF96;

    iget-object v2, p0, LYe1$p;->h:LsP5;

    iget-object v3, p0, LYe1$p;->i:LsP5;

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-interface {p2, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_7

    invoke-virtual {v7}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_8

    :cond_7
    new-instance v1, LfE5;

    invoke-direct {v1, p3, v2, v3}, LfE5;-><init>(LF96$a;LsP5;LsP5;)V

    invoke-interface {p2, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_8
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v1, LfE5;

    invoke-interface {p1, v1}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p1

    :cond_9
    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-static {}, LQt0;->Y()V

    :cond_a
    invoke-interface {p2}, LEt0;->Q()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LgV2;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LYe1$p;->a(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method
