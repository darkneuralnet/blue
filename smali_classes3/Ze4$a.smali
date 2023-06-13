.class public final LZe4$a;
.super Lh0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZe4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LZe4$a;",
        "Lh0;",
        "",
        "position",
        "",
        "bind",
        "Lpb2;",
        "f",
        "Lpb2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LZe4;Landroid/view/View;)V",
        "co.bird.android.feature.configurabletutorial"
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
        "SMAP\nQuizAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuizAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/QuizAdapter$CheckboxViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,156:1\n18#2:157\n9#3,4:158\n*S KotlinDebug\n*F\n+ 1 QuizAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/QuizAdapter$CheckboxViewHolder\n*L\n119#1:157\n119#1:158,4\n*E\n"
    }
.end annotation


# instance fields
.field public final f:Lpb2;

.field public final synthetic g:LZe4;


# direct methods
.method public constructor <init>(LZe4;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LZe4$a;->g:LZe4;

    invoke-direct {p0, p2}, Lh0;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lpb2;->a(Landroid/view/View;)Lpb2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LZe4$a;->f:Lpb2;

    iget-object p2, p2, Lpb2;->b:Landroid/widget/CheckBox;

    const-string v0, "binding.answer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LZe4$a$a;

    invoke-direct {v0, p1, p0}, LZe4$a$a;-><init>(LZe4;LZe4$a;)V

    invoke-static {p2, v0}, LMs2;->h(Landroid/widget/CompoundButton;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    invoke-super {p0, p1}, Lh0;->bind(I)V

    iget-object v0, p0, LZe4$a;->g:LZe4;

    invoke-static {v0}, LZe4;->access$getAdapterData(LZe4;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;

    if-eqz p1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "binding item for answer: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LZe4$a;->f:Lpb2;

    iget-object v0, v0, Lpb2;->b:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;->getAnswer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LZe4$a;->f:Lpb2;

    iget-object v0, v0, Lpb2;->b:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;->getSelected()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    iget-object v0, p0, LZe4$a;->f:Lpb2;

    iget-object v0, v0, Lpb2;->b:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;->getCorrect()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
