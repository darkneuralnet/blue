.class public final LLd$e$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLd$e$a;->a(Le80;)LH61;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LiA0;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,331:1\n173#2,6:332\n261#2,11:338\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1$1\n*L\n125#1:332,6\n125#1:338,11\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:LUL4;

.field public final synthetic i:Z

.field public final synthetic j:LMW1;

.field public final synthetic k:Lsm0;


# direct methods
.method public constructor <init>(ZLUL4;ZLMW1;Lsm0;)V
    .locals 0

    iput-boolean p1, p0, LLd$e$a$a;->g:Z

    iput-object p2, p0, LLd$e$a$a;->h:LUL4;

    iput-boolean p3, p0, LLd$e$a$a;->i:Z

    iput-object p4, p0, LLd$e$a$a;->j:LMW1;

    iput-object p5, p0, LLd$e$a$a;->k:Lsm0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LiA0;)V
    .locals 14

    const-string v0, "$this$onDrawWithContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LiA0;->n0()V

    iget-boolean v0, p0, LLd$e$a$a;->g:Z

    iget-object v1, p0, LLd$e$a$a;->h:LUL4;

    iget-boolean v2, p0, LLd$e$a$a;->i:Z

    invoke-static {v0, v1, v2}, LLd;->d(ZLUL4;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v2, p0, LLd$e$a$a;->j:LMW1;

    iget-object v7, p0, LLd$e$a$a;->k:Lsm0;

    invoke-interface {p1}, LI61;->l0()J

    move-result-wide v0

    invoke-interface {p1}, LI61;->d0()LC61;

    move-result-object v11

    invoke-interface {v11}, LC61;->h()J

    move-result-wide v12

    invoke-interface {v11}, LC61;->a()Lme0;

    move-result-object v3

    invoke-interface {v3}, Lme0;->v()V

    invoke-interface {v11}, LC61;->c()LL61;

    move-result-object v3

    const/high16 v4, -0x40800000    # -1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-interface {v3, v4, v5, v0, v1}, LL61;->d(FFJ)V

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x2e

    const/4 v10, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v10}, LI61;->a0(LI61;LMW1;JFLJ61;Lsm0;IILjava/lang/Object;)V

    invoke-interface {v11}, LC61;->a()Lme0;

    move-result-object p1

    invoke-interface {p1}, Lme0;->p()V

    invoke-interface {v11, v12, v13}, LC61;->b(J)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, LLd$e$a$a;->j:LMW1;

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v6, p0, LLd$e$a$a;->k:Lsm0;

    const/4 v7, 0x0

    const/16 v8, 0x2e

    const/4 v9, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v9}, LI61;->a0(LI61;LMW1;JFLJ61;Lsm0;IILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LiA0;

    invoke-virtual {p0, p1}, LLd$e$a$a;->a(LiA0;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
