.class public final synthetic LzD6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# instance fields
.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzD6;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LzD6;->b:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, LyD6$f;->a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/WorkOrder;

    move-result-object p1

    return-object p1
.end method
