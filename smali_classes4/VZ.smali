.class public final synthetic LVZ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lco/bird/android/widget/e;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/widget/e;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVZ;->b:Lco/bird/android/widget/e;

    iput p2, p0, LVZ;->c:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, LVZ;->b:Lco/bird/android/widget/e;

    iget v1, p0, LVZ;->c:I

    invoke-static {v0, v1, p1}, Lco/bird/android/widget/e;->N6(Lco/bird/android/widget/e;ILandroid/view/View;)V

    return-void
.end method
