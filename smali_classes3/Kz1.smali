.class public final synthetic LKz1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVD2;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKz1;->a:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final onResult(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LKz1;->a:Lkotlin/jvm/functions/Function1;

    check-cast p1, LrD2;

    invoke-static {v0, p1}, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$e;->c(Lkotlin/jvm/functions/Function1;LrD2;)V

    return-void
.end method
