.class public final LuA6$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LuA6;->a(LBA6;LgV2;ZLvA6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lx2;Lw2;Lkotlin/jvm/functions/Function1;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lh10;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:LBA6;

.field public final synthetic i:LvA6;

.field public final synthetic j:I

.field public final synthetic k:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/content/Context;",
            "Landroid/webkit/WebView;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic l:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/webkit/WebView;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic m:Lw2;

.field public final synthetic n:Lx2;

.field public final synthetic o:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Landroid/webkit/WebView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLBA6;LvA6;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lw2;Lx2;LEX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "LBA6;",
            "LvA6;",
            "I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/content/Context;",
            "+",
            "Landroid/webkit/WebView;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/webkit/WebView;",
            "Lkotlin/Unit;",
            ">;",
            "Lw2;",
            "Lx2;",
            "LEX2<",
            "Landroid/webkit/WebView;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, LuA6$f;->g:Z

    iput-object p2, p0, LuA6$f;->h:LBA6;

    iput-object p3, p0, LuA6$f;->i:LvA6;

    iput p4, p0, LuA6$f;->j:I

    iput-object p5, p0, LuA6$f;->k:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, LuA6$f;->l:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, LuA6$f;->m:Lw2;

    iput-object p8, p0, LuA6$f;->n:Lx2;

    iput-object p9, p0, LuA6$f;->o:LEX2;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh10;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LuA6$f;->invoke(Lh10;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lh10;LEt0;I)V
    .locals 10

    const-string v0, "$this$BoxWithConstraints"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0xe

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v0, v0, 0x5b

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-interface {p2}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p2}, LEt0;->k()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "com.google.accompanist.web.WebView.<anonymous> (WebView.kt:108)"

    const v2, -0x5fba294d

    invoke-static {v2, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    new-instance p3, LuA6$f$a;

    iget-object v4, p0, LuA6$f;->k:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, LuA6$f;->l:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, LuA6$f;->m:Lw2;

    iget-object v8, p0, LuA6$f;->n:Lx2;

    iget-object v9, p0, LuA6$f;->o:LEX2;

    move-object v3, p3

    move-object v6, p1

    invoke-direct/range {v3 .. v9}, LuA6$f$a;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lh10;Lw2;Lx2;LEX2;)V

    const/4 v4, 0x0

    iget-boolean p1, p0, LuA6$f;->g:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object v0, p0, LuA6$f;->h:LBA6;

    iget-object v1, p0, LuA6$f;->i:LvA6;

    iget-boolean v2, p0, LuA6$f;->g:Z

    const v3, 0x607fb4c4

    invoke-interface {p2, v3}, LEt0;->F(I)V

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p1

    invoke-interface {p2, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr p1, v3

    invoke-interface {p2, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr p1, v3

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez p1, :cond_5

    sget-object p1, LEt0;->a:LEt0$a;

    invoke-virtual {p1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne v3, p1, :cond_6

    :cond_5
    new-instance v3, LuA6$f$b;

    invoke-direct {v3, v2, v0, v1}, LuA6$f$b;-><init>(ZLBA6;LvA6;)V

    invoke-interface {p2, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_6
    invoke-interface {p2}, LEt0;->Q()V

    move-object v5, v3

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/4 v8, 0x2

    move-object v3, p3

    move-object v6, p2

    invoke-static/range {v3 .. v8}, Lje;->a(Lkotlin/jvm/functions/Function1;LgV2;Lkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_3
    return-void
.end method
