.class public final Lm42$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm42;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "Lm42$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Landroid/widget/CheckBox;",
        "b",
        "Landroid/widget/CheckBox;",
        "checkbox",
        "",
        "c",
        "Z",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lm42;Landroid/view/View;)V",
        "workorders_release"
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
        "SMAP\nInspectionV3IssueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3IssueAdapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3IssueAdapter$IssueViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,67:1\n18#2:68\n9#3,4:69\n*S KotlinDebug\n*F\n+ 1 InspectionV3IssueAdapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3IssueAdapter$IssueViewHolder\n*L\n56#1:68\n56#1:69,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroid/widget/CheckBox;

.field public c:Z

.field public final synthetic d:Lm42;


# direct methods
.method public constructor <init>(Lm42;Landroid/view/View;)V
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

    iput-object p1, p0, Lm42$a;->d:Lm42;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    check-cast p2, Landroid/widget/CheckBox;

    iput-object p2, p0, Lm42$a;->b:Landroid/widget/CheckBox;

    new-instance v0, Lm42$a$a;

    invoke-direct {v0, p0, p1}, Lm42$a$a;-><init>(Lm42$a;Lm42;)V

    invoke-static {p2, v0}, LMs2;->h(Landroid/widget/CompoundButton;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public static final synthetic a(Lm42$a;)Z
    .locals 0

    iget-boolean p0, p0, Lm42$a;->c:Z

    return p0
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    iget-object v0, p0, Lm42$a;->d:Lm42;

    invoke-static {v0}, Lm42;->access$getAdapterData(Lm42;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/InspectionIssue;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/InspectionIssue;

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm42$a;->c:Z

    iget-object v0, p0, Lm42$a;->b:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Lco/bird/android/model/InspectionIssue;->getDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lm42$a;->b:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Lco/bird/android/model/InspectionIssue;->getSelected()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    iget-object v0, p0, Lm42$a;->b:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Lco/bird/android/model/InspectionIssue;->getMutable()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lm42$a;->b:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Lco/bird/android/model/InspectionIssue;->getTextColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireThemedColors;->getLightMode()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lm42$a;->c:Z

    :cond_1
    return-void
.end method
