.class public final synthetic Lx95;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/g;


# instance fields
.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx95;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lx95;->b:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method
