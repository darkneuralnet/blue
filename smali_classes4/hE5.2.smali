.class public final synthetic LhE5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lco/bird/android/widget/actions/SlideToCheckView;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/widget/actions/SlideToCheckView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LhE5;->b:Lco/bird/android/widget/actions/SlideToCheckView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LhE5;->b:Lco/bird/android/widget/actions/SlideToCheckView;

    invoke-static {v0}, Lco/bird/android/widget/actions/SlideToCheckView;->f(Lco/bird/android/widget/actions/SlideToCheckView;)V

    return-void
.end method
