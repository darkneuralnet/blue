.class public final LDT1$b;
.super Lh0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDT1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LDT1$b;",
        "Lh0;",
        "",
        "position",
        "",
        "bind",
        "Landroid/widget/TextView;",
        "f",
        "Landroid/widget/TextView;",
        "headerView",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LDT1;Landroid/view/View;)V",
        "co.bird.android.feature.identification"
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
        "SMAP\nIdentificationManualEntryFormAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,238:1\n18#2:239\n9#3,4:240\n*S KotlinDebug\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$HeaderViewHolder\n*L\n95#1:239\n95#1:240,4\n*E\n"
    }
.end annotation


# instance fields
.field public final f:Landroid/widget/TextView;

.field public final synthetic g:LDT1;


# direct methods
.method public constructor <init>(LDT1;Landroid/view/View;)V
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

    iput-object p1, p0, LDT1$b;->g:LDT1;

    invoke-direct {p0, p2}, Lh0;-><init>(Landroid/view/View;)V

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, LDT1$b;->f:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    iget-object v0, p0, LDT1$b;->f:Landroid/widget/TextView;

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, LDT1$b;->f:Landroid/widget/TextView;

    iget-object v1, p0, LDT1$b;->g:LDT1;

    invoke-static {v1}, LDT1;->access$getAdapterData(LDT1;)LE6;

    move-result-object v1

    invoke-virtual {v1}, LE6;->h()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    instance-of v1, p1, Ljava/lang/CharSequence;

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
