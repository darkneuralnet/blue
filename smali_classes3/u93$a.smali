.class public abstract Lu93$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu93;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00a2\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000c8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u0007\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0017"
    }
    d2 = {
        "Lu93$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LKd2;",
        "b",
        "LKd2;",
        "a",
        "()LKd2;",
        "binding",
        "",
        "c",
        "Z",
        "()Z",
        "setBinding",
        "(Z)V",
        "isBinding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lu93;Landroid/view/View;)V",
        "repair_release"
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
        "SMAP\nNonRepairSurveyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepairSurveyAdapter.kt\nco/bird/android/feature/repair/v3/overview/nonrepair/adapters/NonRepairSurveyAdapter$BaseReasonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n18#2:110\n9#3,4:111\n1#4:115\n*S KotlinDebug\n*F\n+ 1 NonRepairSurveyAdapter.kt\nco/bird/android/feature/repair/v3/overview/nonrepair/adapters/NonRepairSurveyAdapter$BaseReasonViewHolder\n*L\n62#1:110\n62#1:111,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LKd2;

.field public c:Z

.field public final synthetic d:Lu93;


# direct methods
.method public constructor <init>(Lu93;Landroid/view/View;)V
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

    iput-object p1, p0, Lu93$a;->d:Lu93;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LKd2;->a(Landroid/view/View;)LKd2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lu93$a;->b:LKd2;

    return-void
.end method


# virtual methods
.method public final a()LKd2;
    .locals 1

    iget-object v0, p0, Lu93$a;->b:LKd2;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lu93$a;->c:Z

    return v0
.end method

.method public bind(I)V
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu93$a;->c:Z

    iget-object v1, p0, Lu93$a;->d:Lu93;

    invoke-static {v1}, Lu93;->access$getAdapterData(Lu93;)LE6;

    move-result-object v1

    invoke-virtual {v1, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Lkotlin/Pair;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lkotlin/Pair;

    const/4 v1, 0x0

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/NonRepairReason;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v3, p0, Lu93$a;->b:LKd2;

    iget-object v3, v3, LKd2;->b:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Lco/bird/android/model/NonRepairReason;->getDisplay()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, p0, Lu93$a;->b:LKd2;

    iget-object v3, v3, LKd2;->b:Landroid/widget/CheckBox;

    invoke-virtual {v3, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    iget-object v3, p0, Lu93$a;->b:LKd2;

    iget-object v3, v3, LKd2;->b:Landroid/widget/CheckBox;

    if-eqz p1, :cond_4

    invoke-virtual {v2}, Lco/bird/android/model/NonRepairReason;->getSubreasons()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move v2, v1

    goto :goto_2

    :cond_2
    :goto_1
    move v2, v0

    :goto_2
    if-eqz v2, :cond_3

    goto :goto_3

    :cond_3
    move v2, v1

    goto :goto_4

    :cond_4
    :goto_3
    move v2, v0

    :goto_4
    invoke-virtual {v3, v2}, Landroid/view/View;->setEnabled(Z)V

    iget-object v2, p0, Lu93$a;->b:LKd2;

    iget-object v2, v2, LKd2;->b:Landroid/widget/CheckBox;

    xor-int/2addr p1, v0

    invoke-virtual {v2, p1}, Landroid/view/View;->setClickable(Z)V

    :cond_5
    iput-boolean v1, p0, Lu93$a;->c:Z

    return-void
.end method
