.class public final synthetic LIs2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RatingBar$OnRatingBarChangeListener;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function3;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIs2;->a:Lkotlin/jvm/functions/Function3;

    return-void
.end method


# virtual methods
.method public final onRatingChanged(Landroid/widget/RatingBar;FZ)V
    .locals 1

    iget-object v0, p0, LIs2;->a:Lkotlin/jvm/functions/Function3;

    invoke-static {v0, p1, p2, p3}, LMs2;->a(Lkotlin/jvm/functions/Function3;Landroid/widget/RatingBar;FZ)V

    return-void
.end method
