.class public final synthetic LlE5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic b:Lco/bird/android/widget/actions/SlideToLockView;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/widget/actions/SlideToLockView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LlE5;->b:Lco/bird/android/widget/actions/SlideToLockView;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, LlE5;->b:Lco/bird/android/widget/actions/SlideToLockView;

    invoke-static {v0, p1, p2}, Lco/bird/android/widget/actions/SlideToLockView;->e(Lco/bird/android/widget/actions/SlideToLockView;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
