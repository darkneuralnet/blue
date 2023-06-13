.class public final Lo16$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo16;->a(LgV2;LC16;Lx16;LF16;Lkotlin/jvm/functions/Function1;ZZLHe3;LId6;)LgV2;
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
        "SMAP\nTextFieldKeyInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInputKt$textFieldKeyInput$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,260:1\n25#2:261\n25#2:268\n1114#3,6:262\n1114#3,6:269\n*S KotlinDebug\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInputKt$textFieldKeyInput$2\n*L\n244#1:261\n245#1:268\n244#1:262,6\n245#1:269,6\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LC16;

.field public final synthetic h:Lx16;

.field public final synthetic i:LF16;

.field public final synthetic j:Z

.field public final synthetic k:Z

.field public final synthetic l:LHe3;

.field public final synthetic m:LId6;

.field public final synthetic n:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "LF16;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LC16;Lx16;LF16;ZZLHe3;LId6;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LC16;",
            "Lx16;",
            "LF16;",
            "ZZ",
            "LHe3;",
            "LId6;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LF16;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo16$a;->g:LC16;

    iput-object p2, p0, Lo16$a;->h:Lx16;

    iput-object p3, p0, Lo16$a;->i:LF16;

    iput-boolean p4, p0, Lo16$a;->j:Z

    iput-boolean p5, p0, Lo16$a;->k:Z

    iput-object p6, p0, Lo16$a;->l:LHe3;

    iput-object p7, p0, Lo16$a;->m:LId6;

    iput-object p8, p0, Lo16$a;->n:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LgV2;LEt0;I)LgV2;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "$this$composed"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x37c5de2

    invoke-interface {v1, v2}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:242)"

    move/from16 v5, p3

    invoke-static {v2, v5, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const v2, -0x1d58f75c

    invoke-interface {v1, v2}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LEt0;->a:LEt0$a;

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_1

    new-instance v3, Lr26;

    invoke-direct {v3}, Lr26;-><init>()V

    invoke-interface {v1, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    move-object v11, v3

    check-cast v11, Lr26;

    invoke-interface {v1, v2}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_2

    new-instance v2, LuT0;

    invoke-direct {v2}, LuT0;-><init>()V

    invoke-interface {v1, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    move-object v14, v2

    check-cast v14, LuT0;

    new-instance v2, Ln16;

    iget-object v6, v0, Lo16$a;->g:LC16;

    iget-object v7, v0, Lo16$a;->h:Lx16;

    iget-object v8, v0, Lo16$a;->i:LF16;

    iget-boolean v9, v0, Lo16$a;->j:Z

    iget-boolean v10, v0, Lo16$a;->k:Z

    iget-object v12, v0, Lo16$a;->l:LHe3;

    iget-object v13, v0, Lo16$a;->m:LId6;

    const/4 v15, 0x0

    iget-object v3, v0, Lo16$a;->n:Lkotlin/jvm/functions/Function1;

    const/16 v17, 0x200

    const/16 v18, 0x0

    move-object v5, v2

    move-object/from16 v16, v3

    invoke-direct/range {v5 .. v18}, Ln16;-><init>(LC16;Lx16;LF16;ZZLr26;LHe3;LId6;LuT0;Lvk2;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v3, LgV2;->b0:LgV2$a;

    new-instance v4, Lo16$a$a;

    invoke-direct {v4, v2}, Lo16$a$a;-><init>(Ljava/lang/Object;)V

    invoke-static {v3, v4}, Lqk2;->a(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v2

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    return-object v2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LgV2;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lo16$a;->a(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method
