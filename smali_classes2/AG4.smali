.class public final synthetic LAG4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic b:LBG4;

.field public final synthetic c:Lco/bird/android/core/mvp/BaseActivity;


# direct methods
.method public synthetic constructor <init>(LBG4;Lco/bird/android/core/mvp/BaseActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAG4;->b:LBG4;

    iput-object p2, p0, LAG4;->c:Lco/bird/android/core/mvp/BaseActivity;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 2

    iget-object v0, p0, LAG4;->b:LBG4;

    iget-object v1, p0, LAG4;->c:Lco/bird/android/core/mvp/BaseActivity;

    invoke-static {v0, v1}, LBG4;->Pl(LBG4;Lco/bird/android/core/mvp/BaseActivity;)V

    return-void
.end method
