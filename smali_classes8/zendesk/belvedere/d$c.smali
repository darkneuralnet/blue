.class public Lzendesk/belvedere/d$c;
.super Lzendesk/belvedere/d$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/belvedere/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final e:I

.field public final f:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(IILandroid/view/View$OnClickListener;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lzendesk/belvedere/d$b;-><init>(ILzendesk/belvedere/MediaResult;)V

    iput p2, p0, Lzendesk/belvedere/d$c;->e:I

    iput-object p3, p0, Lzendesk/belvedere/d$c;->f:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public synthetic constructor <init>(IILandroid/view/View$OnClickListener;Lzendesk/belvedere/d$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lzendesk/belvedere/d$c;-><init>(IILandroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 2

    sget v0, LSg4;->list_item_static_image:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iget v1, p0, Lzendesk/belvedere/d$c;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    sget v0, LSg4;->list_item_static_click_area:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lzendesk/belvedere/d$c;->f:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
