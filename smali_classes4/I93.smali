.class public final synthetic LI93;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lco/bird/android/widget/NonRiderFlightView;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/widget/NonRiderFlightView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI93;->b:Lco/bird/android/widget/NonRiderFlightView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LI93;->b:Lco/bird/android/widget/NonRiderFlightView;

    invoke-static {v0}, Lco/bird/android/widget/NonRiderFlightView;->a(Lco/bird/android/widget/NonRiderFlightView;)V

    return-void
.end method
