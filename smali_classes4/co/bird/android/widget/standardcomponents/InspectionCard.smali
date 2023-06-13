.class public abstract Lco/bird/android/widget/standardcomponents/InspectionCard;
.super Landroidx/cardview/widget/CardView;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\r\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008&\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010)\u001a\u00020(\u00a2\u0006\u0004\u0008*\u0010+B\u0019\u0008\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010-\u001a\u00020,\u00a2\u0006\u0004\u0008*\u0010.B!\u0008\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00100\u001a\u00020/\u00a2\u0006\u0004\u0008*\u00101R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u001b\u0010\u000c\u001a\u00020\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0004\u001a\u0004\u0008\n\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0004\u001a\u0004\u0008\u000e\u0010\u000bR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R(\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR(\u0010$\u001a\u0004\u0018\u00010\u001f2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R(\u0010\'\u001a\u0004\u0018\u00010\u001f2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008%\u0010!\"\u0004\u0008&\u0010#\u00a8\u00062"
    }
    d2 = {
        "Lco/bird/android/widget/standardcomponents/InspectionCard;",
        "Landroidx/cardview/widget/CardView;",
        "Landroid/widget/ImageView;",
        "k",
        "Lkotlin/Lazy;",
        "s",
        "()Landroid/widget/ImageView;",
        "imageView",
        "Landroid/widget/TextView;",
        "l",
        "t",
        "()Landroid/widget/TextView;",
        "titleView",
        "m",
        "r",
        "descriptionView",
        "",
        "n",
        "Ljava/lang/Boolean;",
        "getAccepted",
        "()Ljava/lang/Boolean;",
        "setAccepted",
        "(Ljava/lang/Boolean;)V",
        "accepted",
        "Landroid/graphics/drawable/Drawable;",
        "value",
        "getDrawable",
        "()Landroid/graphics/drawable/Drawable;",
        "setDrawable",
        "(Landroid/graphics/drawable/Drawable;)V",
        "drawable",
        "",
        "getTitle",
        "()Ljava/lang/CharSequence;",
        "setTitle",
        "(Ljava/lang/CharSequence;)V",
        "title",
        "getDescription",
        "setDescription",
        "description",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final k:Lkotlin/Lazy;

.field public final l:Lkotlin/Lazy;

.field public final m:Lkotlin/Lazy;

.field public n:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;)V

    new-instance p1, Lco/bird/android/widget/standardcomponents/InspectionCard$b;

    invoke-direct {p1, p0}, Lco/bird/android/widget/standardcomponents/InspectionCard$b;-><init>(Lco/bird/android/widget/standardcomponents/InspectionCard;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/InspectionCard;->k:Lkotlin/Lazy;

    new-instance p1, Lco/bird/android/widget/standardcomponents/InspectionCard$c;

    invoke-direct {p1, p0}, Lco/bird/android/widget/standardcomponents/InspectionCard$c;-><init>(Lco/bird/android/widget/standardcomponents/InspectionCard;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/InspectionCard;->l:Lkotlin/Lazy;

    new-instance p1, Lco/bird/android/widget/standardcomponents/InspectionCard$a;

    invoke-direct {p1, p0}, Lco/bird/android/widget/standardcomponents/InspectionCard$a;-><init>(Lco/bird/android/widget/standardcomponents/InspectionCard;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/InspectionCard;->m:Lkotlin/Lazy;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Lco/bird/android/widget/standardcomponents/InspectionCard$b;

    invoke-direct {p1, p0}, Lco/bird/android/widget/standardcomponents/InspectionCard$b;-><init>(Lco/bird/android/widget/standardcomponents/InspectionCard;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/InspectionCard;->k:Lkotlin/Lazy;

    new-instance p1, Lco/bird/android/widget/standardcomponents/InspectionCard$c;

    invoke-direct {p1, p0}, Lco/bird/android/widget/standardcomponents/InspectionCard$c;-><init>(Lco/bird/android/widget/standardcomponents/InspectionCard;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/InspectionCard;->l:Lkotlin/Lazy;

    new-instance p1, Lco/bird/android/widget/standardcomponents/InspectionCard$a;

    invoke-direct {p1, p0}, Lco/bird/android/widget/standardcomponents/InspectionCard$a;-><init>(Lco/bird/android/widget/standardcomponents/InspectionCard;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/InspectionCard;->m:Lkotlin/Lazy;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Lco/bird/android/widget/standardcomponents/InspectionCard$b;

    invoke-direct {p1, p0}, Lco/bird/android/widget/standardcomponents/InspectionCard$b;-><init>(Lco/bird/android/widget/standardcomponents/InspectionCard;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/InspectionCard;->k:Lkotlin/Lazy;

    new-instance p1, Lco/bird/android/widget/standardcomponents/InspectionCard$c;

    invoke-direct {p1, p0}, Lco/bird/android/widget/standardcomponents/InspectionCard$c;-><init>(Lco/bird/android/widget/standardcomponents/InspectionCard;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/InspectionCard;->l:Lkotlin/Lazy;

    new-instance p1, Lco/bird/android/widget/standardcomponents/InspectionCard$a;

    invoke-direct {p1, p0}, Lco/bird/android/widget/standardcomponents/InspectionCard$a;-><init>(Lco/bird/android/widget/standardcomponents/InspectionCard;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/InspectionCard;->m:Lkotlin/Lazy;

    return-void
.end method


# virtual methods
.method public final r()Landroid/widget/TextView;
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/InspectionCard;->m:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-descriptionView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final s()Landroid/widget/ImageView;
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/InspectionCard;->k:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-imageView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public setAccepted(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/InspectionCard;->n:Ljava/lang/Boolean;

    return-void
.end method

.method public final setDescription(Ljava/lang/CharSequence;)V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/widget/standardcomponents/InspectionCard;->r()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/widget/standardcomponents/InspectionCard;->s()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/widget/standardcomponents/InspectionCard;->t()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final t()Landroid/widget/TextView;
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/InspectionCard;->l:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-titleView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method
