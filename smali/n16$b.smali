.class public final Ln16$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln16;->j(Landroid/view/KeyEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln16$b$i;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ls16;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Ls16;",
        "",
        "a",
        "(Ls16;)V"
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
        "SMAP\nTextFieldKeyInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInput$process$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,260:1\n1#2:261\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lek2;

.field public final synthetic h:Ln16;

.field public final synthetic i:Lkotlin/jvm/internal/Ref$BooleanRef;


# direct methods
.method public constructor <init>(Lek2;Ln16;Lkotlin/jvm/internal/Ref$BooleanRef;)V
    .locals 0

    iput-object p1, p0, Ln16$b;->g:Lek2;

    iput-object p2, p0, Ln16$b;->h:Ln16;

    iput-object p3, p0, Ln16$b;->i:Lkotlin/jvm/internal/Ref$BooleanRef;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ls16;)V
    .locals 3

    const-string v0, "$this$commandExecutionContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln16$b;->g:Lek2;

    sget-object v1, Ln16$b$i;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    invoke-static {}, Lkk2;->b()V

    goto/16 :goto_0

    :pswitch_1
    iget-object p1, p0, Ln16$b;->h:Ln16;

    invoke-virtual {p1}, Ln16;->i()LId6;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LId6;->c()LF16;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Ln16$b;->h:Ln16;

    invoke-static {v0}, Ln16;->c(Ln16;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :pswitch_2
    iget-object v0, p0, Ln16$b;->h:Ln16;

    invoke-virtual {v0}, Ln16;->i()LId6;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ls16;->b0()LF16;

    move-result-object p1

    invoke-virtual {v0, p1}, LId6;->b(LF16;)V

    :cond_0
    iget-object p1, p0, Ln16$b;->h:Ln16;

    invoke-virtual {p1}, Ln16;->i()LId6;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LId6;->g()LF16;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Ln16$b;->h:Ln16;

    invoke-static {v0}, Ln16;->c(Ln16;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :pswitch_3
    invoke-virtual {p1}, LuE;->d()LuE;

    goto/16 :goto_0

    :pswitch_4
    invoke-virtual {p1}, LuE;->M()LuE;

    move-result-object p1

    check-cast p1, Ls16;

    invoke-virtual {p1}, LuE;->U()LuE;

    goto/16 :goto_0

    :pswitch_5
    invoke-virtual {p1}, LuE;->N()LuE;

    move-result-object p1

    check-cast p1, Ls16;

    invoke-virtual {p1}, LuE;->U()LuE;

    goto/16 :goto_0

    :pswitch_6
    invoke-virtual {p1}, Ls16;->d0()Ls16;

    move-result-object p1

    invoke-virtual {p1}, LuE;->U()LuE;

    goto/16 :goto_0

    :pswitch_7
    invoke-virtual {p1}, Ls16;->e0()Ls16;

    move-result-object p1

    invoke-virtual {p1}, LuE;->U()LuE;

    goto/16 :goto_0

    :pswitch_8
    invoke-virtual {p1}, LuE;->B()LuE;

    move-result-object p1

    check-cast p1, Ls16;

    invoke-virtual {p1}, LuE;->U()LuE;

    goto/16 :goto_0

    :pswitch_9
    invoke-virtual {p1}, LuE;->S()LuE;

    move-result-object p1

    check-cast p1, Ls16;

    invoke-virtual {p1}, LuE;->U()LuE;

    goto/16 :goto_0

    :pswitch_a
    invoke-virtual {p1}, LuE;->Q()LuE;

    move-result-object p1

    check-cast p1, Ls16;

    invoke-virtual {p1}, LuE;->U()LuE;

    goto/16 :goto_0

    :pswitch_b
    invoke-virtual {p1}, LuE;->P()LuE;

    move-result-object p1

    check-cast p1, Ls16;

    invoke-virtual {p1}, LuE;->U()LuE;

    goto/16 :goto_0

    :pswitch_c
    invoke-virtual {p1}, LuE;->O()LuE;

    move-result-object p1

    check-cast p1, Ls16;

    invoke-virtual {p1}, LuE;->U()LuE;

    goto/16 :goto_0

    :pswitch_d
    invoke-virtual {p1}, LuE;->R()LuE;

    move-result-object p1

    check-cast p1, Ls16;

    invoke-virtual {p1}, LuE;->U()LuE;

    goto/16 :goto_0

    :pswitch_e
    invoke-virtual {p1}, LuE;->F()LuE;

    move-result-object p1

    check-cast p1, Ls16;

    invoke-virtual {p1}, LuE;->U()LuE;

    goto/16 :goto_0

    :pswitch_f
    invoke-virtual {p1}, LuE;->I()LuE;

    move-result-object p1

    check-cast p1, Ls16;

    invoke-virtual {p1}, LuE;->U()LuE;

    goto/16 :goto_0

    :pswitch_10
    invoke-virtual {p1}, LuE;->L()LuE;

    move-result-object p1

    check-cast p1, Ls16;

    invoke-virtual {p1}, LuE;->U()LuE;

    goto/16 :goto_0

    :pswitch_11
    invoke-virtual {p1}, LuE;->D()LuE;

    move-result-object p1

    check-cast p1, Ls16;

    invoke-virtual {p1}, LuE;->U()LuE;

    goto/16 :goto_0

    :pswitch_12
    invoke-virtual {p1}, LuE;->K()LuE;

    move-result-object p1

    check-cast p1, Ls16;

    invoke-virtual {p1}, LuE;->U()LuE;

    goto/16 :goto_0

    :pswitch_13
    invoke-virtual {p1}, LuE;->C()LuE;

    move-result-object p1

    check-cast p1, Ls16;

    invoke-virtual {p1}, LuE;->U()LuE;

    goto/16 :goto_0

    :pswitch_14
    invoke-virtual {p1}, LuE;->T()LuE;

    goto/16 :goto_0

    :pswitch_15
    iget-object p1, p0, Ln16$b;->h:Ln16;

    invoke-virtual {p1}, Ln16;->h()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Ln16$b;->h:Ln16;

    new-instance v0, Lop0;

    const-string v2, "\t"

    invoke-direct {v0, v2, v1}, Lop0;-><init>(Ljava/lang/String;I)V

    invoke-static {p1, v0}, Ln16;->a(Ln16;LN91;)V

    goto/16 :goto_0

    :cond_1
    iget-object p1, p0, Ln16$b;->i:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-boolean v2, p1, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    goto/16 :goto_0

    :pswitch_16
    iget-object p1, p0, Ln16$b;->h:Ln16;

    invoke-virtual {p1}, Ln16;->h()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Ln16$b;->h:Ln16;

    new-instance v0, Lop0;

    const-string v2, "\n"

    invoke-direct {v0, v2, v1}, Lop0;-><init>(Ljava/lang/String;I)V

    invoke-static {p1, v0}, Ln16;->a(Ln16;LN91;)V

    goto/16 :goto_0

    :cond_2
    iget-object p1, p0, Ln16$b;->i:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-boolean v2, p1, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    goto/16 :goto_0

    :pswitch_17
    sget-object v0, Ln16$b$h;->g:Ln16$b$h;

    invoke-virtual {p1, v0}, Ls16;->a0(Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Ln16$b;->h:Ln16;

    invoke-static {v0, p1}, Ln16;->b(Ln16;Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_18
    sget-object v0, Ln16$b$g;->g:Ln16$b$g;

    invoke-virtual {p1, v0}, Ls16;->a0(Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Ln16$b;->h:Ln16;

    invoke-static {v0, p1}, Ln16;->b(Ln16;Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_19
    sget-object v0, Ln16$b$f;->g:Ln16$b$f;

    invoke-virtual {p1, v0}, Ls16;->a0(Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Ln16$b;->h:Ln16;

    invoke-static {v0, p1}, Ln16;->b(Ln16;Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1a
    sget-object v0, Ln16$b$e;->g:Ln16$b$e;

    invoke-virtual {p1, v0}, Ls16;->a0(Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Ln16$b;->h:Ln16;

    invoke-static {v0, p1}, Ln16;->b(Ln16;Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1b
    sget-object v0, Ln16$b$d;->g:Ln16$b$d;

    invoke-virtual {p1, v0}, Ls16;->a0(Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Ln16$b;->h:Ln16;

    invoke-static {v0, p1}, Ln16;->b(Ln16;Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1c
    sget-object v0, Ln16$b$c;->g:Ln16$b$c;

    invoke-virtual {p1, v0}, Ls16;->a0(Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Ln16$b;->h:Ln16;

    invoke-static {v0, p1}, Ln16;->b(Ln16;Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1d
    invoke-virtual {p1}, LuE;->M()LuE;

    goto/16 :goto_0

    :pswitch_1e
    invoke-virtual {p1}, LuE;->N()LuE;

    goto :goto_0

    :pswitch_1f
    invoke-virtual {p1}, LuE;->Q()LuE;

    goto :goto_0

    :pswitch_20
    invoke-virtual {p1}, LuE;->P()LuE;

    goto :goto_0

    :pswitch_21
    invoke-virtual {p1}, LuE;->O()LuE;

    goto :goto_0

    :pswitch_22
    invoke-virtual {p1}, LuE;->R()LuE;

    goto :goto_0

    :pswitch_23
    invoke-virtual {p1}, Ls16;->d0()Ls16;

    goto :goto_0

    :pswitch_24
    invoke-virtual {p1}, Ls16;->e0()Ls16;

    goto :goto_0

    :pswitch_25
    invoke-virtual {p1}, LuE;->B()LuE;

    goto :goto_0

    :pswitch_26
    invoke-virtual {p1}, LuE;->S()LuE;

    goto :goto_0

    :pswitch_27
    invoke-virtual {p1}, LuE;->F()LuE;

    goto :goto_0

    :pswitch_28
    invoke-virtual {p1}, LuE;->I()LuE;

    goto :goto_0

    :pswitch_29
    invoke-virtual {p1}, LuE;->L()LuE;

    goto :goto_0

    :pswitch_2a
    invoke-virtual {p1}, LuE;->D()LuE;

    goto :goto_0

    :pswitch_2b
    sget-object v0, Ln16$b$b;->g:Ln16$b$b;

    invoke-virtual {p1, v0}, LuE;->c(Lkotlin/jvm/functions/Function1;)LuE;

    goto :goto_0

    :pswitch_2c
    sget-object v0, Ln16$b$a;->g:Ln16$b$a;

    invoke-virtual {p1, v0}, LuE;->b(Lkotlin/jvm/functions/Function1;)LuE;

    goto :goto_0

    :pswitch_2d
    iget-object p1, p0, Ln16$b;->h:Ln16;

    invoke-virtual {p1}, Ln16;->g()Lx16;

    move-result-object p1

    invoke-virtual {p1}, Lx16;->o()V

    goto :goto_0

    :pswitch_2e
    iget-object p1, p0, Ln16$b;->h:Ln16;

    invoke-virtual {p1}, Ln16;->g()Lx16;

    move-result-object p1

    invoke-virtual {p1}, Lx16;->L()V

    goto :goto_0

    :pswitch_2f
    iget-object p1, p0, Ln16$b;->h:Ln16;

    invoke-virtual {p1}, Ln16;->g()Lx16;

    move-result-object p1

    invoke-virtual {p1, v2}, Lx16;->k(Z)V

    :cond_3
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ls16;

    invoke-virtual {p0, p1}, Ln16$b;->a(Ls16;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
