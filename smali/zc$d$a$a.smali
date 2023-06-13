.class public final Lzc$d$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzc$d$a;->a(Le80;)LH61;
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
        "SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,82:1\n261#2,11:83\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1$1\n*L\n73#1:83,11\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:F

.field public final synthetic h:LMW1;

.field public final synthetic i:Lsm0;


# direct methods
.method public constructor <init>(FLMW1;Lsm0;)V
    .locals 0

    iput p1, p0, Lzc$d$a$a;->g:F

    iput-object p2, p0, Lzc$d$a$a;->h:LMW1;

    iput-object p3, p0, Lzc$d$a$a;->i:Lsm0;

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

    iget v0, p0, Lzc$d$a$a;->g:F

    iget-object v2, p0, Lzc$d$a$a;->h:LMW1;

    iget-object v7, p0, Lzc$d$a$a;->i:Lsm0;

    invoke-interface {p1}, LI61;->d0()LC61;

    move-result-object v11

    invoke-interface {v11}, LC61;->h()J

    move-result-wide v12

    invoke-interface {v11}, LC61;->a()Lme0;

    move-result-object v1

    invoke-interface {v1}, Lme0;->v()V

    invoke-interface {v11}, LC61;->c()LL61;

    move-result-object v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v0, v5, v3, v4}, LL61;->f(LL61;FFILjava/lang/Object;)V

    sget-object v0, LCe3;->b:LCe3$a;

    invoke-virtual {v0}, LCe3$a;->c()J

    move-result-wide v3

    const/high16 v0, 0x42340000    # 45.0f

    invoke-interface {v1, v0, v3, v4}, LL61;->e(FJ)V

    const-wide/16 v3, 0x0

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

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LiA0;

    invoke-virtual {p0, p1}, Lzc$d$a$a;->a(LiA0;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
