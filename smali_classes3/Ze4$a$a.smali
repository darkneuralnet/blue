.class public final LZe4$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZe4$a;-><init>(LZe4;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroid/widget/CompoundButton;",
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Landroid/widget/CompoundButton;",
        "checkBox",
        "",
        "isChecked",
        "",
        "a",
        "(Landroid/widget/CompoundButton;Z)V"
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
        "SMAP\nQuizAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuizAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/QuizAdapter$CheckboxViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,156:1\n18#2:157\n9#3,4:158\n*S KotlinDebug\n*F\n+ 1 QuizAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/QuizAdapter$CheckboxViewHolder$1\n*L\n109#1:157\n109#1:158,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LZe4;

.field public final synthetic h:LZe4$a;


# direct methods
.method public constructor <init>(LZe4;LZe4$a;)V
    .locals 0

    iput-object p1, p0, LZe4$a$a;->g:LZe4;

    iput-object p2, p0, LZe4$a$a;->h:LZe4$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/widget/CompoundButton;Z)V
    .locals 6

    iget-object p1, p0, LZe4$a$a;->g:LZe4;

    invoke-static {p1}, LZe4;->access$getAdapterData(LZe4;)LE6;

    move-result-object p1

    iget-object v0, p0, LZe4$a$a;->h:LZe4$a;

    invoke-virtual {v0}, Lh0;->getSafePosition()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v0, p1

    check-cast v0, Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;

    if-eqz v0, :cond_1

    iget-object p1, p0, LZe4$a$a;->g:LZe4;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "check change clicked for answer: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", isChecked = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, LZe4;->H()Lma4;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x0

    move v3, p2

    invoke-static/range {v0 .. v5}, Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;->copy$default(Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;Ljava/lang/String;ZZILjava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/widget/CompoundButton;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2}, LZe4$a$a;->a(Landroid/widget/CompoundButton;Z)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
