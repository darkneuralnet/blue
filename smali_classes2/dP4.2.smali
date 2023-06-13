.class public final synthetic LdP4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lco/bird/android/app/feature/ride/activity/RideActivity;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/app/feature/ride/activity/RideActivity;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LdP4;->b:Lco/bird/android/app/feature/ride/activity/RideActivity;

    iput-object p2, p0, LdP4;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LdP4;->b:Lco/bird/android/app/feature/ride/activity/RideActivity;

    iget-object v1, p0, LdP4;->c:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lco/bird/android/app/feature/ride/activity/RideActivity;->B0(Lco/bird/android/app/feature/ride/activity/RideActivity;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
