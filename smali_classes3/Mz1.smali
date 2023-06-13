.class public final synthetic LMz1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/f;


# instance fields
.field public final synthetic b:LdE2;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(LdE2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMz1;->b:LdE2;

    iput-object p2, p0, LMz1;->c:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, LMz1;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 3

    iget-object v0, p0, LMz1;->b:LdE2;

    iget-object v1, p0, LMz1;->c:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, LMz1;->d:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerAnimationView$e;->b(LdE2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
